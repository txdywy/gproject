package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7323e extends b {
    public int f36479a;
    public C7324f f36480b;
    public boolean f36481c;
    public boolean f36482d;
    public av f36483e;
    public int f36484f;
    public String f36485g;
    public aj f36486h;
    public String f36487i;
    public int f36488j;

    public C7323e() {
        this.f36479a = 0;
        this.f36480b = null;
        this.f36481c = false;
        this.f36482d = false;
        this.f36483e = null;
        this.f36484f = 0;
        this.f36485g = "";
        this.f36486h = null;
        this.f36487i = "";
        this.f36488j = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34725a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36480b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36480b);
        }
        if ((this.f36479a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36481c);
        }
        if ((this.f36479a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36482d);
        }
        if (this.f36483e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36483e);
        }
        if ((this.f36479a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f36484f);
        }
        if ((this.f36479a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36485g);
        }
        if (this.f36486h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36486h);
        }
        if ((this.f36479a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36487i);
        }
        if ((this.f36479a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f36488j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34726b() {
        int b = super.b();
        if (this.f36480b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36480b);
        }
        if ((this.f36479a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f36479a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f36483e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f36483e);
        }
        if ((this.f36479a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f36484f);
        }
        if ((this.f36479a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36485g);
        }
        if (this.f36486h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36486h);
        }
        if ((this.f36479a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36487i);
        }
        if ((this.f36479a & 32) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(9, this.f36488j);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.C7323e m34723b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001f;
            case 24: goto L_0x002c;
            case 34: goto L_0x0039;
            case 40: goto L_0x004a;
            case 50: goto L_0x0057;
            case 58: goto L_0x0064;
            case 66: goto L_0x0075;
            case 72: goto L_0x0083;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f36480b;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.wireless.android.finsky.a.a.f;
        r0.<init>();
        r6.f36480b = r0;
    L_0x0019:
        r0 = r6.f36480b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r7.m33563e();
        r6.f36481c = r0;
        r0 = r6.f36479a;
        r0 = r0 | 1;
        r6.f36479a = r0;
        goto L_0x0000;
    L_0x002c:
        r0 = r7.m33563e();
        r6.f36482d = r0;
        r0 = r6.f36479a;
        r0 = r0 | 2;
        r6.f36479a = r0;
        goto L_0x0000;
    L_0x0039:
        r0 = r6.f36483e;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new com.google.wireless.android.finsky.a.a.av;
        r0.<init>();
        r6.f36483e = r0;
    L_0x0044:
        r0 = r6.f36483e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x004a:
        r0 = r7.m33567i();
        r6.f36484f = r0;
        r0 = r6.f36479a;
        r0 = r0 | 4;
        r6.f36479a = r0;
        goto L_0x0000;
    L_0x0057:
        r0 = r7.m33564f();
        r6.f36485g = r0;
        r0 = r6.f36479a;
        r0 = r0 | 8;
        r6.f36479a = r0;
        goto L_0x0000;
    L_0x0064:
        r0 = r6.f36486h;
        if (r0 != 0) goto L_0x006f;
    L_0x0068:
        r0 = new com.google.wireless.android.finsky.a.a.aj;
        r0.<init>();
        r6.f36486h = r0;
    L_0x006f:
        r0 = r6.f36486h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0075:
        r0 = r7.m33564f();
        r6.f36487i = r0;
        r0 = r6.f36479a;
        r0 = r0 | 16;
        r6.f36479a = r0;
        goto L_0x0000;
    L_0x0083:
        r1 = r6.f36479a;
        r1 = r1 | 32;
        r6.f36479a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x00af }
        switch(r2) {
            case 0: goto L_0x00b8;
            case 1: goto L_0x00b8;
            case 2: goto L_0x00b8;
            default: goto L_0x0094;
        };	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x0094:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00af }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00af }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00af }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00af }
        r4 = " is not a valid enum Source";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00af }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00af }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00af }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x00af:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00b8:
        r6.f36488j = r2;	 Catch:{ IllegalArgumentException -> 0x00af }
        r2 = r6.f36479a;	 Catch:{ IllegalArgumentException -> 0x00af }
        r2 = r2 | 32;
        r6.f36479a = r2;	 Catch:{ IllegalArgumentException -> 0x00af }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.e.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.e");
    }

    public final /* synthetic */ i m34724a(C7213a c7213a) {
        return m34723b(c7213a);
    }
}
