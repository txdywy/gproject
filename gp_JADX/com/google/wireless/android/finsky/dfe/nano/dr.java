package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7346b;

public final class dr extends b {
    public int f38679a;
    public int f38680b;
    public C7346b[] f38681c;

    public dr() {
        this.f38679a = 0;
        this.f38680b = 0;
        this.f38681c = C7346b.m34825d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36275a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38679a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38680b);
        }
        if (this.f38681c != null && this.f38681c.length > 0) {
            for (i iVar : this.f38681c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36276b() {
        int b = super.b();
        if ((this.f38679a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38680b);
        }
        if (this.f38681c == null || this.f38681c.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f38681c) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.dr m36273b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x004c;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f38679a;
        r2 = r2 | 1;
        r7.f38679a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r3) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            case 2: goto L_0x0043;
            case 3: goto L_0x0043;
            case 4: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 38;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = " is not a valid enum Status";
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
        r7.f38680b = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r7.f38679a;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3 | 1;
        r7.f38679a = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0001;
    L_0x004c:
        r0 = 18;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38681c;
        if (r0 != 0) goto L_0x0078;
    L_0x0056:
        r0 = r1;
    L_0x0057:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.p493b.C7346b[r2];
        if (r0 == 0) goto L_0x0061;
    L_0x005c:
        r3 = r7.f38681c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0061:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x007c;
    L_0x0066:
        r3 = new com.google.wireless.android.finsky.b.b;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0061;
    L_0x0078:
        r0 = r7.f38681c;
        r0 = r0.length;
        goto L_0x0057;
    L_0x007c:
        r3 = new com.google.wireless.android.finsky.b.b;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f38681c = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.dr.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.dr");
    }

    public final /* synthetic */ i m36274a(C7213a c7213a) {
        return m36273b(c7213a);
    }
}
