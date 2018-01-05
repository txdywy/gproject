package com.google.android.finsky.aa;

import android.accounts.Account;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public static class com.google.android.finsky.aa.o
{

    public static final String[] a;
    public static final com.google.android.finsky.aa.c b;
    public static final com.google.android.finsky.aa.n c;
    public static final com.google.android.finsky.aa.n d;
    public static final com.google.android.finsky.aa.n e;
    public static final com.google.android.finsky.aa.n f;
    public static final com.google.android.finsky.aa.n g;
    public static final com.google.android.finsky.aa.n h;
    public static final com.google.android.finsky.aa.n i;
    public static final com.google.android.finsky.aa.m j;
    public static final com.google.android.finsky.aa.n k;
    public static final com.google.android.finsky.aa.m l;

    static {
        com.google.android.finsky.aa.o.a = new String[0];
        v0 = new com.google.android.finsky.aa.c("vending_preferences");
        com.google.android.finsky.aa.o.b = v0;
        com.google.android.finsky.aa.o.c = v0.a("cached_gl_extensions", 0);
        com.google.android.finsky.aa.o.d = com.google.android.finsky.aa.o.b.a("gl_driver_crashed", Boolean.valueOf(0));
        com.google.android.finsky.aa.o.e = com.google.android.finsky.aa.o.b.a("last_build_fingerprint", 0);
        com.google.android.finsky.aa.o.f = com.google.android.finsky.aa.o.b.a("finsky_backed_up", Boolean.valueOf(0));
        com.google.android.finsky.aa.o.g = com.google.android.finsky.aa.o.b.a("finsky_restored_android_id", 0);
        com.google.android.finsky.aa.o.h = com.google.android.finsky.aa.o.b.a("notify_updates", Boolean.valueOf(1));
        com.google.android.finsky.aa.o.i = com.google.android.finsky.aa.o.b.a("notify_updates_completion", Boolean.valueOf(1));
        com.google.android.finsky.aa.o.j = com.google.android.finsky.aa.o.b.b("IAB_VERSION_", Integer.valueOf(0));
        com.google.android.finsky.aa.o.b.a("update_over_wifi_only", Boolean.valueOf(0));
        com.google.android.finsky.aa.o.b.a("auto_update_default", Boolean.valueOf(0));
        com.google.android.finsky.aa.o.k = com.google.android.finsky.aa.o.b.a("auto_add_shortcuts", Boolean.valueOf(1));
        com.google.android.finsky.aa.o.l = com.google.android.finsky.aa.o.b.b("account_exists_", Boolean.valueOf(0));
    }

    public static boolean a(Account[] p0, String p1) {
        v0 = 0;
        v1 = 0;
        while (true) {
            if (v1 >= p0.length)
                return v0;
            if (p0[v1].name.equals(p1))
                break;
            v1 = v1 + 1;
        }
        v0 = 1;
        return v0;
    }

    public static String[] a(Account[] p0) {
        v0 = 0;
        v1 = 0;
        while (v1 < p0.length) {
            if (!com.google.android.finsky.aa.o.l.b(p0[v1].name).b()) {
                if (v0 == 0)
                    v0 = new ArrayList(1);
                v0.add(p0[v1].name);
            }
            v1 = v1 + 1;
        }
        if (v0 == 0)
            v0 = com.google.android.finsky.aa.o.a;
        else
            v0 = (String[])v0.toArray(new String[v0.size()]);
        return v0;
    }

    public static String[] b(Account[] p0) {
        v1 = new ArrayList();
        v2 = com.google.android.finsky.aa.o.b.a().getAll().keySet().iterator();
        while (v2.hasNext()) {
            v0 = (String)v2.next();
            if (!v0.startsWith("account_exists_"))
                continue;
            v0 = v0.substring(15);
            if (com.google.android.finsky.aa.o.a(p0, v0))
                continue;
            v1.add(v0);
        }
        return (String[])v1.toArray(new String[v1.size()]);
    }

}
