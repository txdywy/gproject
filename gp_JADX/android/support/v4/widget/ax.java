package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class ax extends Animation {
    public final /* synthetic */ SwipeRefreshLayout f2093a;

    ax(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2093a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2093a.m2140a(f);
    }
}
