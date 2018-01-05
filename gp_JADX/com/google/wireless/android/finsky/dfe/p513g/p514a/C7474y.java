package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7474y extends b {
    public int f37960a;
    public String f37961b;
    public ab f37962c;
    public ae f37963d;
    public ai f37964e;
    public int f37965f;
    public String f37966g;

    public C7474y() {
        this.f37960a = 0;
        this.f37961b = "";
        this.f37962c = null;
        this.f37963d = null;
        this.f37964e = null;
        this.f37965f = 0;
        this.f37966g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35711a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37960a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37961b);
        }
        if (this.f37962c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37962c);
        }
        if (this.f37963d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37963d);
        }
        if (this.f37964e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37964e);
        }
        if ((this.f37960a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37965f);
        }
        if ((this.f37960a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37966g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35712b() {
        int b = super.b();
        if ((this.f37960a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37961b);
        }
        if (this.f37962c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37962c);
        }
        if (this.f37963d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37963d);
        }
        if (this.f37964e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37964e);
        }
        if ((this.f37960a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37965f);
        }
        if ((this.f37960a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f37966g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p513g.p514a.C7474y m35709b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 26: goto L_0x002c;
            case 34: goto L_0x003d;
            case 40: goto L_0x004e;
            case 50: goto L_0x008d;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f37961b = r0;
        r0 = r6.f37960a;
        r0 = r0 | 1;
        r6.f37960a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f37962c;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ab;
        r0.<init>();
        r6.f37962c = r0;
    L_0x0026:
        r0 = r6.f37962c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x002c:
        r0 = r6.f37963d;
        if (r0 != 0) goto L_0x0037;
    L_0x0030:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ae;
        r0.<init>();
        r6.f37963d = r0;
    L_0x0037:
        r0 = r6.f37963d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x003d:
        r0 = r6.f37964e;
        if (r0 != 0) goto L_0x0048;
    L_0x0041:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ai;
        r0.<init>();
        r6.f37964e = r0;
    L_0x0048:
        r0 = r6.f37964e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x004e:
        r1 = r6.f37960a;
        r1 = r1 | 2;
        r6.f37960a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x007a }
        switch(r2) {
            case 0: goto L_0x0083;
            case 1: goto L_0x0083;
            case 2: goto L_0x0083;
            default: goto L_0x005f;
        };	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x005f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007a }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007a }
        r4 = " is not a valid enum LayoutType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x007a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x007a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x007a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0083:
        r6.f37965f = r2;	 Catch:{ IllegalArgumentException -> 0x007a }
        r2 = r6.f37960a;	 Catch:{ IllegalArgumentException -> 0x007a }
        r2 = r2 | 2;
        r6.f37960a = r2;	 Catch:{ IllegalArgumentException -> 0x007a }
        goto L_0x0000;
    L_0x008d:
        r0 = r7.m33564f();
        r6.f37966g = r0;
        r0 = r6.f37960a;
        r0 = r0 | 4;
        r6.f37960a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.g.a.y.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.g.a.y");
    }

    public final /* synthetic */ i m35710a(C7213a c7213a) {
        return m35709b(c7213a);
    }
}
