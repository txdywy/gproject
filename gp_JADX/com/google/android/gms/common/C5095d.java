package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C5123l;
import com.google.android.gms.common.util.C5154i;
import com.google.android.gms.internal.dr;

public class C5095d {
    public static final int f25936c = C5105f.f25965a;
    public static final C5095d f25937d = new C5095d();

    C5095d() {
    }

    public static int m23655a(Context context) {
        int d = C5105f.m23694d(context);
        return C5105f.m23693b(context, d) ? 18 : d;
    }

    public static Intent m23656a(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !C5154i.m23886a(context)) ? C5123l.m23808a("com.google.android.gms", C5095d.m23657a(context, str)) : C5123l.m23806a();
            case 3:
                return C5123l.m23807a("com.google.android.gms");
            default:
                return null;
        }
    }

    public static boolean m23658a(int i) {
        return C5105f.m23692b(i);
    }

    public static boolean m23659a(Context context, int i) {
        return C5105f.m23693b(context, i);
    }

    public static PendingIntent m23660b(Context context, int i, String str) {
        Intent a = C5095d.m23656a(context, i, str);
        return a == null ? null : PendingIntent.getActivity(context, 0, a, 268435456);
    }

    public static String m23661b(int i) {
        return C5105f.m23689a(i);
    }

    public static void m23662b(Context context) {
        C5105f.m23695e(context);
    }

    public static int m23664d(Context context) {
        return C5105f.m23699i(context);
    }

    public static void m23663c(Context context) {
        if (!C5105f.f25968d.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    private static String m23657a(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(f25936c);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(dr.f26667b.m24299a(context).m24298b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }
}
