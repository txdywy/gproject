package com.google.android.instantapps.common.p221d.p222a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.pseudonymous.C5319b;
import com.google.android.gms.pseudonymous.C5568a;
import com.google.android.instantapps.common.C5774g;
import com.google.android.instantapps.common.C5804k;

public final class ag {
    public static final C5804k f28916a = new C5804k("LoggingModule");

    static C5319b m26991a() {
        return C5568a.f28483d;
    }

    public static boolean m26992a(C5774g c5774g) {
        return c5774g.m27162a();
    }

    static SharedPreferences m26990a(Context context) {
        return context.getSharedPreferences("com.google.android.instantapps.supervisor.BaseUrlHandler.optInCount", 0);
    }

    static int m26989a(Context context, String str) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (NameNotFoundException e) {
            return i;
        }
    }

    static String m26993b(Context context) {
        StringBuilder stringBuilder = new StringBuilder("Android/");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            stringBuilder.append(packageInfo.packageName);
            stringBuilder.append("/");
            stringBuilder.append(packageInfo.versionName);
        } catch (Throwable e) {
            f28916a.m27208a(e, "Can't find our own package", new Object[0]);
        }
        return stringBuilder.toString();
    }
}
