package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0873c extends C0758b {
    public int f5552a;
    public String f5553b;
    public String f5554c;
    public String f5555d;
    public String f5556e;
    public String f5557f;
    public boolean f5558g;
    public boolean f5559h;

    public C0873c() {
        this.f5552a = 0;
        this.f5553b = "";
        this.f5554c = "";
        this.f5555d = "USD";
        this.f5556e = "US";
        this.f5557f = "";
        this.f5558g = false;
        this.f5559h = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5552a != 0) {
            codedOutputByteBufferNano.a(1, this.f5552a);
        }
        if (!(this.f5554c == null || this.f5554c.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5554c);
        }
        if (!(this.f5555d == null || this.f5555d.equals("USD"))) {
            codedOutputByteBufferNano.a(3, this.f5555d);
        }
        if (!(this.f5556e == null || this.f5556e.equals("US"))) {
            codedOutputByteBufferNano.a(4, this.f5556e);
        }
        if (!(this.f5553b == null || this.f5553b.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5553b);
        }
        if (!(this.f5557f == null || this.f5557f.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5557f);
        }
        if (this.f5558g) {
            codedOutputByteBufferNano.a(7, this.f5558g);
        }
        if (this.f5559h) {
            codedOutputByteBufferNano.a(9, this.f5559h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5552a != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5552a);
        }
        if (!(this.f5554c == null || this.f5554c.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5554c);
        }
        if (!(this.f5555d == null || this.f5555d.equals("USD"))) {
            b += CodedOutputByteBufferNano.b(3, this.f5555d);
        }
        if (!(this.f5556e == null || this.f5556e.equals("US"))) {
            b += CodedOutputByteBufferNano.b(4, this.f5556e);
        }
        if (!(this.f5553b == null || this.f5553b.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f5553b);
        }
        if (!(this.f5557f == null || this.f5557f.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f5557f);
        }
        if (this.f5558g) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if (this.f5559h) {
            return b + (CodedOutputByteBufferNano.d(9) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a.C0873c m5478b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 26: goto L_0x0046;
            case 34: goto L_0x004d;
            case 42: goto L_0x0054;
            case 50: goto L_0x005b;
            case 56: goto L_0x0062;
            case 72: goto L_0x0069;
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
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            case 6: goto L_0x003c;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            case 10: goto L_0x003c;
            case 11: goto L_0x003c;
            case 12: goto L_0x003c;
            case 13: goto L_0x003c;
            case 14: goto L_0x003c;
            case 15: goto L_0x0019;
            case 16: goto L_0x003c;
            case 17: goto L_0x003c;
            case 18: goto L_0x003c;
            case 19: goto L_0x003c;
            case 20: goto L_0x003c;
            case 21: goto L_0x003c;
            case 22: goto L_0x003c;
            case 23: goto L_0x003c;
            case 24: goto L_0x003c;
            case 25: goto L_0x003c;
            case 26: goto L_0x003c;
            case 27: goto L_0x003c;
            case 28: goto L_0x003c;
            case 29: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 59;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum InstrumentManagerActionType";
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
        r6.f5552a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.f();
        r6.f5554c = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.f();
        r6.f5555d = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.f();
        r6.f5556e = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.f();
        r6.f5553b = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r7.f();
        r6.f5557f = r0;
        goto L_0x0000;
    L_0x0062:
        r0 = r7.e();
        r6.f5558g = r0;
        goto L_0x0000;
    L_0x0069:
        r0 = r7.e();
        r6.f5559h = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.b.a.c.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.b.a.c");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5478b(aVar);
    }
}
