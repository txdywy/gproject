package android.support.v4.view.p039b;

import android.view.animation.Interpolator;

class C0342d implements Interpolator {
    public final float[] f1861b;
    public final float f1862c = (1.0f / ((float) (this.f1861b.length - 1)));

    public C0342d(float[] fArr) {
        this.f1861b = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f1861b.length - 1)) * f), this.f1861b.length - 2);
        float f2 = (f - (((float) min) * this.f1862c)) / this.f1862c;
        return ((this.f1861b[min + 1] - this.f1861b[min]) * f2) + this.f1861b[min];
    }
}
