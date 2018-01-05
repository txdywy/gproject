package android.support.p027e;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class bx extends bw {
    public static Method f1115i;
    public static boolean f1116j;

    bx() {
    }

    public final void mo236a(View view, int i, int i2, int i3, int i4) {
        if (!f1116j) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f1115i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f1116j = true;
        }
        if (f1115i != null) {
            try {
                f1115i.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
