package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p085g.p086a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0824a extends C0758b {
    public long f5216a;
    public int f5217b;
    public String f5218c;
    public ae f5219d;
    public ad f5220e;

    public C0824a() {
        this.f5216a = 0;
        this.f5217b = 0;
        this.f5218c = "";
        this.f5219d = null;
        this.f5220e = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5216a != 0) {
            codedOutputByteBufferNano.b(1, this.f5216a);
        }
        if (this.f5217b != 0) {
            codedOutputByteBufferNano.a(2, this.f5217b);
        }
        if (!(this.f5218c == null || this.f5218c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5218c);
        }
        if (this.f5219d != null) {
            codedOutputByteBufferNano.b(4, this.f5219d);
        }
        if (this.f5220e != null) {
            codedOutputByteBufferNano.b(5, this.f5220e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5216a != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f5216a);
        }
        if (this.f5217b != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f5217b);
        }
        if (!(this.f5218c == null || this.f5218c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5218c);
        }
        if (this.f5219d != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5219d);
        }
        if (this.f5220e != null) {
            return b + CodedOutputByteBufferNano.d(5, this.f5220e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p085g.p086a.C0824a m5205b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x0015;
            case 26: goto L_0x0046;
            case 34: goto L_0x004d;
            case 42: goto L_0x005e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.j();
        r6.f5216a = r0;
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
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = " is not a valid enum DisplayType";
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
        r6.f5217b = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
    L_0x0046:
        r0 = r7.f();
        r6.f5218c = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r6.f5219d;
        if (r0 != 0) goto L_0x0058;
    L_0x0051:
        r0 = new com.google.a.a.a.a.b.a.b.a.ae;
        r0.<init>();
        r6.f5219d = r0;
    L_0x0058:
        r0 = r6.f5219d;
        r7.a(r0);
        goto L_0x0000;
    L_0x005e:
        r0 = r6.f5220e;
        if (r0 != 0) goto L_0x0069;
    L_0x0062:
        r0 = new com.google.a.a.a.a.b.a.b.a.ad;
        r0.<init>();
        r6.f5220e = r0;
    L_0x0069:
        r0 = r6.f5220e;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.g.a.a.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.g.a.a");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5205b(aVar);
    }
}
