package com.google.android.common.http;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

public final class C0933a extends HttpEntityWrapper {
    public final String f5720a;
    public final int f5721b;
    public final long f5722c;
    public final long f5723d;
    public final long f5724e;
    public final long f5725f;

    public C0933a(HttpEntity httpEntity, String str, int i, long j, long j2, long j3, long j4) {
        super(httpEntity);
        this.f5720a = str;
        this.f5721b = i;
        this.f5722c = j;
        this.f5723d = j2;
        this.f5724e = j3;
        this.f5725f = j4;
    }

    public final InputStream getContent() {
        return new C0934b(this, super.getContent());
    }
}
