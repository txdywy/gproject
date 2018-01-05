package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bu extends b {
    public int f37248a;
    public int f37249b;
    public int f37250c;
    public int f37251d;

    public final bu m35223a(int i) {
        this.f37249b = i;
        this.f37248a |= 1;
        return this;
    }

    public bu() {
        this.f37248a = 0;
        this.f37249b = 0;
        this.f37250c = 0;
        this.f37251d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35224a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37248a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37249b);
        }
        if ((this.f37248a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37250c);
        }
        if ((this.f37248a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37251d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35225b() {
        int b = super.b();
        if ((this.f37248a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37249b);
        }
        if ((this.f37248a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37250c);
        }
        if ((this.f37248a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f37251d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.bu m35221b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f37248a;
        r1 = r1 | 1;
        r6.f37248a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Id";
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
        r6.f37249b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f37248a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f37248a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33560d();
        r6.f37250c = r0;
        r0 = r6.f37248a;
        r0 = r0 | 2;
        r6.f37248a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33560d();
        r6.f37251d = r0;
        r0 = r6.f37248a;
        r0 = r0 | 4;
        r6.f37248a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.bu.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.bu");
    }

    public final /* synthetic */ i m35222a(C7213a c7213a) {
        return m35221b(c7213a);
    }
}
