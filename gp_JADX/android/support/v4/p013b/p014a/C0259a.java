package android.support.v4.p013b.p014a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class C0259a {
    public static Method f1625a;
    public static boolean f1626b;
    public static Method f1627c;
    public static boolean f1628d;

    public static void m1520a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static boolean m1521a(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void m1513a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    public static void m1515a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public static void m1514a(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0043j) {
            ((C0043j) drawable).setTint(i);
        }
    }

    public static void m1516a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0043j) {
            ((C0043j) drawable).setTintList(colorStateList);
        }
    }

    public static void m1519a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0043j) {
            ((C0043j) drawable).setTintMode(mode);
        }
    }

    public static int m1522b(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    public static void m1517a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean m1524c(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static void m1525d(Drawable drawable) {
        Drawable drawable2 = drawable;
        while (VERSION.SDK_INT < 23 && VERSION.SDK_INT >= 21) {
            drawable2.clearColorFilter();
            if (drawable2 instanceof InsetDrawable) {
                drawable2 = ((InsetDrawable) drawable2).getDrawable();
            } else if (drawable2 instanceof C0260b) {
                drawable2 = ((C0260b) drawable2).mo360a();
            } else if (drawable2 instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable2).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            C0259a.m1525d(child);
                        }
                    }
                    return;
                }
                return;
            } else {
                return;
            }
        }
        drawable2.clearColorFilter();
    }

    public static void m1518a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static Drawable m1526e(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (VERSION.SDK_INT >= 21) {
            if (drawable instanceof C0043j) {
                return drawable;
            }
            return new C0266h(drawable);
        } else if (VERSION.SDK_INT >= 19) {
            if (drawable instanceof C0043j) {
                return drawable;
            }
            return new C0264f(drawable);
        } else if (drawable instanceof C0043j) {
            return drawable;
        } else {
            return new C0261c(drawable);
        }
    }

    public static boolean m1523b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f1626b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f1625a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f1626b = true;
        }
        if (f1625a != null) {
            try {
                f1625a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Throwable e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f1625a = null;
            }
        }
        return false;
    }

    public static int m1527f(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f1628d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f1627c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f1628d = true;
        }
        if (f1627c != null) {
            try {
                return ((Integer) f1627c.invoke(drawable, new Object[0])).intValue();
            } catch (Throwable e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f1627c = null;
            }
        }
        return 0;
    }
}
