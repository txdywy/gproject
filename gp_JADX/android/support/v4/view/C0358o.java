package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

public final class C0358o {
    public static Field f1923a;
    public static boolean f1924b;
    public static final C0359q f1925c;

    static void m2045a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1924b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1923a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f1924b = true;
        }
        if (f1923a != null) {
            try {
                f1923a.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    public static void m2046b(LayoutInflater layoutInflater, Factory2 factory2) {
        f1925c.mo448a(layoutInflater, factory2);
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1925c = new C0360p();
        } else {
            f1925c = new C0359q();
        }
    }
}
