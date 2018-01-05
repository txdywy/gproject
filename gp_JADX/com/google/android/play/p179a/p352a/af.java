package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class af extends C0758b {
    public int f30775a;
    public String f30776b;
    public String f30777c;
    public String f30778d;
    public String f30779e;
    public String f30780f;
    public int f30781g;
    public String f30782h;
    public int f30783i;

    public af() {
        this.f30775a = 0;
        this.f30776b = "";
        this.f30777c = "";
        this.f30778d = "";
        this.f30779e = "";
        this.f30780f = "";
        this.f30781g = 0;
        this.f30782h = "";
        this.f30783i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if ((this.f30775a & 1) != (afVar.f30775a & 1)) {
            return false;
        }
        if (!this.f30776b.equals(afVar.f30776b)) {
            return false;
        }
        if ((this.f30775a & 2) != (afVar.f30775a & 2)) {
            return false;
        }
        if (!this.f30777c.equals(afVar.f30777c)) {
            return false;
        }
        if ((this.f30775a & 4) != (afVar.f30775a & 4)) {
            return false;
        }
        if (!this.f30778d.equals(afVar.f30778d)) {
            return false;
        }
        if ((this.f30775a & 8) != (afVar.f30775a & 8)) {
            return false;
        }
        if (!this.f30779e.equals(afVar.f30779e)) {
            return false;
        }
        if ((this.f30775a & 16) != (afVar.f30775a & 16)) {
            return false;
        }
        if (!this.f30780f.equals(afVar.f30780f)) {
            return false;
        }
        if ((this.f30775a & 32) != (afVar.f30775a & 32)) {
            return false;
        }
        if (this.f30781g != afVar.f30781g) {
            return false;
        }
        if ((this.f30775a & 64) != (afVar.f30775a & 64)) {
            return false;
        }
        if (!this.f30782h.equals(afVar.f30782h)) {
            return false;
        }
        if ((this.f30775a & 128) != (afVar.f30775a & 128)) {
            return false;
        }
        if (this.f30783i != afVar.f30783i) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(afVar.aO);
        }
        if (afVar.aO == null || afVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30776b.hashCode()) * 31) + this.f30777c.hashCode()) * 31) + this.f30778d.hashCode()) * 31) + this.f30779e.hashCode()) * 31) + this.f30780f.hashCode()) * 31) + this.f30781g) * 31) + this.f30782h.hashCode()) * 31) + this.f30783i) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30775a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30776b);
        }
        if ((this.f30775a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30777c);
        }
        if ((this.f30775a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30778d);
        }
        if ((this.f30775a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30779e);
        }
        if ((this.f30775a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f30780f);
        }
        if ((this.f30775a & 32) != 0) {
            codedOutputByteBufferNano.a(7, this.f30781g);
        }
        if ((this.f30775a & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f30782h);
        }
        if ((this.f30775a & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f30783i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30775a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30776b);
        }
        if ((this.f30775a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30777c);
        }
        if ((this.f30775a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f30778d);
        }
        if ((this.f30775a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30779e);
        }
        if ((this.f30775a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30780f);
        }
        if ((this.f30775a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f30781g);
        }
        if ((this.f30775a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f30782h);
        }
        if ((this.f30775a & 128) != 0) {
            return b + CodedOutputByteBufferNano.d(9, this.f30783i);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.af m28550b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 26: goto L_0x0028;
            case 34: goto L_0x0035;
            case 42: goto L_0x0042;
            case 56: goto L_0x004f;
            case 66: goto L_0x008e;
            case 72: goto L_0x009c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f30776b = r0;
        r0 = r6.f30775a;
        r0 = r0 | 1;
        r6.f30775a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.f();
        r6.f30777c = r0;
        r0 = r6.f30775a;
        r0 = r0 | 2;
        r6.f30775a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.f();
        r6.f30778d = r0;
        r0 = r6.f30775a;
        r0 = r0 | 4;
        r6.f30775a = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r7.f();
        r6.f30779e = r0;
        r0 = r6.f30775a;
        r0 = r0 | 8;
        r6.f30775a = r0;
        goto L_0x0000;
    L_0x0042:
        r0 = r7.f();
        r6.f30780f = r0;
        r0 = r6.f30775a;
        r0 = r0 | 16;
        r6.f30775a = r0;
        goto L_0x0000;
    L_0x004f:
        r1 = r6.f30775a;
        r1 = r1 | 32;
        r6.f30775a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            case 2: goto L_0x0084;
            case 3: goto L_0x0084;
            case 4: goto L_0x0084;
            case 5: goto L_0x0084;
            case 6: goto L_0x0084;
            case 7: goto L_0x0084;
            case 8: goto L_0x0084;
            default: goto L_0x0060;
        };	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0060:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = " is not a valid enum OsType";
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
        r6.f30781g = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r6.f30775a;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2 | 32;
        r6.f30775a = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0000;
    L_0x008e:
        r0 = r7.f();
        r6.f30782h = r0;
        r0 = r6.f30775a;
        r0 = r0 | 64;
        r6.f30775a = r0;
        goto L_0x0000;
    L_0x009c:
        r1 = r6.f30775a;
        r1 = r1 | 128;
        r6.f30775a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x00c8 }
        switch(r2) {
            case 0: goto L_0x00d1;
            case 1: goto L_0x00d1;
            case 2: goto L_0x00d1;
            case 3: goto L_0x00d1;
            default: goto L_0x00ad;
        };	 Catch:{ IllegalArgumentException -> 0x00c8 }
    L_0x00ad:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r4 = " is not a valid enum DeviceType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00c8 }
    L_0x00c8:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00d1:
        r6.f30783i = r2;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = r6.f30775a;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r2 = r2 | 128;
        r6.f30775a = r2;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.af.b(com.google.protobuf.nano.a):com.google.android.play.a.a.af");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28550b(aVar);
    }
}
