package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cm extends b {
    public int f38580a;
    public int f38581b;
    public long[] f38582c;
    public long[] f38583d;

    public cm() {
        this.f38580a = 0;
        this.f38581b = 0;
        this.f38582c = C7222l.f35473f;
        this.f38583d = C7222l.f35473f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36173a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        int i2 = 0;
        if ((this.f38580a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38581b);
        }
        if (this.f38582c != null && this.f38582c.length > 0) {
            i = 0;
            for (long c : this.f38582c) {
                i += CodedOutputByteBufferNano.m33500c(c);
            }
            codedOutputByteBufferNano.m33539e(18);
            codedOutputByteBufferNano.m33539e(i);
            for (long b : this.f38582c) {
                codedOutputByteBufferNano.m33533b(b);
            }
        }
        if (this.f38583d != null && this.f38583d.length > 0) {
            i = 0;
            for (long c2 : this.f38583d) {
                i += CodedOutputByteBufferNano.m33500c(c2);
            }
            codedOutputByteBufferNano.m33539e(26);
            codedOutputByteBufferNano.m33539e(i);
            while (i2 < this.f38583d.length) {
                codedOutputByteBufferNano.m33533b(this.f38583d[i2]);
                i2++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36174b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f38580a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38581b);
        }
        if (this.f38582c != null && this.f38582c.length > 0) {
            int i3 = 0;
            for (long c : this.f38582c) {
                i3 += CodedOutputByteBufferNano.m33500c(c);
            }
            b = ((b + i3) + 1) + CodedOutputByteBufferNano.m33507f(i3);
        }
        if (this.f38583d == null || this.f38583d.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f38583d.length) {
            i += CodedOutputByteBufferNano.m33500c(this.f38583d[i2]);
            i2++;
        }
        return ((b + i) + 1) + CodedOutputByteBufferNano.m33507f(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.cm m36171b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x004c;
            case 18: goto L_0x007f;
            case 24: goto L_0x00c1;
            case 26: goto L_0x00f5;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f38580a;
        r2 = r2 | 1;
        r7.f38580a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r3) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 44;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = " is not a valid enum EncodingType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0043:
        r7.f38581b = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r7.f38580a;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3 | 1;
        r7.f38580a = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0001;
    L_0x004c:
        r0 = 16;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38582c;
        if (r0 != 0) goto L_0x0072;
    L_0x0056:
        r0 = r1;
    L_0x0057:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x0061;
    L_0x005c:
        r3 = r7.f38582c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0061:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0076;
    L_0x0066:
        r4 = r8.m33559c();
        r2[r0] = r4;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0061;
    L_0x0072:
        r0 = r7.f38582c;
        r0 = r0.length;
        goto L_0x0057;
    L_0x0076:
        r4 = r8.m33559c();
        r2[r0] = r4;
        r7.f38582c = r2;
        goto L_0x0001;
    L_0x007f:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x008c:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x0098;
    L_0x0092:
        r8.m33559c();
        r0 = r0 + 1;
        goto L_0x008c;
    L_0x0098:
        r8.m33562e(r2);
        r2 = r7.f38582c;
        if (r2 != 0) goto L_0x00b6;
    L_0x009f:
        r2 = r1;
    L_0x00a0:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x00aa;
    L_0x00a5:
        r4 = r7.f38582c;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00aa:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00ba;
    L_0x00ad:
        r4 = r8.m33559c();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00aa;
    L_0x00b6:
        r2 = r7.f38582c;
        r2 = r2.length;
        goto L_0x00a0;
    L_0x00ba:
        r7.f38582c = r0;
        r8.m33561d(r3);
        goto L_0x0001;
    L_0x00c1:
        r0 = 24;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38583d;
        if (r0 != 0) goto L_0x00e7;
    L_0x00cb:
        r0 = r1;
    L_0x00cc:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x00d6;
    L_0x00d1:
        r3 = r7.f38583d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00d6:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00eb;
    L_0x00db:
        r4 = r8.m33559c();
        r2[r0] = r4;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x00d6;
    L_0x00e7:
        r0 = r7.f38583d;
        r0 = r0.length;
        goto L_0x00cc;
    L_0x00eb:
        r4 = r8.m33559c();
        r2[r0] = r4;
        r7.f38583d = r2;
        goto L_0x0001;
    L_0x00f5:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x0102:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x010e;
    L_0x0108:
        r8.m33559c();
        r0 = r0 + 1;
        goto L_0x0102;
    L_0x010e:
        r8.m33562e(r2);
        r2 = r7.f38583d;
        if (r2 != 0) goto L_0x012c;
    L_0x0115:
        r2 = r1;
    L_0x0116:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x0120;
    L_0x011b:
        r4 = r7.f38583d;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0120:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x0130;
    L_0x0123:
        r4 = r8.m33559c();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x0120;
    L_0x012c:
        r2 = r7.f38583d;
        r2 = r2.length;
        goto L_0x0116;
    L_0x0130:
        r7.f38583d = r0;
        r8.m33561d(r3);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.cm.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.cm");
    }

    public final /* synthetic */ i m36172a(C7213a c7213a) {
        return m36171b(c7213a);
    }
}
