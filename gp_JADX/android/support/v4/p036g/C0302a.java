package android.support.v4.p036g;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

public final class C0302a {
    public static Method f1706a;
    public static Method f1707b;

    public static String m1618a(Locale locale) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f1707b.invoke(null, new Object[]{locale})).getScript();
            } catch (Throwable e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (Throwable e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String b = C0302a.m1619b(locale);
        if (b != null) {
            return C0302a.m1617a(b);
        }
        return null;
    }

    private static String m1617a(String str) {
        try {
            if (f1706a != null) {
                return (String) f1706a.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w("ICUCompat", e);
        } catch (Throwable e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    private static String m1619b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f1707b != null) {
                return (String) f1707b.invoke(null, new Object[]{locale2});
            }
        } catch (Throwable e) {
            Log.w("ICUCompat", e);
        } catch (Throwable e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            try {
                f1707b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
                return;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f1706a = cls.getMethod("getScript", new Class[]{String.class});
                f1707b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Throwable e2) {
            f1706a = null;
            f1707b = null;
            Log.w("ICUCompat", e2);
        }
    }
}
