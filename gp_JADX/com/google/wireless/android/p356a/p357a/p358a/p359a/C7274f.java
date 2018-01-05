package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7214c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7274f extends b implements Cloneable {
    public int f36048a;
    public String f36049b;
    public String f36050c;
    public C7270b f36051d;
    public C7275g f36052e;
    public C7277i f36053f;
    public C7282n f36054g;
    public C7283o f36055h;
    public C7281m f36056i;
    public C7279k f36057j;
    public C7284p f36058k;
    public C7273e f36059l;
    public C7278j f36060m;
    public C7272d f36061n;
    public long f36062o;

    public C7274f() {
        this.f36048a = 0;
        this.f36049b = "";
        this.f36050c = "";
        this.f36051d = null;
        this.f36052e = null;
        this.f36053f = null;
        this.f36054g = null;
        this.f36055h = null;
        this.f36056i = null;
        this.f36057j = null;
        this.f36058k = null;
        this.f36059l = null;
        this.f36060m = null;
        this.f36061n = null;
        this.f36062o = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7274f m34392d() {
        try {
            C7274f c7274f = (C7274f) super.cK_();
            if (this.f36051d != null) {
                c7274f.f36051d = (C7270b) this.f36051d.clone();
            }
            if (this.f36052e != null) {
                c7274f.f36052e = (C7275g) this.f36052e.clone();
            }
            if (this.f36053f != null) {
                c7274f.f36053f = (C7277i) this.f36053f.clone();
            }
            if (this.f36054g != null) {
                c7274f.f36054g = (C7282n) this.f36054g.clone();
            }
            if (this.f36055h != null) {
                c7274f.f36055h = (C7283o) this.f36055h.clone();
            }
            if (this.f36056i != null) {
                c7274f.f36056i = (C7281m) this.f36056i.clone();
            }
            if (this.f36057j != null) {
                c7274f.f36057j = (C7279k) this.f36057j.clone();
            }
            if (this.f36058k != null) {
                c7274f.f36058k = (C7284p) this.f36058k.clone();
            }
            if (this.f36059l != null) {
                c7274f.f36059l = (C7273e) this.f36059l.clone();
            }
            if (this.f36060m != null) {
                c7274f.f36060m = (C7278j) this.f36060m.clone();
            }
            if (this.f36061n != null) {
                c7274f.f36061n = (C7272d) this.f36061n.clone();
            }
            return c7274f;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7274f)) {
            return false;
        }
        C7274f c7274f = (C7274f) obj;
        if (this.f36048a != c7274f.f36048a) {
            return false;
        }
        if (this.f36049b == null) {
            if (c7274f.f36049b != null) {
                return false;
            }
        } else if (!this.f36049b.equals(c7274f.f36049b)) {
            return false;
        }
        if (this.f36050c == null) {
            if (c7274f.f36050c != null) {
                return false;
            }
        } else if (!this.f36050c.equals(c7274f.f36050c)) {
            return false;
        }
        if (this.f36051d == null) {
            if (c7274f.f36051d != null) {
                return false;
            }
        } else if (!this.f36051d.equals(c7274f.f36051d)) {
            return false;
        }
        if (this.f36052e == null) {
            if (c7274f.f36052e != null) {
                return false;
            }
        } else if (!this.f36052e.equals(c7274f.f36052e)) {
            return false;
        }
        if (this.f36053f == null) {
            if (c7274f.f36053f != null) {
                return false;
            }
        } else if (!this.f36053f.equals(c7274f.f36053f)) {
            return false;
        }
        if (this.f36054g == null) {
            if (c7274f.f36054g != null) {
                return false;
            }
        } else if (!this.f36054g.equals(c7274f.f36054g)) {
            return false;
        }
        if (this.f36055h == null) {
            if (c7274f.f36055h != null) {
                return false;
            }
        } else if (!this.f36055h.equals(c7274f.f36055h)) {
            return false;
        }
        if (this.f36056i == null) {
            if (c7274f.f36056i != null) {
                return false;
            }
        } else if (!this.f36056i.equals(c7274f.f36056i)) {
            return false;
        }
        if (this.f36057j == null) {
            if (c7274f.f36057j != null) {
                return false;
            }
        } else if (!this.f36057j.equals(c7274f.f36057j)) {
            return false;
        }
        if (this.f36058k == null) {
            if (c7274f.f36058k != null) {
                return false;
            }
        } else if (!this.f36058k.equals(c7274f.f36058k)) {
            return false;
        }
        if (this.f36059l == null) {
            if (c7274f.f36059l != null) {
                return false;
            }
        } else if (!this.f36059l.equals(c7274f.f36059l)) {
            return false;
        }
        if (this.f36060m == null) {
            if (c7274f.f36060m != null) {
                return false;
            }
        } else if (!this.f36060m.equals(c7274f.f36060m)) {
            return false;
        }
        if (this.f36061n == null) {
            if (c7274f.f36061n != null) {
                return false;
            }
        } else if (!this.f36061n.equals(c7274f.f36061n)) {
            return false;
        }
        if (this.f36062o != c7274f.f36062o) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7274f.aO);
        }
        if (c7274f.aO == null || c7274f.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f36050c == null ? 0 : this.f36050c.hashCode()) + (((this.f36049b == null ? 0 : this.f36049b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f36048a) * 31)) * 31);
        C7270b c7270b = this.f36051d;
        hashCode = (c7270b == null ? 0 : c7270b.hashCode()) + (hashCode * 31);
        C7275g c7275g = this.f36052e;
        hashCode = (c7275g == null ? 0 : c7275g.hashCode()) + (hashCode * 31);
        C7277i c7277i = this.f36053f;
        hashCode = (c7277i == null ? 0 : c7277i.hashCode()) + (hashCode * 31);
        C7282n c7282n = this.f36054g;
        hashCode = (c7282n == null ? 0 : c7282n.hashCode()) + (hashCode * 31);
        C7283o c7283o = this.f36055h;
        hashCode = (c7283o == null ? 0 : c7283o.hashCode()) + (hashCode * 31);
        C7281m c7281m = this.f36056i;
        hashCode = (c7281m == null ? 0 : c7281m.hashCode()) + (hashCode * 31);
        C7279k c7279k = this.f36057j;
        hashCode = (c7279k == null ? 0 : c7279k.hashCode()) + (hashCode * 31);
        C7284p c7284p = this.f36058k;
        hashCode = (c7284p == null ? 0 : c7284p.hashCode()) + (hashCode * 31);
        C7273e c7273e = this.f36059l;
        hashCode = (c7273e == null ? 0 : c7273e.hashCode()) + (hashCode * 31);
        C7278j c7278j = this.f36060m;
        hashCode = (c7278j == null ? 0 : c7278j.hashCode()) + (hashCode * 31);
        C7272d c7272d = this.f36061n;
        hashCode = ((((c7272d == null ? 0 : c7272d.hashCode()) + (hashCode * 31)) * 31) + ((int) (this.f36062o ^ (this.f36062o >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34394a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36048a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36048a);
        }
        if (this.f36051d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36051d);
        }
        if (this.f36052e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36052e);
        }
        if (this.f36053f != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36053f);
        }
        if (this.f36054g != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36054g);
        }
        if (!(this.f36049b == null || this.f36049b.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36049b);
        }
        if (!(this.f36050c == null || this.f36050c.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36050c);
        }
        if (this.f36055h != null) {
            codedOutputByteBufferNano.m33532b(8, this.f36055h);
        }
        if (this.f36059l != null) {
            codedOutputByteBufferNano.m33532b(9, this.f36059l);
        }
        if (this.f36056i != null) {
            codedOutputByteBufferNano.m33532b(10, this.f36056i);
        }
        if (this.f36060m != null) {
            codedOutputByteBufferNano.m33532b(11, this.f36060m);
        }
        if (this.f36062o != 0) {
            codedOutputByteBufferNano.m33531b(12, this.f36062o);
        }
        if (this.f36057j != null) {
            codedOutputByteBufferNano.m33532b(13, this.f36057j);
        }
        if (this.f36061n != null) {
            codedOutputByteBufferNano.m33532b(14, this.f36061n);
        }
        if (this.f36058k != null) {
            codedOutputByteBufferNano.m33532b(15, this.f36058k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34395b() {
        int b = super.b();
        if (this.f36048a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36048a);
        }
        if (this.f36051d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f36051d);
        }
        if (this.f36052e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36052e);
        }
        if (this.f36053f != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f36053f);
        }
        if (this.f36054g != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36054g);
        }
        if (!(this.f36049b == null || this.f36049b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36049b);
        }
        if (!(this.f36050c == null || this.f36050c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36050c);
        }
        if (this.f36055h != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f36055h);
        }
        if (this.f36059l != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f36059l);
        }
        if (this.f36056i != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f36056i);
        }
        if (this.f36060m != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f36060m);
        }
        if (this.f36062o != 0) {
            b += CodedOutputByteBufferNano.m33508f(12, this.f36062o);
        }
        if (this.f36057j != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f36057j);
        }
        if (this.f36061n != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f36061n);
        }
        if (this.f36058k != null) {
            return b + CodedOutputByteBufferNano.m33503d(15, this.f36058k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7274f m34391b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 26: goto L_0x0050;
            case 34: goto L_0x0061;
            case 42: goto L_0x0072;
            case 50: goto L_0x0084;
            case 58: goto L_0x008c;
            case 66: goto L_0x0094;
            case 74: goto L_0x00a6;
            case 82: goto L_0x00b8;
            case 90: goto L_0x00ca;
            case 96: goto L_0x00dc;
            case 106: goto L_0x00e4;
            case 114: goto L_0x00f6;
            case 122: goto L_0x0108;
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
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            case 10: goto L_0x003c;
            case 11: goto L_0x003c;
            case 12: goto L_0x003c;
            case 13: goto L_0x003c;
            case 14: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum ClientType";
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
        r6.f36048a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r6.f36051d;
        if (r0 != 0) goto L_0x004a;
    L_0x0043:
        r0 = new com.google.wireless.android.a.a.a.a.b;
        r0.<init>();
        r6.f36051d = r0;
    L_0x004a:
        r0 = r6.f36051d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0050:
        r0 = r6.f36052e;
        if (r0 != 0) goto L_0x005b;
    L_0x0054:
        r0 = new com.google.wireless.android.a.a.a.a.g;
        r0.<init>();
        r6.f36052e = r0;
    L_0x005b:
        r0 = r6.f36052e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0061:
        r0 = r6.f36053f;
        if (r0 != 0) goto L_0x006c;
    L_0x0065:
        r0 = new com.google.wireless.android.a.a.a.a.i;
        r0.<init>();
        r6.f36053f = r0;
    L_0x006c:
        r0 = r6.f36053f;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0072:
        r0 = r6.f36054g;
        if (r0 != 0) goto L_0x007d;
    L_0x0076:
        r0 = new com.google.wireless.android.a.a.a.a.n;
        r0.<init>();
        r6.f36054g = r0;
    L_0x007d:
        r0 = r6.f36054g;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0084:
        r0 = r7.m33564f();
        r6.f36049b = r0;
        goto L_0x0000;
    L_0x008c:
        r0 = r7.m33564f();
        r6.f36050c = r0;
        goto L_0x0000;
    L_0x0094:
        r0 = r6.f36055h;
        if (r0 != 0) goto L_0x009f;
    L_0x0098:
        r0 = new com.google.wireless.android.a.a.a.a.o;
        r0.<init>();
        r6.f36055h = r0;
    L_0x009f:
        r0 = r6.f36055h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00a6:
        r0 = r6.f36059l;
        if (r0 != 0) goto L_0x00b1;
    L_0x00aa:
        r0 = new com.google.wireless.android.a.a.a.a.e;
        r0.<init>();
        r6.f36059l = r0;
    L_0x00b1:
        r0 = r6.f36059l;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00b8:
        r0 = r6.f36056i;
        if (r0 != 0) goto L_0x00c3;
    L_0x00bc:
        r0 = new com.google.wireless.android.a.a.a.a.m;
        r0.<init>();
        r6.f36056i = r0;
    L_0x00c3:
        r0 = r6.f36056i;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00ca:
        r0 = r6.f36060m;
        if (r0 != 0) goto L_0x00d5;
    L_0x00ce:
        r0 = new com.google.wireless.android.a.a.a.a.j;
        r0.<init>();
        r6.f36060m = r0;
    L_0x00d5:
        r0 = r6.f36060m;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00dc:
        r0 = r7.m33559c();
        r6.f36062o = r0;
        goto L_0x0000;
    L_0x00e4:
        r0 = r6.f36057j;
        if (r0 != 0) goto L_0x00ef;
    L_0x00e8:
        r0 = new com.google.wireless.android.a.a.a.a.k;
        r0.<init>();
        r6.f36057j = r0;
    L_0x00ef:
        r0 = r6.f36057j;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00f6:
        r0 = r6.f36061n;
        if (r0 != 0) goto L_0x0101;
    L_0x00fa:
        r0 = new com.google.wireless.android.a.a.a.a.d;
        r0.<init>();
        r6.f36061n = r0;
    L_0x0101:
        r0 = r6.f36061n;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0108:
        r0 = r6.f36058k;
        if (r0 != 0) goto L_0x0113;
    L_0x010c:
        r0 = new com.google.wireless.android.a.a.a.a.p;
        r0.<init>();
        r6.f36058k = r0;
    L_0x0113:
        r0 = r6.f36058k;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.f.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.f");
    }

    public final /* synthetic */ b cK_() {
        return (C7274f) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7274f) clone();
    }

    public final /* synthetic */ i m34393a(C7213a c7213a) {
        return m34391b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m34392d();
    }

    static {
        C7214c.m33574a(C7274f.class, 530573498);
    }
}
