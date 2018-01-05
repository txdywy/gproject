package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.p013b.C0268a;
import android.util.TypedValue;

final class gx {
    public static final ThreadLocal f3540a = new ThreadLocal();
    public static final int[] f3541b = new int[]{-16842910};
    public static final int[] f3542c = new int[]{16842908};
    public static final int[] f3543d = new int[]{16842919};
    public static final int[] f3544e = new int[]{16842912};
    public static final int[] f3545f = new int[0];
    public static final int[] f3546g = new int[1];

    public static int m3760a(Context context, int i) {
        f3546g[0] = i;
        hc a = hc.m3768a(context, null, f3546g);
        try {
            int b = a.m3773b(0, 0);
            return b;
        } finally {
            a.f3558b.recycle();
        }
    }

    public static ColorStateList m3761b(Context context, int i) {
        f3546g[0] = i;
        hc a = hc.m3768a(context, null, f3546g);
        try {
            ColorStateList e = a.m3780e(0);
            return e;
        } finally {
            a.f3558b.recycle();
        }
    }

    public static int m3762c(Context context, int i) {
        ColorStateList b = m3761b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f3541b, b.getDefaultColor());
        }
        TypedValue typedValue = (TypedValue) f3540a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f3540a.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = m3760a(context, i);
        return C0268a.m1543c(a, Math.round(f * ((float) Color.alpha(a))));
    }
}
