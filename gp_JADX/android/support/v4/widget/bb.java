package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bb extends Animation {
    public final /* synthetic */ SwipeRefreshLayout f2109a;

    bb(SwipeRefreshLayout swipeRefreshLayout) {
        this.f2109a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        int i;
        if (this.f2109a.f2012K) {
            i = this.f2109a.f2003B;
        } else {
            i = this.f2109a.f2003B - Math.abs(this.f2109a.f2002A);
        }
        this.f2109a.m2141a((((int) (((float) (i - this.f2109a.f2039y)) * f)) + this.f2109a.f2039y) - this.f2109a.f2037w.getTop());
        this.f2109a.f2004C.m2271a(1.0f - f);
    }
}
