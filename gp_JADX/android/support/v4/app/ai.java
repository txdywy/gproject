package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

final class ai extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup f1334a;
    public final /* synthetic */ View f1335b;
    public final /* synthetic */ Fragment f1336c;
    public final /* synthetic */ ae f1337d;

    ai(ae aeVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f1337d = aeVar;
        this.f1334a = viewGroup;
        this.f1335b = view;
        this.f1336c = fragment;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1334a.endViewTransition(this.f1335b);
        Animator S = this.f1336c.m567S();
        this.f1336c.m577a(null);
        if (S != null && this.f1334a.indexOfChild(this.f1335b) < 0) {
            this.f1337d.m1230a(this.f1336c, this.f1336c.m568T(), 0, 0, false);
        }
    }
}
