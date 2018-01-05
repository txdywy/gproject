package org.chromium.base;

import android.os.Build.VERSION;

final class C7906r {
    public static final C7907u f40554a;

    static {
        if (VERSION.SDK_INT >= 22) {
            f40554a = new C7909t();
        } else {
            f40554a = new C7908s();
        }
    }
}
