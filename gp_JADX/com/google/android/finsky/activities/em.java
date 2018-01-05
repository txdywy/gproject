package com.google.android.finsky.activities;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class em implements AnimationListener {
    public boolean f6763a = false;
    public boolean f6764b = false;
    public final /* synthetic */ ek f6765c;

    em(ek ekVar) {
        this.f6765c = ekVar;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (!this.f6763a) {
            ek ekVar = this.f6765c;
            if (ekVar.f6734N) {
                ekVar.f6733M.mo1393b(1734, ekVar.f6732L, null, true);
            }
            if (this.f6765c.f6741f.dj().mo2294a(12636210)) {
                this.f6765c.m6528a(1704);
                this.f6763a = true;
            } else if (this.f6765c.f6743h.m13357b()) {
                this.f6765c.f6727G.mo1293j(1704);
                this.f6763a = true;
            }
        }
        if (this.f6765c.f6755t != null && !this.f6764b) {
            this.f6765c.f6755t.mo1255B();
            this.f6764b = true;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
