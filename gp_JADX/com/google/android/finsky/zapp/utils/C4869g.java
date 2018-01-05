package com.google.android.finsky.zapp.utils;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

public final class C4869g extends FilterOutputStream {
    public final OutputStream f25176a;
    public MessageDigest f25177b;
    public long f25178c;

    public C4869g(OutputStream outputStream) {
        super(outputStream);
        this.f25176a = outputStream;
        try {
            this.f25177b = MessageDigest.getInstance("SHA-256");
            this.f25178c = 0;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f25177b.update(bArr, i, i2);
        this.f25178c += (long) i2;
        this.f25176a.write(bArr, i, i2);
    }

    public final void write(int i) {
        this.f25177b.update((byte) i);
        this.f25178c++;
        this.f25176a.write(i);
    }
}
