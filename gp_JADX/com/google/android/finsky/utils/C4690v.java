package com.google.android.finsky.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

public final class C4690v extends FilterOutputStream {
    public final OutputStream f24075a;
    public final long f24076b;
    public MessageDigest f24077c;
    public long f24078d;
    public String f24079e;

    public static C4690v m21840a(OutputStream outputStream, long j) {
        return new C4690v(outputStream, j, "SHA-1");
    }

    public C4690v(OutputStream outputStream, long j, String str) {
        super(outputStream);
        this.f24075a = outputStream;
        this.f24076b = j;
        try {
            this.f24077c = MessageDigest.getInstance(str);
            this.f24078d = 0;
            this.f24079e = str;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final C4689u m21841a() {
        return new C4689u(this.f24077c.digest(), this.f24078d, this.f24079e);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (this.f24078d + ((long) i2) > this.f24076b) {
            throw new IOException("Output length overrun");
        }
        this.f24077c.update(bArr, i, i2);
        this.f24078d += (long) i2;
        this.f24075a.write(bArr, i, i2);
    }

    public final void write(int i) {
        if (this.f24078d + 1 > this.f24076b) {
            throw new IOException("Output length overrun");
        }
        this.f24077c.update((byte) i);
        this.f24078d++;
        this.f24075a.write(i);
    }
}
