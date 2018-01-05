package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6209t extends C0758b {
    public int f31045a;
    public int f31046b;
    public int f31047c;

    public C6209t() {
        this.f31045a = 0;
        this.f31046b = -1;
        this.f31047c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6209t)) {
            return false;
        }
        C6209t c6209t = (C6209t) obj;
        if ((this.f31045a & 1) != (c6209t.f31045a & 1)) {
            return false;
        }
        if (this.f31046b != c6209t.f31046b) {
            return false;
        }
        if ((this.f31045a & 2) != (c6209t.f31045a & 2)) {
            return false;
        }
        if (this.f31047c != c6209t.f31047c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6209t.aO);
        }
        if (c6209t.aO == null || c6209t.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f31046b) * 31) + this.f31047c) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31045a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31046b);
        }
        if ((this.f31045a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f31047c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31045a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f31046b);
        }
        if ((this.f31045a & 2) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f31047c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.play.p179a.p352a.C6209t m28669b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f31045a;
        r1 = r1 | 1;
        r6.f31045a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case -1: goto L_0x0042;
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            case 6: goto L_0x0042;
            case 7: goto L_0x0042;
            case 8: goto L_0x0042;
            case 9: goto L_0x0042;
            case 10: goto L_0x0042;
            case 11: goto L_0x0042;
            case 12: goto L_0x0042;
            case 13: goto L_0x0042;
            case 14: goto L_0x0042;
            case 15: goto L_0x0042;
            case 16: goto L_0x0042;
            case 17: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum NetworkType";
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
        r6.f31046b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f31045a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f31045a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r1 = r6.f31045a;
        r1 = r1 | 2;
        r6.f31045a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0077 }
        switch(r2) {
            case 0: goto L_0x007f;
            case 1: goto L_0x007f;
            case 2: goto L_0x007f;
            case 3: goto L_0x007f;
            case 4: goto L_0x007f;
            case 5: goto L_0x007f;
            case 6: goto L_0x007f;
            case 7: goto L_0x007f;
            case 8: goto L_0x007f;
            case 9: goto L_0x007f;
            case 10: goto L_0x007f;
            case 11: goto L_0x007f;
            case 12: goto L_0x007f;
            case 13: goto L_0x007f;
            case 14: goto L_0x007f;
            case 15: goto L_0x007f;
            case 16: goto L_0x007f;
            case 100: goto L_0x007f;
            default: goto L_0x005c;
        };	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x005c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = " is not a valid enum MobileSubtype";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x007f:
        r6.f31047c = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r6.f31045a;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2 | 2;
        r6.f31045a = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.a.a.t.b(com.google.protobuf.nano.a):com.google.android.play.a.a.t");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28669b(aVar);
    }
}
