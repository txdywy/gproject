package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.dr;

public final class ac {
    public static Object f25975a = new Object();
    public static boolean f25976b;
    public static String f25977c;
    public static int f25978d;

    public static String m23718a(Context context) {
        m23720c(context);
        return f25977c;
    }

    public static int m23719b(Context context) {
        m23720c(context);
        return f25978d;
    }

    private static void m23720c(Context context) {
        synchronized (f25975a) {
            if (f25976b) {
                return;
            }
            f25976b = true;
            try {
                Bundle bundle = dr.f26667b.m24299a(context).m24295a(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f25977c = bundle.getString("com.google.app.id");
                f25978d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
