package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dk extends b {
    public int f38654a;
    public String f38655b;
    public String f38656c;
    public String f38657d;
    public int f38658e;

    public dk() {
        this.f38654a = 0;
        this.f38655b = "";
        this.f38656c = "";
        this.f38657d = "";
        this.f38658e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36254a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38654a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38655b);
        }
        if ((this.f38654a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38656c);
        }
        if ((this.f38654a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38657d);
        }
        if ((this.f38654a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38658e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36255b() {
        int b = super.b();
        if ((this.f38654a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38655b);
        }
        if ((this.f38654a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38656c);
        }
        if ((this.f38654a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38657d);
        }
        if ((this.f38654a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f38658e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.dk m36252b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 26: goto L_0x0028;
            case 32: goto L_0x0035;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f38655b = r0;
        r0 = r6.f38654a;
        r0 = r0 | 1;
        r6.f38654a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33564f();
        r6.f38656c = r0;
        r0 = r6.f38654a;
        r0 = r0 | 2;
        r6.f38654a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m33564f();
        r6.f38657d = r0;
        r0 = r6.f38654a;
        r0 = r0 | 4;
        r6.f38654a = r0;
        goto L_0x0000;
    L_0x0035:
        r1 = r6.f38654a;
        r1 = r1 | 8;
        r6.f38654a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0061 }
        switch(r2) {
            case 0: goto L_0x0069;
            case 1: goto L_0x0069;
            case 2: goto L_0x0069;
            default: goto L_0x0046;
        };	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0046:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = " is not a valid enum ManagedScope";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0061 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0061:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0069:
        r6.f38658e = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r6.f38654a;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2 | 8;
        r6.f38654a = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.dk.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.dk");
    }

    public final /* synthetic */ i m36253a(C7213a c7213a) {
        return m36252b(c7213a);
    }
}
