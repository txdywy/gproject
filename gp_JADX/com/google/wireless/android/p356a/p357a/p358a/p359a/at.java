package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class at extends b {
    public int f35660a;
    public int f35661b;
    public int f35662c;
    public int f35663d;
    public int f35664e;
    public int f35665f;
    public long f35666g;
    public String f35667h;

    public at() {
        this.f35660a = 0;
        this.f35661b = 0;
        this.f35662c = 0;
        this.f35663d = 0;
        this.f35664e = 0;
        this.f35665f = 0;
        this.f35666g = 0;
        this.f35667h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35660a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35661b);
        }
        if ((this.f35660a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35662c);
        }
        if ((this.f35660a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35663d);
        }
        if ((this.f35660a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35664e);
        }
        if ((this.f35660a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35665f);
        }
        if ((this.f35660a & 32) != 0) {
            codedOutputByteBufferNano.m33531b(6, this.f35666g);
        }
        if ((this.f35660a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f35667h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34128b() {
        int b = super.b();
        if ((this.f35660a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35661b);
        }
        if ((this.f35660a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35662c);
        }
        if ((this.f35660a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35663d);
        }
        if ((this.f35660a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35664e);
        }
        if ((this.f35660a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f35665f);
        }
        if ((this.f35660a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f35666g);
        }
        if ((this.f35660a & 64) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f35667h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.at m34125b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0089;
            case 32: goto L_0x00c8;
            case 40: goto L_0x00d6;
            case 48: goto L_0x00e4;
            case 58: goto L_0x00f2;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f35660a;
        r1 = r1 | 1;
        r6.f35660a = r1;
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
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum VideoState";
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
        r6.f35661b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f35660a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f35660a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r1 = r6.f35660a;
        r1 = r1 | 2;
        r6.f35660a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0077 }
        switch(r2) {
            case 0: goto L_0x007f;
            case 1: goto L_0x007f;
            default: goto L_0x005c;
        };	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x005c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = " is not a valid enum VideoStartReason";
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
        r6.f35662c = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r6.f35660a;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2 | 2;
        r6.f35660a = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        goto L_0x0000;
    L_0x0089:
        r1 = r6.f35660a;
        r1 = r1 | 4;
        r6.f35660a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x00b5 }
        switch(r2) {
            case 0: goto L_0x00be;
            case 1: goto L_0x00be;
            case 2: goto L_0x00be;
            case 3: goto L_0x00be;
            case 4: goto L_0x00be;
            case 5: goto L_0x00be;
            case 6: goto L_0x00be;
            case 7: goto L_0x00be;
            default: goto L_0x009a;
        };	 Catch:{ IllegalArgumentException -> 0x00b5 }
    L_0x009a:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r4 = " is not a valid enum VideoStopReason";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00b5 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00b5 }
    L_0x00b5:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00be:
        r6.f35663d = r2;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r2 = r6.f35660a;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r2 = r2 | 4;
        r6.f35660a = r2;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        goto L_0x0000;
    L_0x00c8:
        r0 = r7.m33560d();
        r6.f35664e = r0;
        r0 = r6.f35660a;
        r0 = r0 | 8;
        r6.f35660a = r0;
        goto L_0x0000;
    L_0x00d6:
        r0 = r7.m33560d();
        r6.f35665f = r0;
        r0 = r6.f35660a;
        r0 = r0 | 16;
        r6.f35660a = r0;
        goto L_0x0000;
    L_0x00e4:
        r0 = r7.m33559c();
        r6.f35666g = r0;
        r0 = r6.f35660a;
        r0 = r0 | 32;
        r6.f35660a = r0;
        goto L_0x0000;
    L_0x00f2:
        r0 = r7.m33564f();
        r6.f35667h = r0;
        r0 = r6.f35660a;
        r0 = r0 | 64;
        r6.f35660a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.at.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.at");
    }

    public final /* synthetic */ i m34126a(C7213a c7213a) {
        return m34125b(c7213a);
    }
}
