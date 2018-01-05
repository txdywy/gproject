package android.support.design.p018a;

import android.animation.TimeInterpolator;
import android.support.v4.view.p039b.C0343a;
import android.support.v4.view.p039b.C0344b;
import android.support.v4.view.p039b.C0345c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public final class C0095a {
    public static final TimeInterpolator f421a = new C0344b();
    public static final TimeInterpolator f422b = new C0343a();
    public static final TimeInterpolator f423c = new C0345c();
    public static final TimeInterpolator f424d = new DecelerateInterpolator();

    public static float m207a(float f, float f2) {
        return ((0.0f - f) * f2) + f;
    }

    public static int m208a(int i, int i2, float f) {
        return Math.round(((float) (i2 - i)) * f) + i;
    }

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
    }
}
