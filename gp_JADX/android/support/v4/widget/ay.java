package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class ay extends Animation {
    public final /* synthetic */ SwipeRefreshLayout f2094a;

    ay(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2094a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2094a.m2140a(1.0f - f);
    }
}
