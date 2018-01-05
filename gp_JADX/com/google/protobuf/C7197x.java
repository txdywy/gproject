package com.google.protobuf;

import com.squareup.haha.perflib.HprofParser;

abstract class C7197x extends CodedOutputStream {
    public final byte[] f35087e;
    public final int f35088f;
    public int f35089g;
    public int f35090h;

    C7197x(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        this.f35087e = new byte[Math.max(i, 20)];
        this.f35088f = this.f35087e.length;
    }

    public final int mo6024i() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void m32692b(byte b) {
        byte[] bArr = this.f35087e;
        int i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = b;
        this.f35090h++;
    }

    final void m32696j(int i, int i2) {
        mo6025t((i << 3) | i2);
    }

    final void mo6025t(int i) {
        if (CodedOutputStream.f35081b) {
            byte[] bArr;
            int i2;
            long j = (long) this.f35089g;
            while ((i & -128) != 0) {
                bArr = this.f35087e;
                i2 = this.f35089g;
                this.f35089g = i2 + 1;
                ea.m33372a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            bArr = this.f35087e;
            i2 = this.f35089g;
            this.f35089g = i2 + 1;
            ea.m33372a(bArr, (long) i2, (byte) i);
            this.f35090h = ((int) (((long) this.f35089g) - j)) + this.f35090h;
            return;
        }
        byte[] bArr2;
        int i3;
        while ((i & -128) != 0) {
            bArr2 = this.f35087e;
            i3 = this.f35089g;
            this.f35089g = i3 + 1;
            bArr2[i3] = (byte) ((i & 127) | 128);
            this.f35090h++;
            i >>>= 7;
        }
        bArr2 = this.f35087e;
        i3 = this.f35089g;
        this.f35089g = i3 + 1;
        bArr2[i3] = (byte) i;
        this.f35090h++;
    }

    final void mo6023g(long j) {
        if (CodedOutputStream.f35081b) {
            byte[] bArr;
            int i;
            long j2 = (long) this.f35089g;
            while ((j & -128) != 0) {
                bArr = this.f35087e;
                i = this.f35089g;
                this.f35089g = i + 1;
                ea.m33372a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            bArr = this.f35087e;
            i = this.f35089g;
            this.f35089g = i + 1;
            ea.m33372a(bArr, (long) i, (byte) ((int) j));
            this.f35090h = ((int) (((long) this.f35089g) - j2)) + this.f35090h;
            return;
        }
        byte[] bArr2;
        int i2;
        while ((j & -128) != 0) {
            bArr2 = this.f35087e;
            i2 = this.f35089g;
            this.f35089g = i2 + 1;
            bArr2[i2] = (byte) ((((int) j) & 127) | 128);
            this.f35090h++;
            j >>>= 7;
        }
        bArr2 = this.f35087e;
        i2 = this.f35089g;
        this.f35089g = i2 + 1;
        bArr2[i2] = (byte) ((int) j);
        this.f35090h++;
    }

    final void m32698u(int i) {
        byte[] bArr = this.f35087e;
        int i2 = this.f35089g;
        this.f35089g = i2 + 1;
        bArr[i2] = (byte) (i & HprofParser.ROOT_UNKNOWN);
        bArr = this.f35087e;
        i2 = this.f35089g;
        this.f35089g = i2 + 1;
        bArr[i2] = (byte) ((i >> 8) & HprofParser.ROOT_UNKNOWN);
        bArr = this.f35087e;
        i2 = this.f35089g;
        this.f35089g = i2 + 1;
        bArr[i2] = (byte) ((i >> 16) & HprofParser.ROOT_UNKNOWN);
        bArr = this.f35087e;
        i2 = this.f35089g;
        this.f35089g = i2 + 1;
        bArr[i2] = (byte) ((i >> 24) & HprofParser.ROOT_UNKNOWN);
        this.f35090h += 4;
    }

    final void m32694h(long j) {
        byte[] bArr = this.f35087e;
        int i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        bArr = this.f35087e;
        i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) ((int) ((j >> 8) & 255));
        bArr = this.f35087e;
        i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) ((int) ((j >> 16) & 255));
        bArr = this.f35087e;
        i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) ((int) ((j >> 24) & 255));
        bArr = this.f35087e;
        i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) (((int) (j >> 32)) & HprofParser.ROOT_UNKNOWN);
        bArr = this.f35087e;
        i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) (((int) (j >> 40)) & HprofParser.ROOT_UNKNOWN);
        bArr = this.f35087e;
        i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) (((int) (j >> 48)) & HprofParser.ROOT_UNKNOWN);
        bArr = this.f35087e;
        i = this.f35089g;
        this.f35089g = i + 1;
        bArr[i] = (byte) (((int) (j >> 56)) & HprofParser.ROOT_UNKNOWN);
        this.f35090h += 8;
    }
}
