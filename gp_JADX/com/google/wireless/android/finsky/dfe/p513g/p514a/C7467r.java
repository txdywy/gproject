package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7467r extends b {
    public static volatile C7467r[] f37907b;
    public C7460k f37908A;
    public C7468s[] f37909B;
    public int f37910a;
    public int f37911c;
    public String f37912d;
    public int f37913e;
    public String f37914f;
    public String f37915g;
    public C7452c f37916h;
    public C7475z f37917i;
    public C7472w f37918j;
    public C7455f f37919k;
    public C7469t f37920l;
    public C7457h f37921m;
    public C7464o f37922n;
    public C7466q f37923o;
    public C7453d f37924p;
    public C7454e f37925q;
    public C7463n f37926r;
    public C7462m f37927s;
    public C7451b f37928t;
    public C7474y f37929u;
    public C7473x f37930v;
    public byte[] f37931w;
    public ag f37932x;
    public int f37933y;
    public int f37934z;

    public static C7467r[] m35670d() {
        if (f37907b == null) {
            synchronized (C7219h.f35465b) {
                if (f37907b == null) {
                    f37907b = new C7467r[0];
                }
            }
        }
        return f37907b;
    }

    public final boolean m35675e() {
        return (this.f37911c & 8) != 0;
    }

    public final C7467r m35672a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f37911c |= 8;
        this.f37915g = str;
        return this;
    }

    public final C7452c m35676f() {
        if (this.f37910a == 0) {
            return this.f37916h;
        }
        return null;
    }

    public final C7475z m35677g() {
        if (this.f37910a == 1) {
            return this.f37917i;
        }
        return null;
    }

    public final C7472w m35678h() {
        if (this.f37910a == 2) {
            return this.f37918j;
        }
        return null;
    }

    public final C7455f m35679i() {
        if (this.f37910a == 3) {
            return this.f37919k;
        }
        return null;
    }

    public final C7469t m35680j() {
        if (this.f37910a == 4) {
            return this.f37920l;
        }
        return null;
    }

    public final C7464o m35681k() {
        if (this.f37910a == 6) {
            return this.f37922n;
        }
        return null;
    }

    public final C7466q m35682l() {
        if (this.f37910a == 7) {
            return this.f37923o;
        }
        return null;
    }

    public final C7453d m35683o() {
        if (this.f37910a == 8) {
            return this.f37924p;
        }
        return null;
    }

    public final C7463n m35684p() {
        if (this.f37910a == 10) {
            return this.f37926r;
        }
        return null;
    }

    public final C7462m m35685q() {
        if (this.f37910a == 11) {
            return this.f37927s;
        }
        return null;
    }

    public final C7451b m35686r() {
        if (this.f37910a == 12) {
            return this.f37928t;
        }
        return null;
    }

    public final C7474y m35687s() {
        if (this.f37910a == 13) {
            return this.f37929u;
        }
        return null;
    }

    public final C7473x m35688t() {
        if (this.f37910a == 14) {
            return this.f37930v;
        }
        return null;
    }

    public C7467r() {
        this.f37910a = -1;
        this.f37911c = 0;
        this.f37912d = "";
        this.f37913e = 0;
        this.f37914f = "";
        this.f37915g = "";
        this.f37910a = -1;
        this.f37916h = null;
        this.f37910a = -1;
        this.f37917i = null;
        this.f37910a = -1;
        this.f37918j = null;
        this.f37910a = -1;
        this.f37919k = null;
        this.f37910a = -1;
        this.f37920l = null;
        this.f37910a = -1;
        this.f37921m = null;
        this.f37910a = -1;
        this.f37922n = null;
        this.f37910a = -1;
        this.f37923o = null;
        this.f37910a = -1;
        this.f37924p = null;
        this.f37910a = -1;
        this.f37925q = null;
        this.f37910a = -1;
        this.f37926r = null;
        this.f37910a = -1;
        this.f37927s = null;
        this.f37910a = -1;
        this.f37928t = null;
        this.f37910a = -1;
        this.f37929u = null;
        this.f37910a = -1;
        this.f37930v = null;
        this.f37931w = C7222l.f35479l;
        this.f37932x = null;
        this.f37933y = 1;
        this.f37934z = Integer.MAX_VALUE;
        this.f37908A = null;
        this.f37909B = C7468s.m35689d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35673a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37911c & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37912d);
        }
        if ((this.f37911c & 4) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37914f);
        }
        if (this.f37910a == 0) {
            codedOutputByteBufferNano.m33532b(3, this.f37916h);
        }
        if (this.f37910a == 1) {
            codedOutputByteBufferNano.m33532b(4, this.f37917i);
        }
        if (this.f37910a == 3) {
            codedOutputByteBufferNano.m33532b(5, this.f37919k);
        }
        if (this.f37910a == 6) {
            codedOutputByteBufferNano.m33532b(6, this.f37922n);
        }
        if (this.f37910a == 8) {
            codedOutputByteBufferNano.m33532b(10, this.f37924p);
        }
        if (this.f37910a == 10) {
            codedOutputByteBufferNano.m33532b(12, this.f37926r);
        }
        if (this.f37910a == 7) {
            codedOutputByteBufferNano.m33532b(17, this.f37923o);
        }
        if ((this.f37911c & 16) != 0) {
            codedOutputByteBufferNano.m33523a(18, this.f37931w);
        }
        if ((this.f37911c & 2) != 0) {
            codedOutputByteBufferNano.m33518a(19, this.f37913e);
        }
        if (this.f37910a == 11) {
            codedOutputByteBufferNano.m33532b(20, this.f37927s);
        }
        if (this.f37932x != null) {
            codedOutputByteBufferNano.m33532b(21, this.f37932x);
        }
        if (this.f37910a == 4) {
            codedOutputByteBufferNano.m33532b(22, this.f37920l);
        }
        if ((this.f37911c & 32) != 0) {
            codedOutputByteBufferNano.m33518a(23, this.f37933y);
        }
        if ((this.f37911c & 64) != 0) {
            codedOutputByteBufferNano.m33518a(24, this.f37934z);
        }
        if (this.f37908A != null) {
            codedOutputByteBufferNano.m33532b(27, this.f37908A);
        }
        if (this.f37910a == 13) {
            codedOutputByteBufferNano.m33532b(28, this.f37929u);
        }
        if (this.f37910a == 12) {
            codedOutputByteBufferNano.m33532b(29, this.f37928t);
        }
        if (this.f37910a == 9) {
            codedOutputByteBufferNano.m33532b(32, this.f37925q);
        }
        if (this.f37910a == 5) {
            codedOutputByteBufferNano.m33532b(33, this.f37921m);
        }
        if (this.f37910a == 14) {
            codedOutputByteBufferNano.m33532b(34, this.f37930v);
        }
        if (this.f37909B != null && this.f37909B.length > 0) {
            for (i iVar : this.f37909B) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(36, iVar);
                }
            }
        }
        if ((this.f37911c & 8) != 0) {
            codedOutputByteBufferNano.m33521a(37, this.f37915g);
        }
        if (this.f37910a == 2) {
            codedOutputByteBufferNano.m33532b(38, this.f37918j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35674b() {
        int b = super.b();
        if ((this.f37911c & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37912d);
        }
        if ((this.f37911c & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37914f);
        }
        if (this.f37910a == 0) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37916h);
        }
        if (this.f37910a == 1) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37917i);
        }
        if (this.f37910a == 3) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37919k);
        }
        if (this.f37910a == 6) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37922n);
        }
        if (this.f37910a == 8) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f37924p);
        }
        if (this.f37910a == 10) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f37926r);
        }
        if (this.f37910a == 7) {
            b += CodedOutputByteBufferNano.m33503d(17, this.f37923o);
        }
        if ((this.f37911c & 16) != 0) {
            b += CodedOutputByteBufferNano.m33494b(18, this.f37931w);
        }
        if ((this.f37911c & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(19, this.f37913e);
        }
        if (this.f37910a == 11) {
            b += CodedOutputByteBufferNano.m33503d(20, this.f37927s);
        }
        if (this.f37932x != null) {
            b += CodedOutputByteBufferNano.m33503d(21, this.f37932x);
        }
        if (this.f37910a == 4) {
            b += CodedOutputByteBufferNano.m33503d(22, this.f37920l);
        }
        if ((this.f37911c & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(23, this.f37933y);
        }
        if ((this.f37911c & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(24, this.f37934z);
        }
        if (this.f37908A != null) {
            b += CodedOutputByteBufferNano.m33503d(27, this.f37908A);
        }
        if (this.f37910a == 13) {
            b += CodedOutputByteBufferNano.m33503d(28, this.f37929u);
        }
        if (this.f37910a == 12) {
            b += CodedOutputByteBufferNano.m33503d(29, this.f37928t);
        }
        if (this.f37910a == 9) {
            b += CodedOutputByteBufferNano.m33503d(32, this.f37925q);
        }
        if (this.f37910a == 5) {
            b += CodedOutputByteBufferNano.m33503d(33, this.f37921m);
        }
        if (this.f37910a == 14) {
            b += CodedOutputByteBufferNano.m33503d(34, this.f37930v);
        }
        if (this.f37909B != null && this.f37909B.length > 0) {
            int i = b;
            for (i iVar : this.f37909B) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(36, iVar);
                }
            }
            b = i;
        }
        if ((this.f37911c & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(37, this.f37915g);
        }
        if (this.f37910a == 2) {
            return b + CodedOutputByteBufferNano.m33503d(38, this.f37918j);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p513g.p514a.C7467r m35669b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x001c;
            case 26: goto L_0x0029;
            case 34: goto L_0x003c;
            case 42: goto L_0x0050;
            case 50: goto L_0x0064;
            case 82: goto L_0x0078;
            case 98: goto L_0x008e;
            case 138: goto L_0x00a4;
            case 146: goto L_0x00b9;
            case 152: goto L_0x00c7;
            case 162: goto L_0x0106;
            case 170: goto L_0x011c;
            case 178: goto L_0x012e;
            case 184: goto L_0x0143;
            case 192: goto L_0x0151;
            case 218: goto L_0x015f;
            case 226: goto L_0x0171;
            case 234: goto L_0x0187;
            case 258: goto L_0x019d;
            case 266: goto L_0x01b3;
            case 274: goto L_0x01c8;
            case 290: goto L_0x01de;
            case 298: goto L_0x021e;
            case 306: goto L_0x022c;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.m33564f();
        r7.f37912d = r0;
        r0 = r7.f37911c;
        r0 = r0 | 1;
        r7.f37911c = r0;
        goto L_0x0001;
    L_0x001c:
        r0 = r8.m33564f();
        r7.f37914f = r0;
        r0 = r7.f37911c;
        r0 = r0 | 4;
        r7.f37911c = r0;
        goto L_0x0001;
    L_0x0029:
        r0 = r7.f37916h;
        if (r0 != 0) goto L_0x0034;
    L_0x002d:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.c;
        r0.<init>();
        r7.f37916h = r0;
    L_0x0034:
        r0 = r7.f37916h;
        r8.m33552a(r0);
        r7.f37910a = r1;
        goto L_0x0001;
    L_0x003c:
        r0 = r7.f37917i;
        if (r0 != 0) goto L_0x0047;
    L_0x0040:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.z;
        r0.<init>();
        r7.f37917i = r0;
    L_0x0047:
        r0 = r7.f37917i;
        r8.m33552a(r0);
        r0 = 1;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x0050:
        r0 = r7.f37919k;
        if (r0 != 0) goto L_0x005b;
    L_0x0054:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.f;
        r0.<init>();
        r7.f37919k = r0;
    L_0x005b:
        r0 = r7.f37919k;
        r8.m33552a(r0);
        r0 = 3;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x0064:
        r0 = r7.f37922n;
        if (r0 != 0) goto L_0x006f;
    L_0x0068:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.o;
        r0.<init>();
        r7.f37922n = r0;
    L_0x006f:
        r0 = r7.f37922n;
        r8.m33552a(r0);
        r0 = 6;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x0078:
        r0 = r7.f37924p;
        if (r0 != 0) goto L_0x0083;
    L_0x007c:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.d;
        r0.<init>();
        r7.f37924p = r0;
    L_0x0083:
        r0 = r7.f37924p;
        r8.m33552a(r0);
        r0 = 8;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x008e:
        r0 = r7.f37926r;
        if (r0 != 0) goto L_0x0099;
    L_0x0092:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.n;
        r0.<init>();
        r7.f37926r = r0;
    L_0x0099:
        r0 = r7.f37926r;
        r8.m33552a(r0);
        r0 = 10;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x00a4:
        r0 = r7.f37923o;
        if (r0 != 0) goto L_0x00af;
    L_0x00a8:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.q;
        r0.<init>();
        r7.f37923o = r0;
    L_0x00af:
        r0 = r7.f37923o;
        r8.m33552a(r0);
        r0 = 7;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x00b9:
        r0 = r8.m33565g();
        r7.f37931w = r0;
        r0 = r7.f37911c;
        r0 = r0 | 16;
        r7.f37911c = r0;
        goto L_0x0001;
    L_0x00c7:
        r2 = r7.f37911c;
        r2 = r2 | 2;
        r7.f37911c = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00f3 }
        switch(r3) {
            case 0: goto L_0x00fc;
            case 101: goto L_0x00fc;
            case 102: goto L_0x00fc;
            case 103: goto L_0x00fc;
            case 105: goto L_0x00fc;
            case 106: goto L_0x00fc;
            case 107: goto L_0x00fc;
            case 108: goto L_0x00fc;
            case 109: goto L_0x00fc;
            case 111: goto L_0x00fc;
            case 112: goto L_0x00fc;
            case 113: goto L_0x00fc;
            case 114: goto L_0x00fc;
            case 115: goto L_0x00fc;
            case 116: goto L_0x00fc;
            case 117: goto L_0x00fc;
            case 118: goto L_0x00fc;
            case 119: goto L_0x00fc;
            case 120: goto L_0x00fc;
            case 201: goto L_0x00fc;
            case 202: goto L_0x00fc;
            case 203: goto L_0x00fc;
            case 204: goto L_0x00fc;
            case 205: goto L_0x00fc;
            case 206: goto L_0x00fc;
            case 207: goto L_0x00fc;
            case 209: goto L_0x00fc;
            case 210: goto L_0x00fc;
            case 211: goto L_0x00fc;
            case 212: goto L_0x00fc;
            case 213: goto L_0x00fc;
            case 214: goto L_0x00fc;
            case 215: goto L_0x00fc;
            case 217: goto L_0x00fc;
            case 218: goto L_0x00fc;
            case 219: goto L_0x00fc;
            case 220: goto L_0x00fc;
            case 221: goto L_0x00fc;
            case 222: goto L_0x00fc;
            case 223: goto L_0x00fc;
            case 224: goto L_0x00fc;
            case 301: goto L_0x00fc;
            case 302: goto L_0x00fc;
            case 304: goto L_0x00fc;
            case 305: goto L_0x00fc;
            case 307: goto L_0x00fc;
            case 309: goto L_0x00fc;
            case 310: goto L_0x00fc;
            case 311: goto L_0x00fc;
            case 312: goto L_0x00fc;
            case 313: goto L_0x00fc;
            case 314: goto L_0x00fc;
            case 316: goto L_0x00fc;
            case 317: goto L_0x00fc;
            case 318: goto L_0x00fc;
            case 319: goto L_0x00fc;
            case 320: goto L_0x00fc;
            case 321: goto L_0x00fc;
            case 322: goto L_0x00fc;
            case 323: goto L_0x00fc;
            case 324: goto L_0x00fc;
            case 325: goto L_0x00fc;
            case 326: goto L_0x00fc;
            case 327: goto L_0x00fc;
            case 328: goto L_0x00fc;
            case 401: goto L_0x00fc;
            case 402: goto L_0x00fc;
            case 403: goto L_0x00fc;
            case 404: goto L_0x00fc;
            case 405: goto L_0x00fc;
            case 406: goto L_0x00fc;
            case 407: goto L_0x00fc;
            case 408: goto L_0x00fc;
            case 409: goto L_0x00fc;
            case 410: goto L_0x00fc;
            case 411: goto L_0x00fc;
            case 412: goto L_0x00fc;
            case 501: goto L_0x00fc;
            case 502: goto L_0x00fc;
            case 503: goto L_0x00fc;
            case 504: goto L_0x00fc;
            case 505: goto L_0x00fc;
            case 506: goto L_0x00fc;
            case 507: goto L_0x00fc;
            case 508: goto L_0x00fc;
            case 509: goto L_0x00fc;
            case 510: goto L_0x00fc;
            case 511: goto L_0x00fc;
            case 512: goto L_0x00fc;
            case 513: goto L_0x00fc;
            case 514: goto L_0x00fc;
            case 515: goto L_0x00fc;
            case 601: goto L_0x00fc;
            case 701: goto L_0x00fc;
            case 702: goto L_0x00fc;
            case 703: goto L_0x00fc;
            case 704: goto L_0x00fc;
            case 705: goto L_0x00fc;
            case 706: goto L_0x00fc;
            case 707: goto L_0x00fc;
            case 708: goto L_0x00fc;
            case 709: goto L_0x00fc;
            case 710: goto L_0x00fc;
            case 711: goto L_0x00fc;
            case 801: goto L_0x00fc;
            case 802: goto L_0x00fc;
            case 803: goto L_0x00fc;
            case 804: goto L_0x00fc;
            case 805: goto L_0x00fc;
            case 806: goto L_0x00fc;
            case 807: goto L_0x00fc;
            case 808: goto L_0x00fc;
            case 809: goto L_0x00fc;
            case 810: goto L_0x00fc;
            case 811: goto L_0x00fc;
            case 812: goto L_0x00fc;
            case 901: goto L_0x00fc;
            case 902: goto L_0x00fc;
            case 903: goto L_0x00fc;
            case 904: goto L_0x00fc;
            case 905: goto L_0x00fc;
            case 906: goto L_0x00fc;
            case 907: goto L_0x00fc;
            case 908: goto L_0x00fc;
            case 909: goto L_0x00fc;
            case 910: goto L_0x00fc;
            case 911: goto L_0x00fc;
            case 912: goto L_0x00fc;
            case 913: goto L_0x00fc;
            case 914: goto L_0x00fc;
            case 915: goto L_0x00fc;
            case 916: goto L_0x00fc;
            case 1001: goto L_0x00fc;
            case 1002: goto L_0x00fc;
            default: goto L_0x00d8;
        };	 Catch:{ IllegalArgumentException -> 0x00f3 }
    L_0x00d8:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r5 = 44;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r5 = " is not a valid enum RelationType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00f3 }
    L_0x00f3:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00fc:
        r7.f37913e = r3;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r3 = r7.f37911c;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        r3 = r3 | 2;
        r7.f37911c = r3;	 Catch:{ IllegalArgumentException -> 0x00f3 }
        goto L_0x0001;
    L_0x0106:
        r0 = r7.f37927s;
        if (r0 != 0) goto L_0x0111;
    L_0x010a:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.m;
        r0.<init>();
        r7.f37927s = r0;
    L_0x0111:
        r0 = r7.f37927s;
        r8.m33552a(r0);
        r0 = 11;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x011c:
        r0 = r7.f37932x;
        if (r0 != 0) goto L_0x0127;
    L_0x0120:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ag;
        r0.<init>();
        r7.f37932x = r0;
    L_0x0127:
        r0 = r7.f37932x;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x012e:
        r0 = r7.f37920l;
        if (r0 != 0) goto L_0x0139;
    L_0x0132:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.t;
        r0.<init>();
        r7.f37920l = r0;
    L_0x0139:
        r0 = r7.f37920l;
        r8.m33552a(r0);
        r0 = 4;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x0143:
        r0 = r8.m33560d();
        r7.f37933y = r0;
        r0 = r7.f37911c;
        r0 = r0 | 32;
        r7.f37911c = r0;
        goto L_0x0001;
    L_0x0151:
        r0 = r8.m33560d();
        r7.f37934z = r0;
        r0 = r7.f37911c;
        r0 = r0 | 64;
        r7.f37911c = r0;
        goto L_0x0001;
    L_0x015f:
        r0 = r7.f37908A;
        if (r0 != 0) goto L_0x016a;
    L_0x0163:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.k;
        r0.<init>();
        r7.f37908A = r0;
    L_0x016a:
        r0 = r7.f37908A;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x0171:
        r0 = r7.f37929u;
        if (r0 != 0) goto L_0x017c;
    L_0x0175:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.y;
        r0.<init>();
        r7.f37929u = r0;
    L_0x017c:
        r0 = r7.f37929u;
        r8.m33552a(r0);
        r0 = 13;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x0187:
        r0 = r7.f37928t;
        if (r0 != 0) goto L_0x0192;
    L_0x018b:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.b;
        r0.<init>();
        r7.f37928t = r0;
    L_0x0192:
        r0 = r7.f37928t;
        r8.m33552a(r0);
        r0 = 12;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x019d:
        r0 = r7.f37925q;
        if (r0 != 0) goto L_0x01a8;
    L_0x01a1:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.e;
        r0.<init>();
        r7.f37925q = r0;
    L_0x01a8:
        r0 = r7.f37925q;
        r8.m33552a(r0);
        r0 = 9;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x01b3:
        r0 = r7.f37921m;
        if (r0 != 0) goto L_0x01be;
    L_0x01b7:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.h;
        r0.<init>();
        r7.f37921m = r0;
    L_0x01be:
        r0 = r7.f37921m;
        r8.m33552a(r0);
        r0 = 5;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x01c8:
        r0 = r7.f37930v;
        if (r0 != 0) goto L_0x01d3;
    L_0x01cc:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.x;
        r0.<init>();
        r7.f37930v = r0;
    L_0x01d3:
        r0 = r7.f37930v;
        r8.m33552a(r0);
        r0 = 14;
        r7.f37910a = r0;
        goto L_0x0001;
    L_0x01de:
        r0 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f37909B;
        if (r0 != 0) goto L_0x020a;
    L_0x01e8:
        r0 = r1;
    L_0x01e9:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.p513g.p514a.C7468s[r2];
        if (r0 == 0) goto L_0x01f3;
    L_0x01ee:
        r3 = r7.f37909B;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x01f3:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x020e;
    L_0x01f8:
        r3 = new com.google.wireless.android.finsky.dfe.g.a.s;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x01f3;
    L_0x020a:
        r0 = r7.f37909B;
        r0 = r0.length;
        goto L_0x01e9;
    L_0x020e:
        r3 = new com.google.wireless.android.finsky.dfe.g.a.s;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f37909B = r2;
        goto L_0x0001;
    L_0x021e:
        r0 = r8.m33564f();
        r7.f37915g = r0;
        r0 = r7.f37911c;
        r0 = r0 | 8;
        r7.f37911c = r0;
        goto L_0x0001;
    L_0x022c:
        r0 = r7.f37918j;
        if (r0 != 0) goto L_0x0237;
    L_0x0230:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.w;
        r0.<init>();
        r7.f37918j = r0;
    L_0x0237:
        r0 = r7.f37918j;
        r8.m33552a(r0);
        r0 = 2;
        r7.f37910a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.g.a.r.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.g.a.r");
    }

    public final /* synthetic */ i m35671a(C7213a c7213a) {
        return m35669b(c7213a);
    }
}
