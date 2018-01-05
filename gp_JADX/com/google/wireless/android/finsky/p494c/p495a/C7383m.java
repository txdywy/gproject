package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7383m extends b {
    public int f36891a;
    public boolean f36892b;
    public boolean f36893c;
    public boolean f36894d;
    public long f36895e;
    public C7380j f36896f;
    public int f36897g;
    public C7377g f36898h;
    public C7374d f36899i;
    public C7378h f36900j;
    public C7384n f36901k;

    public C7383m() {
        this.f36891a = 0;
        this.f36892b = false;
        this.f36893c = false;
        this.f36894d = false;
        this.f36895e = 0;
        this.f36896f = null;
        this.f36897g = 0;
        this.f36898h = null;
        this.f36899i = null;
        this.f36900j = null;
        this.f36901k = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34966a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36891a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f36892b);
        }
        if ((this.f36891a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36893c);
        }
        if ((this.f36891a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36894d);
        }
        if ((this.f36891a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f36895e);
        }
        if (this.f36896f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36896f);
        }
        if ((this.f36891a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f36897g);
        }
        if (this.f36898h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36898h);
        }
        if (this.f36899i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f36899i);
        }
        if (this.f36900j != null) {
            codedOutputByteBufferNano.m33532b(9, this.f36900j);
        }
        if (this.f36901k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f36901k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34967b() {
        int b = super.b();
        if ((this.f36891a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f36891a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f36891a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f36891a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f36895e);
        }
        if (this.f36896f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36896f);
        }
        if ((this.f36891a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f36897g);
        }
        if (this.f36898h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36898h);
        }
        if (this.f36899i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f36899i);
        }
        if (this.f36900j != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f36900j);
        }
        if (this.f36901k != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f36901k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p494c.p495a.C7383m m34964b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0035;
            case 42: goto L_0x0042;
            case 48: goto L_0x0053;
            case 58: goto L_0x0092;
            case 66: goto L_0x00a4;
            case 74: goto L_0x00b6;
            case 82: goto L_0x00c8;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33563e();
        r6.f36892b = r0;
        r0 = r6.f36891a;
        r0 = r0 | 1;
        r6.f36891a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33563e();
        r6.f36893c = r0;
        r0 = r6.f36891a;
        r0 = r0 | 2;
        r6.f36891a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m33563e();
        r6.f36894d = r0;
        r0 = r6.f36891a;
        r0 = r0 | 4;
        r6.f36891a = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.m33568j();
        r6.f36895e = r0;
        r0 = r6.f36891a;
        r0 = r0 | 8;
        r6.f36891a = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = r6.f36896f;
        if (r0 != 0) goto L_0x004d;
    L_0x0046:
        r0 = new com.google.wireless.android.finsky.c.a.j;
        r0.<init>();
        r6.f36896f = r0;
    L_0x004d:
        r0 = r6.f36896f;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0053:
        r1 = r6.f36891a;
        r1 = r1 | 16;
        r6.f36891a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x007f }
        switch(r2) {
            case 0: goto L_0x0088;
            case 1: goto L_0x0088;
            case 2: goto L_0x0088;
            default: goto L_0x0064;
        };	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x0064:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007f }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007f }
        r4 = " is not a valid enum PublishStatus";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x007f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x007f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0088:
        r6.f36897g = r2;	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r6.f36891a;	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r2 | 16;
        r6.f36891a = r2;	 Catch:{ IllegalArgumentException -> 0x007f }
        goto L_0x0000;
    L_0x0092:
        r0 = r6.f36898h;
        if (r0 != 0) goto L_0x009d;
    L_0x0096:
        r0 = new com.google.wireless.android.finsky.c.a.g;
        r0.<init>();
        r6.f36898h = r0;
    L_0x009d:
        r0 = r6.f36898h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00a4:
        r0 = r6.f36899i;
        if (r0 != 0) goto L_0x00af;
    L_0x00a8:
        r0 = new com.google.wireless.android.finsky.c.a.d;
        r0.<init>();
        r6.f36899i = r0;
    L_0x00af:
        r0 = r6.f36899i;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00b6:
        r0 = r6.f36900j;
        if (r0 != 0) goto L_0x00c1;
    L_0x00ba:
        r0 = new com.google.wireless.android.finsky.c.a.h;
        r0.<init>();
        r6.f36900j = r0;
    L_0x00c1:
        r0 = r6.f36900j;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00c8:
        r0 = r6.f36901k;
        if (r0 != 0) goto L_0x00d3;
    L_0x00cc:
        r0 = new com.google.wireless.android.finsky.c.a.n;
        r0.<init>();
        r6.f36901k = r0;
    L_0x00d3:
        r0 = r6.f36901k;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.c.a.m.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.c.a.m");
    }

    public final /* synthetic */ i m34965a(C7213a c7213a) {
        return m34964b(c7213a);
    }
}
