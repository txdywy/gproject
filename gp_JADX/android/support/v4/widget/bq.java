package android.support.v4.widget;

import android.view.animation.Interpolator;

final class bq implements Interpolator {
    bq() {
    }

    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
    }
}
