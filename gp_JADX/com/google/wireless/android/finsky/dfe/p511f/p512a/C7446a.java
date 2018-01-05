package com.google.wireless.android.finsky.dfe.p511f.p512a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7446a extends b {
    public int f37744a;
    public boolean f37745b;
    public C7448c f37746c;
    public C7447b f37747d;
    public int f37748e;
    public C7449d f37749f;

    public C7446a() {
        this.f37744a = 0;
        this.f37745b = false;
        this.f37746c = null;
        this.f37747d = null;
        this.f37748e = 0;
        this.f37749f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35561a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37744a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f37745b);
        }
        if (this.f37746c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37746c);
        }
        if (this.f37747d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37747d);
        }
        if ((this.f37744a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37748e);
        }
        if (this.f37749f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37749f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35562b() {
        int b = super.b();
        if ((this.f37744a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f37746c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37746c);
        }
        if (this.f37747d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37747d);
        }
        if ((this.f37744a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37748e);
        }
        if (this.f37749f != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37749f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p511f.p512a.C7446a m35559b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 26: goto L_0x001b;
            case 34: goto L_0x002c;
            case 40: goto L_0x003d;
            case 50: goto L_0x007a;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33563e();
        r6.f37745b = r0;
        r0 = r6.f37744a;
        r0 = r0 | 1;
        r6.f37744a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f37746c;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.wireless.android.finsky.dfe.f.a.c;
        r0.<init>();
        r6.f37746c = r0;
    L_0x0026:
        r0 = r6.f37746c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x002c:
        r0 = r6.f37747d;
        if (r0 != 0) goto L_0x0037;
    L_0x0030:
        r0 = new com.google.wireless.android.finsky.dfe.f.a.b;
        r0.<init>();
        r6.f37747d = r0;
    L_0x0037:
        r0 = r6.f37747d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x003d:
        r1 = r6.f37744a;
        r1 = r1 | 2;
        r6.f37744a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0069 }
        switch(r2) {
            case 0: goto L_0x0071;
            case 1: goto L_0x0071;
            case 2: goto L_0x0071;
            default: goto L_0x004e;
        };	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x004e:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r4 = " is not a valid enum AccountType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0069 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0069 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x0069:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0071:
        r6.f37748e = r2;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r6.f37744a;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r2 = r2 | 2;
        r6.f37744a = r2;	 Catch:{ IllegalArgumentException -> 0x0069 }
        goto L_0x0000;
    L_0x007a:
        r0 = r6.f37749f;
        if (r0 != 0) goto L_0x0085;
    L_0x007e:
        r0 = new com.google.wireless.android.finsky.dfe.f.a.d;
        r0.<init>();
        r6.f37749f = r0;
    L_0x0085:
        r0 = r6.f37749f;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.f.a.a.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.f.a.a");
    }

    public final /* synthetic */ i m35560a(C7213a c7213a) {
        return m35559b(c7213a);
    }
}
