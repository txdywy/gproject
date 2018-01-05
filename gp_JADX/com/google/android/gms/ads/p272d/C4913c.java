package com.google.android.gms.ads.p272d;

import android.content.Context;
import com.google.android.gms.internal.bc;
import com.google.android.gms.internal.bd;

final class C4913c {
    public static final Object f25272a = new Object();
    public static bd f25273b;

    public static bd m22929a(Context context) {
        bd bdVar;
        synchronized (f25272a) {
            if (f25273b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                f25273b = bc.m24199b(context);
            }
            bdVar = f25273b;
        }
        return bdVar;
    }
}
