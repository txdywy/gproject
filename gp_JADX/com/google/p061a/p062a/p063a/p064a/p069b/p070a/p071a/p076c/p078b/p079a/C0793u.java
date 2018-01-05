package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0839c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.aa;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ag;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0793u extends C0758b {
    public static volatile C0793u[] f5003a;
    public String f5004b;
    public C0794v[] f5005c;
    public byte[] f5006d;
    public aa f5007e;
    public int f5008f;
    public int f5009g;
    public int f5010h;
    public int f5011i;
    public int[] f5012j;
    public C0839c[] f5013k;
    public ag f5014l;
    public int[] f5015m;

    public static C0793u[] m5076a() {
        if (f5003a == null) {
            synchronized (h.b) {
                if (f5003a == null) {
                    f5003a = new C0793u[0];
                }
            }
        }
        return f5003a;
    }

    public C0793u() {
        this.f5004b = "";
        this.f5005c = C0794v.m5081a();
        this.f5006d = l.l;
        this.f5007e = null;
        this.f5008f = -1;
        this.f5009g = 0;
        this.f5010h = 0;
        this.f5011i = 0;
        this.f5012j = l.e;
        this.f5013k = C0839c.m5355a();
        this.f5014l = null;
        this.f5015m = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        int i2 = 0;
        if (this.f5005c != null && this.f5005c.length > 0) {
            for (C0757i c0757i : this.f5005c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (!Arrays.equals(this.f5006d, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5006d);
        }
        if (this.f5007e != null) {
            codedOutputByteBufferNano.b(3, this.f5007e);
        }
        if (this.f5011i != 0) {
            codedOutputByteBufferNano.a(4, this.f5011i);
        }
        if (this.f5012j != null && this.f5012j.length > 0) {
            i = 0;
            for (int c : this.f5012j) {
                i += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(42);
            codedOutputByteBufferNano.e(i);
            for (int i3 : this.f5012j) {
                codedOutputByteBufferNano.a(i3);
            }
        }
        if (this.f5010h != 0) {
            codedOutputByteBufferNano.a(6, this.f5010h);
        }
        if (this.f5009g != 0) {
            codedOutputByteBufferNano.a(7, this.f5009g);
        }
        if (this.f5008f != -1) {
            codedOutputByteBufferNano.a(8, this.f5008f);
        }
        if (this.f5013k != null && this.f5013k.length > 0) {
            for (C0757i c0757i2 : this.f5013k) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(9, c0757i2);
                }
            }
        }
        if (this.f5015m != null && this.f5015m.length > 0) {
            i3 = 0;
            for (int c2 : this.f5015m) {
                i3 += CodedOutputByteBufferNano.c(c2);
            }
            codedOutputByteBufferNano.e(82);
            codedOutputByteBufferNano.e(i3);
            while (i2 < this.f5015m.length) {
                codedOutputByteBufferNano.e(this.f5015m[i2]);
                i2++;
            }
        }
        if (!(this.f5004b == null || this.f5004b.equals(""))) {
            codedOutputByteBufferNano.a(11, this.f5004b);
        }
        if (this.f5014l != null) {
            codedOutputByteBufferNano.b(12, this.f5014l);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5005c != null && this.f5005c.length > 0) {
            i = b;
            for (C0757i c0757i : this.f5005c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i;
        }
        if (!Arrays.equals(this.f5006d, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5006d);
        }
        if (this.f5007e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5007e);
        }
        if (this.f5011i != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f5011i);
        }
        if (this.f5012j != null && this.f5012j.length > 0) {
            int i3 = 0;
            for (int c : this.f5012j) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            b = ((b + i3) + 1) + CodedOutputByteBufferNano.f(i3);
        }
        if (this.f5010h != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f5010h);
        }
        if (this.f5009g != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f5009g);
        }
        if (this.f5008f != -1) {
            b += CodedOutputByteBufferNano.d(8, this.f5008f);
        }
        if (this.f5013k != null && this.f5013k.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f5013k) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(9, c0757i2);
                }
            }
            b = i;
        }
        if (this.f5015m != null && this.f5015m.length > 0) {
            i = 0;
            while (i2 < this.f5015m.length) {
                i += CodedOutputByteBufferNano.c(this.f5015m[i2]);
                i2++;
            }
            b = ((b + i) + 1) + CodedOutputByteBufferNano.f(i);
        }
        if (!(this.f5004b == null || this.f5004b.equals(""))) {
            b += CodedOutputByteBufferNano.b(11, this.f5004b);
        }
        if (this.f5014l != null) {
            return b + CodedOutputByteBufferNano.d(12, this.f5014l);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0793u m5077b(com.google.protobuf.nano.a r10) {
        /*
        r9 = this;
        r8 = 80;
        r1 = 0;
    L_0x0003:
        r3 = r10.a();
        switch(r3) {
            case 0: goto L_0x0010;
            case 10: goto L_0x0011;
            case 18: goto L_0x0050;
            case 26: goto L_0x0057;
            case 32: goto L_0x0068;
            case 40: goto L_0x006f;
            case 42: goto L_0x00a3;
            case 48: goto L_0x00e5;
            case 56: goto L_0x0118;
            case 64: goto L_0x0120;
            case 74: goto L_0x0128;
            case 80: goto L_0x0168;
            case 82: goto L_0x01b8;
            case 90: goto L_0x0213;
            case 98: goto L_0x021b;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.m4918a(r10, r3);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r9;
    L_0x0011:
        r0 = 10;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f5005c;
        if (r0 != 0) goto L_0x003d;
    L_0x001b:
        r0 = r1;
    L_0x001c:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0794v[r2];
        if (r0 == 0) goto L_0x0026;
    L_0x0021:
        r3 = r9.f5005c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0026:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0041;
    L_0x002b:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.v;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r10.a(r3);
        r10.a();
        r0 = r0 + 1;
        goto L_0x0026;
    L_0x003d:
        r0 = r9.f5005c;
        r0 = r0.length;
        goto L_0x001c;
    L_0x0041:
        r3 = new com.google.a.a.a.a.b.a.a.c.b.a.v;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r10.a(r0);
        r9.f5005c = r2;
        goto L_0x0003;
    L_0x0050:
        r0 = r10.g();
        r9.f5006d = r0;
        goto L_0x0003;
    L_0x0057:
        r0 = r9.f5007e;
        if (r0 != 0) goto L_0x0062;
    L_0x005b:
        r0 = new com.google.a.a.a.a.b.a.b.a.aa;
        r0.<init>();
        r9.f5007e = r0;
    L_0x0062:
        r0 = r9.f5007e;
        r10.a(r0);
        goto L_0x0003;
    L_0x0068:
        r0 = r10.i();
        r9.f5011i = r0;
        goto L_0x0003;
    L_0x006f:
        r0 = 40;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f5012j;
        if (r0 != 0) goto L_0x0095;
    L_0x0079:
        r0 = r1;
    L_0x007a:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x0084;
    L_0x007f:
        r3 = r9.f5012j;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0084:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0099;
    L_0x0089:
        r3 = r10.i();
        r2[r0] = r3;
        r10.a();
        r0 = r0 + 1;
        goto L_0x0084;
    L_0x0095:
        r0 = r9.f5012j;
        r0 = r0.length;
        goto L_0x007a;
    L_0x0099:
        r3 = r10.i();
        r2[r0] = r3;
        r9.f5012j = r2;
        goto L_0x0003;
    L_0x00a3:
        r0 = r10.i();
        r3 = r10.c(r0);
        r2 = r10.o();
        r0 = r1;
    L_0x00b0:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x00bc;
    L_0x00b6:
        r10.i();
        r0 = r0 + 1;
        goto L_0x00b0;
    L_0x00bc:
        r10.e(r2);
        r2 = r9.f5012j;
        if (r2 != 0) goto L_0x00da;
    L_0x00c3:
        r2 = r1;
    L_0x00c4:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00ce;
    L_0x00c9:
        r4 = r9.f5012j;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00ce:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00de;
    L_0x00d1:
        r4 = r10.i();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00ce;
    L_0x00da:
        r2 = r9.f5012j;
        r2 = r2.length;
        goto L_0x00c4;
    L_0x00de:
        r9.f5012j = r0;
        r10.d(r3);
        goto L_0x0003;
    L_0x00e5:
        r0 = r10.o();
        r2 = r10.i();	 Catch:{ IllegalArgumentException -> 0x010b }
        switch(r2) {
            case 0: goto L_0x0114;
            case 1: goto L_0x0114;
            case 2: goto L_0x0114;
            default: goto L_0x00f0;
        };	 Catch:{ IllegalArgumentException -> 0x010b }
    L_0x00f0:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x010b }
        r5 = 47;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x010b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x010b }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x010b }
        r5 = " is not a valid enum PanChecksumType";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x010b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x010b }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x010b }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x010b }
    L_0x010b:
        r2 = move-exception;
        r10.e(r0);
        r9.m4918a(r10, r3);
        goto L_0x0003;
    L_0x0114:
        r9.f5010h = r2;	 Catch:{ IllegalArgumentException -> 0x010b }
        goto L_0x0003;
    L_0x0118:
        r0 = r10.i();
        r9.f5009g = r0;
        goto L_0x0003;
    L_0x0120:
        r0 = r10.i();
        r9.f5008f = r0;
        goto L_0x0003;
    L_0x0128:
        r0 = 74;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f5013k;
        if (r0 != 0) goto L_0x0154;
    L_0x0132:
        r0 = r1;
    L_0x0133:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0839c[r2];
        if (r0 == 0) goto L_0x013d;
    L_0x0138:
        r3 = r9.f5013k;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x013d:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0158;
    L_0x0142:
        r3 = new com.google.a.a.a.a.b.a.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r10.a(r3);
        r10.a();
        r0 = r0 + 1;
        goto L_0x013d;
    L_0x0154:
        r0 = r9.f5013k;
        r0 = r0.length;
        goto L_0x0133;
    L_0x0158:
        r3 = new com.google.a.a.a.a.b.a.b.a.c;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r10.a(r0);
        r9.f5013k = r2;
        goto L_0x0003;
    L_0x0168:
        r4 = com.google.protobuf.nano.l.a(r10, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x0170:
        if (r2 >= r4) goto L_0x0192;
    L_0x0172:
        if (r2 == 0) goto L_0x0177;
    L_0x0174:
        r10.a();
    L_0x0177:
        r6 = r10.o();
        r7 = r10.i();	 Catch:{ IllegalArgumentException -> 0x018a }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0768a.m4957a(r7);	 Catch:{ IllegalArgumentException -> 0x018a }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x018a }
        r0 = r0 + 1;
    L_0x0187:
        r2 = r2 + 1;
        goto L_0x0170;
    L_0x018a:
        r7 = move-exception;
        r10.e(r6);
        r9.m4918a(r10, r3);
        goto L_0x0187;
    L_0x0192:
        if (r0 == 0) goto L_0x0003;
    L_0x0194:
        r2 = r9.f5015m;
        if (r2 != 0) goto L_0x01a2;
    L_0x0198:
        r2 = r1;
    L_0x0199:
        if (r2 != 0) goto L_0x01a6;
    L_0x019b:
        r3 = r5.length;
        if (r0 != r3) goto L_0x01a6;
    L_0x019e:
        r9.f5015m = r5;
        goto L_0x0003;
    L_0x01a2:
        r2 = r9.f5015m;
        r2 = r2.length;
        goto L_0x0199;
    L_0x01a6:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x01b1;
    L_0x01ac:
        r4 = r9.f5015m;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x01b1:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r9.f5015m = r3;
        goto L_0x0003;
    L_0x01b8:
        r0 = r10.i();
        r3 = r10.c(r0);
        r2 = r10.o();
        r0 = r1;
    L_0x01c5:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x01d5;
    L_0x01cb:
        r4 = r10.i();	 Catch:{ IllegalArgumentException -> 0x022d }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0768a.m4957a(r4);	 Catch:{ IllegalArgumentException -> 0x022d }
        r0 = r0 + 1;
        goto L_0x01c5;
    L_0x01d5:
        if (r0 == 0) goto L_0x020e;
    L_0x01d7:
        r10.e(r2);
        r2 = r9.f5015m;
        if (r2 != 0) goto L_0x0200;
    L_0x01de:
        r2 = r1;
    L_0x01df:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x01e9;
    L_0x01e4:
        r4 = r9.f5015m;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x01e9:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x020c;
    L_0x01ef:
        r4 = r10.o();
        r5 = r10.i();	 Catch:{ IllegalArgumentException -> 0x0204 }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0768a.m4957a(r5);	 Catch:{ IllegalArgumentException -> 0x0204 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0204 }
        r2 = r2 + 1;
        goto L_0x01e9;
    L_0x0200:
        r2 = r9.f5015m;
        r2 = r2.length;
        goto L_0x01df;
    L_0x0204:
        r5 = move-exception;
        r10.e(r4);
        r9.m4918a(r10, r8);
        goto L_0x01e9;
    L_0x020c:
        r9.f5015m = r0;
    L_0x020e:
        r10.d(r3);
        goto L_0x0003;
    L_0x0213:
        r0 = r10.f();
        r9.f5004b = r0;
        goto L_0x0003;
    L_0x021b:
        r0 = r9.f5014l;
        if (r0 != 0) goto L_0x0226;
    L_0x021f:
        r0 = new com.google.a.a.a.a.b.a.b.a.ag;
        r0.<init>();
        r9.f5014l = r0;
    L_0x0226:
        r0 = r9.f5014l;
        r10.a(r0);
        goto L_0x0003;
    L_0x022d:
        r4 = move-exception;
        goto L_0x01c5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.c.b.a.u.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.c.b.a.u");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5077b(aVar);
    }
}
