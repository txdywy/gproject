package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7501z extends b {
    public int f38169a;
    public String f38170b;
    public String f38171c;
    public int[] f38172d;
    public int f38173e;
    public C7496u[] f38174f;
    public C7479d f38175g;
    public bd f38176h;
    public bd f38177i;
    public String f38178j;
    public C7497v f38179k;

    public C7501z() {
        this.f38169a = 0;
        this.f38170b = "";
        this.f38171c = "";
        this.f38172d = C7222l.f35472e;
        this.f38173e = 0;
        this.f38174f = C7496u.m35850d();
        this.f38175g = null;
        this.f38176h = null;
        this.f38177i = null;
        this.f38178j = "";
        this.f38179k = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35870a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f38169a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38170b);
        }
        if ((this.f38169a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38171c);
        }
        if (this.f38172d != null && this.f38172d.length > 0) {
            for (int a : this.f38172d) {
                codedOutputByteBufferNano.m33518a(3, a);
            }
        }
        if ((this.f38169a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38173e);
        }
        if (this.f38174f != null && this.f38174f.length > 0) {
            while (i < this.f38174f.length) {
                i iVar = this.f38174f[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
                i++;
            }
        }
        if (this.f38175g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f38175g);
        }
        if (this.f38176h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f38176h);
        }
        if (this.f38177i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f38177i);
        }
        if ((this.f38169a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38178j);
        }
        if (this.f38179k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38179k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35871b() {
        int i = 0;
        int b = super.b();
        if ((this.f38169a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38170b);
        }
        if ((this.f38169a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38171c);
        }
        if (this.f38172d != null && this.f38172d.length > 0) {
            int i2 = 0;
            for (int c : this.f38172d) {
                i2 += CodedOutputByteBufferNano.m33498c(c);
            }
            b = (b + i2) + (this.f38172d.length * 1);
        }
        if ((this.f38169a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f38173e);
        }
        if (this.f38174f != null && this.f38174f.length > 0) {
            while (i < this.f38174f.length) {
                i iVar = this.f38174f[i];
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
                i++;
            }
        }
        if (this.f38175g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f38175g);
        }
        if (this.f38176h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f38176h);
        }
        if (this.f38177i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f38177i);
        }
        if ((this.f38169a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38178j);
        }
        if (this.f38179k != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f38179k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.C7501z m35868b(com.google.protobuf.nano.C7213a r10) {
        /*
        r9 = this;
        r8 = 24;
        r1 = 0;
    L_0x0003:
        r3 = r10.m33550a();
        switch(r3) {
            case 0: goto L_0x0010;
            case 10: goto L_0x0011;
            case 18: goto L_0x001e;
            case 24: goto L_0x002b;
            case 26: goto L_0x0079;
            case 32: goto L_0x00d4;
            case 42: goto L_0x0113;
            case 50: goto L_0x0153;
            case 58: goto L_0x0165;
            case 66: goto L_0x0177;
            case 74: goto L_0x0189;
            case 82: goto L_0x0197;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.a(r10, r3);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r9;
    L_0x0011:
        r0 = r10.m33564f();
        r9.f38170b = r0;
        r0 = r9.f38169a;
        r0 = r0 | 1;
        r9.f38169a = r0;
        goto L_0x0003;
    L_0x001e:
        r0 = r10.m33564f();
        r9.f38171c = r0;
        r0 = r9.f38169a;
        r0 = r0 | 2;
        r9.f38169a = r0;
        goto L_0x0003;
    L_0x002b:
        r4 = com.google.protobuf.nano.C7222l.m33624a(r10, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x0033:
        if (r2 >= r4) goto L_0x0055;
    L_0x0035:
        if (r2 == 0) goto L_0x003a;
    L_0x0037:
        r10.m33550a();
    L_0x003a:
        r6 = r10.m33573o();
        r7 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x004d }
        r7 = com.google.wireless.android.finsky.dfe.p515h.p516a.C7495t.m35847a(r7);	 Catch:{ IllegalArgumentException -> 0x004d }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x004d }
        r0 = r0 + 1;
    L_0x004a:
        r2 = r2 + 1;
        goto L_0x0033;
    L_0x004d:
        r7 = move-exception;
        r10.m33562e(r6);
        r9.a(r10, r3);
        goto L_0x004a;
    L_0x0055:
        if (r0 == 0) goto L_0x0003;
    L_0x0057:
        r2 = r9.f38172d;
        if (r2 != 0) goto L_0x0064;
    L_0x005b:
        r2 = r1;
    L_0x005c:
        if (r2 != 0) goto L_0x0068;
    L_0x005e:
        r3 = r5.length;
        if (r0 != r3) goto L_0x0068;
    L_0x0061:
        r9.f38172d = r5;
        goto L_0x0003;
    L_0x0064:
        r2 = r9.f38172d;
        r2 = r2.length;
        goto L_0x005c;
    L_0x0068:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0073;
    L_0x006e:
        r4 = r9.f38172d;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0073:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r9.f38172d = r3;
        goto L_0x0003;
    L_0x0079:
        r0 = r10.m33567i();
        r3 = r10.m33558c(r0);
        r2 = r10.m33573o();
        r0 = r1;
    L_0x0086:
        r4 = r10.m33571m();
        if (r4 <= 0) goto L_0x0096;
    L_0x008c:
        r4 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x01a9 }
        com.google.wireless.android.finsky.dfe.p515h.p516a.C7495t.m35847a(r4);	 Catch:{ IllegalArgumentException -> 0x01a9 }
        r0 = r0 + 1;
        goto L_0x0086;
    L_0x0096:
        if (r0 == 0) goto L_0x00cf;
    L_0x0098:
        r10.m33562e(r2);
        r2 = r9.f38172d;
        if (r2 != 0) goto L_0x00c1;
    L_0x009f:
        r2 = r1;
    L_0x00a0:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00aa;
    L_0x00a5:
        r4 = r9.f38172d;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00aa:
        r4 = r10.m33571m();
        if (r4 <= 0) goto L_0x00cd;
    L_0x00b0:
        r4 = r10.m33573o();
        r5 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r5 = com.google.wireless.android.finsky.dfe.p515h.p516a.C7495t.m35847a(r5);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r2 = r2 + 1;
        goto L_0x00aa;
    L_0x00c1:
        r2 = r9.f38172d;
        r2 = r2.length;
        goto L_0x00a0;
    L_0x00c5:
        r5 = move-exception;
        r10.m33562e(r4);
        r9.a(r10, r8);
        goto L_0x00aa;
    L_0x00cd:
        r9.f38172d = r0;
    L_0x00cf:
        r10.m33561d(r3);
        goto L_0x0003;
    L_0x00d4:
        r0 = r9.f38169a;
        r0 = r0 | 4;
        r9.f38169a = r0;
        r0 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x0100 }
        switch(r2) {
            case 0: goto L_0x0109;
            case 1: goto L_0x0109;
            case 2: goto L_0x0109;
            case 3: goto L_0x0109;
            default: goto L_0x00e5;
        };	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x00e5:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r5 = 56;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x0100 }
        r5 = " is not a valid enum FamilyLibraryEligibility";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0100 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0100 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x0100:
        r2 = move-exception;
        r10.m33562e(r0);
        r9.a(r10, r3);
        goto L_0x0003;
    L_0x0109:
        r9.f38173e = r2;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r9.f38169a;	 Catch:{ IllegalArgumentException -> 0x0100 }
        r2 = r2 | 4;
        r9.f38169a = r2;	 Catch:{ IllegalArgumentException -> 0x0100 }
        goto L_0x0003;
    L_0x0113:
        r0 = 42;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r10, r0);
        r0 = r9.f38174f;
        if (r0 != 0) goto L_0x013f;
    L_0x011d:
        r0 = r1;
    L_0x011e:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.dfe.p515h.p516a.C7496u[r2];
        if (r0 == 0) goto L_0x0128;
    L_0x0123:
        r3 = r9.f38174f;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0128:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0143;
    L_0x012d:
        r3 = new com.google.wireless.android.finsky.dfe.h.a.u;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r10.m33552a(r3);
        r10.m33550a();
        r0 = r0 + 1;
        goto L_0x0128;
    L_0x013f:
        r0 = r9.f38174f;
        r0 = r0.length;
        goto L_0x011e;
    L_0x0143:
        r3 = new com.google.wireless.android.finsky.dfe.h.a.u;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r10.m33552a(r0);
        r9.f38174f = r2;
        goto L_0x0003;
    L_0x0153:
        r0 = r9.f38175g;
        if (r0 != 0) goto L_0x015e;
    L_0x0157:
        r0 = new com.google.wireless.android.finsky.dfe.h.a.d;
        r0.<init>();
        r9.f38175g = r0;
    L_0x015e:
        r0 = r9.f38175g;
        r10.m33552a(r0);
        goto L_0x0003;
    L_0x0165:
        r0 = r9.f38176h;
        if (r0 != 0) goto L_0x0170;
    L_0x0169:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r9.f38176h = r0;
    L_0x0170:
        r0 = r9.f38176h;
        r10.m33552a(r0);
        goto L_0x0003;
    L_0x0177:
        r0 = r9.f38177i;
        if (r0 != 0) goto L_0x0182;
    L_0x017b:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r9.f38177i = r0;
    L_0x0182:
        r0 = r9.f38177i;
        r10.m33552a(r0);
        goto L_0x0003;
    L_0x0189:
        r0 = r10.m33564f();
        r9.f38178j = r0;
        r0 = r9.f38169a;
        r0 = r0 | 8;
        r9.f38169a = r0;
        goto L_0x0003;
    L_0x0197:
        r0 = r9.f38179k;
        if (r0 != 0) goto L_0x01a2;
    L_0x019b:
        r0 = new com.google.wireless.android.finsky.dfe.h.a.v;
        r0.<init>();
        r9.f38179k = r0;
    L_0x01a2:
        r0 = r9.f38179k;
        r10.m33552a(r0);
        goto L_0x0003;
    L_0x01a9:
        r4 = move-exception;
        goto L_0x0086;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.z.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.z");
    }

    public final /* synthetic */ i m35869a(C7213a c7213a) {
        return m35868b(c7213a);
    }
}
