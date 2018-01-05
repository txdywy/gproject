package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class af extends b {
    public int f35588a;
    public boolean f35589b;
    public int f35590c;
    public boolean f35591d;
    public boolean f35592e;
    public boolean f35593f;
    public boolean f35594g;
    public int f35595h;
    public boolean f35596i;
    public boolean f35597j;
    public boolean f35598k;
    public boolean f35599l;
    public int f35600m;
    public boolean f35601n;
    public boolean f35602o;
    public boolean f35603p;
    public long f35604q;
    public boolean f35605r;
    public boolean f35606s;
    public int f35607t;
    public int f35608u;
    public int f35609v;
    public int f35610w;
    public int f35611x;
    public int f35612y;
    public int f35613z;

    private static int m34069a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum EntryType");
        }
    }

    private static int m34070b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum ExitReason");
        }
    }

    public af() {
        this.f35588a = 0;
        this.f35589b = false;
        this.f35590c = 0;
        this.f35591d = false;
        this.f35592e = false;
        this.f35593f = false;
        this.f35594g = false;
        this.f35595h = 0;
        this.f35596i = false;
        this.f35597j = false;
        this.f35598k = false;
        this.f35599l = false;
        this.f35600m = 0;
        this.f35601n = false;
        this.f35602o = false;
        this.f35603p = false;
        this.f35604q = 0;
        this.f35605r = false;
        this.f35606s = false;
        this.f35607t = -1;
        this.f35608u = -1;
        this.f35609v = 0;
        this.f35610w = 0;
        this.f35611x = 0;
        this.f35612y = 0;
        this.f35613z = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34073a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35588a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f35589b);
        }
        if ((this.f35588a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35590c);
        }
        if ((this.f35588a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f35591d);
        }
        if ((this.f35588a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f35592e);
        }
        if ((this.f35588a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f35594g);
        }
        if ((this.f35588a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f35595h);
        }
        if ((this.f35588a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f35596i);
        }
        if ((this.f35588a & 256) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f35597j);
        }
        if ((this.f35588a & 262144) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35607t);
        }
        if ((this.f35588a & 1048576) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f35609v);
        }
        if ((this.f35588a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f35593f);
        }
        if ((this.f35588a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f35598k);
        }
        if ((this.f35588a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33522a(13, this.f35599l);
        }
        if ((this.f35588a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f35600m);
        }
        if ((this.f35588a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33522a(15, this.f35601n);
        }
        if ((this.f35588a & 8192) != 0) {
            codedOutputByteBufferNano.m33522a(16, this.f35602o);
        }
        if ((this.f35588a & 16384) != 0) {
            codedOutputByteBufferNano.m33522a(17, this.f35603p);
        }
        if ((this.f35588a & 65536) != 0) {
            codedOutputByteBufferNano.m33522a(18, this.f35605r);
        }
        if ((this.f35588a & 524288) != 0) {
            codedOutputByteBufferNano.m33518a(19, this.f35608u);
        }
        if ((this.f35588a & 2097152) != 0) {
            codedOutputByteBufferNano.m33518a(20, this.f35610w);
        }
        if ((this.f35588a & 4194304) != 0) {
            codedOutputByteBufferNano.m33518a(21, this.f35611x);
        }
        if ((this.f35588a & 32768) != 0) {
            codedOutputByteBufferNano.m33531b(22, this.f35604q);
        }
        if ((this.f35588a & 131072) != 0) {
            codedOutputByteBufferNano.m33522a(23, this.f35606s);
        }
        if ((this.f35588a & 8388608) != 0) {
            codedOutputByteBufferNano.m33518a(24, this.f35612y);
        }
        if ((this.f35588a & 16777216) != 0) {
            codedOutputByteBufferNano.m33518a(25, this.f35613z);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34074b() {
        int b = super.b();
        if ((this.f35588a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f35588a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35590c);
        }
        if ((this.f35588a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f35588a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f35588a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f35588a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f35595h);
        }
        if ((this.f35588a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if ((this.f35588a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f35588a & 262144) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f35607t);
        }
        if ((this.f35588a & 1048576) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f35609v);
        }
        if ((this.f35588a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f35588a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(12) + 1;
        }
        if ((this.f35588a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(13) + 1;
        }
        if ((this.f35588a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33502d(14, this.f35600m);
        }
        if ((this.f35588a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33501d(15) + 1;
        }
        if ((this.f35588a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33501d(16) + 1;
        }
        if ((this.f35588a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33501d(17) + 1;
        }
        if ((this.f35588a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33501d(18) + 1;
        }
        if ((this.f35588a & 524288) != 0) {
            b += CodedOutputByteBufferNano.m33502d(19, this.f35608u);
        }
        if ((this.f35588a & 2097152) != 0) {
            b += CodedOutputByteBufferNano.m33502d(20, this.f35610w);
        }
        if ((this.f35588a & 4194304) != 0) {
            b += CodedOutputByteBufferNano.m33502d(21, this.f35611x);
        }
        if ((this.f35588a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33508f(22, this.f35604q);
        }
        if ((this.f35588a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33501d(23) + 1;
        }
        if ((this.f35588a & 8388608) != 0) {
            b += CodedOutputByteBufferNano.m33502d(24, this.f35612y);
        }
        if ((this.f35588a & 16777216) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(25, this.f35613z);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.af m34071b(com.google.protobuf.nano.C7213a r10) {
        /*
        r9 = this;
        r8 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r7 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
    L_0x0006:
        r0 = r10.m33550a();
        switch(r0) {
            case 0: goto L_0x0013;
            case 8: goto L_0x0014;
            case 16: goto L_0x0021;
            case 24: goto L_0x0044;
            case 32: goto L_0x0051;
            case 40: goto L_0x005e;
            case 48: goto L_0x006b;
            case 56: goto L_0x008f;
            case 64: goto L_0x009d;
            case 72: goto L_0x00ab;
            case 80: goto L_0x00ba;
            case 88: goto L_0x00dd;
            case 96: goto L_0x00eb;
            case 104: goto L_0x00f9;
            case 112: goto L_0x0107;
            case 120: goto L_0x012c;
            case 128: goto L_0x013a;
            case 136: goto L_0x0148;
            case 144: goto L_0x0156;
            case 152: goto L_0x0165;
            case 160: goto L_0x0174;
            case 168: goto L_0x0197;
            case 176: goto L_0x01d4;
            case 184: goto L_0x01e4;
            case 192: goto L_0x01f3;
            case 200: goto L_0x0202;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = super.a(r10, r0);
        if (r0 != 0) goto L_0x0006;
    L_0x0013:
        return r9;
    L_0x0014:
        r0 = r10.m33563e();
        r9.f35589b = r0;
        r0 = r9.f35588a;
        r0 = r0 | 1;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0021:
        r1 = r9.f35588a;
        r1 = r1 | 2;
        r9.f35588a = r1;
        r1 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x003c }
        r2 = com.google.wireless.android.p356a.p357a.p358a.p359a.af.m34069a(r2);	 Catch:{ IllegalArgumentException -> 0x003c }
        r9.f35590c = r2;	 Catch:{ IllegalArgumentException -> 0x003c }
        r2 = r9.f35588a;	 Catch:{ IllegalArgumentException -> 0x003c }
        r2 = r2 | 2;
        r9.f35588a = r2;	 Catch:{ IllegalArgumentException -> 0x003c }
        goto L_0x0006;
    L_0x003c:
        r2 = move-exception;
        r10.m33562e(r1);
        r9.a(r10, r0);
        goto L_0x0006;
    L_0x0044:
        r0 = r10.m33563e();
        r9.f35591d = r0;
        r0 = r9.f35588a;
        r0 = r0 | 4;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0051:
        r0 = r10.m33563e();
        r9.f35592e = r0;
        r0 = r9.f35588a;
        r0 = r0 | 8;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x005e:
        r0 = r10.m33563e();
        r9.f35594g = r0;
        r0 = r9.f35588a;
        r0 = r0 | 32;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x006b:
        r1 = r9.f35588a;
        r1 = r1 | 64;
        r9.f35588a = r1;
        r1 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x0086 }
        r2 = com.google.wireless.android.p356a.p357a.p358a.p359a.af.m34069a(r2);	 Catch:{ IllegalArgumentException -> 0x0086 }
        r9.f35595h = r2;	 Catch:{ IllegalArgumentException -> 0x0086 }
        r2 = r9.f35588a;	 Catch:{ IllegalArgumentException -> 0x0086 }
        r2 = r2 | 64;
        r9.f35588a = r2;	 Catch:{ IllegalArgumentException -> 0x0086 }
        goto L_0x0006;
    L_0x0086:
        r2 = move-exception;
        r10.m33562e(r1);
        r9.a(r10, r0);
        goto L_0x0006;
    L_0x008f:
        r0 = r10.m33563e();
        r9.f35596i = r0;
        r0 = r9.f35588a;
        r0 = r0 | 128;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x009d:
        r0 = r10.m33563e();
        r9.f35597j = r0;
        r0 = r9.f35588a;
        r0 = r0 | 256;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x00ab:
        r0 = r10.m33567i();
        r9.f35607t = r0;
        r0 = r9.f35588a;
        r1 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r0 = r0 | r1;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x00ba:
        r1 = r9.f35588a;
        r1 = r1 | r6;
        r9.f35588a = r1;
        r1 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = com.google.wireless.android.p356a.p357a.p358a.p359a.af.m34070b(r2);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r9.f35609v = r2;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = r9.f35588a;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = r2 | r6;
        r9.f35588a = r2;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        goto L_0x0006;
    L_0x00d4:
        r2 = move-exception;
        r10.m33562e(r1);
        r9.a(r10, r0);
        goto L_0x0006;
    L_0x00dd:
        r0 = r10.m33563e();
        r9.f35593f = r0;
        r0 = r9.f35588a;
        r0 = r0 | 16;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x00eb:
        r0 = r10.m33563e();
        r9.f35598k = r0;
        r0 = r9.f35588a;
        r0 = r0 | 512;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x00f9:
        r0 = r10.m33563e();
        r9.f35599l = r0;
        r0 = r9.f35588a;
        r0 = r0 | 1024;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0107:
        r1 = r9.f35588a;
        r1 = r1 | 2048;
        r9.f35588a = r1;
        r1 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x0123 }
        r2 = com.google.wireless.android.p356a.p357a.p358a.p359a.af.m34069a(r2);	 Catch:{ IllegalArgumentException -> 0x0123 }
        r9.f35600m = r2;	 Catch:{ IllegalArgumentException -> 0x0123 }
        r2 = r9.f35588a;	 Catch:{ IllegalArgumentException -> 0x0123 }
        r2 = r2 | 2048;
        r9.f35588a = r2;	 Catch:{ IllegalArgumentException -> 0x0123 }
        goto L_0x0006;
    L_0x0123:
        r2 = move-exception;
        r10.m33562e(r1);
        r9.a(r10, r0);
        goto L_0x0006;
    L_0x012c:
        r0 = r10.m33563e();
        r9.f35601n = r0;
        r0 = r9.f35588a;
        r0 = r0 | 4096;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x013a:
        r0 = r10.m33563e();
        r9.f35602o = r0;
        r0 = r9.f35588a;
        r0 = r0 | 8192;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0148:
        r0 = r10.m33563e();
        r9.f35603p = r0;
        r0 = r9.f35588a;
        r0 = r0 | 16384;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0156:
        r0 = r10.m33563e();
        r9.f35605r = r0;
        r0 = r9.f35588a;
        r1 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r0 = r0 | r1;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0165:
        r0 = r10.m33567i();
        r9.f35608u = r0;
        r0 = r9.f35588a;
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0 = r0 | r1;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0174:
        r1 = r9.f35588a;
        r1 = r1 | r7;
        r9.f35588a = r1;
        r1 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x018e }
        r2 = com.google.wireless.android.p356a.p357a.p358a.p359a.af.m34070b(r2);	 Catch:{ IllegalArgumentException -> 0x018e }
        r9.f35610w = r2;	 Catch:{ IllegalArgumentException -> 0x018e }
        r2 = r9.f35588a;	 Catch:{ IllegalArgumentException -> 0x018e }
        r2 = r2 | r7;
        r9.f35588a = r2;	 Catch:{ IllegalArgumentException -> 0x018e }
        goto L_0x0006;
    L_0x018e:
        r2 = move-exception;
        r10.m33562e(r1);
        r9.a(r10, r0);
        goto L_0x0006;
    L_0x0197:
        r1 = r9.f35588a;
        r1 = r1 | r8;
        r9.f35588a = r1;
        r1 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x01c2 }
        switch(r2) {
            case 0: goto L_0x01cb;
            case 1: goto L_0x01cb;
            case 2: goto L_0x01cb;
            case 3: goto L_0x01cb;
            case 4: goto L_0x01cb;
            default: goto L_0x01a7;
        };	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x01a7:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r4 = " is not a valid enum NfcErrorReason";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x01c2 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x01c2:
        r2 = move-exception;
        r10.m33562e(r1);
        r9.a(r10, r0);
        goto L_0x0006;
    L_0x01cb:
        r9.f35611x = r2;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = r9.f35588a;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = r2 | r8;
        r9.f35588a = r2;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        goto L_0x0006;
    L_0x01d4:
        r0 = r10.m33559c();
        r9.f35604q = r0;
        r0 = r9.f35588a;
        r1 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0 = r0 | r1;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x01e4:
        r0 = r10.m33563e();
        r9.f35606s = r0;
        r0 = r9.f35588a;
        r1 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r0 | r1;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x01f3:
        r0 = r10.m33560d();
        r9.f35612y = r0;
        r0 = r9.f35588a;
        r1 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r0 = r0 | r1;
        r9.f35588a = r0;
        goto L_0x0006;
    L_0x0202:
        r0 = r10.m33560d();
        r9.f35613z = r0;
        r0 = r9.f35588a;
        r1 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r0 = r0 | r1;
        r9.f35588a = r0;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.af.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.af");
    }

    public final /* synthetic */ i m34072a(C7213a c7213a) {
        return m34071b(c7213a);
    }
}
