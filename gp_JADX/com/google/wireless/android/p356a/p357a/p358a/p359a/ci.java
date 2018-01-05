package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ci extends b {
    public int f35951a;
    public long f35952b;
    public int f35953c;
    public int[] f35954d;
    public boolean f35955e;

    public ci() {
        this.f35951a = 0;
        this.f35952b = 0;
        this.f35953c = 0;
        this.f35954d = C7222l.f35472e;
        this.f35955e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34309a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35951a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35952b);
        }
        if ((this.f35951a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35953c);
        }
        if (this.f35954d != null && this.f35954d.length > 0) {
            for (int a : this.f35954d) {
                codedOutputByteBufferNano.m33518a(3, a);
            }
        }
        if ((this.f35951a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f35955e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34310b() {
        int i = 0;
        int b = super.b();
        if ((this.f35951a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35952b);
        }
        if ((this.f35951a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35953c);
        }
        if (this.f35954d != null && this.f35954d.length > 0) {
            int i2 = 0;
            while (i < this.f35954d.length) {
                i2 += CodedOutputByteBufferNano.m33498c(this.f35954d[i]);
                i++;
            }
            b = (b + i2) + (this.f35954d.length * 1);
        }
        if ((this.f35951a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.ci m34307b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x001c;
            case 24: goto L_0x0059;
            case 26: goto L_0x008d;
            case 32: goto L_0x00cf;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.m33568j();
        r7.f35952b = r2;
        r0 = r7.f35951a;
        r0 = r0 | 1;
        r7.f35951a = r0;
        goto L_0x0001;
    L_0x001c:
        r2 = r7.f35951a;
        r2 = r2 | 2;
        r7.f35951a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0048 }
        switch(r3) {
            case 0: goto L_0x0050;
            case 1: goto L_0x0050;
            case 2: goto L_0x0050;
            default: goto L_0x002d;
        };	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x002d:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r5 = 46;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r5 = " is not a valid enum ExperienceType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0048 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0048 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0050:
        r7.f35953c = r3;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r3 = r7.f35951a;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r3 = r3 | 2;
        r7.f35951a = r3;	 Catch:{ IllegalArgumentException -> 0x0048 }
        goto L_0x0001;
    L_0x0059:
        r0 = 24;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f35954d;
        if (r0 != 0) goto L_0x007f;
    L_0x0063:
        r0 = r1;
    L_0x0064:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x006e;
    L_0x0069:
        r3 = r7.f35954d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x006e:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0083;
    L_0x0073:
        r3 = r8.m33560d();
        r2[r0] = r3;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x006e;
    L_0x007f:
        r0 = r7.f35954d;
        r0 = r0.length;
        goto L_0x0064;
    L_0x0083:
        r3 = r8.m33560d();
        r2[r0] = r3;
        r7.f35954d = r2;
        goto L_0x0001;
    L_0x008d:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x009a:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x00a6;
    L_0x00a0:
        r8.m33560d();
        r0 = r0 + 1;
        goto L_0x009a;
    L_0x00a6:
        r8.m33562e(r2);
        r2 = r7.f35954d;
        if (r2 != 0) goto L_0x00c4;
    L_0x00ad:
        r2 = r1;
    L_0x00ae:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00b8;
    L_0x00b3:
        r4 = r7.f35954d;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00b8:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00c8;
    L_0x00bb:
        r4 = r8.m33560d();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00b8;
    L_0x00c4:
        r2 = r7.f35954d;
        r2 = r2.length;
        goto L_0x00ae;
    L_0x00c8:
        r7.f35954d = r0;
        r8.m33561d(r3);
        goto L_0x0001;
    L_0x00cf:
        r0 = r8.m33563e();
        r7.f35955e = r0;
        r0 = r7.f35951a;
        r0 = r0 | 4;
        r7.f35951a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.ci.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.ci");
    }

    public final /* synthetic */ i m34308a(C7213a c7213a) {
        return m34307b(c7213a);
    }
}
