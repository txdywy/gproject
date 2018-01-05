package com.google.android.finsky.ai;

import com.android.volley.C0659a;
import com.google.android.finsky.volley.C4778c;

public final class C1188a {
    public static boolean m7140a(C0659a c0659a) {
        if (c0659a == null) {
            return false;
        }
        if (c0659a instanceof C4778c) {
            return ((C4778c) c0659a).m22408c("cache_and_sync_marker_cache_key");
        }
        if (c0659a.mo1064a("cache_and_sync_marker_cache_key") != null) {
            return true;
        }
        return false;
    }
}
