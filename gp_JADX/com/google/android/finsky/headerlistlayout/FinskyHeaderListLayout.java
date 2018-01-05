package com.google.android.finsky.headerlistlayout;

import android.content.Context;
import android.support.v4.p013b.C0268a;
import android.support.v4.view.ai;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.frameworkviews.ab;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.i;
import com.google.android.play.p184e.C3163d;
import com.google.android.play.p184e.C6312b;
import com.google.android.play.search.PlaySearchToolbar;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class FinskyHeaderListLayout extends PlayHeaderListLayout implements ab, C3158l {
    public C1611k f16329a;
    public C1461c f16330b;
    public final List f16331c;
    public final List f16332d;
    public View f16333e;
    public View f16334f;
    public ViewGroup f16335g;
    public int f16336h;
    public C1047f f16337i;
    public C3161c f16338j;
    public boolean f16339k;
    public final C3163d f16340l;
    public View f16341m;
    public final boolean f16342n;
    public final C6312b f16343o;
    public int f16344p;
    public int f16345q;
    public boolean f16346r;

    public static int m16068a(Context context, int i, int i2) {
        return PlayHeaderListLayout.a(context, i, i2, PlaySearchToolbar.a(context));
    }

    public FinskyHeaderListLayout(Context context) {
        this(context, null);
    }

    public FinskyHeaderListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16331c = new ArrayList();
        this.f16332d = new ArrayList();
        this.f16340l = new C3164e(this);
        this.f16346r = true;
        ((C1389j) C3947d.m18649a(C1389j.class)).mo1847a(this);
        this.f16343o = new C6312b(this.f16340l, context, InsetsFrameLayout.f14024a);
        this.f16342n = context.getResources().getBoolean(C7582R.bool.use_wide_layout);
    }

    public final void m16075a(i iVar) {
        super.a(iVar);
        this.f16337i = (C1047f) iVar;
        this.f16333e = this.f16337i.f6436e;
        this.f16334f = findViewById(C7582R.id.background_container);
        this.f16335g = (ViewGroup) findViewById(C7582R.id.controls_container);
        this.f16338j = this.f16337i.mo1402p();
    }

    public void setActionBarTitleColor(int i) {
        this.f16344p = i;
        Toolbar toolbar = getToolbar();
        if (toolbar != null) {
            a(toolbar, (float) this.f16345q);
        }
    }

    protected final void m16072a(Toolbar toolbar, float f) {
        this.f16345q = Math.max(0, Math.min(HprofParser.ROOT_UNKNOWN, Math.round(255.0f * f)));
        toolbar.setTitleTextColor(C0268a.m1543c(this.f16344p, this.f16345q));
    }

    public void setBackgroundViewForTouchPassthrough(View view) {
        this.f16341m = view;
    }

    public void setShouldUseScrollLocking(boolean z) {
        this.f16346r = z;
    }

    public final boolean aj_() {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        for (C3102k a : this.f16331c) {
            if (a.mo3313a(motionEvent, this)) {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return (this.f16346r && this.f16343o.m28933a(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f16346r && this.f16343o.m28934b(motionEvent)) || super.onTouchEvent(motionEvent);
    }

    protected void onMeasure(int i, int i2) {
        int f;
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        if (this.f16342n) {
            f = this.f16329a.m9281f(getResources());
        } else {
            f = size;
        }
        this.f16336h = (size - Math.min(size, f)) / 2;
    }

    public final int m16071a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() != 0 || this.f16337i == null) {
            return super.a(viewGroup);
        }
        return this.f16337i.mo1401o();
    }

    public float getFloatingHeaderElevation() {
        return super.getFloatingHeaderElevation();
    }

    protected final boolean m16078b(ViewGroup viewGroup) {
        if (super.b(viewGroup)) {
            return true;
        }
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return false;
        }
        if (viewGroup.getChildAt(0).getBottom() < viewGroup.getHeight()) {
            return false;
        }
        return true;
    }

    public FinskyTabStrip getTabStrip() {
        return (FinskyTabStrip) findViewById(C7582R.id.pager_tab_strip);
    }

    static boolean m16070a(View view, float f, float f2) {
        float f3 = f - ai.m1848f(view);
        float g = f2 - ai.m1850g(view);
        return f3 >= ((float) view.getLeft()) && f3 < ((float) view.getRight()) && g >= ((float) view.getTop()) && g < ((float) view.getBottom());
    }

    protected float getMaxContentPositionToNotSnapDownWhenIdle() {
        return getNonScrollingFloatingHeaderHeight();
    }

    protected float getMinVisibleHeaderHeightToIdleSnapDownAfterScrollDown() {
        return getNonScrollingFloatingHeaderHeight() + (getScrollingFloatingHeaderHeight() * 0.5f);
    }

    public void setHasBackgroundImage(boolean z) {
        if (this.f16339k != z) {
            this.f16339k = z;
            for (int size = this.f16332d.size() - 1; size >= 0; size--) {
                ((C3117g) this.f16332d.get(size)).mo3326a(z);
            }
        }
    }

    public final void m16073a(C3117g c3117g) {
        if (!this.f16332d.contains(c3117g)) {
            this.f16332d.add(c3117g);
        }
    }

    public final void m16076b(C3117g c3117g) {
        this.f16332d.remove(c3117g);
    }

    public final void mo3333a(C3102k c3102k) {
        if (!this.f16331c.contains(c3102k)) {
            this.f16331c.add(c3102k);
        }
    }

    public final void mo3334b(C3102k c3102k) {
        this.f16331c.remove(c3102k);
    }
}
