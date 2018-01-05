package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ai extends C0758b {
    public int f30800a;
    public boolean f30801b;
    public boolean f30802c;
    public int f30803d;
    public boolean f30804e;

    public ai() {
        this.f30800a = 0;
        this.f30801b = false;
        this.f30802c = false;
        this.f30803d = 0;
        this.f30804e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        if ((this.f30800a & 1) != (aiVar.f30800a & 1)) {
            return false;
        }
        if (this.f30801b != aiVar.f30801b) {
            return false;
        }
        if ((this.f30800a & 2) != (aiVar.f30800a & 2)) {
            return false;
        }
        if (this.f30802c != aiVar.f30802c) {
            return false;
        }
        if ((this.f30800a & 4) != (aiVar.f30800a & 4)) {
            return false;
        }
        if (this.f30803d != aiVar.f30803d) {
            return false;
        }
        if ((this.f30800a & 8) != (aiVar.f30800a & 8)) {
            return false;
        }
        if (this.f30804e != aiVar.f30804e) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(aiVar.aO);
        }
        if (aiVar.aO == null || aiVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int hashCode = ((this.f30801b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (this.f30802c) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (((i + hashCode) * 31) + this.f30803d) * 31;
        if (!this.f30804e) {
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
        if ((this.f30800a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30801b);
        }
        if ((this.f30800a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30802c);
        }
        if ((this.f30800a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30803d);
        }
        if ((this.f30800a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30804e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30800a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f30800a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f30800a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f30803d);
        }
        if ((this.f30800a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.d(4) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.ai m28561b(com.google.protobuf.nano.a r7) {
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
        r6.f30801b = r0;
        r0 = r6.f30800a;
        r0 = r0 | 1;
        r6.f30800a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.e();
        r6.f30802c = r0;
        r0 = r6.f30800a;
        r0 = r0 | 2;
        r6.f30800a = r0;
        goto L_0x0000;
    L_0x0028:
        r1 = r6.f30800a;
        r1 = r1 | 4;
        r6.f30800a = r1;
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
        r6.f30803d = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r6.f30800a;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2 | 4;
        r6.f30800a = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;
    L_0x0065:
        r0 = r7.e();
        r6.f30804e = r0;
        r0 = r6.f30800a;
        r0 = r0 | 8;
        r6.f30800a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.ai.b(com.google.protobuf.nano.a):com.google.android.play.a.a.ai");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28561b(aVar);
    }
}
