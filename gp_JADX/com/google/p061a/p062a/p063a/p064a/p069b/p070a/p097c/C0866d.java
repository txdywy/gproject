package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c;

import com.google.h.a.a.a.a;
import com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0763c;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0866d extends C0758b {
    public int f5514a;
    public byte[] f5515b;
    public C0763c f5516c;
    public String f5517d;
    public int f5518e;
    public long f5519f;
    public String f5520g;
    public a f5521h;
    public boolean f5522i;

    public C0866d() {
        this.f5514a = -1;
        this.f5515b = l.l;
        this.f5514a = -1;
        this.f5516c = null;
        this.f5517d = "";
        this.f5518e = 0;
        this.f5519f = 0;
        this.f5520g = "";
        this.f5521h = null;
        this.f5522i = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f5515b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5515b);
        }
        if (!(this.f5517d == null || this.f5517d.equals(""))) {
            codedOutputByteBufferNano.a(7, this.f5517d);
        }
        if (this.f5518e != 0) {
            codedOutputByteBufferNano.a(8, this.f5518e);
        }
        if (this.f5519f != 0) {
            codedOutputByteBufferNano.b(9, this.f5519f);
        }
        if (this.f5514a == 0) {
            codedOutputByteBufferNano.b(10, this.f5516c);
        }
        if (!(this.f5520g == null || this.f5520g.equals(""))) {
            codedOutputByteBufferNano.a(11, this.f5520g);
        }
        if (this.f5521h != null) {
            codedOutputByteBufferNano.b(12, this.f5521h);
        }
        if (this.f5522i) {
            codedOutputByteBufferNano.a(13, this.f5522i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!Arrays.equals(this.f5515b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5515b);
        }
        if (!(this.f5517d == null || this.f5517d.equals(""))) {
            b += CodedOutputByteBufferNano.b(7, this.f5517d);
        }
        if (this.f5518e != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f5518e);
        }
        if (this.f5519f != 0) {
            b += CodedOutputByteBufferNano.f(9, this.f5519f);
        }
        if (this.f5514a == 0) {
            b += CodedOutputByteBufferNano.d(10, this.f5516c);
        }
        if (!(this.f5520g == null || this.f5520g.equals(""))) {
            b += CodedOutputByteBufferNano.b(11, this.f5520g);
        }
        if (this.f5521h != null) {
            b += CodedOutputByteBufferNano.d(12, this.f5521h);
        }
        if (this.f5522i) {
            return b + (CodedOutputByteBufferNano.d(13) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0866d m5454b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 18: goto L_0x000e;
            case 58: goto L_0x0015;
            case 64: goto L_0x001c;
            case 72: goto L_0x004d;
            case 82: goto L_0x0054;
            case 90: goto L_0x0068;
            case 98: goto L_0x006f;
            case 104: goto L_0x0080;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.g();
        r6.f5515b = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.f();
        r6.f5517d = r0;
        goto L_0x0000;
    L_0x001c:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0042 }
        switch(r2) {
            case 0: goto L_0x004a;
            case 1: goto L_0x004a;
            case 2: goto L_0x004a;
            case 3: goto L_0x004a;
            default: goto L_0x0027;
        };	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0027:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = " is not a valid enum ClientType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0042 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x004a:
        r6.f5518e = r2;	 Catch:{ IllegalArgumentException -> 0x0042 }
        goto L_0x0000;
    L_0x004d:
        r0 = r7.j();
        r6.f5519f = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r6.f5516c;
        if (r0 != 0) goto L_0x005f;
    L_0x0058:
        r0 = new com.google.a.a.a.a.a.b.c;
        r0.<init>();
        r6.f5516c = r0;
    L_0x005f:
        r0 = r6.f5516c;
        r7.a(r0);
        r0 = 0;
        r6.f5514a = r0;
        goto L_0x0000;
    L_0x0068:
        r0 = r7.f();
        r6.f5520g = r0;
        goto L_0x0000;
    L_0x006f:
        r0 = r6.f5521h;
        if (r0 != 0) goto L_0x007a;
    L_0x0073:
        r0 = new com.google.h.a.a.a.a;
        r0.<init>();
        r6.f5521h = r0;
    L_0x007a:
        r0 = r6.f5521h;
        r7.a(r0);
        goto L_0x0000;
    L_0x0080:
        r0 = r7.e();
        r6.f5522i = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.c.d.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.c.d");
    }

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        return m5454b(aVar);
    }
}
