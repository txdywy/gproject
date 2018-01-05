package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

final class C7201c extends FilterInputStream {
    public int f35250a;

    C7201c(InputStream inputStream, int i) {
        super(inputStream);
        this.f35250a = i;
    }

    public final int available() {
        return Math.min(super.available(), this.f35250a);
    }

    public final int read() {
        if (this.f35250a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read < 0) {
            return read;
        }
        this.f35250a--;
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f35250a <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, this.f35250a));
        if (read < 0) {
            return read;
        }
        this.f35250a -= read;
        return read;
    }

    public final long skip(long j) {
        long skip = super.skip(Math.min(j, (long) this.f35250a));
        if (skip >= 0) {
            this.f35250a = (int) (((long) this.f35250a) - skip);
        }
        return skip;
    }
}
