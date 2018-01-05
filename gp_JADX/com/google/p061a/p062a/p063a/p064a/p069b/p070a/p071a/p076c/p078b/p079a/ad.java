package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class ad extends C0758b {
    public C0811h f4862a;
    public int f4863b;
    public String f4864c;
    public String f4865d;
    public byte[] f4866e;
    public String f4867f;
    public String f4868g;
    public int f4869h;
    public String f4870i;
    public C0799a f4871j;

    public ad() {
        this.f4862a = null;
        this.f4863b = 0;
        this.f4864c = "";
        this.f4865d = "";
        this.f4866e = l.l;
        this.f4867f = "";
        this.f4868g = "";
        this.f4869h = -1;
        this.f4870i = "";
        this.f4871j = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4864c == null || this.f4864c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4864c);
        }
        if (!(this.f4865d == null || this.f4865d.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f4865d);
        }
        if (this.f4871j != null) {
            codedOutputByteBufferNano.b(3, this.f4871j);
        }
        if (this.f4862a != null) {
            codedOutputByteBufferNano.b(4, this.f4862a);
        }
        if (this.f4863b != 0) {
            codedOutputByteBufferNano.a(5, this.f4863b);
        }
        if (!Arrays.equals(this.f4866e, l.l)) {
            codedOutputByteBufferNano.a(6, this.f4866e);
        }
        if (!(this.f4868g == null || this.f4868g.equals(""))) {
            codedOutputByteBufferNano.a(7, this.f4868g);
        }
        if (this.f4869h != -1) {
            codedOutputByteBufferNano.a(8, this.f4869h);
        }
        if (!(this.f4870i == null || this.f4870i.equals(""))) {
            codedOutputByteBufferNano.a(9, this.f4870i);
        }
        if (!(this.f4867f == null || this.f4867f.equals(""))) {
            codedOutputByteBufferNano.a(10, this.f4867f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4864c == null || this.f4864c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4864c);
        }
        if (!(this.f4865d == null || this.f4865d.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f4865d);
        }
        if (this.f4871j != null) {
            b += CodedOutputByteBufferNano.d(3, this.f4871j);
        }
        if (this.f4862a != null) {
            b += CodedOutputByteBufferNano.d(4, this.f4862a);
        }
        if (this.f4863b != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f4863b);
        }
        if (!Arrays.equals(this.f4866e, l.l)) {
            b += CodedOutputByteBufferNano.b(6, this.f4866e);
        }
        if (!(this.f4868g == null || this.f4868g.equals(""))) {
            b += CodedOutputByteBufferNano.b(7, this.f4868g);
        }
        if (this.f4869h != -1) {
            b += CodedOutputByteBufferNano.d(8, this.f4869h);
        }
        if (!(this.f4870i == null || this.f4870i.equals(""))) {
            b += CodedOutputByteBufferNano.b(9, this.f4870i);
        }
        if (this.f4867f == null || this.f4867f.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(10, this.f4867f);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.ad m4989b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x0015;
            case 26: goto L_0x001c;
            case 34: goto L_0x002d;
            case 40: goto L_0x003e;
            case 50: goto L_0x006f;
            case 58: goto L_0x0076;
            case 64: goto L_0x007d;
            case 74: goto L_0x0085;
            case 82: goto L_0x008d;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f4864c = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.f();
        r6.f4865d = r0;
        goto L_0x0000;
    L_0x001c:
        r0 = r6.f4871j;
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r0 = new com.google.a.a.a.a.b.a.a.d.a.a;
        r0.<init>();
        r6.f4871j = r0;
    L_0x0027:
        r0 = r6.f4871j;
        r7.a(r0);
        goto L_0x0000;
    L_0x002d:
        r0 = r6.f4862a;
        if (r0 != 0) goto L_0x0038;
    L_0x0031:
        r0 = new com.google.a.a.a.a.b.a.a.f.h;
        r0.<init>();
        r6.f4862a = r0;
    L_0x0038:
        r0 = r6.f4862a;
        r7.a(r0);
        goto L_0x0000;
    L_0x003e:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0064 }
        switch(r2) {
            case 0: goto L_0x006c;
            case 1: goto L_0x006c;
            case 2: goto L_0x006c;
            default: goto L_0x0049;
        };	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0049:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4 = " is not a valid enum AssociationType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0064 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0064 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0064:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x006c:
        r6.f4863b = r2;	 Catch:{ IllegalArgumentException -> 0x0064 }
        goto L_0x0000;
    L_0x006f:
        r0 = r7.g();
        r6.f4866e = r0;
        goto L_0x0000;
    L_0x0076:
        r0 = r7.f();
        r6.f4868g = r0;
        goto L_0x0000;
    L_0x007d:
        r0 = r7.i();
        r6.f4869h = r0;
        goto L_0x0000;
    L_0x0085:
        r0 = r7.f();
        r6.f4870i = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r7.f();
        r6.f4867f = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.c.b.a.ad.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.c.b.a.ad");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m4989b(aVar);
    }
}
