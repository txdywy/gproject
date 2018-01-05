package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ec extends b {
    public int f37533a;
    public int f37534b;
    public int f37535c;
    public byte[] f37536d;
    public ed[] f37537e;

    public ec() {
        this.f37533a = 0;
        this.f37534b = 0;
        this.f37535c = 0;
        this.f37536d = C7222l.f35479l;
        this.f37537e = ed.m35441d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35439a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37533a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37534b);
        }
        if ((this.f37533a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37535c);
        }
        if ((this.f37533a & 4) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f37536d);
        }
        if (this.f37537e != null && this.f37537e.length > 0) {
            for (i iVar : this.f37537e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35440b() {
        int b = super.b();
        if ((this.f37533a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37534b);
        }
        if ((this.f37533a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37535c);
        }
        if ((this.f37533a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f37536d);
        }
        if (this.f37537e == null || this.f37537e.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f37537e) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(4, iVar);
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.ec m35437b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x004c;
            case 26: goto L_0x006f;
            case 34: goto L_0x007c;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f37533a;
        r2 = r2 | 1;
        r7.f37533a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r3) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = " is not a valid enum ResultCode";
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
        r7.f37534b = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r7.f37533a;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3 | 1;
        r7.f37533a = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0001;
    L_0x004c:
        r2 = r7.f37533a;
        r2 = r2 | 2;
        r7.f37533a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x0067 }
        r3 = com.google.wireless.android.finsky.dfe.p505c.p506a.dp.m35391a(r3);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r7.f37535c = r3;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r3 = r7.f37533a;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r3 = r3 | 2;
        r7.f37533a = r3;	 Catch:{ IllegalArgumentException -> 0x0067 }
        goto L_0x0001;
    L_0x0067:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x006f:
        r0 = r8.m33565g();
        r7.f37536d = r0;
        r0 = r7.f37533a;
        r0 = r0 | 4;
        r7.f37533a = r0;
        goto L_0x0001;
    L_0x007c:
        r0 = 34;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f37537e;
        if (r0 != 0) goto L_0x00a8;
    L_0x0086:
        r0 = r1;
    L_0x0087:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.p505c.p506a.ed[r2];
        if (r0 == 0) goto L_0x0091;
    L_0x008c:
        r3 = r7.f37537e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0091:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00ac;
    L_0x0096:
        r3 = new com.google.wireless.android.finsky.dfe.c.a.ed;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0091;
    L_0x00a8:
        r0 = r7.f37537e;
        r0 = r0.length;
        goto L_0x0087;
    L_0x00ac:
        r3 = new com.google.wireless.android.finsky.dfe.c.a.ed;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f37537e = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.ec.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.ec");
    }

    public final /* synthetic */ i m35438a(C7213a c7213a) {
        return m35437b(c7213a);
    }
}
