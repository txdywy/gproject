package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class by extends C0758b {
    public int f11989a;
    public ax f11990b;
    public ax[] f11991c;
    public boolean f11992d;
    public boolean f11993e;
    public boolean f11994f;
    public int f11995g;

    public by() {
        this.f11989a = 0;
        this.f11990b = null;
        this.f11991c = ax.aG_();
        this.f11992d = false;
        this.f11993e = false;
        this.f11994f = false;
        this.f11995g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof by)) {
            return false;
        }
        by byVar = (by) obj;
        if (this.f11990b == null) {
            if (byVar.f11990b != null) {
                return false;
            }
        } else if (!this.f11990b.equals(byVar.f11990b)) {
            return false;
        }
        if (!h.a(this.f11991c, byVar.f11991c)) {
            return false;
        }
        if ((this.f11989a & 1) != (byVar.f11989a & 1)) {
            return false;
        }
        if (this.f11992d != byVar.f11992d) {
            return false;
        }
        if ((this.f11989a & 2) != (byVar.f11989a & 2)) {
            return false;
        }
        if (this.f11993e != byVar.f11993e) {
            return false;
        }
        if ((this.f11989a & 4) != (byVar.f11989a & 4)) {
            return false;
        }
        if (this.f11994f != byVar.f11994f) {
            return false;
        }
        if ((this.f11989a & 8) != (byVar.f11989a & 8)) {
            return false;
        }
        if (this.f11995g != byVar.f11995g) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(byVar.aO);
        }
        if (byVar.aO == null || byVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 1231;
        int hashCode = getClass().getName().hashCode() + 527;
        ax axVar = this.f11990b;
        int hashCode2 = ((((axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f11991c)) * 31;
        if (this.f11992d) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11993e) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode = (hashCode + hashCode2) * 31;
        if (!this.f11994f) {
            i2 = 1237;
        }
        hashCode = (((hashCode + i2) * 31) + this.f11995g) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11990b != null) {
            codedOutputByteBufferNano.b(1, this.f11990b);
        }
        if (this.f11991c != null && this.f11991c.length > 0) {
            for (C0757i c0757i : this.f11991c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if ((this.f11989a & 1) != 0) {
            codedOutputByteBufferNano.a(3, this.f11992d);
        }
        if ((this.f11989a & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f11993e);
        }
        if ((this.f11989a & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f11994f);
        }
        if ((this.f11989a & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f11995g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11990b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f11990b);
        }
        if (this.f11991c != null && this.f11991c.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f11991c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if ((this.f11989a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f11989a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f11989a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if ((this.f11989a & 8) != 0) {
            return b + CodedOutputByteBufferNano.d(6, this.f11995g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.by m12315b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 10: goto L_0x000f;
            case 18: goto L_0x0020;
            case 24: goto L_0x005f;
            case 32: goto L_0x006c;
            case 40: goto L_0x0079;
            case 48: goto L_0x0087;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = r7.f11990b;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r7.f11990b = r0;
    L_0x001a:
        r0 = r7.f11990b;
        r8.a(r0);
        goto L_0x0001;
    L_0x0020:
        r0 = 18;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f11991c;
        if (r0 != 0) goto L_0x004c;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r2 = r2 + r0;
        r2 = new com.google.android.finsky.cv.p177a.ax[r2];
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r3 = r7.f11991c;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0035:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0050;
    L_0x003a:
        r3 = new com.google.android.finsky.cv.a.ax;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x0035;
    L_0x004c:
        r0 = r7.f11991c;
        r0 = r0.length;
        goto L_0x002b;
    L_0x0050:
        r3 = new com.google.android.finsky.cv.a.ax;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f11991c = r2;
        goto L_0x0001;
    L_0x005f:
        r0 = r8.e();
        r7.f11992d = r0;
        r0 = r7.f11989a;
        r0 = r0 | 1;
        r7.f11989a = r0;
        goto L_0x0001;
    L_0x006c:
        r0 = r8.e();
        r7.f11993e = r0;
        r0 = r7.f11989a;
        r0 = r0 | 2;
        r7.f11989a = r0;
        goto L_0x0001;
    L_0x0079:
        r0 = r8.e();
        r7.f11994f = r0;
        r0 = r7.f11989a;
        r0 = r0 | 4;
        r7.f11989a = r0;
        goto L_0x0001;
    L_0x0087:
        r2 = r7.f11989a;
        r2 = r2 | 8;
        r7.f11989a = r2;
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x00b3 }
        switch(r3) {
            case 0: goto L_0x00bc;
            case 1: goto L_0x00bc;
            case 2: goto L_0x00bc;
            case 3: goto L_0x00bc;
            case 4: goto L_0x00bc;
            default: goto L_0x0098;
        };	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x0098:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = 36;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = " is not a valid enum Mode";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x00b3:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x00bc:
        r7.f11995g = r3;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r7.f11989a;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3 = r3 | 8;
        r7.f11989a = r3;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.by.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.by");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12315b(aVar);
    }
}
