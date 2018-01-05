package com.google.archivepatcher.applier;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class C6886d extends FilterInputStream {
    public long f33997a;
    public byte[] f33998b = new byte[1];

    public C6886d(InputStream inputStream, long j) {
        super(inputStream);
        if (j < 0) {
            throw new IllegalArgumentException("numToRead must be >= 0: " + j);
        }
        this.f33997a = j;
    }

    public final int read() {
        if (read(this.f33998b, 0, 1) == 1) {
            return this.f33998b[0];
        }
        return -1;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f33997a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, this.f33997a));
        if (read <= 0) {
            return read;
        }
        this.f33997a -= (long) read;
        return read;
    }
}
