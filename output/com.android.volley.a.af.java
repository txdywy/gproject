package com.android.volley.a;

import java.io.ByteArrayOutputStream;

public final synchronized class com.android.volley.a.af extends ByteArrayOutputStream
{

    public final com.android.volley.a.f a;

    af(com.android.volley.a.f p0, int p1) {
        ByteArrayOutputStream();
        this.a = p0;
        this.buf = this.a.a(Math.max(p1, 256));
    }

    private final void a(int p0) {
        if (this.count + p0 > this.buf.length) {
            v0 = this.a.a((this.count + p0) * 2);
            System.arraycopy(this.buf, 0, v0, 0, this.count);
            this.a.a(this.buf);
            this.buf = v0;
        }
    }

    public final void close() {
        this.a.a(this.buf);
        this.buf = 0;
        super.close();
    }

    public final void finalize() {
        this.a.a(this.buf);
    }

    public final synchronized void write(int p0) {
        enter this;
        try {
            this.a(1);
            super.write(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void write(byte[] p0, int p1, int p2) {
        enter this;
        try {
            this.a(p2);
            super.write(p0, p1, p2);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
