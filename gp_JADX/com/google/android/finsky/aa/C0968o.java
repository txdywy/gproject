package com.google.android.finsky.aa;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

public final class C0968o {
    public static final String[] f5924a = new String[0];
    public static final C0956c f5925b;
    public static final C0957n f5926c;
    public static final C0957n f5927d = f5925b.m5750a("gl_driver_crashed", Boolean.valueOf(false));
    public static final C0957n f5928e = f5925b.m5753a("last_build_fingerprint", null);
    public static final C0957n f5929f = f5925b.m5750a("finsky_backed_up", Boolean.valueOf(false));
    public static final C0957n f5930g = f5925b.m5753a("finsky_restored_android_id", null);
    public static final C0957n f5931h = f5925b.m5750a("notify_updates", Boolean.valueOf(true));
    public static final C0957n f5932i = f5925b.m5750a("notify_updates_completion", Boolean.valueOf(true));
    public static final C0963m f5933j = f5925b.m5756b("IAB_VERSION_", Integer.valueOf(0));
    public static final C0957n f5934k = f5925b.m5750a("auto_add_shortcuts", Boolean.valueOf(true));
    public static final C0963m f5935l = f5925b.m5755b("account_exists_", Boolean.valueOf(false));

    public static boolean m5782a(Account[] accountArr, String str) {
        for (Account account : accountArr) {
            if (account.name.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String[] m5783a(Account[] accountArr) {
        List list = null;
        for (Account account : accountArr) {
            if (!f5935l.m5777b(account.name).m5764b()) {
                if (list == null) {
                    list = new ArrayList(1);
                }
                list.add(account.name);
            }
        }
        if (list == null) {
            return f5924a;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static String[] m5784b(Account[] accountArr) {
        List arrayList = new ArrayList();
        for (String str : f5925b.m5749a().getAll().keySet()) {
            String str2;
            if (str2.startsWith("account_exists_")) {
                str2 = str2.substring(15);
                if (!C0968o.m5782a(accountArr, str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    static {
        C0956c c0956c = new C0956c("vending_preferences");
        f5925b = c0956c;
        f5926c = c0956c.m5753a("cached_gl_extensions", null);
        f5925b.m5750a("update_over_wifi_only", Boolean.valueOf(false));
        f5925b.m5750a("auto_update_default", Boolean.valueOf(false));
    }
}
