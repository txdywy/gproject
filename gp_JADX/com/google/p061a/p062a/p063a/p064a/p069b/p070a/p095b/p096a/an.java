package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.p061a.p062a.p063a.p064a.p065a.p068b.C0764d;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class an extends C0758b {
    public int f5371a;
    public C0764d f5372b;
    public C0764d f5373c;
    public C0764d f5374d;
    public boolean f5375e;
    public long f5376f;
    public int f5377g;
    public String f5378h;
    public String f5379i;

    public an() {
        this.f5371a = 0;
        this.f5372b = null;
        this.f5373c = null;
        this.f5374d = null;
        this.f5375e = false;
        this.f5376f = 0;
        this.f5377g = 0;
        this.f5378h = "";
        this.f5379i = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5371a != 0) {
            codedOutputByteBufferNano.a(1, this.f5371a);
        }
        if (this.f5372b != null) {
            codedOutputByteBufferNano.b(2, this.f5372b);
        }
        if (this.f5373c != null) {
            codedOutputByteBufferNano.b(3, this.f5373c);
        }
        if (this.f5374d != null) {
            codedOutputByteBufferNano.b(4, this.f5374d);
        }
        if (this.f5375e) {
            codedOutputByteBufferNano.a(5, this.f5375e);
        }
        if (!(this.f5378h == null || this.f5378h.equals(""))) {
            codedOutputByteBufferNano.a(6, this.f5378h);
        }
        if (!(this.f5379i == null || this.f5379i.equals(""))) {
            codedOutputByteBufferNano.a(9, this.f5379i);
        }
        if (this.f5376f != 0) {
            codedOutputByteBufferNano.b(10, this.f5376f);
        }
        if (this.f5377g != 0) {
            codedOutputByteBufferNano.a(11, this.f5377g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5371a != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5371a);
        }
        if (this.f5372b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5372b);
        }
        if (this.f5373c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5373c);
        }
        if (this.f5374d != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5374d);
        }
        if (this.f5375e) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if (!(this.f5378h == null || this.f5378h.equals(""))) {
            b += CodedOutputByteBufferNano.b(6, this.f5378h);
        }
        if (!(this.f5379i == null || this.f5379i.equals(""))) {
            b += CodedOutputByteBufferNano.b(9, this.f5379i);
        }
        if (this.f5376f != 0) {
            b += CodedOutputByteBufferNano.f(10, this.f5376f);
        }
        if (this.f5377g != 0) {
            return b + CodedOutputByteBufferNano.d(11, this.f5377g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.an m5312b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            case 26: goto L_0x0050;
            case 34: goto L_0x0061;
            case 40: goto L_0x0072;
            case 50: goto L_0x0079;
            case 74: goto L_0x0080;
            case 80: goto L_0x0088;
            case 88: goto L_0x0090;
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
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum Type";
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
        r6.f5371a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r6.f5372b;
        if (r0 != 0) goto L_0x004a;
    L_0x0043:
        r0 = new com.google.a.a.a.a.a.b.d;
        r0.<init>();
        r6.f5372b = r0;
    L_0x004a:
        r0 = r6.f5372b;
        r7.a(r0);
        goto L_0x0000;
    L_0x0050:
        r0 = r6.f5373c;
        if (r0 != 0) goto L_0x005b;
    L_0x0054:
        r0 = new com.google.a.a.a.a.a.b.d;
        r0.<init>();
        r6.f5373c = r0;
    L_0x005b:
        r0 = r6.f5373c;
        r7.a(r0);
        goto L_0x0000;
    L_0x0061:
        r0 = r6.f5374d;
        if (r0 != 0) goto L_0x006c;
    L_0x0065:
        r0 = new com.google.a.a.a.a.a.b.d;
        r0.<init>();
        r6.f5374d = r0;
    L_0x006c:
        r0 = r6.f5374d;
        r7.a(r0);
        goto L_0x0000;
    L_0x0072:
        r0 = r7.e();
        r6.f5375e = r0;
        goto L_0x0000;
    L_0x0079:
        r0 = r7.f();
        r6.f5378h = r0;
        goto L_0x0000;
    L_0x0080:
        r0 = r7.f();
        r6.f5379i = r0;
        goto L_0x0000;
    L_0x0088:
        r0 = r7.j();
        r6.f5376f = r0;
        goto L_0x0000;
    L_0x0090:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        switch(r2) {
            case 0: goto L_0x00bf;
            case 1: goto L_0x00bf;
            case 2: goto L_0x00bf;
            default: goto L_0x009b;
        };	 Catch:{ IllegalArgumentException -> 0x00b6 }
    L_0x009b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r4 = 45;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r4 = " is not a valid enum DateRangeType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00b6 }
    L_0x00b6:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x00bf:
        r6.f5377g = r2;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.an.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.an");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5312b(aVar);
    }
}
