package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0810g extends C0758b {
    public static volatile C0810g[] f5138a;
    public long f5139b;
    public boolean f5140c;
    public ad f5141d;
    public String f5142e;
    public String f5143f;
    public String f5144g;
    public int f5145h;
    public int f5146i;

    public static C0810g[] m5143a() {
        if (f5138a == null) {
            synchronized (h.b) {
                if (f5138a == null) {
                    f5138a = new C0810g[0];
                }
            }
        }
        return f5138a;
    }

    public C0810g() {
        this.f5139b = 0;
        this.f5140c = false;
        this.f5141d = null;
        this.f5142e = "";
        this.f5143f = "";
        this.f5144g = "";
        this.f5145h = 0;
        this.f5146i = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5139b != 0) {
            codedOutputByteBufferNano.b(1, this.f5139b);
        }
        if (this.f5140c) {
            codedOutputByteBufferNano.a(2, this.f5140c);
        }
        if (!(this.f5142e == null || this.f5142e.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5142e);
        }
        if (!(this.f5143f == null || this.f5143f.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5143f);
        }
        if (!(this.f5144g == null || this.f5144g.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5144g);
        }
        if (this.f5145h != 0) {
            codedOutputByteBufferNano.a(6, this.f5145h);
        }
        if (this.f5146i != 0) {
            codedOutputByteBufferNano.a(7, this.f5146i);
        }
        if (this.f5141d != null) {
            codedOutputByteBufferNano.b(10, this.f5141d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5139b != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f5139b);
        }
        if (this.f5140c) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (!(this.f5142e == null || this.f5142e.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5142e);
        }
        if (!(this.f5143f == null || this.f5143f.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5143f);
        }
        if (!(this.f5144g == null || this.f5144g.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f5144g);
        }
        if (this.f5145h != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f5145h);
        }
        if (this.f5146i != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f5146i);
        }
        if (this.f5141d != null) {
            return b + CodedOutputByteBufferNano.d(10, this.f5141d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0810g m5144b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x0015;
            case 26: goto L_0x001c;
            case 34: goto L_0x0023;
            case 42: goto L_0x002a;
            case 48: goto L_0x0031;
            case 56: goto L_0x0038;
            case 82: goto L_0x0069;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.j();
        r6.f5139b = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.e();
        r6.f5140c = r0;
        goto L_0x0000;
    L_0x001c:
        r0 = r7.f();
        r6.f5142e = r0;
        goto L_0x0000;
    L_0x0023:
        r0 = r7.f();
        r6.f5143f = r0;
        goto L_0x0000;
    L_0x002a:
        r0 = r7.f();
        r6.f5144g = r0;
        goto L_0x0000;
    L_0x0031:
        r0 = r7.i();
        r6.f5145h = r0;
        goto L_0x0000;
    L_0x0038:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x005e }
        switch(r2) {
            case 0: goto L_0x0066;
            case 2: goto L_0x0066;
            case 4: goto L_0x0066;
            case 6: goto L_0x0066;
            case 12: goto L_0x0066;
            default: goto L_0x0043;
        };	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x0043:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x005e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = " is not a valid enum ButtonType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x005e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0066:
        r6.f5146i = r2;	 Catch:{ IllegalArgumentException -> 0x005e }
        goto L_0x0000;
    L_0x0069:
        r0 = r6.f5141d;
        if (r0 != 0) goto L_0x0074;
    L_0x006d:
        r0 = new com.google.a.a.a.a.b.a.b.a.ad;
        r0.<init>();
        r6.f5141d = r0;
    L_0x0074:
        r0 = r6.f5141d;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.f.g.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.f.g");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5144b(aVar);
    }
}
