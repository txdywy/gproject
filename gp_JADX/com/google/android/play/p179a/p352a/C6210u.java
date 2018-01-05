package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6210u extends C0758b {
    public int f31048a;
    public String f31049b;
    public int f31050c;
    public String f31051d;
    public String f31052e;
    public String f31053f;

    public C6210u() {
        this.f31048a = 0;
        this.f31049b = "";
        this.f31050c = 0;
        this.f31051d = "";
        this.f31052e = "";
        this.f31053f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6210u)) {
            return false;
        }
        C6210u c6210u = (C6210u) obj;
        if ((this.f31048a & 1) != (c6210u.f31048a & 1)) {
            return false;
        }
        if (!this.f31049b.equals(c6210u.f31049b)) {
            return false;
        }
        if ((this.f31048a & 2) != (c6210u.f31048a & 2)) {
            return false;
        }
        if (this.f31050c != c6210u.f31050c) {
            return false;
        }
        if ((this.f31048a & 4) != (c6210u.f31048a & 4)) {
            return false;
        }
        if (!this.f31051d.equals(c6210u.f31051d)) {
            return false;
        }
        if ((this.f31048a & 8) != (c6210u.f31048a & 8)) {
            return false;
        }
        if (!this.f31052e.equals(c6210u.f31052e)) {
            return false;
        }
        if ((this.f31048a & 16) != (c6210u.f31048a & 16)) {
            return false;
        }
        if (!this.f31053f.equals(c6210u.f31053f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6210u.aO);
        }
        if (c6210u.aO == null || c6210u.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + this.f31049b.hashCode()) * 31) + this.f31050c) * 31) + this.f31051d.hashCode()) * 31) + this.f31052e.hashCode()) * 31) + this.f31053f.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31048a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31049b);
        }
        if ((this.f31048a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f31050c);
        }
        if ((this.f31048a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f31051d);
        }
        if ((this.f31048a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f31052e);
        }
        if ((this.f31048a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f31053f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31048a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f31049b);
        }
        if ((this.f31048a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f31050c);
        }
        if ((this.f31048a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f31051d);
        }
        if ((this.f31048a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f31052e);
        }
        if ((this.f31048a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f31053f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6210u m28673b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0065;
            case 42: goto L_0x0072;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f31049b = r0;
        r0 = r6.f31048a;
        r0 = r0 | 1;
        r6.f31048a = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f31048a;
        r1 = r1 | 2;
        r6.f31048a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            case 3: goto L_0x004f;
            case 4: goto L_0x004f;
            case 5: goto L_0x004f;
            case 6: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum OsType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f31050c = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f31048a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f31048a = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r7.f();
        r6.f31051d = r0;
        r0 = r6.f31048a;
        r0 = r0 | 4;
        r6.f31048a = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.f();
        r6.f31052e = r0;
        r0 = r6.f31048a;
        r0 = r0 | 8;
        r6.f31048a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.f();
        r6.f31053f = r0;
        r0 = r6.f31048a;
        r0 = r0 | 16;
        r6.f31048a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.u.b(com.google.protobuf.nano.a):com.google.android.play.a.a.u");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28673b(aVar);
    }
}
