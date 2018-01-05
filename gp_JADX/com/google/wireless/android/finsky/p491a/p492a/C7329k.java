package com.google.wireless.android.finsky.p491a.p492a;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7329k extends b {
    public int f36527a;
    public int f36528b;
    public String f36529c;
    public String f36530d;
    public String f36531e;
    public String f36532f;
    public String f36533g;
    public am f36534h;
    public String f36535i;
    public String f36536j;
    public String f36537k;
    public String f36538l;
    public String f36539m;
    public String f36540n;
    public boolean f36541o;
    public String f36542p;
    public String f36543q;
    public String f36544r;
    public String f36545s;
    public String f36546t;
    public bd f36547u;
    public String f36548v;
    public String f36549w;

    public C7329k() {
        this.f36527a = 0;
        this.f36528b = 1;
        this.f36529c = "";
        this.f36530d = "";
        this.f36531e = "";
        this.f36532f = "";
        this.f36533g = "";
        this.f36534h = null;
        this.f36535i = "";
        this.f36536j = "";
        this.f36537k = "";
        this.f36538l = "";
        this.f36539m = "";
        this.f36540n = "";
        this.f36541o = false;
        this.f36542p = "";
        this.f36543q = "";
        this.f36544r = "";
        this.f36545s = "";
        this.f36546t = "";
        this.f36547u = null;
        this.f36548v = "";
        this.f36549w = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34745a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36527a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36528b);
        }
        if ((this.f36527a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36529c);
        }
        if ((this.f36527a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36530d);
        }
        if ((this.f36527a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36531e);
        }
        if ((this.f36527a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36532f);
        }
        if ((this.f36527a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36533g);
        }
        if (this.f36534h != null) {
            codedOutputByteBufferNano.m33532b(9, this.f36534h);
        }
        if ((this.f36527a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f36535i);
        }
        if ((this.f36527a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(11, this.f36536j);
        }
        if ((this.f36527a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(12, this.f36538l);
        }
        if ((this.f36527a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f36539m);
        }
        if ((this.f36527a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33521a(14, this.f36540n);
        }
        if ((this.f36527a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33522a(15, this.f36541o);
        }
        if ((this.f36527a & 8192) != 0) {
            codedOutputByteBufferNano.m33521a(16, this.f36542p);
        }
        if ((this.f36527a & 16384) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f36543q);
        }
        if ((this.f36527a & 32768) != 0) {
            codedOutputByteBufferNano.m33521a(18, this.f36544r);
        }
        if ((this.f36527a & 65536) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f36545s);
        }
        if ((this.f36527a & 131072) != 0) {
            codedOutputByteBufferNano.m33521a(20, this.f36546t);
        }
        if (this.f36547u != null) {
            codedOutputByteBufferNano.m33532b(21, this.f36547u);
        }
        if ((this.f36527a & 262144) != 0) {
            codedOutputByteBufferNano.m33521a(22, this.f36548v);
        }
        if ((this.f36527a & 524288) != 0) {
            codedOutputByteBufferNano.m33521a(23, this.f36549w);
        }
        if ((this.f36527a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(24, this.f36537k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34746b() {
        int b = super.b();
        if ((this.f36527a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36528b);
        }
        if ((this.f36527a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36529c);
        }
        if ((this.f36527a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36530d);
        }
        if ((this.f36527a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36531e);
        }
        if ((this.f36527a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36532f);
        }
        if ((this.f36527a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36533g);
        }
        if (this.f36534h != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f36534h);
        }
        if ((this.f36527a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f36535i);
        }
        if ((this.f36527a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f36536j);
        }
        if ((this.f36527a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(12, this.f36538l);
        }
        if ((this.f36527a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f36539m);
        }
        if ((this.f36527a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f36540n);
        }
        if ((this.f36527a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33501d(15) + 1;
        }
        if ((this.f36527a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f36542p);
        }
        if ((this.f36527a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f36543q);
        }
        if ((this.f36527a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33493b(18, this.f36544r);
        }
        if ((this.f36527a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33493b(19, this.f36545s);
        }
        if ((this.f36527a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33493b(20, this.f36546t);
        }
        if (this.f36547u != null) {
            b += CodedOutputByteBufferNano.m33503d(21, this.f36547u);
        }
        if ((this.f36527a & 262144) != 0) {
            b += CodedOutputByteBufferNano.m33493b(22, this.f36548v);
        }
        if ((this.f36527a & 524288) != 0) {
            b += CodedOutputByteBufferNano.m33493b(23, this.f36549w);
        }
        if ((this.f36527a & 256) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(24, this.f36537k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.C7329k m34743b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 50: goto L_0x0065;
            case 58: goto L_0x0072;
            case 66: goto L_0x007f;
            case 74: goto L_0x008d;
            case 82: goto L_0x009f;
            case 90: goto L_0x00ad;
            case 98: goto L_0x00bb;
            case 106: goto L_0x00c9;
            case 114: goto L_0x00d7;
            case 120: goto L_0x00e5;
            case 130: goto L_0x00f3;
            case 138: goto L_0x0101;
            case 146: goto L_0x010f;
            case 154: goto L_0x011f;
            case 162: goto L_0x012e;
            case 170: goto L_0x013d;
            case 178: goto L_0x014f;
            case 186: goto L_0x015e;
            case 194: goto L_0x016d;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36527a;
        r1 = r1 | 1;
        r6.f36527a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Type";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f36528b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36527a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36527a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f36529c = r0;
        r0 = r6.f36527a;
        r0 = r0 | 2;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f36530d = r0;
        r0 = r6.f36527a;
        r0 = r0 | 4;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.m33564f();
        r6.f36531e = r0;
        r0 = r6.f36527a;
        r0 = r0 | 8;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33564f();
        r6.f36532f = r0;
        r0 = r6.f36527a;
        r0 = r0 | 16;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r7.m33564f();
        r6.f36533g = r0;
        r0 = r6.f36527a;
        r0 = r0 | 32;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r6.f36534h;
        if (r0 != 0) goto L_0x0098;
    L_0x0091:
        r0 = new com.google.wireless.android.finsky.a.a.am;
        r0.<init>();
        r6.f36534h = r0;
    L_0x0098:
        r0 = r6.f36534h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x009f:
        r0 = r7.m33564f();
        r6.f36535i = r0;
        r0 = r6.f36527a;
        r0 = r0 | 64;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x00ad:
        r0 = r7.m33564f();
        r6.f36536j = r0;
        r0 = r6.f36527a;
        r0 = r0 | 128;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x00bb:
        r0 = r7.m33564f();
        r6.f36538l = r0;
        r0 = r6.f36527a;
        r0 = r0 | 512;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x00c9:
        r0 = r7.m33564f();
        r6.f36539m = r0;
        r0 = r6.f36527a;
        r0 = r0 | 1024;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x00d7:
        r0 = r7.m33564f();
        r6.f36540n = r0;
        r0 = r6.f36527a;
        r0 = r0 | 2048;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x00e5:
        r0 = r7.m33563e();
        r6.f36541o = r0;
        r0 = r6.f36527a;
        r0 = r0 | 4096;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x00f3:
        r0 = r7.m33564f();
        r6.f36542p = r0;
        r0 = r6.f36527a;
        r0 = r0 | 8192;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x0101:
        r0 = r7.m33564f();
        r6.f36543q = r0;
        r0 = r6.f36527a;
        r0 = r0 | 16384;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x010f:
        r0 = r7.m33564f();
        r6.f36544r = r0;
        r0 = r6.f36527a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x011f:
        r0 = r7.m33564f();
        r6.f36545s = r0;
        r0 = r6.f36527a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r1;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x012e:
        r0 = r7.m33564f();
        r6.f36546t = r0;
        r0 = r6.f36527a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x013d:
        r0 = r6.f36547u;
        if (r0 != 0) goto L_0x0148;
    L_0x0141:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f36547u = r0;
    L_0x0148:
        r0 = r6.f36547u;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x014f:
        r0 = r7.m33564f();
        r6.f36548v = r0;
        r0 = r6.f36527a;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 | r1;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x015e:
        r0 = r7.m33564f();
        r6.f36549w = r0;
        r0 = r6.f36527a;
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r1;
        r6.f36527a = r0;
        goto L_0x0000;
    L_0x016d:
        r0 = r7.m33564f();
        r6.f36537k = r0;
        r0 = r6.f36527a;
        r0 = r0 | 256;
        r6.f36527a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.k.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.k");
    }

    public final /* synthetic */ i m34744a(C7213a c7213a) {
        return m34743b(c7213a);
    }
}
