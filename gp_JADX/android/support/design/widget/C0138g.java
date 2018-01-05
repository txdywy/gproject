package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.design.C0126h;
import android.support.design.p018a.C0095a;
import android.support.v4.view.ai;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

public class C0138g {
    public static final Handler f655a = new Handler(Looper.getMainLooper(), new C0148h());
    public static final boolean f656b;
    public final ViewGroup f657c;
    public final Context f658d;
    public final C0137x f659e;
    public final C0131u f660f;
    public int f661g;
    public List f662h;
    public final AccessibilityManager f663i;
    public final bt f664j = new C0151k(this);

    public C0138g(ViewGroup viewGroup, View view, C0131u c0131u) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (c0131u == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        } else {
            this.f657c = viewGroup;
            this.f660f = c0131u;
            this.f658d = viewGroup.getContext();
            cn.m768a(this.f658d);
            this.f659e = (C0137x) LayoutInflater.from(this.f658d).inflate(C0126h.design_layout_snackbar, this.f657c, false);
            this.f659e.addView(view);
            ai.f1848a.mo408r(this.f659e);
            ai.m1838b(this.f659e, 1);
            ai.m1853i(this.f659e);
            ai.m1828a(this.f659e, new C0150j());
            this.f663i = (AccessibilityManager) this.f658d.getSystemService("accessibility");
        }
    }

    public final void m493a() {
        br a = br.m708a();
        int i = this.f661g;
        bt btVar = this.f664j;
        synchronized (a.f892b) {
            if (a.m716e(btVar)) {
                a.f894d.f898b = i;
                a.f893c.removeCallbacksAndMessages(a.f894d);
                a.m710a(a.f894d);
                return;
            }
            if (a.m717f(btVar)) {
                a.f895e.f898b = i;
            } else {
                a.f895e = new bu(i, btVar);
            }
            if (a.f894d == null || !a.m711a(a.f894d, 4)) {
                a.f894d = null;
                a.m712b();
                return;
            }
        }
    }

    public final void m494a(int i) {
        br a = br.m708a();
        bt btVar = this.f664j;
        synchronized (a.f892b) {
            if (a.m716e(btVar)) {
                a.m711a(a.f894d, i);
            } else if (a.m717f(btVar)) {
                a.m711a(a.f895e, i);
            }
        }
    }

    final void m495b() {
        int height = this.f659e.getHeight();
        if (f656b) {
            ai.m1844d(this.f659e, height);
        } else {
            this.f659e.setTranslationY((float) height);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{height, 0});
        valueAnimator.setInterpolator(C0095a.f421a);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C0158p(this));
        valueAnimator.addUpdateListener(new C0159q(this, height));
        valueAnimator.start();
    }

    final void m497c() {
        br a = br.m708a();
        bt btVar = this.f664j;
        synchronized (a.f892b) {
            if (a.m716e(btVar)) {
                a.m710a(a.f894d);
            }
        }
        if (this.f662h != null) {
            for (int size = this.f662h.size() - 1; size >= 0; size--) {
                this.f662h.get(size);
            }
        }
    }

    final void m496b(int i) {
        br a = br.m708a();
        bt btVar = this.f664j;
        synchronized (a.f892b) {
            if (a.m716e(btVar)) {
                a.f894d = null;
                if (a.f895e != null) {
                    a.m712b();
                }
            }
        }
        if (this.f662h != null) {
            for (int size = this.f662h.size() - 1; size >= 0; size--) {
                ((C0161s) this.f662h.get(size)).mo4263a(i);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.f659e.setVisibility(8);
        }
        ViewParent parent = this.f659e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f659e);
        }
    }

    final boolean m498d() {
        return !this.f663i.isEnabled();
    }

    static {
        boolean z = VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19;
        f656b = z;
    }
}
