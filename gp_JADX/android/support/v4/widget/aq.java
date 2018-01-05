package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.PopupWindow;

public final class aq {
    public static final au f2076a;

    public static void m2197a(PopupWindow popupWindow, boolean z) {
        f2076a.mo468a(popupWindow, z);
    }

    public static void m2196a(PopupWindow popupWindow, int i) {
        f2076a.mo469a(popupWindow, i);
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f2076a = new at();
        } else if (VERSION.SDK_INT >= 21) {
            f2076a = new as();
        } else if (VERSION.SDK_INT >= 19) {
            f2076a = new ar();
        } else {
            f2076a = new au();
        }
    }
}
