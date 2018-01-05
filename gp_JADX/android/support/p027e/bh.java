package android.support.p027e;

import android.os.Build.VERSION;
import android.view.ViewGroup;

final class bh {
    public static final bl f1090a;

    static void m930a(ViewGroup viewGroup, boolean z) {
        f1090a.mo233a(viewGroup, z);
    }

    static {
        if (VERSION.SDK_INT >= 18) {
            f1090a = new bk();
        } else {
            f1090a = new bi();
        }
    }
}
