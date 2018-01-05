package com.google.android.volley.ok;

import java.io.InputStream;
import java.io.InterruptedIOException;

final class C6482f extends InputStream {
    public InputStream f32481a;

    public C6482f(InputStream inputStream) {
        this.f32481a = inputStream;
    }

    public final int read() {
        try {
            return this.f32481a.read();
        } catch (InterruptedIOException e) {
            throw c.a(e);
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f32481a.read(bArr);
        } catch (InterruptedIOException e) {
            throw c.a(e);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f32481a.read(bArr, i, i2);
        } catch (InterruptedIOException e) {
            throw c.a(e);
        }
    }

    public final int available() {
        return this.f32481a.available();
    }

    public final void close() {
        this.f32481a.close();
    }

    public final String toString() {
        return this.f32481a.toString();
    }

    public final void mark(int i) {
        this.f32481a.mark(i);
    }

    public final boolean markSupported() {
        return this.f32481a.markSupported();
    }

    public final synchronized void reset() {
        this.f32481a.reset();
    }

    public final long skip(long j) {
        return this.f32481a.skip(j);
    }
}
