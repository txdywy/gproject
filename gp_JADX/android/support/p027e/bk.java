package android.support.p027e;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Method;

final class bk extends bi {
    public static Method f1096f;
    public static boolean f1097g;

    bk() {
    }

    public final bg mo232a(ViewGroup viewGroup) {
        return new bf(viewGroup);
    }

    public final void mo233a(ViewGroup viewGroup, boolean z) {
        if (!f1097g) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f1096f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f1097g = true;
        }
        if (f1096f != null) {
            try {
                f1096f.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (Throwable e22) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e22);
            }
        }
    }
}
