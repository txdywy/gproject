package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class eu extends C0758b {
    public static volatile eu[] f12321a;
    public int f12322b;
    public String f12323c;
    public ip f12324d;
    public int f12325e;
    public int f12326f;

    public static eu[] aZ_() {
        if (f12321a == null) {
            synchronized (h.b) {
                if (f12321a == null) {
                    f12321a = new eu[0];
                }
            }
        }
        return f12321a;
    }

    public eu() {
        this.f12322b = 0;
        this.f12323c = "";
        this.f12324d = null;
        this.f12325e = 0;
        this.f12326f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        if ((this.f12322b & 1) != (euVar.f12322b & 1)) {
            return false;
        }
        if (!this.f12323c.equals(euVar.f12323c)) {
            return false;
        }
        if (this.f12324d == null) {
            if (euVar.f12324d != null) {
                return false;
            }
        } else if (!this.f12324d.equals(euVar.f12324d)) {
            return false;
        }
        if ((this.f12322b & 2) != (euVar.f12322b & 2)) {
            return false;
        }
        if (this.f12325e != euVar.f12325e) {
            return false;
        }
        if ((this.f12322b & 4) != (euVar.f12322b & 4)) {
            return false;
        }
        if (this.f12326f != euVar.f12326f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(euVar.aO);
        }
        if (euVar.aO == null || euVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12323c.hashCode();
        ip ipVar = this.f12324d;
        hashCode = ((((((ipVar == null ? 0 : ipVar.hashCode()) + (hashCode * 31)) * 31) + this.f12325e) * 31) + this.f12326f) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12322b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12323c);
        }
        if (this.f12324d != null) {
            codedOutputByteBufferNano.b(2, this.f12324d);
        }
        if ((this.f12322b & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12325e);
        }
        if ((this.f12322b & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12326f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12322b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12323c);
        }
        if (this.f12324d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12324d);
        }
        if ((this.f12322b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12325e);
        }
        if ((this.f12322b & 4) != 0) {
            return b + CodedOutputByteBufferNano.d(4, this.f12326f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.eu m12543b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x002c;
            case 32: goto L_0x004f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f12323c = r0;
        r0 = r6.f12322b;
        r0 = r0 | 1;
        r6.f12322b = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f12324d;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.android.finsky.cv.a.ip;
        r0.<init>();
        r6.f12324d = r0;
    L_0x0026:
        r0 = r6.f12324d;
        r7.a(r0);
        goto L_0x0000;
    L_0x002c:
        r1 = r6.f12322b;
        r1 = r1 | 2;
        r6.f12322b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = com.google.android.finsky.cv.p177a.aw.m12218a(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r6.f12325e = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f12322b;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f12322b = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0047:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r1 = r6.f12322b;
        r1 = r1 | 4;
        r6.f12322b = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x007b }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            case 2: goto L_0x0084;
            case 3: goto L_0x0084;
            case 4: goto L_0x0084;
            case 5: goto L_0x0084;
            default: goto L_0x0060;
        };	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0060:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007b }
        r4 = " is not a valid enum Id";
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
        r6.f12326f = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r6.f12322b;	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = r2 | 4;
        r6.f12322b = r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.eu.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.eu");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12543b(aVar);
    }
}
