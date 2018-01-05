package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class ar extends C0758b {
    public int f5393a;
    public int f5394b;
    public int f5395c;
    public String f5396d;
    public int f5397e;
    public int[] f5398f;
    public as[] f5399g;
    public String f5400h;
    public int f5401i;
    public boolean f5402j;
    public String f5403k;
    public boolean f5404l;
    public int f5405m;
    public C0862z f5406n;
    public aa f5407o;

    private static int m5327a(int i) {
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
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum KeyboardLayoutVariation");
        }
    }

    public final C0862z m5329a() {
        if (this.f5393a == 0) {
            return this.f5406n;
        }
        return null;
    }

    public final aa m5333c() {
        if (this.f5393a == 1) {
            return this.f5407o;
        }
        return null;
    }

    public ar() {
        this.f5393a = -1;
        this.f5394b = 0;
        this.f5395c = 0;
        this.f5396d = "";
        this.f5397e = 0;
        this.f5398f = l.e;
        this.f5399g = as.m5334a();
        this.f5400h = "";
        this.f5401i = 0;
        this.f5402j = false;
        this.f5403k = "";
        this.f5404l = false;
        this.f5405m = 0;
        this.f5393a = -1;
        this.f5406n = null;
        this.f5393a = -1;
        this.f5407o = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5394b != 0) {
            codedOutputByteBufferNano.a(1, this.f5394b);
        }
        if (this.f5395c != 0) {
            codedOutputByteBufferNano.a(2, this.f5395c);
        }
        if (!(this.f5396d == null || this.f5396d.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5396d);
        }
        if (this.f5397e != 0) {
            codedOutputByteBufferNano.a(4, this.f5397e);
        }
        if (this.f5399g != null && this.f5399g.length > 0) {
            for (C0757i c0757i : this.f5399g) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(5, c0757i);
                }
            }
        }
        if (!(this.f5400h == null || this.f5400h.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5400h);
        }
        if (this.f5401i != 0) {
            codedOutputByteBufferNano.a(7, this.f5401i);
        }
        if (this.f5404l) {
            codedOutputByteBufferNano.a(8, this.f5404l);
        }
        if (this.f5393a == 0) {
            codedOutputByteBufferNano.b(13, this.f5406n);
        }
        if (this.f5393a == 1) {
            codedOutputByteBufferNano.b(14, this.f5407o);
        }
        if (this.f5398f != null && this.f5398f.length > 0) {
            int i2 = 0;
            for (int c : this.f5398f) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(122);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5398f.length) {
                codedOutputByteBufferNano.e(this.f5398f[i]);
                i++;
            }
        }
        if (!(this.f5403k == null || this.f5403k.equals(""))) {
            codedOutputByteBufferNano.a(16, this.f5403k);
        }
        if (this.f5402j) {
            codedOutputByteBufferNano.a(17, this.f5402j);
        }
        if (this.f5405m != 0) {
            codedOutputByteBufferNano.a(20, this.f5405m);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5394b != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5394b);
        }
        if (this.f5395c != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f5395c);
        }
        if (!(this.f5396d == null || this.f5396d.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5396d);
        }
        if (this.f5397e != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f5397e);
        }
        if (this.f5399g != null && this.f5399g.length > 0) {
            i = b;
            for (C0757i c0757i : this.f5399g) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(5, c0757i);
                }
            }
            b = i;
        }
        if (!(this.f5400h == null || this.f5400h.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f5400h);
        }
        if (this.f5401i != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f5401i);
        }
        if (this.f5404l) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if (this.f5393a == 0) {
            b += CodedOutputByteBufferNano.d(13, this.f5406n);
        }
        if (this.f5393a == 1) {
            b += CodedOutputByteBufferNano.d(14, this.f5407o);
        }
        if (this.f5398f != null && this.f5398f.length > 0) {
            i = 0;
            while (i2 < this.f5398f.length) {
                i += CodedOutputByteBufferNano.c(this.f5398f[i2]);
                i2++;
            }
            b = ((b + i) + 1) + CodedOutputByteBufferNano.f(i);
        }
        if (!(this.f5403k == null || this.f5403k.equals(""))) {
            b += CodedOutputByteBufferNano.b(16, this.f5403k);
        }
        if (this.f5402j) {
            b += CodedOutputByteBufferNano.d(17) + 1;
        }
        if (this.f5405m != 0) {
            return b + CodedOutputByteBufferNano.d(20, this.f5405m);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ar m5328b(com.google.protobuf.nano.a r10) {
        /*
        r9 = this;
        r8 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1 = 0;
    L_0x0003:
        r3 = r10.a();
        switch(r3) {
            case 0: goto L_0x0010;
            case 8: goto L_0x0011;
            case 16: goto L_0x0018;
            case 26: goto L_0x001f;
            case 32: goto L_0x0026;
            case 42: goto L_0x0057;
            case 50: goto L_0x0097;
            case 56: goto L_0x009f;
            case 64: goto L_0x00d2;
            case 106: goto L_0x00da;
            case 114: goto L_0x00ee;
            case 120: goto L_0x0103;
            case 122: goto L_0x0153;
            case 130: goto L_0x01ae;
            case 136: goto L_0x01b6;
            case 160: goto L_0x01be;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.m4918a(r10, r3);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r9;
    L_0x0011:
        r0 = r10.i();
        r9.f5394b = r0;
        goto L_0x0003;
    L_0x0018:
        r0 = r10.i();
        r9.f5395c = r0;
        goto L_0x0003;
    L_0x001f:
        r0 = r10.f();
        r9.f5396d = r0;
        goto L_0x0003;
    L_0x0026:
        r0 = r10.o();
        r2 = r10.i();	 Catch:{ IllegalArgumentException -> 0x004c }
        switch(r2) {
            case 0: goto L_0x0054;
            case 1: goto L_0x0054;
            case 2: goto L_0x0054;
            case 3: goto L_0x0054;
            case 4: goto L_0x0054;
            default: goto L_0x0031;
        };	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x0031:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004c }
        r5 = 46;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004c }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        r5 = " is not a valid enum KeyboardLayout";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x004c }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        r10.e(r0);
        r9.m4918a(r10, r3);
        goto L_0x0003;
    L_0x0054:
        r9.f5397e = r2;	 Catch:{ IllegalArgumentException -> 0x004c }
        goto L_0x0003;
    L_0x0057:
        r0 = 42;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f5399g;
        if (r0 != 0) goto L_0x0083;
    L_0x0061:
        r0 = r1;
    L_0x0062:
        r2 = r2 + r0;
        r2 = new com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.as[r2];
        if (r0 == 0) goto L_0x006c;
    L_0x0067:
        r3 = r9.f5399g;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x006c:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0087;
    L_0x0071:
        r3 = new com.google.a.a.a.a.b.a.b.a.as;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r10.a(r3);
        r10.a();
        r0 = r0 + 1;
        goto L_0x006c;
    L_0x0083:
        r0 = r9.f5399g;
        r0 = r0.length;
        goto L_0x0062;
    L_0x0087:
        r3 = new com.google.a.a.a.a.b.a.b.a.as;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r10.a(r0);
        r9.f5399g = r2;
        goto L_0x0003;
    L_0x0097:
        r0 = r10.f();
        r9.f5400h = r0;
        goto L_0x0003;
    L_0x009f:
        r0 = r10.o();
        r2 = r10.i();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        switch(r2) {
            case 0: goto L_0x00ce;
            case 1: goto L_0x00ce;
            case 2: goto L_0x00ce;
            case 3: goto L_0x00ce;
            default: goto L_0x00aa;
        };	 Catch:{ IllegalArgumentException -> 0x00c5 }
    L_0x00aa:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r5 = 47;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r5 = " is not a valid enum RedactionScheme";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00c5 }
    L_0x00c5:
        r2 = move-exception;
        r10.e(r0);
        r9.m4918a(r10, r3);
        goto L_0x0003;
    L_0x00ce:
        r9.f5401i = r2;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        goto L_0x0003;
    L_0x00d2:
        r0 = r10.e();
        r9.f5404l = r0;
        goto L_0x0003;
    L_0x00da:
        r0 = r9.f5406n;
        if (r0 != 0) goto L_0x00e5;
    L_0x00de:
        r0 = new com.google.a.a.a.a.b.a.b.a.z;
        r0.<init>();
        r9.f5406n = r0;
    L_0x00e5:
        r0 = r9.f5406n;
        r10.a(r0);
        r9.f5393a = r1;
        goto L_0x0003;
    L_0x00ee:
        r0 = r9.f5407o;
        if (r0 != 0) goto L_0x00f9;
    L_0x00f2:
        r0 = new com.google.a.a.a.a.b.a.b.a.aa;
        r0.<init>();
        r9.f5407o = r0;
    L_0x00f9:
        r0 = r9.f5407o;
        r10.a(r0);
        r0 = 1;
        r9.f5393a = r0;
        goto L_0x0003;
    L_0x0103:
        r4 = com.google.protobuf.nano.l.a(r10, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x010b:
        if (r2 >= r4) goto L_0x012d;
    L_0x010d:
        if (r2 == 0) goto L_0x0112;
    L_0x010f:
        r10.a();
    L_0x0112:
        r6 = r10.o();
        r7 = r10.i();	 Catch:{ IllegalArgumentException -> 0x0125 }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ar.m5327a(r7);	 Catch:{ IllegalArgumentException -> 0x0125 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0125 }
        r0 = r0 + 1;
    L_0x0122:
        r2 = r2 + 1;
        goto L_0x010b;
    L_0x0125:
        r7 = move-exception;
        r10.e(r6);
        r9.m4918a(r10, r3);
        goto L_0x0122;
    L_0x012d:
        if (r0 == 0) goto L_0x0003;
    L_0x012f:
        r2 = r9.f5398f;
        if (r2 != 0) goto L_0x013d;
    L_0x0133:
        r2 = r1;
    L_0x0134:
        if (r2 != 0) goto L_0x0141;
    L_0x0136:
        r3 = r5.length;
        if (r0 != r3) goto L_0x0141;
    L_0x0139:
        r9.f5398f = r5;
        goto L_0x0003;
    L_0x013d:
        r2 = r9.f5398f;
        r2 = r2.length;
        goto L_0x0134;
    L_0x0141:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x014c;
    L_0x0147:
        r4 = r9.f5398f;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x014c:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r9.f5398f = r3;
        goto L_0x0003;
    L_0x0153:
        r0 = r10.i();
        r3 = r10.c(r0);
        r2 = r10.o();
        r0 = r1;
    L_0x0160:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x0170;
    L_0x0166:
        r4 = r10.i();	 Catch:{ IllegalArgumentException -> 0x01f1 }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ar.m5327a(r4);	 Catch:{ IllegalArgumentException -> 0x01f1 }
        r0 = r0 + 1;
        goto L_0x0160;
    L_0x0170:
        if (r0 == 0) goto L_0x01a9;
    L_0x0172:
        r10.e(r2);
        r2 = r9.f5398f;
        if (r2 != 0) goto L_0x019b;
    L_0x0179:
        r2 = r1;
    L_0x017a:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0184;
    L_0x017f:
        r4 = r9.f5398f;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0184:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x01a7;
    L_0x018a:
        r4 = r10.o();
        r5 = r10.i();	 Catch:{ IllegalArgumentException -> 0x019f }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ar.m5327a(r5);	 Catch:{ IllegalArgumentException -> 0x019f }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x019f }
        r2 = r2 + 1;
        goto L_0x0184;
    L_0x019b:
        r2 = r9.f5398f;
        r2 = r2.length;
        goto L_0x017a;
    L_0x019f:
        r5 = move-exception;
        r10.e(r4);
        r9.m4918a(r10, r8);
        goto L_0x0184;
    L_0x01a7:
        r9.f5398f = r0;
    L_0x01a9:
        r10.d(r3);
        goto L_0x0003;
    L_0x01ae:
        r0 = r10.f();
        r9.f5403k = r0;
        goto L_0x0003;
    L_0x01b6:
        r0 = r10.e();
        r9.f5402j = r0;
        goto L_0x0003;
    L_0x01be:
        r0 = r10.o();
        r2 = r10.i();	 Catch:{ IllegalArgumentException -> 0x01e4 }
        switch(r2) {
            case 0: goto L_0x01ed;
            case 1: goto L_0x01ed;
            case 2: goto L_0x01ed;
            case 3: goto L_0x01ed;
            default: goto L_0x01c9;
        };	 Catch:{ IllegalArgumentException -> 0x01e4 }
    L_0x01c9:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r5 = 40;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r5 = " is not a valid enum MaskType";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x01e4 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x01e4 }
    L_0x01e4:
        r2 = move-exception;
        r10.e(r0);
        r9.m4918a(r10, r3);
        goto L_0x0003;
    L_0x01ed:
        r9.f5405m = r2;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        goto L_0x0003;
    L_0x01f1:
        r4 = move-exception;
        goto L_0x0160;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.ar.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.ar");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5328b(aVar);
    }
}
