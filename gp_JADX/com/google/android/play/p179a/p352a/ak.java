package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ak extends C0758b {
    public int f30814a;
    public String f30815b;
    public int f30816c;
    public String f30817d;
    public String f30818e;
    public int f30819f;
    public String f30820g;

    public ak() {
        this.f30814a = 0;
        this.f30815b = "";
        this.f30816c = 0;
        this.f30817d = "";
        this.f30818e = "";
        this.f30819f = 0;
        this.f30820g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        if ((this.f30814a & 1) != (akVar.f30814a & 1)) {
            return false;
        }
        if (!this.f30815b.equals(akVar.f30815b)) {
            return false;
        }
        if ((this.f30814a & 2) != (akVar.f30814a & 2)) {
            return false;
        }
        if (this.f30816c != akVar.f30816c) {
            return false;
        }
        if ((this.f30814a & 4) != (akVar.f30814a & 4)) {
            return false;
        }
        if (!this.f30817d.equals(akVar.f30817d)) {
            return false;
        }
        if ((this.f30814a & 8) != (akVar.f30814a & 8)) {
            return false;
        }
        if (!this.f30818e.equals(akVar.f30818e)) {
            return false;
        }
        if ((this.f30814a & 16) != (akVar.f30814a & 16)) {
            return false;
        }
        if (this.f30819f != akVar.f30819f) {
            return false;
        }
        if ((this.f30814a & 32) != (akVar.f30814a & 32)) {
            return false;
        }
        if (!this.f30820g.equals(akVar.f30820g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(akVar.aO);
        }
        if (akVar.aO == null || akVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30815b.hashCode()) * 31) + this.f30816c) * 31) + this.f30817d.hashCode()) * 31) + this.f30818e.hashCode()) * 31) + this.f30819f) * 31) + this.f30820g.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30814a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f30815b);
        }
        if ((this.f30814a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f30816c);
        }
        if ((this.f30814a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f30817d);
        }
        if ((this.f30814a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f30818e);
        }
        if ((this.f30814a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f30819f);
        }
        if ((this.f30814a & 32) != 0) {
            codedOutputByteBufferNano.a(7, this.f30820g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30814a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30815b);
        }
        if ((this.f30814a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f30816c);
        }
        if ((this.f30814a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30817d);
        }
        if ((this.f30814a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30818e);
        }
        if ((this.f30814a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f30819f);
        }
        if ((this.f30814a & 32) != 0) {
            return b + CodedOutputByteBufferNano.b(7, this.f30820g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.ak m28568b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 18: goto L_0x000e;
            case 24: goto L_0x001b;
            case 34: goto L_0x0058;
            case 42: goto L_0x0065;
            case 48: goto L_0x0072;
            case 58: goto L_0x00b1;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f30815b = r0;
        r0 = r6.f30814a;
        r0 = r0 | 1;
        r6.f30814a = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f30814a;
        r1 = r1 | 2;
        r6.f30814a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            case 3: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum DeviceType";
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
        r6.f30816c = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f30814a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f30814a = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r7.f();
        r6.f30817d = r0;
        r0 = r6.f30814a;
        r0 = r0 | 4;
        r6.f30814a = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r7.f();
        r6.f30818e = r0;
        r0 = r6.f30814a;
        r0 = r0 | 8;
        r6.f30814a = r0;
        goto L_0x0000;
    L_0x0072:
        r1 = r6.f30814a;
        r1 = r1 | 16;
        r6.f30814a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x009e }
        switch(r2) {
            case 0: goto L_0x00a7;
            case 1: goto L_0x00a7;
            case 2: goto L_0x00a7;
            case 3: goto L_0x00a7;
            case 4: goto L_0x00a7;
            case 5: goto L_0x00a7;
            case 6: goto L_0x00a7;
            case 7: goto L_0x00a7;
            case 8: goto L_0x00a7;
            default: goto L_0x0083;
        };	 Catch:{ IllegalArgumentException -> 0x009e }
    L_0x0083:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009e }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x009e }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x009e }
        r4 = " is not a valid enum OsType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x009e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x009e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x009e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x009e }
    L_0x009e:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00a7:
        r6.f30819f = r2;	 Catch:{ IllegalArgumentException -> 0x009e }
        r2 = r6.f30814a;	 Catch:{ IllegalArgumentException -> 0x009e }
        r2 = r2 | 16;
        r6.f30814a = r2;	 Catch:{ IllegalArgumentException -> 0x009e }
        goto L_0x0000;
    L_0x00b1:
        r0 = r7.f();
        r6.f30820g = r0;
        r0 = r6.f30814a;
        r0 = r0 | 32;
        r6.f30814a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.ak.b(com.google.protobuf.nano.a):com.google.android.play.a.a.ak");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28568b(aVar);
    }
}
