package android.support.design.widget.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C0164b extends AnimatorListenerAdapter {
    public final /* synthetic */ ExpandableTransformationBehavior f992a;

    C0164b(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f992a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f992a.f981b = null;
    }
}
