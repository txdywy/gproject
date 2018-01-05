package android.support.design.p019b;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public final class C0112d {
    public static final int f448a;

    public static void m224a() {
        throw new NoSuchMethodError();
    }

    public static C0116i m225b() {
        throw new NoSuchMethodError();
    }

    public static void m226c() {
        throw new NoSuchMethodError();
    }

    public static int m227d() {
        throw new NoSuchMethodError();
    }

    public static Drawable m228e() {
        throw new NoSuchMethodError();
    }

    public static void m229f() {
        throw new NoSuchMethodError();
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f448a = 2;
        } else if (VERSION.SDK_INT >= 18) {
            f448a = 1;
        } else {
            f448a = 0;
        }
    }
}
