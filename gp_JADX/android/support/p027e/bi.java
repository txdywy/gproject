package android.support.p027e;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class bi implements bl {
    public static LayoutTransition f1091a;
    public static Field f1092b;
    public static boolean f1093c;
    public static Method f1094d;
    public static boolean f1095e;

    bi() {
    }

    public bg mo232a(ViewGroup viewGroup) {
        return (be) bm.m919c(viewGroup);
    }

    public void mo233a(ViewGroup viewGroup, boolean z) {
        int i = 0;
        if (f1091a == null) {
            LayoutTransition bjVar = new bj();
            f1091a = bjVar;
            bjVar.setAnimator(2, null);
            f1091a.setAnimator(0, null);
            f1091a.setAnimator(1, null);
            f1091a.setAnimator(3, null);
            f1091a.setAnimator(4, null);
        }
        LayoutTransition layoutTransition;
        if (z) {
            layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    if (!f1095e) {
                        try {
                            Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                            f1094d = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
                        }
                        f1095e = true;
                    }
                    if (f1094d != null) {
                        try {
                            f1094d.invoke(layoutTransition, new Object[0]);
                        } catch (IllegalAccessException e2) {
                            Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
                        } catch (InvocationTargetException e3) {
                            Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
                        }
                    }
                }
                if (layoutTransition != f1091a) {
                    viewGroup.setTag(ak.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f1091a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f1093c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f1092b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }
            f1093c = true;
        }
        if (f1092b != null) {
            try {
                i = f1092b.getBoolean(viewGroup);
                if (i != 0) {
                    f1092b.setBoolean(viewGroup, false);
                }
            } catch (IllegalAccessException e5) {
                Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
            }
        }
        if (i != 0) {
            viewGroup.requestLayout();
        }
        layoutTransition = (LayoutTransition) viewGroup.getTag(ak.transition_layout_save);
        if (layoutTransition != null) {
            viewGroup.setTag(ak.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition);
        }
    }
}
