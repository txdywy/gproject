package com.google.android.finsky.ia2;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.finsky.C1473m;

final class C3231g implements AnimationListener {
    public boolean f16632a = false;
    public boolean f16633b = false;
    public final /* synthetic */ C3230f f16634c;

    C3231g(C3230f c3230f) {
        this.f16634c = c3230f;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f16634c.f16605M && !this.f16633b) {
            C3230f c3230f = this.f16634c;
            if (c3230f.f16605M) {
                c3230f.f16604L.mo1393b(1738, c3230f.f16601I, c3230f.f16602J, true);
                c3230f.f16603K.mo3382c();
            }
            this.f16633b = true;
        }
        if (!this.f16632a) {
            if (C1473m.f7980a.dj().mo2294a(12636210)) {
                this.f16634c.m16314c(1704);
                this.f16632a = true;
            } else if (this.f16634c.f16596D.m13357b()) {
                this.f16634c.f16597E.mo1293j(1704);
                this.f16632a = true;
            }
        }
        if (this.f16634c.f16606N != null) {
            this.f16634c.f16606N.mo1255B();
            this.f16634c.f16606N = null;
        }
        if (this.f16634c.f16619n != null) {
            this.f16634c.f16619n.clearAnimation();
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
