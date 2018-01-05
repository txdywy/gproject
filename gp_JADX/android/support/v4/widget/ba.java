package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ba implements AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout f2108a;

    ba(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2108a = swipeRefreshLayout;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (!this.f2108a.f2034s) {
            this.f2108a.m2142a(null);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
