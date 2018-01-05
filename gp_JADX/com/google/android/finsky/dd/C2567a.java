package com.google.android.finsky.dd;

import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.utils.FinskyLog;

public final class C2567a {
    public static final C0956c f13681a;
    public static final C0957n f13682b;
    public static final C0957n f13683c = f13681a.m5753a("content_uri", null);
    public static final C0957n f13684d = f13681a.m5751a("from_version", Integer.valueOf(-1));
    public static final C0957n f13685e = f13681a.m5751a("to_version", Integer.valueOf(-1));
    public static final C0957n f13686f = f13681a.m5753a("app_delivery_data", null);

    public static void m13570a() {
        try {
            f13681a.m5759b();
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Could not clear SelfUpdateDataStore.", new Object[0]);
        }
    }

    static {
        C0956c c0956c = new C0956c("selfupdate");
        f13681a = c0956c;
        f13682b = c0956c.m5752a("timestamp", Long.valueOf(0));
    }
}
