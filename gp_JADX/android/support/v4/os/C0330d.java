package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

public final class C0330d {
    public static void m1728a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void m1727a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
