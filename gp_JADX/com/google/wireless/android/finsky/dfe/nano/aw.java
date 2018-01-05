package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aw extends b {
    public int f38398a;
    public C7544t[] f38399b;
    public int f38400c;

    public aw() {
        this.f38398a = 0;
        this.f38399b = C7544t.m36582d();
        this.f38400c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36041a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38399b != null && this.f38399b.length > 0) {
            for (i iVar : this.f38399b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38398a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38400c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36042b() {
        int b = super.b();
        if (this.f38399b != null && this.f38399b.length > 0) {
            for (i iVar : this.f38399b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38398a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f38400c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.aw m36039b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 32: goto L_0x004e;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = 10;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38399b;
        if (r0 != 0) goto L_0x003b;
    L_0x0019:
        r0 = r1;
    L_0x001a:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.nano.C7544t[r2];
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r3 = r7.f38399b;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0024:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x003f;
    L_0x0029:
        r3 = new com.google.wireless.android.finsky.dfe.nano.t;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x003b:
        r0 = r7.f38399b;
        r0 = r0.length;
        goto L_0x001a;
    L_0x003f:
        r3 = new com.google.wireless.android.finsky.dfe.nano.t;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f38399b = r2;
        goto L_0x0001;
    L_0x004e:
        r2 = r7.f38398a;
        r2 = r2 | 1;
        r7.f38398a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x007a }
        switch(r3) {
            case 0: goto L_0x0082;
            case 1: goto L_0x0082;
            case 2: goto L_0x005f;
            case 3: goto L_0x0082;
            default: goto L_0x005f;
        };	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x005f:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007a }
        r5 = 51;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007a }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        r5 = " is not a valid enum FopPromoOfferStatus";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x007a }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0082:
        r7.f38400c = r3;	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r7.f38398a;	 Catch:{ IllegalArgumentException -> 0x007a }
        r3 = r3 | 1;
        r7.f38398a = r3;	 Catch:{ IllegalArgumentException -> 0x007a }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.aw.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.aw");
    }

    public final /* synthetic */ i m36040a(C7213a c7213a) {
        return m36039b(c7213a);
    }
}
