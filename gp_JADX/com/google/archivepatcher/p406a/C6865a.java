package com.google.archivepatcher.p406a;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class C6865a extends FilterOutputStream {
    public long f33903a = 0;

    public C6865a(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(int i) {
        this.f33903a++;
        this.out.write(i);
    }

    public final void write(byte[] bArr) {
        this.f33903a += (long) bArr.length;
        this.out.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f33903a += (long) i2;
        this.out.write(bArr, i, i2);
    }
}
