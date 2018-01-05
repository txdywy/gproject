package com.google.android.finsky.billing.a;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class com.google.android.finsky.billing.a.g extends FilterInputStream
{

    public final long a;
    public long b;

    g(InputStream p0, long p1) {
        FilterInputStream(p0);
        this.a = p1;
    }

    final long a() {
        return this.a - this.b;
    }

    public final int read() {
        v0 = super.read();
        if (v0 != -1)
            this.b = this.b + 1;
        return v0;
    }

    public final int read(byte[] p0, int p1, int p2) {
        v0 = super.read(p0, p1, p2);
        if (v0 != -1)
            this.b = this.b + (long)v0;
        return v0;
    }

}
