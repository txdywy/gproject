package com.google.android.finsky.headerlistlayout;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1616q;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.utils.k;

public final class C3161c {
    public static final boolean f16364a = (VERSION.SDK_INT >= 21);
    public final int[] f16365b = new int[2];
    public final Context f16366c;
    public final int f16367d;
    public ControlsContainerBackground f16368e;
    public Drawable f16369f;
    public ViewGroup f16370g;
    public View f16371h;
    public PlayHeaderListLayout f16372i;
    public View f16373j;
    public C1616q f16374k;
    public boolean f16375l;
    public int f16376m;
    public float f16377n = -1.0f;
    public float f16378o = -1.0f;
    public final OnPreDrawListener f16379p = new C3162d(this);

    public C3161c(Context context) {
        this.f16366c = context;
        this.f16367d = k.e(this.f16366c);
    }

    public final void m16087a() {
        if (this.f16373j != null) {
            this.f16370g = null;
            this.f16371h = null;
            this.f16373j.getViewTreeObserver().removeOnPreDrawListener(this.f16379p);
            this.f16373j = null;
        }
    }

    public final void m16088a(int i) {
        Drawable colorDrawable = new ColorDrawable(C1608h.m9243a(this.f16366c, i));
        if (this.f16368e == null) {
            this.f16369f = colorDrawable;
            return;
        }
        this.f16369f = null;
        this.f16368e.m16065a(colorDrawable, this.f16376m, true);
    }

    public final void m16089a(boolean z) {
        this.f16373j.getLocationInWindow(this.f16365b);
        this.f16376m = this.f16365b[0];
        if (z) {
            this.f16376m += this.f16373j.getWidth();
        }
    }
}
