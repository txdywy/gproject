package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.p038a.C0333b;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import java.util.WeakHashMap;

public final class ai {
    public static final at f1848a;

    @Deprecated
    public static boolean m1835a(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static void m1827a(View view, C0333b c0333b) {
        view.onInitializeAccessibilityNodeInfo(c0333b.f1829a);
    }

    public static void m1829a(View view, C0132b c0132b) {
        AccessibilityDelegate accessibilityDelegate;
        if (c0132b == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = c0132b.f539d;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static boolean m1834a(View view) {
        return at.m1855C(view);
    }

    public static void m1833a(View view, boolean z) {
        f1848a.mo388a(view, z);
    }

    public static void m1830a(View view, Runnable runnable) {
        f1848a.mo386a(view, runnable);
    }

    public static void m1831a(View view, Runnable runnable, long j) {
        f1848a.mo387a(view, runnable, j);
    }

    public static void m1838b(View view, int i) {
        f1848a.mo384a(view, i);
    }

    @Deprecated
    public static float m1836b(View view) {
        return view.getAlpha();
    }

    @Deprecated
    public static void m1841c(View view, int i) {
        view.setLayerType(i, null);
    }

    @Deprecated
    public static int m1820a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    @Deprecated
    public static int m1839c(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int m1842d(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int m1845e(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int m1819a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    public static void m1823a(View view, int i, int i2, int i3, int i4) {
        f1848a.mo399a(view, i, i2, i3, i4);
    }

    @Deprecated
    public static float m1848f(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float m1850g(View view) {
        return view.getTranslationY();
    }

    public static bt m1852h(View view) {
        at atVar = f1848a;
        if (atVar.f1856g == null) {
            atVar.f1856g = new WeakHashMap();
        }
        bt btVar = (bt) atVar.f1856g.get(view);
        if (btVar != null) {
            return btVar;
        }
        btVar = new bt(view);
        atVar.f1856g.put(view, btVar);
        return btVar;
    }

    @Deprecated
    public static void m1822a(View view, float f) {
        view.setTranslationY(f);
    }

    @Deprecated
    public static void m1837b(View view, float f) {
        view.setAlpha(f);
    }

    @Deprecated
    public static void m1840c(View view, float f) {
        view.setScaleX(f);
    }

    @Deprecated
    public static void m1843d(View view, float f) {
        view.setScaleY(f);
    }

    @Deprecated
    public static void m1846e(View view, float f) {
        view.setPivotX(f);
    }

    @Deprecated
    public static void m1849f(View view, float f) {
        view.setPivotY(f);
    }

    public static void m1851g(View view, float f) {
        f1848a.mo414a(view, f);
    }

    public static void m1832a(View view, String str) {
        f1848a.mo418a(view, str);
    }

    @Deprecated
    public static void m1853i(View view) {
        view.setFitsSystemWindows(true);
    }

    public static void m1828a(View view, ae aeVar) {
        f1848a.mo417a(view, aeVar);
    }

    public static ca m1821a(View view, ca caVar) {
        return f1848a.mo413a(view, caVar);
    }

    public static void m1826a(View view, Drawable drawable) {
        f1848a.mo385a(view, drawable);
    }

    public static void m1824a(View view, ColorStateList colorStateList) {
        f1848a.mo415a(view, colorStateList);
    }

    public static void m1854j(View view) {
        if (view instanceof C0130z) {
            ((C0130z) view).n_(1);
        }
    }

    public static void m1844d(View view, int i) {
        f1848a.mo421c(view, i);
    }

    public static void m1847e(View view, int i) {
        f1848a.mo420b(view, i);
    }

    public static void m1825a(View view, Rect rect) {
        f1848a.mo406a(view, rect);
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1848a = new as();
        } else if (VERSION.SDK_INT >= 24) {
            f1848a = new ar();
        } else if (VERSION.SDK_INT >= 23) {
            f1848a = new aq();
        } else if (VERSION.SDK_INT >= 21) {
            f1848a = new ao();
        } else if (VERSION.SDK_INT >= 19) {
            f1848a = new an();
        } else if (VERSION.SDK_INT >= 18) {
            f1848a = new am();
        } else if (VERSION.SDK_INT >= 17) {
            f1848a = new al();
        } else if (VERSION.SDK_INT >= 16) {
            f1848a = new ak();
        } else if (VERSION.SDK_INT >= 15) {
            f1848a = new aj();
        } else {
            f1848a = new at();
        }
    }
}
