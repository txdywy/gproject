package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class df extends b {
    public int f37420a;
    public float f37421b;
    public int f37422c;
    public dg f37423d;
    public int f37424e;
    public int f37425f;
    public int f37426g;
    public int f37427h;
    public int f37428i;
    public int[] f37429j;
    public boolean f37430k;
    public int[] f37431l;
    public int[] f37432m;
    public bd f37433n;
    public bd f37434o;
    public bd f37435p;
    public bd f37436q;
    public eh f37437r;
    public eh f37438s;
    public eh f37439t;
    public eh f37440u;
    public float f37441v;
    public int f37442w;

    public final df m35360a(float f) {
        this.f37420a |= 1;
        this.f37421b = f;
        return this;
    }

    public df() {
        this.f37420a = 0;
        this.f37421b = 0.0f;
        this.f37422c = 0;
        this.f37423d = null;
        this.f37424e = 0;
        this.f37425f = 0;
        this.f37426g = 0;
        this.f37427h = 0;
        this.f37428i = 0;
        this.f37429j = C7222l.f35472e;
        this.f37430k = false;
        this.f37431l = C7222l.f35472e;
        this.f37432m = C7222l.f35472e;
        this.f37433n = null;
        this.f37434o = null;
        this.f37435p = null;
        this.f37436q = null;
        this.f37437r = null;
        this.f37438s = null;
        this.f37439t = null;
        this.f37440u = null;
        this.f37441v = 0.0f;
        this.f37442w = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35361a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f37420a & 1) != 0) {
            codedOutputByteBufferNano.m33517a(1, this.f37421b);
        }
        if ((this.f37420a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37424e);
        }
        if ((this.f37420a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37425f);
        }
        if ((this.f37420a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37426g);
        }
        if ((this.f37420a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37427h);
        }
        if ((this.f37420a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37428i);
        }
        if (this.f37429j != null && this.f37429j.length > 0) {
            for (int a : this.f37429j) {
                codedOutputByteBufferNano.m33518a(17, a);
            }
        }
        if ((this.f37420a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(18, this.f37430k);
        }
        if (this.f37433n != null) {
            codedOutputByteBufferNano.m33532b(19, this.f37433n);
        }
        if (this.f37434o != null) {
            codedOutputByteBufferNano.m33532b(20, this.f37434o);
        }
        if (this.f37435p != null) {
            codedOutputByteBufferNano.m33532b(21, this.f37435p);
        }
        if (this.f37436q != null) {
            codedOutputByteBufferNano.m33532b(22, this.f37436q);
        }
        if ((this.f37420a & 256) != 0) {
            codedOutputByteBufferNano.m33517a(23, this.f37441v);
        }
        if (this.f37431l != null && this.f37431l.length > 0) {
            for (int a2 : this.f37431l) {
                codedOutputByteBufferNano.m33518a(24, a2);
            }
        }
        if (this.f37432m != null && this.f37432m.length > 0) {
            while (i < this.f37432m.length) {
                codedOutputByteBufferNano.m33518a(25, this.f37432m[i]);
                i++;
            }
        }
        if ((this.f37420a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(26, this.f37422c);
        }
        if ((this.f37420a & 512) != 0) {
            codedOutputByteBufferNano.m33518a(27, this.f37442w);
        }
        if (this.f37423d != null) {
            codedOutputByteBufferNano.m33532b(28, this.f37423d);
        }
        if (this.f37437r != null) {
            codedOutputByteBufferNano.m33532b(29, this.f37437r);
        }
        if (this.f37438s != null) {
            codedOutputByteBufferNano.m33532b(30, this.f37438s);
        }
        if (this.f37439t != null) {
            codedOutputByteBufferNano.m33532b(31, this.f37439t);
        }
        if (this.f37440u != null) {
            codedOutputByteBufferNano.m33532b(32, this.f37440u);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35362b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if ((this.f37420a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 4;
        }
        if ((this.f37420a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37424e);
        }
        if ((this.f37420a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37425f);
        }
        if ((this.f37420a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f37426g);
        }
        if ((this.f37420a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37427h);
        }
        if ((this.f37420a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37428i);
        }
        if (this.f37429j != null && this.f37429j.length > 0) {
            i = 0;
            for (int c : this.f37429j) {
                i += CodedOutputByteBufferNano.m33498c(c);
            }
            b = (b + i) + (this.f37429j.length * 2);
        }
        if ((this.f37420a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(18) + 1;
        }
        if (this.f37433n != null) {
            b += CodedOutputByteBufferNano.m33503d(19, this.f37433n);
        }
        if (this.f37434o != null) {
            b += CodedOutputByteBufferNano.m33503d(20, this.f37434o);
        }
        if (this.f37435p != null) {
            b += CodedOutputByteBufferNano.m33503d(21, this.f37435p);
        }
        if (this.f37436q != null) {
            b += CodedOutputByteBufferNano.m33503d(22, this.f37436q);
        }
        if ((this.f37420a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(23) + 4;
        }
        if (this.f37431l != null && this.f37431l.length > 0) {
            i = 0;
            for (int c2 : this.f37431l) {
                i += CodedOutputByteBufferNano.m33498c(c2);
            }
            b = (b + i) + (this.f37431l.length * 2);
        }
        if (this.f37432m != null && this.f37432m.length > 0) {
            i2 = 0;
            while (i3 < this.f37432m.length) {
                i2 += CodedOutputByteBufferNano.m33498c(this.f37432m[i3]);
                i3++;
            }
            b = (b + i2) + (this.f37432m.length * 2);
        }
        if ((this.f37420a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(26, this.f37422c);
        }
        if ((this.f37420a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33502d(27, this.f37442w);
        }
        if (this.f37423d != null) {
            b += CodedOutputByteBufferNano.m33503d(28, this.f37423d);
        }
        if (this.f37437r != null) {
            b += CodedOutputByteBufferNano.m33503d(29, this.f37437r);
        }
        if (this.f37438s != null) {
            b += CodedOutputByteBufferNano.m33503d(30, this.f37438s);
        }
        if (this.f37439t != null) {
            b += CodedOutputByteBufferNano.m33503d(31, this.f37439t);
        }
        if (this.f37440u != null) {
            return b + CodedOutputByteBufferNano.m33503d(32, this.f37440u);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.df m35358b(com.google.protobuf.nano.C7213a r12) {
        /*
        r11 = this;
        r10 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r9 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r8 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r1 = 0;
    L_0x0007:
        r3 = r12.m33550a();
        switch(r3) {
            case 0: goto L_0x0014;
            case 13: goto L_0x0015;
            case 16: goto L_0x0026;
            case 24: goto L_0x0033;
            case 32: goto L_0x0070;
            case 40: goto L_0x00af;
            case 48: goto L_0x00ee;
            case 136: goto L_0x00fc;
            case 138: goto L_0x014c;
            case 144: goto L_0x01a7;
            case 154: goto L_0x01b5;
            case 162: goto L_0x01c7;
            case 170: goto L_0x01d9;
            case 178: goto L_0x01eb;
            case 189: goto L_0x01fd;
            case 192: goto L_0x020f;
            case 194: goto L_0x025f;
            case 200: goto L_0x02ba;
            case 202: goto L_0x030a;
            case 208: goto L_0x0365;
            case 216: goto L_0x038a;
            case 226: goto L_0x03c9;
            case 234: goto L_0x03db;
            case 242: goto L_0x03ed;
            case 250: goto L_0x03ff;
            case 258: goto L_0x0411;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = super.a(r12, r3);
        if (r0 != 0) goto L_0x0007;
    L_0x0014:
        return r11;
    L_0x0015:
        r0 = r12.m33569k();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r11.f37421b = r0;
        r0 = r11.f37420a;
        r0 = r0 | 1;
        r11.f37420a = r0;
        goto L_0x0007;
    L_0x0026:
        r0 = r12.m33567i();
        r11.f37424e = r0;
        r0 = r11.f37420a;
        r0 = r0 | 4;
        r11.f37420a = r0;
        goto L_0x0007;
    L_0x0033:
        r0 = r11.f37420a;
        r0 = r0 | 8;
        r11.f37420a = r0;
        r0 = r12.m33573o();
        r2 = r12.m33567i();	 Catch:{ IllegalArgumentException -> 0x005f }
        switch(r2) {
            case 0: goto L_0x0067;
            case 1: goto L_0x0067;
            case 2: goto L_0x0067;
            case 3: goto L_0x0067;
            case 4: goto L_0x0067;
            case 5: goto L_0x0067;
            case 6: goto L_0x0067;
            case 7: goto L_0x0067;
            case 8: goto L_0x0067;
            case 9: goto L_0x0067;
            default: goto L_0x0044;
        };	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x0044:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x005f }
        r5 = 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x005f }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x005f }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x005f }
        r5 = " is not a valid enum FontFamily";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x005f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x005f }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x005f }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r2 = move-exception;
        r12.m33562e(r0);
        r11.a(r12, r3);
        goto L_0x0007;
    L_0x0067:
        r11.f37425f = r2;	 Catch:{ IllegalArgumentException -> 0x005f }
        r2 = r11.f37420a;	 Catch:{ IllegalArgumentException -> 0x005f }
        r2 = r2 | 8;
        r11.f37420a = r2;	 Catch:{ IllegalArgumentException -> 0x005f }
        goto L_0x0007;
    L_0x0070:
        r0 = r11.f37420a;
        r0 = r0 | 16;
        r11.f37420a = r0;
        r0 = r12.m33573o();
        r2 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x009c }
        switch(r2) {
            case 0: goto L_0x00a5;
            case 1: goto L_0x00a5;
            case 2: goto L_0x00a5;
            case 3: goto L_0x00a5;
            default: goto L_0x0081;
        };	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x0081:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009c }
        r5 = 41;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009c }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x009c }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x009c }
        r5 = " is not a valid enum TextStyle";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x009c }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x009c }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x009c }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x009c:
        r2 = move-exception;
        r12.m33562e(r0);
        r11.a(r12, r3);
        goto L_0x0007;
    L_0x00a5:
        r11.f37426g = r2;	 Catch:{ IllegalArgumentException -> 0x009c }
        r2 = r11.f37420a;	 Catch:{ IllegalArgumentException -> 0x009c }
        r2 = r2 | 16;
        r11.f37420a = r2;	 Catch:{ IllegalArgumentException -> 0x009c }
        goto L_0x0007;
    L_0x00af:
        r0 = r11.f37420a;
        r0 = r0 | 32;
        r11.f37420a = r0;
        r0 = r12.m33573o();
        r2 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x00db }
        switch(r2) {
            case 0: goto L_0x00e4;
            case 1: goto L_0x00e4;
            case 2: goto L_0x00e4;
            case 3: goto L_0x00e4;
            case 4: goto L_0x00e4;
            default: goto L_0x00c0;
        };	 Catch:{ IllegalArgumentException -> 0x00db }
    L_0x00c0:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00db }
        r5 = 41;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00db }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00db }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x00db }
        r5 = " is not a valid enum Ellipsize";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x00db }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00db }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00db }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00db }
    L_0x00db:
        r2 = move-exception;
        r12.m33562e(r0);
        r11.a(r12, r3);
        goto L_0x0007;
    L_0x00e4:
        r11.f37427h = r2;	 Catch:{ IllegalArgumentException -> 0x00db }
        r2 = r11.f37420a;	 Catch:{ IllegalArgumentException -> 0x00db }
        r2 = r2 | 32;
        r11.f37420a = r2;	 Catch:{ IllegalArgumentException -> 0x00db }
        goto L_0x0007;
    L_0x00ee:
        r0 = r12.m33560d();
        r11.f37428i = r0;
        r0 = r11.f37420a;
        r0 = r0 | 64;
        r11.f37420a = r0;
        goto L_0x0007;
    L_0x00fc:
        r4 = com.google.protobuf.nano.C7222l.m33624a(r12, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x0104:
        if (r2 >= r4) goto L_0x0126;
    L_0x0106:
        if (r2 == 0) goto L_0x010b;
    L_0x0108:
        r12.m33550a();
    L_0x010b:
        r6 = r12.m33573o();
        r7 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x011e }
        r7 = com.google.wireless.android.finsky.dfe.p505c.p506a.dk.m35375a(r7);	 Catch:{ IllegalArgumentException -> 0x011e }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x011e }
        r0 = r0 + 1;
    L_0x011b:
        r2 = r2 + 1;
        goto L_0x0104;
    L_0x011e:
        r7 = move-exception;
        r12.m33562e(r6);
        r11.a(r12, r3);
        goto L_0x011b;
    L_0x0126:
        if (r0 == 0) goto L_0x0007;
    L_0x0128:
        r2 = r11.f37429j;
        if (r2 != 0) goto L_0x0136;
    L_0x012c:
        r2 = r1;
    L_0x012d:
        if (r2 != 0) goto L_0x013a;
    L_0x012f:
        r3 = r5.length;
        if (r0 != r3) goto L_0x013a;
    L_0x0132:
        r11.f37429j = r5;
        goto L_0x0007;
    L_0x0136:
        r2 = r11.f37429j;
        r2 = r2.length;
        goto L_0x012d;
    L_0x013a:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0145;
    L_0x0140:
        r4 = r11.f37429j;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0145:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f37429j = r3;
        goto L_0x0007;
    L_0x014c:
        r0 = r12.m33567i();
        r3 = r12.m33558c(r0);
        r2 = r12.m33573o();
        r0 = r1;
    L_0x0159:
        r4 = r12.m33571m();
        if (r4 <= 0) goto L_0x0169;
    L_0x015f:
        r4 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x0429 }
        com.google.wireless.android.finsky.dfe.p505c.p506a.dk.m35375a(r4);	 Catch:{ IllegalArgumentException -> 0x0429 }
        r0 = r0 + 1;
        goto L_0x0159;
    L_0x0169:
        if (r0 == 0) goto L_0x01a2;
    L_0x016b:
        r12.m33562e(r2);
        r2 = r11.f37429j;
        if (r2 != 0) goto L_0x0194;
    L_0x0172:
        r2 = r1;
    L_0x0173:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x017d;
    L_0x0178:
        r4 = r11.f37429j;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x017d:
        r4 = r12.m33571m();
        if (r4 <= 0) goto L_0x01a0;
    L_0x0183:
        r4 = r12.m33573o();
        r5 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x0198 }
        r5 = com.google.wireless.android.finsky.dfe.p505c.p506a.dk.m35375a(r5);	 Catch:{ IllegalArgumentException -> 0x0198 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0198 }
        r2 = r2 + 1;
        goto L_0x017d;
    L_0x0194:
        r2 = r11.f37429j;
        r2 = r2.length;
        goto L_0x0173;
    L_0x0198:
        r5 = move-exception;
        r12.m33562e(r4);
        r11.a(r12, r8);
        goto L_0x017d;
    L_0x01a0:
        r11.f37429j = r0;
    L_0x01a2:
        r12.m33561d(r3);
        goto L_0x0007;
    L_0x01a7:
        r0 = r12.m33563e();
        r11.f37430k = r0;
        r0 = r11.f37420a;
        r0 = r0 | 128;
        r11.f37420a = r0;
        goto L_0x0007;
    L_0x01b5:
        r0 = r11.f37433n;
        if (r0 != 0) goto L_0x01c0;
    L_0x01b9:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r11.f37433n = r0;
    L_0x01c0:
        r0 = r11.f37433n;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x01c7:
        r0 = r11.f37434o;
        if (r0 != 0) goto L_0x01d2;
    L_0x01cb:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r11.f37434o = r0;
    L_0x01d2:
        r0 = r11.f37434o;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x01d9:
        r0 = r11.f37435p;
        if (r0 != 0) goto L_0x01e4;
    L_0x01dd:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r11.f37435p = r0;
    L_0x01e4:
        r0 = r11.f37435p;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x01eb:
        r0 = r11.f37436q;
        if (r0 != 0) goto L_0x01f6;
    L_0x01ef:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r11.f37436q = r0;
    L_0x01f6:
        r0 = r11.f37436q;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x01fd:
        r0 = r12.m33569k();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r11.f37441v = r0;
        r0 = r11.f37420a;
        r0 = r0 | 256;
        r11.f37420a = r0;
        goto L_0x0007;
    L_0x020f:
        r4 = com.google.protobuf.nano.C7222l.m33624a(r12, r9);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x0217:
        if (r2 >= r4) goto L_0x0239;
    L_0x0219:
        if (r2 == 0) goto L_0x021e;
    L_0x021b:
        r12.m33550a();
    L_0x021e:
        r6 = r12.m33573o();
        r7 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x0231 }
        r7 = com.google.wireless.android.finsky.dfe.p505c.p506a.dl.m35377a(r7);	 Catch:{ IllegalArgumentException -> 0x0231 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0231 }
        r0 = r0 + 1;
    L_0x022e:
        r2 = r2 + 1;
        goto L_0x0217;
    L_0x0231:
        r7 = move-exception;
        r12.m33562e(r6);
        r11.a(r12, r3);
        goto L_0x022e;
    L_0x0239:
        if (r0 == 0) goto L_0x0007;
    L_0x023b:
        r2 = r11.f37431l;
        if (r2 != 0) goto L_0x0249;
    L_0x023f:
        r2 = r1;
    L_0x0240:
        if (r2 != 0) goto L_0x024d;
    L_0x0242:
        r3 = r5.length;
        if (r0 != r3) goto L_0x024d;
    L_0x0245:
        r11.f37431l = r5;
        goto L_0x0007;
    L_0x0249:
        r2 = r11.f37431l;
        r2 = r2.length;
        goto L_0x0240;
    L_0x024d:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0258;
    L_0x0253:
        r4 = r11.f37431l;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0258:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f37431l = r3;
        goto L_0x0007;
    L_0x025f:
        r0 = r12.m33567i();
        r3 = r12.m33558c(r0);
        r2 = r12.m33573o();
        r0 = r1;
    L_0x026c:
        r4 = r12.m33571m();
        if (r4 <= 0) goto L_0x027c;
    L_0x0272:
        r4 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x0426 }
        com.google.wireless.android.finsky.dfe.p505c.p506a.dl.m35377a(r4);	 Catch:{ IllegalArgumentException -> 0x0426 }
        r0 = r0 + 1;
        goto L_0x026c;
    L_0x027c:
        if (r0 == 0) goto L_0x02b5;
    L_0x027e:
        r12.m33562e(r2);
        r2 = r11.f37431l;
        if (r2 != 0) goto L_0x02a7;
    L_0x0285:
        r2 = r1;
    L_0x0286:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0290;
    L_0x028b:
        r4 = r11.f37431l;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0290:
        r4 = r12.m33571m();
        if (r4 <= 0) goto L_0x02b3;
    L_0x0296:
        r4 = r12.m33573o();
        r5 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x02ab }
        r5 = com.google.wireless.android.finsky.dfe.p505c.p506a.dl.m35377a(r5);	 Catch:{ IllegalArgumentException -> 0x02ab }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x02ab }
        r2 = r2 + 1;
        goto L_0x0290;
    L_0x02a7:
        r2 = r11.f37431l;
        r2 = r2.length;
        goto L_0x0286;
    L_0x02ab:
        r5 = move-exception;
        r12.m33562e(r4);
        r11.a(r12, r9);
        goto L_0x0290;
    L_0x02b3:
        r11.f37431l = r0;
    L_0x02b5:
        r12.m33561d(r3);
        goto L_0x0007;
    L_0x02ba:
        r4 = com.google.protobuf.nano.C7222l.m33624a(r12, r10);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x02c2:
        if (r2 >= r4) goto L_0x02e4;
    L_0x02c4:
        if (r2 == 0) goto L_0x02c9;
    L_0x02c6:
        r12.m33550a();
    L_0x02c9:
        r6 = r12.m33573o();
        r7 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x02dc }
        r7 = com.google.wireless.android.finsky.dfe.p505c.p506a.dl.m35377a(r7);	 Catch:{ IllegalArgumentException -> 0x02dc }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x02dc }
        r0 = r0 + 1;
    L_0x02d9:
        r2 = r2 + 1;
        goto L_0x02c2;
    L_0x02dc:
        r7 = move-exception;
        r12.m33562e(r6);
        r11.a(r12, r3);
        goto L_0x02d9;
    L_0x02e4:
        if (r0 == 0) goto L_0x0007;
    L_0x02e6:
        r2 = r11.f37432m;
        if (r2 != 0) goto L_0x02f4;
    L_0x02ea:
        r2 = r1;
    L_0x02eb:
        if (r2 != 0) goto L_0x02f8;
    L_0x02ed:
        r3 = r5.length;
        if (r0 != r3) goto L_0x02f8;
    L_0x02f0:
        r11.f37432m = r5;
        goto L_0x0007;
    L_0x02f4:
        r2 = r11.f37432m;
        r2 = r2.length;
        goto L_0x02eb;
    L_0x02f8:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0303;
    L_0x02fe:
        r4 = r11.f37432m;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0303:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f37432m = r3;
        goto L_0x0007;
    L_0x030a:
        r0 = r12.m33567i();
        r3 = r12.m33558c(r0);
        r2 = r12.m33573o();
        r0 = r1;
    L_0x0317:
        r4 = r12.m33571m();
        if (r4 <= 0) goto L_0x0327;
    L_0x031d:
        r4 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x0423 }
        com.google.wireless.android.finsky.dfe.p505c.p506a.dl.m35377a(r4);	 Catch:{ IllegalArgumentException -> 0x0423 }
        r0 = r0 + 1;
        goto L_0x0317;
    L_0x0327:
        if (r0 == 0) goto L_0x0360;
    L_0x0329:
        r12.m33562e(r2);
        r2 = r11.f37432m;
        if (r2 != 0) goto L_0x0352;
    L_0x0330:
        r2 = r1;
    L_0x0331:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x033b;
    L_0x0336:
        r4 = r11.f37432m;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x033b:
        r4 = r12.m33571m();
        if (r4 <= 0) goto L_0x035e;
    L_0x0341:
        r4 = r12.m33573o();
        r5 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x0356 }
        r5 = com.google.wireless.android.finsky.dfe.p505c.p506a.dl.m35377a(r5);	 Catch:{ IllegalArgumentException -> 0x0356 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0356 }
        r2 = r2 + 1;
        goto L_0x033b;
    L_0x0352:
        r2 = r11.f37432m;
        r2 = r2.length;
        goto L_0x0331;
    L_0x0356:
        r5 = move-exception;
        r12.m33562e(r4);
        r11.a(r12, r10);
        goto L_0x033b;
    L_0x035e:
        r11.f37432m = r0;
    L_0x0360:
        r12.m33561d(r3);
        goto L_0x0007;
    L_0x0365:
        r0 = r11.f37420a;
        r0 = r0 | 2;
        r11.f37420a = r0;
        r0 = r12.m33573o();
        r2 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x0381 }
        r2 = com.google.wireless.android.finsky.dfe.p505c.p506a.dh.m35367a(r2);	 Catch:{ IllegalArgumentException -> 0x0381 }
        r11.f37422c = r2;	 Catch:{ IllegalArgumentException -> 0x0381 }
        r2 = r11.f37420a;	 Catch:{ IllegalArgumentException -> 0x0381 }
        r2 = r2 | 2;
        r11.f37420a = r2;	 Catch:{ IllegalArgumentException -> 0x0381 }
        goto L_0x0007;
    L_0x0381:
        r2 = move-exception;
        r12.m33562e(r0);
        r11.a(r12, r3);
        goto L_0x0007;
    L_0x038a:
        r0 = r11.f37420a;
        r0 = r0 | 512;
        r11.f37420a = r0;
        r0 = r12.m33573o();
        r2 = r12.m33560d();	 Catch:{ IllegalArgumentException -> 0x03b6 }
        switch(r2) {
            case 0: goto L_0x03bf;
            case 1: goto L_0x03bf;
            case 2: goto L_0x03bf;
            default: goto L_0x039b;
        };	 Catch:{ IllegalArgumentException -> 0x03b6 }
    L_0x039b:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r5 = " is not a valid enum BreakStrategy";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x03b6 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x03b6 }
    L_0x03b6:
        r2 = move-exception;
        r12.m33562e(r0);
        r11.a(r12, r3);
        goto L_0x0007;
    L_0x03bf:
        r11.f37442w = r2;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r2 = r11.f37420a;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        r2 = r2 | 512;
        r11.f37420a = r2;	 Catch:{ IllegalArgumentException -> 0x03b6 }
        goto L_0x0007;
    L_0x03c9:
        r0 = r11.f37423d;
        if (r0 != 0) goto L_0x03d4;
    L_0x03cd:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.dg;
        r0.<init>();
        r11.f37423d = r0;
    L_0x03d4:
        r0 = r11.f37423d;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x03db:
        r0 = r11.f37437r;
        if (r0 != 0) goto L_0x03e6;
    L_0x03df:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.eh;
        r0.<init>();
        r11.f37437r = r0;
    L_0x03e6:
        r0 = r11.f37437r;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x03ed:
        r0 = r11.f37438s;
        if (r0 != 0) goto L_0x03f8;
    L_0x03f1:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.eh;
        r0.<init>();
        r11.f37438s = r0;
    L_0x03f8:
        r0 = r11.f37438s;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x03ff:
        r0 = r11.f37439t;
        if (r0 != 0) goto L_0x040a;
    L_0x0403:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.eh;
        r0.<init>();
        r11.f37439t = r0;
    L_0x040a:
        r0 = r11.f37439t;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x0411:
        r0 = r11.f37440u;
        if (r0 != 0) goto L_0x041c;
    L_0x0415:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.eh;
        r0.<init>();
        r11.f37440u = r0;
    L_0x041c:
        r0 = r11.f37440u;
        r12.m33552a(r0);
        goto L_0x0007;
    L_0x0423:
        r4 = move-exception;
        goto L_0x0317;
    L_0x0426:
        r4 = move-exception;
        goto L_0x026c;
    L_0x0429:
        r4 = move-exception;
        goto L_0x0159;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.df.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.df");
    }

    public final /* synthetic */ i m35359a(C7213a c7213a) {
        return m35358b(c7213a);
    }
}
