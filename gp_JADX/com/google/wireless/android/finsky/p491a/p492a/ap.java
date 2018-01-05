package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ap extends b {
    public int f36406a;
    public long f36407b;
    public boolean f36408c;
    public String f36409d;
    public String f36410e;
    public String f36411f;
    public aq[] f36412g;
    public String f36413h;
    public String f36414i;
    public String f36415j;
    public boolean f36416k;
    public int f36417l;

    public ap() {
        this.f36406a = 0;
        this.f36407b = 0;
        this.f36408c = false;
        this.f36409d = "";
        this.f36410e = "";
        this.f36411f = "";
        this.f36412g = aq.m34660d();
        this.f36413h = "";
        this.f36414i = "";
        this.f36415j = "";
        this.f36416k = false;
        this.f36417l = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34658a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36406a & 1) != 0) {
            codedOutputByteBufferNano.m33535c(1, this.f36407b);
        }
        if ((this.f36406a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36408c);
        }
        if ((this.f36406a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36409d);
        }
        if ((this.f36406a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36410e);
        }
        if ((this.f36406a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36411f);
        }
        if ((this.f36406a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36413h);
        }
        if ((this.f36406a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36414i);
        }
        if ((this.f36406a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36415j);
        }
        if ((this.f36406a & 256) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f36416k);
        }
        if ((this.f36406a & 512) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f36417l);
        }
        if (this.f36412g != null && this.f36412g.length > 0) {
            for (i iVar : this.f36412g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(11, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34659b() {
        int b = super.b();
        if ((this.f36406a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 8;
        }
        if ((this.f36406a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f36406a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36409d);
        }
        if ((this.f36406a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36410e);
        }
        if ((this.f36406a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36411f);
        }
        if ((this.f36406a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36413h);
        }
        if ((this.f36406a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36414i);
        }
        if ((this.f36406a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36415j);
        }
        if ((this.f36406a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if ((this.f36406a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f36417l);
        }
        if (this.f36412g == null || this.f36412g.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36412g) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(11, iVar);
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.ap m34656b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 9: goto L_0x000f;
            case 16: goto L_0x001c;
            case 26: goto L_0x0029;
            case 34: goto L_0x0036;
            case 42: goto L_0x0043;
            case 50: goto L_0x0050;
            case 58: goto L_0x005d;
            case 66: goto L_0x006a;
            case 72: goto L_0x0077;
            case 80: goto L_0x0085;
            case 90: goto L_0x00c4;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.m33570l();
        r7.f36407b = r2;
        r0 = r7.f36406a;
        r0 = r0 | 1;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x001c:
        r0 = r8.m33563e();
        r7.f36408c = r0;
        r0 = r7.f36406a;
        r0 = r0 | 2;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x0029:
        r0 = r8.m33564f();
        r7.f36409d = r0;
        r0 = r7.f36406a;
        r0 = r0 | 4;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x0036:
        r0 = r8.m33564f();
        r7.f36410e = r0;
        r0 = r7.f36406a;
        r0 = r0 | 8;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x0043:
        r0 = r8.m33564f();
        r7.f36411f = r0;
        r0 = r7.f36406a;
        r0 = r0 | 16;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x0050:
        r0 = r8.m33564f();
        r7.f36413h = r0;
        r0 = r7.f36406a;
        r0 = r0 | 32;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x005d:
        r0 = r8.m33564f();
        r7.f36414i = r0;
        r0 = r7.f36406a;
        r0 = r0 | 64;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x006a:
        r0 = r8.m33564f();
        r7.f36415j = r0;
        r0 = r7.f36406a;
        r0 = r0 | 128;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x0077:
        r0 = r8.m33563e();
        r7.f36416k = r0;
        r0 = r7.f36406a;
        r0 = r0 | 256;
        r7.f36406a = r0;
        goto L_0x0001;
    L_0x0085:
        r2 = r7.f36406a;
        r2 = r2 | 512;
        r7.f36406a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        switch(r3) {
            case 0: goto L_0x00ba;
            case 1: goto L_0x00ba;
            case 2: goto L_0x00ba;
            case 3: goto L_0x00ba;
            case 4: goto L_0x00ba;
            case 5: goto L_0x00ba;
            default: goto L_0x0096;
        };	 Catch:{ IllegalArgumentException -> 0x00b1 }
    L_0x0096:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r5 = 36;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r5 = " is not a valid enum Mode";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00b1 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00b1 }
    L_0x00b1:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00ba:
        r7.f36417l = r3;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = r7.f36406a;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r3 = r3 | 512;
        r7.f36406a = r3;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        goto L_0x0001;
    L_0x00c4:
        r0 = 90;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f36412g;
        if (r0 != 0) goto L_0x00f0;
    L_0x00ce:
        r0 = r1;
    L_0x00cf:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.p491a.p492a.aq[r2];
        if (r0 == 0) goto L_0x00d9;
    L_0x00d4:
        r3 = r7.f36412g;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00d9:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00f4;
    L_0x00de:
        r3 = new com.google.wireless.android.finsky.a.a.aq;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x00d9;
    L_0x00f0:
        r0 = r7.f36412g;
        r0 = r0.length;
        goto L_0x00cf;
    L_0x00f4:
        r3 = new com.google.wireless.android.finsky.a.a.aq;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f36412g = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.ap.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.ap");
    }

    public final /* synthetic */ i m34657a(C7213a c7213a) {
        return m34656b(c7213a);
    }
}
