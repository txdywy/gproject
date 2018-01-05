package com.google.android.play.p203b;

import android.os.Build.VERSION;

public final class C6270j {
    public static final C3918i f31324a;
    public static final C3918i f31325b = new C6271k();

    static {
        if (VERSION.SDK_INT >= 21) {
            f31324a = new C6273m();
        } else {
            f31324a = new C6272l();
        }
    }
}
