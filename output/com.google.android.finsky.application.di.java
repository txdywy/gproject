package com.google.android.finsky.application;

import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.datasync.s;
import com.google.android.finsky.m;

public final class com.google.android.finsky.application.di implements com.google.android.finsky.volley.d
{

    public final com.google.android.finsky.application.d a;

    di(com.google.android.finsky.application.d p0) {
        this.a = p0;
    }

    public final void a() {
        this.a.r.a(new com.google.android.finsky.d.c(555));
        this.a.aT();
        com.google.android.finsky.datasync.s.b("volley_main_cache_directory_created");
    }

}
