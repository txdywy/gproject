package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bc extends C0758b {
    public int f11849a;
    public long f11850b;
    public ax f11851c;
    public int f11852d;
    public int f11853e;
    public int f11854f;

    public bc() {
        this.f11849a = 0;
        this.f11850b = 0;
        this.f11851c = null;
        this.f11852d = 1;
        this.f11853e = 0;
        this.f11854f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        if ((this.f11849a & 1) != (bcVar.f11849a & 1)) {
            return false;
        }
        if (this.f11850b != bcVar.f11850b) {
            return false;
        }
        if (this.f11851c == null) {
            if (bcVar.f11851c != null) {
                return false;
            }
        } else if (!this.f11851c.equals(bcVar.f11851c)) {
            return false;
        }
        if ((this.f11849a & 2) != (bcVar.f11849a & 2)) {
            return false;
        }
        if (this.f11852d != bcVar.f11852d) {
            return false;
        }
        if ((this.f11849a & 4) != (bcVar.f11849a & 4)) {
            return false;
        }
        if (this.f11853e != bcVar.f11853e) {
            return false;
        }
        if ((this.f11849a & 8) != (bcVar.f11849a & 8)) {
            return false;
        }
        if (this.f11854f != bcVar.f11854f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bcVar.aO);
        }
        if (bcVar.aO == null || bcVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f11850b;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        ax axVar = this.f11851c;
        hashCode = ((((((((axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31)) * 31) + this.f11852d) * 31) + this.f11853e) * 31) + this.f11854f) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11849a & 1) != 0) {
            codedOutputByteBufferNano.c(1, this.f11850b);
        }
        if (this.f11851c != null) {
            codedOutputByteBufferNano.b(2, this.f11851c);
        }
        if ((this.f11849a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f11852d);
        }
        if ((this.f11849a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f11853e);
        }
        if ((this.f11849a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f11854f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11849a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 8;
        }
        if (this.f11851c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f11851c);
        }
        if ((this.f11849a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f11852d);
        }
        if ((this.f11849a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f11853e);
        }
        if ((this.f11849a & 8) != 0) {
            return b + CodedOutputByteBufferNano.d(5, this.f11854f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.bc m12239b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 9: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x002c;
            case 32: goto L_0x004f;
            case 40: goto L_0x008e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.l();
        r6.f11850b = r0;
        r0 = r6.f11849a;
        r0 = r0 | 1;
        r6.f11849a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f11851c;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.android.finsky.cv.a.ax;
        r0.<init>();
        r6.f11851c = r0;
    L_0x0026:
        r0 = r6.f11851c;
        r7.a(r0);
        goto L_0x0000;
    L_0x002c:
        r1 = r6.f11849a;
        r1 = r1 | 2;
        r6.f11849a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = com.google.android.finsky.cv.p177a.bp.m12290a(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r6.f11852d = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f11849a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f11849a = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0047:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r1 = r6.f11849a;
        r1 = r1 | 4;
        r6.f11849a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            case 2: goto L_0x0084;
            case 3: goto L_0x0084;
            default: goto L_0x0060;
        };	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0060:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x007b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0084:
        r6.f11853e = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r6.f11849a;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2 | 4;
        r6.f11849a = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0000;
    L_0x008e:
        r0 = r7.i();
        r6.f11854f = r0;
        r0 = r6.f11849a;
        r0 = r0 | 8;
        r6.f11849a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.bc.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.bc");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12239b(aVar);
    }
}
