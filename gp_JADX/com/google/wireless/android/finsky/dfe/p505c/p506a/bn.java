package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bn extends b {
    public int f37212a;
    public bp f37213b;
    public bp f37214c;
    public String[] f37215d;
    public boolean f37216e;
    public cg f37217f;
    public int f37218g;

    public bn() {
        this.f37212a = 0;
        this.f37213b = null;
        this.f37214c = null;
        this.f37215d = C7222l.f35477j;
        this.f37216e = false;
        this.f37217f = null;
        this.f37218g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35199a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37213b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37213b);
        }
        if (this.f37214c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37214c);
        }
        if (this.f37215d != null && this.f37215d.length > 0) {
            for (String str : this.f37215d) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(4, str);
                }
            }
        }
        if ((this.f37212a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37216e);
        }
        if (this.f37217f != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37217f);
        }
        if ((this.f37212a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f37218g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35200b() {
        int i = 0;
        int b = super.b();
        if (this.f37213b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37213b);
        }
        if (this.f37214c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37214c);
        }
        if (this.f37215d != null && this.f37215d.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f37215d.length) {
                String str = this.f37215d[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f37212a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if (this.f37217f != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f37217f);
        }
        if ((this.f37212a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(8, this.f37218g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.bn m35197b(com.google.protobuf.nano.C7213a r9) {
        /*
        r8 = this;
        r7 = 34;
        r1 = 0;
    L_0x0003:
        r0 = r9.m33550a();
        switch(r0) {
            case 0: goto L_0x0010;
            case 18: goto L_0x0011;
            case 26: goto L_0x0022;
            case 34: goto L_0x0033;
            case 40: goto L_0x0064;
            case 58: goto L_0x0071;
            case 64: goto L_0x0082;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.a(r9, r0);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r8;
    L_0x0011:
        r0 = r8.f37213b;
        if (r0 != 0) goto L_0x001c;
    L_0x0015:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.bp;
        r0.<init>();
        r8.f37213b = r0;
    L_0x001c:
        r0 = r8.f37213b;
        r9.m33552a(r0);
        goto L_0x0003;
    L_0x0022:
        r0 = r8.f37214c;
        if (r0 != 0) goto L_0x002d;
    L_0x0026:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.bp;
        r0.<init>();
        r8.f37214c = r0;
    L_0x002d:
        r0 = r8.f37214c;
        r9.m33552a(r0);
        goto L_0x0003;
    L_0x0033:
        r2 = com.google.protobuf.nano.C7222l.m33624a(r9, r7);
        r0 = r8.f37215d;
        if (r0 != 0) goto L_0x0057;
    L_0x003b:
        r0 = r1;
    L_0x003c:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0046;
    L_0x0041:
        r3 = r8.f37215d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0046:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x005b;
    L_0x004b:
        r3 = r9.m33564f();
        r2[r0] = r3;
        r9.m33550a();
        r0 = r0 + 1;
        goto L_0x0046;
    L_0x0057:
        r0 = r8.f37215d;
        r0 = r0.length;
        goto L_0x003c;
    L_0x005b:
        r3 = r9.m33564f();
        r2[r0] = r3;
        r8.f37215d = r2;
        goto L_0x0003;
    L_0x0064:
        r0 = r9.m33563e();
        r8.f37216e = r0;
        r0 = r8.f37212a;
        r0 = r0 | 1;
        r8.f37212a = r0;
        goto L_0x0003;
    L_0x0071:
        r0 = r8.f37217f;
        if (r0 != 0) goto L_0x007c;
    L_0x0075:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.cg;
        r0.<init>();
        r8.f37217f = r0;
    L_0x007c:
        r0 = r8.f37217f;
        r9.m33552a(r0);
        goto L_0x0003;
    L_0x0082:
        r2 = r8.f37212a;
        r2 = r2 | 2;
        r8.f37212a = r2;
        r2 = r9.m33573o();
        r3 = r9.m33567i();	 Catch:{ IllegalArgumentException -> 0x00ae }
        switch(r3) {
            case 0: goto L_0x00b7;
            case 1: goto L_0x00b7;
            default: goto L_0x0093;
        };	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x0093:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = 34;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = " is not a valid enum Id";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00ae }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x00ae:
        r3 = move-exception;
        r9.m33562e(r2);
        r8.a(r9, r0);
        goto L_0x0003;
    L_0x00b7:
        r8.f37218g = r3;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r3 = r8.f37212a;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r3 = r3 | 2;
        r8.f37212a = r3;	 Catch:{ IllegalArgumentException -> 0x00ae }
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.bn.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.bn");
    }

    public final /* synthetic */ i m35198a(C7213a c7213a) {
        return m35197b(c7213a);
    }
}
