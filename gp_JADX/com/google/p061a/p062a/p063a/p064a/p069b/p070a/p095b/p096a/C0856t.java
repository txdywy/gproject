package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0856t extends C0758b {
    public static volatile C0856t[] f5483b;
    public int f5484a;
    public long f5485c;
    public int f5486d;
    public C0859w f5487e;
    public C0860x f5488f;
    public C0858v f5489g;
    public boolean f5490h;

    public static C0856t[] m5418a() {
        if (f5483b == null) {
            synchronized (h.b) {
                if (f5483b == null) {
                    f5483b = new C0856t[0];
                }
            }
        }
        return f5483b;
    }

    public final C0859w m5423c() {
        if (this.f5484a == 0) {
            return this.f5487e;
        }
        return null;
    }

    public C0856t() {
        this.f5484a = -1;
        this.f5485c = 0;
        this.f5486d = 0;
        this.f5484a = -1;
        this.f5487e = null;
        this.f5484a = -1;
        this.f5488f = null;
        this.f5484a = -1;
        this.f5489g = null;
        this.f5490h = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5485c != 0) {
            codedOutputByteBufferNano.b(1, this.f5485c);
        }
        if (this.f5484a == 0) {
            codedOutputByteBufferNano.b(2, this.f5487e);
        }
        if (this.f5486d != 0) {
            codedOutputByteBufferNano.a(3, this.f5486d);
        }
        if (this.f5490h) {
            codedOutputByteBufferNano.a(4, this.f5490h);
        }
        if (this.f5484a == 1) {
            codedOutputByteBufferNano.b(5, this.f5488f);
        }
        if (this.f5484a == 2) {
            codedOutputByteBufferNano.b(6, this.f5489g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5485c != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f5485c);
        }
        if (this.f5484a == 0) {
            b += CodedOutputByteBufferNano.d(2, this.f5487e);
        }
        if (this.f5486d != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f5486d);
        }
        if (this.f5490h) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if (this.f5484a == 1) {
            b += CodedOutputByteBufferNano.d(5, this.f5488f);
        }
        if (this.f5484a == 2) {
            return b + CodedOutputByteBufferNano.d(6, this.f5489g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0856t m5419b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x0015;
            case 24: goto L_0x0029;
            case 32: goto L_0x005a;
            case 42: goto L_0x0061;
            case 50: goto L_0x0075;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m4918a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.j();
        r6.f5485c = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r6.f5487e;
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = new com.google.a.a.a.a.b.a.b.a.w;
        r0.<init>();
        r6.f5487e = r0;
    L_0x0020:
        r0 = r6.f5487e;
        r7.a(r0);
        r0 = 0;
        r6.f5484a = r0;
        goto L_0x0000;
    L_0x0029:
        r1 = r7.o();
        r2 = r7.i();	 Catch:{ IllegalArgumentException -> 0x004f }
        switch(r2) {
            case 0: goto L_0x0057;
            case 1: goto L_0x0057;
            case 2: goto L_0x0057;
            case 3: goto L_0x0057;
            case 4: goto L_0x0057;
            case 5: goto L_0x0057;
            case 6: goto L_0x0057;
            case 7: goto L_0x0034;
            case 8: goto L_0x0057;
            case 9: goto L_0x0057;
            case 10: goto L_0x0057;
            default: goto L_0x0034;
        };	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x0034:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004f }
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x004f }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x004f }
        r4 = " is not a valid enum TriggerType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x004f }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x004f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x004f:
        r2 = move-exception;
        r7.e(r1);
        r6.m4918a(r7, r0);
        goto L_0x0000;
    L_0x0057:
        r6.f5486d = r2;	 Catch:{ IllegalArgumentException -> 0x004f }
        goto L_0x0000;
    L_0x005a:
        r0 = r7.e();
        r6.f5490h = r0;
        goto L_0x0000;
    L_0x0061:
        r0 = r6.f5488f;
        if (r0 != 0) goto L_0x006c;
    L_0x0065:
        r0 = new com.google.a.a.a.a.b.a.b.a.x;
        r0.<init>();
        r6.f5488f = r0;
    L_0x006c:
        r0 = r6.f5488f;
        r7.a(r0);
        r0 = 1;
        r6.f5484a = r0;
        goto L_0x0000;
    L_0x0075:
        r0 = r6.f5489g;
        if (r0 != 0) goto L_0x0080;
    L_0x0079:
        r0 = new com.google.a.a.a.a.b.a.b.a.v;
        r0.<init>();
        r6.f5489g = r0;
    L_0x0080:
        r0 = r6.f5489g;
        r7.a(r0);
        r0 = 2;
        r6.f5484a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.t.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.t");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5419b(aVar);
    }
}
