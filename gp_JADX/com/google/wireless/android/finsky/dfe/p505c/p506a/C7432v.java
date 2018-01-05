package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7432v extends b {
    public int f37687a;
    public int f37688b;
    public int f37689c;
    public C7427q f37690d;
    public byte[] f37691e;
    public byte[] f37692f;
    public String f37693g;
    public dv f37694h;
    public String f37695i;
    public String f37696j;
    public co f37697k;
    public boolean f37698l;
    public String f37699m;

    public C7432v() {
        this.f37687a = 0;
        this.f37688b = 0;
        this.f37689c = 0;
        this.f37690d = null;
        this.f37691e = C7222l.f35479l;
        this.f37692f = C7222l.f35479l;
        this.f37693g = "";
        this.f37694h = null;
        this.f37695i = "";
        this.f37696j = "";
        this.f37697k = null;
        this.f37698l = false;
        this.f37699m = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35514a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37687a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37688b);
        }
        if ((this.f37687a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37689c);
        }
        if (this.f37690d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37690d);
        }
        if ((this.f37687a & 4) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f37691e);
        }
        if ((this.f37687a & 8) != 0) {
            codedOutputByteBufferNano.m33523a(5, this.f37692f);
        }
        if ((this.f37687a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37693g);
        }
        if (this.f37694h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37694h);
        }
        if ((this.f37687a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f37695i);
        }
        if ((this.f37687a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f37696j);
        }
        if (this.f37697k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f37697k);
        }
        if ((this.f37687a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f37698l);
        }
        if ((this.f37687a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(12, this.f37699m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35515b() {
        int b = super.b();
        if ((this.f37687a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37688b);
        }
        if ((this.f37687a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37689c);
        }
        if (this.f37690d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37690d);
        }
        if ((this.f37687a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33494b(4, this.f37691e);
        }
        if ((this.f37687a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33494b(5, this.f37692f);
        }
        if ((this.f37687a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37693g);
        }
        if (this.f37694h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f37694h);
        }
        if ((this.f37687a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f37695i);
        }
        if ((this.f37687a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f37696j);
        }
        if (this.f37697k != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f37697k);
        }
        if ((this.f37687a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f37687a & 256) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(12, this.f37699m);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.C7432v m35512b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 26: goto L_0x006e;
            case 34: goto L_0x007f;
            case 42: goto L_0x008d;
            case 50: goto L_0x009b;
            case 58: goto L_0x00a9;
            case 66: goto L_0x00bb;
            case 74: goto L_0x00c9;
            case 82: goto L_0x00d7;
            case 88: goto L_0x00e9;
            case 98: goto L_0x00f7;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f37687a;
        r1 = r1 | 1;
        r6.f37687a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f37688b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f37687a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f37687a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r1 = r6.f37687a;
        r1 = r1 | 2;
        r6.f37687a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = com.google.wireless.android.finsky.dfe.p505c.p506a.dp.m35391a(r2);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r6.f37689c = r2;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = r6.f37687a;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = r2 | 2;
        r6.f37687a = r2;	 Catch:{ IllegalArgumentException -> 0x0066 }
        goto L_0x0000;
    L_0x0066:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x006e:
        r0 = r6.f37690d;
        if (r0 != 0) goto L_0x0079;
    L_0x0072:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.q;
        r0.<init>();
        r6.f37690d = r0;
    L_0x0079:
        r0 = r6.f37690d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x007f:
        r0 = r7.m33565g();
        r6.f37691e = r0;
        r0 = r6.f37687a;
        r0 = r0 | 4;
        r6.f37687a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r7.m33565g();
        r6.f37692f = r0;
        r0 = r6.f37687a;
        r0 = r0 | 8;
        r6.f37687a = r0;
        goto L_0x0000;
    L_0x009b:
        r0 = r7.m33564f();
        r6.f37693g = r0;
        r0 = r6.f37687a;
        r0 = r0 | 16;
        r6.f37687a = r0;
        goto L_0x0000;
    L_0x00a9:
        r0 = r6.f37694h;
        if (r0 != 0) goto L_0x00b4;
    L_0x00ad:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.dv;
        r0.<init>();
        r6.f37694h = r0;
    L_0x00b4:
        r0 = r6.f37694h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00bb:
        r0 = r7.m33564f();
        r6.f37695i = r0;
        r0 = r6.f37687a;
        r0 = r0 | 32;
        r6.f37687a = r0;
        goto L_0x0000;
    L_0x00c9:
        r0 = r7.m33564f();
        r6.f37696j = r0;
        r0 = r6.f37687a;
        r0 = r0 | 64;
        r6.f37687a = r0;
        goto L_0x0000;
    L_0x00d7:
        r0 = r6.f37697k;
        if (r0 != 0) goto L_0x00e2;
    L_0x00db:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.co;
        r0.<init>();
        r6.f37697k = r0;
    L_0x00e2:
        r0 = r6.f37697k;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00e9:
        r0 = r7.m33563e();
        r6.f37698l = r0;
        r0 = r6.f37687a;
        r0 = r0 | 128;
        r6.f37687a = r0;
        goto L_0x0000;
    L_0x00f7:
        r0 = r7.m33564f();
        r6.f37699m = r0;
        r0 = r6.f37687a;
        r0 = r0 | 256;
        r6.f37687a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.v.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.v");
    }

    public final /* synthetic */ i m35513a(C7213a c7213a) {
        return m35512b(c7213a);
    }
}
