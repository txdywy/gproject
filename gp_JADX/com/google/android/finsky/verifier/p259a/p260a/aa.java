package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class aa extends C0758b {
    public int f24094a;
    public byte[] f24095b;
    public long f24096c;
    public long f24097d;
    public int f24098e;
    public boolean f24099f;

    public aa() {
        this.f24094a = 0;
        this.f24095b = l.l;
        this.f24096c = 0;
        this.f24097d = 0;
        this.f24098e = 1;
        this.f24099f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24094a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24095b);
        }
        if ((this.f24094a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24096c);
        }
        if ((this.f24094a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24097d);
        }
        if ((this.f24094a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24098e);
        }
        if ((this.f24094a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24099f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24094a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24095b);
        }
        if ((this.f24094a & 2) != 0) {
            b += CodedOutputByteBufferNano.e(2, this.f24096c);
        }
        if ((this.f24094a & 4) != 0) {
            b += CodedOutputByteBufferNano.e(3, this.f24097d);
        }
        if ((this.f24094a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f24098e);
        }
        if ((this.f24094a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.d(5) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.verifier.p259a.p260a.aa m21849b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0035;
            case 40: goto L_0x0072;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.g();
        r6.f24095b = r0;
        r0 = r6.f24094a;
        r0 = r0 | 1;
        r6.f24094a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.j();
        r6.f24096c = r0;
        r0 = r6.f24094a;
        r0 = r0 | 2;
        r6.f24094a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.j();
        r6.f24097d = r0;
        r0 = r6.f24094a;
        r0 = r0 | 4;
        r6.f24094a = r0;
        goto L_0x0000;
    L_0x0035:
        r1 = r6.f24094a;
        r1 = r1 | 8;
        r6.f24094a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0061 }
        switch(r2) {
            case 1: goto L_0x0069;
            case 2: goto L_0x0069;
            case 3: goto L_0x0069;
            default: goto L_0x0046;
        };	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0046:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = " is not a valid enum UninstallType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0061 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0061:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0069:
        r6.f24098e = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r6.f24094a;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2 | 8;
        r6.f24094a = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        goto L_0x0000;
    L_0x0072:
        r0 = r7.e();
        r6.f24099f = r0;
        r0 = r6.f24094a;
        r0 = r0 | 16;
        r6.f24094a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.a.a.aa.b(com.google.protobuf.nano.a):com.google.android.finsky.verifier.a.a.aa");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m21849b(aVar);
    }
}
