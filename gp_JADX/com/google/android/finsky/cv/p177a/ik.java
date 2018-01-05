package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ik extends C0758b {
    public int f12659a;
    public int f12660b;
    public String f12661c;
    public String f12662d;

    public ik() {
        this.f12659a = 0;
        this.f12660b = 1;
        this.f12661c = "";
        this.f12662d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        if ((this.f12659a & 1) != (ikVar.f12659a & 1)) {
            return false;
        }
        if (this.f12660b != ikVar.f12660b) {
            return false;
        }
        if ((this.f12659a & 2) != (ikVar.f12659a & 2)) {
            return false;
        }
        if (!this.f12661c.equals(ikVar.f12661c)) {
            return false;
        }
        if ((this.f12659a & 4) != (ikVar.f12659a & 4)) {
            return false;
        }
        if (!this.f12662d.equals(ikVar.f12662d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ikVar.aO);
        }
        if (ikVar.aO == null || ikVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12660b) * 31) + this.f12661c.hashCode()) * 31) + this.f12662d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12659a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12660b);
        }
        if ((this.f12659a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12661c);
        }
        if ((this.f12659a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12662d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12659a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12660b);
        }
        if ((this.f12659a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12661c);
        }
        if ((this.f12659a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f12662d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.ik m12792b(com.google.protobuf.nano.a r7) {
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
        r1 = r6.f12659a;
        r1 = r1 | 1;
        r6.f12659a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 52;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum RemoteEscalationType";
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
        r6.f12660b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f12659a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f12659a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.f();
        r6.f12661c = r0;
        r0 = r6.f12659a;
        r0 = r0 | 2;
        r6.f12659a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.f();
        r6.f12662d = r0;
        r0 = r6.f12659a;
        r0 = r0 | 4;
        r6.f12659a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.ik.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.ik");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12792b(aVar);
    }
}
