package com.google.android.finsky.billing.e;

import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.c;
import com.google.android.finsky.aa.m;

static class com.google.android.finsky.billing.e.a
{

    public static final com.google.android.finsky.aa.c a;
    public static final com.google.android.finsky.aa.m b;
    public static final com.google.android.finsky.aa.m c;
    public static final com.google.android.finsky.aa.m d;
    public static final com.google.android.finsky.aa.m e;

    static {
        com.google.android.finsky.billing.e.a.a = com.google.android.finsky.aa.a.a;
        com.google.android.finsky.aa.a.a.b("gaia-auth-opt-out", 0);
        com.google.android.finsky.billing.e.a.b = com.google.android.finsky.billing.e.a.a.b("purchase-auth-type", Integer.valueOf(-1));
        com.google.android.finsky.billing.e.a.c = com.google.android.finsky.billing.e.a.a.b("purchase-auth-version-code", 0);
        com.google.android.finsky.billing.e.a.d = com.google.android.finsky.billing.e.a.a.b("has-seen-purchase-session-message", Boolean.valueOf(0));
        com.google.android.finsky.billing.e.a.e = com.google.android.finsky.billing.e.a.a.b("use-fingerprint-for-purchase", Boolean.valueOf(0));
    }

}
