package com.android.volley.p060a;

import java.io.FilterInputStream;
import java.io.InputStream;

final class C0670k extends FilterInputStream {
    public final long f4088a;
    public long f4089b;

    C0670k(InputStream inputStream, long j) {
        super(inputStream);
        this.f4088a = j;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f4089b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f4089b += (long) read;
        }
        return read;
    }

    final long m4455a() {
        return this.f4088a - this.f4089b;
    }
}
