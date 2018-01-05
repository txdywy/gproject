package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ba extends b {
    public int f35722a;
    public int f35723b;
    public int f35724c;
    public int f35725d;
    public String f35726e;
    public boolean f35727f;
    public boolean f35728g;
    public boolean f35729h;
    public boolean f35730i;
    public int f35731j;

    public ba() {
        this.f35722a = 0;
        this.f35723b = 0;
        this.f35724c = 0;
        this.f35725d = 0;
        this.f35726e = "";
        this.f35727f = false;
        this.f35728g = false;
        this.f35729h = false;
        this.f35730i = false;
        this.f35731j = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34157a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35722a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35723b);
        }
        if ((this.f35722a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35724c);
        }
        if ((this.f35722a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35725d);
        }
        if ((this.f35722a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f35726e);
        }
        if ((this.f35722a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f35727f);
        }
        if ((this.f35722a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f35728g);
        }
        if ((this.f35722a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f35729h);
        }
        if ((this.f35722a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f35730i);
        }
        if ((this.f35722a & 256) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35731j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34158b() {
        int b = super.b();
        if ((this.f35722a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35723b);
        }
        if ((this.f35722a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35724c);
        }
        if ((this.f35722a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35725d);
        }
        if ((this.f35722a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f35726e);
        }
        if ((this.f35722a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f35722a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f35722a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if ((this.f35722a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f35722a & 256) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(9, this.f35731j);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.ba m34155b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0058;
            case 34: goto L_0x0065;
            case 40: goto L_0x0072;
            case 48: goto L_0x007f;
            case 56: goto L_0x008d;
            case 64: goto L_0x009b;
            case 72: goto L_0x00a9;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f35722a;
        r1 = r1 | 1;
        r6.f35722a = r1;
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
            case 7: goto L_0x0042;
            case 8: goto L_0x0042;
            case 9: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum RepairStatus";
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
        r6.f35723b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f35722a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f35722a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33560d();
        r6.f35724c = r0;
        r0 = r6.f35722a;
        r0 = r0 | 2;
        r6.f35722a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33560d();
        r6.f35725d = r0;
        r0 = r6.f35722a;
        r0 = r0 | 4;
        r6.f35722a = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.m33564f();
        r6.f35726e = r0;
        r0 = r6.f35722a;
        r0 = r0 | 8;
        r6.f35722a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33563e();
        r6.f35727f = r0;
        r0 = r6.f35722a;
        r0 = r0 | 16;
        r6.f35722a = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r7.m33563e();
        r6.f35728g = r0;
        r0 = r6.f35722a;
        r0 = r0 | 32;
        r6.f35722a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r7.m33563e();
        r6.f35729h = r0;
        r0 = r6.f35722a;
        r0 = r0 | 64;
        r6.f35722a = r0;
        goto L_0x0000;
    L_0x009b:
        r0 = r7.m33563e();
        r6.f35730i = r0;
        r0 = r6.f35722a;
        r0 = r0 | 128;
        r6.f35722a = r0;
        goto L_0x0000;
    L_0x00a9:
        r0 = r7.m33560d();
        r6.f35731j = r0;
        r0 = r6.f35722a;
        r0 = r0 | 256;
        r6.f35722a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.ba.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.ba");
    }

    public final /* synthetic */ i m34156a(C7213a c7213a) {
        return m34155b(c7213a);
    }
}
