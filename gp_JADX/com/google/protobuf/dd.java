package com.google.protobuf;

import com.squareup.haha.perflib.HprofParser;
import java.io.InputStream;

final class dd extends InputStream {
    public dc f35332a;
    public C7210p f35333b;
    public int f35334c;
    public int f35335d;
    public int f35336e;
    public int f35337f;
    public final /* synthetic */ da f35338g;

    public dd(da daVar) {
        this.f35338g = daVar;
        m33239a();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            return m33238a(bArr, i, i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (long) m33238a(null, 0, (int) j);
    }

    private final int m33238a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            m33240b();
            if (this.f35333b == null) {
                if (i3 == i2) {
                    return -1;
                }
                return i2 - i3;
            }
            int min = Math.min(this.f35334c - this.f35335d, i3);
            if (bArr != null) {
                this.f35333b.m33212a(bArr, this.f35335d, i4, min);
                i4 += min;
            }
            this.f35335d += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    public final int read() {
        m33240b();
        if (this.f35333b == null) {
            return -1;
        }
        C7203j c7203j = this.f35333b;
        int i = this.f35335d;
        this.f35335d = i + 1;
        return c7203j.mo6169a(i) & HprofParser.ROOT_UNKNOWN;
    }

    public final int available() {
        return this.f35338g.mo6170a() - (this.f35336e + this.f35335d);
    }

    public final boolean markSupported() {
        return true;
    }

    public final void mark(int i) {
        this.f35337f = this.f35336e + this.f35335d;
    }

    public final synchronized void reset() {
        m33239a();
        m33238a(null, 0, this.f35337f);
    }

    private final void m33239a() {
        this.f35332a = new dc(this.f35338g);
        this.f35333b = (C7210p) this.f35332a.next();
        this.f35334c = this.f35333b.mo6170a();
        this.f35335d = 0;
        this.f35336e = 0;
    }

    private final void m33240b() {
        if (this.f35333b != null && this.f35335d == this.f35334c) {
            this.f35336e += this.f35334c;
            this.f35335d = 0;
            if (this.f35332a.hasNext()) {
                this.f35333b = (C7210p) this.f35332a.next();
                this.f35334c = this.f35333b.mo6170a();
                return;
            }
            this.f35333b = null;
            this.f35334c = 0;
        }
    }
}
