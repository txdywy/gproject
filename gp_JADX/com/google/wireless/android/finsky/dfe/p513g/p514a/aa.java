package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aa extends b {
    public int f37758a;
    public String f37759b;
    public String f37760c;
    public ai f37761d;
    public ae f37762e;
    public String f37763f;
    public ae f37764g;
    public String f37765h;
    public long f37766i;
    public String f37767j;
    public int f37768k;

    public aa() {
        this.f37758a = 0;
        this.f37759b = "";
        this.f37760c = "";
        this.f37761d = null;
        this.f37762e = null;
        this.f37763f = "";
        this.f37764g = null;
        this.f37765h = "";
        this.f37766i = 0;
        this.f37767j = "";
        this.f37768k = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35576a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37758a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37759b);
        }
        if (this.f37761d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37761d);
        }
        if (this.f37762e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37762e);
        }
        if ((this.f37758a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37763f);
        }
        if (this.f37764g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37764g);
        }
        if ((this.f37758a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f37765h);
        }
        if ((this.f37758a & 16) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f37766i);
        }
        if ((this.f37758a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f37760c);
        }
        if ((this.f37758a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f37767j);
        }
        if ((this.f37758a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(15, this.f37768k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35577b() {
        int b = super.b();
        if ((this.f37758a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37759b);
        }
        if (this.f37761d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37761d);
        }
        if (this.f37762e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37762e);
        }
        if ((this.f37758a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37763f);
        }
        if (this.f37764g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37764g);
        }
        if ((this.f37758a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f37765h);
        }
        if ((this.f37758a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f37766i);
        }
        if ((this.f37758a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f37760c);
        }
        if ((this.f37758a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f37767j);
        }
        if ((this.f37758a & 64) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(15, this.f37768k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p513g.p514a.aa m35574b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 26: goto L_0x001b;
            case 34: goto L_0x002c;
            case 42: goto L_0x003d;
            case 50: goto L_0x004a;
            case 58: goto L_0x005b;
            case 64: goto L_0x0068;
            case 74: goto L_0x0075;
            case 82: goto L_0x0083;
            case 120: goto L_0x0091;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f37759b = r0;
        r0 = r6.f37758a;
        r0 = r0 | 1;
        r6.f37758a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f37761d;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ai;
        r0.<init>();
        r6.f37761d = r0;
    L_0x0026:
        r0 = r6.f37761d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x002c:
        r0 = r6.f37762e;
        if (r0 != 0) goto L_0x0037;
    L_0x0030:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ae;
        r0.<init>();
        r6.f37762e = r0;
    L_0x0037:
        r0 = r6.f37762e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x003d:
        r0 = r7.m33564f();
        r6.f37763f = r0;
        r0 = r6.f37758a;
        r0 = r0 | 4;
        r6.f37758a = r0;
        goto L_0x0000;
    L_0x004a:
        r0 = r6.f37764g;
        if (r0 != 0) goto L_0x0055;
    L_0x004e:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ae;
        r0.<init>();
        r6.f37764g = r0;
    L_0x0055:
        r0 = r6.f37764g;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x005b:
        r0 = r7.m33564f();
        r6.f37765h = r0;
        r0 = r6.f37758a;
        r0 = r0 | 8;
        r6.f37758a = r0;
        goto L_0x0000;
    L_0x0068:
        r0 = r7.m33568j();
        r6.f37766i = r0;
        r0 = r6.f37758a;
        r0 = r0 | 16;
        r6.f37758a = r0;
        goto L_0x0000;
    L_0x0075:
        r0 = r7.m33564f();
        r6.f37760c = r0;
        r0 = r6.f37758a;
        r0 = r0 | 2;
        r6.f37758a = r0;
        goto L_0x0000;
    L_0x0083:
        r0 = r7.m33564f();
        r6.f37767j = r0;
        r0 = r6.f37758a;
        r0 = r0 | 32;
        r6.f37758a = r0;
        goto L_0x0000;
    L_0x0091:
        r1 = r6.f37758a;
        r1 = r1 | 64;
        r6.f37758a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x00bd }
        switch(r2) {
            case 0: goto L_0x00c6;
            case 1: goto L_0x00c6;
            case 2: goto L_0x00c6;
            default: goto L_0x00a2;
        };	 Catch:{ IllegalArgumentException -> 0x00bd }
    L_0x00a2:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r4 = " is not a valid enum ArticleType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00bd }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00bd }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00bd }
    L_0x00bd:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00c6:
        r6.f37768k = r2;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r2 = r6.f37758a;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r2 = r2 | 64;
        r6.f37758a = r2;	 Catch:{ IllegalArgumentException -> 0x00bd }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.g.a.aa.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.g.a.aa");
    }

    public final /* synthetic */ i m35575a(C7213a c7213a) {
        return m35574b(c7213a);
    }
}
