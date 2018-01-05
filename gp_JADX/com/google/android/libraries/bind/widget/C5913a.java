package com.google.android.libraries.bind.widget;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.data.C5878d;
import com.google.android.libraries.bind.data.C5880k;
import com.google.android.libraries.bind.data.C5881b;
import com.google.android.libraries.bind.data.C5895c;
import com.google.android.libraries.bind.data.C5899h;
import com.google.android.libraries.bind.data.C5902l;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.p325d.C5893b;

public final class C5913a extends C5902l {
    public static final Paint f29469q = new Paint();
    public final ViewGroup f29470g;
    public boolean f29471h;
    public boolean f29472i;
    public C5895c f29473j;
    public Bitmap f29474k;
    public final Rect f29475l = new Rect();
    public final Rect f29476m = new Rect();
    public boolean f29477n;
    public long f29478o;
    public long f29479p;
    public Data f29480r;

    public C5913a(C5880k c5880k) {
        super(c5880k);
        C5893b.m27342a(c5880k instanceof C5881b);
        C5893b.m27342a(c5880k instanceof ViewGroup);
        this.f29470g = (ViewGroup) c5880k;
    }

    public final void mo5201a(C5899h c5899h) {
        this.f29480r = null;
        super.mo5201a(c5899h);
    }

    public final Data mo5200a() {
        return this.f29434b != null ? C5899h.m27355b() : this.f29480r;
    }

    public static void m27400a(ViewGroup viewGroup, Data data) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C5881b) {
                if (((C5881b) childAt).mo5188a()) {
                    ((C5881b) childAt).mo5187a(data);
                }
            } else if (childAt instanceof C5878d) {
                ((C5878d) childAt).a_(data);
            }
            if ((childAt instanceof ViewGroup) && !(childAt instanceof C5881b)) {
                C5913a.m27400a((ViewGroup) childAt, data);
            }
        }
    }

    final void mo5202d() {
        if (this.f29474k != null) {
            this.f29474k = null;
            this.f29473j = null;
            this.f29478o = 0;
            this.f29479p = 0;
            this.f29477n = false;
            this.f29470g.setWillNotDraw(true);
        }
    }

    public static void m27399a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                if (childAt instanceof C5881b) {
                    ((C5881b) childAt).setOwnedByParent(true);
                }
                C5913a.m27399a((ViewGroup) childAt);
            }
        }
    }
}
