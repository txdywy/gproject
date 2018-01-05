package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7514f extends b {
    public int f38217a;
    public int f38218b;
    public String f38219c;
    public int f38220d;
    public bd f38221e;
    public String f38222f;
    public String f38223g;
    public String f38224h;
    public C7512d f38225i;
    public String f38226j;
    public byte[] f38227k;
    public C7518j f38228l;
    public C7518j f38229m;
    public C7513e f38230n;

    public final String m35923d() {
        if (this.f38217a == 0) {
            return this.f38224h;
        }
        return "";
    }

    public final C7514f m35920a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f38217a = -1;
        this.f38217a = 0;
        this.f38224h = str;
        return this;
    }

    public final C7512d m35924e() {
        if (this.f38217a == 1) {
            return this.f38225i;
        }
        return null;
    }

    public C7514f() {
        this.f38217a = -1;
        this.f38218b = 0;
        this.f38219c = "";
        this.f38220d = 0;
        this.f38221e = null;
        this.f38222f = "";
        this.f38223g = "";
        this.f38217a = -1;
        this.f38224h = "";
        this.f38217a = -1;
        this.f38225i = null;
        this.f38226j = "";
        this.f38227k = C7222l.f35479l;
        this.f38228l = null;
        this.f38229m = null;
        this.f38230n = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35921a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38218b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38219c);
        }
        if ((this.f38218b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38220d);
        }
        if ((this.f38218b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38222f);
        }
        if ((this.f38218b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38223g);
        }
        if (this.f38217a == 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38224h);
        }
        if ((this.f38218b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38226j);
        }
        if ((this.f38218b & 64) != 0) {
            codedOutputByteBufferNano.m33523a(7, this.f38227k);
        }
        if (this.f38228l != null) {
            codedOutputByteBufferNano.m33532b(8, this.f38228l);
        }
        if (this.f38229m != null) {
            codedOutputByteBufferNano.m33532b(9, this.f38229m);
        }
        if (this.f38221e != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38221e);
        }
        if (this.f38217a == 1) {
            codedOutputByteBufferNano.m33532b(11, this.f38225i);
        }
        if (this.f38230n != null) {
            codedOutputByteBufferNano.m33532b(12, this.f38230n);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35922b() {
        int b = super.b();
        if ((this.f38218b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38219c);
        }
        if ((this.f38218b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f38220d);
        }
        if ((this.f38218b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38222f);
        }
        if ((this.f38218b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38223g);
        }
        if (this.f38217a == 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38224h);
        }
        if ((this.f38218b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38226j);
        }
        if ((this.f38218b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33494b(7, this.f38227k);
        }
        if (this.f38228l != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f38228l);
        }
        if (this.f38229m != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f38229m);
        }
        if (this.f38221e != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f38221e);
        }
        if (this.f38217a == 1) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f38225i);
        }
        if (this.f38230n != null) {
            return b + CodedOutputByteBufferNano.m33503d(12, this.f38230n);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p519j.p520a.C7514f m35918b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0065;
            case 42: goto L_0x0072;
            case 50: goto L_0x007c;
            case 58: goto L_0x008a;
            case 66: goto L_0x0098;
            case 74: goto L_0x00aa;
            case 82: goto L_0x00bc;
            case 90: goto L_0x00ce;
            case 98: goto L_0x00e3;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f38219c = r0;
        r0 = r6.f38218b;
        r0 = r0 | 1;
        r6.f38218b = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f38218b;
        r1 = r1 | 2;
        r6.f38218b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum NotificationIcon";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f38220d = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f38218b;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f38218b = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f38222f = r0;
        r0 = r6.f38218b;
        r0 = r0 | 4;
        r6.f38218b = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.m33564f();
        r6.f38223g = r0;
        r0 = r6.f38218b;
        r0 = r0 | 8;
        r6.f38218b = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33564f();
        r6.f38224h = r0;
        r0 = 0;
        r6.f38217a = r0;
        goto L_0x0000;
    L_0x007c:
        r0 = r7.m33564f();
        r6.f38226j = r0;
        r0 = r6.f38218b;
        r0 = r0 | 32;
        r6.f38218b = r0;
        goto L_0x0000;
    L_0x008a:
        r0 = r7.m33565g();
        r6.f38227k = r0;
        r0 = r6.f38218b;
        r0 = r0 | 64;
        r6.f38218b = r0;
        goto L_0x0000;
    L_0x0098:
        r0 = r6.f38228l;
        if (r0 != 0) goto L_0x00a3;
    L_0x009c:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.j;
        r0.<init>();
        r6.f38228l = r0;
    L_0x00a3:
        r0 = r6.f38228l;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00aa:
        r0 = r6.f38229m;
        if (r0 != 0) goto L_0x00b5;
    L_0x00ae:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.j;
        r0.<init>();
        r6.f38229m = r0;
    L_0x00b5:
        r0 = r6.f38229m;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00bc:
        r0 = r6.f38221e;
        if (r0 != 0) goto L_0x00c7;
    L_0x00c0:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f38221e = r0;
    L_0x00c7:
        r0 = r6.f38221e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00ce:
        r0 = r6.f38225i;
        if (r0 != 0) goto L_0x00d9;
    L_0x00d2:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.d;
        r0.<init>();
        r6.f38225i = r0;
    L_0x00d9:
        r0 = r6.f38225i;
        r7.m33552a(r0);
        r0 = 1;
        r6.f38217a = r0;
        goto L_0x0000;
    L_0x00e3:
        r0 = r6.f38230n;
        if (r0 != 0) goto L_0x00ee;
    L_0x00e7:
        r0 = new com.google.wireless.android.finsky.dfe.j.a.e;
        r0.<init>();
        r6.f38230n = r0;
    L_0x00ee:
        r0 = r6.f38230n;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.j.a.f.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.j.a.f");
    }

    public final /* synthetic */ i m35919a(C7213a c7213a) {
        return m35918b(c7213a);
    }
}
