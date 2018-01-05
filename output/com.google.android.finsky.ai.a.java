package com.google.android.finsky.ai;

import com.android.volley.a;
import com.google.android.finsky.volley.c;

public static class com.google.android.finsky.ai.a
{

    public static boolean a(com.android.volley.a p0) {
        v0 = 0;
        if (p0 != 0) {
            if (p0 instanceof com.google.android.finsky.volley.c)
                v0 = ((com.google.android.finsky.volley.c)p0).c("cache_and_sync_marker_cache_key");
            else if (p0.a("cache_and_sync_marker_cache_key") != 0)
                v0 = 1;
        }
        return v0;
    }

}
