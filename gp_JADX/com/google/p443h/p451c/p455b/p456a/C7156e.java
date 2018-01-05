package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7156e extends b {
    public int f34948a;
    public String f34949b;
    public int f34950c;
    public long[] f34951d;
    public int f34952e;
    public int f34953f;
    public int f34954g;
    public long f34955h;
    public int f34956i;
    public int f34957j;
    public C7155d f34958k;
    public C7157f f34959l;
    public C7153b f34960m;
    public C7164m f34961n;
    public C7154c f34962o;
    public C7162k f34963p;
    public C7160i f34964q;
    public C7161j f34965r;
    public C7165n f34966s;
    public C7163l f34967t;

    public final C7155d m32457d() {
        if (this.f34948a == 0) {
            return this.f34958k;
        }
        return null;
    }

    public final C7157f m32458e() {
        if (this.f34948a == 1) {
            return this.f34959l;
        }
        return null;
    }

    public final C7156e m32452a(C7157f c7157f) {
        this.f34948a = -1;
        this.f34948a = 1;
        this.f34959l = c7157f;
        return this;
    }

    public final C7153b m32459f() {
        if (this.f34948a == 2) {
            return this.f34960m;
        }
        return null;
    }

    public final C7156e m32450a(C7153b c7153b) {
        this.f34948a = -1;
        this.f34948a = 2;
        this.f34960m = c7153b;
        return this;
    }

    public final C7164m m32460g() {
        if (this.f34948a == 3) {
            return this.f34961n;
        }
        return null;
    }

    public final C7156e m32453a(C7164m c7164m) {
        this.f34948a = -1;
        this.f34948a = 3;
        this.f34961n = c7164m;
        return this;
    }

    public final C7154c m32461h() {
        if (this.f34948a == 4) {
            return this.f34962o;
        }
        return null;
    }

    public final C7156e m32451a(C7154c c7154c) {
        this.f34948a = -1;
        this.f34948a = 4;
        this.f34962o = c7154c;
        return this;
    }

    public final C7160i m32462i() {
        if (this.f34948a == 6) {
            return this.f34964q;
        }
        return null;
    }

    public C7156e() {
        this.f34948a = -1;
        this.f34949b = "";
        this.f34950c = 0;
        this.f34951d = C7222l.f35473f;
        this.f34952e = 0;
        this.f34953f = 0;
        this.f34954g = 0;
        this.f34955h = 0;
        this.f34956i = 0;
        this.f34957j = 0;
        this.f34948a = -1;
        this.f34958k = null;
        this.f34948a = -1;
        this.f34959l = null;
        this.f34948a = -1;
        this.f34960m = null;
        this.f34948a = -1;
        this.f34961n = null;
        this.f34948a = -1;
        this.f34962o = null;
        this.f34948a = -1;
        this.f34963p = null;
        this.f34948a = -1;
        this.f34964q = null;
        this.f34948a = -1;
        this.f34965r = null;
        this.f34948a = -1;
        this.f34966s = null;
        this.f34948a = -1;
        this.f34967t = null;
        this.aP = -1;
    }

    public final void m32455a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f34949b == null || this.f34949b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34949b);
        }
        if (this.f34950c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f34950c);
        }
        if (this.f34951d != null && this.f34951d.length > 0) {
            int i2 = 0;
            for (long c : this.f34951d) {
                i2 += CodedOutputByteBufferNano.m33500c(c);
            }
            codedOutputByteBufferNano.m33539e(26);
            codedOutputByteBufferNano.m33539e(i2);
            while (i < this.f34951d.length) {
                codedOutputByteBufferNano.m33533b(this.f34951d[i]);
                i++;
            }
        }
        if (this.f34952e != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f34952e);
        }
        if (this.f34953f != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f34953f);
        }
        if (this.f34954g != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f34954g);
        }
        if (this.f34955h != 0) {
            codedOutputByteBufferNano.m33531b(7, this.f34955h);
        }
        if (this.f34956i != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f34956i);
        }
        if (this.f34957j != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f34957j);
        }
        if (this.f34948a == 0) {
            codedOutputByteBufferNano.m33532b(10, this.f34958k);
        }
        if (this.f34948a == 1) {
            codedOutputByteBufferNano.m33532b(11, this.f34959l);
        }
        if (this.f34948a == 2) {
            codedOutputByteBufferNano.m33532b(12, this.f34960m);
        }
        if (this.f34948a == 3) {
            codedOutputByteBufferNano.m33532b(13, this.f34961n);
        }
        if (this.f34948a == 4) {
            codedOutputByteBufferNano.m33532b(14, this.f34962o);
        }
        if (this.f34948a == 5) {
            codedOutputByteBufferNano.m33532b(15, this.f34963p);
        }
        if (this.f34948a == 6) {
            codedOutputByteBufferNano.m33532b(16, this.f34964q);
        }
        if (this.f34948a == 7) {
            codedOutputByteBufferNano.m33532b(17, this.f34965r);
        }
        if (this.f34948a == 8) {
            codedOutputByteBufferNano.m33532b(18, this.f34966s);
        }
        if (this.f34948a == 9) {
            codedOutputByteBufferNano.m33532b(19, this.f34967t);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32456b() {
        int i = 0;
        int b = super.b();
        if (!(this.f34949b == null || this.f34949b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34949b);
        }
        if (this.f34950c != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f34950c);
        }
        if (this.f34951d != null && this.f34951d.length > 0) {
            int i2 = 0;
            while (i < this.f34951d.length) {
                i2 += CodedOutputByteBufferNano.m33500c(this.f34951d[i]);
                i++;
            }
            b = ((b + i2) + 1) + CodedOutputByteBufferNano.m33507f(i2);
        }
        if (this.f34952e != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34952e);
        }
        if (this.f34953f != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f34953f);
        }
        if (this.f34954g != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f34954g);
        }
        if (this.f34955h != 0) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f34955h);
        }
        if (this.f34956i != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f34956i);
        }
        if (this.f34957j != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f34957j);
        }
        if (this.f34948a == 0) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f34958k);
        }
        if (this.f34948a == 1) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f34959l);
        }
        if (this.f34948a == 2) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f34960m);
        }
        if (this.f34948a == 3) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f34961n);
        }
        if (this.f34948a == 4) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f34962o);
        }
        if (this.f34948a == 5) {
            b += CodedOutputByteBufferNano.m33503d(15, this.f34963p);
        }
        if (this.f34948a == 6) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f34964q);
        }
        if (this.f34948a == 7) {
            b += CodedOutputByteBufferNano.m33503d(17, this.f34965r);
        }
        if (this.f34948a == 8) {
            b += CodedOutputByteBufferNano.m33503d(18, this.f34966s);
        }
        if (this.f34948a == 9) {
            return b + CodedOutputByteBufferNano.m33503d(19, this.f34967t);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p455b.p456a.C7156e m32449b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 16: goto L_0x0016;
            case 24: goto L_0x001d;
            case 26: goto L_0x0050;
            case 32: goto L_0x0092;
            case 40: goto L_0x00ab;
            case 48: goto L_0x00b3;
            case 56: goto L_0x00bb;
            case 64: goto L_0x00c3;
            case 72: goto L_0x00f6;
            case 82: goto L_0x00fe;
            case 90: goto L_0x0112;
            case 98: goto L_0x0127;
            case 106: goto L_0x013c;
            case 114: goto L_0x0151;
            case 122: goto L_0x0166;
            case 130: goto L_0x017b;
            case 138: goto L_0x0190;
            case 146: goto L_0x01a5;
            case 154: goto L_0x01bb;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.m33564f();
        r7.f34949b = r0;
        goto L_0x0001;
    L_0x0016:
        r0 = r8.m33567i();
        r7.f34950c = r0;
        goto L_0x0001;
    L_0x001d:
        r0 = 24;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f34951d;
        if (r0 != 0) goto L_0x0043;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r3 = r7.f34951d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0032:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0047;
    L_0x0037:
        r4 = r8.m33568j();
        r2[r0] = r4;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0032;
    L_0x0043:
        r0 = r7.f34951d;
        r0 = r0.length;
        goto L_0x0028;
    L_0x0047:
        r4 = r8.m33568j();
        r2[r0] = r4;
        r7.f34951d = r2;
        goto L_0x0001;
    L_0x0050:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x005d:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x0069;
    L_0x0063:
        r8.m33568j();
        r0 = r0 + 1;
        goto L_0x005d;
    L_0x0069:
        r8.m33562e(r2);
        r2 = r7.f34951d;
        if (r2 != 0) goto L_0x0087;
    L_0x0070:
        r2 = r1;
    L_0x0071:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x007b;
    L_0x0076:
        r4 = r7.f34951d;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x007b:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x008b;
    L_0x007e:
        r4 = r8.m33568j();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x007b;
    L_0x0087:
        r2 = r7.f34951d;
        r2 = r2.length;
        goto L_0x0071;
    L_0x008b:
        r7.f34951d = r0;
        r8.m33561d(r3);
        goto L_0x0001;
    L_0x0092:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r3 = com.google.p443h.p451c.p455b.p456a.C7152a.m32436a(r3);	 Catch:{ IllegalArgumentException -> 0x00a2 }
        r7.f34952e = r3;	 Catch:{ IllegalArgumentException -> 0x00a2 }
        goto L_0x0001;
    L_0x00a2:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00ab:
        r0 = r8.m33567i();
        r7.f34953f = r0;
        goto L_0x0001;
    L_0x00b3:
        r0 = r8.m33567i();
        r7.f34954g = r0;
        goto L_0x0001;
    L_0x00bb:
        r2 = r8.m33568j();
        r7.f34955h = r2;
        goto L_0x0001;
    L_0x00c3:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        switch(r3) {
            case 0: goto L_0x00f2;
            case 1: goto L_0x00f2;
            case 2: goto L_0x00f2;
            case 3: goto L_0x00f2;
            case 4: goto L_0x00f2;
            case 5: goto L_0x00f2;
            default: goto L_0x00ce;
        };	 Catch:{ IllegalArgumentException -> 0x00e9 }
    L_0x00ce:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5 = 38;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5 = " is not a valid enum Result";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00e9 }
    L_0x00e9:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00f2:
        r7.f34956i = r3;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        goto L_0x0001;
    L_0x00f6:
        r0 = r8.m33567i();
        r7.f34957j = r0;
        goto L_0x0001;
    L_0x00fe:
        r0 = r7.f34958k;
        if (r0 != 0) goto L_0x0109;
    L_0x0102:
        r0 = new com.google.h.c.b.a.d;
        r0.<init>();
        r7.f34958k = r0;
    L_0x0109:
        r0 = r7.f34958k;
        r8.m33552a(r0);
        r7.f34948a = r1;
        goto L_0x0001;
    L_0x0112:
        r0 = r7.f34959l;
        if (r0 != 0) goto L_0x011d;
    L_0x0116:
        r0 = new com.google.h.c.b.a.f;
        r0.<init>();
        r7.f34959l = r0;
    L_0x011d:
        r0 = r7.f34959l;
        r8.m33552a(r0);
        r0 = 1;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x0127:
        r0 = r7.f34960m;
        if (r0 != 0) goto L_0x0132;
    L_0x012b:
        r0 = new com.google.h.c.b.a.b;
        r0.<init>();
        r7.f34960m = r0;
    L_0x0132:
        r0 = r7.f34960m;
        r8.m33552a(r0);
        r0 = 2;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x013c:
        r0 = r7.f34961n;
        if (r0 != 0) goto L_0x0147;
    L_0x0140:
        r0 = new com.google.h.c.b.a.m;
        r0.<init>();
        r7.f34961n = r0;
    L_0x0147:
        r0 = r7.f34961n;
        r8.m33552a(r0);
        r0 = 3;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x0151:
        r0 = r7.f34962o;
        if (r0 != 0) goto L_0x015c;
    L_0x0155:
        r0 = new com.google.h.c.b.a.c;
        r0.<init>();
        r7.f34962o = r0;
    L_0x015c:
        r0 = r7.f34962o;
        r8.m33552a(r0);
        r0 = 4;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x0166:
        r0 = r7.f34963p;
        if (r0 != 0) goto L_0x0171;
    L_0x016a:
        r0 = new com.google.h.c.b.a.k;
        r0.<init>();
        r7.f34963p = r0;
    L_0x0171:
        r0 = r7.f34963p;
        r8.m33552a(r0);
        r0 = 5;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x017b:
        r0 = r7.f34964q;
        if (r0 != 0) goto L_0x0186;
    L_0x017f:
        r0 = new com.google.h.c.b.a.i;
        r0.<init>();
        r7.f34964q = r0;
    L_0x0186:
        r0 = r7.f34964q;
        r8.m33552a(r0);
        r0 = 6;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x0190:
        r0 = r7.f34965r;
        if (r0 != 0) goto L_0x019b;
    L_0x0194:
        r0 = new com.google.h.c.b.a.j;
        r0.<init>();
        r7.f34965r = r0;
    L_0x019b:
        r0 = r7.f34965r;
        r8.m33552a(r0);
        r0 = 7;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x01a5:
        r0 = r7.f34966s;
        if (r0 != 0) goto L_0x01b0;
    L_0x01a9:
        r0 = new com.google.h.c.b.a.n;
        r0.<init>();
        r7.f34966s = r0;
    L_0x01b0:
        r0 = r7.f34966s;
        r8.m33552a(r0);
        r0 = 8;
        r7.f34948a = r0;
        goto L_0x0001;
    L_0x01bb:
        r0 = r7.f34967t;
        if (r0 != 0) goto L_0x01c6;
    L_0x01bf:
        r0 = new com.google.h.c.b.a.l;
        r0.<init>();
        r7.f34967t = r0;
    L_0x01c6:
        r0 = r7.f34967t;
        r8.m33552a(r0);
        r0 = 9;
        r7.f34948a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.b.a.e.b(com.google.protobuf.nano.a):com.google.h.c.b.a.e");
    }

    public final /* synthetic */ i m32454a(C7213a c7213a) {
        return m32449b(c7213a);
    }
}
