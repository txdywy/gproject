package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class es extends C0758b {
    public int f12309a;
    public int f12310b;
    public long f12311c;
    public ch[] f12312d;
    public int f12313e;
    public int f12314f;
    public long f12315g;
    public String[] f12316h;
    public int f12317i;
    public int f12318j;
    public int f12319k;
    public String[] f12320l;

    public es() {
        this.f12309a = 0;
        this.f12310b = 0;
        this.f12311c = 0;
        this.f12312d = ch.aP_();
        this.f12313e = 0;
        this.f12314f = 0;
        this.f12315g = 0;
        this.f12316h = l.j;
        this.f12317i = 0;
        this.f12318j = 0;
        this.f12319k = 0;
        this.f12320l = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof es)) {
            return false;
        }
        es esVar = (es) obj;
        if ((this.f12309a & 1) != (esVar.f12309a & 1)) {
            return false;
        }
        if (this.f12310b != esVar.f12310b) {
            return false;
        }
        if ((this.f12309a & 2) != (esVar.f12309a & 2)) {
            return false;
        }
        if (this.f12311c != esVar.f12311c) {
            return false;
        }
        if (!h.a(this.f12312d, esVar.f12312d)) {
            return false;
        }
        if ((this.f12309a & 4) != (esVar.f12309a & 4)) {
            return false;
        }
        if (this.f12313e != esVar.f12313e) {
            return false;
        }
        if ((this.f12309a & 8) != (esVar.f12309a & 8)) {
            return false;
        }
        if (this.f12314f != esVar.f12314f) {
            return false;
        }
        if ((this.f12309a & 16) != (esVar.f12309a & 16)) {
            return false;
        }
        if (this.f12315g != esVar.f12315g) {
            return false;
        }
        if (!h.a(this.f12316h, esVar.f12316h)) {
            return false;
        }
        if ((this.f12309a & 32) != (esVar.f12309a & 32)) {
            return false;
        }
        if (this.f12317i != esVar.f12317i) {
            return false;
        }
        if ((this.f12309a & 64) != (esVar.f12309a & 64)) {
            return false;
        }
        if (this.f12318j != esVar.f12318j) {
            return false;
        }
        if ((this.f12309a & 128) != (esVar.f12309a & 128)) {
            return false;
        }
        if (this.f12319k != esVar.f12319k) {
            return false;
        }
        if (!h.a(this.f12320l, esVar.f12320l)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(esVar.aO);
        }
        if (esVar.aO == null || esVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12310b;
        long j = this.f12311c;
        hashCode = (((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f12312d)) * 31) + this.f12313e) * 31) + this.f12314f;
        j = this.f12315g;
        int a = ((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f12316h)) * 31) + this.f12317i) * 31) + this.f12318j) * 31) + this.f12319k) * 31) + h.a(this.f12320l)) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + a;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12309a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12310b);
        }
        if ((this.f12309a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f12311c);
        }
        if (this.f12312d != null && this.f12312d.length > 0) {
            for (C0757i c0757i : this.f12312d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if ((this.f12309a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12313e);
        }
        if ((this.f12309a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12314f);
        }
        if (this.f12316h != null && this.f12316h.length > 0) {
            for (String str : this.f12316h) {
                if (str != null) {
                    codedOutputByteBufferNano.a(6, str);
                }
            }
        }
        if ((this.f12309a & 32) != 0) {
            codedOutputByteBufferNano.a(7, this.f12317i);
        }
        if ((this.f12309a & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f12318j);
        }
        if ((this.f12309a & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f12319k);
        }
        if ((this.f12309a & 16) != 0) {
            codedOutputByteBufferNano.b(10, this.f12315g);
        }
        if (this.f12320l != null && this.f12320l.length > 0) {
            while (i < this.f12320l.length) {
                String str2 = this.f12320l[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(11, str2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if ((this.f12309a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12310b);
        }
        if ((this.f12309a & 2) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f12311c);
        }
        if (this.f12312d != null && this.f12312d.length > 0) {
            i = b;
            for (C0757i c0757i : this.f12312d) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if ((this.f12309a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f12313e);
        }
        if ((this.f12309a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f12314f);
        }
        if (this.f12316h != null && this.f12316h.length > 0) {
            i2 = 0;
            int i4 = 0;
            for (String str : this.f12316h) {
                if (str != null) {
                    i4++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i2) + (i4 * 1);
        }
        if ((this.f12309a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f12317i);
        }
        if ((this.f12309a & 64) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f12318j);
        }
        if ((this.f12309a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(9, this.f12319k);
        }
        if ((this.f12309a & 16) != 0) {
            b += CodedOutputByteBufferNano.f(10, this.f12315g);
        }
        if (this.f12320l == null || this.f12320l.length <= 0) {
            return b;
        }
        i = 0;
        i2 = 0;
        while (i3 < this.f12320l.length) {
            String str2 = this.f12320l[i3];
            if (str2 != null) {
                i2++;
                i += CodedOutputByteBufferNano.b(str2);
            }
            i3++;
        }
        return (b + i) + (i2 * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.es m12538b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 16: goto L_0x0032;
            case 26: goto L_0x003f;
            case 32: goto L_0x007e;
            case 40: goto L_0x008c;
            case 50: goto L_0x009a;
            case 56: goto L_0x00ce;
            case 64: goto L_0x010d;
            case 72: goto L_0x011b;
            case 80: goto L_0x0140;
            case 90: goto L_0x014e;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r7.f12309a;
        r2 = r2 | 1;
        r7.f12309a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x002a }
        r3 = com.google.android.finsky.cv.p177a.jt.m12904d(r3);	 Catch:{ IllegalArgumentException -> 0x002a }
        r7.f12310b = r3;	 Catch:{ IllegalArgumentException -> 0x002a }
        r3 = r7.f12309a;	 Catch:{ IllegalArgumentException -> 0x002a }
        r3 = r3 | 1;
        r7.f12309a = r3;	 Catch:{ IllegalArgumentException -> 0x002a }
        goto L_0x0001;
    L_0x002a:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0032:
        r2 = r8.j();
        r7.f12311c = r2;
        r0 = r7.f12309a;
        r0 = r0 | 2;
        r7.f12309a = r0;
        goto L_0x0001;
    L_0x003f:
        r0 = 26;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12312d;
        if (r0 != 0) goto L_0x006b;
    L_0x0049:
        r0 = r1;
    L_0x004a:
        r2 = r2 + r0;
        r2 = new com.google.android.finsky.cv.p177a.ch[r2];
        if (r0 == 0) goto L_0x0054;
    L_0x004f:
        r3 = r7.f12312d;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0054:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x006f;
    L_0x0059:
        r3 = new com.google.android.finsky.cv.a.ch;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0054;
    L_0x006b:
        r0 = r7.f12312d;
        r0 = r0.length;
        goto L_0x004a;
    L_0x006f:
        r3 = new com.google.android.finsky.cv.a.ch;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f12312d = r2;
        goto L_0x0001;
    L_0x007e:
        r0 = r8.i();
        r7.f12313e = r0;
        r0 = r7.f12309a;
        r0 = r0 | 4;
        r7.f12309a = r0;
        goto L_0x0001;
    L_0x008c:
        r0 = r8.i();
        r7.f12314f = r0;
        r0 = r7.f12309a;
        r0 = r0 | 8;
        r7.f12309a = r0;
        goto L_0x0001;
    L_0x009a:
        r0 = 50;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12316h;
        if (r0 != 0) goto L_0x00c0;
    L_0x00a4:
        r0 = r1;
    L_0x00a5:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x00af;
    L_0x00aa:
        r3 = r7.f12316h;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00af:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x00c4;
    L_0x00b4:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x00af;
    L_0x00c0:
        r0 = r7.f12316h;
        r0 = r0.length;
        goto L_0x00a5;
    L_0x00c4:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f12316h = r2;
        goto L_0x0001;
    L_0x00ce:
        r2 = r7.f12309a;
        r2 = r2 | 32;
        r7.f12309a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00fa }
        switch(r3) {
            case 0: goto L_0x0103;
            case 1: goto L_0x0103;
            case 2: goto L_0x0103;
            case 3: goto L_0x0103;
            case 4: goto L_0x0103;
            case 5: goto L_0x0103;
            case 6: goto L_0x0103;
            case 7: goto L_0x0103;
            case 8: goto L_0x0103;
            default: goto L_0x00df;
        };	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00df:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r5 = 47;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00fa }
        r5 = " is not a valid enum AndroidCategory";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00fa }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00fa }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00fa:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0103:
        r7.f12317i = r3;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r7.f12309a;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r3 = r3 | 32;
        r7.f12309a = r3;	 Catch:{ IllegalArgumentException -> 0x00fa }
        goto L_0x0001;
    L_0x010d:
        r0 = r8.i();
        r7.f12318j = r0;
        r0 = r7.f12309a;
        r0 = r0 | 64;
        r7.f12309a = r0;
        goto L_0x0001;
    L_0x011b:
        r2 = r7.f12309a;
        r2 = r2 | 128;
        r7.f12309a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r3 = com.google.android.finsky.cv.p177a.C2439l.m13007a(r3);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r7.f12319k = r3;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r3 = r7.f12309a;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r3 = r3 | 128;
        r7.f12309a = r3;	 Catch:{ IllegalArgumentException -> 0x0137 }
        goto L_0x0001;
    L_0x0137:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x0140:
        r2 = r8.j();
        r7.f12315g = r2;
        r0 = r7.f12309a;
        r0 = r0 | 16;
        r7.f12309a = r0;
        goto L_0x0001;
    L_0x014e:
        r0 = 90;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12320l;
        if (r0 != 0) goto L_0x0174;
    L_0x0158:
        r0 = r1;
    L_0x0159:
        r2 = r2 + r0;
        r2 = new java.lang.String[r2];
        if (r0 == 0) goto L_0x0163;
    L_0x015e:
        r3 = r7.f12320l;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0163:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0178;
    L_0x0168:
        r3 = r8.f();
        r2[r0] = r3;
        r8.a();
        r0 = r0 + 1;
        goto L_0x0163;
    L_0x0174:
        r0 = r7.f12320l;
        r0 = r0.length;
        goto L_0x0159;
    L_0x0178:
        r3 = r8.f();
        r2[r0] = r3;
        r7.f12320l = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.es.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.es");
    }

    public static es m12537a(byte[] bArr) {
        return (es) C0757i.m4905a(new es(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12538b(aVar);
    }
}
