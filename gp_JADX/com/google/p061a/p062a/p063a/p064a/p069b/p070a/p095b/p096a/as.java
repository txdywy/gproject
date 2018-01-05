package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.h.c.c.b.c.a.a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.h;

public final class as extends C0758b {
    public static volatile as[] f5408b;
    public int f5409a;
    public String f5410c;
    public int f5411d;
    public double f5412e;
    public double f5413f;
    public String f5414g;
    public a f5415h;

    public static as[] m5334a() {
        if (f5408b == null) {
            synchronized (h.b) {
                if (f5408b == null) {
                    f5408b = new as[0];
                }
            }
        }
        return f5408b;
    }

    public final String m5339c() {
        if (this.f5409a == 0) {
            return this.f5410c;
        }
        return "";
    }

    public final int m5340d() {
        if (this.f5409a == 1) {
            return this.f5411d;
        }
        return 0;
    }

    public final double m5341e() {
        if (this.f5409a == 2) {
            return this.f5412e;
        }
        return Double.MAX_VALUE;
    }

    public final double m5342f() {
        if (this.f5409a == 3) {
            return this.f5413f;
        }
        return -1.7976931348623157E308d;
    }

    public as() {
        this.f5409a = -1;
        this.f5409a = -1;
        this.f5409a = -1;
        this.f5409a = -1;
        this.f5409a = -1;
        this.f5414g = "";
        this.f5415h = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5409a == 0) {
            codedOutputByteBufferNano.a(1, this.f5410c);
        }
        if (!(this.f5414g == null || this.f5414g.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5414g);
        }
        if (this.f5409a == 1) {
            codedOutputByteBufferNano.a(3, this.f5411d);
        }
        if (this.f5409a == 2) {
            codedOutputByteBufferNano.a(4, this.f5412e);
        }
        if (this.f5409a == 3) {
            codedOutputByteBufferNano.a(5, this.f5413f);
        }
        if (this.f5415h != null) {
            codedOutputByteBufferNano.b(6, this.f5415h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5409a == 0) {
            b += CodedOutputByteBufferNano.b(1, this.f5410c);
        }
        if (!(this.f5414g == null || this.f5414g.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5414g);
        }
        if (this.f5409a == 1) {
            b += CodedOutputByteBufferNano.d(3, this.f5411d);
        }
        if (this.f5409a == 2) {
            b += CodedOutputByteBufferNano.d(4) + 8;
        }
        if (this.f5409a == 3) {
            b += CodedOutputByteBufferNano.d(5) + 8;
        }
        if (this.f5415h != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f5415h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.as m5335b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x0018;
            case 24: goto L_0x001f;
            case 33: goto L_0x0053;
            case 41: goto L_0x0061;
            case 50: goto L_0x006f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.f();
        r6.f5410c = r0;
        r0 = 0;
        r6.f5409a = r0;
        goto L_0x0000;
    L_0x0018:
        r0 = r7.f();
        r6.f5414g = r0;
        goto L_0x0000;
    L_0x001f:
        r1 = 1;
        r6.f5409a = r1;
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x0048 }
        switch(r2) {
            case 0: goto L_0x0050;
            case 1: goto L_0x0050;
            case 2: goto L_0x0050;
            case 3: goto L_0x0050;
            case 4: goto L_0x0050;
            case 5: goto L_0x0050;
            case 6: goto L_0x0050;
            case 7: goto L_0x0050;
            case 8: goto L_0x0050;
            case 9: goto L_0x0050;
            case 10: goto L_0x0050;
            case 11: goto L_0x0050;
            case 12: goto L_0x0050;
            case 13: goto L_0x0050;
            case 14: goto L_0x0050;
            case 15: goto L_0x0050;
            case 16: goto L_0x0050;
            case 17: goto L_0x0050;
            case 18: goto L_0x0050;
            case 19: goto L_0x0050;
            case 20: goto L_0x0050;
            case 21: goto L_0x0050;
            default: goto L_0x002d;
        };	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x002d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r4 = " is not a valid enum ChecksumType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0048 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0048 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0050:
        r6.f5411d = r2;	 Catch:{ IllegalArgumentException -> 0x0048 }
        goto L_0x0000;
    L_0x0053:
        r0 = r7.l();
        r0 = java.lang.Double.longBitsToDouble(r0);
        r6.f5412e = r0;
        r0 = 2;
        r6.f5409a = r0;
        goto L_0x0000;
    L_0x0061:
        r0 = r7.l();
        r0 = java.lang.Double.longBitsToDouble(r0);
        r6.f5413f = r0;
        r0 = 3;
        r6.f5409a = r0;
        goto L_0x0000;
    L_0x006f:
        r0 = r6.f5415h;
        if (r0 != 0) goto L_0x007a;
    L_0x0073:
        r0 = new com.google.h.c.c.b.c.a.a;
        r0.<init>();
        r6.f5415h = r0;
    L_0x007a:
        r0 = r6.f5415h;
        r7.a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.as.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.as");
    }

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        return m5335b(aVar);
    }
}
