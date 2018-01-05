package com.google.android.volley.ok;

import java.io.InputStream;
import java.io.InterruptedIOException;

final class C6485k extends InputStream {
    public InputStream f32487a;

    public C6485k(InputStream inputStream) {
        this.f32487a = inputStream;
    }

    public final int read() {
        try {
            return this.f32487a.read();
        } catch (InterruptedIOException e) {
            throw h.b(e);
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f32487a.read(bArr);
        } catch (InterruptedIOException e) {
            throw h.b(e);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f32487a.read(bArr, i, i2);
        } catch (InterruptedIOException e) {
            throw h.b(e);
        }
    }

    public final int available() {
        return this.f32487a.available();
    }

    public final void close() {
        this.f32487a.close();
    }

    public final String toString() {
        return this.f32487a.toString();
    }

    public final void mark(int i) {
        this.f32487a.mark(i);
    }

    public final boolean markSupported() {
        return this.f32487a.markSupported();
    }

    public final synchronized void reset() {
        this.f32487a.reset();
    }

    public final long skip(long j) {
        return this.f32487a.skip(j);
    }
}
