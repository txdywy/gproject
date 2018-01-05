package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ak extends am {
    public View f1341a;

    ak(View view, AnimationListener animationListener) {
        super(animationListener);
        this.f1341a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        if (ai.f1848a.mo410t(this.f1341a) || VERSION.SDK_INT >= 24) {
            this.f1341a.post(new al(this));
        } else {
            this.f1341a.setLayerType(0, null);
        }
        super.onAnimationEnd(animation);
    }
}
