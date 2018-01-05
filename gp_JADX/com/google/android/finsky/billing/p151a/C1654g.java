package com.google.android.finsky.billing.p151a;

import java.io.FilterInputStream;
import java.io.InputStream;

final class C1654g extends FilterInputStream {
    public final long f8603a;
    public long f8604b;

    C1654g(InputStream inputStream, long j) {
        super(inputStream);
        this.f8603a = j;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f8604b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f8604b += (long) read;
        }
        return read;
    }

    final long m9400a() {
        return this.f8603a - this.f8604b;
    }
}
