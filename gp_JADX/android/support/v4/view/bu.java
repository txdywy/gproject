package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class bu extends AnimatorListenerAdapter {
    public final /* synthetic */ bx f1887a;
    public final /* synthetic */ View f1888b;

    bu(bx bxVar, View view) {
        this.f1887a = bxVar;
        this.f1888b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1887a.mo442c(this.f1888b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1887a.mo441b(this.f1888b);
    }

    public final void onAnimationStart(Animator animator) {
        this.f1887a.mo440a(this.f1888b);
    }
}
