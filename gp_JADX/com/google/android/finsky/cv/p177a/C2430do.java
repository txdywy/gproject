package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C2430do extends C0758b {
    public int f12185a;
    public int f12186b;
    public String[] f12187c;
    public long[] f12188d;
    public long[] f12189e;
    public double[] f12190f;

    public C2430do() {
        this.f12185a = 0;
        this.f12186b = 0;
        this.f12187c = l.j;
        this.f12188d = l.f;
        this.f12189e = l.f;
        this.f12190f = l.h;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2430do)) {
            return false;
        }
        C2430do c2430do = (C2430do) obj;
        if ((this.f12185a & 1) != (c2430do.f12185a & 1)) {
            return false;
        }
        if (this.f12186b != c2430do.f12186b) {
            return false;
        }
        if (!h.a(this.f12187c, c2430do.f12187c)) {
            return false;
        }
        if (!h.a(this.f12188d, c2430do.f12188d)) {
            return false;
        }
        if (!h.a(this.f12189e, c2430do.f12189e)) {
            return false;
        }
        if (!h.a(this.f12190f, c2430do.f12190f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2430do.aO);
        }
        if (c2430do.aO == null || c2430do.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12186b) * 31) + h.a(this.f12187c)) * 31) + h.a(this.f12188d)) * 31) + h.a(this.f12189e)) * 31) + h.a(this.f12190f)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12185a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12186b);
        }
        if (this.f12187c != null && this.f12187c.length > 0) {
            for (String str : this.f12187c) {
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        if (this.f12188d != null && this.f12188d.length > 0) {
            for (long c : this.f12188d) {
                codedOutputByteBufferNano.c(3, c);
            }
        }
        if (this.f12189e != null && this.f12189e.length > 0) {
            for (long c2 : this.f12189e) {
                codedOutputByteBufferNano.b(4, c2);
            }
        }
        if (this.f12190f != null && this.f12190f.length > 0) {
            while (i < this.f12190f.length) {
                codedOutputByteBufferNano.a(5, this.f12190f[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f12185a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12186b);
        }
        if (this.f12187c != null && this.f12187c.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f12187c) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f12188d != null && this.f12188d.length > 0) {
            b = (b + (this.f12188d.length * 8)) + (this.f12188d.length * 1);
        }
        if (this.f12189e != null && this.f12189e.length > 0) {
            i = 0;
            while (i2 < this.f12189e.length) {
                i += CodedOutputByteBufferNano.c(this.f12189e[i2]);
                i2++;
            }
            b = (b + i) + (this.f12189e.length * 1);
        }
        if (this.f12190f == null || this.f12190f.length <= 0) {
            return b;
        }
        return (b + (this.f12190f.length * 8)) + (this.f12190f.length * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.C2430do m12447b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x004c;
            case 25: goto L_0x007f;
            case 26: goto L_0x00b3;
            case 32: goto L_0x00e3;
            case 34: goto L_0x0117;
            case 41: goto L_0x0159;
            case 42: goto L_0x0195;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f12185a;
        r2 = r2 | 1;
        r7.f12185a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r3) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 34;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = " is not a valid enum Id";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0043:
        r7.f12186b = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r7.f12185a;	 Catch:{ IllegalArgumentException -> 0x003b }
        r3 = r3 | 1;
        r7.f12185a = r3;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0001;
    L_0x004c:
        r0 = 18;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12187c;
        if (r0 != 0) goto L_0x0072;
    L_0x0056:
        r0 = r1;
    L_0x0057:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0061;
    L_0x005c:
        r3 = r7.f12187c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0061:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0076;
    L_0x0066:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0061;
    L_0x0072:
        r0 = r7.f12187c;
        r0 = r0.length;
        goto L_0x0057;
    L_0x0076:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f12187c = r2;
        goto L_0x0001;
    L_0x007f:
        r0 = 25;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12188d;
        if (r0 != 0) goto L_0x00a5;
    L_0x0089:
        r0 = r1;
    L_0x008a:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x0094;
    L_0x008f:
        r3 = r7.f12188d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0094:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00a9;
    L_0x0099:
        r4 = r8.l();
        r2[r0] = r4;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0094;
    L_0x00a5:
        r0 = r7.f12188d;
        r0 = r0.length;
        goto L_0x008a;
    L_0x00a9:
        r4 = r8.l();
        r2[r0] = r4;
        r7.f12188d = r2;
        goto L_0x0001;
    L_0x00b3:
        r0 = r8.i();
        r2 = r8.c(r0);
        r3 = r0 / 8;
        r0 = r7.f12188d;
        if (r0 != 0) goto L_0x00d8;
    L_0x00c1:
        r0 = r1;
    L_0x00c2:
        r3 = r3 + r0;
        r3 = new long[r3];
        if (r0 == 0) goto L_0x00cc;
    L_0x00c7:
        r4 = r7.f12188d;
        java.lang.System.arraycopy(r4, r1, r3, r1, r0);
    L_0x00cc:
        r4 = r3.length;
        if (r0 >= r4) goto L_0x00dc;
    L_0x00cf:
        r4 = r8.l();
        r3[r0] = r4;
        r0 = r0 + 1;
        goto L_0x00cc;
    L_0x00d8:
        r0 = r7.f12188d;
        r0 = r0.length;
        goto L_0x00c2;
    L_0x00dc:
        r7.f12188d = r3;
        r8.d(r2);
        goto L_0x0001;
    L_0x00e3:
        r0 = 32;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12189e;
        if (r0 != 0) goto L_0x0109;
    L_0x00ed:
        r0 = r1;
    L_0x00ee:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x00f8;
    L_0x00f3:
        r3 = r7.f12189e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00f8:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x010d;
    L_0x00fd:
        r4 = r8.j();
        r2[r0] = r4;
        r8.a();
        r0 = r0 + 1;
        goto L_0x00f8;
    L_0x0109:
        r0 = r7.f12189e;
        r0 = r0.length;
        goto L_0x00ee;
    L_0x010d:
        r4 = r8.j();
        r2[r0] = r4;
        r7.f12189e = r2;
        goto L_0x0001;
    L_0x0117:
        r0 = r8.i();
        r3 = r8.c(r0);
        r2 = r8.o();
        r0 = r1;
    L_0x0124:
        r4 = r8.m();
        if (r4 <= 0) goto L_0x0130;
    L_0x012a:
        r8.j();
        r0 = r0 + 1;
        goto L_0x0124;
    L_0x0130:
        r8.e(r2);
        r2 = r7.f12189e;
        if (r2 != 0) goto L_0x014e;
    L_0x0137:
        r2 = r1;
    L_0x0138:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x0142;
    L_0x013d:
        r4 = r7.f12189e;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x0142:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x0152;
    L_0x0145:
        r4 = r8.j();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x0142;
    L_0x014e:
        r2 = r7.f12189e;
        r2 = r2.length;
        goto L_0x0138;
    L_0x0152:
        r7.f12189e = r0;
        r8.d(r3);
        goto L_0x0001;
    L_0x0159:
        r0 = 41;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12190f;
        if (r0 != 0) goto L_0x0183;
    L_0x0163:
        r0 = r1;
    L_0x0164:
        r2 = r2 + r0;
        r2 = new double[r2];
        if (r0 == 0) goto L_0x016e;
    L_0x0169:
        r3 = r7.f12190f;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x016e:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0187;
    L_0x0173:
        r4 = r8.l();
        r4 = java.lang.Double.longBitsToDouble(r4);
        r2[r0] = r4;
        r8.a();
        r0 = r0 + 1;
        goto L_0x016e;
    L_0x0183:
        r0 = r7.f12190f;
        r0 = r0.length;
        goto L_0x0164;
    L_0x0187:
        r4 = r8.l();
        r4 = java.lang.Double.longBitsToDouble(r4);
        r2[r0] = r4;
        r7.f12190f = r2;
        goto L_0x0001;
    L_0x0195:
        r0 = r8.i();
        r2 = r8.c(r0);
        r3 = r0 / 8;
        r0 = r7.f12190f;
        if (r0 != 0) goto L_0x01be;
    L_0x01a3:
        r0 = r1;
    L_0x01a4:
        r3 = r3 + r0;
        r3 = new double[r3];
        if (r0 == 0) goto L_0x01ae;
    L_0x01a9:
        r4 = r7.f12190f;
        java.lang.System.arraycopy(r4, r1, r3, r1, r0);
    L_0x01ae:
        r4 = r3.length;
        if (r0 >= r4) goto L_0x01c2;
    L_0x01b1:
        r4 = r8.l();
        r4 = java.lang.Double.longBitsToDouble(r4);
        r3[r0] = r4;
        r0 = r0 + 1;
        goto L_0x01ae;
    L_0x01be:
        r0 = r7.f12190f;
        r0 = r0.length;
        goto L_0x01a4;
    L_0x01c2:
        r7.f12190f = r3;
        r8.d(r2);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.do.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.do");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12447b(aVar);
    }
}
