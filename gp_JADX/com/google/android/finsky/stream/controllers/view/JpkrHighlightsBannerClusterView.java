package com.google.android.finsky.stream.controllers.view;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.dn;
import android.support.v7.widget.ff;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cv.p177a.ei;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.playcluster.C4290m;
import com.google.android.finsky.stream.controllers.ca;
import com.squareup.leakcanary.C7582R;

public class JpkrHighlightsBannerClusterView extends C4501r {
    public C1461c f22934a;
    public Application f22935b;
    public final int[] f22936d;
    public final Rect f22937l;
    public int f22938m;
    public float f22939n;
    public ActivityLifecycleCallbacks f22940o;
    public dn f22941p;
    public Handler f22942q;
    public Runnable f22943r;
    public boolean f22944s;
    public boolean f22945t;
    public boolean f22946u;

    public JpkrHighlightsBannerClusterView(Context context) {
        super(context);
        this.f22936d = new int[2];
        this.f22937l = new Rect();
        this.f22938m = 3000;
        this.f22939n = 100.0f;
        this.f22944s = false;
    }

    public JpkrHighlightsBannerClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22936d = new int[2];
        this.f22937l = new Rect();
        this.f22938m = 3000;
        this.f22939n = 100.0f;
        this.f22944s = false;
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1953a(this);
        super.onFinishInflate();
        this.f22945t = this.f22934a.dj().mo2294a(12631553);
        if (this.f22945t) {
            this.f22942q = new Handler();
            this.f22943r = new C4514o(this);
            this.f22941p = new C4515p(this, getContext());
            this.f22940o = new C4512m(this);
            this.c.setOnTouchListener(new C4513n(this));
        }
    }

    public final void mo4235a(C1158a c1158a, C2720j c2720j, int i, ad adVar, Bundle bundle, ff ffVar, C1164b c1164b, int i2, C4290m c4290m) {
        super.mo4235a(c1158a, c2720j, i, adVar, bundle, ffVar, c1164b, i2, c4290m);
        if (this.f22945t) {
            ei eiVar;
            if (c2720j.f14908a.bD()) {
                eiVar = c2720j.f14908a.bC().f12283a;
            } else {
                eiVar = null;
            }
            if (eiVar != null) {
                this.f22938m = eiVar.f12281b;
                this.f22939n = (float) eiVar.f12282c;
                this.f22946u = true;
                return;
            }
            this.f22946u = false;
        }
    }

    protected void onMeasure(int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        Resources resources = getContext().getResources();
        marginLayoutParams.bottomMargin = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin) - resources.getDimensionPixelSize(C7582R.dimen.jpkr_uniform_banner_inset);
        marginLayoutParams.topMargin = -resources.getDimensionPixelSize(C7582R.dimen.jpkr_uniform_banner_inset);
        super.onMeasure(i, i2);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22945t) {
            this.f22935b.registerActivityLifecycleCallbacks(this.f22940o);
            ((ViewGroup) getParent()).getHitRect(this.f22937l);
            m21019c();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f22945t) {
            this.f22935b.unregisterActivityLifecycleCallbacks(this.f22940o);
            m21020d();
        }
    }

    public final void Z_() {
        super.Z_();
        if (this.f22945t) {
            m21020d();
        }
    }

    protected int getPlayStoreUiElementType() {
        return 428;
    }

    final void m21019c() {
        m21020d();
        this.f22942q.postDelayed(this.f22943r, 500);
    }

    final void m21020d() {
        this.f22942q.removeCallbacks(this.f22943r);
        this.f22944s = false;
    }
}
