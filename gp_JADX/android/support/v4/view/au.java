package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

@Deprecated
public final class au {
    public static Method f1859a;

    public static float m1956a(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return m1958c(viewConfiguration, context);
    }

    public static float m1957b(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return m1958c(viewConfiguration, context);
    }

    private static float m1958c(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25 && f1859a != null) {
            try {
                return (float) ((Integer) f1859a.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f1859a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }
}
