package com.google.protobuf;

import com.google.protobuf.CodedOutputStream.OutOfSpaceException;
import com.squareup.haha.perflib.HprofParser;

class C7230y extends CodedOutputStream {
    public final byte[] f35509e;
    public final int f35510f;
    public final int f35511g;
    public int f35512h;

    C7230y(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        } else if (((i | i2) | (bArr.length - (i + i2))) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else {
            this.f35509e = bArr;
            this.f35510f = i;
            this.f35512h = i;
            this.f35511g = i + i2;
        }
    }

    public final void mo6027a(int i, int i2) {
        mo6044c((i << 3) | i2);
    }

    public final void mo6040b(int i, int i2) {
        mo6027a(i, 0);
        mo6039b(i2);
    }

    public final void mo6045c(int i, int i2) {
        mo6027a(i, 0);
        mo6044c(i2);
    }

    public final void mo6049e(int i, int i2) {
        mo6027a(i, 5);
        mo6048e(i2);
    }

    public final void mo6028a(int i, long j) {
        mo6027a(i, 0);
        mo6033a(j);
    }

    public final void mo6046c(int i, long j) {
        mo6027a(i, 1);
        mo6047c(j);
    }

    public final void mo6032a(int i, boolean z) {
        int i2 = 0;
        mo6027a(i, 0);
        if (z) {
            i2 = 1;
        }
        mo6026a((byte) i2);
    }

    public final void mo6031a(int i, String str) {
        mo6027a(i, 2);
        mo6036a(str);
    }

    public final void mo6030a(int i, C7203j c7203j) {
        mo6027a(i, 2);
        mo6035a(c7203j);
    }

    public final void mo6035a(C7203j c7203j) {
        mo6044c(c7203j.mo6170a());
        c7203j.mo6174a((C7195i) this);
    }

    public final void mo6037a(byte[] bArr, int i) {
        mo6044c(i);
        mo6043b(bArr, 0, i);
    }

    public final void mo6029a(int i, cf cfVar) {
        mo6027a(i, 2);
        mo6034a(cfVar);
    }

    public final void mo6041b(int i, cf cfVar) {
        mo6027a(1, 3);
        mo6045c(2, i);
        mo6029a(3, cfVar);
        mo6027a(1, 4);
    }

    public final void mo6042b(int i, C7203j c7203j) {
        mo6027a(1, 3);
        mo6045c(2, i);
        mo6030a(3, c7203j);
        mo6027a(1, 4);
    }

    public final void mo6034a(cf cfVar) {
        mo6044c(cfVar.mo6115a());
        cfVar.mo6116a(this);
    }

    public final void mo6026a(byte b) {
        try {
            byte[] bArr = this.f35509e;
            int i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = b;
        } catch (Throwable e) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35512h), Integer.valueOf(this.f35511g), Integer.valueOf(1)}), e);
        }
    }

    public final void mo6039b(int i) {
        if (i >= 0) {
            mo6044c(i);
        } else {
            mo6033a((long) i);
        }
    }

    public final void mo6044c(int i) {
        byte[] bArr;
        int i2;
        if (!CodedOutputStream.f35081b || mo6024i() < 10) {
            while ((i & -128) != 0) {
                try {
                    bArr = this.f35509e;
                    i2 = this.f35512h;
                    this.f35512h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (Throwable e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35512h), Integer.valueOf(this.f35511g), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f35509e;
            i2 = this.f35512h;
            this.f35512h = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        while ((i & -128) != 0) {
            bArr = this.f35509e;
            i2 = this.f35512h;
            this.f35512h = i2 + 1;
            ea.m33372a(bArr, (long) i2, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        bArr = this.f35509e;
        i2 = this.f35512h;
        this.f35512h = i2 + 1;
        ea.m33372a(bArr, (long) i2, (byte) i);
    }

    public final void mo6048e(int i) {
        try {
            byte[] bArr = this.f35509e;
            int i2 = this.f35512h;
            this.f35512h = i2 + 1;
            bArr[i2] = (byte) (i & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i2 = this.f35512h;
            this.f35512h = i2 + 1;
            bArr[i2] = (byte) ((i >> 8) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i2 = this.f35512h;
            this.f35512h = i2 + 1;
            bArr[i2] = (byte) ((i >> 16) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i2 = this.f35512h;
            this.f35512h = i2 + 1;
            bArr[i2] = (byte) ((i >> 24) & HprofParser.ROOT_UNKNOWN);
        } catch (Throwable e) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35512h), Integer.valueOf(this.f35511g), Integer.valueOf(1)}), e);
        }
    }

    public final void mo6033a(long j) {
        byte[] bArr;
        int i;
        if (!CodedOutputStream.f35081b || mo6024i() < 10) {
            while ((j & -128) != 0) {
                try {
                    bArr = this.f35509e;
                    i = this.f35512h;
                    this.f35512h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (Throwable e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35512h), Integer.valueOf(this.f35511g), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            ea.m33372a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        bArr = this.f35509e;
        i = this.f35512h;
        this.f35512h = i + 1;
        ea.m33372a(bArr, (long) i, (byte) ((int) j));
    }

    public final void mo6047c(long j) {
        try {
            byte[] bArr = this.f35509e;
            int i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) j) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) (j >> 8)) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) (j >> 16)) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) (j >> 24)) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) (j >> 32)) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) (j >> 40)) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) (j >> 48)) & HprofParser.ROOT_UNKNOWN);
            bArr = this.f35509e;
            i = this.f35512h;
            this.f35512h = i + 1;
            bArr[i] = (byte) (((int) (j >> 56)) & HprofParser.ROOT_UNKNOWN);
        } catch (Throwable e) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35512h), Integer.valueOf(this.f35511g), Integer.valueOf(1)}), e);
        }
    }

    public final void mo6043b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f35509e, this.f35512h, i2);
            this.f35512h += i2;
        } catch (Throwable e) {
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f35512h), Integer.valueOf(this.f35511g), Integer.valueOf(i2)}), e);
        }
    }

    public final void mo6038a(byte[] bArr, int i, int i2) {
        mo6043b(bArr, i, i2);
    }

    public final void mo6036a(String str) {
        int i = this.f35512h;
        try {
            int o = CodedOutputStream.m32622o(str.length() * 3);
            int o2 = CodedOutputStream.m32622o(str.length());
            if (o2 == o) {
                this.f35512h = i + o2;
                o = Utf8.m32679a(str, this.f35509e, this.f35512h, mo6024i());
                this.f35512h = i;
                mo6044c((o - i) - o2);
                this.f35512h = o;
                return;
            }
            mo6044c(Utf8.m32678a((CharSequence) str));
            this.f35512h = Utf8.m32679a(str, this.f35509e, this.f35512h, mo6024i());
        } catch (UnpairedSurrogateException e) {
            this.f35512h = i;
            m32643a(str, e);
        } catch (Throwable e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public void mo6050h() {
    }

    public final int mo6024i() {
        return this.f35511g - this.f35512h;
    }
}
