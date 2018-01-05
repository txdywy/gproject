package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6213x extends C0758b {
    public int f31066a;
    public int f31067b;
    public String f31068c;
    public String f31069d;
    public String f31070e;
    public String f31071f;
    public String f31072g;
    public String f31073h;
    public String f31074i;
    public String f31075j;
    public String f31076k;

    public C6213x() {
        this.f31066a = 0;
        this.f31067b = 0;
        this.f31068c = "";
        this.f31069d = "";
        this.f31070e = "";
        this.f31071f = "";
        this.f31072g = "";
        this.f31073h = "";
        this.f31074i = "";
        this.f31075j = "";
        this.f31076k = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6213x)) {
            return false;
        }
        C6213x c6213x = (C6213x) obj;
        if ((this.f31066a & 1) != (c6213x.f31066a & 1)) {
            return false;
        }
        if (this.f31067b != c6213x.f31067b) {
            return false;
        }
        if ((this.f31066a & 2) != (c6213x.f31066a & 2)) {
            return false;
        }
        if (!this.f31068c.equals(c6213x.f31068c)) {
            return false;
        }
        if ((this.f31066a & 4) != (c6213x.f31066a & 4)) {
            return false;
        }
        if (!this.f31069d.equals(c6213x.f31069d)) {
            return false;
        }
        if ((this.f31066a & 8) != (c6213x.f31066a & 8)) {
            return false;
        }
        if (!this.f31070e.equals(c6213x.f31070e)) {
            return false;
        }
        if ((this.f31066a & 16) != (c6213x.f31066a & 16)) {
            return false;
        }
        if (!this.f31071f.equals(c6213x.f31071f)) {
            return false;
        }
        if ((this.f31066a & 32) != (c6213x.f31066a & 32)) {
            return false;
        }
        if (!this.f31072g.equals(c6213x.f31072g)) {
            return false;
        }
        if ((this.f31066a & 64) != (c6213x.f31066a & 64)) {
            return false;
        }
        if (!this.f31073h.equals(c6213x.f31073h)) {
            return false;
        }
        if ((this.f31066a & 128) != (c6213x.f31066a & 128)) {
            return false;
        }
        if (!this.f31074i.equals(c6213x.f31074i)) {
            return false;
        }
        if ((this.f31066a & 256) != (c6213x.f31066a & 256)) {
            return false;
        }
        if (!this.f31075j.equals(c6213x.f31075j)) {
            return false;
        }
        if ((this.f31066a & 512) != (c6213x.f31066a & 512)) {
            return false;
        }
        if (!this.f31076k.equals(c6213x.f31076k)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6213x.aO);
        }
        if (c6213x.aO == null || c6213x.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f31067b) * 31) + this.f31068c.hashCode()) * 31) + this.f31069d.hashCode()) * 31) + this.f31070e.hashCode()) * 31) + this.f31071f.hashCode()) * 31) + this.f31072g.hashCode()) * 31) + this.f31073h.hashCode()) * 31) + this.f31074i.hashCode()) * 31) + this.f31075j.hashCode()) * 31) + this.f31076k.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31066a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31067b);
        }
        if ((this.f31066a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f31068c);
        }
        if ((this.f31066a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f31069d);
        }
        if ((this.f31066a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f31070e);
        }
        if ((this.f31066a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f31071f);
        }
        if ((this.f31066a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f31072g);
        }
        if ((this.f31066a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f31073h);
        }
        if ((this.f31066a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f31074i);
        }
        if ((this.f31066a & 256) != 0) {
            codedOutputByteBufferNano.a(9, this.f31075j);
        }
        if ((this.f31066a & 512) != 0) {
            codedOutputByteBufferNano.a(10, this.f31076k);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31066a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f31067b);
        }
        if ((this.f31066a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f31068c);
        }
        if ((this.f31066a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f31069d);
        }
        if ((this.f31066a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f31070e);
        }
        if ((this.f31066a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f31071f);
        }
        if ((this.f31066a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f31072g);
        }
        if ((this.f31066a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f31073h);
        }
        if ((this.f31066a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f31074i);
        }
        if ((this.f31066a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f31075j);
        }
        if ((this.f31066a & 512) != 0) {
            return b + CodedOutputByteBufferNano.b(10, this.f31076k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6213x m28685b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0065;
            case 42: goto L_0x0072;
            case 50: goto L_0x007f;
            case 58: goto L_0x008d;
            case 66: goto L_0x009b;
            case 74: goto L_0x00a9;
            case 82: goto L_0x00b7;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f31066a;
        r1 = r1 | 1;
        r6.f31066a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum VrClientType";
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
        r6.f31067b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f31066a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f31066a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.f();
        r6.f31068c = r0;
        r0 = r6.f31066a;
        r0 = r0 | 2;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.f();
        r6.f31069d = r0;
        r0 = r6.f31066a;
        r0 = r0 | 4;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.f();
        r6.f31070e = r0;
        r0 = r6.f31066a;
        r0 = r0 | 8;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x0072:
        r0 = r7.f();
        r6.f31071f = r0;
        r0 = r6.f31066a;
        r0 = r0 | 16;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r7.f();
        r6.f31072g = r0;
        r0 = r6.f31066a;
        r0 = r0 | 32;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r7.f();
        r6.f31073h = r0;
        r0 = r6.f31066a;
        r0 = r0 | 64;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x009b:
        r0 = r7.f();
        r6.f31074i = r0;
        r0 = r6.f31066a;
        r0 = r0 | 128;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x00a9:
        r0 = r7.f();
        r6.f31075j = r0;
        r0 = r6.f31066a;
        r0 = r0 | 256;
        r6.f31066a = r0;
        goto L_0x0000;
    L_0x00b7:
        r0 = r7.f();
        r6.f31076k = r0;
        r0 = r6.f31066a;
        r0 = r0 | 512;
        r6.f31066a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.x.b(com.google.protobuf.nano.a):com.google.android.play.a.a.x");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28685b(aVar);
    }
}
