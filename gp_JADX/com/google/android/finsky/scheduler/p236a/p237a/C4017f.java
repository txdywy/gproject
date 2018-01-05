package com.google.android.finsky.scheduler.p236a.p237a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4017f extends C0758b {
    public int f20173a;
    public int f20174b;
    public String f20175c;
    public int f20176d;
    public String f20177e;
    public long f20178f;
    public C4013b f20179g;
    public int[] f20180h;
    public C4018g[] f20181i;
    public C4014c f20182j;
    public boolean f20183k;

    public C4017f() {
        this.f20173a = 0;
        this.f20174b = 0;
        this.f20175c = "";
        this.f20176d = 0;
        this.f20177e = "";
        this.f20178f = 0;
        this.f20179g = null;
        this.f20180h = l.e;
        this.f20181i = C4018g.bW_();
        this.f20182j = null;
        this.f20183k = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f20173a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f20174b);
        }
        if ((this.f20173a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f20175c);
        }
        if ((this.f20173a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f20176d);
        }
        if ((this.f20173a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f20177e);
        }
        if ((this.f20173a & 16) != 0) {
            codedOutputByteBufferNano.b(5, this.f20178f);
        }
        if (this.f20179g != null) {
            codedOutputByteBufferNano.b(6, this.f20179g);
        }
        if (this.f20180h != null && this.f20180h.length > 0) {
            for (int a : this.f20180h) {
                codedOutputByteBufferNano.a(7, a);
            }
        }
        if (this.f20181i != null && this.f20181i.length > 0) {
            while (i < this.f20181i.length) {
                C0757i c0757i = this.f20181i[i];
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(8, c0757i);
                }
                i++;
            }
        }
        if (this.f20182j != null) {
            codedOutputByteBufferNano.b(9, this.f20182j);
        }
        if ((this.f20173a & 32) != 0) {
            codedOutputByteBufferNano.a(10, this.f20183k);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f20173a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f20174b);
        }
        if ((this.f20173a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f20175c);
        }
        if ((this.f20173a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f20176d);
        }
        if ((this.f20173a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f20177e);
        }
        if ((this.f20173a & 16) != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f20178f);
        }
        if (this.f20179g != null) {
            b += CodedOutputByteBufferNano.d(6, this.f20179g);
        }
        if (this.f20180h != null && this.f20180h.length > 0) {
            int i2 = 0;
            for (int c : this.f20180h) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i2) + (this.f20180h.length * 1);
        }
        if (this.f20181i != null && this.f20181i.length > 0) {
            while (i < this.f20181i.length) {
                C0757i c0757i = this.f20181i[i];
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(8, c0757i);
                }
                i++;
            }
        }
        if (this.f20182j != null) {
            b += CodedOutputByteBufferNano.d(9, this.f20182j);
        }
        if ((this.f20173a & 32) != 0) {
            return b + (CodedOutputByteBufferNano.d(10) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.scheduler.p236a.p237a.C4017f m18781b(com.google.protobuf.nano.a r10) {
        /*
        r9 = this;
        r8 = 56;
        r1 = 0;
    L_0x0003:
        r3 = r10.a();
        switch(r3) {
            case 0: goto L_0x0010;
            case 8: goto L_0x0011;
            case 18: goto L_0x001e;
            case 24: goto L_0x002b;
            case 34: goto L_0x0068;
            case 40: goto L_0x0075;
            case 50: goto L_0x0082;
            case 56: goto L_0x0094;
            case 58: goto L_0x00e4;
            case 66: goto L_0x013f;
            case 74: goto L_0x017f;
            case 80: goto L_0x0191;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.m4918a(r10, r3);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r9;
    L_0x0011:
        r0 = r10.i();
        r9.f20174b = r0;
        r0 = r9.f20173a;
        r0 = r0 | 1;
        r9.f20173a = r0;
        goto L_0x0003;
    L_0x001e:
        r0 = r10.f();
        r9.f20175c = r0;
        r0 = r9.f20173a;
        r0 = r0 | 2;
        r9.f20173a = r0;
        goto L_0x0003;
    L_0x002b:
        r0 = r9.f20173a;
        r0 = r0 | 4;
        r9.f20173a = r0;
        r0 = r10.o();
        r2 = r10.i();	 Catch:{ IllegalArgumentException -> 0x0057 }
        switch(r2) {
            case 0: goto L_0x005f;
            case 1: goto L_0x005f;
            case 2: goto L_0x005f;
            case 3: goto L_0x005f;
            case 4: goto L_0x005f;
            case 5: goto L_0x005f;
            case 6: goto L_0x005f;
            case 7: goto L_0x005f;
            case 8: goto L_0x005f;
            case 9: goto L_0x005f;
            case 10: goto L_0x005f;
            case 11: goto L_0x005f;
            case 12: goto L_0x005f;
            case 13: goto L_0x005f;
            case 14: goto L_0x005f;
            case 15: goto L_0x005f;
            case 16: goto L_0x005f;
            case 17: goto L_0x005f;
            default: goto L_0x003c;
        };	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x003c:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r5 = 40;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r5 = " is not a valid enum Consumer";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0057 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x0057:
        r2 = move-exception;
        r10.e(r0);
        r9.m4918a(r10, r3);
        goto L_0x0003;
    L_0x005f:
        r9.f20176d = r2;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = r9.f20173a;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = r2 | 4;
        r9.f20173a = r2;	 Catch:{ IllegalArgumentException -> 0x0057 }
        goto L_0x0003;
    L_0x0068:
        r0 = r10.f();
        r9.f20177e = r0;
        r0 = r9.f20173a;
        r0 = r0 | 8;
        r9.f20173a = r0;
        goto L_0x0003;
    L_0x0075:
        r2 = r10.j();
        r9.f20178f = r2;
        r0 = r9.f20173a;
        r0 = r0 | 16;
        r9.f20173a = r0;
        goto L_0x0003;
    L_0x0082:
        r0 = r9.f20179g;
        if (r0 != 0) goto L_0x008d;
    L_0x0086:
        r0 = new com.google.android.finsky.scheduler.a.a.b;
        r0.<init>();
        r9.f20179g = r0;
    L_0x008d:
        r0 = r9.f20179g;
        r10.a(r0);
        goto L_0x0003;
    L_0x0094:
        r4 = com.google.protobuf.nano.l.a(r10, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x009c:
        if (r2 >= r4) goto L_0x00be;
    L_0x009e:
        if (r2 == 0) goto L_0x00a3;
    L_0x00a0:
        r10.a();
    L_0x00a3:
        r6 = r10.o();
        r7 = r10.i();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r7 = com.google.android.finsky.scheduler.p236a.p237a.C4012a.m18766a(r7);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = r0 + 1;
    L_0x00b3:
        r2 = r2 + 1;
        goto L_0x009c;
    L_0x00b6:
        r7 = move-exception;
        r10.e(r6);
        r9.m4918a(r10, r3);
        goto L_0x00b3;
    L_0x00be:
        if (r0 == 0) goto L_0x0003;
    L_0x00c0:
        r2 = r9.f20180h;
        if (r2 != 0) goto L_0x00ce;
    L_0x00c4:
        r2 = r1;
    L_0x00c5:
        if (r2 != 0) goto L_0x00d2;
    L_0x00c7:
        r3 = r5.length;
        if (r0 != r3) goto L_0x00d2;
    L_0x00ca:
        r9.f20180h = r5;
        goto L_0x0003;
    L_0x00ce:
        r2 = r9.f20180h;
        r2 = r2.length;
        goto L_0x00c5;
    L_0x00d2:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x00dd;
    L_0x00d8:
        r4 = r9.f20180h;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00dd:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r9.f20180h = r3;
        goto L_0x0003;
    L_0x00e4:
        r0 = r10.i();
        r3 = r10.c(r0);
        r2 = r10.o();
        r0 = r1;
    L_0x00f1:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x0101;
    L_0x00f7:
        r4 = r10.i();	 Catch:{ IllegalArgumentException -> 0x019f }
        com.google.android.finsky.scheduler.p236a.p237a.C4012a.m18766a(r4);	 Catch:{ IllegalArgumentException -> 0x019f }
        r0 = r0 + 1;
        goto L_0x00f1;
    L_0x0101:
        if (r0 == 0) goto L_0x013a;
    L_0x0103:
        r10.e(r2);
        r2 = r9.f20180h;
        if (r2 != 0) goto L_0x012c;
    L_0x010a:
        r2 = r1;
    L_0x010b:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0115;
    L_0x0110:
        r4 = r9.f20180h;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0115:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x0138;
    L_0x011b:
        r4 = r10.o();
        r5 = r10.i();	 Catch:{ IllegalArgumentException -> 0x0130 }
        r5 = com.google.android.finsky.scheduler.p236a.p237a.C4012a.m18766a(r5);	 Catch:{ IllegalArgumentException -> 0x0130 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0130 }
        r2 = r2 + 1;
        goto L_0x0115;
    L_0x012c:
        r2 = r9.f20180h;
        r2 = r2.length;
        goto L_0x010b;
    L_0x0130:
        r5 = move-exception;
        r10.e(r4);
        r9.m4918a(r10, r8);
        goto L_0x0115;
    L_0x0138:
        r9.f20180h = r0;
    L_0x013a:
        r10.d(r3);
        goto L_0x0003;
    L_0x013f:
        r0 = 66;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f20181i;
        if (r0 != 0) goto L_0x016b;
    L_0x0149:
        r0 = r1;
    L_0x014a:
        r2 = r2 + r0;
        r2 = new com.google.android.finsky.scheduler.p236a.p237a.C4018g[r2];
        if (r0 == 0) goto L_0x0154;
    L_0x014f:
        r3 = r9.f20181i;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0154:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x016f;
    L_0x0159:
        r3 = new com.google.android.finsky.scheduler.a.a.g;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r10.a(r3);
        r10.a();
        r0 = r0 + 1;
        goto L_0x0154;
    L_0x016b:
        r0 = r9.f20181i;
        r0 = r0.length;
        goto L_0x014a;
    L_0x016f:
        r3 = new com.google.android.finsky.scheduler.a.a.g;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r10.a(r0);
        r9.f20181i = r2;
        goto L_0x0003;
    L_0x017f:
        r0 = r9.f20182j;
        if (r0 != 0) goto L_0x018a;
    L_0x0183:
        r0 = new com.google.android.finsky.scheduler.a.a.c;
        r0.<init>();
        r9.f20182j = r0;
    L_0x018a:
        r0 = r9.f20182j;
        r10.a(r0);
        goto L_0x0003;
    L_0x0191:
        r0 = r10.e();
        r9.f20183k = r0;
        r0 = r9.f20173a;
        r0 = r0 | 32;
        r9.f20173a = r0;
        goto L_0x0003;
    L_0x019f:
        r4 = move-exception;
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.scheduler.a.a.f.b(com.google.protobuf.nano.a):com.google.android.finsky.scheduler.a.a.f");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m18781b(aVar);
    }
}
