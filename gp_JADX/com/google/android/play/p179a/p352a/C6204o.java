package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6204o extends C0758b {
    public int f30984a;
    public String f30985b;
    public String f30986c;
    public int f30987d;
    public String f30988e;
    public String f30989f;
    public int f30990g;
    public String f30991h;

    public C6204o() {
        this.f30984a = 0;
        this.f30985b = "";
        this.f30986c = "";
        this.f30987d = 0;
        this.f30988e = "";
        this.f30989f = "";
        this.f30990g = 0;
        this.f30991h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6204o)) {
            return false;
        }
        C6204o c6204o = (C6204o) obj;
        if ((this.f30984a & 1) != (c6204o.f30984a & 1)) {
            return false;
        }
        if (!this.f30985b.equals(c6204o.f30985b)) {
            return false;
        }
        if ((this.f30984a & 2) != (c6204o.f30984a & 2)) {
            return false;
        }
        if (!this.f30986c.equals(c6204o.f30986c)) {
            return false;
        }
        if ((this.f30984a & 4) != (c6204o.f30984a & 4)) {
            return false;
        }
        if (this.f30987d != c6204o.f30987d) {
            return false;
        }
        if ((this.f30984a & 8) != (c6204o.f30984a & 8)) {
            return false;
        }
        if (!this.f30988e.equals(c6204o.f30988e)) {
            return false;
        }
        if ((this.f30984a & 16) != (c6204o.f30984a & 16)) {
            return false;
        }
        if (!this.f30989f.equals(c6204o.f30989f)) {
            return false;
        }
        if ((this.f30984a & 32) != (c6204o.f30984a & 32)) {
            return false;
        }
        if (this.f30990g != c6204o.f30990g) {
            return false;
        }
        if ((this.f30984a & 64) != (c6204o.f30984a & 64)) {
            return false;
        }
        if (!this.f30991h.equals(c6204o.f30991h)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6204o.aO);
        }
        if (c6204o.aO == null || c6204o.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30985b.hashCode()) * 31) + this.f30986c.hashCode()) * 31) + this.f30987d) * 31) + this.f30988e.hashCode()) * 31) + this.f30989f.hashCode()) * 31) + this.f30990g) * 31) + this.f30991h.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30984a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30985b);
        }
        if ((this.f30984a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30986c);
        }
        if ((this.f30984a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30987d);
        }
        if ((this.f30984a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30988e);
        }
        if ((this.f30984a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f30989f);
        }
        if ((this.f30984a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f30990g);
        }
        if ((this.f30984a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f30991h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30984a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30985b);
        }
        if ((this.f30984a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30986c);
        }
        if ((this.f30984a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f30987d);
        }
        if ((this.f30984a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30988e);
        }
        if ((this.f30984a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30989f);
        }
        if ((this.f30984a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f30990g);
        }
        if ((this.f30984a & 64) != 0) {
            return b + CodedOutputByteBufferNano.b(7, this.f30991h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6204o m28650b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x0028;
            case 34: goto L_0x0065;
            case 42: goto L_0x0072;
            case 48: goto L_0x007f;
            case 58: goto L_0x00be;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f30985b = r0;
        r0 = r6.f30984a;
        r0 = r0 | 1;
        r6.f30984a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.f();
        r6.f30986c = r0;
        r0 = r6.f30984a;
        r0 = r0 | 2;
        r6.f30984a = r0;
        goto L_0x0000;
    L_0x0028:
        r1 = r6.f30984a;
        r1 = r1 | 4;
        r6.f30984a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0054 }
        switch(r2) {
            case 0: goto L_0x005c;
            case 1: goto L_0x005c;
            case 2: goto L_0x005c;
            case 3: goto L_0x005c;
            default: goto L_0x0039;
        };	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x0039:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r4 = " is not a valid enum DeviceType";
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
        r6.f30987d = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r6.f30984a;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r2 | 4;
        r6.f30984a = r2;	 Catch:{ IllegalArgumentException -> 0x0054 }
        goto L_0x0000;
    L_0x0065:
        r0 = r7.f();
        r6.f30988e = r0;
        r0 = r6.f30984a;
        r0 = r0 | 8;
        r6.f30984a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.f();
        r6.f30989f = r0;
        r0 = r6.f30984a;
        r0 = r0 | 16;
        r6.f30984a = r0;
        goto L_0x0000;
    L_0x007f:
        r1 = r6.f30984a;
        r1 = r1 | 32;
        r6.f30984a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x00ab }
        switch(r2) {
            case 0: goto L_0x00b4;
            case 1: goto L_0x00b4;
            case 2: goto L_0x00b4;
            case 3: goto L_0x00b4;
            case 4: goto L_0x00b4;
            case 5: goto L_0x00b4;
            case 6: goto L_0x00b4;
            case 7: goto L_0x00b4;
            case 8: goto L_0x00b4;
            default: goto L_0x0090;
        };	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x0090:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r4 = " is not a valid enum OsType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00ab }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x00ab:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00b4:
        r6.f30990g = r2;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r6.f30984a;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r2 | 32;
        r6.f30984a = r2;	 Catch:{ IllegalArgumentException -> 0x00ab }
        goto L_0x0000;
    L_0x00be:
        r0 = r7.f();
        r6.f30991h = r0;
        r0 = r6.f30984a;
        r0 = r0 | 64;
        r6.f30984a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.o.b(com.google.protobuf.nano.a):com.google.android.play.a.a.o");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28650b(aVar);
    }
}
