package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ai;
import android.view.View;

final class C0195u extends AnimatorListenerAdapter {
    public final View f1168a;
    public boolean f1169b = false;

    C0195u(View view) {
        this.f1168a = view;
    }

    public final void onAnimationStart(Animator animator) {
        if (ai.f1848a.mo398j(this.f1168a) && this.f1168a.getLayerType() == 0) {
            this.f1169b = true;
            this.f1168a.setLayerType(2, null);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        bq.m942a(this.f1168a, 1.0f);
        if (this.f1169b) {
            this.f1168a.setLayerType(0, null);
        }
    }
}
