package com.google.android.finsky.ai;

import com.google.android.finsky.aa.c;
import com.google.android.finsky.aa.n;
import java.util.HashSet;

public static synchronized class com.google.android.finsky.ai.b
{

    public static final com.google.android.finsky.aa.c a;
    public static final com.google.android.finsky.aa.n b;
    public static final com.google.android.finsky.aa.n c;
    public static final com.google.android.finsky.aa.n d;
    public static final com.google.android.finsky.aa.n e;
    public static final com.google.android.finsky.aa.n f;
    public static final com.google.android.finsky.aa.n g;
    public static final com.google.android.finsky.aa.n h;
    public static final com.google.android.finsky.aa.n i;
    public static final com.google.android.finsky.aa.n j;
    public static final com.google.android.finsky.aa.n k;
    public static final com.google.android.finsky.aa.n l;
    public static final com.google.android.finsky.aa.n m;
    public static final com.google.android.finsky.aa.n n;
    public static final com.google.android.finsky.aa.n o;
    public static final com.google.android.finsky.aa.n p;
    public static final com.google.android.finsky.aa.n q;
    public static final com.google.android.finsky.aa.n r;
    public static final com.google.android.finsky.aa.n s;
    public static final com.google.android.finsky.aa.n t;
    public static final com.google.android.finsky.aa.n u;
    public static final com.google.android.finsky.aa.n v;
    public static final com.google.android.finsky.aa.n w;

    static {
        v0 = new com.google.android.finsky.aa.c("cache_and_sync_preferences");
        com.google.android.finsky.ai.b.a = v0;
        com.google.android.finsky.ai.b.b = v0.a("account-names", new HashSet());
        com.google.android.finsky.ai.b.c = com.google.android.finsky.ai.b.a.a("incompleted-tasks", new HashSet());
        com.google.android.finsky.ai.b.d = com.google.android.finsky.ai.b.a.a("last-cache-state", Integer.valueOf(0));
        com.google.android.finsky.ai.b.e = com.google.android.finsky.ai.b.a.a("current-sync-schedule-state", Integer.valueOf(0));
        com.google.android.finsky.ai.b.f = com.google.android.finsky.ai.b.a.a("last-dfe-sync-state", Integer.valueOf(0));
        com.google.android.finsky.ai.b.g = com.google.android.finsky.ai.b.a.a("last-images-sync-state", Integer.valueOf(0));
        com.google.android.finsky.ai.b.h = com.google.android.finsky.ai.b.a.a("sync-start-timestamp-ms", Long.valueOf(0));
        com.google.android.finsky.ai.b.i = com.google.android.finsky.ai.b.a.a("sync-end-timestamp-ms", Long.valueOf(0));
        com.google.android.finsky.ai.b.j = com.google.android.finsky.ai.b.a.a("last-successful-sync-completed-timestamp", Long.valueOf(0));
        com.google.android.finsky.ai.b.k = com.google.android.finsky.ai.b.a.a("total-fetch-suggestions-enqueued", Integer.valueOf(0));
        com.google.android.finsky.ai.b.l = com.google.android.finsky.ai.b.a.a("dfe-entries-expected-last-successful-sync", Integer.valueOf(0));
        com.google.android.finsky.ai.b.m = com.google.android.finsky.ai.b.a.a("dfe-entries-expected-current-sync", Integer.valueOf(0));
        com.google.android.finsky.ai.b.n = com.google.android.finsky.ai.b.a.a("dfe-fetch-suggestions-processed", Integer.valueOf(0));
        com.google.android.finsky.ai.b.o = com.google.android.finsky.ai.b.a.a("dfe-entries-synced-last-successful-sync", Integer.valueOf(0));
        com.google.android.finsky.ai.b.p = com.google.android.finsky.ai.b.a.a("dfe-entries-synced-current-sync", Integer.valueOf(0));
        com.google.android.finsky.ai.b.q = com.google.android.finsky.ai.b.a.a("images-fetched", Integer.valueOf(0));
        com.google.android.finsky.ai.b.r = com.google.android.finsky.ai.b.a.a("expiration-timestamp", Long.valueOf(0));
        com.google.android.finsky.ai.b.s = com.google.android.finsky.ai.b.a.a("last-scheduling-timestamp", Long.valueOf(0));
        com.google.android.finsky.ai.b.t = com.google.android.finsky.ai.b.a.a("last-volley-cache-cleared-timestamp", Long.valueOf(0));
        com.google.android.finsky.ai.b.u = com.google.android.finsky.ai.b.a.a("last-volley-cache-cleared-reason", "unknown");
        com.google.android.finsky.ai.b.v = com.google.android.finsky.ai.b.a.a("jittering-window-end-timestamp", Long.valueOf(0));
        com.google.android.finsky.ai.b.w = com.google.android.finsky.ai.b.a.a("get-bulk-data-fetch-dfe-wait-threshold-millis", Long.valueOf(0));
    }

    public static synchronized void a(com.google.android.finsky.aa.n p0, int p1) {
        enter com.google.android.finsky.ai.b;
        try {
            p0.a(Integer.valueOf(((Integer)p0.a()).intValue() + p1));
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.ai.b;
            throw ex;
        }
        exit com.google.android.finsky.ai.b;
    }

}
