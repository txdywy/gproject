package com.google.compression.brotli.dec;

import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.io.InputStream;

public final class C7079b extends InputStream {
    public byte[] f34596a;
    public int f34597b;
    public int f34598c;
    public final C7084g f34599d;

    public C7079b(InputStream inputStream) {
        this(inputStream, 16384);
    }

    public C7079b(InputStream inputStream, int i) {
        this.f34599d = new C7084g();
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        } else if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        } else {
            this.f34596a = new byte[i];
            this.f34597b = 0;
            this.f34598c = 0;
            try {
                C7081d.m32194a(this.f34599d, inputStream);
            } catch (Throwable e) {
                throw new IOException("Brotli decoder initialization failed", e);
            }
        }
    }

    public final void close() {
        C7081d.m32193a(this.f34599d);
    }

    public final int read() {
        if (this.f34598c >= this.f34597b) {
            this.f34597b = read(this.f34596a, 0, this.f34596a.length);
            this.f34598c = 0;
            if (this.f34597b == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f34596a;
        int i = this.f34598c;
        this.f34598c = i + 1;
        return bArr[i] & HprofParser.ROOT_UNKNOWN;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Bad length: " + i2);
        } else if (i + i2 > bArr.length) {
            int i3 = i + i2;
            throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
        } else if (i2 == 0) {
            return 0;
        } else {
            int max = Math.max(this.f34597b - this.f34598c, 0);
            if (max != 0) {
                max = Math.min(max, i2);
                System.arraycopy(this.f34596a, this.f34598c, bArr, i, max);
                this.f34598c += max;
                i += max;
                i2 -= max;
                if (i2 == 0) {
                    return max;
                }
            }
            try {
                this.f34599d.f34646e = bArr;
                this.f34599d.ab = i;
                this.f34599d.ac = i2;
                this.f34599d.ad = 0;
                C7081d.m32198b(this.f34599d);
                if (this.f34599d.ad == 0) {
                    return -1;
                }
                return max + this.f34599d.ad;
            } catch (Throwable e) {
                throw new IOException("Brotli stream decoding failed", e);
            }
        }
    }
}
