package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7159h extends b {
    public int f34973a;
    public int f34974b;
    public int f34975c;
    public boolean f34976d;
    public int f34977e;
    public int f34978f;

    public C7159h() {
        this.f34973a = -1;
        this.f34974b = 0;
        this.f34973a = -1;
        this.f34973a = -1;
        this.f34973a = -1;
        this.f34973a = -1;
        this.aP = -1;
    }

    public final void m32473a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34974b != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34974b);
        }
        if (this.f34973a == 0) {
            codedOutputByteBufferNano.m33518a(2, this.f34975c);
        }
        if (this.f34973a == 1) {
            codedOutputByteBufferNano.m33522a(3, this.f34976d);
        }
        if (this.f34973a == 2) {
            codedOutputByteBufferNano.m33518a(4, this.f34977e);
        }
        if (this.f34973a == 3) {
            codedOutputByteBufferNano.m33518a(5, this.f34978f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32474b() {
        int b = super.b();
        if (this.f34974b != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34974b);
        }
        if (this.f34973a == 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f34975c);
        }
        if (this.f34973a == 1) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f34973a == 2) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34977e);
        }
        if (this.f34973a == 3) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f34978f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p455b.p456a.C7159h m32471b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x003f;
            case 24: goto L_0x0049;
            case 32: goto L_0x0053;
            case 40: goto L_0x005d;
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
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum EntryMethod";
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
        r6.f34974b = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33567i();
        r6.f34975c = r0;
        r0 = 0;
        r6.f34973a = r0;
        goto L_0x0000;
    L_0x0049:
        r0 = r7.m33563e();
        r6.f34976d = r0;
        r0 = 1;
        r6.f34973a = r0;
        goto L_0x0000;
    L_0x0053:
        r0 = r7.m33567i();
        r6.f34977e = r0;
        r0 = 2;
        r6.f34973a = r0;
        goto L_0x0000;
    L_0x005d:
        r0 = r7.m33567i();
        r6.f34978f = r0;
        r0 = 3;
        r6.f34973a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.b.a.h.b(com.google.protobuf.nano.a):com.google.h.c.b.a.h");
    }

    public final /* synthetic */ i m32472a(C7213a c7213a) {
        return m32471b(c7213a);
    }
}
