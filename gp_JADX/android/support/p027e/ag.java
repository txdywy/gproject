package android.support.p027e;

import android.os.Build.VERSION;

final class ag {
    public static final aj f1016a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1016a = new ai();
        } else {
            f1016a = new ah();
        }
    }
}
