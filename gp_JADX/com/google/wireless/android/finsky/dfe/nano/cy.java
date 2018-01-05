package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cy extends b {
    public static volatile cy[] f38612a;
    public int f38613b;
    public long f38614c;
    public String f38615d;
    public String f38616e;
    public String f38617f;
    public String f38618g;
    public int f38619h;

    public static cy[] m36208d() {
        if (f38612a == null) {
            synchronized (C7219h.f35465b) {
                if (f38612a == null) {
                    f38612a = new cy[0];
                }
            }
        }
        return f38612a;
    }

    public cy() {
        this.f38613b = 0;
        this.f38614c = 0;
        this.f38615d = "";
        this.f38616e = "";
        this.f38617f = "";
        this.f38618g = "";
        this.f38619h = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36210a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38613b & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f38614c);
        }
        if ((this.f38613b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38615d);
        }
        if ((this.f38613b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38616e);
        }
        if ((this.f38613b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38617f);
        }
        if ((this.f38613b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38618g);
        }
        if ((this.f38613b & 32) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38619h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36211b() {
        int b = super.b();
        if ((this.f38613b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f38614c);
        }
        if ((this.f38613b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38615d);
        }
        if ((this.f38613b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38616e);
        }
        if ((this.f38613b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38617f);
        }
        if ((this.f38613b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38618g);
        }
        if ((this.f38613b & 32) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(6, this.f38619h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.cy m36207b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x001b;
            case 26: goto L_0x0028;
            case 34: goto L_0x0035;
            case 42: goto L_0x0042;
            case 48: goto L_0x004f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33568j();
        r6.f38614c = r0;
        r0 = r6.f38613b;
        r0 = r0 | 1;
        r6.f38613b = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33564f();
        r6.f38615d = r0;
        r0 = r6.f38613b;
        r0 = r0 | 2;
        r6.f38613b = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m33564f();
        r6.f38616e = r0;
        r0 = r6.f38613b;
        r0 = r0 | 4;
        r6.f38613b = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.m33564f();
        r6.f38617f = r0;
        r0 = r6.f38613b;
        r0 = r0 | 8;
        r6.f38613b = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = r7.m33564f();
        r6.f38618g = r0;
        r0 = r6.f38613b;
        r0 = r0 | 16;
        r6.f38613b = r0;
        goto L_0x0000;
    L_0x004f:
        r1 = r6.f38613b;
        r1 = r1 | 32;
        r6.f38613b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            case 2: goto L_0x0084;
            case 3: goto L_0x0084;
            case 4: goto L_0x0084;
            case 5: goto L_0x0084;
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
        r6.f38619h = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r6.f38613b;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2 | 32;
        r6.f38613b = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.cy.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.cy");
    }

    public final /* synthetic */ i m36209a(C7213a c7213a) {
        return m36207b(c7213a);
    }
}
