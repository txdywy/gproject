package android.support.p027e;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

final class bq {
    public static final by f1103a;
    public static Field f1104b;
    public static boolean f1105c;
    public static final Property f1106d = new br(Float.class, "translationAlpha");

    static bp m941a(View view) {
        return f1103a.mo234a(view);
    }

    static cf m945b(View view) {
        return f1103a.mo238b(view);
    }

    static void m942a(View view, float f) {
        f1103a.mo235a(view, f);
    }

    static float m946c(View view) {
        return f1103a.mo240c(view);
    }

    static void m943a(View view, int i) {
        if (!f1105c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1104b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f1105c = true;
        }
        if (f1104b != null) {
            try {
                f1104b.setInt(view, (f1104b.getInt(view) & -13) | i);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    static void m944a(View view, int i, int i2, int i3, int i4) {
        f1103a.mo236a(view, i, i2, i3, i4);
    }

    static {
        if (VERSION.SDK_INT >= 22) {
            f1103a = new bx();
        } else if (VERSION.SDK_INT >= 21) {
            f1103a = new bw();
        } else if (VERSION.SDK_INT >= 19) {
            f1103a = new bv();
        } else if (VERSION.SDK_INT >= 18) {
            f1103a = new bu();
        } else {
            f1103a = new bt();
        }
        bs bsVar = new bs(Rect.class, "clipBounds");
    }
}
