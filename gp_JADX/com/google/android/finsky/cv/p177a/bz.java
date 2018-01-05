package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.c;

public final class bz extends C0758b {
    public int f11996a;
    public int f11997b;
    public int f11998c;

    public bz() {
        this.f11996a = 0;
        this.f11997b = 0;
        this.f11998c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        if ((this.f11996a & 1) != (bzVar.f11996a & 1)) {
            return false;
        }
        if (this.f11997b != bzVar.f11997b) {
            return false;
        }
        if ((this.f11996a & 2) != (bzVar.f11996a & 2)) {
            return false;
        }
        if (this.f11998c != bzVar.f11998c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bzVar.aO);
        }
        if (bzVar.aO == null || bzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f11997b) * 31) + this.f11998c) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11996a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11997b);
        }
        if ((this.f11996a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11998c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11996a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f11997b);
        }
        if ((this.f11996a & 2) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f11998c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.bz m12319b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f11996a;
        r1 = r1 | 1;
        r6.f11996a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            case 6: goto L_0x0042;
            case 7: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Unit";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f11997b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f11996a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f11996a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.i();
        r6.f11998c = r0;
        r0 = r6.f11996a;
        r0 = r0 | 2;
        r6.f11996a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.bz.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.bz");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12319b(aVar);
    }

    static {
        c.a(bz.class, 349276778);
    }
}
