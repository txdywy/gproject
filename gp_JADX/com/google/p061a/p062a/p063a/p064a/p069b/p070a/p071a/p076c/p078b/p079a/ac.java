package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ac extends C0758b {
    public static volatile ac[] f4853a;
    public int f4854b;
    public int f4855c;
    public String f4856d;
    public int f4857e;
    public int f4858f;
    public String f4859g;
    public int f4860h;
    public String f4861i;

    public static ac[] m4984a() {
        if (f4853a == null) {
            synchronized (h.b) {
                if (f4853a == null) {
                    f4853a = new ac[0];
                }
            }
        }
        return f4853a;
    }

    public ac() {
        this.f4854b = 0;
        this.f4855c = 0;
        this.f4856d = "";
        this.f4857e = 0;
        this.f4858f = 0;
        this.f4859g = "";
        this.f4860h = 0;
        this.f4861i = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4856d == null || this.f4856d.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4856d);
        }
        if (this.f4857e != 0) {
            codedOutputByteBufferNano.a(2, this.f4857e);
        }
        if (this.f4858f != 0) {
            codedOutputByteBufferNano.a(3, this.f4858f);
        }
        if (this.f4860h != 0) {
            codedOutputByteBufferNano.a(4, this.f4860h);
        }
        if (!(this.f4859g == null || this.f4859g.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f4859g);
        }
        if (this.f4854b != 0) {
            codedOutputByteBufferNano.a(7, this.f4854b);
        }
        if (!(this.f4861i == null || this.f4861i.equals(""))) {
            codedOutputByteBufferNano.a(8, this.f4861i);
        }
        if (this.f4855c != 0) {
            codedOutputByteBufferNano.a(9, this.f4855c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4856d == null || this.f4856d.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4856d);
        }
        if (this.f4857e != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f4857e);
        }
        if (this.f4858f != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f4858f);
        }
        if (this.f4860h != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f4860h);
        }
        if (!(this.f4859g == null || this.f4859g.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f4859g);
        }
        if (this.f4854b != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f4854b);
        }
        if (!(this.f4861i == null || this.f4861i.equals(""))) {
            b += CodedOutputByteBufferNano.b(8, this.f4861i);
        }
        if (this.f4855c != 0) {
            return b + CodedOutputByteBufferNano.d(9, this.f4855c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.ac m4985b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            case 24: goto L_0x001c;
            case 32: goto L_0x0023;
            case 50: goto L_0x002a;
            case 56: goto L_0x0031;
            case 66: goto L_0x0062;
            case 72: goto L_0x0069;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f4856d = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.i();
        r6.f4857e = r0;
        goto L_0x0000;
    L_0x001c:
        r0 = r7.i();
        r6.f4858f = r0;
        goto L_0x0000;
    L_0x0023:
        r0 = r7.i();
        r6.f4860h = r0;
        goto L_0x0000;
    L_0x002a:
        r0 = r7.f();
        r6.f4859g = r0;
        goto L_0x0000;
    L_0x0031:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0057 }
        switch(r2) {
            case 0: goto L_0x005f;
            case 1: goto L_0x005f;
            case 2: goto L_0x005f;
            default: goto L_0x003c;
        };	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x003c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r4 = " is not a valid enum InputType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0057 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x0057:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x005f:
        r6.f4854b = r2;	 Catch:{ IllegalArgumentException -> 0x0057 }
        goto L_0x0000;
    L_0x0062:
        r0 = r7.f();
        r6.f4861i = r0;
        goto L_0x0000;
    L_0x0069:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x008f }
        switch(r2) {
            case 0: goto L_0x0098;
            case 1: goto L_0x0098;
            case 2: goto L_0x0098;
            case 3: goto L_0x0098;
            case 4: goto L_0x0098;
            default: goto L_0x0074;
        };	 Catch:{ IllegalArgumentException -> 0x008f }
    L_0x0074:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x008f }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x008f }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x008f }
        r4 = " is not a valid enum ExitResult";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x008f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x008f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x008f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x008f }
    L_0x008f:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0098:
        r6.f4855c = r2;	 Catch:{ IllegalArgumentException -> 0x008f }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.c.b.a.ac.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.c.b.a.ac");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m4985b(aVar);
    }
}
