package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cp extends b {
    public int f35994a;
    public int f35995b;
    public int f35996c;
    public int f35997d;
    public int f35998e;

    public cp() {
        this.f35994a = 0;
        this.f35995b = 0;
        this.f35996c = 0;
        this.f35997d = 0;
        this.f35998e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34353a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35994a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35995b);
        }
        if ((this.f35994a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35996c);
        }
        if ((this.f35994a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35997d);
        }
        if ((this.f35994a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35998e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34354b() {
        int b = super.b();
        if ((this.f35994a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35995b);
        }
        if ((this.f35994a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35996c);
        }
        if ((this.f35994a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35997d);
        }
        if ((this.f35994a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f35998e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.cp m34351b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0089;
            case 32: goto L_0x0097;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f35994a;
        r1 = r1 | 1;
        r6.f35994a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            case 6: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum PlayerState";
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
        r6.f35995b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f35994a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f35994a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r1 = r6.f35994a;
        r1 = r1 | 2;
        r6.f35994a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0077 }
        switch(r2) {
            case 0: goto L_0x007f;
            case 1: goto L_0x007f;
            default: goto L_0x005c;
        };	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x005c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = " is not a valid enum EntitlementType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x007f:
        r6.f35996c = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r6.f35994a;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2 | 2;
        r6.f35994a = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        goto L_0x0000;
    L_0x0089:
        r0 = r7.m33560d();
        r6.f35997d = r0;
        r0 = r6.f35994a;
        r0 = r0 | 4;
        r6.f35994a = r0;
        goto L_0x0000;
    L_0x0097:
        r0 = r7.m33560d();
        r6.f35998e = r0;
        r0 = r6.f35994a;
        r0 = r0 | 8;
        r6.f35994a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.cp.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.cp");
    }

    public final /* synthetic */ i m34352a(C7213a c7213a) {
        return m34351b(c7213a);
    }
}
