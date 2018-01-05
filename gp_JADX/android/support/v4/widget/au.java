package android.support.v4.widget;

import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class au {
    public static Method f2077b;
    public static boolean f2078c;

    au() {
    }

    public void mo467a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if ((C0357n.m2043a(i3, ai.f1848a.mo400k(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public void mo468a(PopupWindow popupWindow, boolean z) {
    }

    public void mo469a(PopupWindow popupWindow, int i) {
        if (!f2078c) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f2077b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
            }
            f2078c = true;
        }
        if (f2077b != null) {
            try {
                f2077b.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception e2) {
            }
        }
    }
}
