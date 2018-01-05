package android.support.design.p018a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public final class C0101g implements TypeEvaluator {
    public final float[] f430a = new float[9];
    public final float[] f431b = new float[9];
    public final Matrix f432c = new Matrix();

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Matrix matrix = (Matrix) obj2;
        ((Matrix) obj).getValues(this.f430a);
        matrix.getValues(this.f431b);
        for (int i = 0; i < 9; i++) {
            this.f431b[i] = ((this.f431b[i] - this.f430a[i]) * f) + this.f430a[i];
        }
        this.f432c.setValues(this.f431b);
        return this.f432c;
    }
}
