package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.p018a.C0095a;

final class ch implements AnimatorUpdateListener {
    public final /* synthetic */ int f929a;
    public final /* synthetic */ int f930b;
    public final /* synthetic */ int f931c;
    public final /* synthetic */ int f932d;
    public final /* synthetic */ cg f933e;

    ch(cg cgVar, int i, int i2, int i3, int i4) {
        this.f933e = cgVar;
        this.f929a = i;
        this.f930b = i2;
        this.f931c = i3;
        this.f932d = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f933e.m751a(C0095a.m208a(this.f929a, this.f930b, animatedFraction), C0095a.m208a(this.f931c, this.f932d, animatedFraction));
    }
}
