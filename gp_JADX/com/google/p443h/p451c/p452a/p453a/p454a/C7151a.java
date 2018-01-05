package com.google.p443h.p451c.p452a.p453a.p454a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7151a extends b {
    public String f34927a;
    public String f34928b;
    public int f34929c;
    public int f34930d;
    public String f34931e;
    public String f34932f;
    public int f34933g;

    public C7151a() {
        this.f34927a = "";
        this.f34928b = "";
        this.f34929c = 0;
        this.f34930d = 0;
        this.f34931e = "";
        this.f34932f = "";
        this.f34933g = 0;
        this.aP = -1;
    }

    public final void m32434a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34927a == null || this.f34927a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34927a);
        }
        if (!(this.f34928b == null || this.f34928b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34928b);
        }
        if (this.f34929c != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34929c);
        }
        if (this.f34930d != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f34930d);
        }
        if (!(this.f34931e == null || this.f34931e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f34931e);
        }
        if (!(this.f34932f == null || this.f34932f.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f34932f);
        }
        if (this.f34933g != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f34933g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32435b() {
        int b = super.b();
        if (!(this.f34927a == null || this.f34927a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34927a);
        }
        if (!(this.f34928b == null || this.f34928b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34928b);
        }
        if (this.f34929c != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f34929c);
        }
        if (this.f34930d != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34930d);
        }
        if (!(this.f34931e == null || this.f34931e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f34931e);
        }
        if (!(this.f34932f == null || this.f34932f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f34932f);
        }
        if (this.f34933g != 0) {
            return b + CodedOutputByteBufferNano.m33502d(7, this.f34933g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p452a.p453a.p454a.C7151a m32432b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x0015;
            case 24: goto L_0x001c;
            case 32: goto L_0x0023;
            case 42: goto L_0x002a;
            case 50: goto L_0x0031;
            case 56: goto L_0x0038;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f34927a = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.m33564f();
        r6.f34928b = r0;
        goto L_0x0000;
    L_0x001c:
        r0 = r7.m33567i();
        r6.f34929c = r0;
        goto L_0x0000;
    L_0x0023:
        r0 = r7.m33567i();
        r6.f34930d = r0;
        goto L_0x0000;
    L_0x002a:
        r0 = r7.m33564f();
        r6.f34931e = r0;
        goto L_0x0000;
    L_0x0031:
        r0 = r7.m33564f();
        r6.f34932f = r0;
        goto L_0x0000;
    L_0x0038:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x005e }
        switch(r2) {
            case 0: goto L_0x0066;
            case 1: goto L_0x0066;
            case 2: goto L_0x0066;
            default: goto L_0x0043;
        };	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x0043:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x005e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = " is not a valid enum CryptogramType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x005e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0066:
        r6.f34933g = r2;	 Catch:{ IllegalArgumentException -> 0x005e }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.a.a.a.a.b(com.google.protobuf.nano.a):com.google.h.c.a.a.a.a");
    }

    public final /* synthetic */ i m32433a(C7213a c7213a) {
        return m32432b(c7213a);
    }
}
