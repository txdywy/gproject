package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cd extends b {
    public int f35921a;
    public int f35922b;
    public long f35923c;
    public int f35924d;
    public int f35925e;

    public cd() {
        this.f35921a = 0;
        this.f35922b = 0;
        this.f35923c = 0;
        this.f35924d = 0;
        this.f35925e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34283a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35921a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35922b);
        }
        if ((this.f35921a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35923c);
        }
        if ((this.f35921a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35924d);
        }
        if ((this.f35921a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35925e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34284b() {
        int b = super.b();
        if ((this.f35921a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35922b);
        }
        if ((this.f35921a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f35923c);
        }
        if ((this.f35921a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35924d);
        }
        if ((this.f35921a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f35925e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.cd m34281b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0058;
            case 32: goto L_0x0065;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f35921a;
        r1 = r1 | 1;
        r6.f35921a = r1;
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
        r4 = " is not a valid enum Type";
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
        r6.f35922b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f35921a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f35921a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33559c();
        r6.f35923c = r0;
        r0 = r6.f35921a;
        r0 = r0 | 2;
        r6.f35921a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33560d();
        r6.f35924d = r0;
        r0 = r6.f35921a;
        r0 = r0 | 4;
        r6.f35921a = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.m33560d();
        r6.f35925e = r0;
        r0 = r6.f35921a;
        r0 = r0 | 8;
        r6.f35921a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.cd.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.cd");
    }

    public final /* synthetic */ i m34282a(C7213a c7213a) {
        return m34281b(c7213a);
    }
}
