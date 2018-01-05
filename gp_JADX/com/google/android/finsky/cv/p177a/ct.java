package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ct extends C0758b {
    public int f12077a;
    public cu f12078b;
    public int f12079c;

    public ct() {
        this.f12077a = 0;
        this.f12078b = null;
        this.f12079c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        if (this.f12078b == null) {
            if (ctVar.f12078b != null) {
                return false;
            }
        } else if (!this.f12078b.equals(ctVar.f12078b)) {
            return false;
        }
        if ((this.f12077a & 1) != (ctVar.f12077a & 1)) {
            return false;
        }
        if (this.f12079c != ctVar.f12079c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ctVar.aO);
        }
        if (ctVar.aO == null || ctVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cu cuVar = this.f12078b;
        hashCode = ((((cuVar == null ? 0 : cuVar.hashCode()) + (hashCode * 31)) * 31) + this.f12079c) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12078b != null) {
            codedOutputByteBufferNano.b(1, this.f12078b);
        }
        if ((this.f12077a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12079c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12078b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12078b);
        }
        if ((this.f12077a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f12079c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.ct m12377b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f12078b;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.android.finsky.cv.a.cu;
        r0.<init>();
        r6.f12078b = r0;
    L_0x0019:
        r0 = r6.f12078b;
        r7.a(r0);
        goto L_0x0000;
    L_0x001f:
        r1 = r6.f12077a;
        r1 = r1 | 1;
        r6.f12077a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x004b }
        switch(r2) {
            case 0: goto L_0x0053;
            case 1: goto L_0x0053;
            case 2: goto L_0x0053;
            case 3: goto L_0x0053;
            case 4: goto L_0x0053;
            case 5: goto L_0x0053;
            case 6: goto L_0x0053;
            default: goto L_0x0030;
        };	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x0030:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004b }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x004b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0053:
        r6.f12079c = r2;	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r6.f12077a;	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r2 | 1;
        r6.f12077a = r2;	 Catch:{ IllegalArgumentException -> 0x004b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.ct.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.ct");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12377b(aVar);
    }
}
