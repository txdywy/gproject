package com.google.common.p416c;

import com.google.common.p414a.C6937m;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class C6971f extends FilterOutputStream {
    public long f34363a;

    public C6971f(OutputStream outputStream) {
        super((OutputStream) C6937m.m31623a((Object) outputStream));
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f34363a += (long) i2;
    }

    public final void write(int i) {
        this.out.write(i);
        this.f34363a++;
    }

    public final void close() {
        this.out.close();
    }
}
