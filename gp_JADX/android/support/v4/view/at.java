package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

public class at {
    public static Field f1849b;
    public static boolean f1850c;
    public static Field f1851d;
    public static boolean f1852e;
    public static WeakHashMap f1853f;
    public static Field f1854h;
    public static boolean f1855i = false;
    public WeakHashMap f1856g = null;

    at() {
    }

    public static boolean m1855C(View view) {
        if (f1855i) {
            return false;
        }
        if (f1854h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1854h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f1855i = true;
                return false;
            }
        }
        try {
            if (f1854h.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            f1855i = true;
            return false;
        }
    }

    public boolean mo390b(View view) {
        return false;
    }

    public void mo388a(View view, boolean z) {
    }

    public void mo391c(View view) {
        view.postInvalidate();
    }

    public void mo386a(View view, Runnable runnable) {
        view.postDelayed(runnable, ValueAnimator.getFrameDelay());
    }

    public void mo387a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
    }

    public int mo392d(View view) {
        return 0;
    }

    public void mo384a(View view, int i) {
    }

    public boolean mo389a(View view, int i, Bundle bundle) {
        return false;
    }

    public int mo400k(View view) {
        return 0;
    }

    public ViewParent mo393e(View view) {
        return view.getParent();
    }

    public void mo408r(View view) {
    }

    public int mo401l(View view) {
        return view.getPaddingLeft();
    }

    public int mo402m(View view) {
        return view.getPaddingRight();
    }

    public void mo399a(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public boolean mo398j(View view) {
        return true;
    }

    public int mo394f(View view) {
        if (!f1850c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f1849b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f1850c = true;
        }
        if (f1849b != null) {
            try {
                return ((Integer) f1849b.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    public int mo395g(View view) {
        if (!f1852e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f1851d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f1852e = true;
        }
        if (f1851d != null) {
            try {
                return ((Integer) f1851d.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    public void mo418a(View view, String str) {
        if (f1853f == null) {
            f1853f = new WeakHashMap();
        }
        f1853f.put(view, str);
    }

    public String mo422u(View view) {
        if (f1853f == null) {
            return null;
        }
        return (String) f1853f.get(view);
    }

    public int mo403n(View view) {
        return 0;
    }

    public void mo396h(View view) {
    }

    public void mo414a(View view, float f) {
    }

    public float mo423v(View view) {
        return 0.0f;
    }

    public float mo424w(View view) {
        return 0.0f;
    }

    public void mo406a(View view, Rect rect) {
    }

    public Rect mo407q(View view) {
        return null;
    }

    public boolean mo397i(View view) {
        return false;
    }

    public void mo417a(View view, ae aeVar) {
    }

    public ca mo413a(View view, ca caVar) {
        return caVar;
    }

    public ca mo419b(View view, ca caVar) {
        return caVar;
    }

    public boolean mo404o(View view) {
        return false;
    }

    public boolean mo425x(View view) {
        if (view instanceof C0129y) {
            return ((C0129y) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public void mo385a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public ColorStateList mo427z(View view) {
        return view instanceof ah ? ((ah) view).getSupportBackgroundTintList() : null;
    }

    public void mo415a(View view, ColorStateList colorStateList) {
        if (view instanceof ah) {
            ((ah) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public void mo416a(View view, Mode mode) {
        if (view instanceof ah) {
            ((ah) view).setSupportBackgroundTintMode(mode);
        }
    }

    public Mode mo411A(View view) {
        return view instanceof ah ? ((ah) view).getSupportBackgroundTintMode() : null;
    }

    public void mo426y(View view) {
        if (view instanceof C0129y) {
            ((C0129y) view).stopNestedScroll();
        }
    }

    public boolean mo409s(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public float mo412B(View view) {
        return mo424w(view) + mo423v(view);
    }

    public boolean mo410t(View view) {
        return view.getWindowToken() != null;
    }

    public boolean mo383a(View view) {
        return false;
    }

    public void mo428d(View view, int i) {
    }

    public void mo420b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m1856D(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m1856D((View) parent);
            }
        }
    }

    public void mo421c(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m1856D(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m1856D((View) parent);
            }
        }
    }

    private static void m1856D(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public void mo429a(View view, ag agVar) {
    }

    public Display mo405p(View view) {
        if (mo410t(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }
}
