package com.google.android.finsky.zapp;

import android.content.Context;
import com.google.android.finsky.zapp.p267a.C4833b;

final class C4858q {
    public static C4857p f25166a;

    public static synchronized C4833b m22736a(Context context) {
        C4833b c4833b;
        synchronized (C4858q.class) {
            if (f25166a == null) {
                f25166a = C4855n.m22695a(context);
            }
            c4833b = f25166a;
        }
        return c4833b;
    }
}
