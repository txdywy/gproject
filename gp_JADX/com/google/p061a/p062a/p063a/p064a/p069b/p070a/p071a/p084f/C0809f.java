package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0809f extends C0758b {
    public static volatile C0809f[] f5131a;
    public long f5132b;
    public C0806c f5133c;
    public int f5134d;
    public String f5135e;
    public int f5136f;
    public ad f5137g;

    public static C0809f[] m5138a() {
        if (f5131a == null) {
            synchronized (h.b) {
                if (f5131a == null) {
                    f5131a = new C0809f[0];
                }
            }
        }
        return f5131a;
    }

    public C0809f() {
        this.f5132b = 0;
        this.f5133c = null;
        this.f5134d = 0;
        this.f5135e = "";
        this.f5136f = 0;
        this.f5137g = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5133c != null) {
            codedOutputByteBufferNano.b(4, this.f5133c);
        }
        if (this.f5132b != 0) {
            codedOutputByteBufferNano.b(5, this.f5132b);
        }
        if (this.f5134d != 0) {
            codedOutputByteBufferNano.a(6, this.f5134d);
        }
        if (this.f5136f != 0) {
            codedOutputByteBufferNano.a(7, this.f5136f);
        }
        if (!(this.f5135e == null || this.f5135e.equals(""))) {
            codedOutputByteBufferNano.a(8, this.f5135e);
        }
        if (this.f5137g != null) {
            codedOutputByteBufferNano.b(9, this.f5137g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5133c != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5133c);
        }
        if (this.f5132b != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f5132b);
        }
        if (this.f5134d != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f5134d);
        }
        if (this.f5136f != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f5136f);
        }
        if (!(this.f5135e == null || this.f5135e.equals(""))) {
            b += CodedOutputByteBufferNano.b(8, this.f5135e);
        }
        if (this.f5137g != null) {
            return b + CodedOutputByteBufferNano.d(9, this.f5137g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0809f m5139b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 34: goto L_0x000e;
            case 40: goto L_0x001f;
            case 48: goto L_0x0026;
            case 56: goto L_0x0057;
            case 66: goto L_0x008a;
            case 74: goto L_0x0092;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f5133c;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.a.a.a.a.b.a.a.f.c;
        r0.<init>();
        r6.f5133c = r0;
    L_0x0019:
        r0 = r6.f5133c;
        r7.a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r7.j();
        r6.f5132b = r0;
        goto L_0x0000;
    L_0x0026:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x004c }
        switch(r2) {
            case 0: goto L_0x0054;
            case 1: goto L_0x0054;
            case 2: goto L_0x0054;
            case 3: goto L_0x0054;
            default: goto L_0x0031;
        };	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x0031:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004c }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004c }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        r4 = " is not a valid enum AddressState";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x004c }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0054:
        r6.f5134d = r2;	 Catch:{ IllegalArgumentException -> 0x004c }
        goto L_0x0000;
    L_0x0057:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x007d }
        switch(r2) {
            case 0: goto L_0x0086;
            case 1: goto L_0x0086;
            default: goto L_0x0062;
        };	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x0062:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x007d }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x007d }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x007d }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x007d }
        r4 = " is not a valid enum AddressFixType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x007d }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x007d }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x007d }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x007d }
    L_0x007d:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0086:
        r6.f5136f = r2;	 Catch:{ IllegalArgumentException -> 0x007d }
        goto L_0x0000;
    L_0x008a:
        r0 = r7.f();
        r6.f5135e = r0;
        goto L_0x0000;
    L_0x0092:
        r0 = r6.f5137g;
        if (r0 != 0) goto L_0x009d;
    L_0x0096:
        r0 = new com.google.a.a.a.a.b.a.b.a.ad;
        r0.<init>();
        r6.f5137g = r0;
    L_0x009d:
        r0 = r6.f5137g;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.a.f.f.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.a.f.f");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5139b(aVar);
    }
}
