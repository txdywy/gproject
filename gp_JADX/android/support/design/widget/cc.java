package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class cc implements AnimatorUpdateListener {
    public final /* synthetic */ TabLayout f916a;

    cc(TabLayout tabLayout) {
        this.f916a = tabLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f916a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
