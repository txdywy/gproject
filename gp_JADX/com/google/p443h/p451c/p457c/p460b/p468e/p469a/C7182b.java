package com.google.p443h.p451c.p457c.p460b.p468e.p469a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7182b extends b {
    public int f35032a;
    public byte[] f35033b;
    public byte[] f35034c;

    public C7182b() {
        this.f35032a = 0;
        this.f35033b = C7222l.f35479l;
        this.f35034c = C7222l.f35479l;
        this.aP = -1;
    }

    public final void m32544a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35032a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35032a);
        }
        if (!Arrays.equals(this.f35033b, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(2, this.f35033b);
        }
        if (!Arrays.equals(this.f35034c, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(4, this.f35034c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32545b() {
        int b = super.b();
        if (this.f35032a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35032a);
        }
        if (!Arrays.equals(this.f35033b, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f35033b);
        }
        if (Arrays.equals(this.f35034c, C7222l.f35479l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33494b(4, this.f35034c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p457c.p460b.p468e.p469a.C7182b m32542b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 34: goto L_0x0046;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 5: goto L_0x003c;
            case 7: goto L_0x003c;
            case 9: goto L_0x003c;
            case 12: goto L_0x003c;
            case 16: goto L_0x003c;
            case 19: goto L_0x003c;
            case 20: goto L_0x003c;
            case 22: goto L_0x003c;
            case 23: goto L_0x003c;
            case 31: goto L_0x003c;
            case 43: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum WidgetType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f35032a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33565g();
        r6.f35033b = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.m33565g();
        r6.f35034c = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.c.b.e.a.b.b(com.google.protobuf.nano.a):com.google.h.c.c.b.e.a.b");
    }

    public final /* synthetic */ i m32543a(C7213a c7213a) {
        return m32542b(c7213a);
    }
}
