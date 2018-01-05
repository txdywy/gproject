package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C4708l extends C0758b {
    public int f24215a;
    public String f24216b;
    public int f24217c;
    public C4710n f24218d;

    public final C4708l m21916a(int i) {
        this.f24217c = i;
        this.f24215a |= 2;
        return this;
    }

    public C4708l() {
        this.f24215a = 0;
        this.f24216b = "";
        this.f24217c = 0;
        this.f24218d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24215a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24216b);
        }
        if ((this.f24215a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24217c);
        }
        if (this.f24218d != null) {
            codedOutputByteBufferNano.b(3, this.f24218d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24215a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24216b);
        }
        if ((this.f24215a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f24217c);
        }
        if (this.f24218d != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f24218d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.verifier.p259a.p260a.C4708l m21915b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 26: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f24216b = r0;
        r0 = r6.f24215a;
        r0 = r0 | 1;
        r6.f24215a = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f24215a;
        r1 = r1 | 2;
        r6.f24215a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum ManagedScope";
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
        r6.f24217c = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f24215a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f24215a = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
    L_0x0058:
        r0 = r6.f24218d;
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new com.google.android.finsky.verifier.a.a.n;
        r0.<init>();
        r6.f24218d = r0;
    L_0x0063:
        r0 = r6.f24218d;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.a.a.l.b(com.google.protobuf.nano.a):com.google.android.finsky.verifier.a.a.l");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m21915b(aVar);
    }
}
