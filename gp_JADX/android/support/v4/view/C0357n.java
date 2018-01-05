package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

public final class C0357n {
    public static void m2044a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    public static int m2043a(int i, int i2) {
        if (VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(i, i2);
        }
        return -8388609 & i;
    }
}
