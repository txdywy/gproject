package com.google.android.play.p203b;

import android.os.Build.VERSION;

public final class C6267e {
    public static final C6266d f31323a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f31323a = new C6269g();
        } else {
            f31323a = new C6268f();
        }
    }
}
