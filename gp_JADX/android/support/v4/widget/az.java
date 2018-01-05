package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class az extends Animation {
    public final /* synthetic */ int f2095a;
    public final /* synthetic */ int f2096b;
    public final /* synthetic */ SwipeRefreshLayout f2097c;

    az(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f2097c = swipeRefreshLayout;
        this.f2095a = i;
        this.f2096b = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f2097c.f2004C.setAlpha((int) (((float) this.f2095a) + (((float) (this.f2096b - this.f2095a)) * f)));
    }
}
