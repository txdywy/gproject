package android.support.v4.widget;

import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

class as extends ar {
    public static Field f2079a;

    as() {
    }

    public void mo468a(PopupWindow popupWindow, boolean z) {
        if (f2079a != null) {
            try {
                f2079a.set(popupWindow, Boolean.valueOf(z));
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
            }
        }
    }

    static {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            f2079a = declaredField;
            declaredField.setAccessible(true);
        } catch (Throwable e) {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
        }
    }
}
