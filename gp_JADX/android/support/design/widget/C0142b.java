package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.design.widget.AppBarLayout.Behavior;

final class C0142b implements AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout f854a;
    public final /* synthetic */ AppBarLayout f855b;
    public final /* synthetic */ Behavior f856c;

    C0142b(Behavior behavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f856c = behavior;
        this.f854a = coordinatorLayout;
        this.f855b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f856c.a_(this.f854a, this.f855b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
