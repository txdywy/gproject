package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class dt extends C0758b {
    public int f12217a;
    public int f12218b;
    public String f12219c;
    public boolean f12220d;

    public dt() {
        this.f12217a = 0;
        this.f12218b = 0;
        this.f12219c = "";
        this.f12220d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dt)) {
            return false;
        }
        dt dtVar = (dt) obj;
        if ((this.f12217a & 1) != (dtVar.f12217a & 1)) {
            return false;
        }
        if (this.f12218b != dtVar.f12218b) {
            return false;
        }
        if ((this.f12217a & 2) != (dtVar.f12217a & 2)) {
            return false;
        }
        if (!this.f12219c.equals(dtVar.f12219c)) {
            return false;
        }
        if ((this.f12217a & 4) != (dtVar.f12217a & 4)) {
            return false;
        }
        if (this.f12220d != dtVar.f12220d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dtVar.aO);
        }
        if (dtVar.aO == null || dtVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f12220d ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f12218b) * 31) + this.f12219c.hashCode()) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12217a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12218b);
        }
        if ((this.f12217a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12219c);
        }
        if ((this.f12217a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12220d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12217a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12218b);
        }
        if ((this.f12217a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12219c);
        }
        if ((this.f12217a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.d(3) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.dt m12467b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 24: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f12217a;
        r1 = r1 | 1;
        r6.f12217a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Treatment";
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
        r6.f12218b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f12217a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f12217a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.f();
        r6.f12219c = r0;
        r0 = r6.f12217a;
        r0 = r0 | 2;
        r6.f12217a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.e();
        r6.f12220d = r0;
        r0 = r6.f12217a;
        r0 = r0 | 4;
        r6.f12217a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.dt.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.dt");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12467b(aVar);
    }
}
