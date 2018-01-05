package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7349e extends b {
    public static volatile C7349e[] f36740a;
    public int f36741b;
    public int f36742c;
    public int f36743d;
    public long f36744e;
    public String f36745f;
    public long f36746g;
    public String f36747h;
    public String f36748i;
    public C7348d f36749j;

    public static C7349e[] m34837d() {
        if (f36740a == null) {
            synchronized (C7219h.f35465b) {
                if (f36740a == null) {
                    f36740a = new C7349e[0];
                }
            }
        }
        return f36740a;
    }

    public final boolean m34841e() {
        return (this.f36741b & 32) != 0;
    }

    public C7349e() {
        this.f36741b = 0;
        this.f36742c = 0;
        this.f36743d = 0;
        this.f36744e = 0;
        this.f36745f = "";
        this.f36746g = 0;
        this.f36747h = "";
        this.f36748i = "";
        this.f36749j = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34839a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36742c);
        if ((this.f36741b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36743d);
        }
        if ((this.f36741b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36744e);
        }
        if ((this.f36741b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36747h);
        }
        if (this.f36749j != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36749j);
        }
        if ((this.f36741b & 8) != 0) {
            codedOutputByteBufferNano.m33531b(6, this.f36746g);
        }
        if ((this.f36741b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36748i);
        }
        if ((this.f36741b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36745f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34840b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f36742c);
        if ((this.f36741b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36743d);
        }
        if ((this.f36741b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f36744e);
        }
        if ((this.f36741b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36747h);
        }
        if (this.f36749j != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36749j);
        }
        if ((this.f36741b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f36746g);
        }
        if ((this.f36741b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36748i);
        }
        if ((this.f36741b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(8, this.f36745f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p493b.C7349e m34836b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x003f;
            case 24: goto L_0x004c;
            case 34: goto L_0x0059;
            case 42: goto L_0x0066;
            case 48: goto L_0x0077;
            case 58: goto L_0x0085;
            case 66: goto L_0x0093;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum FileType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f36742c = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33560d();
        r6.f36743d = r0;
        r0 = r6.f36741b;
        r0 = r0 | 1;
        r6.f36741b = r0;
        goto L_0x0000;
    L_0x004c:
        r0 = r7.m33559c();
        r6.f36744e = r0;
        r0 = r6.f36741b;
        r0 = r0 | 2;
        r6.f36741b = r0;
        goto L_0x0000;
    L_0x0059:
        r0 = r7.m33564f();
        r6.f36747h = r0;
        r0 = r6.f36741b;
        r0 = r0 | 16;
        r6.f36741b = r0;
        goto L_0x0000;
    L_0x0066:
        r0 = r6.f36749j;
        if (r0 != 0) goto L_0x0071;
    L_0x006a:
        r0 = new com.google.wireless.android.finsky.b.d;
        r0.<init>();
        r6.f36749j = r0;
    L_0x0071:
        r0 = r6.f36749j;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0077:
        r0 = r7.m33559c();
        r6.f36746g = r0;
        r0 = r6.f36741b;
        r0 = r0 | 8;
        r6.f36741b = r0;
        goto L_0x0000;
    L_0x0085:
        r0 = r7.m33564f();
        r6.f36748i = r0;
        r0 = r6.f36741b;
        r0 = r0 | 32;
        r6.f36741b = r0;
        goto L_0x0000;
    L_0x0093:
        r0 = r7.m33564f();
        r6.f36745f = r0;
        r0 = r6.f36741b;
        r0 = r0 | 4;
        r6.f36741b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.b.e.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.b.e");
    }

    public final /* synthetic */ i m34838a(C7213a c7213a) {
        return m34836b(c7213a);
    }
}
