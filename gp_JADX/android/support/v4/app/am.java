package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class am implements AnimationListener {
    public final AnimationListener f1328e;

    am(AnimationListener animationListener) {
        this.f1328e = animationListener;
    }

    public void onAnimationStart(Animation animation) {
        if (this.f1328e != null) {
            this.f1328e.onAnimationStart(animation);
        }
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f1328e != null) {
            this.f1328e.onAnimationEnd(animation);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.f1328e != null) {
            this.f1328e.onAnimationRepeat(animation);
        }
    }
}
