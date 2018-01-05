package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bd extends Animation {
    public final /* synthetic */ SwipeRefreshLayout f2111a;

    bd(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2111a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2111a.m2140a(this.f2111a.f2040z + ((-this.f2111a.f2040z) * f));
        this.f2111a.m2143b(f);
    }
}
