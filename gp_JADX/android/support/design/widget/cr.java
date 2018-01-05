package android.support.design.widget;

import android.graphics.PorterDuff.Mode;

public final class cr {
    static boolean m774a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Mode m773a(int i) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            default:
                return null;
        }
    }
}
