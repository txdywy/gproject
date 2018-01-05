package com.google.android.finsky.nestedrecyclerviews.p115a;

import android.support.v4.view.C0352i;
import android.support.v4.view.ab;
import android.support.v4.view.ad;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import com.google.android.finsky.bg.C1614n;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.Set;

public final class C3769f implements OnGestureListener {
    public final C3769f f18960a = this;
    public final RecyclerView f18961b;
    public final ad f18962c = new ad();
    public final C0352i f18963d = C1614n.m9290a(this.f18961b.getContext(), this);
    public RecyclerView f18964e;
    public Set f18965f;
    public fe f18966g;
    public List f18967h;
    public List f18968i;
    public int f18969j = -1;
    public int f18970k;
    public int f18971l;
    public boolean f18972m;
    public long f18973n;
    public int f18974o;
    public boolean f18975p;
    public boolean f18976q;
    public boolean f18977r;
    public float f18978s;

    public C3769f(RecyclerView recyclerView) {
        ((C1401l) C3947d.m18649a(C1401l.class)).mo2002e();
        C3769f.m17915a((Object) recyclerView);
        this.f18961b = recyclerView;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        m17917a(motionEvent);
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int y = this.f18978s == 0.0f ? 0 : (int) (this.f18978s - motionEvent2.getY());
        this.f18978s = motionEvent2.getY();
        if (this.f18964e != null) {
            int[] iArr = new int[2];
            this.f18964e.startNestedScroll(2);
            this.f18964e.dispatchNestedPreScroll(0, y, iArr, null);
            this.f18964e.scrollBy(0, y - iArr[1]);
            this.f18964e.stopNestedScroll();
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f18964e == null || Math.abs(f2) < ((float) this.f18964e.getMinFlingVelocity())) {
            return false;
        }
        int i = -((int) f2);
        if (i > 0) {
            if (this.f18961b == null || m17919b()) {
                this.f18964e.mo2962b(0, i);
            }
            if (this.f18964e != null) {
                this.f18964e.startNestedScroll(2);
                this.f18964e.dispatchNestedPreFling(0.0f, (float) i);
                this.f18964e.stopNestedScroll();
            }
        } else if (i < 0) {
            if (this.f18961b != null && m17918a()) {
                this.f18964e.mo2962b(0, i);
            }
            if (this.f18964e != null) {
                this.f18964e.startNestedScroll(2);
                this.f18964e.dispatchNestedPreFling(0.0f, (float) i);
                this.f18964e.stopNestedScroll();
            }
        }
        return true;
    }

    static void m17915a(Object obj) {
        if (!(obj instanceof RecyclerView)) {
            FinskyLog.m21669e("Passed argument must be a RecyclerView.", new Object[0]);
        }
        if (!(obj instanceof C3764n)) {
            FinskyLog.m21669e("Passed argument must implement ParentRecyclerView.", new Object[0]);
        }
        if (!(obj instanceof ab)) {
            FinskyLog.m21669e("Passed argument must implement NestedScrollingParent.", new Object[0]);
        }
    }

    static void m17916b(Object obj) {
        if (!(obj instanceof RecyclerView)) {
            FinskyLog.m21669e("Passed argument must be a RecyclerView.", new Object[0]);
        }
        if (!(obj instanceof C3763a)) {
            FinskyLog.m21669e("Passed argument must implement ChildRecyclerView.", new Object[0]);
        }
        if (!((RecyclerView) obj).isNestedScrollingEnabled()) {
            FinskyLog.m21669e("Passed argument must have nested scrolling enabled.", new Object[0]);
        }
    }

    final boolean m17918a() {
        return this.f18970k == 0;
    }

    final boolean m17919b() {
        return this.f18970k == this.f18969j;
    }

    final void m17917a(MotionEvent motionEvent) {
        if (this.f18964e != null) {
            this.f18964e.m303f();
        }
        this.f18978s = motionEvent.getRawY();
    }
}
