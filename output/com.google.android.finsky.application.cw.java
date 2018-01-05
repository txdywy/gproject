package com.google.android.finsky.application;

import com.google.android.finsky.api.c;
import com.google.android.finsky.m;

public final class com.google.android.finsky.application.cw implements com.google.android.finsky.api.h
{

    public final String a;
    public final com.google.android.finsky.application.d b;

    cw(com.google.android.finsky.application.d p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final com.google.android.finsky.api.c a() {
        return this.b.c(this.a);
    }

    public final com.google.android.finsky.api.c a(String p0) {
        return this.b.a(p0, this.a);
    }

    public final com.google.android.finsky.api.c b() {
        throw new UnsupportedOperationException("Authenticated accounts only for Wear");
    }

}
