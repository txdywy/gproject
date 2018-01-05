package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6200k extends C0758b {
    public int f30957a;
    public boolean f30958b;
    public boolean f30959c;
    public int f30960d;
    public boolean f30961e;

    public C6200k() {
        this.f30957a = 0;
        this.f30958b = false;
        this.f30959c = false;
        this.f30960d = 0;
        this.f30961e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6200k)) {
            return false;
        }
        C6200k c6200k = (C6200k) obj;
        if ((this.f30957a & 1) != (c6200k.f30957a & 1)) {
            return false;
        }
        if (this.f30958b != c6200k.f30958b) {
            return false;
        }
        if ((this.f30957a & 2) != (c6200k.f30957a & 2)) {
            return false;
        }
        if (this.f30959c != c6200k.f30959c) {
            return false;
        }
        if ((this.f30957a & 4) != (c6200k.f30957a & 4)) {
            return false;
        }
        if (this.f30960d != c6200k.f30960d) {
            return false;
        }
        if ((this.f30957a & 8) != (c6200k.f30957a & 8)) {
            return false;
        }
        if (this.f30961e != c6200k.f30961e) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6200k.aO);
        }
        if (c6200k.aO == null || c6200k.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int hashCode = ((this.f30958b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (this.f30959c) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (((i + hashCode) * 31) + this.f30960d) * 31;
        if (!this.f30961e) {
            i2 = 1237;
        }
        i2 = (i + i2) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30957a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30958b);
        }
        if ((this.f30957a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30959c);
        }
        if ((this.f30957a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30960d);
        }
        if ((this.f30957a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30961e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30957a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f30957a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f30957a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f30960d);
        }
        if ((this.f30957a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.d(4) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6200k m28636b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0065;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.e();
        r6.f30958b = r0;
        r0 = r6.f30957a;
        r0 = r0 | 1;
        r6.f30957a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.e();
        r6.f30959c = r0;
        r0 = r6.f30957a;
        r0 = r0 | 2;
        r6.f30957a = r0;
        goto L_0x0000;
    L_0x0028:
        r1 = r6.f30957a;
        r1 = r1 | 4;
        r6.f30957a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0054 }
        switch(r2) {
            case 0: goto L_0x005c;
            case 1: goto L_0x005c;
            case 2: goto L_0x005c;
            default: goto L_0x0039;
        };	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0039:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = " is not a valid enum AutomaticTime";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0054:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x005c:
        r6.f30960d = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r6.f30957a;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2 | 4;
        r6.f30957a = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;
    L_0x0065:
        r0 = r7.e();
        r6.f30961e = r0;
        r0 = r6.f30957a;
        r0 = r0 | 8;
        r6.f30957a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.k.b(com.google.protobuf.nano.a):com.google.android.play.a.a.k");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28636b(aVar);
    }
}
