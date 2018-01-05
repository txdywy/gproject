package android.support.p027e;

import android.os.Build.VERSION;

final class C0175a {
    public static final C0176e f1008a;

    static {
        if (VERSION.SDK_INT >= 19) {
            f1008a = new C0179d();
        } else {
            f1008a = new C0177b();
        }
    }
}
