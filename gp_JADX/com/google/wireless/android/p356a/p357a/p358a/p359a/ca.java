package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ca extends b {
    public int f35890a;
    public String f35891b;
    public String f35892c;
    public String f35893d;
    public int f35894e;
    public int f35895f;

    public ca() {
        this.f35890a = 0;
        this.f35891b = "";
        this.f35892c = "";
        this.f35893d = "";
        this.f35894e = 0;
        this.f35895f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34262a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35890a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35891b);
        }
        if ((this.f35890a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f35892c);
        }
        if ((this.f35890a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35893d);
        }
        if ((this.f35890a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35894e);
        }
        if ((this.f35890a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35895f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34263b() {
        int b = super.b();
        if ((this.f35890a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35891b);
        }
        if ((this.f35890a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f35892c);
        }
        if ((this.f35890a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f35893d);
        }
        if ((this.f35890a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35894e);
        }
        if ((this.f35890a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f35895f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.ca m34260b(com.google.protobuf.nano.C7213a r7) {
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
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f35891b = r0;
        r0 = r6.f35890a;
        r0 = r0 | 1;
        r6.f35890a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33564f();
        r6.f35892c = r0;
        r0 = r6.f35890a;
        r0 = r0 | 2;
        r6.f35890a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m33564f();
        r6.f35893d = r0;
        r0 = r6.f35890a;
        r0 = r0 | 4;
        r6.f35890a = r0;
        goto L_0x0000;
    L_0x0035:
        r1 = r6.f35890a;
        r1 = r1 | 8;
        r6.f35890a = r1;
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
        r6.f35894e = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r6.f35890a;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2 | 8;
        r6.f35890a = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33560d();
        r6.f35895f = r0;
        r0 = r6.f35890a;
        r0 = r0 | 16;
        r6.f35890a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.ca.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.ca");
    }

    public final /* synthetic */ i m34261a(C7213a c7213a) {
        return m34260b(c7213a);
    }
}
