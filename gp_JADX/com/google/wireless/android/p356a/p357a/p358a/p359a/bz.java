package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class bz extends b {
    public int f35866a;
    public String f35867b;
    public long f35868c;
    public long f35869d;
    public int f35870e;
    public int f35871f;
    public float f35872g;
    public boolean f35873h;
    public int f35874i;
    public int f35875j;
    public int f35876k;
    public int f35877l;
    public boolean f35878m;
    public boolean f35879n;
    public long f35880o;
    public int f35881p;
    public int f35882q;
    public long f35883r;
    public long f35884s;
    public int f35885t;
    public String f35886u;
    public long f35887v;

    public final bz m34253a(int i) {
        this.f35877l = i;
        this.f35866a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        return this;
    }

    public bz() {
        this.f35866a = 0;
        this.f35867b = "";
        this.f35868c = 0;
        this.f35869d = 0;
        this.f35870e = 0;
        this.f35871f = 0;
        this.f35872g = 0.0f;
        this.f35873h = false;
        this.f35874i = 0;
        this.f35875j = 0;
        this.f35876k = 0;
        this.f35877l = 0;
        this.f35878m = false;
        this.f35879n = false;
        this.f35880o = 0;
        this.f35881p = 0;
        this.f35882q = 0;
        this.f35883r = 0;
        this.f35884s = 0;
        this.f35885t = 0;
        this.f35886u = "";
        this.f35887v = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34254a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35866a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35867b);
        }
        if ((this.f35866a & 2) != 0) {
            codedOutputByteBufferNano.m33519a(2, this.f35868c);
        }
        if ((this.f35866a & 4) != 0) {
            codedOutputByteBufferNano.m33519a(3, this.f35869d);
        }
        if ((this.f35866a & 8) != 0) {
            codedOutputByteBufferNano.m33534c(4, this.f35870e);
        }
        if ((this.f35866a & 16) != 0) {
            codedOutputByteBufferNano.m33534c(5, this.f35871f);
        }
        if ((this.f35866a & 32) != 0) {
            codedOutputByteBufferNano.m33517a(6, this.f35872g);
        }
        if ((this.f35866a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f35873h);
        }
        if ((this.f35866a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f35874i);
        }
        if ((this.f35866a & 256) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35875j);
        }
        if ((this.f35866a & 512) != 0) {
            codedOutputByteBufferNano.m33534c(10, this.f35876k);
        }
        if ((this.f35866a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33518a(11, this.f35877l);
        }
        if ((this.f35866a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f35878m);
        }
        if ((this.f35866a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33522a(13, this.f35879n);
        }
        if ((this.f35866a & 8192) != 0) {
            codedOutputByteBufferNano.m33519a(14, this.f35880o);
        }
        if ((this.f35866a & 16384) != 0) {
            codedOutputByteBufferNano.m33518a(15, this.f35881p);
        }
        if ((this.f35866a & 32768) != 0) {
            codedOutputByteBufferNano.m33534c(16, this.f35882q);
        }
        if ((this.f35866a & 65536) != 0) {
            codedOutputByteBufferNano.m33519a(17, this.f35883r);
        }
        if ((this.f35866a & 131072) != 0) {
            codedOutputByteBufferNano.m33519a(18, this.f35884s);
        }
        if ((this.f35866a & 262144) != 0) {
            codedOutputByteBufferNano.m33518a(19, this.f35885t);
        }
        if ((this.f35866a & 524288) != 0) {
            codedOutputByteBufferNano.m33521a(20, this.f35886u);
        }
        if ((this.f35866a & 1048576) != 0) {
            codedOutputByteBufferNano.m33519a(21, this.f35887v);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34255b() {
        int b = super.b();
        if ((this.f35866a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35867b);
        }
        if ((this.f35866a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33505e(2, this.f35868c);
        }
        if ((this.f35866a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33505e(3, this.f35869d);
        }
        if ((this.f35866a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33504e(4, this.f35870e);
        }
        if ((this.f35866a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33504e(5, this.f35871f);
        }
        if ((this.f35866a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 4;
        }
        if ((this.f35866a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if ((this.f35866a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f35874i);
        }
        if ((this.f35866a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f35875j);
        }
        if ((this.f35866a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33504e(10, this.f35876k);
        }
        if ((this.f35866a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33502d(11, this.f35877l);
        }
        if ((this.f35866a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33501d(12) + 1;
        }
        if ((this.f35866a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33501d(13) + 1;
        }
        if ((this.f35866a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33505e(14, this.f35880o);
        }
        if ((this.f35866a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33502d(15, this.f35881p);
        }
        if ((this.f35866a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33504e(16, this.f35882q);
        }
        if ((this.f35866a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33505e(17, this.f35883r);
        }
        if ((this.f35866a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33505e(18, this.f35884s);
        }
        if ((this.f35866a & 262144) != 0) {
            b += CodedOutputByteBufferNano.m33502d(19, this.f35885t);
        }
        if ((this.f35866a & 524288) != 0) {
            b += CodedOutputByteBufferNano.m33493b(20, this.f35886u);
        }
        if ((this.f35866a & 1048576) != 0) {
            return b + CodedOutputByteBufferNano.m33505e(21, this.f35887v);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.bz m34251b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r6 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
    L_0x0002:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000f;
            case 10: goto L_0x0010;
            case 16: goto L_0x001d;
            case 24: goto L_0x002a;
            case 32: goto L_0x0037;
            case 40: goto L_0x0044;
            case 53: goto L_0x0051;
            case 56: goto L_0x0062;
            case 64: goto L_0x006f;
            case 72: goto L_0x0094;
            case 80: goto L_0x00b9;
            case 88: goto L_0x00c7;
            case 96: goto L_0x0106;
            case 104: goto L_0x0114;
            case 112: goto L_0x0122;
            case 120: goto L_0x0130;
            case 128: goto L_0x016f;
            case 136: goto L_0x017f;
            case 144: goto L_0x018e;
            case 152: goto L_0x019d;
            case 162: goto L_0x01da;
            case 168: goto L_0x01e9;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0002;
    L_0x000f:
        return r7;
    L_0x0010:
        r0 = r8.m33564f();
        r7.f35867b = r0;
        r0 = r7.f35866a;
        r0 = r0 | 1;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x001d:
        r0 = r8.m33568j();
        r7.f35868c = r0;
        r0 = r7.f35866a;
        r0 = r0 | 2;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x002a:
        r0 = r8.m33568j();
        r7.f35869d = r0;
        r0 = r7.f35866a;
        r0 = r0 | 4;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x0037:
        r0 = r8.m33567i();
        r7.f35870e = r0;
        r0 = r7.f35866a;
        r0 = r0 | 8;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x0044:
        r0 = r8.m33567i();
        r7.f35871f = r0;
        r0 = r7.f35866a;
        r0 = r0 | 16;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x0051:
        r0 = r8.m33569k();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r7.f35872g = r0;
        r0 = r7.f35866a;
        r0 = r0 | 32;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x0062:
        r0 = r8.m33563e();
        r7.f35873h = r0;
        r0 = r7.f35866a;
        r0 = r0 | 64;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x006f:
        r1 = r7.f35866a;
        r1 = r1 | 128;
        r7.f35866a = r1;
        r1 = r8.m33573o();
        r2 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x008b }
        r2 = com.google.android.play.a.a.z.a(r2);	 Catch:{ IllegalArgumentException -> 0x008b }
        r7.f35874i = r2;	 Catch:{ IllegalArgumentException -> 0x008b }
        r2 = r7.f35866a;	 Catch:{ IllegalArgumentException -> 0x008b }
        r2 = r2 | 128;
        r7.f35866a = r2;	 Catch:{ IllegalArgumentException -> 0x008b }
        goto L_0x0002;
    L_0x008b:
        r2 = move-exception;
        r8.m33562e(r1);
        r7.a(r8, r0);
        goto L_0x0002;
    L_0x0094:
        r1 = r7.f35866a;
        r1 = r1 | 256;
        r7.f35866a = r1;
        r1 = r8.m33573o();
        r2 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = com.google.android.play.a.a.z.a(r2);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r7.f35875j = r2;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = r7.f35866a;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = r2 | 256;
        r7.f35866a = r2;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        goto L_0x0002;
    L_0x00b0:
        r2 = move-exception;
        r8.m33562e(r1);
        r7.a(r8, r0);
        goto L_0x0002;
    L_0x00b9:
        r0 = r8.m33567i();
        r7.f35876k = r0;
        r0 = r7.f35866a;
        r0 = r0 | 512;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x00c7:
        r1 = r7.f35866a;
        r1 = r1 | 1024;
        r7.f35866a = r1;
        r1 = r8.m33573o();
        r2 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00f3 }
        switch(r2) {
            case 0: goto L_0x00fc;
            case 1: goto L_0x00fc;
            case 2: goto L_0x00fc;
            case 3: goto L_0x00fc;
            case 4: goto L_0x00fc;
            case 5: goto L_0x00fc;
            case 6: goto L_0x00fc;
            case 7: goto L_0x00fc;
            case 8: goto L_0x00fc;
            default: goto L_0x00d8;
        };	 Catch:{ IllegalArgumentException -> 0x00f3 }
    L_0x00d8:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r4 = " is not a valid enum VolleyErrorType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00f3 }
    L_0x00f3:
        r2 = move-exception;
        r8.m33562e(r1);
        r7.a(r8, r0);
        goto L_0x0002;
    L_0x00fc:
        r7.f35877l = r2;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r2 = r7.f35866a;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r2 = r2 | 1024;
        r7.f35866a = r2;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        goto L_0x0002;
    L_0x0106:
        r0 = r8.m33563e();
        r7.f35878m = r0;
        r0 = r7.f35866a;
        r0 = r0 | 2048;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x0114:
        r0 = r8.m33563e();
        r7.f35879n = r0;
        r0 = r7.f35866a;
        r0 = r0 | 4096;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x0122:
        r0 = r8.m33555b();
        r7.f35880o = r0;
        r0 = r7.f35866a;
        r0 = r0 | 8192;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x0130:
        r1 = r7.f35866a;
        r1 = r1 | 16384;
        r7.f35866a = r1;
        r1 = r8.m33573o();
        r2 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x015c }
        switch(r2) {
            case 0: goto L_0x0165;
            case 1: goto L_0x0165;
            case 2: goto L_0x0165;
            case 3: goto L_0x0165;
            case 4: goto L_0x0165;
            case 5: goto L_0x0165;
            case 6: goto L_0x0165;
            default: goto L_0x0141;
        };	 Catch:{ IllegalArgumentException -> 0x015c }
    L_0x0141:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x015c }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x015c }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x015c }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x015c }
        r4 = " is not a valid enum CacheHitType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x015c }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x015c }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x015c }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x015c }
    L_0x015c:
        r2 = move-exception;
        r8.m33562e(r1);
        r7.a(r8, r0);
        goto L_0x0002;
    L_0x0165:
        r7.f35881p = r2;	 Catch:{ IllegalArgumentException -> 0x015c }
        r2 = r7.f35866a;	 Catch:{ IllegalArgumentException -> 0x015c }
        r2 = r2 | 16384;
        r7.f35866a = r2;	 Catch:{ IllegalArgumentException -> 0x015c }
        goto L_0x0002;
    L_0x016f:
        r0 = r8.m33566h();
        r7.f35882q = r0;
        r0 = r7.f35866a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x017f:
        r0 = r8.m33555b();
        r7.f35883r = r0;
        r0 = r7.f35866a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r1;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x018e:
        r0 = r8.m33555b();
        r7.f35884s = r0;
        r0 = r7.f35866a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x019d:
        r1 = r7.f35866a;
        r1 = r1 | r6;
        r7.f35866a = r1;
        r1 = r8.m33573o();
        r2 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x01c8 }
        switch(r2) {
            case 0: goto L_0x01d1;
            case 1: goto L_0x01d1;
            case 2: goto L_0x01d1;
            case 3: goto L_0x01d1;
            default: goto L_0x01ad;
        };	 Catch:{ IllegalArgumentException -> 0x01c8 }
    L_0x01ad:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r4 = " is not a valid enum CacheEntrySource";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x01c8 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x01c8 }
    L_0x01c8:
        r2 = move-exception;
        r8.m33562e(r1);
        r7.a(r8, r0);
        goto L_0x0002;
    L_0x01d1:
        r7.f35885t = r2;	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r2 = r7.f35866a;	 Catch:{ IllegalArgumentException -> 0x01c8 }
        r2 = r2 | r6;
        r7.f35866a = r2;	 Catch:{ IllegalArgumentException -> 0x01c8 }
        goto L_0x0002;
    L_0x01da:
        r0 = r8.m33564f();
        r7.f35886u = r0;
        r0 = r7.f35866a;
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r1;
        r7.f35866a = r0;
        goto L_0x0002;
    L_0x01e9:
        r0 = r8.m33555b();
        r7.f35887v = r0;
        r0 = r7.f35866a;
        r1 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r0 = r0 | r1;
        r7.f35866a = r0;
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.bz.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.bz");
    }

    public final /* synthetic */ i m34252a(C7213a c7213a) {
        return m34251b(c7213a);
    }
}
