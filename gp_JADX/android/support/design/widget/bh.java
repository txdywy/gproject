package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

abstract class bh extends AnimatorListenerAdapter implements AnimatorUpdateListener {
    public final /* synthetic */ ay f861a;
    public boolean f862b;
    public float f863c;
    public float f864d;

    private bh(ay ayVar) {
        this.f861a = ayVar;
    }

    protected abstract float mo152a();

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f862b) {
            this.f863c = this.f861a.f838i.f881i;
            this.f864d = mo152a();
            this.f862b = true;
        }
        this.f861a.f838i.m706a(this.f863c + ((this.f864d - this.f863c) * valueAnimator.getAnimatedFraction()));
    }

    public void onAnimationEnd(Animator animator) {
        this.f861a.f838i.m706a(this.f864d);
        this.f862b = false;
    }
}
