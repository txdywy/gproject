package android.support.v4.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ag extends am {
    public final /* synthetic */ ViewGroup f1329a;
    public final /* synthetic */ View f1330b;
    public final /* synthetic */ Fragment f1331c;
    public final /* synthetic */ ae f1332d;

    ag(ae aeVar, AnimationListener animationListener, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f1332d = aeVar;
        this.f1329a = viewGroup;
        this.f1330b = view;
        this.f1331c = fragment;
        super(animationListener);
    }

    public final void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.f1329a.post(new ah(this));
    }
}
