package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class fl extends C0758b {
    public int f12374a;
    public int f12375b;
    public int[] f12376c;
    public int f12377d;
    public String f12378e;
    public String f12379f;
    public String f12380g;
    public C2448u[] f12381h;
    public String[] f12382i;

    public fl() {
        this.f12374a = 0;
        this.f12375b = 0;
        this.f12376c = l.e;
        this.f12377d = 0;
        this.f12378e = "";
        this.f12379f = "";
        this.f12380g = "";
        this.f12381h = C2448u.ay_();
        this.f12382i = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        if ((this.f12374a & 1) != (flVar.f12374a & 1)) {
            return false;
        }
        if (this.f12375b != flVar.f12375b) {
            return false;
        }
        if (!h.a(this.f12376c, flVar.f12376c)) {
            return false;
        }
        if ((this.f12374a & 2) != (flVar.f12374a & 2)) {
            return false;
        }
        if (this.f12377d != flVar.f12377d) {
            return false;
        }
        if ((this.f12374a & 4) != (flVar.f12374a & 4)) {
            return false;
        }
        if (!this.f12378e.equals(flVar.f12378e)) {
            return false;
        }
        if ((this.f12374a & 8) != (flVar.f12374a & 8)) {
            return false;
        }
        if (!this.f12379f.equals(flVar.f12379f)) {
            return false;
        }
        if ((this.f12374a & 16) != (flVar.f12374a & 16)) {
            return false;
        }
        if (!this.f12380g.equals(flVar.f12380g)) {
            return false;
        }
        if (!h.a(this.f12381h, flVar.f12381h)) {
            return false;
        }
        if (!h.a(this.f12382i, flVar.f12382i)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(flVar.aO);
        }
        if (flVar.aO == null || flVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12375b) * 31) + h.a(this.f12376c)) * 31) + this.f12377d) * 31) + this.f12378e.hashCode()) * 31) + this.f12379f.hashCode()) * 31) + this.f12380g.hashCode()) * 31) + h.a(this.f12381h)) * 31) + h.a(this.f12382i)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12374a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12375b);
        }
        if ((this.f12374a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12377d);
        }
        if ((this.f12374a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12378e);
        }
        if ((this.f12374a & 16) != 0) {
            codedOutputByteBufferNano.a(4, this.f12380g);
        }
        if (this.f12381h != null && this.f12381h.length > 0) {
            for (C0757i c0757i : this.f12381h) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(5, c0757i);
                }
            }
        }
        if (this.f12382i != null && this.f12382i.length > 0) {
            for (String str : this.f12382i) {
                if (str != null) {
                    codedOutputByteBufferNano.a(6, str);
                }
            }
        }
        if ((this.f12374a & 8) != 0) {
            codedOutputByteBufferNano.a(7, this.f12379f);
        }
        if (this.f12376c != null && this.f12376c.length > 0) {
            while (i < this.f12376c.length) {
                codedOutputByteBufferNano.a(8, this.f12376c[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f12374a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12375b);
        }
        if ((this.f12374a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12377d);
        }
        if ((this.f12374a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12378e);
        }
        if ((this.f12374a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12380g);
        }
        if (this.f12381h != null && this.f12381h.length > 0) {
            i = b;
            for (C0757i c0757i : this.f12381h) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(5, c0757i);
                }
            }
            b = i;
        }
        if (this.f12382i != null && this.f12382i.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f12382i) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if ((this.f12374a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f12379f);
        }
        if (this.f12376c == null || this.f12376c.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f12376c.length) {
            i += CodedOutputByteBufferNano.c(this.f12376c[i2]);
            i2++;
        }
        return (b + i) + (this.f12376c.length * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.fl m12591b(com.google.protobuf.nano.a r10) {
        /*
        r9 = this;
        r8 = 64;
        r1 = 0;
    L_0x0003:
        r3 = r10.a();
        switch(r3) {
            case 0: goto L_0x0010;
            case 8: goto L_0x0011;
            case 16: goto L_0x004e;
            case 26: goto L_0x005b;
            case 34: goto L_0x0068;
            case 42: goto L_0x0075;
            case 50: goto L_0x00b5;
            case 58: goto L_0x00e9;
            case 64: goto L_0x00f7;
            case 66: goto L_0x0147;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.m4918a(r10, r3);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r9;
    L_0x0011:
        r0 = r9.f12374a;
        r0 = r0 | 1;
        r9.f12374a = r0;
        r0 = r10.o();
        r2 = r10.i();	 Catch:{ IllegalArgumentException -> 0x003d }
        switch(r2) {
            case 0: goto L_0x0045;
            case 1: goto L_0x0045;
            case 2: goto L_0x0045;
            default: goto L_0x0022;
        };	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x0022:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003d }
        r5 = 34;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003d }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        r5 = " is not a valid enum Id";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003d }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r2 = move-exception;
        r10.e(r0);
        r9.m4918a(r10, r3);
        goto L_0x0003;
    L_0x0045:
        r9.f12375b = r2;	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = r9.f12374a;	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = r2 | 1;
        r9.f12374a = r2;	 Catch:{ IllegalArgumentException -> 0x003d }
        goto L_0x0003;
    L_0x004e:
        r0 = r10.i();
        r9.f12377d = r0;
        r0 = r9.f12374a;
        r0 = r0 | 2;
        r9.f12374a = r0;
        goto L_0x0003;
    L_0x005b:
        r0 = r10.f();
        r9.f12378e = r0;
        r0 = r9.f12374a;
        r0 = r0 | 4;
        r9.f12374a = r0;
        goto L_0x0003;
    L_0x0068:
        r0 = r10.f();
        r9.f12380g = r0;
        r0 = r9.f12374a;
        r0 = r0 | 16;
        r9.f12374a = r0;
        goto L_0x0003;
    L_0x0075:
        r0 = 42;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f12381h;
        if (r0 != 0) goto L_0x00a1;
    L_0x007f:
        r0 = r1;
    L_0x0080:
        r2 = r2 + r0;
        r2 = new com.google.android.finsky.cv.p177a.C2448u[r2];
        if (r0 == 0) goto L_0x008a;
    L_0x0085:
        r3 = r9.f12381h;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x008a:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00a5;
    L_0x008f:
        r3 = new com.google.android.finsky.cv.a.u;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r10.a(r3);
        r10.a();
        r0 = r0 + 1;
        goto L_0x008a;
    L_0x00a1:
        r0 = r9.f12381h;
        r0 = r0.length;
        goto L_0x0080;
    L_0x00a5:
        r3 = new com.google.android.finsky.cv.a.u;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r10.a(r0);
        r9.f12381h = r2;
        goto L_0x0003;
    L_0x00b5:
        r0 = 50;
        r2 = com.google.protobuf.nano.l.a(r10, r0);
        r0 = r9.f12382i;
        if (r0 != 0) goto L_0x00db;
    L_0x00bf:
        r0 = r1;
    L_0x00c0:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x00ca;
    L_0x00c5:
        r3 = r9.f12382i;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00ca:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00df;
    L_0x00cf:
        r3 = r10.f();
        r2[r0] = r3;
        r10.a();
        r0 = r0 + 1;
        goto L_0x00ca;
    L_0x00db:
        r0 = r9.f12382i;
        r0 = r0.length;
        goto L_0x00c0;
    L_0x00df:
        r3 = r10.f();
        r2[r0] = r3;
        r9.f12382i = r2;
        goto L_0x0003;
    L_0x00e9:
        r0 = r10.f();
        r9.f12379f = r0;
        r0 = r9.f12374a;
        r0 = r0 | 8;
        r9.f12374a = r0;
        goto L_0x0003;
    L_0x00f7:
        r4 = com.google.protobuf.nano.l.a(r10, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x00ff:
        if (r2 >= r4) goto L_0x0121;
    L_0x0101:
        if (r2 == 0) goto L_0x0106;
    L_0x0103:
        r10.a();
    L_0x0106:
        r6 = r10.o();
        r7 = r10.i();	 Catch:{ IllegalArgumentException -> 0x0119 }
        r7 = com.google.android.finsky.cv.p177a.id.m12778a(r7);	 Catch:{ IllegalArgumentException -> 0x0119 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0119 }
        r0 = r0 + 1;
    L_0x0116:
        r2 = r2 + 1;
        goto L_0x00ff;
    L_0x0119:
        r7 = move-exception;
        r10.e(r6);
        r9.m4918a(r10, r3);
        goto L_0x0116;
    L_0x0121:
        if (r0 == 0) goto L_0x0003;
    L_0x0123:
        r2 = r9.f12376c;
        if (r2 != 0) goto L_0x0131;
    L_0x0127:
        r2 = r1;
    L_0x0128:
        if (r2 != 0) goto L_0x0135;
    L_0x012a:
        r3 = r5.length;
        if (r0 != r3) goto L_0x0135;
    L_0x012d:
        r9.f12376c = r5;
        goto L_0x0003;
    L_0x0131:
        r2 = r9.f12376c;
        r2 = r2.length;
        goto L_0x0128;
    L_0x0135:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0140;
    L_0x013b:
        r4 = r9.f12376c;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0140:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r9.f12376c = r3;
        goto L_0x0003;
    L_0x0147:
        r0 = r10.i();
        r3 = r10.c(r0);
        r2 = r10.o();
        r0 = r1;
    L_0x0154:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x0164;
    L_0x015a:
        r4 = r10.i();	 Catch:{ IllegalArgumentException -> 0x01a2 }
        com.google.android.finsky.cv.p177a.id.m12778a(r4);	 Catch:{ IllegalArgumentException -> 0x01a2 }
        r0 = r0 + 1;
        goto L_0x0154;
    L_0x0164:
        if (r0 == 0) goto L_0x019d;
    L_0x0166:
        r10.e(r2);
        r2 = r9.f12376c;
        if (r2 != 0) goto L_0x018f;
    L_0x016d:
        r2 = r1;
    L_0x016e:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x0178;
    L_0x0173:
        r4 = r9.f12376c;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0178:
        r4 = r10.m();
        if (r4 <= 0) goto L_0x019b;
    L_0x017e:
        r4 = r10.o();
        r5 = r10.i();	 Catch:{ IllegalArgumentException -> 0x0193 }
        r5 = com.google.android.finsky.cv.p177a.id.m12778a(r5);	 Catch:{ IllegalArgumentException -> 0x0193 }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x0193 }
        r2 = r2 + 1;
        goto L_0x0178;
    L_0x018f:
        r2 = r9.f12376c;
        r2 = r2.length;
        goto L_0x016e;
    L_0x0193:
        r5 = move-exception;
        r10.e(r4);
        r9.m4918a(r10, r8);
        goto L_0x0178;
    L_0x019b:
        r9.f12376c = r0;
    L_0x019d:
        r10.d(r3);
        goto L_0x0003;
    L_0x01a2:
        r4 = move-exception;
        goto L_0x0154;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.fl.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.fl");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12591b(aVar);
    }
}
