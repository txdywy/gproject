package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0260b;
import android.support.v7.p025c.p026a.C0143a;
import android.util.Log;
import java.lang.reflect.Field;

public final class cj {
    public static final Rect f3278a = new Rect();
    public static Class f3279b;

    public static Rect m3400a(Drawable drawable) {
        if (f3279b != null) {
            try {
                if (drawable instanceof C0260b) {
                    drawable = ((C0260b) drawable).mo360a();
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f3279b.getFields()) {
                        String name = field.getName();
                        Object obj = -1;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    obj = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    obj = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    obj = null;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    obj = 2;
                                    break;
                                }
                                break;
                        }
                        switch (obj) {
                            case null:
                                rect.left = field.getInt(invoke);
                                break;
                            case 1:
                                rect.top = field.getInt(invoke);
                                break;
                            case 2:
                                rect.right = field.getInt(invoke);
                                break;
                            case 3:
                                rect.bottom = field.getInt(invoke);
                                break;
                            default:
                                break;
                        }
                    }
                    return rect;
                }
            } catch (Exception e) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f3278a;
    }

    static void m3401b(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(gx.f3544e);
            } else {
                drawable.setState(gx.f3545f);
            }
            drawable.setState(state);
        }
    }

    public static boolean m3402c(Drawable drawable) {
        Drawable drawable2 = drawable;
        while (true) {
            if (VERSION.SDK_INT < 15 && (drawable2 instanceof InsetDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT < 15 && (drawable2 instanceof GradientDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 || !(drawable2 instanceof LayerDrawable)) {
                if (!(drawable2 instanceof DrawableContainer)) {
                    if (!(drawable2 instanceof C0260b)) {
                        if (!(drawable2 instanceof C0143a)) {
                            if (!(drawable2 instanceof ScaleDrawable)) {
                                break;
                            }
                            drawable2 = ((ScaleDrawable) drawable2).getDrawable();
                        } else {
                            drawable2 = ((C0143a) drawable2).f872q;
                        }
                    } else {
                        drawable2 = ((C0260b) drawable2).mo360a();
                    }
                } else {
                    break;
                }
            }
            return false;
        }
        ConstantState constantState = drawable2.getConstantState();
        if (constantState instanceof DrawableContainerState) {
            for (Drawable c : ((DrawableContainerState) constantState).getChildren()) {
                if (!m3402c(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Mode m3399a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f3279b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }
}
