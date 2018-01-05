package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

public final class id {
    public static Method f3623a;

    public static boolean m3869a(View view) {
        if (ai.f1848a.mo400k(view) == 1) {
            return true;
        }
        return false;
    }

    public static void m3868a(View view, Rect rect, Rect rect2) {
        if (f3623a != null) {
            try {
                f3623a.invoke(view, new Object[]{rect, rect2});
            } catch (Throwable e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static void m3870b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (Throwable e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            } catch (Throwable e22) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e22);
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f3623a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f3623a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }
}
