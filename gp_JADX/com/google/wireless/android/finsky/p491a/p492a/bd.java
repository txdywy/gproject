package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bd extends b {
    public int f36457a;
    public int f36458b;
    public String f36459c;
    public be f36460d;

    public bd() {
        this.f36457a = 0;
        this.f36458b = 0;
        this.f36459c = "";
        this.f36460d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34701a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36457a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36458b);
        }
        if ((this.f36457a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36459c);
        }
        if (this.f36460d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36460d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34702b() {
        int b = super.b();
        if ((this.f36457a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36458b);
        }
        if ((this.f36457a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36459c);
        }
        if (this.f36460d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f36460d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.bd m34699b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36457a;
        r1 = r1 | 1;
        r6.f36457a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Result";
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
        r6.f36458b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36457a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36457a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f36459c = r0;
        r0 = r6.f36457a;
        r0 = r0 | 2;
        r6.f36457a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r6.f36460d;
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new com.google.wireless.android.finsky.a.a.be;
        r0.<init>();
        r6.f36460d = r0;
    L_0x0063:
        r0 = r6.f36460d;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.bd.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.bd");
    }

    public final /* synthetic */ i m34700a(C7213a c7213a) {
        return m34699b(c7213a);
    }
}
