package android.support.v4.app;

import android.animation.Animator;
import android.view.animation.Animation;

final class an {
    public final Animation f1343a;
    public final Animator f1344b;

    an(Animation animation) {
        this.f1343a = animation;
        this.f1344b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    an(Animator animator) {
        this.f1343a = null;
        this.f1344b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }
}
