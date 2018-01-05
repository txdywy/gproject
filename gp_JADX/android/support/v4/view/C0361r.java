package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class C0361r {
    public static int m2049a(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static int m2051b(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    public static void m2050a(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    public static void m2052b(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }
}
