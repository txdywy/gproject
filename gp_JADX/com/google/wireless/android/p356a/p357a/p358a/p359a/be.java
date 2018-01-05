package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class be extends b {
    public static volatile be[] f35761a;
    public int f35762b;
    public int f35763c;
    public long f35764d;
    public long f35765e;
    public long f35766f;
    public bf f35767g;
    public bf f35768h;
    public double f35769i;
    public String f35770j;

    public static be[] m34171d() {
        if (f35761a == null) {
            synchronized (C7219h.f35465b) {
                if (f35761a == null) {
                    f35761a = new be[0];
                }
            }
        }
        return f35761a;
    }

    public be() {
        this.f35762b = 0;
        this.f35763c = 0;
        this.f35764d = 0;
        this.f35765e = 0;
        this.f35766f = 0;
        this.f35767g = null;
        this.f35768h = null;
        this.f35769i = 0.0d;
        this.f35770j = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34173a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35762b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35763c);
        }
        if (this.f35767g != null) {
            codedOutputByteBufferNano.m33532b(5, this.f35767g);
        }
        if (this.f35768h != null) {
            codedOutputByteBufferNano.m33532b(6, this.f35768h);
        }
        if ((this.f35762b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f35770j);
        }
        if ((this.f35762b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(9, this.f35764d);
        }
        if ((this.f35762b & 4) != 0) {
            codedOutputByteBufferNano.m33531b(10, this.f35765e);
        }
        if ((this.f35762b & 8) != 0) {
            codedOutputByteBufferNano.m33531b(11, this.f35766f);
        }
        if ((this.f35762b & 16) != 0) {
            codedOutputByteBufferNano.m33516a(12, this.f35769i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34174b() {
        int b = super.b();
        if ((this.f35762b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35763c);
        }
        if (this.f35767g != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f35767g);
        }
        if (this.f35768h != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f35768h);
        }
        if ((this.f35762b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f35770j);
        }
        if ((this.f35762b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(9, this.f35764d);
        }
        if ((this.f35762b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(10, this.f35765e);
        }
        if ((this.f35762b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(11, this.f35766f);
        }
        if ((this.f35762b & 16) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(12) + 8);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.be m34170b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 42: goto L_0x004b;
            case 50: goto L_0x005c;
            case 66: goto L_0x006d;
            case 72: goto L_0x007a;
            case 80: goto L_0x0088;
            case 88: goto L_0x0096;
            case 97: goto L_0x00a4;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f35762b;
        r1 = r1 | 1;
        r6.f35762b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Task";
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
        r6.f35763c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f35762b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f35762b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f35767g;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.wireless.android.a.a.a.a.bf;
        r0.<init>();
        r6.f35767g = r0;
    L_0x0056:
        r0 = r6.f35767g;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x005c:
        r0 = r6.f35768h;
        if (r0 != 0) goto L_0x0067;
    L_0x0060:
        r0 = new com.google.wireless.android.a.a.a.a.bf;
        r0.<init>();
        r6.f35768h = r0;
    L_0x0067:
        r0 = r6.f35768h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x006d:
        r0 = r7.m33564f();
        r6.f35770j = r0;
        r0 = r6.f35762b;
        r0 = r0 | 32;
        r6.f35762b = r0;
        goto L_0x0000;
    L_0x007a:
        r0 = r7.m33559c();
        r6.f35764d = r0;
        r0 = r6.f35762b;
        r0 = r0 | 2;
        r6.f35762b = r0;
        goto L_0x0000;
    L_0x0088:
        r0 = r7.m33559c();
        r6.f35765e = r0;
        r0 = r6.f35762b;
        r0 = r0 | 4;
        r6.f35762b = r0;
        goto L_0x0000;
    L_0x0096:
        r0 = r7.m33559c();
        r6.f35766f = r0;
        r0 = r6.f35762b;
        r0 = r0 | 8;
        r6.f35762b = r0;
        goto L_0x0000;
    L_0x00a4:
        r0 = r7.m33570l();
        r0 = java.lang.Double.longBitsToDouble(r0);
        r6.f35769i = r0;
        r0 = r6.f35762b;
        r0 = r0 | 16;
        r6.f35762b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.be.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.be");
    }

    public final /* synthetic */ i m34172a(C7213a c7213a) {
        return m34170b(c7213a);
    }
}
