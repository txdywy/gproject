package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p485c.p486a.p487a.C7298a;

public final class ek extends b {
    public int f38754a;
    public String f38755b;
    public boolean f38756c;
    public C7298a f38757d;
    public String[] f38758e;
    public String f38759f;
    public int f38760g;
    public String f38761h;
    public ax f38762i;
    public int f38763j;
    public long f38764k;
    public byte[] f38765l;
    public String f38766m;

    public ek() {
        this.f38754a = 0;
        this.f38755b = "";
        this.f38756c = false;
        this.f38757d = null;
        this.f38758e = C7222l.f35477j;
        this.f38759f = "";
        this.f38760g = 1;
        this.f38761h = "";
        this.f38762i = null;
        this.f38763j = 1;
        this.f38764k = 0;
        this.f38765l = C7222l.f35479l;
        this.f38766m = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36337a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38754a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38755b);
        }
        if ((this.f38754a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38756c);
        }
        if (this.f38757d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38757d);
        }
        if (this.f38758e != null && this.f38758e.length > 0) {
            for (String str : this.f38758e) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(4, str);
                }
            }
        }
        if ((this.f38754a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38759f);
        }
        if ((this.f38754a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38760g);
        }
        if ((this.f38754a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38761h);
        }
        if (this.f38762i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f38762i);
        }
        if ((this.f38754a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f38763j);
        }
        if ((this.f38754a & 64) != 0) {
            codedOutputByteBufferNano.m33531b(10, this.f38764k);
        }
        if ((this.f38754a & 128) != 0) {
            codedOutputByteBufferNano.m33523a(11, this.f38765l);
        }
        if ((this.f38754a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(12, this.f38766m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36338b() {
        int i = 0;
        int b = super.b();
        if ((this.f38754a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38755b);
        }
        if ((this.f38754a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f38757d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38757d);
        }
        if (this.f38758e != null && this.f38758e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f38758e.length) {
                String str = this.f38758e[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f38754a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38759f);
        }
        if ((this.f38754a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f38760g);
        }
        if ((this.f38754a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f38761h);
        }
        if (this.f38762i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f38762i);
        }
        if ((this.f38754a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f38763j);
        }
        if ((this.f38754a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33508f(10, this.f38764k);
        }
        if ((this.f38754a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33494b(11, this.f38765l);
        }
        if ((this.f38754a & 256) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(12, this.f38766m);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.ek m36335b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 16: goto L_0x001c;
            case 26: goto L_0x0029;
            case 34: goto L_0x003a;
            case 42: goto L_0x006d;
            case 48: goto L_0x007a;
            case 58: goto L_0x00b9;
            case 66: goto L_0x00c7;
            case 72: goto L_0x00d9;
            case 80: goto L_0x00fe;
            case 90: goto L_0x010c;
            case 98: goto L_0x011a;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r8.m33564f();
        r7.f38755b = r0;
        r0 = r7.f38754a;
        r0 = r0 | 1;
        r7.f38754a = r0;
        goto L_0x0001;
    L_0x001c:
        r0 = r8.m33563e();
        r7.f38756c = r0;
        r0 = r7.f38754a;
        r0 = r0 | 2;
        r7.f38754a = r0;
        goto L_0x0001;
    L_0x0029:
        r0 = r7.f38757d;
        if (r0 != 0) goto L_0x0034;
    L_0x002d:
        r0 = new com.google.wireless.android.c.a.a.a;
        r0.<init>();
        r7.f38757d = r0;
    L_0x0034:
        r0 = r7.f38757d;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x003a:
        r0 = 34;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38758e;
        if (r0 != 0) goto L_0x0060;
    L_0x0044:
        r0 = r1;
    L_0x0045:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x004f;
    L_0x004a:
        r3 = r7.f38758e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x004f:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0064;
    L_0x0054:
        r3 = r8.m33564f();
        r2[r0] = r3;
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x004f;
    L_0x0060:
        r0 = r7.f38758e;
        r0 = r0.length;
        goto L_0x0045;
    L_0x0064:
        r3 = r8.m33564f();
        r2[r0] = r3;
        r7.f38758e = r2;
        goto L_0x0001;
    L_0x006d:
        r0 = r8.m33564f();
        r7.f38759f = r0;
        r0 = r7.f38754a;
        r0 = r0 | 4;
        r7.f38754a = r0;
        goto L_0x0001;
    L_0x007a:
        r2 = r7.f38754a;
        r2 = r2 | 8;
        r7.f38754a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        switch(r3) {
            case 1: goto L_0x00af;
            case 2: goto L_0x00af;
            case 3: goto L_0x00af;
            case 4: goto L_0x00af;
            case 5: goto L_0x00af;
            case 6: goto L_0x00af;
            case 7: goto L_0x00af;
            case 8: goto L_0x00af;
            case 9: goto L_0x00af;
            case 10: goto L_0x00af;
            default: goto L_0x008b;
        };	 Catch:{ IllegalArgumentException -> 0x00a6 }
    L_0x008b:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r5 = 49;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r5 = " is not a valid enum RedemptionContext";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00a6 }
    L_0x00a6:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00af:
        r7.f38760g = r3;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = r7.f38754a;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = r3 | 8;
        r7.f38754a = r3;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        goto L_0x0001;
    L_0x00b9:
        r0 = r8.m33564f();
        r7.f38761h = r0;
        r0 = r7.f38754a;
        r0 = r0 | 16;
        r7.f38754a = r0;
        goto L_0x0001;
    L_0x00c7:
        r0 = r7.f38762i;
        if (r0 != 0) goto L_0x00d2;
    L_0x00cb:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r7.f38762i = r0;
    L_0x00d2:
        r0 = r7.f38762i;
        r8.m33552a(r0);
        goto L_0x0001;
    L_0x00d9:
        r2 = r7.f38754a;
        r2 = r2 | 32;
        r7.f38754a = r2;
        r2 = r8.m33573o();
        r3 = r8.m33560d();	 Catch:{ IllegalArgumentException -> 0x00f5 }
        r3 = com.google.android.finsky.cv.a.bp.a(r3);	 Catch:{ IllegalArgumentException -> 0x00f5 }
        r7.f38763j = r3;	 Catch:{ IllegalArgumentException -> 0x00f5 }
        r3 = r7.f38754a;	 Catch:{ IllegalArgumentException -> 0x00f5 }
        r3 = r3 | 32;
        r7.f38754a = r3;	 Catch:{ IllegalArgumentException -> 0x00f5 }
        goto L_0x0001;
    L_0x00f5:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x00fe:
        r2 = r8.m33559c();
        r7.f38764k = r2;
        r0 = r7.f38754a;
        r0 = r0 | 64;
        r7.f38754a = r0;
        goto L_0x0001;
    L_0x010c:
        r0 = r8.m33565g();
        r7.f38765l = r0;
        r0 = r7.f38754a;
        r0 = r0 | 128;
        r7.f38754a = r0;
        goto L_0x0001;
    L_0x011a:
        r0 = r8.m33564f();
        r7.f38766m = r0;
        r0 = r7.f38754a;
        r0 = r0 | 256;
        r7.f38754a = r0;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.ek.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.ek");
    }

    public final /* synthetic */ i m36336a(C7213a c7213a) {
        return m36335b(c7213a);
    }
}
