package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cr extends b {
    public int f37340a;
    public int f37341b;
    public byte[] f37342c;
    public int f37343d;
    public boolean f37344e;
    public int f37345f;
    public int f37346g;
    public int[] f37347h;

    public final boolean m35310d() {
        return (this.f37340a & 1) != 0;
    }

    public final cr m35307a(int i) {
        this.f37340a |= 1;
        this.f37341b = i;
        return this;
    }

    public cr() {
        this.f37340a = 0;
        this.f37341b = 0;
        this.f37342c = C7222l.f35479l;
        this.f37343d = 0;
        this.f37344e = false;
        this.f37345f = 0;
        this.f37346g = 0;
        this.f37347h = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35308a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37340a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37341b);
        }
        if ((this.f37340a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f37342c);
        }
        if ((this.f37340a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37343d);
        }
        if ((this.f37340a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f37344e);
        }
        if ((this.f37340a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37345f);
        }
        if ((this.f37340a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37346g);
        }
        if (this.f37347h != null && this.f37347h.length > 0) {
            for (int a : this.f37347h) {
                codedOutputByteBufferNano.m33518a(7, a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35309b() {
        int i = 0;
        int b = super.b();
        if ((this.f37340a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37341b);
        }
        if ((this.f37340a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f37342c);
        }
        if ((this.f37340a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37343d);
        }
        if ((this.f37340a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f37340a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37345f);
        }
        if ((this.f37340a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37346g);
        }
        if (this.f37347h == null || this.f37347h.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f37347h.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f37347h[i]);
            i++;
        }
        return (b + i2) + (this.f37347h.length * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.cr m35305b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x001c;
            case 24: goto L_0x0029;
            case 32: goto L_0x0036;
            case 40: goto L_0x0043;
            case 48: goto L_0x0080;
            case 56: goto L_0x008e;
            case 58: goto L_0x00c2;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.m33567i();
        r7.f37341b = r0;
        r0 = r7.f37340a;
        r0 = r0 | 1;
        r7.f37340a = r0;
        goto L_0x0001;
    L_0x001c:
        r0 = r8.m33565g();
        r7.f37342c = r0;
        r0 = r7.f37340a;
        r0 = r0 | 2;
        r7.f37340a = r0;
        goto L_0x0001;
    L_0x0029:
        r0 = r8.m33567i();
        r7.f37343d = r0;
        r0 = r7.f37340a;
        r0 = r0 | 4;
        r7.f37340a = r0;
        goto L_0x0001;
    L_0x0036:
        r0 = r8.m33563e();
        r7.f37344e = r0;
        r0 = r7.f37340a;
        r0 = r0 | 8;
        r7.f37340a = r0;
        goto L_0x0001;
    L_0x0043:
        r2 = r7.f37340a;
        r2 = r2 | 16;
        r7.f37340a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x006f }
        switch(r3) {
            case 0: goto L_0x0077;
            case 1: goto L_0x0077;
            case 2: goto L_0x0077;
            case 3: goto L_0x0077;
            default: goto L_0x0054;
        };	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x0054:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006f }
        r5 = 41;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006f }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x006f }
        r5 = " is not a valid enum EventType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x006f }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x006f }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0077:
        r7.f37345f = r3;	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = r7.f37340a;	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = r3 | 16;
        r7.f37340a = r3;	 Catch:{ IllegalArgumentException -> 0x006f }
        goto L_0x0001;
    L_0x0080:
        r0 = r8.m33560d();
        r7.f37346g = r0;
        r0 = r7.f37340a;
        r0 = r0 | 32;
        r7.f37340a = r0;
        goto L_0x0001;
    L_0x008e:
        r0 = 56;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f37347h;
        if (r0 != 0) goto L_0x00b4;
    L_0x0098:
        r0 = r1;
    L_0x0099:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x00a3;
    L_0x009e:
        r3 = r7.f37347h;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00a3:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00b8;
    L_0x00a8:
        r3 = r8.m33560d();
        r2[r0] = r3;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x00a3;
    L_0x00b4:
        r0 = r7.f37347h;
        r0 = r0.length;
        goto L_0x0099;
    L_0x00b8:
        r3 = r8.m33560d();
        r2[r0] = r3;
        r7.f37347h = r2;
        goto L_0x0001;
    L_0x00c2:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x00cf:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x00db;
    L_0x00d5:
        r8.m33560d();
        r0 = r0 + 1;
        goto L_0x00cf;
    L_0x00db:
        r8.m33562e(r2);
        r2 = r7.f37347h;
        if (r2 != 0) goto L_0x00f9;
    L_0x00e2:
        r2 = r1;
    L_0x00e3:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00ed;
    L_0x00e8:
        r4 = r7.f37347h;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00ed:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00fd;
    L_0x00f0:
        r4 = r8.m33560d();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00ed;
    L_0x00f9:
        r2 = r7.f37347h;
        r2 = r2.length;
        goto L_0x00e3;
    L_0x00fd:
        r7.f37347h = r0;
        r8.m33561d(r3);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.cr.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.cr");
    }

    public final /* synthetic */ i m35306a(C7213a c7213a) {
        return m35305b(c7213a);
    }
}
