package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0867e extends C0758b {
    public long f5523a;
    public byte[] f5524b;
    public byte[] f5525c;
    public String f5526d;
    public byte[] f5527e;
    public int[] f5528f;
    public int f5529g;
    public int[] f5530h;
    public boolean f5531i;

    private static int m5458a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum GlobalClientFeature");
        }
    }

    public C0867e() {
        this.f5523a = -1;
        this.f5524b = l.l;
        this.f5525c = l.l;
        this.f5526d = "";
        this.f5527e = l.l;
        this.f5528f = l.e;
        this.f5529g = 0;
        this.f5530h = l.e;
        this.f5531i = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5523a != -1) {
            codedOutputByteBufferNano.b(1, this.f5523a);
        }
        if (!Arrays.equals(this.f5524b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5524b);
        }
        if (!Arrays.equals(this.f5525c, l.l)) {
            codedOutputByteBufferNano.a(5, this.f5525c);
        }
        if (!(this.f5526d == null || this.f5526d.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5526d);
        }
        if (!Arrays.equals(this.f5527e, l.l)) {
            codedOutputByteBufferNano.a(7, this.f5527e);
        }
        if (this.f5528f != null && this.f5528f.length > 0) {
            for (int a : this.f5528f) {
                codedOutputByteBufferNano.a(8, a);
            }
        }
        if (this.f5529g != 0) {
            codedOutputByteBufferNano.a(10, this.f5529g);
        }
        if (this.f5530h != null && this.f5530h.length > 0) {
            int i2 = 0;
            for (int a2 : this.f5530h) {
                i2 += CodedOutputByteBufferNano.c(a2);
            }
            codedOutputByteBufferNano.e(106);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5530h.length) {
                codedOutputByteBufferNano.e(this.f5530h[i]);
                i++;
            }
        }
        if (this.f5531i) {
            codedOutputByteBufferNano.a(15, this.f5531i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5523a != -1) {
            b += CodedOutputByteBufferNano.f(1, this.f5523a);
        }
        if (!Arrays.equals(this.f5524b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5524b);
        }
        if (!Arrays.equals(this.f5525c, l.l)) {
            b += CodedOutputByteBufferNano.b(5, this.f5525c);
        }
        if (!(this.f5526d == null || this.f5526d.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f5526d);
        }
        if (!Arrays.equals(this.f5527e, l.l)) {
            b += CodedOutputByteBufferNano.b(7, this.f5527e);
        }
        if (this.f5528f != null && this.f5528f.length > 0) {
            int i3 = 0;
            for (int c : this.f5528f) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i3) + (this.f5528f.length * 1);
        }
        if (this.f5529g != 0) {
            b += CodedOutputByteBufferNano.d(10, this.f5529g);
        }
        if (this.f5530h != null && this.f5530h.length > 0) {
            i = 0;
            while (i2 < this.f5530h.length) {
                i += CodedOutputByteBufferNano.c(this.f5530h[i2]);
                i2++;
            }
            b = ((b + i) + 1) + CodedOutputByteBufferNano.f(i);
        }
        if (this.f5531i) {
            return b + (CodedOutputByteBufferNano.d(15) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0867e m5459b(com.google.protobuf.nano.a r11) {
        /*
        r10 = this;
        r9 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r8 = 64;
        r1 = 0;
    L_0x0005:
        r3 = r11.a();
        switch(r3) {
            case 0: goto L_0x0012;
            case 8: goto L_0x0013;
            case 18: goto L_0x001a;
            case 42: goto L_0x0021;
            case 50: goto L_0x0028;
            case 58: goto L_0x002f;
            case 64: goto L_0x0036;
            case 66: goto L_0x0084;
            case 80: goto L_0x00df;
            case 104: goto L_0x0112;
            case 106: goto L_0x0162;
            case 120: goto L_0x01bd;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = super.m4918a(r11, r3);
        if (r0 != 0) goto L_0x0005;
    L_0x0012:
        return r10;
    L_0x0013:
        r2 = r11.j();
        r10.f5523a = r2;
        goto L_0x0005;
    L_0x001a:
        r0 = r11.g();
        r10.f5524b = r0;
        goto L_0x0005;
    L_0x0021:
        r0 = r11.g();
        r10.f5525c = r0;
        goto L_0x0005;
    L_0x0028:
        r0 = r11.f();
        r10.f5526d = r0;
        goto L_0x0005;
    L_0x002f:
        r0 = r11.g();
        r10.f5527e = r0;
        goto L_0x0005;
    L_0x0036:
        r4 = com.google.protobuf.nano.l.a(r11, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x003e:
        if (r2 >= r4) goto L_0x0060;
    L_0x0040:
        if (r2 == 0) goto L_0x0045;
    L_0x0042:
        r11.a();
    L_0x0045:
        r6 = r11.o();
        r7 = r11.i();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0867e.m5458a(r7);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r0 = r0 + 1;
    L_0x0055:
        r2 = r2 + 1;
        goto L_0x003e;
    L_0x0058:
        r7 = move-exception;
        r11.e(r6);
        r10.m4918a(r11, r3);
        goto L_0x0055;
    L_0x0060:
        if (r0 == 0) goto L_0x0005;
    L_0x0062:
        r2 = r10.f5528f;
        if (r2 != 0) goto L_0x006f;
    L_0x0066:
        r2 = r1;
    L_0x0067:
        if (r2 != 0) goto L_0x0073;
    L_0x0069:
        r3 = r5.length;
        if (r0 != r3) goto L_0x0073;
    L_0x006c:
        r10.f5528f = r5;
        goto L_0x0005;
    L_0x006f:
        r2 = r10.f5528f;
        r2 = r2.length;
        goto L_0x0067;
    L_0x0073:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x007e;
    L_0x0079:
        r4 = r10.f5528f;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x007e:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r10.f5528f = r3;
        goto L_0x0005;
    L_0x0084:
        r0 = r11.i();
        r3 = r11.c(r0);
        r2 = r11.o();
        r0 = r1;
    L_0x0091:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x00a1;
    L_0x0097:
        r4 = r11.i();	 Catch:{ IllegalArgumentException -> 0x01c7 }
        com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0867e.m5458a(r4);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r0 = r0 + 1;
        goto L_0x0091;
    L_0x00a1:
        if (r0 == 0) goto L_0x00da;
    L_0x00a3:
        r11.e(r2);
        r2 = r10.f5528f;
        if (r2 != 0) goto L_0x00cc;
    L_0x00aa:
        r2 = r1;
    L_0x00ab:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00b5;
    L_0x00b0:
        r4 = r10.f5528f;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00b5:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x00d8;
    L_0x00bb:
        r4 = r11.o();
        r5 = r11.i();	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r5 = com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0867e.m5458a(r5);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r2 = r2 + 1;
        goto L_0x00b5;
    L_0x00cc:
        r2 = r10.f5528f;
        r2 = r2.length;
        goto L_0x00ab;
    L_0x00d0:
        r5 = move-exception;
        r11.e(r4);
        r10.m4918a(r11, r8);
        goto L_0x00b5;
    L_0x00d8:
        r10.f5528f = r0;
    L_0x00da:
        r11.d(r3);
        goto L_0x0005;
    L_0x00df:
        r0 = r11.o();
        r2 = r11.i();	 Catch:{ IllegalArgumentException -> 0x0105 }
        switch(r2) {
            case 0: goto L_0x010e;
            case 1: goto L_0x00ea;
            case 2: goto L_0x010e;
            case 3: goto L_0x00ea;
            case 4: goto L_0x00ea;
            case 5: goto L_0x010e;
            case 6: goto L_0x010e;
            default: goto L_0x00ea;
        };	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x00ea:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r5 = 46;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r5 = " is not a valid enum ClientLogLevel";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0105 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0105 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0105 }
    L_0x0105:
        r2 = move-exception;
        r11.e(r0);
        r10.m4918a(r11, r3);
        goto L_0x0005;
    L_0x010e:
        r10.f5529g = r2;	 Catch:{ IllegalArgumentException -> 0x0105 }
        goto L_0x0005;
    L_0x0112:
        r4 = com.google.protobuf.nano.l.a(r11, r9);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x011a:
        if (r2 >= r4) goto L_0x013c;
    L_0x011c:
        if (r2 == 0) goto L_0x0121;
    L_0x011e:
        r11.a();
    L_0x0121:
        r6 = r11.o();
        r7 = r11.i();	 Catch:{ IllegalArgumentException -> 0x0134 }
        r7 = com.google.h.c.b.a.a.a(r7);	 Catch:{ IllegalArgumentException -> 0x0134 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0134 }
        r0 = r0 + 1;
    L_0x0131:
        r2 = r2 + 1;
        goto L_0x011a;
    L_0x0134:
        r7 = move-exception;
        r11.e(r6);
        r10.m4918a(r11, r3);
        goto L_0x0131;
    L_0x013c:
        if (r0 == 0) goto L_0x0005;
    L_0x013e:
        r2 = r10.f5530h;
        if (r2 != 0) goto L_0x014c;
    L_0x0142:
        r2 = r1;
    L_0x0143:
        if (r2 != 0) goto L_0x0150;
    L_0x0145:
        r3 = r5.length;
        if (r0 != r3) goto L_0x0150;
    L_0x0148:
        r10.f5530h = r5;
        goto L_0x0005;
    L_0x014c:
        r2 = r10.f5530h;
        r2 = r2.length;
        goto L_0x0143;
    L_0x0150:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x015b;
    L_0x0156:
        r4 = r10.f5530h;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x015b:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r10.f5530h = r3;
        goto L_0x0005;
    L_0x0162:
        r0 = r11.i();
        r3 = r11.c(r0);
        r2 = r11.o();
        r0 = r1;
    L_0x016f:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x017f;
    L_0x0175:
        r4 = r11.i();	 Catch:{ IllegalArgumentException -> 0x01c5 }
        com.google.h.c.b.a.a.a(r4);	 Catch:{ IllegalArgumentException -> 0x01c5 }
        r0 = r0 + 1;
        goto L_0x016f;
    L_0x017f:
        if (r0 == 0) goto L_0x01b8;
    L_0x0181:
        r11.e(r2);
        r2 = r10.f5530h;
        if (r2 != 0) goto L_0x01aa;
    L_0x0188:
        r2 = r1;
    L_0x0189:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0193;
    L_0x018e:
        r4 = r10.f5530h;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0193:
        r4 = r11.m();
        if (r4 <= 0) goto L_0x01b6;
    L_0x0199:
        r4 = r11.o();
        r5 = r11.i();	 Catch:{ IllegalArgumentException -> 0x01ae }
        r5 = com.google.h.c.b.a.a.a(r5);	 Catch:{ IllegalArgumentException -> 0x01ae }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x01ae }
        r2 = r2 + 1;
        goto L_0x0193;
    L_0x01aa:
        r2 = r10.f5530h;
        r2 = r2.length;
        goto L_0x0189;
    L_0x01ae:
        r5 = move-exception;
        r11.e(r4);
        r10.m4918a(r11, r9);
        goto L_0x0193;
    L_0x01b6:
        r10.f5530h = r0;
    L_0x01b8:
        r11.d(r3);
        goto L_0x0005;
    L_0x01bd:
        r0 = r11.e();
        r10.f5531i = r0;
        goto L_0x0005;
    L_0x01c5:
        r4 = move-exception;
        goto L_0x016f;
    L_0x01c7:
        r4 = move-exception;
        goto L_0x0091;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.c.e.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.c.e");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5459b(aVar);
    }
}
