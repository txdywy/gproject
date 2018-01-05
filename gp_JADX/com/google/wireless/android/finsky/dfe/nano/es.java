package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class es extends b {
    public int f38835a;
    public int f38836b;
    public eu f38837c;

    public es() {
        this.f38835a = 0;
        this.f38836b = 0;
        this.f38837c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36362a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38835a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38836b);
        }
        if (this.f38837c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38837c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36363b() {
        int b = super.b();
        if ((this.f38835a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38836b);
        }
        if (this.f38837c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f38837c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.es m36360b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f38835a;
        r1 = r1 | 1;
        r6.f38835a = r1;
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
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum ErrorType";
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
        r6.f38836b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38835a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38835a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f38837c;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.wireless.android.finsky.dfe.nano.eu;
        r0.<init>();
        r6.f38837c = r0;
    L_0x0056:
        r0 = r6.f38837c;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.es.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.es");
    }

    public final /* synthetic */ i m36361a(C7213a c7213a) {
        return m36360b(c7213a);
    }
}
