package com.google.p061a.p062a.p063a.p064a.p065a.p068b;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.l;
import f.a.a.a;

public final class C0763c extends C0758b {
    public long f4748A;
    public boolean f4749B;
    public a f4750C;
    public int[] f4751D;
    public C0761a[] f4752E;
    public int f4753a;
    public int f4754b;
    public String f4755c;
    public String f4756d;
    public String f4757e;
    public String f4758f;
    public int f4759g;
    public int f4760h;
    public float f4761i;
    public float f4762j;
    public int f4763k;
    public int f4764l;
    public String f4765m;
    public String f4766n;
    public String f4767o;
    public String f4768p;
    public long f4769q;
    public int[] f4770r;
    public String f4771s;
    public String f4772t;
    public String f4773u;
    public String f4774v;
    public boolean f4775w;
    public int f4776x;
    public long f4777y;
    public long f4778z;

    private static int m4937a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum PermissionState");
        }
    }

    private static int m4938b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum SystemFeature");
        }
    }

    private static int m4940c(int i) {
        switch (i) {
            case 0:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum AuthType");
        }
    }

    public C0763c() {
        this.f4753a = 0;
        this.f4754b = 0;
        this.f4755c = "";
        this.f4756d = "";
        this.f4757e = "";
        this.f4758f = "";
        this.f4759g = 0;
        this.f4760h = 0;
        this.f4761i = 0.0f;
        this.f4762j = 0.0f;
        this.f4763k = 0;
        this.f4764l = 0;
        this.f4765m = "";
        this.f4766n = "";
        this.f4767o = "";
        this.f4768p = "";
        this.f4769q = 0;
        this.f4770r = l.e;
        this.f4771s = "";
        this.f4772t = "";
        this.f4773u = "";
        this.f4774v = "";
        this.f4775w = false;
        this.f4776x = 0;
        this.f4777y = 0;
        this.f4778z = 0;
        this.f4748A = 0;
        this.f4749B = false;
        this.f4750C = null;
        this.f4751D = l.e;
        this.f4752E = C0761a.m4928a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f4755c == null || this.f4755c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4755c);
        }
        if (!(this.f4756d == null || this.f4756d.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f4756d);
        }
        if (!(this.f4757e == null || this.f4757e.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4757e);
        }
        if (!(this.f4758f == null || this.f4758f.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f4758f);
        }
        if (this.f4759g != 0) {
            codedOutputByteBufferNano.a(5, this.f4759g);
        }
        if (this.f4760h != 0) {
            codedOutputByteBufferNano.a(6, this.f4760h);
        }
        if (Float.floatToIntBits(this.f4761i) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(7, this.f4761i);
        }
        if (Float.floatToIntBits(this.f4762j) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(8, this.f4762j);
        }
        if (!(this.f4765m == null || this.f4765m.equals(""))) {
            codedOutputByteBufferNano.a(9, this.f4765m);
        }
        if (!(this.f4766n == null || this.f4766n.equals(""))) {
            codedOutputByteBufferNano.a(10, this.f4766n);
        }
        if (!(this.f4767o == null || this.f4767o.equals(""))) {
            codedOutputByteBufferNano.a(11, this.f4767o);
        }
        if (this.f4750C != null) {
            codedOutputByteBufferNano.b(12, this.f4750C);
        }
        if (!(this.f4768p == null || this.f4768p.equals(""))) {
            codedOutputByteBufferNano.a(13, this.f4768p);
        }
        if (!(this.f4771s == null || this.f4771s.equals(""))) {
            codedOutputByteBufferNano.a(14, this.f4771s);
        }
        if (this.f4764l != 0) {
            codedOutputByteBufferNano.a(15, this.f4764l);
        }
        if (this.f4753a != 0) {
            codedOutputByteBufferNano.a(16, this.f4753a);
        }
        if (!(this.f4772t == null || this.f4772t.equals(""))) {
            codedOutputByteBufferNano.a(17, this.f4772t);
        }
        if (!(this.f4773u == null || this.f4773u.equals(""))) {
            codedOutputByteBufferNano.a(18, this.f4773u);
        }
        if (this.f4777y != 0) {
            codedOutputByteBufferNano.b(19, this.f4777y);
        }
        if (this.f4769q != 0) {
            codedOutputByteBufferNano.b(20, this.f4769q);
        }
        if (this.f4770r != null && this.f4770r.length > 0) {
            int i2 = 0;
            for (int c : this.f4770r) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(170);
            codedOutputByteBufferNano.e(i2);
            for (int i22 : this.f4770r) {
                codedOutputByteBufferNano.e(i22);
            }
        }
        if (this.f4754b != 0) {
            codedOutputByteBufferNano.a(22, this.f4754b);
        }
        if (this.f4778z != 0) {
            codedOutputByteBufferNano.b(23, this.f4778z);
        }
        if (this.f4748A != 0) {
            codedOutputByteBufferNano.b(24, this.f4748A);
        }
        if (this.f4749B) {
            codedOutputByteBufferNano.a(25, this.f4749B);
        }
        if (this.f4751D != null && this.f4751D.length > 0) {
            for (int c2 : this.f4751D) {
                codedOutputByteBufferNano.a(26, c2);
            }
        }
        if (this.f4752E != null && this.f4752E.length > 0) {
            while (i < this.f4752E.length) {
                C0757i c0757i = this.f4752E[i];
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(27, c0757i);
                }
                i++;
            }
        }
        if (this.f4763k != 0) {
            codedOutputByteBufferNano.a(28, this.f4763k);
        }
        if (!(this.f4774v == null || this.f4774v.equals(""))) {
            codedOutputByteBufferNano.a(30, this.f4774v);
        }
        if (this.f4775w) {
            codedOutputByteBufferNano.a(31, this.f4775w);
        }
        if (this.f4776x != 0) {
            codedOutputByteBufferNano.a(32, this.f4776x);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (!(this.f4755c == null || this.f4755c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4755c);
        }
        if (!(this.f4756d == null || this.f4756d.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f4756d);
        }
        if (!(this.f4757e == null || this.f4757e.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f4757e);
        }
        if (!(this.f4758f == null || this.f4758f.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f4758f);
        }
        if (this.f4759g != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f4759g);
        }
        if (this.f4760h != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f4760h);
        }
        if (Float.floatToIntBits(this.f4761i) != Float.floatToIntBits(0.0f)) {
            b += CodedOutputByteBufferNano.d(7) + 4;
        }
        if (Float.floatToIntBits(this.f4762j) != Float.floatToIntBits(0.0f)) {
            b += CodedOutputByteBufferNano.d(8) + 4;
        }
        if (!(this.f4765m == null || this.f4765m.equals(""))) {
            b += CodedOutputByteBufferNano.b(9, this.f4765m);
        }
        if (!(this.f4766n == null || this.f4766n.equals(""))) {
            b += CodedOutputByteBufferNano.b(10, this.f4766n);
        }
        if (!(this.f4767o == null || this.f4767o.equals(""))) {
            b += CodedOutputByteBufferNano.b(11, this.f4767o);
        }
        if (this.f4750C != null) {
            b += CodedOutputByteBufferNano.d(12, this.f4750C);
        }
        if (!(this.f4768p == null || this.f4768p.equals(""))) {
            b += CodedOutputByteBufferNano.b(13, this.f4768p);
        }
        if (!(this.f4771s == null || this.f4771s.equals(""))) {
            b += CodedOutputByteBufferNano.b(14, this.f4771s);
        }
        if (this.f4764l != 0) {
            b += CodedOutputByteBufferNano.d(15, this.f4764l);
        }
        if (this.f4753a != 0) {
            b += CodedOutputByteBufferNano.d(16, this.f4753a);
        }
        if (!(this.f4772t == null || this.f4772t.equals(""))) {
            b += CodedOutputByteBufferNano.b(17, this.f4772t);
        }
        if (!(this.f4773u == null || this.f4773u.equals(""))) {
            b += CodedOutputByteBufferNano.b(18, this.f4773u);
        }
        if (this.f4777y != 0) {
            b += CodedOutputByteBufferNano.f(19, this.f4777y);
        }
        if (this.f4769q != 0) {
            b += CodedOutputByteBufferNano.f(20, this.f4769q);
        }
        if (this.f4770r != null && this.f4770r.length > 0) {
            i = 0;
            for (int c : this.f4770r) {
                i += CodedOutputByteBufferNano.c(c);
            }
            b = ((b + i) + 2) + CodedOutputByteBufferNano.f(i);
        }
        if (this.f4754b != 0) {
            b += CodedOutputByteBufferNano.d(22, this.f4754b);
        }
        if (this.f4778z != 0) {
            b += CodedOutputByteBufferNano.f(23, this.f4778z);
        }
        if (this.f4748A != 0) {
            b += CodedOutputByteBufferNano.f(24, this.f4748A);
        }
        if (this.f4749B) {
            b += CodedOutputByteBufferNano.d(25) + 1;
        }
        if (this.f4751D != null && this.f4751D.length > 0) {
            i = 0;
            for (int c2 : this.f4751D) {
                i += CodedOutputByteBufferNano.c(c2);
            }
            b = (b + i) + (this.f4751D.length * 2);
        }
        if (this.f4752E != null && this.f4752E.length > 0) {
            while (i2 < this.f4752E.length) {
                C0757i c0757i = this.f4752E[i2];
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(27, c0757i);
                }
                i2++;
            }
        }
        if (this.f4763k != 0) {
            b += CodedOutputByteBufferNano.d(28, this.f4763k);
        }
        if (!(this.f4774v == null || this.f4774v.equals(""))) {
            b += CodedOutputByteBufferNano.b(30, this.f4774v);
        }
        if (this.f4775w) {
            b += CodedOutputByteBufferNano.d(31) + 1;
        }
        if (this.f4776x != 0) {
            return b + CodedOutputByteBufferNano.d(32, this.f4776x);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c m4939b(com.google.protobuf.nano.a r11) {
        /*
        r10 = this;
        r9 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r8 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r1 = 0;
    L_0x0005:
        r3 = r11.a();
        switch(r3) {
            case 0: goto L_0x0012;
            case 10: goto L_0x0013;
            case 18: goto L_0x001a;
            case 26: goto L_0x0021;
            case 34: goto L_0x0028;
            case 40: goto L_0x002f;
            case 48: goto L_0x0036;
            case 61: goto L_0x003d;
            case 69: goto L_0x0048;
            case 74: goto L_0x0053;
            case 82: goto L_0x005a;
            case 90: goto L_0x0061;
            case 98: goto L_0x0068;
            case 106: goto L_0x0079;
            case 114: goto L_0x0080;
            case 120: goto L_0x0088;
            case 128: goto L_0x00bb;
            case 138: goto L_0x00d4;
            case 146: goto L_0x00dc;
            case 152: goto L_0x00e4;
            case 160: goto L_0x00ec;
            case 168: goto L_0x00f4;
            case 170: goto L_0x0144;
            case 176: goto L_0x019f;
            case 184: goto L_0x01b8;
            case 192: goto L_0x01c0;
            case 200: goto L_0x01c8;
            case 208: goto L_0x01d0;
            case 210: goto L_0x0220;
            case 218: goto L_0x027b;
            case 224: goto L_0x02bb;
            case 242: goto L_0x02c3;
            case 248: goto L_0x02cb;
            case 256: goto L_0x02d3;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = super.m4918a(r11, r3);
        if (r0 != 0) goto L_0x0005;
    L_0x0012:
        return r10;
    L_0x0013:
        r0 = r11.f();
        r10.f4755c = r0;
        goto L_0x0005;
    L_0x001a:
        r0 = r11.f();
        r10.f4756d = r0;
        goto L_0x0005;
    L_0x0021:
        r0 = r11.f();
        r10.f4757e = r0;
        goto L_0x0005;
    L_0x0028:
        r0 = r11.f();
        r10.f4758f = r0;
        goto L_0x0005;
    L_0x002f:
        r0 = r11.i();
        r10.f4759g = r0;
        goto L_0x0005;
    L_0x0036:
        r0 = r11.i();
        r10.f4760h = r0;
        goto L_0x0005;
    L_0x003d:
        r0 = r11.k();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r10.f4761i = r0;
        goto L_0x0005;
    L_0x0048:
        r0 = r11.k();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r10.f4762j = r0;
        goto L_0x0005;
    L_0x0053:
        r0 = r11.f();
        r10.f4765m = r0;
        goto L_0x0005;
    L_0x005a:
        r0 = r11.f();
        r10.f4766n = r0;
        goto L_0x0005;
    L_0x0061:
        r0 = r11.f();
        r10.f4767o = r0;
        goto L_0x0005;
    L_0x0068:
        r0 = r10.f4750C;
        if (r0 != 0) goto L_0x0073;
    L_0x006c:
        r0 = new f.a.a.a;
        r0.<init>();
        r10.f4750C = r0;
    L_0x0073:
        r0 = r10.f4750C;
        r11.a(r0);
        goto L_0x0005;
    L_0x0079:
        r0 = r11.f();
        r10.f4768p = r0;
        goto L_0x0005;
    L_0x0080:
        r0 = r11.f();
        r10.f4771s = r0;
        goto L_0x0005;
    L_0x0088:
        r0 = r11.o();
        r2 = r11.i();	 Catch:{ IllegalArgumentException -> 0x00ae }
        switch(r2) {
            case 0: goto L_0x00b7;
            case 1: goto L_0x00b7;
            case 2: goto L_0x00b7;
            default: goto L_0x0093;
        };	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x0093:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = 52;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = " is not a valid enum AndroidClientSubtype";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00ae }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x00ae:
        r2 = move-exception;
        r11.e(r0);
        r10.m4918a(r11, r3);
        goto L_0x0005;
    L_0x00b7:
        r10.f4764l = r2;	 Catch:{ IllegalArgumentException -> 0x00ae }
        goto L_0x0005;
    L_0x00bb:
        r0 = r11.o();
        r2 = r11.i();	 Catch:{ IllegalArgumentException -> 0x00cb }
        r2 = com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4937a(r2);	 Catch:{ IllegalArgumentException -> 0x00cb }
        r10.f4753a = r2;	 Catch:{ IllegalArgumentException -> 0x00cb }
        goto L_0x0005;
    L_0x00cb:
        r2 = move-exception;
        r11.e(r0);
        r10.m4918a(r11, r3);
        goto L_0x0005;
    L_0x00d4:
        r0 = r11.f();
        r10.f4772t = r0;
        goto L_0x0005;
    L_0x00dc:
        r0 = r11.f();
        r10.f4773u = r0;
        goto L_0x0005;
    L_0x00e4:
        r2 = r11.j();
        r10.f4777y = r2;
        goto L_0x0005;
    L_0x00ec:
        r2 = r11.j();
        r10.f4769q = r2;
        goto L_0x0005;
    L_0x00f4:
        r4 = com.google.protobuf.nano.l.a(r11, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x00fc:
        if (r2 >= r4) goto L_0x011e;
    L_0x00fe:
        if (r2 == 0) goto L_0x0103;
    L_0x0100:
        r11.a();
    L_0x0103:
        r6 = r11.o();
        r7 = r11.i();	 Catch:{ IllegalArgumentException -> 0x0116 }
        r7 = com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4938b(r7);	 Catch:{ IllegalArgumentException -> 0x0116 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0116 }
        r0 = r0 + 1;
    L_0x0113:
        r2 = r2 + 1;
        goto L_0x00fc;
    L_0x0116:
        r7 = move-exception;
        r11.e(r6);
        r10.m4918a(r11, r3);
        goto L_0x0113;
    L_0x011e:
        if (r0 == 0) goto L_0x0005;
    L_0x0120:
        r2 = r10.f4770r;
        if (r2 != 0) goto L_0x012e;
    L_0x0124:
        r2 = r1;
    L_0x0125:
        if (r2 != 0) goto L_0x0132;
    L_0x0127:
        r3 = r5.length;
        if (r0 != r3) goto L_0x0132;
    L_0x012a:
        r10.f4770r = r5;
        goto L_0x0005;
    L_0x012e:
        r2 = r10.f4770r;
        r2 = r2.length;
        goto L_0x0125;
    L_0x0132:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x013d;
    L_0x0138:
        r4 = r10.f4770r;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x013d:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r10.f4770r = r3;
        goto L_0x0005;
    L_0x0144:
        r0 = r11.i();
        r3 = r11.c(r0);
        r2 = r11.o();
        r0 = r1;
    L_0x0151:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x0161;
    L_0x0157:
        r4 = r11.i();	 Catch:{ IllegalArgumentException -> 0x02de }
        com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4938b(r4);	 Catch:{ IllegalArgumentException -> 0x02de }
        r0 = r0 + 1;
        goto L_0x0151;
    L_0x0161:
        if (r0 == 0) goto L_0x019a;
    L_0x0163:
        r11.e(r2);
        r2 = r10.f4770r;
        if (r2 != 0) goto L_0x018c;
    L_0x016a:
        r2 = r1;
    L_0x016b:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0175;
    L_0x0170:
        r4 = r10.f4770r;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0175:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x0198;
    L_0x017b:
        r4 = r11.o();
        r5 = r11.i();	 Catch:{ IllegalArgumentException -> 0x0190 }
        r5 = com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4938b(r5);	 Catch:{ IllegalArgumentException -> 0x0190 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0190 }
        r2 = r2 + 1;
        goto L_0x0175;
    L_0x018c:
        r2 = r10.f4770r;
        r2 = r2.length;
        goto L_0x016b;
    L_0x0190:
        r5 = move-exception;
        r11.e(r4);
        r10.m4918a(r11, r8);
        goto L_0x0175;
    L_0x0198:
        r10.f4770r = r0;
    L_0x019a:
        r11.d(r3);
        goto L_0x0005;
    L_0x019f:
        r0 = r11.o();
        r2 = r11.i();	 Catch:{ IllegalArgumentException -> 0x01af }
        r2 = com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4937a(r2);	 Catch:{ IllegalArgumentException -> 0x01af }
        r10.f4754b = r2;	 Catch:{ IllegalArgumentException -> 0x01af }
        goto L_0x0005;
    L_0x01af:
        r2 = move-exception;
        r11.e(r0);
        r10.m4918a(r11, r3);
        goto L_0x0005;
    L_0x01b8:
        r2 = r11.j();
        r10.f4778z = r2;
        goto L_0x0005;
    L_0x01c0:
        r2 = r11.j();
        r10.f4748A = r2;
        goto L_0x0005;
    L_0x01c8:
        r0 = r11.e();
        r10.f4749B = r0;
        goto L_0x0005;
    L_0x01d0:
        r4 = com.google.protobuf.nano.l.a(r11, r9);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x01d8:
        if (r2 >= r4) goto L_0x01fa;
    L_0x01da:
        if (r2 == 0) goto L_0x01df;
    L_0x01dc:
        r11.a();
    L_0x01df:
        r6 = r11.o();
        r7 = r11.i();	 Catch:{ IllegalArgumentException -> 0x01f2 }
        r7 = com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4940c(r7);	 Catch:{ IllegalArgumentException -> 0x01f2 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x01f2 }
        r0 = r0 + 1;
    L_0x01ef:
        r2 = r2 + 1;
        goto L_0x01d8;
    L_0x01f2:
        r7 = move-exception;
        r11.e(r6);
        r10.m4918a(r11, r3);
        goto L_0x01ef;
    L_0x01fa:
        if (r0 == 0) goto L_0x0005;
    L_0x01fc:
        r2 = r10.f4751D;
        if (r2 != 0) goto L_0x020a;
    L_0x0200:
        r2 = r1;
    L_0x0201:
        if (r2 != 0) goto L_0x020e;
    L_0x0203:
        r3 = r5.length;
        if (r0 != r3) goto L_0x020e;
    L_0x0206:
        r10.f4751D = r5;
        goto L_0x0005;
    L_0x020a:
        r2 = r10.f4751D;
        r2 = r2.length;
        goto L_0x0201;
    L_0x020e:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0219;
    L_0x0214:
        r4 = r10.f4751D;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0219:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r10.f4751D = r3;
        goto L_0x0005;
    L_0x0220:
        r0 = r11.i();
        r3 = r11.c(r0);
        r2 = r11.o();
        r0 = r1;
    L_0x022d:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x023d;
    L_0x0233:
        r4 = r11.i();	 Catch:{ IllegalArgumentException -> 0x02db }
        com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4940c(r4);	 Catch:{ IllegalArgumentException -> 0x02db }
        r0 = r0 + 1;
        goto L_0x022d;
    L_0x023d:
        if (r0 == 0) goto L_0x0276;
    L_0x023f:
        r11.e(r2);
        r2 = r10.f4751D;
        if (r2 != 0) goto L_0x0268;
    L_0x0246:
        r2 = r1;
    L_0x0247:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0251;
    L_0x024c:
        r4 = r10.f4751D;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0251:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x0274;
    L_0x0257:
        r4 = r11.o();
        r5 = r11.i();	 Catch:{ IllegalArgumentException -> 0x026c }
        r5 = com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c.m4940c(r5);	 Catch:{ IllegalArgumentException -> 0x026c }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x026c }
        r2 = r2 + 1;
        goto L_0x0251;
    L_0x0268:
        r2 = r10.f4751D;
        r2 = r2.length;
        goto L_0x0247;
    L_0x026c:
        r5 = move-exception;
        r11.e(r4);
        r10.m4918a(r11, r9);
        goto L_0x0251;
    L_0x0274:
        r10.f4751D = r0;
    L_0x0276:
        r11.d(r3);
        goto L_0x0005;
    L_0x027b:
        r0 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r2 = com.google.protobuf.nano.l.a(r11, r0);
        r0 = r10.f4752E;
        if (r0 != 0) goto L_0x02a7;
    L_0x0285:
        r0 = r1;
    L_0x0286:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0761a[r2];
        if (r0 == 0) goto L_0x0290;
    L_0x028b:
        r3 = r10.f4752E;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0290:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x02ab;
    L_0x0295:
        r3 = new com.google.a.a.a.a.a.b.a;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r11.a(r3);
        r11.a();
        r0 = r0 + 1;
        goto L_0x0290;
    L_0x02a7:
        r0 = r10.f4752E;
        r0 = r0.length;
        goto L_0x0286;
    L_0x02ab:
        r3 = new com.google.a.a.a.a.a.b.a;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r11.a(r0);
        r10.f4752E = r2;
        goto L_0x0005;
    L_0x02bb:
        r0 = r11.i();
        r10.f4763k = r0;
        goto L_0x0005;
    L_0x02c3:
        r0 = r11.f();
        r10.f4774v = r0;
        goto L_0x0005;
    L_0x02cb:
        r0 = r11.e();
        r10.f4775w = r0;
        goto L_0x0005;
    L_0x02d3:
        r0 = r11.i();
        r10.f4776x = r0;
        goto L_0x0005;
    L_0x02db:
        r4 = move-exception;
        goto L_0x022d;
    L_0x02de:
        r4 = move-exception;
        goto L_0x0151;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.a.b.c.b(com.google.protobuf.nano.a):com.google.a.a.a.a.a.b.c");
    }

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        return m4939b(aVar);
    }
}
