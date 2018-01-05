package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7433w extends b {
    public static volatile C7433w[] f37700a;
    public int f37701b;
    public ax f37702c;
    public int f37703d;
    public String f37704e;
    public int f37705f;
    public int f37706g;
    public boolean f37707h;
    public boolean f37708i;
    public String f37709j;

    public static C7433w[] m35517d() {
        if (f37700a == null) {
            synchronized (C7219h.f35465b) {
                if (f37700a == null) {
                    f37700a = new C7433w[0];
                }
            }
        }
        return f37700a;
    }

    public final boolean m35523e() {
        return (this.f37701b & 1) != 0;
    }

    public final boolean m35524f() {
        return (this.f37701b & 2) != 0;
    }

    public final C7433w m35519a(int i) {
        this.f37705f = i;
        this.f37701b |= 4;
        return this;
    }

    public final C7433w m35522b(int i) {
        this.f37706g = i;
        this.f37701b |= 8;
        return this;
    }

    public C7433w() {
        this.f37701b = 0;
        this.f37702c = null;
        this.f37703d = 1;
        this.f37704e = "";
        this.f37705f = 0;
        this.f37706g = 0;
        this.f37707h = false;
        this.f37708i = false;
        this.f37709j = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35520a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37702c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37702c);
        }
        if ((this.f37701b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37703d);
        }
        if ((this.f37701b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37704e);
        }
        if ((this.f37701b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37705f);
        }
        if ((this.f37701b & 8) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37706g);
        }
        if ((this.f37701b & 16) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f37707h);
        }
        if ((this.f37701b & 32) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f37708i);
        }
        if ((this.f37701b & 64) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f37709j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35521b() {
        int b = super.b();
        if (this.f37702c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37702c);
        }
        if ((this.f37701b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37703d);
        }
        if ((this.f37701b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37704e);
        }
        if ((this.f37701b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f37705f);
        }
        if ((this.f37701b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37706g);
        }
        if ((this.f37701b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f37701b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if ((this.f37701b & 64) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(8, this.f37709j);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.C7433w m35516b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001f;
            case 26: goto L_0x0042;
            case 32: goto L_0x004f;
            case 40: goto L_0x008e;
            case 48: goto L_0x00cd;
            case 56: goto L_0x00db;
            case 66: goto L_0x00e9;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f37702c;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r6.f37702c = r0;
    L_0x0019:
        r0 = r6.f37702c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r1 = r6.f37701b;
        r1 = r1 | 1;
        r6.f37701b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = com.google.android.finsky.cv.a.bp.a(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r6.f37703d = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f37701b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f37701b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x003a:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r0 = r7.m33564f();
        r6.f37704e = r0;
        r0 = r6.f37701b;
        r0 = r0 | 2;
        r6.f37701b = r0;
        goto L_0x0000;
    L_0x004f:
        r1 = r6.f37701b;
        r1 = r1 | 4;
        r6.f37701b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            default: goto L_0x0060;
        };	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0060:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x007b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0084:
        r6.f37705f = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r6.f37701b;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2 | 4;
        r6.f37701b = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0000;
    L_0x008e:
        r1 = r6.f37701b;
        r1 = r1 | 8;
        r6.f37701b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x00ba }
        switch(r2) {
            case 0: goto L_0x00c3;
            case 1: goto L_0x00c3;
            case 2: goto L_0x00c3;
            case 3: goto L_0x00c3;
            case 4: goto L_0x00c3;
            case 5: goto L_0x00c3;
            default: goto L_0x009f;
        };	 Catch:{ IllegalArgumentException -> 0x00ba }
    L_0x009f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00ba }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00ba }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00ba }
    L_0x00ba:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00c3:
        r6.f37706g = r2;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r2 = r6.f37701b;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r2 = r2 | 8;
        r6.f37701b = r2;	 Catch:{ IllegalArgumentException -> 0x00ba }
        goto L_0x0000;
    L_0x00cd:
        r0 = r7.m33563e();
        r6.f37707h = r0;
        r0 = r6.f37701b;
        r0 = r0 | 16;
        r6.f37701b = r0;
        goto L_0x0000;
    L_0x00db:
        r0 = r7.m33563e();
        r6.f37708i = r0;
        r0 = r6.f37701b;
        r0 = r0 | 32;
        r6.f37701b = r0;
        goto L_0x0000;
    L_0x00e9:
        r0 = r7.m33564f();
        r6.f37709j = r0;
        r0 = r6.f37701b;
        r0 = r0 | 64;
        r6.f37701b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.w.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.w");
    }

    public final /* synthetic */ i m35518a(C7213a c7213a) {
        return m35516b(c7213a);
    }
}
