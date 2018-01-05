package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class ax extends b {
    public int f38401a;
    public C7367w f38402b;
    public int f38403c;

    public ax() {
        this.f38401a = 0;
        this.f38402b = null;
        this.f38403c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36045a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38402b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38402b);
        }
        if ((this.f38401a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38403c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36046b() {
        int b = super.b();
        if (this.f38402b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38402b);
        }
        if ((this.f38401a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38403c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.ax m36043b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f38402b;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.wireless.android.finsky.b.w;
        r0.<init>();
        r6.f38402b = r0;
    L_0x0019:
        r0 = r6.f38402b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r1 = r6.f38401a;
        r1 = r1 | 1;
        r6.f38401a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x004b }
        switch(r2) {
            case 0: goto L_0x0053;
            case 1: goto L_0x0053;
            case 2: goto L_0x0053;
            case 3: goto L_0x0053;
            default: goto L_0x0030;
        };	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x0030:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004b }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r4 = " is not a valid enum ResponseCode";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x004b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0053:
        r6.f38403c = r2;	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r6.f38401a;	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r2 | 1;
        r6.f38401a = r2;	 Catch:{ IllegalArgumentException -> 0x004b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.ax.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.ax");
    }

    public final /* synthetic */ i m36044a(C7213a c7213a) {
        return m36043b(c7213a);
    }
}
