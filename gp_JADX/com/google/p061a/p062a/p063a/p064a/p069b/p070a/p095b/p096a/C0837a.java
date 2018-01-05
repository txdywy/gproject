package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0837a extends C0758b {
    public String f5304a;
    public int f5305b;

    public C0837a() {
        this.f5304a = "";
        this.f5305b = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5304a == null || this.f5304a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5304a);
        }
        if (this.f5305b != 0) {
            codedOutputByteBufferNano.a(2, this.f5305b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5304a == null || this.f5304a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5304a);
        }
        if (this.f5305b != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f5305b);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0837a m5257b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f5304a = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x003b }
        switch(r2) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0043;
            case 2: goto L_0x0043;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x0020:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = " is not a valid enum RepetitionType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0043:
        r6.f5305b = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.a.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.a");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5257b(aVar);
    }
}
