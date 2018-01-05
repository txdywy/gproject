package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bc extends Animation {
    public final /* synthetic */ SwipeRefreshLayout f2110a;

    bc(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2110a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2110a.m2143b(f);
    }
}
