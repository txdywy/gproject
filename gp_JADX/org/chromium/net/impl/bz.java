package org.chromium.net.impl;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

public final class bz {
    public static final Object f40905a = new Object();
    public static int f40906b = 0;

    public static String m38131a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append('/');
        stringBuilder.append(m38134c(context));
        stringBuilder.append(" (Linux; U; Android ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append("; ");
        stringBuilder.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            stringBuilder.append("; ");
            stringBuilder.append(str);
        }
        str = Build.ID;
        if (str.length() > 0) {
            stringBuilder.append("; Build/");
            stringBuilder.append(str);
        }
        stringBuilder.append(";");
        m38132a(stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    static String m38133b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        m38132a(stringBuilder);
        return stringBuilder.toString();
    }

    private static int m38134c(Context context) {
        int i;
        synchronized (f40905a) {
            if (f40906b == 0) {
                try {
                    f40906b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (NameNotFoundException e) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i = f40906b;
        }
        return i;
    }

    private static void m38132a(StringBuilder stringBuilder) {
        stringBuilder.append(" Cronet/");
        stringBuilder.append("64.0.3261.0");
    }
}
