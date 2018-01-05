package com.android.ex.photo.p052e;

import android.os.Build.VERSION;
import android.os.Trace;

public final class C0565h {
    public static void m4103a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void m4102a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
