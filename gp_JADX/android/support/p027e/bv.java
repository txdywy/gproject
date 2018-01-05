package android.support.p027e;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bv extends bu {
    public static Method f1107a;
    public static boolean f1108b;
    public static Method f1109c;
    public static boolean f1110d;

    bv() {
    }

    public final void mo235a(View view, float f) {
        if (!f1108b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f1107a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f1108b = true;
        }
        if (f1107a != null) {
            try {
                f1107a.invoke(view, new Object[]{Float.valueOf(f)});
                return;
            } catch (IllegalAccessException e2) {
                return;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        view.setAlpha(f);
    }

    public final float mo240c(View view) {
        if (!f1110d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f1109c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f1110d = true;
        }
        if (f1109c != null) {
            try {
                return ((Float) f1109c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.mo240c(view);
    }

    public final void mo241d(View view) {
    }

    public final void mo242e(View view) {
    }
}
