package android.support.v4.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class C0377h implements AnimatorUpdateListener {
    public final /* synthetic */ C0379j f2157a;
    public final /* synthetic */ C0376g f2158b;

    C0377h(C0376g c0376g, C0379j c0379j) {
        this.f2158b = c0376g;
        this.f2157a = c0379j;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C0376g.m2270a(floatValue, this.f2157a);
        C0376g c0376g = this.f2158b;
        C0379j c0379j = this.f2157a;
        float floor;
        if (c0376g.f2156i) {
            C0376g.m2270a(floatValue, c0379j);
            floor = (float) (Math.floor((double) (c0379j.f2173m / 0.8f)) + 1.0d);
            c0379j.f2165e = c0379j.f2171k + (((c0379j.f2172l - 0.01f) - c0379j.f2171k) * floatValue);
            c0379j.f2166f = c0379j.f2172l;
            c0379j.f2167g = ((floor - c0379j.f2173m) * floatValue) + c0379j.f2173m;
        } else if (floatValue != 1.0f) {
            float f;
            float f2 = c0379j.f2173m;
            if (floatValue < 0.5f) {
                floor = floatValue / 0.5f;
                f = c0379j.f2171k;
                floor = ((C0376g.f2149b.getInterpolation(floor) * 0.79f) + 0.01f) + f;
            } else {
                floor = c0379j.f2171k + 0.79f;
                f = floor - (((1.0f - C0376g.f2149b.getInterpolation((floatValue - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            f2 += 0.20999998f * floatValue;
            floatValue = (floatValue + c0376g.f2155h) * 216.0f;
            c0379j.f2165e = f;
            c0379j.f2166f = floor;
            c0379j.f2167g = f2;
            c0376g.f2152e = floatValue;
        }
        this.f2158b.invalidateSelf();
    }
}
