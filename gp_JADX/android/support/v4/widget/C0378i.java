package android.support.v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class C0378i implements AnimatorListener {
    public final /* synthetic */ C0379j f2159a;
    public final /* synthetic */ C0376g f2160b;

    C0378i(C0376g c0376g, C0379j c0379j) {
        this.f2160b = c0376g;
        this.f2159a = c0379j;
    }

    public final void onAnimationStart(Animator animator) {
        this.f2160b.f2155h = 0.0f;
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        C0376g c0376g = this.f2160b;
        C0379j c0379j = this.f2159a;
        if (c0376g.f2156i) {
            C0376g.m2270a(1.0f, c0379j);
            float floor = (float) (Math.floor((double) (c0379j.f2173m / 0.8f)) + 1.0d);
            c0379j.f2165e = c0379j.f2171k + (((c0379j.f2172l - 0.01f) - c0379j.f2171k) * 1.0f);
            c0379j.f2166f = c0379j.f2172l;
            c0379j.f2167g = ((floor - c0379j.f2173m) * 1.0f) + c0379j.f2173m;
        } else {
            float f = c0379j.f2171k + 0.79f;
            float f2 = c0379j.f2173m + 0.20999998f;
            float f3 = 216.0f * (c0376g.f2155h + 1.0f);
            c0379j.f2165e = f - (((1.0f - C0376g.f2149b.getInterpolation(1.0f)) * 0.79f) + 0.01f);
            c0379j.f2166f = f;
            c0379j.f2167g = f2;
            c0376g.f2152e = f3;
        }
        this.f2159a.m2281c();
        C0379j c0379j2 = this.f2159a;
        c0379j2.m2277a(c0379j2.m2275a());
        if (this.f2160b.f2156i) {
            this.f2160b.f2156i = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.f2159a.m2278a(false);
            return;
        }
        this.f2160b.f2155h += 1.0f;
    }
}
