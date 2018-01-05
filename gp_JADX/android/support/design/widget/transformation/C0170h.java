package android.support.design.widget.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class C0170h extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean f1002a;
    public final /* synthetic */ View f1003b;

    C0170h(boolean z, View view) {
        this.f1002a = z;
        this.f1003b = view;
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f1002a) {
            this.f1003b.setVisibility(0);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f1002a) {
            this.f1003b.setVisibility(4);
        }
    }
}
