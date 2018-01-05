package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.v4.p032d.p033a.C0284b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class C0362s {
    public static final C0364w f1926a;

    @Deprecated
    public static View m2055a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static MenuItem m2053a(MenuItem menuItem, C0350g c0350g) {
        if (menuItem instanceof C0284b) {
            return ((C0284b) menuItem).mo627a(c0350g);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static boolean m2062b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @Deprecated
    public static boolean m2063c(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean m2064d(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @Deprecated
    public static MenuItem m2054a(MenuItem menuItem, C0367x c0367x) {
        return menuItem.setOnActionExpandListener(new C0363t(c0367x));
    }

    public static void m2059a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0284b) {
            ((C0284b) menuItem).mo628a(charSequence);
        } else {
            f1926a.mo452a(menuItem, charSequence);
        }
    }

    public static void m2061b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0284b) {
            ((C0284b) menuItem).mo630b(charSequence);
        } else {
            f1926a.mo454b(menuItem, charSequence);
        }
    }

    public static void m2056a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0284b) {
            ((C0284b) menuItem).setNumericShortcut(c, i);
        } else {
            f1926a.mo453b(menuItem, c, i);
        }
    }

    public static void m2060b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0284b) {
            ((C0284b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1926a.mo449a(menuItem, c, i);
        }
    }

    public static void m2057a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0284b) {
            ((C0284b) menuItem).setIconTintList(colorStateList);
        } else {
            f1926a.mo450a(menuItem, colorStateList);
        }
    }

    public static void m2058a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0284b) {
            ((C0284b) menuItem).setIconTintMode(mode);
        } else {
            f1926a.mo451a(menuItem, mode);
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1926a = new C0366u();
        } else {
            f1926a = new C0365v();
        }
    }
}
