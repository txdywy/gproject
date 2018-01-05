package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p526e.C7725i;

public abstract class am implements Closeable {
    public abstract ac mo6474a();

    public abstract long mo6475b();

    public abstract C7725i mo6476d();

    public final InputStream m36664c() {
        return mo6476d().mo6494e();
    }

    public final byte[] m36666e() {
        long b = mo6475b();
        if (b > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + b);
        }
        Closeable d = mo6476d();
        try {
            byte[] o = d.mo6505o();
            if (b == -1 || b == ((long) o.length)) {
                return o;
            }
            throw new IOException("Content-Length and stream length disagree");
        } finally {
            k.a(d);
        }
    }

    public void close() {
        mo6476d().close();
    }
}
