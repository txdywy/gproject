package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ai extends b {
    public int f36352a;
    public int f36353b;
    public String f36354c;
    public String f36355d;
    public int f36356e;
    public int f36357f;
    public al[] f36358g;

    public ai() {
        this.f36352a = 0;
        this.f36353b = 0;
        this.f36354c = "";
        this.f36355d = "";
        this.f36356e = 0;
        this.f36357f = 0;
        this.f36358g = al.m34639d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34628a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36352a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36353b);
        }
        if ((this.f36352a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36354c);
        }
        if ((this.f36352a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36355d);
        }
        if ((this.f36352a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f36356e);
        }
        if ((this.f36352a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f36357f);
        }
        if (this.f36358g != null && this.f36358g.length > 0) {
            for (i iVar : this.f36358g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34629b() {
        int b = super.b();
        if ((this.f36352a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36353b);
        }
        if ((this.f36352a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36354c);
        }
        if ((this.f36352a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36355d);
        }
        if ((this.f36352a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f36356e);
        }
        if ((this.f36352a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f36357f);
        }
        if (this.f36358g == null || this.f36358g.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36358g) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(6, iVar);
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.ai m34626b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x004c;
            case 26: goto L_0x0059;
            case 32: goto L_0x0066;
            case 40: goto L_0x0073;
            case 50: goto L_0x0080;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f36352a;
        r2 = r2 | 1;
        r7.f36352a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r3) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            case 2: goto L_0x0043;
            case 3: goto L_0x0043;
            case 4: goto L_0x0043;
            case 5: goto L_0x0043;
            case 6: goto L_0x0043;
            case 7: goto L_0x0043;
            case 10: goto L_0x0043;
            case 27: goto L_0x0043;
            case 35: goto L_0x0043;
            case 36: goto L_0x0043;
            case 38: goto L_0x0043;
            case 39: goto L_0x0043;
            case 40: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 46;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = " is not a valid enum CreditCardType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0043:
        r7.f36353b = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r7.f36352a;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3 | 1;
        r7.f36352a = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0001;
    L_0x004c:
        r0 = r8.m33564f();
        r7.f36354c = r0;
        r0 = r7.f36352a;
        r0 = r0 | 2;
        r7.f36352a = r0;
        goto L_0x0001;
    L_0x0059:
        r0 = r8.m33564f();
        r7.f36355d = r0;
        r0 = r7.f36352a;
        r0 = r0 | 4;
        r7.f36352a = r0;
        goto L_0x0001;
    L_0x0066:
        r0 = r8.m33560d();
        r7.f36356e = r0;
        r0 = r7.f36352a;
        r0 = r0 | 8;
        r7.f36352a = r0;
        goto L_0x0001;
    L_0x0073:
        r0 = r8.m33560d();
        r7.f36357f = r0;
        r0 = r7.f36352a;
        r0 = r0 | 16;
        r7.f36352a = r0;
        goto L_0x0001;
    L_0x0080:
        r0 = 50;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f36358g;
        if (r0 != 0) goto L_0x00ac;
    L_0x008a:
        r0 = r1;
    L_0x008b:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.p491a.p492a.al[r2];
        if (r0 == 0) goto L_0x0095;
    L_0x0090:
        r3 = r7.f36358g;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0095:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00b0;
    L_0x009a:
        r3 = new com.google.wireless.android.finsky.a.a.al;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0095;
    L_0x00ac:
        r0 = r7.f36358g;
        r0 = r0.length;
        goto L_0x008b;
    L_0x00b0:
        r3 = new com.google.wireless.android.finsky.a.a.al;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f36358g = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.ai.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.ai");
    }

    public final /* synthetic */ i m34627a(C7213a c7213a) {
        return m34626b(c7213a);
    }
}
