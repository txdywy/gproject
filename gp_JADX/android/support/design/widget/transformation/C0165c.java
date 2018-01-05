package android.support.design.widget.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class C0165c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean f993a;
    public final /* synthetic */ View f994b;
    public final /* synthetic */ View f995c;

    C0165c(boolean z, View view, View view2) {
        this.f993a = z;
        this.f994b = view;
        this.f995c = view2;
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f993a) {
            this.f994b.setVisibility(0);
            this.f995c.setAlpha(0.0f);
            this.f995c.setVisibility(4);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f993a) {
            this.f994b.setVisibility(4);
            this.f995c.setAlpha(1.0f);
            this.f995c.setVisibility(0);
        }
    }
}
