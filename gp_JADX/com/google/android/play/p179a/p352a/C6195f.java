package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6195f extends C0758b {
    public int f30918a;
    public int f30919b;
    public String f30920c;
    public String f30921d;

    public C6195f() {
        this.f30918a = 0;
        this.f30919b = 0;
        this.f30920c = "";
        this.f30921d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6195f)) {
            return false;
        }
        C6195f c6195f = (C6195f) obj;
        if ((this.f30918a & 1) != (c6195f.f30918a & 1)) {
            return false;
        }
        if (this.f30919b != c6195f.f30919b) {
            return false;
        }
        if ((this.f30918a & 2) != (c6195f.f30918a & 2)) {
            return false;
        }
        if (!this.f30920c.equals(c6195f.f30920c)) {
            return false;
        }
        if ((this.f30918a & 4) != (c6195f.f30918a & 4)) {
            return false;
        }
        if (!this.f30921d.equals(c6195f.f30921d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6195f.aO);
        }
        if (c6195f.aO == null || c6195f.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f30919b) * 31) + this.f30920c.hashCode()) * 31) + this.f30921d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30918a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30919b);
        }
        if ((this.f30918a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30920c);
        }
        if ((this.f30918a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30921d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30918a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f30919b);
        }
        if ((this.f30918a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30920c);
        }
        if ((this.f30918a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f30921d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6195f m28618b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f30918a;
        r1 = r1 | 1;
        r6.f30918a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum ClientType";
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
        r6.f30919b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f30918a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f30918a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.f();
        r6.f30920c = r0;
        r0 = r6.f30918a;
        r0 = r0 | 2;
        r6.f30918a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.f();
        r6.f30921d = r0;
        r0 = r6.f30918a;
        r0 = r0 | 4;
        r6.f30918a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.f.b(com.google.protobuf.nano.a):com.google.android.play.a.a.f");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28618b(aVar);
    }
}
