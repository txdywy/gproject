package com.google.p443h.p451c.p457c.p460b.p463b.p464a;

import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.p443h.p451c.p457c.p460b.p468e.p469a.C7181a;
import com.google.p443h.p451c.p457c.p460b.p468e.p469a.C7182b;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7173a extends b {
    public long f35010a;
    public ae f35011b;
    public C7181a f35012c;
    public C7182b f35013d;
    public int f35014e;
    public boolean f35015f;

    public C7173a() {
        this.f35010a = 0;
        this.f35011b = null;
        this.f35012c = null;
        this.f35013d = null;
        this.f35014e = 0;
        this.f35015f = false;
        this.aP = -1;
    }

    public final void m32518a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35010a != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35010a);
        }
        if (this.f35011b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35011b);
        }
        if (this.f35013d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f35013d);
        }
        if (this.f35015f) {
            codedOutputByteBufferNano.m33522a(8, this.f35015f);
        }
        if (this.f35014e != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35014e);
        }
        if (this.f35012c != null) {
            codedOutputByteBufferNano.m33532b(10, this.f35012c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32519b() {
        int b = super.b();
        if (this.f35010a != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35010a);
        }
        if (this.f35011b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f35011b);
        }
        if (this.f35013d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f35013d);
        }
        if (this.f35015f) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if (this.f35014e != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f35014e);
        }
        if (this.f35012c != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f35012c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p457c.p460b.p463b.p464a.C7173a m32516b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x0015;
            case 26: goto L_0x0026;
            case 64: goto L_0x0037;
            case 72: goto L_0x003e;
            case 82: goto L_0x006f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33568j();
        r6.f35010a = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r6.f35011b;
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = new com.google.a.a.a.a.b.a.b.a.ae;
        r0.<init>();
        r6.f35011b = r0;
    L_0x0020:
        r0 = r6.f35011b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0026:
        r0 = r6.f35013d;
        if (r0 != 0) goto L_0x0031;
    L_0x002a:
        r0 = new com.google.h.c.c.b.e.a.b;
        r0.<init>();
        r6.f35013d = r0;
    L_0x0031:
        r0 = r6.f35013d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0037:
        r0 = r7.m33563e();
        r6.f35015f = r0;
        goto L_0x0000;
    L_0x003e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0064 }
        switch(r2) {
            case 0: goto L_0x006c;
            case 1: goto L_0x006c;
            case 2: goto L_0x006c;
            case 3: goto L_0x006c;
            case 4: goto L_0x006c;
            default: goto L_0x0049;
        };	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0049:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4 = " is not a valid enum LinkType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0064 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0064 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0064:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x006c:
        r6.f35014e = r2;	 Catch:{ IllegalArgumentException -> 0x0064 }
        goto L_0x0000;
    L_0x006f:
        r0 = r6.f35012c;
        if (r0 != 0) goto L_0x007a;
    L_0x0073:
        r0 = new com.google.h.c.c.b.e.a.a;
        r0.<init>();
        r6.f35012c = r0;
    L_0x007a:
        r0 = r6.f35012c;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.c.b.b.a.a.b(com.google.protobuf.nano.a):com.google.h.c.c.b.b.a.a");
    }

    public final /* synthetic */ i m32517a(C7213a c7213a) {
        return m32516b(c7213a);
    }
}
