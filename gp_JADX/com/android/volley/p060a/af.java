package com.android.volley.p060a;

import java.io.ByteArrayOutputStream;

public final class af extends ByteArrayOutputStream {
    public final C0665f f4055a;

    public af(C0665f c0665f, int i) {
        this.f4055a = c0665f;
        this.buf = this.f4055a.m4428a(Math.max(i, 256));
    }

    public final void close() {
        this.f4055a.m4427a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f4055a.m4427a(this.buf);
    }

    private final void m4412a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f4055a.m4428a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f4055a.m4427a(this.buf);
            this.buf = a;
        }
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m4412a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        m4412a(1);
        super.write(i);
    }
}
