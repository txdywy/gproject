package com.google.android.gms.phenotype.core.p304a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.util.logging.Level;

public final class C5513k {
    public static final c f28337a = c.a("com/google/android/gms/phenotype/core/common/Users");
    public static volatile Boolean f28338b;

    private static String[] m26438a(Context context) {
        try {
            AccountManager accountManager = AccountManager.get(context);
            if (f28338b == null) {
                boolean z = VERSION.SDK_INT >= 21 && context.getPackageManager().hasSystemFeature("cn.google");
                f28338b = Boolean.valueOf(z);
            }
            Account[] accountsByType = accountManager.getAccountsByType(f28338b.booleanValue() ? "cn.google" : "com.google");
            String[] strArr = new String[accountsByType.length];
            for (int i = 0; i < accountsByType.length; i++) {
                strArr[i] = accountsByType[i].name;
            }
            return strArr;
        } catch (Throwable e) {
            ((d) ((d) ((d) f28337a.a(Level.SEVERE)).a(e)).a("com/google/android/gms/phenotype/core/common/Users", "getDeviceUsers", 35, "Users.java")).a("Failed to get device user accounts");
            return new String[0];
        }
    }

    public static boolean m26437a(String str, Context context) {
        for (String equals : C5513k.m26438a(context)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
