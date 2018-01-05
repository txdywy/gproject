package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class aa extends b {
    public int f35543a;
    public boolean f35544b;
    public int f35545c;
    public long f35546d;
    public long f35547e;
    public boolean f35548f;
    public boolean f35549g;
    public boolean f35550h;
    public int f35551i;
    public boolean f35552j;
    public boolean f35553k;
    public boolean f35554l;
    public boolean f35555m;
    public int f35556n;
    public int f35557o;
    public boolean f35558p;
    public boolean f35559q;
    public boolean f35560r;
    public int f35561s;
    public boolean f35562t;
    public int f35563u;

    public final aa m34046a(boolean z) {
        this.f35543a |= 16;
        this.f35548f = z;
        return this;
    }

    public final aa m34049b(boolean z) {
        this.f35543a |= 32;
        this.f35549g = z;
        return this;
    }

    public final aa m34050c(boolean z) {
        this.f35543a |= 64;
        this.f35550h = z;
        return this;
    }

    public final aa m34045a(int i) {
        this.f35563u = i;
        this.f35543a |= 524288;
        return this;
    }

    public aa() {
        this.f35543a = 0;
        this.f35544b = false;
        this.f35545c = 0;
        this.f35546d = 0;
        this.f35547e = 0;
        this.f35548f = false;
        this.f35549g = false;
        this.f35550h = false;
        this.f35551i = 0;
        this.f35552j = false;
        this.f35553k = false;
        this.f35554l = false;
        this.f35555m = false;
        this.f35556n = 0;
        this.f35557o = 0;
        this.f35558p = false;
        this.f35559q = false;
        this.f35560r = false;
        this.f35561s = -1;
        this.f35562t = false;
        this.f35563u = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34047a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35543a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f35544b);
        }
        if ((this.f35543a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35545c);
        }
        if ((this.f35543a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f35546d);
        }
        if ((this.f35543a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f35547e);
        }
        if ((this.f35543a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f35548f);
        }
        if ((this.f35543a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f35549g);
        }
        if ((this.f35543a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f35550h);
        }
        if ((this.f35543a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f35551i);
        }
        if ((this.f35543a & 256) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f35552j);
        }
        if ((this.f35543a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f35553k);
        }
        if ((this.f35543a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f35554l);
        }
        if ((this.f35543a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f35555m);
        }
        if ((this.f35543a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33518a(13, this.f35556n);
        }
        if ((this.f35543a & 8192) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f35557o);
        }
        if ((this.f35543a & 16384) != 0) {
            codedOutputByteBufferNano.m33522a(15, this.f35558p);
        }
        if ((this.f35543a & 32768) != 0) {
            codedOutputByteBufferNano.m33522a(16, this.f35559q);
        }
        if ((this.f35543a & 65536) != 0) {
            codedOutputByteBufferNano.m33522a(17, this.f35560r);
        }
        if ((this.f35543a & 131072) != 0) {
            codedOutputByteBufferNano.m33518a(18, this.f35561s);
        }
        if ((this.f35543a & 262144) != 0) {
            codedOutputByteBufferNano.m33522a(19, this.f35562t);
        }
        if ((this.f35543a & 524288) != 0) {
            codedOutputByteBufferNano.m33518a(20, this.f35563u);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34048b() {
        int b = super.b();
        if ((this.f35543a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f35543a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35545c);
        }
        if ((this.f35543a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f35546d);
        }
        if ((this.f35543a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f35547e);
        }
        if ((this.f35543a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f35543a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f35543a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if ((this.f35543a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f35551i);
        }
        if ((this.f35543a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if ((this.f35543a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 1;
        }
        if ((this.f35543a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f35543a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33501d(12) + 1;
        }
        if ((this.f35543a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33502d(13, this.f35556n);
        }
        if ((this.f35543a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33502d(14, this.f35557o);
        }
        if ((this.f35543a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33501d(15) + 1;
        }
        if ((this.f35543a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33501d(16) + 1;
        }
        if ((this.f35543a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33501d(17) + 1;
        }
        if ((this.f35543a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33502d(18, this.f35561s);
        }
        if ((this.f35543a & 262144) != 0) {
            b += CodedOutputByteBufferNano.m33501d(19) + 1;
        }
        if ((this.f35543a & 524288) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(20, this.f35563u);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.aa m34043b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r6 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
    L_0x0002:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000f;
            case 8: goto L_0x0010;
            case 16: goto L_0x001d;
            case 24: goto L_0x002a;
            case 32: goto L_0x0037;
            case 40: goto L_0x0044;
            case 48: goto L_0x0051;
            case 56: goto L_0x005e;
            case 64: goto L_0x006b;
            case 72: goto L_0x0078;
            case 80: goto L_0x0086;
            case 88: goto L_0x0094;
            case 96: goto L_0x00a2;
            case 104: goto L_0x00b0;
            case 112: goto L_0x00be;
            case 120: goto L_0x00cc;
            case 128: goto L_0x00da;
            case 136: goto L_0x00ea;
            case 144: goto L_0x00f9;
            case 152: goto L_0x0108;
            case 160: goto L_0x0117;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0002;
    L_0x000f:
        return r7;
    L_0x0010:
        r0 = r8.m33563e();
        r7.f35544b = r0;
        r0 = r7.f35543a;
        r0 = r0 | 1;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x001d:
        r0 = r8.m33567i();
        r7.f35545c = r0;
        r0 = r7.f35543a;
        r0 = r0 | 2;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x002a:
        r0 = r8.m33568j();
        r7.f35546d = r0;
        r0 = r7.f35543a;
        r0 = r0 | 4;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0037:
        r0 = r8.m33568j();
        r7.f35547e = r0;
        r0 = r7.f35543a;
        r0 = r0 | 8;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0044:
        r0 = r8.m33563e();
        r7.f35548f = r0;
        r0 = r7.f35543a;
        r0 = r0 | 16;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0051:
        r0 = r8.m33563e();
        r7.f35549g = r0;
        r0 = r7.f35543a;
        r0 = r0 | 32;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x005e:
        r0 = r8.m33563e();
        r7.f35550h = r0;
        r0 = r7.f35543a;
        r0 = r0 | 64;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x006b:
        r0 = r8.m33567i();
        r7.f35551i = r0;
        r0 = r7.f35543a;
        r0 = r0 | 128;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0078:
        r0 = r8.m33563e();
        r7.f35552j = r0;
        r0 = r7.f35543a;
        r0 = r0 | 256;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0086:
        r0 = r8.m33563e();
        r7.f35553k = r0;
        r0 = r7.f35543a;
        r0 = r0 | 512;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0094:
        r0 = r8.m33563e();
        r7.f35554l = r0;
        r0 = r7.f35543a;
        r0 = r0 | 1024;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x00a2:
        r0 = r8.m33563e();
        r7.f35555m = r0;
        r0 = r7.f35543a;
        r0 = r0 | 2048;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x00b0:
        r0 = r8.m33567i();
        r7.f35556n = r0;
        r0 = r7.f35543a;
        r0 = r0 | 4096;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x00be:
        r0 = r8.m33567i();
        r7.f35557o = r0;
        r0 = r7.f35543a;
        r0 = r0 | 8192;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x00cc:
        r0 = r8.m33563e();
        r7.f35558p = r0;
        r0 = r7.f35543a;
        r0 = r0 | 16384;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x00da:
        r0 = r8.m33563e();
        r7.f35559q = r0;
        r0 = r7.f35543a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x00ea:
        r0 = r8.m33563e();
        r7.f35560r = r0;
        r0 = r7.f35543a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r1;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x00f9:
        r0 = r8.m33567i();
        r7.f35561s = r0;
        r0 = r7.f35543a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0108:
        r0 = r8.m33563e();
        r7.f35562t = r0;
        r0 = r7.f35543a;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 | r1;
        r7.f35543a = r0;
        goto L_0x0002;
    L_0x0117:
        r1 = r7.f35543a;
        r1 = r1 | r6;
        r7.f35543a = r1;
        r1 = r8.m33573o();
        r2 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0142 }
        switch(r2) {
            case 0: goto L_0x014b;
            case 1: goto L_0x014b;
            case 2: goto L_0x014b;
            case 3: goto L_0x014b;
            default: goto L_0x0127;
        };	 Catch:{ IllegalArgumentException -> 0x0142 }
    L_0x0127:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r4 = 51;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r4 = " is not a valid enum RequiredNetworkType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0142 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0142 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0142 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0142 }
    L_0x0142:
        r2 = move-exception;
        r8.m33562e(r1);
        r7.a(r8, r0);
        goto L_0x0002;
    L_0x014b:
        r7.f35563u = r2;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r2 = r7.f35543a;	 Catch:{ IllegalArgumentException -> 0x0142 }
        r2 = r2 | r6;
        r7.f35543a = r2;	 Catch:{ IllegalArgumentException -> 0x0142 }
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.aa.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.aa");
    }

    public final /* synthetic */ i m34044a(C7213a c7213a) {
        return m34043b(c7213a);
    }
}
