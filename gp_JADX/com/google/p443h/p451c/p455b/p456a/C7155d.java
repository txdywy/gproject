package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7155d extends b {
    public int f34941a;
    public int f34942b;
    public int f34943c;
    public int f34944d;
    public int f34945e;
    public int f34946f;
    public int f34947g;

    public C7155d() {
        this.f34941a = 0;
        this.f34942b = 0;
        this.f34943c = 0;
        this.f34944d = 0;
        this.f34945e = 0;
        this.f34946f = 0;
        this.f34947g = 0;
        this.aP = -1;
    }

    public final void m32447a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34941a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34941a);
        }
        if (this.f34942b != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f34942b);
        }
        if (this.f34946f != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34946f);
        }
        if (this.f34947g != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f34947g);
        }
        if (this.f34943c != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f34943c);
        }
        if (this.f34944d != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f34944d);
        }
        if (this.f34945e != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f34945e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32448b() {
        int b = super.b();
        if (this.f34941a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34941a);
        }
        if (this.f34942b != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f34942b);
        }
        if (this.f34946f != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f34946f);
        }
        if (this.f34947g != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34947g);
        }
        if (this.f34943c != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f34943c);
        }
        if (this.f34944d != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f34944d);
        }
        if (this.f34945e != 0) {
            return b + CodedOutputByteBufferNano.m33502d(7, this.f34945e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p455b.p456a.C7155d m32445b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x0015;
            case 24: goto L_0x001c;
            case 32: goto L_0x004d;
            case 40: goto L_0x007e;
            case 48: goto L_0x0086;
            case 56: goto L_0x008e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33567i();
        r6.f34941a = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.m33567i();
        r6.f34942b = r0;
        goto L_0x0000;
    L_0x001c:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0042 }
        switch(r2) {
            case 0: goto L_0x004a;
            case 1: goto L_0x004a;
            case 2: goto L_0x004a;
            default: goto L_0x0027;
        };	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0027:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = " is not a valid enum Orientation";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0042 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004a:
        r6.f34946f = r2;	 Catch:{ IllegalArgumentException -> 0x0042 }
        goto L_0x0000;
    L_0x004d:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0073 }
        switch(r2) {
            case 0: goto L_0x007b;
            case 1: goto L_0x007b;
            case 2: goto L_0x007b;
            case 3: goto L_0x007b;
            case 4: goto L_0x007b;
            default: goto L_0x0058;
        };	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0058:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = " is not a valid enum NetworkType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x007b:
        r6.f34947g = r2;	 Catch:{ IllegalArgumentException -> 0x0073 }
        goto L_0x0000;
    L_0x007e:
        r0 = r7.m33567i();
        r6.f34943c = r0;
        goto L_0x0000;
    L_0x0086:
        r0 = r7.m33567i();
        r6.f34944d = r0;
        goto L_0x0000;
    L_0x008e:
        r0 = r7.m33567i();
        r6.f34945e = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.b.a.d.b(com.google.protobuf.nano.a):com.google.h.c.b.a.d");
    }

    public final /* synthetic */ i m32446a(C7213a c7213a) {
        return m32445b(c7213a);
    }
}
