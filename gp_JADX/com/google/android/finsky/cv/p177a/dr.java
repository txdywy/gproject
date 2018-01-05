package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class dr extends C0758b {
    public static volatile dr[] f12196a;
    public int f12197b;
    public boolean f12198c;
    public int f12199d;
    public int f12200e;
    public String[] f12201f;
    public long[] f12202g;
    public long[] f12203h;
    public double[] f12204i;
    public dr[] f12205j;
    public int f12206k;
    public int f12207l;
    public C2430do f12208m;
    public boolean f12209n;
    public String f12210o;

    private static dr[] m12460d() {
        if (f12196a == null) {
            synchronized (h.b) {
                if (f12196a == null) {
                    f12196a = new dr[0];
                }
            }
        }
        return f12196a;
    }

    public dr() {
        this.f12197b = 0;
        this.f12198c = false;
        this.f12199d = 1;
        this.f12200e = 1;
        this.f12201f = l.j;
        this.f12202g = l.f;
        this.f12203h = l.f;
        this.f12204i = l.h;
        this.f12205j = dr.m12460d();
        this.f12206k = 1;
        this.f12207l = 1;
        this.f12208m = null;
        this.f12209n = false;
        this.f12210o = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dr)) {
            return false;
        }
        dr drVar = (dr) obj;
        if ((this.f12197b & 1) != (drVar.f12197b & 1)) {
            return false;
        }
        if (this.f12198c != drVar.f12198c) {
            return false;
        }
        if (this.f12199d != drVar.f12199d) {
            return false;
        }
        if ((this.f12197b & 2) != (drVar.f12197b & 2)) {
            return false;
        }
        if (this.f12200e != drVar.f12200e) {
            return false;
        }
        if (!h.a(this.f12201f, drVar.f12201f)) {
            return false;
        }
        if (!h.a(this.f12202g, drVar.f12202g)) {
            return false;
        }
        if (!h.a(this.f12203h, drVar.f12203h)) {
            return false;
        }
        if (!h.a(this.f12204i, drVar.f12204i)) {
            return false;
        }
        if (!h.a(this.f12205j, drVar.f12205j)) {
            return false;
        }
        if ((this.f12197b & 4) != (drVar.f12197b & 4)) {
            return false;
        }
        if (this.f12206k != drVar.f12206k) {
            return false;
        }
        if ((this.f12197b & 8) != (drVar.f12197b & 8)) {
            return false;
        }
        if (this.f12207l != drVar.f12207l) {
            return false;
        }
        if (this.f12208m == null) {
            if (drVar.f12208m != null) {
                return false;
            }
        } else if (!this.f12208m.equals(drVar.f12208m)) {
            return false;
        }
        if ((this.f12197b & 16) != (drVar.f12197b & 16)) {
            return false;
        }
        if (this.f12209n != drVar.f12209n) {
            return false;
        }
        if ((this.f12197b & 32) != (drVar.f12197b & 32)) {
            return false;
        }
        if (!this.f12210o.equals(drVar.f12210o)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(drVar.aO);
        }
        if (drVar.aO == null || drVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = (((((((((((((((((((this.f12198c ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + this.f12199d) * 31) + this.f12200e) * 31) + h.a(this.f12201f)) * 31) + h.a(this.f12202g)) * 31) + h.a(this.f12203h)) * 31) + h.a(this.f12204i)) * 31) + h.a(this.f12205j)) * 31) + this.f12206k) * 31) + this.f12207l;
        C2430do c2430do = this.f12208m;
        hashCode = ((c2430do == null ? 0 : c2430do.hashCode()) + (hashCode * 31)) * 31;
        if (!this.f12209n) {
            i = 1237;
        }
        hashCode = (((hashCode + i) * 31) + this.f12210o.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12197b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12198c);
        }
        codedOutputByteBufferNano.a(2, this.f12199d);
        if ((this.f12197b & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12200e);
        }
        if (this.f12201f != null && this.f12201f.length > 0) {
            for (String str : this.f12201f) {
                if (str != null) {
                    codedOutputByteBufferNano.a(4, str);
                }
            }
        }
        if (this.f12203h != null && this.f12203h.length > 0) {
            for (long b : this.f12203h) {
                codedOutputByteBufferNano.b(5, b);
            }
        }
        if (this.f12204i != null && this.f12204i.length > 0) {
            for (double a : this.f12204i) {
                codedOutputByteBufferNano.a(6, a);
            }
        }
        if (this.f12205j != null && this.f12205j.length > 0) {
            for (C0757i c0757i : this.f12205j) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(7, c0757i);
                }
            }
        }
        if ((this.f12197b & 4) != 0) {
            codedOutputByteBufferNano.a(8, this.f12206k);
        }
        if ((this.f12197b & 32) != 0) {
            codedOutputByteBufferNano.a(9, this.f12210o);
        }
        if (this.f12202g != null && this.f12202g.length > 0) {
            while (i < this.f12202g.length) {
                codedOutputByteBufferNano.c(10, this.f12202g[i]);
                i++;
            }
        }
        if ((this.f12197b & 8) != 0) {
            codedOutputByteBufferNano.a(12, this.f12207l);
        }
        if ((this.f12197b & 16) != 0) {
            codedOutputByteBufferNano.a(13, this.f12209n);
        }
        if (this.f12208m != null) {
            codedOutputByteBufferNano.b(14, this.f12208m);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f12197b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        b += CodedOutputByteBufferNano.d(2, this.f12199d);
        if ((this.f12197b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12200e);
        }
        if (this.f12201f != null && this.f12201f.length > 0) {
            i = 0;
            int i3 = 0;
            for (String str : this.f12201f) {
                if (str != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f12203h != null && this.f12203h.length > 0) {
            i = 0;
            for (long c : this.f12203h) {
                i += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i) + (this.f12203h.length * 1);
        }
        if (this.f12204i != null && this.f12204i.length > 0) {
            b = (b + (this.f12204i.length * 8)) + (this.f12204i.length * 1);
        }
        if (this.f12205j != null && this.f12205j.length > 0) {
            while (i2 < this.f12205j.length) {
                C0757i c0757i = this.f12205j[i2];
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(7, c0757i);
                }
                i2++;
            }
        }
        if ((this.f12197b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f12206k);
        }
        if ((this.f12197b & 32) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f12210o);
        }
        if (this.f12202g != null && this.f12202g.length > 0) {
            b = (b + (this.f12202g.length * 8)) + (this.f12202g.length * 1);
        }
        if ((this.f12197b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(12, this.f12207l);
        }
        if ((this.f12197b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(13) + 1;
        }
        if (this.f12208m != null) {
            return b + CodedOutputByteBufferNano.d(14, this.f12208m);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.dr m12459b(com.google.protobuf.nano.a r9) {
        /*
        r8 = this;
        r7 = 40;
        r1 = 0;
    L_0x0003:
        r0 = r9.a();
        switch(r0) {
            case 0: goto L_0x0010;
            case 8: goto L_0x0011;
            case 16: goto L_0x001e;
            case 24: goto L_0x004f;
            case 34: goto L_0x008d;
            case 40: goto L_0x00c1;
            case 42: goto L_0x00f3;
            case 49: goto L_0x0135;
            case 50: goto L_0x0171;
            case 58: goto L_0x01a5;
            case 64: goto L_0x01e5;
            case 74: goto L_0x020a;
            case 81: goto L_0x0218;
            case 82: goto L_0x024c;
            case 96: goto L_0x027c;
            case 104: goto L_0x02a1;
            case 114: goto L_0x02af;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.m4918a(r9, r0);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r8;
    L_0x0011:
        r0 = r9.e();
        r8.f12198c = r0;
        r0 = r8.f12197b;
        r0 = r0 | 1;
        r8.f12197b = r0;
        goto L_0x0003;
    L_0x001e:
        r2 = r9.o();
        r3 = r9.i();	 Catch:{ IllegalArgumentException -> 0x0044 }
        switch(r3) {
            case 1: goto L_0x004c;
            case 2: goto L_0x004c;
            case 3: goto L_0x004c;
            case 4: goto L_0x004c;
            case 5: goto L_0x004c;
            case 6: goto L_0x004c;
            case 7: goto L_0x004c;
            case 8: goto L_0x004c;
            case 9: goto L_0x004c;
            case 10: goto L_0x004c;
            case 11: goto L_0x004c;
            case 12: goto L_0x004c;
            case 13: goto L_0x004c;
            case 14: goto L_0x004c;
            case 15: goto L_0x004c;
            case 16: goto L_0x004c;
            case 17: goto L_0x004c;
            case 18: goto L_0x004c;
            case 19: goto L_0x004c;
            case 20: goto L_0x004c;
            default: goto L_0x0029;
        };	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0029:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r5 = 40;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0044 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r5 = " is not a valid enum Operator";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0044 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0044 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0044 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0044:
        r3 = move-exception;
        r9.e(r2);
        r8.m4918a(r9, r0);
        goto L_0x0003;
    L_0x004c:
        r8.f12199d = r3;	 Catch:{ IllegalArgumentException -> 0x0044 }
        goto L_0x0003;
    L_0x004f:
        r2 = r8.f12197b;
        r2 = r2 | 2;
        r8.f12197b = r2;
        r2 = r9.o();
        r3 = r9.i();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r3) {
            case 1: goto L_0x0083;
            case 2: goto L_0x0060;
            case 3: goto L_0x0083;
            case 4: goto L_0x0083;
            case 5: goto L_0x0083;
            case 6: goto L_0x0083;
            case 7: goto L_0x0083;
            case 8: goto L_0x0083;
            case 9: goto L_0x0083;
            case 10: goto L_0x0083;
            case 11: goto L_0x0083;
            case 12: goto L_0x0083;
            case 13: goto L_0x0083;
            case 14: goto L_0x0083;
            case 15: goto L_0x0083;
            case 16: goto L_0x0083;
            case 17: goto L_0x0083;
            case 18: goto L_0x0083;
            case 19: goto L_0x0083;
            case 20: goto L_0x0083;
            case 21: goto L_0x0083;
            case 22: goto L_0x0083;
            case 23: goto L_0x0083;
            case 24: goto L_0x0060;
            case 25: goto L_0x0083;
            case 26: goto L_0x0083;
            case 27: goto L_0x0083;
            case 28: goto L_0x0083;
            case 29: goto L_0x0083;
            case 30: goto L_0x0083;
            case 31: goto L_0x0083;
            case 32: goto L_0x0083;
            case 33: goto L_0x0083;
            case 34: goto L_0x0083;
            case 35: goto L_0x0083;
            case 36: goto L_0x0083;
            case 37: goto L_0x0083;
            case 38: goto L_0x0083;
            case 39: goto L_0x0083;
            case 40: goto L_0x0083;
            case 41: goto L_0x0083;
            case 42: goto L_0x0083;
            case 43: goto L_0x0083;
            case 44: goto L_0x0083;
            case 45: goto L_0x0083;
            case 46: goto L_0x0083;
            default: goto L_0x0060;
        };	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0060:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5 = 35;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x007b }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x007b }
        r5 = " is not a valid enum Key";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x007b }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x007b }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x007b }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r3 = move-exception;
        r9.e(r2);
        r8.m4918a(r9, r0);
        goto L_0x0003;
    L_0x0083:
        r8.f12200e = r3;	 Catch:{ IllegalArgumentException -> 0x007b }
        r3 = r8.f12197b;	 Catch:{ IllegalArgumentException -> 0x007b }
        r3 = r3 | 2;
        r8.f12197b = r3;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0003;
    L_0x008d:
        r0 = 34;
        r2 = com.google.protobuf.nano.l.a(r9, r0);
        r0 = r8.f12201f;
        if (r0 != 0) goto L_0x00b3;
    L_0x0097:
        r0 = r1;
    L_0x0098:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x00a2;
    L_0x009d:
        r3 = r8.f12201f;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00a2:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00b7;
    L_0x00a7:
        r3 = r9.f();
        r2[r0] = r3;
        r9.a();
        r0 = r0 + 1;
        goto L_0x00a2;
    L_0x00b3:
        r0 = r8.f12201f;
        r0 = r0.length;
        goto L_0x0098;
    L_0x00b7:
        r3 = r9.f();
        r2[r0] = r3;
        r8.f12201f = r2;
        goto L_0x0003;
    L_0x00c1:
        r2 = com.google.protobuf.nano.l.a(r9, r7);
        r0 = r8.f12203h;
        if (r0 != 0) goto L_0x00e5;
    L_0x00c9:
        r0 = r1;
    L_0x00ca:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x00d4;
    L_0x00cf:
        r3 = r8.f12203h;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00d4:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00e9;
    L_0x00d9:
        r4 = r9.j();
        r2[r0] = r4;
        r9.a();
        r0 = r0 + 1;
        goto L_0x00d4;
    L_0x00e5:
        r0 = r8.f12203h;
        r0 = r0.length;
        goto L_0x00ca;
    L_0x00e9:
        r4 = r9.j();
        r2[r0] = r4;
        r8.f12203h = r2;
        goto L_0x0003;
    L_0x00f3:
        r0 = r9.i();
        r3 = r9.c(r0);
        r2 = r9.o();
        r0 = r1;
    L_0x0100:
        r4 = r9.m();
        if (r4 <= 0) goto L_0x010c;
    L_0x0106:
        r9.j();
        r0 = r0 + 1;
        goto L_0x0100;
    L_0x010c:
        r9.e(r2);
        r2 = r8.f12203h;
        if (r2 != 0) goto L_0x012a;
    L_0x0113:
        r2 = r1;
    L_0x0114:
        r0 = r0 + r2;
        r0 = new long[r0];
        if (r2 == 0) goto L_0x011e;
    L_0x0119:
        r4 = r8.f12203h;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x011e:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x012e;
    L_0x0121:
        r4 = r9.j();
        r0[r2] = r4;
        r2 = r2 + 1;
        goto L_0x011e;
    L_0x012a:
        r2 = r8.f12203h;
        r2 = r2.length;
        goto L_0x0114;
    L_0x012e:
        r8.f12203h = r0;
        r9.d(r3);
        goto L_0x0003;
    L_0x0135:
        r0 = 49;
        r2 = com.google.protobuf.nano.l.a(r9, r0);
        r0 = r8.f12204i;
        if (r0 != 0) goto L_0x015f;
    L_0x013f:
        r0 = r1;
    L_0x0140:
        r2 = r2 + r0;
        r2 = new double[r2];
        if (r0 == 0) goto L_0x014a;
    L_0x0145:
        r3 = r8.f12204i;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x014a:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0163;
    L_0x014f:
        r4 = r9.l();
        r4 = java.lang.Double.longBitsToDouble(r4);
        r2[r0] = r4;
        r9.a();
        r0 = r0 + 1;
        goto L_0x014a;
    L_0x015f:
        r0 = r8.f12204i;
        r0 = r0.length;
        goto L_0x0140;
    L_0x0163:
        r4 = r9.l();
        r4 = java.lang.Double.longBitsToDouble(r4);
        r2[r0] = r4;
        r8.f12204i = r2;
        goto L_0x0003;
    L_0x0171:
        r0 = r9.i();
        r2 = r9.c(r0);
        r3 = r0 / 8;
        r0 = r8.f12204i;
        if (r0 != 0) goto L_0x019a;
    L_0x017f:
        r0 = r1;
    L_0x0180:
        r3 = r3 + r0;
        r3 = new double[r3];
        if (r0 == 0) goto L_0x018a;
    L_0x0185:
        r4 = r8.f12204i;
        java.lang.System.arraycopy(r4, r1, r3, r1, r0);
    L_0x018a:
        r4 = r3.length;
        if (r0 >= r4) goto L_0x019e;
    L_0x018d:
        r4 = r9.l();
        r4 = java.lang.Double.longBitsToDouble(r4);
        r3[r0] = r4;
        r0 = r0 + 1;
        goto L_0x018a;
    L_0x019a:
        r0 = r8.f12204i;
        r0 = r0.length;
        goto L_0x0180;
    L_0x019e:
        r8.f12204i = r3;
        r9.d(r2);
        goto L_0x0003;
    L_0x01a5:
        r0 = 58;
        r2 = com.google.protobuf.nano.l.a(r9, r0);
        r0 = r8.f12205j;
        if (r0 != 0) goto L_0x01d1;
    L_0x01af:
        r0 = r1;
    L_0x01b0:
        r2 = r2 + r0;
        r2 = new com.google.android.finsky.cv.p177a.dr[r2];
        if (r0 == 0) goto L_0x01ba;
    L_0x01b5:
        r3 = r8.f12205j;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x01ba:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x01d5;
    L_0x01bf:
        r3 = new com.google.android.finsky.cv.a.dr;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r9.a(r3);
        r9.a();
        r0 = r0 + 1;
        goto L_0x01ba;
    L_0x01d1:
        r0 = r8.f12205j;
        r0 = r0.length;
        goto L_0x01b0;
    L_0x01d5:
        r3 = new com.google.android.finsky.cv.a.dr;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r9.a(r0);
        r8.f12205j = r2;
        goto L_0x0003;
    L_0x01e5:
        r2 = r8.f12197b;
        r2 = r2 | 4;
        r8.f12197b = r2;
        r2 = r9.o();
        r3 = r9.i();	 Catch:{ IllegalArgumentException -> 0x0201 }
        r3 = com.google.android.finsky.cv.p177a.dm.m12438a(r3);	 Catch:{ IllegalArgumentException -> 0x0201 }
        r8.f12206k = r3;	 Catch:{ IllegalArgumentException -> 0x0201 }
        r3 = r8.f12197b;	 Catch:{ IllegalArgumentException -> 0x0201 }
        r3 = r3 | 4;
        r8.f12197b = r3;	 Catch:{ IllegalArgumentException -> 0x0201 }
        goto L_0x0003;
    L_0x0201:
        r3 = move-exception;
        r9.e(r2);
        r8.m4918a(r9, r0);
        goto L_0x0003;
    L_0x020a:
        r0 = r9.f();
        r8.f12210o = r0;
        r0 = r8.f12197b;
        r0 = r0 | 32;
        r8.f12197b = r0;
        goto L_0x0003;
    L_0x0218:
        r0 = 81;
        r2 = com.google.protobuf.nano.l.a(r9, r0);
        r0 = r8.f12202g;
        if (r0 != 0) goto L_0x023e;
    L_0x0222:
        r0 = r1;
    L_0x0223:
        r2 = r2 + r0;
        r2 = new long[r2];
        if (r0 == 0) goto L_0x022d;
    L_0x0228:
        r3 = r8.f12202g;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x022d:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0242;
    L_0x0232:
        r4 = r9.l();
        r2[r0] = r4;
        r9.a();
        r0 = r0 + 1;
        goto L_0x022d;
    L_0x023e:
        r0 = r8.f12202g;
        r0 = r0.length;
        goto L_0x0223;
    L_0x0242:
        r4 = r9.l();
        r2[r0] = r4;
        r8.f12202g = r2;
        goto L_0x0003;
    L_0x024c:
        r0 = r9.i();
        r2 = r9.c(r0);
        r3 = r0 / 8;
        r0 = r8.f12202g;
        if (r0 != 0) goto L_0x0271;
    L_0x025a:
        r0 = r1;
    L_0x025b:
        r3 = r3 + r0;
        r3 = new long[r3];
        if (r0 == 0) goto L_0x0265;
    L_0x0260:
        r4 = r8.f12202g;
        java.lang.System.arraycopy(r4, r1, r3, r1, r0);
    L_0x0265:
        r4 = r3.length;
        if (r0 >= r4) goto L_0x0275;
    L_0x0268:
        r4 = r9.l();
        r3[r0] = r4;
        r0 = r0 + 1;
        goto L_0x0265;
    L_0x0271:
        r0 = r8.f12202g;
        r0 = r0.length;
        goto L_0x025b;
    L_0x0275:
        r8.f12202g = r3;
        r9.d(r2);
        goto L_0x0003;
    L_0x027c:
        r2 = r8.f12197b;
        r2 = r2 | 8;
        r8.f12197b = r2;
        r2 = r9.o();
        r3 = r9.i();	 Catch:{ IllegalArgumentException -> 0x0298 }
        r3 = com.google.android.finsky.cv.p177a.dp.m12451a(r3);	 Catch:{ IllegalArgumentException -> 0x0298 }
        r8.f12207l = r3;	 Catch:{ IllegalArgumentException -> 0x0298 }
        r3 = r8.f12197b;	 Catch:{ IllegalArgumentException -> 0x0298 }
        r3 = r3 | 8;
        r8.f12197b = r3;	 Catch:{ IllegalArgumentException -> 0x0298 }
        goto L_0x0003;
    L_0x0298:
        r3 = move-exception;
        r9.e(r2);
        r8.m4918a(r9, r0);
        goto L_0x0003;
    L_0x02a1:
        r0 = r9.e();
        r8.f12209n = r0;
        r0 = r8.f12197b;
        r0 = r0 | 16;
        r8.f12197b = r0;
        goto L_0x0003;
    L_0x02af:
        r0 = r8.f12208m;
        if (r0 != 0) goto L_0x02ba;
    L_0x02b3:
        r0 = new com.google.android.finsky.cv.a.do;
        r0.<init>();
        r8.f12208m = r0;
    L_0x02ba:
        r0 = r8.f12208m;
        r9.a(r0);
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.dr.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.dr");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12459b(aVar);
    }
}
