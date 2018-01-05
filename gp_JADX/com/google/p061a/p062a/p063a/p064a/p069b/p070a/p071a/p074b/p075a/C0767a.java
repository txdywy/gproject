package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p074b.p075a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0767a extends C0758b {
    public long f4793a;
    public String f4794b;
    public int f4795c;
    public String f4796d;

    public C0767a() {
        this.f4793a = 0;
        this.f4794b = "";
        this.f4795c = 0;
        this.f4796d = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4795c != 0) {
            codedOutputByteBufferNano.a(2, this.f4795c);
        }
        if (!(this.f4794b == null || this.f4794b.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4794b);
        }
        if (!(this.f4796d == null || this.f4796d.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f4796d);
        }
        if (this.f4793a != 0) {
            codedOutputByteBufferNano.b(5, this.f4793a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4795c != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f4795c);
        }
        if (!(this.f4794b == null || this.f4794b.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f4794b);
        }
        if (!(this.f4796d == null || this.f4796d.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f4796d);
        }
        if (this.f4793a != 0) {
            return b + CodedOutputByteBufferNano.f(5, this.f4793a);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p074b.p075a.C0767a m4953b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 16: goto L_0x000e;
            case 26: goto L_0x003f;
            case 34: goto L_0x0046;
            case 40: goto L_0x004d;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum DisplayType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f4795c = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.f();
        r6.f4794b = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.f();
        r6.f4796d = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.j();
        r6.f4793a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.b.a.a.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.b.a.a");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m4953b(aVar);
    }
}
