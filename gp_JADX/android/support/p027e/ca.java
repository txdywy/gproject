package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ca extends AnimatorListenerAdapter {
    public final /* synthetic */ bg f1119a;
    public final /* synthetic */ View f1120b;

    ca(bg bgVar, View view) {
        this.f1119a = bgVar;
        this.f1120b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1119a.mo231b(this.f1120b);
    }
}
