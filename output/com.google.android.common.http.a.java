package com.google.android.common.http;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

public final class com.google.android.common.http.a extends HttpEntityWrapper
{

    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    a(HttpEntity p0, String p1, int p2, long p3, long p5, long p7, long p9) {
        HttpEntityWrapper(p0);
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p5;
        this.e = p7;
        this.f = p9;
    }

    public final InputStream getContent() {
        return new com.google.android.common.http.b(this, super.getContent());
    }

}
