package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0804a extends C0758b {
    public String f5084A;
    public int[] f5085B;
    public long f5086C;
    public long f5087D;
    public long f5088E;
    public C0811h f5089a;
    public String f5090b;
    public long f5091c;
    public byte[] f5092d;
    public String f5093e;
    public C0806c f5094f;
    public String f5095g;
    public C0809f[] f5096h;
    public boolean f5097i;
    public String f5098j;
    public int f5099k;
    public long f5100l;
    public long f5101m;
    public long f5102n;
    public int f5103o;
    public String f5104p;
    public String[] f5105q;
    public String f5106r;
    public String[] f5107s;
    public boolean f5108t;
    public String f5109u;
    public int[] f5110v;
    public int[] f5111w;
    public C0805b[] f5112x;
    public int f5113y;
    public boolean f5114z;

    public static int m5118a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum AddressFormField");
        }
    }

    private static int m5119b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum AddressAutocompleteOption");
        }
    }

    public C0804a() {
        this.f5089a = null;
        this.f5090b = "";
        this.f5091c = 0;
        this.f5092d = l.l;
        this.f5093e = "";
        this.f5094f = null;
        this.f5095g = "";
        this.f5096h = C0809f.m5138a();
        this.f5097i = false;
        this.f5098j = "";
        this.f5099k = 0;
        this.f5100l = 0;
        this.f5101m = 0;
        this.f5102n = 0;
        this.f5103o = 0;
        this.f5104p = "";
        this.f5105q = l.j;
        this.f5106r = "";
        this.f5107s = l.j;
        this.f5108t = false;
        this.f5109u = "";
        this.f5110v = l.e;
        this.f5111w = l.e;
        this.f5112x = C0805b.m5124a();
        this.f5113y = 0;
        this.f5114z = false;
        this.f5084A = "";
        this.f5085B = l.e;
        this.f5086C = 0;
        this.f5087D = 0;
        this.f5088E = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5105q != null && this.f5105q.length > 0) {
            for (String str : this.f5105q) {
                if (str != null) {
                    codedOutputByteBufferNano.a(4, str);
                }
            }
        }
        if (this.f5108t) {
            codedOutputByteBufferNano.a(5, this.f5108t);
        }
        if (!(this.f5090b == null || this.f5090b.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5090b);
        }
        if (this.f5094f != null) {
            codedOutputByteBufferNano.b(7, this.f5094f);
        }
        if (this.f5107s != null && this.f5107s.length > 0) {
            for (String str2 : this.f5107s) {
                if (str2 != null) {
                    codedOutputByteBufferNano.a(9, str2);
                }
            }
        }
        if (!(this.f5109u == null || this.f5109u.equals(""))) {
            codedOutputByteBufferNano.a(10, this.f5109u);
        }
        if (!(this.f5104p == null || this.f5104p.equals(""))) {
            codedOutputByteBufferNano.a(11, this.f5104p);
        }
        if (this.f5110v != null && this.f5110v.length > 0) {
            for (int a : this.f5110v) {
                codedOutputByteBufferNano.a(12, a);
            }
        }
        if (!(this.f5093e == null || this.f5093e.equals(""))) {
            codedOutputByteBufferNano.a(13, this.f5093e);
        }
        if (this.f5111w != null && this.f5111w.length > 0) {
            for (int a2 : this.f5111w) {
                codedOutputByteBufferNano.a(14, a2);
            }
        }
        if (!(this.f5095g == null || this.f5095g.equals(""))) {
            codedOutputByteBufferNano.a(15, this.f5095g);
        }
        if (this.f5113y != 0) {
            codedOutputByteBufferNano.a(20, this.f5113y);
        }
        if (this.f5096h != null && this.f5096h.length > 0) {
            for (C0757i c0757i : this.f5096h) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(21, c0757i);
                }
            }
        }
        if (!(this.f5098j == null || this.f5098j.equals(""))) {
            codedOutputByteBufferNano.a(22, this.f5098j);
        }
        if (this.f5091c != 0) {
            codedOutputByteBufferNano.b(25, this.f5091c);
        }
        if (!Arrays.equals(this.f5092d, l.l)) {
            codedOutputByteBufferNano.a(26, this.f5092d);
        }
        if (this.f5089a != null) {
            codedOutputByteBufferNano.b(29, this.f5089a);
        }
        if (this.f5085B != null && this.f5085B.length > 0) {
            int i2 = 0;
            for (int a22 : this.f5085B) {
                i2 += CodedOutputByteBufferNano.c(a22);
            }
            codedOutputByteBufferNano.e(242);
            codedOutputByteBufferNano.e(i2);
            for (int i22 : this.f5085B) {
                codedOutputByteBufferNano.e(i22);
            }
        }
        if (this.f5086C != 0) {
            codedOutputByteBufferNano.b(31, this.f5086C);
        }
        if (this.f5099k != 0) {
            codedOutputByteBufferNano.a(32, this.f5099k);
        }
        if (this.f5114z) {
            codedOutputByteBufferNano.a(34, this.f5114z);
        }
        if (!(this.f5084A == null || this.f5084A.equals(""))) {
            codedOutputByteBufferNano.a(35, this.f5084A);
        }
        if (this.f5103o != 0) {
            codedOutputByteBufferNano.a(36, this.f5103o);
        }
        if (this.f5087D != 0) {
            codedOutputByteBufferNano.b(38, this.f5087D);
        }
        if (this.f5101m != 0) {
            codedOutputByteBufferNano.b(40, this.f5101m);
        }
        if (!(this.f5106r == null || this.f5106r.equals(""))) {
            codedOutputByteBufferNano.a(42, this.f5106r);
        }
        if (this.f5102n != 0) {
            codedOutputByteBufferNano.b(46, this.f5102n);
        }
        if (this.f5100l != 0) {
            codedOutputByteBufferNano.b(47, this.f5100l);
        }
        if (this.f5088E != 0) {
            codedOutputByteBufferNano.b(49, this.f5088E);
        }
        if (this.f5112x != null && this.f5112x.length > 0) {
            while (i < this.f5112x.length) {
                C0757i c0757i2 = this.f5112x[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(50, c0757i2);
                }
                i++;
            }
        }
        if (this.f5097i) {
            codedOutputByteBufferNano.a(51, this.f5097i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo1128b();
        if (this.f5105q == null || this.f5105q.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f5105q) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f5108t) {
            i += CodedOutputByteBufferNano.d(5) + 1;
        }
        if (!(this.f5090b == null || this.f5090b.equals(""))) {
            i += CodedOutputByteBufferNano.b(6, this.f5090b);
        }
        if (this.f5094f != null) {
            i += CodedOutputByteBufferNano.d(7, this.f5094f);
        }
        if (this.f5107s != null && this.f5107s.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2 : this.f5107s) {
                if (str2 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str2);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (!(this.f5109u == null || this.f5109u.equals(""))) {
            i += CodedOutputByteBufferNano.b(10, this.f5109u);
        }
        if (!(this.f5104p == null || this.f5104p.equals(""))) {
            i += CodedOutputByteBufferNano.b(11, this.f5104p);
        }
        if (this.f5110v != null && this.f5110v.length > 0) {
            i3 = 0;
            for (int b2 : this.f5110v) {
                i3 += CodedOutputByteBufferNano.c(b2);
            }
            i = (i + i3) + (this.f5110v.length * 1);
        }
        if (!(this.f5093e == null || this.f5093e.equals(""))) {
            i += CodedOutputByteBufferNano.b(13, this.f5093e);
        }
        if (this.f5111w != null && this.f5111w.length > 0) {
            i3 = 0;
            for (int b22 : this.f5111w) {
                i3 += CodedOutputByteBufferNano.c(b22);
            }
            i = (i + i3) + (this.f5111w.length * 1);
        }
        if (!(this.f5095g == null || this.f5095g.equals(""))) {
            i += CodedOutputByteBufferNano.b(15, this.f5095g);
        }
        if (this.f5113y != 0) {
            i += CodedOutputByteBufferNano.d(20, this.f5113y);
        }
        if (this.f5096h != null && this.f5096h.length > 0) {
            i2 = i;
            for (C0757i c0757i : this.f5096h) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(21, c0757i);
                }
            }
            i = i2;
        }
        if (!(this.f5098j == null || this.f5098j.equals(""))) {
            i += CodedOutputByteBufferNano.b(22, this.f5098j);
        }
        if (this.f5091c != 0) {
            i += CodedOutputByteBufferNano.f(25, this.f5091c);
        }
        if (!Arrays.equals(this.f5092d, l.l)) {
            i += CodedOutputByteBufferNano.b(26, this.f5092d);
        }
        if (this.f5089a != null) {
            i += CodedOutputByteBufferNano.d(29, this.f5089a);
        }
        if (this.f5085B != null && this.f5085B.length > 0) {
            i3 = 0;
            for (int b222 : this.f5085B) {
                i3 += CodedOutputByteBufferNano.c(b222);
            }
            i = ((i + i3) + 2) + CodedOutputByteBufferNano.f(i3);
        }
        if (this.f5086C != 0) {
            i += CodedOutputByteBufferNano.f(31, this.f5086C);
        }
        if (this.f5099k != 0) {
            i += CodedOutputByteBufferNano.d(32, this.f5099k);
        }
        if (this.f5114z) {
            i += CodedOutputByteBufferNano.d(34) + 1;
        }
        if (!(this.f5084A == null || this.f5084A.equals(""))) {
            i += CodedOutputByteBufferNano.b(35, this.f5084A);
        }
        if (this.f5103o != 0) {
            i += CodedOutputByteBufferNano.d(36, this.f5103o);
        }
        if (this.f5087D != 0) {
            i += CodedOutputByteBufferNano.f(38, this.f5087D);
        }
        if (this.f5101m != 0) {
            i += CodedOutputByteBufferNano.f(40, this.f5101m);
        }
        if (!(this.f5106r == null || this.f5106r.equals(""))) {
            i += CodedOutputByteBufferNano.b(42, this.f5106r);
        }
        if (this.f5102n != 0) {
            i += CodedOutputByteBufferNano.f(46, this.f5102n);
        }
        if (this.f5100l != 0) {
            i += CodedOutputByteBufferNano.f(47, this.f5100l);
        }
        if (this.f5088E != 0) {
            i += CodedOutputByteBufferNano.f(49, this.f5088E);
        }
        if (this.f5112x != null && this.f5112x.length > 0) {
            while (i4 < this.f5112x.length) {
                C0757i c0757i2 = this.f5112x[i4];
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(50, c0757i2);
                }
                i4++;
            }
        }
        if (this.f5097i) {
            return i + (CodedOutputByteBufferNano.d(51) + 1);
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a m5120b(com.google.protobuf.nano.a r12) {
        /*
        r11 = this;
        r10 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        r9 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r8 = 96;
        r1 = 0;
    L_0x0007:
        r3 = r12.a();
        switch(r3) {
            case 0: goto L_0x0014;
            case 34: goto L_0x0015;
            case 40: goto L_0x0048;
            case 50: goto L_0x004f;
            case 58: goto L_0x0056;
            case 74: goto L_0x0067;
            case 82: goto L_0x009b;
            case 90: goto L_0x00a3;
            case 96: goto L_0x00ab;
            case 98: goto L_0x00fb;
            case 106: goto L_0x0156;
            case 112: goto L_0x015e;
            case 114: goto L_0x01ae;
            case 122: goto L_0x0209;
            case 160: goto L_0x0211;
            case 170: goto L_0x0244;
            case 178: goto L_0x0284;
            case 200: goto L_0x028c;
            case 210: goto L_0x0294;
            case 234: goto L_0x029c;
            case 240: goto L_0x02ae;
            case 242: goto L_0x02fe;
            case 248: goto L_0x0359;
            case 256: goto L_0x0361;
            case 272: goto L_0x0369;
            case 282: goto L_0x0371;
            case 288: goto L_0x0379;
            case 304: goto L_0x03ac;
            case 320: goto L_0x03b4;
            case 338: goto L_0x03bc;
            case 368: goto L_0x03c4;
            case 376: goto L_0x03cc;
            case 392: goto L_0x03d4;
            case 402: goto L_0x03dc;
            case 408: goto L_0x041c;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = super.m4918a(r12, r3);
        if (r0 != 0) goto L_0x0007;
    L_0x0014:
        return r11;
    L_0x0015:
        r0 = 34;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f5105q;
        if (r0 != 0) goto L_0x003b;
    L_0x001f:
        r0 = r1;
    L_0x0020:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x002a;
    L_0x0025:
        r3 = r11.f5105q;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x002a:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x003f;
    L_0x002f:
        r3 = r12.f();
        r2[r0] = r3;
        r12.a();
        r0 = r0 + 1;
        goto L_0x002a;
    L_0x003b:
        r0 = r11.f5105q;
        r0 = r0.length;
        goto L_0x0020;
    L_0x003f:
        r3 = r12.f();
        r2[r0] = r3;
        r11.f5105q = r2;
        goto L_0x0007;
    L_0x0048:
        r0 = r12.e();
        r11.f5108t = r0;
        goto L_0x0007;
    L_0x004f:
        r0 = r12.f();
        r11.f5090b = r0;
        goto L_0x0007;
    L_0x0056:
        r0 = r11.f5094f;
        if (r0 != 0) goto L_0x0061;
    L_0x005a:
        r0 = new com.google.a.a.a.a.b.a.a.f.c;
        r0.<init>();
        r11.f5094f = r0;
    L_0x0061:
        r0 = r11.f5094f;
        r12.a(r0);
        goto L_0x0007;
    L_0x0067:
        r0 = 74;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f5107s;
        if (r0 != 0) goto L_0x008d;
    L_0x0071:
        r0 = r1;
    L_0x0072:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x007c;
    L_0x0077:
        r3 = r11.f5107s;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x007c:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0091;
    L_0x0081:
        r3 = r12.f();
        r2[r0] = r3;
        r12.a();
        r0 = r0 + 1;
        goto L_0x007c;
    L_0x008d:
        r0 = r11.f5107s;
        r0 = r0.length;
        goto L_0x0072;
    L_0x0091:
        r3 = r12.f();
        r2[r0] = r3;
        r11.f5107s = r2;
        goto L_0x0007;
    L_0x009b:
        r0 = r12.f();
        r11.f5109u = r0;
        goto L_0x0007;
    L_0x00a3:
        r0 = r12.f();
        r11.f5104p = r0;
        goto L_0x0007;
    L_0x00ab:
        r4 = com.google.protobuf.nano.l.a(r12, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x00b3:
        if (r2 >= r4) goto L_0x00d5;
    L_0x00b5:
        if (r2 == 0) goto L_0x00ba;
    L_0x00b7:
        r12.a();
    L_0x00ba:
        r6 = r12.o();
        r7 = r12.i();	 Catch:{ IllegalArgumentException -> 0x00cd }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5118a(r7);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r0 = r0 + 1;
    L_0x00ca:
        r2 = r2 + 1;
        goto L_0x00b3;
    L_0x00cd:
        r7 = move-exception;
        r12.e(r6);
        r11.m4918a(r12, r3);
        goto L_0x00ca;
    L_0x00d5:
        if (r0 == 0) goto L_0x0007;
    L_0x00d7:
        r2 = r11.f5110v;
        if (r2 != 0) goto L_0x00e5;
    L_0x00db:
        r2 = r1;
    L_0x00dc:
        if (r2 != 0) goto L_0x00e9;
    L_0x00de:
        r3 = r5.length;
        if (r0 != r3) goto L_0x00e9;
    L_0x00e1:
        r11.f5110v = r5;
        goto L_0x0007;
    L_0x00e5:
        r2 = r11.f5110v;
        r2 = r2.length;
        goto L_0x00dc;
    L_0x00e9:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x00f4;
    L_0x00ef:
        r4 = r11.f5110v;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00f4:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f5110v = r3;
        goto L_0x0007;
    L_0x00fb:
        r0 = r12.i();
        r3 = r12.c(r0);
        r2 = r12.o();
        r0 = r1;
    L_0x0108:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x0118;
    L_0x010e:
        r4 = r12.i();	 Catch:{ IllegalArgumentException -> 0x042a }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5118a(r4);	 Catch:{ IllegalArgumentException -> 0x042a }
        r0 = r0 + 1;
        goto L_0x0108;
    L_0x0118:
        if (r0 == 0) goto L_0x0151;
    L_0x011a:
        r12.e(r2);
        r2 = r11.f5110v;
        if (r2 != 0) goto L_0x0143;
    L_0x0121:
        r2 = r1;
    L_0x0122:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x012c;
    L_0x0127:
        r4 = r11.f5110v;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x012c:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x014f;
    L_0x0132:
        r4 = r12.o();
        r5 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0147 }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5118a(r5);	 Catch:{ IllegalArgumentException -> 0x0147 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0147 }
        r2 = r2 + 1;
        goto L_0x012c;
    L_0x0143:
        r2 = r11.f5110v;
        r2 = r2.length;
        goto L_0x0122;
    L_0x0147:
        r5 = move-exception;
        r12.e(r4);
        r11.m4918a(r12, r8);
        goto L_0x012c;
    L_0x014f:
        r11.f5110v = r0;
    L_0x0151:
        r12.d(r3);
        goto L_0x0007;
    L_0x0156:
        r0 = r12.f();
        r11.f5093e = r0;
        goto L_0x0007;
    L_0x015e:
        r4 = com.google.protobuf.nano.l.a(r12, r9);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x0166:
        if (r2 >= r4) goto L_0x0188;
    L_0x0168:
        if (r2 == 0) goto L_0x016d;
    L_0x016a:
        r12.a();
    L_0x016d:
        r6 = r12.o();
        r7 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0180 }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5118a(r7);	 Catch:{ IllegalArgumentException -> 0x0180 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r0 = r0 + 1;
    L_0x017d:
        r2 = r2 + 1;
        goto L_0x0166;
    L_0x0180:
        r7 = move-exception;
        r12.e(r6);
        r11.m4918a(r12, r3);
        goto L_0x017d;
    L_0x0188:
        if (r0 == 0) goto L_0x0007;
    L_0x018a:
        r2 = r11.f5111w;
        if (r2 != 0) goto L_0x0198;
    L_0x018e:
        r2 = r1;
    L_0x018f:
        if (r2 != 0) goto L_0x019c;
    L_0x0191:
        r3 = r5.length;
        if (r0 != r3) goto L_0x019c;
    L_0x0194:
        r11.f5111w = r5;
        goto L_0x0007;
    L_0x0198:
        r2 = r11.f5111w;
        r2 = r2.length;
        goto L_0x018f;
    L_0x019c:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x01a7;
    L_0x01a2:
        r4 = r11.f5111w;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x01a7:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f5111w = r3;
        goto L_0x0007;
    L_0x01ae:
        r0 = r12.i();
        r3 = r12.c(r0);
        r2 = r12.o();
        r0 = r1;
    L_0x01bb:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x01cb;
    L_0x01c1:
        r4 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0427 }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5118a(r4);	 Catch:{ IllegalArgumentException -> 0x0427 }
        r0 = r0 + 1;
        goto L_0x01bb;
    L_0x01cb:
        if (r0 == 0) goto L_0x0204;
    L_0x01cd:
        r12.e(r2);
        r2 = r11.f5111w;
        if (r2 != 0) goto L_0x01f6;
    L_0x01d4:
        r2 = r1;
    L_0x01d5:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x01df;
    L_0x01da:
        r4 = r11.f5111w;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x01df:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x0202;
    L_0x01e5:
        r4 = r12.o();
        r5 = r12.i();	 Catch:{ IllegalArgumentException -> 0x01fa }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5118a(r5);	 Catch:{ IllegalArgumentException -> 0x01fa }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x01fa }
        r2 = r2 + 1;
        goto L_0x01df;
    L_0x01f6:
        r2 = r11.f5111w;
        r2 = r2.length;
        goto L_0x01d5;
    L_0x01fa:
        r5 = move-exception;
        r12.e(r4);
        r11.m4918a(r12, r9);
        goto L_0x01df;
    L_0x0202:
        r11.f5111w = r0;
    L_0x0204:
        r12.d(r3);
        goto L_0x0007;
    L_0x0209:
        r0 = r12.f();
        r11.f5095g = r0;
        goto L_0x0007;
    L_0x0211:
        r0 = r12.o();
        r2 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0237 }
        switch(r2) {
            case 0: goto L_0x0240;
            case 1: goto L_0x0240;
            case 2: goto L_0x0240;
            case 3: goto L_0x0240;
            case 4: goto L_0x0240;
            default: goto L_0x021c;
        };	 Catch:{ IllegalArgumentException -> 0x0237 }
    L_0x021c:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0237 }
        r5 = 47;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0237 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0237 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x0237 }
        r5 = " is not a valid enum EditabilityType";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x0237 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0237 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0237 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0237 }
    L_0x0237:
        r2 = move-exception;
        r12.e(r0);
        r11.m4918a(r12, r3);
        goto L_0x0007;
    L_0x0240:
        r11.f5113y = r2;	 Catch:{ IllegalArgumentException -> 0x0237 }
        goto L_0x0007;
    L_0x0244:
        r0 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f5096h;
        if (r0 != 0) goto L_0x0270;
    L_0x024e:
        r0 = r1;
    L_0x024f:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0809f[r2];
        if (r0 == 0) goto L_0x0259;
    L_0x0254:
        r3 = r11.f5096h;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0259:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0274;
    L_0x025e:
        r3 = new com.google.a.a.a.a.b.a.a.f.f;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r12.a(r3);
        r12.a();
        r0 = r0 + 1;
        goto L_0x0259;
    L_0x0270:
        r0 = r11.f5096h;
        r0 = r0.length;
        goto L_0x024f;
    L_0x0274:
        r3 = new com.google.a.a.a.a.b.a.a.f.f;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r12.a(r0);
        r11.f5096h = r2;
        goto L_0x0007;
    L_0x0284:
        r0 = r12.f();
        r11.f5098j = r0;
        goto L_0x0007;
    L_0x028c:
        r2 = r12.j();
        r11.f5091c = r2;
        goto L_0x0007;
    L_0x0294:
        r0 = r12.g();
        r11.f5092d = r0;
        goto L_0x0007;
    L_0x029c:
        r0 = r11.f5089a;
        if (r0 != 0) goto L_0x02a7;
    L_0x02a0:
        r0 = new com.google.a.a.a.a.b.a.a.f.h;
        r0.<init>();
        r11.f5089a = r0;
    L_0x02a7:
        r0 = r11.f5089a;
        r12.a(r0);
        goto L_0x0007;
    L_0x02ae:
        r4 = com.google.protobuf.nano.l.a(r12, r10);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x02b6:
        if (r2 >= r4) goto L_0x02d8;
    L_0x02b8:
        if (r2 == 0) goto L_0x02bd;
    L_0x02ba:
        r12.a();
    L_0x02bd:
        r6 = r12.o();
        r7 = r12.i();	 Catch:{ IllegalArgumentException -> 0x02d0 }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5119b(r7);	 Catch:{ IllegalArgumentException -> 0x02d0 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x02d0 }
        r0 = r0 + 1;
    L_0x02cd:
        r2 = r2 + 1;
        goto L_0x02b6;
    L_0x02d0:
        r7 = move-exception;
        r12.e(r6);
        r11.m4918a(r12, r3);
        goto L_0x02cd;
    L_0x02d8:
        if (r0 == 0) goto L_0x0007;
    L_0x02da:
        r2 = r11.f5085B;
        if (r2 != 0) goto L_0x02e8;
    L_0x02de:
        r2 = r1;
    L_0x02df:
        if (r2 != 0) goto L_0x02ec;
    L_0x02e1:
        r3 = r5.length;
        if (r0 != r3) goto L_0x02ec;
    L_0x02e4:
        r11.f5085B = r5;
        goto L_0x0007;
    L_0x02e8:
        r2 = r11.f5085B;
        r2 = r2.length;
        goto L_0x02df;
    L_0x02ec:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x02f7;
    L_0x02f2:
        r4 = r11.f5085B;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x02f7:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f5085B = r3;
        goto L_0x0007;
    L_0x02fe:
        r0 = r12.i();
        r3 = r12.c(r0);
        r2 = r12.o();
        r0 = r1;
    L_0x030b:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x031b;
    L_0x0311:
        r4 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0424 }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5119b(r4);	 Catch:{ IllegalArgumentException -> 0x0424 }
        r0 = r0 + 1;
        goto L_0x030b;
    L_0x031b:
        if (r0 == 0) goto L_0x0354;
    L_0x031d:
        r12.e(r2);
        r2 = r11.f5085B;
        if (r2 != 0) goto L_0x0346;
    L_0x0324:
        r2 = r1;
    L_0x0325:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x032f;
    L_0x032a:
        r4 = r11.f5085B;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x032f:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x0352;
    L_0x0335:
        r4 = r12.o();
        r5 = r12.i();	 Catch:{ IllegalArgumentException -> 0x034a }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a.m5119b(r5);	 Catch:{ IllegalArgumentException -> 0x034a }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x034a }
        r2 = r2 + 1;
        goto L_0x032f;
    L_0x0346:
        r2 = r11.f5085B;
        r2 = r2.length;
        goto L_0x0325;
    L_0x034a:
        r5 = move-exception;
        r12.e(r4);
        r11.m4918a(r12, r10);
        goto L_0x032f;
    L_0x0352:
        r11.f5085B = r0;
    L_0x0354:
        r12.d(r3);
        goto L_0x0007;
    L_0x0359:
        r2 = r12.j();
        r11.f5086C = r2;
        goto L_0x0007;
    L_0x0361:
        r0 = r12.i();
        r11.f5099k = r0;
        goto L_0x0007;
    L_0x0369:
        r0 = r12.e();
        r11.f5114z = r0;
        goto L_0x0007;
    L_0x0371:
        r0 = r12.f();
        r11.f5084A = r0;
        goto L_0x0007;
    L_0x0379:
        r0 = r12.o();
        r2 = r12.i();	 Catch:{ IllegalArgumentException -> 0x039f }
        switch(r2) {
            case 0: goto L_0x03a8;
            case 1: goto L_0x03a8;
            case 2: goto L_0x03a8;
            default: goto L_0x0384;
        };	 Catch:{ IllegalArgumentException -> 0x039f }
    L_0x0384:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x039f }
        r5 = 54;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x039f }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x039f }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x039f }
        r5 = " is not a valid enum AddressFormDisplayType";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x039f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x039f }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x039f }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x039f }
    L_0x039f:
        r2 = move-exception;
        r12.e(r0);
        r11.m4918a(r12, r3);
        goto L_0x0007;
    L_0x03a8:
        r11.f5103o = r2;	 Catch:{ IllegalArgumentException -> 0x039f }
        goto L_0x0007;
    L_0x03ac:
        r2 = r12.j();
        r11.f5087D = r2;
        goto L_0x0007;
    L_0x03b4:
        r2 = r12.j();
        r11.f5101m = r2;
        goto L_0x0007;
    L_0x03bc:
        r0 = r12.f();
        r11.f5106r = r0;
        goto L_0x0007;
    L_0x03c4:
        r2 = r12.j();
        r11.f5102n = r2;
        goto L_0x0007;
    L_0x03cc:
        r2 = r12.j();
        r11.f5100l = r2;
        goto L_0x0007;
    L_0x03d4:
        r2 = r12.j();
        r11.f5088E = r2;
        goto L_0x0007;
    L_0x03dc:
        r0 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f5112x;
        if (r0 != 0) goto L_0x0408;
    L_0x03e6:
        r0 = r1;
    L_0x03e7:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0805b[r2];
        if (r0 == 0) goto L_0x03f1;
    L_0x03ec:
        r3 = r11.f5112x;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x03f1:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x040c;
    L_0x03f6:
        r3 = new com.google.a.a.a.a.b.a.a.f.b;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r12.a(r3);
        r12.a();
        r0 = r0 + 1;
        goto L_0x03f1;
    L_0x0408:
        r0 = r11.f5112x;
        r0 = r0.length;
        goto L_0x03e7;
    L_0x040c:
        r3 = new com.google.a.a.a.a.b.a.a.f.b;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r12.a(r0);
        r11.f5112x = r2;
        goto L_0x0007;
    L_0x041c:
        r0 = r12.e();
        r11.f5097i = r0;
        goto L_0x0007;
    L_0x0424:
        r4 = move-exception;
        goto L_0x030b;
    L_0x0427:
        r4 = move-exception;
        goto L_0x01bb;
    L_0x042a:
        r4 = move-exception;
        goto L_0x0108;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.f.a.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.f.a");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5120b(aVar);
    }
}
