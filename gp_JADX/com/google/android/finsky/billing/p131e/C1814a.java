package com.google.android.finsky.billing.p131e;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0963m;

public final class C1814a {
    public static final C0956c f9371a;
    public static final C0963m f9372b = f9371a.m5756b("purchase-auth-type", Integer.valueOf(-1));
    public static final C0963m f9373c = f9371a.m5756b("purchase-auth-version-code", null);
    public static final C0963m f9374d = f9371a.m5755b("has-seen-purchase-session-message", Boolean.valueOf(false));
    public static final C0963m f9375e = f9371a.m5755b("use-fingerprint-for-purchase", Boolean.valueOf(false));

    static {
        C0956c c0956c = C0954a.f5831a;
        f9371a = c0956c;
        c0956c.m5755b("gaia-auth-opt-out", null);
    }
}
