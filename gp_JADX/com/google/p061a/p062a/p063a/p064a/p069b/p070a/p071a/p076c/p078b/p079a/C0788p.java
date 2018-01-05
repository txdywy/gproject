package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0788p extends C0758b {
    public C0811h f4968a;
    public C0789q f4969b;
    public C0790r[] f4970c;
    public ad[] f4971d;
    public int f4972e;
    public int f4973f;
    public int[] f4974g;
    public int[] f4975h;
    public long f4976i;
    public C0793u[] f4977j;
    public String f4978k;
    public String f4979l;
    public C0792t[] f4980m;
    public int[] f4981n;

    public C0788p() {
        this.f4968a = null;
        this.f4969b = null;
        this.f4970c = C0790r.m5064a();
        this.f4971d = ad.m5268a();
        this.f4972e = -1;
        this.f4973f = 0;
        this.f4974g = l.e;
        this.f4975h = l.e;
        this.f4976i = 0;
        this.f4977j = C0793u.m5076a();
        this.f4978k = "";
        this.f4979l = "";
        this.f4980m = C0792t.m5072a();
        this.f4981n = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f4968a != null) {
            codedOutputByteBufferNano.b(1, this.f4968a);
        }
        if (this.f4969b != null) {
            codedOutputByteBufferNano.b(2, this.f4969b);
        }
        if (this.f4970c != null && this.f4970c.length > 0) {
            for (C0757i c0757i : this.f4970c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (this.f4971d != null && this.f4971d.length > 0) {
            for (C0757i c0757i2 : this.f4971d) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(4, c0757i2);
                }
            }
        }
        if (this.f4974g != null && this.f4974g.length > 0) {
            for (int a : this.f4974g) {
                codedOutputByteBufferNano.a(6, a);
            }
        }
        if (this.f4977j != null && this.f4977j.length > 0) {
            for (C0757i c0757i22 : this.f4977j) {
                if (c0757i22 != null) {
                    codedOutputByteBufferNano.b(7, c0757i22);
                }
            }
        }
        if (!(this.f4979l == null || this.f4979l.equals(""))) {
            codedOutputByteBufferNano.a(8, this.f4979l);
        }
        if (this.f4980m != null && this.f4980m.length > 0) {
            for (C0757i c0757i222 : this.f4980m) {
                if (c0757i222 != null) {
                    codedOutputByteBufferNano.b(9, c0757i222);
                }
            }
        }
        if (this.f4976i != 0) {
            codedOutputByteBufferNano.b(10, this.f4976i);
        }
        if (this.f4975h != null && this.f4975h.length > 0) {
            for (int a2 : this.f4975h) {
                codedOutputByteBufferNano.a(11, a2);
            }
        }
        if (this.f4973f != 0) {
            codedOutputByteBufferNano.a(13, this.f4973f);
        }
        if (!(this.f4978k == null || this.f4978k.equals(""))) {
            codedOutputByteBufferNano.a(14, this.f4978k);
        }
        if (this.f4972e != -1) {
            codedOutputByteBufferNano.a(15, this.f4972e);
        }
        if (this.f4981n != null && this.f4981n.length > 0) {
            int i2 = 0;
            for (int a22 : this.f4981n) {
                i2 += CodedOutputByteBufferNano.c(a22);
            }
            codedOutputByteBufferNano.e(130);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f4981n.length) {
                codedOutputByteBufferNano.e(this.f4981n[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if (this.f4968a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4968a);
        }
        if (this.f4969b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f4969b);
        }
        if (this.f4970c != null && this.f4970c.length > 0) {
            i = b;
            for (C0757i c0757i : this.f4970c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (this.f4971d != null && this.f4971d.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f4971d) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i2);
                }
            }
            b = i;
        }
        if (this.f4974g != null && this.f4974g.length > 0) {
            i2 = 0;
            for (int c : this.f4974g) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i2) + (this.f4974g.length * 1);
        }
        if (this.f4977j != null && this.f4977j.length > 0) {
            i = b;
            for (C0757i c0757i22 : this.f4977j) {
                if (c0757i22 != null) {
                    i += CodedOutputByteBufferNano.d(7, c0757i22);
                }
            }
            b = i;
        }
        if (!(this.f4979l == null || this.f4979l.equals(""))) {
            b += CodedOutputByteBufferNano.b(8, this.f4979l);
        }
        if (this.f4980m != null && this.f4980m.length > 0) {
            i = b;
            for (C0757i c0757i222 : this.f4980m) {
                if (c0757i222 != null) {
                    i += CodedOutputByteBufferNano.d(9, c0757i222);
                }
            }
            b = i;
        }
        if (this.f4976i != 0) {
            b += CodedOutputByteBufferNano.f(10, this.f4976i);
        }
        if (this.f4975h != null && this.f4975h.length > 0) {
            i2 = 0;
            for (int c2 : this.f4975h) {
                i2 += CodedOutputByteBufferNano.c(c2);
            }
            b = (b + i2) + (this.f4975h.length * 1);
        }
        if (this.f4973f != 0) {
            b += CodedOutputByteBufferNano.d(13, this.f4973f);
        }
        if (!(this.f4978k == null || this.f4978k.equals(""))) {
            b += CodedOutputByteBufferNano.b(14, this.f4978k);
        }
        if (this.f4972e != -1) {
            b += CodedOutputByteBufferNano.d(15, this.f4972e);
        }
        if (this.f4981n == null || this.f4981n.length <= 0) {
            return b;
        }
        i = 0;
        while (i3 < this.f4981n.length) {
            i += CodedOutputByteBufferNano.c(this.f4981n[i3]);
            i3++;
        }
        return ((b + i) + 2) + CodedOutputByteBufferNano.f(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0788p m5057b(com.google.protobuf.nano.a r12) {
        /*
        r11 = this;
        r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r9 = 88;
        r8 = 48;
        r1 = 0;
    L_0x0007:
        r3 = r12.a();
        switch(r3) {
            case 0: goto L_0x0014;
            case 10: goto L_0x0015;
            case 18: goto L_0x0026;
            case 26: goto L_0x0037;
            case 34: goto L_0x0076;
            case 48: goto L_0x00b6;
            case 50: goto L_0x0106;
            case 58: goto L_0x0161;
            case 66: goto L_0x01a1;
            case 74: goto L_0x01a9;
            case 80: goto L_0x01e9;
            case 88: goto L_0x01f1;
            case 90: goto L_0x0241;
            case 104: goto L_0x029c;
            case 114: goto L_0x02cf;
            case 120: goto L_0x02d7;
            case 128: goto L_0x02df;
            case 130: goto L_0x032f;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = super.m4918a(r12, r3);
        if (r0 != 0) goto L_0x0007;
    L_0x0014:
        return r11;
    L_0x0015:
        r0 = r11.f4968a;
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = new com.google.a.a.a.a.b.a.a.f.h;
        r0.<init>();
        r11.f4968a = r0;
    L_0x0020:
        r0 = r11.f4968a;
        r12.a(r0);
        goto L_0x0007;
    L_0x0026:
        r0 = r11.f4969b;
        if (r0 != 0) goto L_0x0031;
    L_0x002a:
        r0 = new com.google.a.a.a.a.b.a.a.c.b.a.q;
        r0.<init>();
        r11.f4969b = r0;
    L_0x0031:
        r0 = r11.f4969b;
        r12.a(r0);
        goto L_0x0007;
    L_0x0037:
        r0 = 26;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f4970c;
        if (r0 != 0) goto L_0x0063;
    L_0x0041:
        r0 = r1;
    L_0x0042:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0790r[r2];
        if (r0 == 0) goto L_0x004c;
    L_0x0047:
        r3 = r11.f4970c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x004c:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0067;
    L_0x0051:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.r;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r12.a(r3);
        r12.a();
        r0 = r0 + 1;
        goto L_0x004c;
    L_0x0063:
        r0 = r11.f4970c;
        r0 = r0.length;
        goto L_0x0042;
    L_0x0067:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.r;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r12.a(r0);
        r11.f4970c = r2;
        goto L_0x0007;
    L_0x0076:
        r0 = 34;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f4971d;
        if (r0 != 0) goto L_0x00a2;
    L_0x0080:
        r0 = r1;
    L_0x0081:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad[r2];
        if (r0 == 0) goto L_0x008b;
    L_0x0086:
        r3 = r11.f4971d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x008b:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00a6;
    L_0x0090:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r12.a(r3);
        r12.a();
        r0 = r0 + 1;
        goto L_0x008b;
    L_0x00a2:
        r0 = r11.f4971d;
        r0 = r0.length;
        goto L_0x0081;
    L_0x00a6:
        r3 = new com.google.a.a.a.a.b.a.b.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r12.a(r0);
        r11.f4971d = r2;
        goto L_0x0007;
    L_0x00b6:
        r4 = com.google.protobuf.nano.l.a(r12, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x00be:
        if (r2 >= r4) goto L_0x00e0;
    L_0x00c0:
        if (r2 == 0) goto L_0x00c5;
    L_0x00c2:
        r12.a();
    L_0x00c5:
        r6 = r12.o();
        r7 = r12.i();	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0838b.m5354a(r7);	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r0 = r0 + 1;
    L_0x00d5:
        r2 = r2 + 1;
        goto L_0x00be;
    L_0x00d8:
        r7 = move-exception;
        r12.e(r6);
        r11.m4918a(r12, r3);
        goto L_0x00d5;
    L_0x00e0:
        if (r0 == 0) goto L_0x0007;
    L_0x00e2:
        r2 = r11.f4974g;
        if (r2 != 0) goto L_0x00f0;
    L_0x00e6:
        r2 = r1;
    L_0x00e7:
        if (r2 != 0) goto L_0x00f4;
    L_0x00e9:
        r3 = r5.length;
        if (r0 != r3) goto L_0x00f4;
    L_0x00ec:
        r11.f4974g = r5;
        goto L_0x0007;
    L_0x00f0:
        r2 = r11.f4974g;
        r2 = r2.length;
        goto L_0x00e7;
    L_0x00f4:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x00ff;
    L_0x00fa:
        r4 = r11.f4974g;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00ff:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f4974g = r3;
        goto L_0x0007;
    L_0x0106:
        r0 = r12.i();
        r3 = r12.c(r0);
        r2 = r12.o();
        r0 = r1;
    L_0x0113:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x0123;
    L_0x0119:
        r4 = r12.i();	 Catch:{ IllegalArgumentException -> 0x038f }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0838b.m5354a(r4);	 Catch:{ IllegalArgumentException -> 0x038f }
        r0 = r0 + 1;
        goto L_0x0113;
    L_0x0123:
        if (r0 == 0) goto L_0x015c;
    L_0x0125:
        r12.e(r2);
        r2 = r11.f4974g;
        if (r2 != 0) goto L_0x014e;
    L_0x012c:
        r2 = r1;
    L_0x012d:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0137;
    L_0x0132:
        r4 = r11.f4974g;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0137:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x015a;
    L_0x013d:
        r4 = r12.o();
        r5 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0152 }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0838b.m5354a(r5);	 Catch:{ IllegalArgumentException -> 0x0152 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0152 }
        r2 = r2 + 1;
        goto L_0x0137;
    L_0x014e:
        r2 = r11.f4974g;
        r2 = r2.length;
        goto L_0x012d;
    L_0x0152:
        r5 = move-exception;
        r12.e(r4);
        r11.m4918a(r12, r8);
        goto L_0x0137;
    L_0x015a:
        r11.f4974g = r0;
    L_0x015c:
        r12.d(r3);
        goto L_0x0007;
    L_0x0161:
        r0 = 58;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f4977j;
        if (r0 != 0) goto L_0x018d;
    L_0x016b:
        r0 = r1;
    L_0x016c:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0793u[r2];
        if (r0 == 0) goto L_0x0176;
    L_0x0171:
        r3 = r11.f4977j;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0176:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0191;
    L_0x017b:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.u;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r12.a(r3);
        r12.a();
        r0 = r0 + 1;
        goto L_0x0176;
    L_0x018d:
        r0 = r11.f4977j;
        r0 = r0.length;
        goto L_0x016c;
    L_0x0191:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.u;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r12.a(r0);
        r11.f4977j = r2;
        goto L_0x0007;
    L_0x01a1:
        r0 = r12.f();
        r11.f4979l = r0;
        goto L_0x0007;
    L_0x01a9:
        r0 = 74;
        r2 = com.google.protobuf.nano.l.a(r12, r0);
        r0 = r11.f4980m;
        if (r0 != 0) goto L_0x01d5;
    L_0x01b3:
        r0 = r1;
    L_0x01b4:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0792t[r2];
        if (r0 == 0) goto L_0x01be;
    L_0x01b9:
        r3 = r11.f4980m;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x01be:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01d9;
    L_0x01c3:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.t;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r12.a(r3);
        r12.a();
        r0 = r0 + 1;
        goto L_0x01be;
    L_0x01d5:
        r0 = r11.f4980m;
        r0 = r0.length;
        goto L_0x01b4;
    L_0x01d9:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.t;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r12.a(r0);
        r11.f4980m = r2;
        goto L_0x0007;
    L_0x01e9:
        r2 = r12.j();
        r11.f4976i = r2;
        goto L_0x0007;
    L_0x01f1:
        r4 = com.google.protobuf.nano.l.a(r12, r9);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x01f9:
        if (r2 >= r4) goto L_0x021b;
    L_0x01fb:
        if (r2 == 0) goto L_0x0200;
    L_0x01fd:
        r12.a();
    L_0x0200:
        r6 = r12.o();
        r7 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0213 }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ai.m5288a(r7);	 Catch:{ IllegalArgumentException -> 0x0213 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0213 }
        r0 = r0 + 1;
    L_0x0210:
        r2 = r2 + 1;
        goto L_0x01f9;
    L_0x0213:
        r7 = move-exception;
        r12.e(r6);
        r11.m4918a(r12, r3);
        goto L_0x0210;
    L_0x021b:
        if (r0 == 0) goto L_0x0007;
    L_0x021d:
        r2 = r11.f4975h;
        if (r2 != 0) goto L_0x022b;
    L_0x0221:
        r2 = r1;
    L_0x0222:
        if (r2 != 0) goto L_0x022f;
    L_0x0224:
        r3 = r5.length;
        if (r0 != r3) goto L_0x022f;
    L_0x0227:
        r11.f4975h = r5;
        goto L_0x0007;
    L_0x022b:
        r2 = r11.f4975h;
        r2 = r2.length;
        goto L_0x0222;
    L_0x022f:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x023a;
    L_0x0235:
        r4 = r11.f4975h;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x023a:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f4975h = r3;
        goto L_0x0007;
    L_0x0241:
        r0 = r12.i();
        r3 = r12.c(r0);
        r2 = r12.o();
        r0 = r1;
    L_0x024e:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x025e;
    L_0x0254:
        r4 = r12.i();	 Catch:{ IllegalArgumentException -> 0x038c }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ai.m5288a(r4);	 Catch:{ IllegalArgumentException -> 0x038c }
        r0 = r0 + 1;
        goto L_0x024e;
    L_0x025e:
        if (r0 == 0) goto L_0x0297;
    L_0x0260:
        r12.e(r2);
        r2 = r11.f4975h;
        if (r2 != 0) goto L_0x0289;
    L_0x0267:
        r2 = r1;
    L_0x0268:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0272;
    L_0x026d:
        r4 = r11.f4975h;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0272:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x0295;
    L_0x0278:
        r4 = r12.o();
        r5 = r12.i();	 Catch:{ IllegalArgumentException -> 0x028d }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ai.m5288a(r5);	 Catch:{ IllegalArgumentException -> 0x028d }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x028d }
        r2 = r2 + 1;
        goto L_0x0272;
    L_0x0289:
        r2 = r11.f4975h;
        r2 = r2.length;
        goto L_0x0268;
    L_0x028d:
        r5 = move-exception;
        r12.e(r4);
        r11.m4918a(r12, r9);
        goto L_0x0272;
    L_0x0295:
        r11.f4975h = r0;
    L_0x0297:
        r12.d(r3);
        goto L_0x0007;
    L_0x029c:
        r0 = r12.o();
        r2 = r12.i();	 Catch:{ IllegalArgumentException -> 0x02c2 }
        switch(r2) {
            case 0: goto L_0x02cb;
            case 1: goto L_0x02cb;
            case 2: goto L_0x02cb;
            case 3: goto L_0x02cb;
            default: goto L_0x02a7;
        };	 Catch:{ IllegalArgumentException -> 0x02c2 }
    L_0x02a7:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r5 = 48;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r5 = " is not a valid enum LogoUiPreference";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x02c2 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x02c2 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x02c2 }
    L_0x02c2:
        r2 = move-exception;
        r12.e(r0);
        r11.m4918a(r12, r3);
        goto L_0x0007;
    L_0x02cb:
        r11.f4973f = r2;	 Catch:{ IllegalArgumentException -> 0x02c2 }
        goto L_0x0007;
    L_0x02cf:
        r0 = r12.f();
        r11.f4978k = r0;
        goto L_0x0007;
    L_0x02d7:
        r0 = r12.i();
        r11.f4972e = r0;
        goto L_0x0007;
    L_0x02df:
        r4 = com.google.protobuf.nano.l.a(r12, r10);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x02e7:
        if (r2 >= r4) goto L_0x0309;
    L_0x02e9:
        if (r2 == 0) goto L_0x02ee;
    L_0x02eb:
        r12.a();
    L_0x02ee:
        r6 = r12.o();
        r7 = r12.i();	 Catch:{ IllegalArgumentException -> 0x0301 }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0843g.m5371a(r7);	 Catch:{ IllegalArgumentException -> 0x0301 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0301 }
        r0 = r0 + 1;
    L_0x02fe:
        r2 = r2 + 1;
        goto L_0x02e7;
    L_0x0301:
        r7 = move-exception;
        r12.e(r6);
        r11.m4918a(r12, r3);
        goto L_0x02fe;
    L_0x0309:
        if (r0 == 0) goto L_0x0007;
    L_0x030b:
        r2 = r11.f4981n;
        if (r2 != 0) goto L_0x0319;
    L_0x030f:
        r2 = r1;
    L_0x0310:
        if (r2 != 0) goto L_0x031d;
    L_0x0312:
        r3 = r5.length;
        if (r0 != r3) goto L_0x031d;
    L_0x0315:
        r11.f4981n = r5;
        goto L_0x0007;
    L_0x0319:
        r2 = r11.f4981n;
        r2 = r2.length;
        goto L_0x0310;
    L_0x031d:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0328;
    L_0x0323:
        r4 = r11.f4981n;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0328:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r11.f4981n = r3;
        goto L_0x0007;
    L_0x032f:
        r0 = r12.i();
        r3 = r12.c(r0);
        r2 = r12.o();
        r0 = r1;
    L_0x033c:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x034c;
    L_0x0342:
        r4 = r12.i();	 Catch:{ IllegalArgumentException -> 0x038a }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0843g.m5371a(r4);	 Catch:{ IllegalArgumentException -> 0x038a }
        r0 = r0 + 1;
        goto L_0x033c;
    L_0x034c:
        if (r0 == 0) goto L_0x0385;
    L_0x034e:
        r12.e(r2);
        r2 = r11.f4981n;
        if (r2 != 0) goto L_0x0377;
    L_0x0355:
        r2 = r1;
    L_0x0356:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0360;
    L_0x035b:
        r4 = r11.f4981n;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0360:
        r4 = r12.m();
        if (r4 <= 0) goto L_0x0383;
    L_0x0366:
        r4 = r12.o();
        r5 = r12.i();	 Catch:{ IllegalArgumentException -> 0x037b }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0843g.m5371a(r5);	 Catch:{ IllegalArgumentException -> 0x037b }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x037b }
        r2 = r2 + 1;
        goto L_0x0360;
    L_0x0377:
        r2 = r11.f4981n;
        r2 = r2.length;
        goto L_0x0356;
    L_0x037b:
        r5 = move-exception;
        r12.e(r4);
        r11.m4918a(r12, r10);
        goto L_0x0360;
    L_0x0383:
        r11.f4981n = r0;
    L_0x0385:
        r12.d(r3);
        goto L_0x0007;
    L_0x038a:
        r4 = move-exception;
        goto L_0x033c;
    L_0x038c:
        r4 = move-exception;
        goto L_0x024e;
    L_0x038f:
        r4 = move-exception;
        goto L_0x0113;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.c.b.a.p.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.c.b.a.p");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5057b(aVar);
    }
}
