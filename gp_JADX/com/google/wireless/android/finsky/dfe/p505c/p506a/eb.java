package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eb extends b {
    public int f37523a;
    public String f37524b;
    public String f37525c;
    public String f37526d;
    public int f37527e;
    public long f37528f;
    public String f37529g;
    public ax f37530h;
    public int f37531i;
    public String f37532j;

    public eb() {
        this.f37523a = 0;
        this.f37524b = "";
        this.f37525c = "";
        this.f37526d = "";
        this.f37527e = 0;
        this.f37528f = 0;
        this.f37529g = "";
        this.f37530h = null;
        this.f37531i = 1;
        this.f37532j = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35435a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37523a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37524b);
        }
        if ((this.f37523a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37525c);
        }
        if ((this.f37523a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37526d);
        }
        if ((this.f37523a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37527e);
        }
        if ((this.f37523a & 16) != 0) {
            codedOutputByteBufferNano.m33531b(5, this.f37528f);
        }
        if ((this.f37523a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37529g);
        }
        if (this.f37530h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37530h);
        }
        if ((this.f37523a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f37531i);
        }
        if ((this.f37523a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f37532j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35436b() {
        int b = super.b();
        if ((this.f37523a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37524b);
        }
        if ((this.f37523a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37525c);
        }
        if ((this.f37523a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37526d);
        }
        if ((this.f37523a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f37527e);
        }
        if ((this.f37523a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(5, this.f37528f);
        }
        if ((this.f37523a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37529g);
        }
        if (this.f37530h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f37530h);
        }
        if ((this.f37523a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f37531i);
        }
        if ((this.f37523a & 128) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(9, this.f37532j);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.eb m35433b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 26: goto L_0x0028;
            case 32: goto L_0x0035;
            case 40: goto L_0x0072;
            case 50: goto L_0x007f;
            case 58: goto L_0x008d;
            case 64: goto L_0x009f;
            case 74: goto L_0x00c4;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f37524b = r0;
        r0 = r6.f37523a;
        r0 = r0 | 1;
        r6.f37523a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33564f();
        r6.f37525c = r0;
        r0 = r6.f37523a;
        r0 = r0 | 2;
        r6.f37523a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m33564f();
        r6.f37526d = r0;
        r0 = r6.f37523a;
        r0 = r0 | 4;
        r6.f37523a = r0;
        goto L_0x0000;
    L_0x0035:
        r1 = r6.f37523a;
        r1 = r1 | 8;
        r6.f37523a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0061 }
        switch(r2) {
            case 0: goto L_0x0069;
            case 1: goto L_0x0069;
            case 2: goto L_0x0069;
            case 3: goto L_0x0069;
            case 4: goto L_0x0069;
            case 5: goto L_0x0069;
            case 6: goto L_0x0069;
            case 7: goto L_0x0069;
            case 8: goto L_0x0069;
            case 9: goto L_0x0069;
            case 10: goto L_0x0069;
            default: goto L_0x0046;
        };	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0046:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0061 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0061:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0069:
        r6.f37527e = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r6.f37523a;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2 | 8;
        r6.f37523a = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33559c();
        r6.f37528f = r0;
        r0 = r6.f37523a;
        r0 = r0 | 16;
        r6.f37523a = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r7.m33564f();
        r6.f37529g = r0;
        r0 = r6.f37523a;
        r0 = r0 | 32;
        r6.f37523a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r6.f37530h;
        if (r0 != 0) goto L_0x0098;
    L_0x0091:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r6.f37530h = r0;
    L_0x0098:
        r0 = r6.f37530h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x009f:
        r1 = r6.f37523a;
        r1 = r1 | 64;
        r6.f37523a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x00bb }
        r2 = com.google.android.finsky.cv.a.bp.a(r2);	 Catch:{ IllegalArgumentException -> 0x00bb }
        r6.f37531i = r2;	 Catch:{ IllegalArgumentException -> 0x00bb }
        r2 = r6.f37523a;	 Catch:{ IllegalArgumentException -> 0x00bb }
        r2 = r2 | 64;
        r6.f37523a = r2;	 Catch:{ IllegalArgumentException -> 0x00bb }
        goto L_0x0000;
    L_0x00bb:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00c4:
        r0 = r7.m33564f();
        r6.f37532j = r0;
        r0 = r6.f37523a;
        r0 = r0 | 128;
        r6.f37523a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.eb.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.eb");
    }

    public final /* synthetic */ i m35434a(C7213a c7213a) {
        return m35433b(c7213a);
    }
}
