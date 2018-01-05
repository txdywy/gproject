package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7153b extends b {
    public int f34934a;
    public long f34935b;
    public byte[] f34936c;
    public int[] f34937d;
    public int[] f34938e;
    public int f34939f;

    public C7153b() {
        this.f34934a = 0;
        this.f34935b = 0;
        this.f34936c = C7222l.f35479l;
        this.f34937d = C7222l.f35472e;
        this.f34938e = C7222l.f35472e;
        this.f34939f = 0;
        this.aP = -1;
    }

    public final void m32440a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        int i2 = 0;
        if (this.f34934a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34934a);
        }
        if (this.f34935b != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f34935b);
        }
        if (!Arrays.equals(this.f34936c, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(3, this.f34936c);
        }
        if (this.f34937d != null && this.f34937d.length > 0) {
            i = 0;
            for (int c : this.f34937d) {
                i += CodedOutputByteBufferNano.m33498c(c);
            }
            codedOutputByteBufferNano.m33539e(50);
            codedOutputByteBufferNano.m33539e(i);
            for (int i3 : this.f34937d) {
                codedOutputByteBufferNano.m33515a(i3);
            }
        }
        if (this.f34938e != null && this.f34938e.length > 0) {
            i3 = 0;
            for (int c2 : this.f34938e) {
                i3 += CodedOutputByteBufferNano.m33498c(c2);
            }
            codedOutputByteBufferNano.m33539e(58);
            codedOutputByteBufferNano.m33539e(i3);
            while (i2 < this.f34938e.length) {
                codedOutputByteBufferNano.m33515a(this.f34938e[i2]);
                i2++;
            }
        }
        if (this.f34939f != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f34939f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32441b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f34934a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34934a);
        }
        if (this.f34935b != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f34935b);
        }
        if (!Arrays.equals(this.f34936c, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f34936c);
        }
        if (this.f34937d != null && this.f34937d.length > 0) {
            int i3 = 0;
            for (int c : this.f34937d) {
                i3 += CodedOutputByteBufferNano.m33498c(c);
            }
            b = ((b + i3) + 1) + CodedOutputByteBufferNano.m33507f(i3);
        }
        if (this.f34938e != null && this.f34938e.length > 0) {
            i = 0;
            while (i2 < this.f34938e.length) {
                i += CodedOutputByteBufferNano.m33498c(this.f34938e[i2]);
                i2++;
            }
            b = ((b + i) + 1) + CodedOutputByteBufferNano.m33507f(i);
        }
        if (this.f34939f != 0) {
            return b + CodedOutputByteBufferNano.m33502d(8, this.f34939f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p455b.p456a.C7153b m32438b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x0040;
            case 26: goto L_0x0047;
            case 48: goto L_0x004e;
            case 50: goto L_0x0081;
            case 56: goto L_0x00c3;
            case 58: goto L_0x00f7;
            case 64: goto L_0x0139;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r3) {
            case 0: goto L_0x003d;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            case 3: goto L_0x003d;
            case 4: goto L_0x003d;
            case 5: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 40;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum Endpoint";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x003d:
        r7.f34934a = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0040:
        r2 = r8.m33568j();
        r7.f34935b = r2;
        goto L_0x0001;
    L_0x0047:
        r0 = r8.m33565g();
        r7.f34936c = r0;
        goto L_0x0001;
    L_0x004e:
        r0 = 48;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f34937d;
        if (r0 != 0) goto L_0x0074;
    L_0x0058:
        r0 = r1;
    L_0x0059:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x0063;
    L_0x005e:
        r3 = r7.f34937d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0063:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0078;
    L_0x0068:
        r3 = r8.m33567i();
        r2[r0] = r3;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x0063;
    L_0x0074:
        r0 = r7.f34937d;
        r0 = r0.length;
        goto L_0x0059;
    L_0x0078:
        r3 = r8.m33567i();
        r2[r0] = r3;
        r7.f34937d = r2;
        goto L_0x0001;
    L_0x0081:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x008e:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x009a;
    L_0x0094:
        r8.m33567i();
        r0 = r0 + 1;
        goto L_0x008e;
    L_0x009a:
        r8.m33562e(r2);
        r2 = r7.f34937d;
        if (r2 != 0) goto L_0x00b8;
    L_0x00a1:
        r2 = r1;
    L_0x00a2:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00ac;
    L_0x00a7:
        r4 = r7.f34937d;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00ac:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x00bc;
    L_0x00af:
        r4 = r8.m33567i();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x00ac;
    L_0x00b8:
        r2 = r7.f34937d;
        r2 = r2.length;
        goto L_0x00a2;
    L_0x00bc:
        r7.f34937d = r0;
        r8.m33561d(r3);
        goto L_0x0001;
    L_0x00c3:
        r0 = 56;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f34938e;
        if (r0 != 0) goto L_0x00e9;
    L_0x00cd:
        r0 = r1;
    L_0x00ce:
        r2 = r2 + r0;
        r2 = new int[r2];
        if (r0 == 0) goto L_0x00d8;
    L_0x00d3:
        r3 = r7.f34938e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00d8:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00ed;
    L_0x00dd:
        r3 = r8.m33567i();
        r2[r0] = r3;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x00d8;
    L_0x00e9:
        r0 = r7.f34938e;
        r0 = r0.length;
        goto L_0x00ce;
    L_0x00ed:
        r3 = r8.m33567i();
        r2[r0] = r3;
        r7.f34938e = r2;
        goto L_0x0001;
    L_0x00f7:
        r0 = r8.m33567i();
        r3 = r8.m33558c(r0);
        r2 = r8.m33573o();
        r0 = r1;
    L_0x0104:
        r4 = r8.m33571m();
        if (r4 <= 0) goto L_0x0110;
    L_0x010a:
        r8.m33567i();
        r0 = r0 + 1;
        goto L_0x0104;
    L_0x0110:
        r8.m33562e(r2);
        r2 = r7.f34938e;
        if (r2 != 0) goto L_0x012e;
    L_0x0117:
        r2 = r1;
    L_0x0118:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0122;
    L_0x011d:
        r4 = r7.f34938e;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0122:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x0132;
    L_0x0125:
        r4 = r8.m33567i();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x0122;
    L_0x012e:
        r2 = r7.f34938e;
        r2 = r2.length;
        goto L_0x0118;
    L_0x0132:
        r7.f34938e = r0;
        r8.m33561d(r3);
        goto L_0x0001;
    L_0x0139:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x015f }
        switch(r3) {
            case 0: goto L_0x0168;
            case 1: goto L_0x0168;
            case 2: goto L_0x0168;
            default: goto L_0x0144;
        };	 Catch:{ IllegalArgumentException -> 0x015f }
    L_0x0144:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x015f }
        r5 = 45;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x015f }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x015f }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x015f }
        r5 = " is not a valid enum TemplateUsage";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x015f }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x015f }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x015f }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x015f }
    L_0x015f:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x0168:
        r7.f34939f = r3;	 Catch:{ IllegalArgumentException -> 0x015f }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.b.a.b.b(com.google.protobuf.nano.a):com.google.h.c.b.a.b");
    }

    public final /* synthetic */ i m32439a(C7213a c7213a) {
        return m32438b(c7213a);
    }
}
