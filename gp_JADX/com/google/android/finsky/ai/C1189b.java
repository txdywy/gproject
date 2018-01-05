package com.google.android.finsky.ai;

import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0957n;
import java.util.HashSet;

public final class C1189b {
    public static final C0956c f7265a;
    public static final C0957n f7266b;
    public static final C0957n f7267c = f7265a.m5754a("incompleted-tasks", new HashSet());
    public static final C0957n f7268d = f7265a.m5751a("last-cache-state", Integer.valueOf(0));
    public static final C0957n f7269e = f7265a.m5751a("current-sync-schedule-state", Integer.valueOf(0));
    public static final C0957n f7270f = f7265a.m5751a("last-dfe-sync-state", Integer.valueOf(0));
    public static final C0957n f7271g = f7265a.m5751a("last-images-sync-state", Integer.valueOf(0));
    public static final C0957n f7272h = f7265a.m5752a("sync-start-timestamp-ms", Long.valueOf(0));
    public static final C0957n f7273i = f7265a.m5752a("sync-end-timestamp-ms", Long.valueOf(0));
    public static final C0957n f7274j = f7265a.m5752a("last-successful-sync-completed-timestamp", Long.valueOf(0));
    public static final C0957n f7275k = f7265a.m5751a("total-fetch-suggestions-enqueued", Integer.valueOf(0));
    public static final C0957n f7276l = f7265a.m5751a("dfe-entries-expected-last-successful-sync", Integer.valueOf(0));
    public static final C0957n f7277m = f7265a.m5751a("dfe-entries-expected-current-sync", Integer.valueOf(0));
    public static final C0957n f7278n = f7265a.m5751a("dfe-fetch-suggestions-processed", Integer.valueOf(0));
    public static final C0957n f7279o = f7265a.m5751a("dfe-entries-synced-last-successful-sync", Integer.valueOf(0));
    public static final C0957n f7280p = f7265a.m5751a("dfe-entries-synced-current-sync", Integer.valueOf(0));
    public static final C0957n f7281q = f7265a.m5751a("images-fetched", Integer.valueOf(0));
    public static final C0957n f7282r = f7265a.m5752a("expiration-timestamp", Long.valueOf(0));
    public static final C0957n f7283s = f7265a.m5752a("last-scheduling-timestamp", Long.valueOf(0));
    public static final C0957n f7284t = f7265a.m5752a("last-volley-cache-cleared-timestamp", Long.valueOf(0));
    public static final C0957n f7285u = f7265a.m5753a("last-volley-cache-cleared-reason", "unknown");
    public static final C0957n f7286v = f7265a.m5752a("jittering-window-end-timestamp", Long.valueOf(0));
    public static final C0957n f7287w = f7265a.m5752a("get-bulk-data-fetch-dfe-wait-threshold-millis", Long.valueOf(0));

    public static synchronized void m7141a(C0957n c0957n, int i) {
        synchronized (C1189b.class) {
            c0957n.m5763a(Integer.valueOf(((Integer) c0957n.m5760a()).intValue() + i));
        }
    }

    static {
        C0956c c0956c = new C0956c("cache_and_sync_preferences");
        f7265a = c0956c;
        f7266b = c0956c.m5754a("account-names", new HashSet());
    }
}
