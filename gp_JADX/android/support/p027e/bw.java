package android.support.p027e;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bw extends bv {
    public static Method f1111e;
    public static boolean f1112f;
    public static Method f1113g;
    public static boolean f1114h;

    bw() {
    }

    public final void mo237a(View view, Matrix matrix) {
        if (!f1112f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f1111e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f1112f = true;
        }
        if (f1111e != null) {
            try {
                f1111e.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public final void mo239b(View view, Matrix matrix) {
        if (!f1114h) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f1113g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f1114h = true;
        }
        if (f1113g != null) {
            try {
                f1113g.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
