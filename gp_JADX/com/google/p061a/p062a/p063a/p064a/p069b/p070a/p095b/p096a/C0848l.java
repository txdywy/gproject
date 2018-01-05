package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0848l extends C0758b {
    public static volatile C0848l[] f5461b;
    public int f5462a;
    public int f5463c;
    public long f5464d;
    public C0854r f5465e;
    public C0849m f5466f;
    public C0853q f5467g;
    public C0855s f5468h;
    public C0850n f5469i;
    public C0852p f5470j;
    public C0851o f5471k;

    public static C0848l[] m5387a() {
        if (f5461b == null) {
            synchronized (h.b) {
                if (f5461b == null) {
                    f5461b = new C0848l[0];
                }
            }
        }
        return f5461b;
    }

    public final C0854r m5392c() {
        if (this.f5462a == 0) {
            return this.f5465e;
        }
        return null;
    }

    public final C0855s m5393d() {
        if (this.f5462a == 3) {
            return this.f5468h;
        }
        return null;
    }

    public final C0852p m5394e() {
        if (this.f5462a == 5) {
            return this.f5470j;
        }
        return null;
    }

    public C0848l() {
        this.f5462a = -1;
        this.f5463c = 0;
        this.f5464d = 0;
        this.f5462a = -1;
        this.f5465e = null;
        this.f5462a = -1;
        this.f5466f = null;
        this.f5462a = -1;
        this.f5467g = null;
        this.f5462a = -1;
        this.f5468h = null;
        this.f5462a = -1;
        this.f5469i = null;
        this.f5462a = -1;
        this.f5470j = null;
        this.f5462a = -1;
        this.f5471k = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5463c != 0) {
            codedOutputByteBufferNano.a(1, this.f5463c);
        }
        if (this.f5464d != 0) {
            codedOutputByteBufferNano.b(2, this.f5464d);
        }
        if (this.f5462a == 0) {
            codedOutputByteBufferNano.b(4, this.f5465e);
        }
        if (this.f5462a == 1) {
            codedOutputByteBufferNano.b(6, this.f5466f);
        }
        if (this.f5462a == 2) {
            codedOutputByteBufferNano.b(9, this.f5467g);
        }
        if (this.f5462a == 3) {
            codedOutputByteBufferNano.b(10, this.f5468h);
        }
        if (this.f5462a == 4) {
            codedOutputByteBufferNano.b(13, this.f5469i);
        }
        if (this.f5462a == 5) {
            codedOutputByteBufferNano.b(14, this.f5470j);
        }
        if (this.f5462a == 6) {
            codedOutputByteBufferNano.b(15, this.f5471k);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5463c != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5463c);
        }
        if (this.f5464d != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f5464d);
        }
        if (this.f5462a == 0) {
            b += CodedOutputByteBufferNano.d(4, this.f5465e);
        }
        if (this.f5462a == 1) {
            b += CodedOutputByteBufferNano.d(6, this.f5466f);
        }
        if (this.f5462a == 2) {
            b += CodedOutputByteBufferNano.d(9, this.f5467g);
        }
        if (this.f5462a == 3) {
            b += CodedOutputByteBufferNano.d(10, this.f5468h);
        }
        if (this.f5462a == 4) {
            b += CodedOutputByteBufferNano.d(13, this.f5469i);
        }
        if (this.f5462a == 5) {
            b += CodedOutputByteBufferNano.d(14, this.f5470j);
        }
        if (this.f5462a == 6) {
            return b + CodedOutputByteBufferNano.d(15, this.f5471k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0848l m5388b(com.google.protobuf.nano.a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x003f;
            case 34: goto L_0x0046;
            case 50: goto L_0x005a;
            case 74: goto L_0x006e;
            case 82: goto L_0x0083;
            case 106: goto L_0x0098;
            case 114: goto L_0x00ad;
            case 122: goto L_0x00c2;
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
            case 6: goto L_0x0019;
            case 7: goto L_0x003c;
            case 8: goto L_0x003c;
            case 9: goto L_0x003c;
            case 10: goto L_0x0019;
            case 11: goto L_0x003c;
            case 12: goto L_0x003c;
            case 13: goto L_0x0019;
            case 14: goto L_0x003c;
            case 15: goto L_0x003c;
            case 16: goto L_0x003c;
            case 17: goto L_0x0019;
            case 18: goto L_0x003c;
            case 19: goto L_0x003c;
            case 20: goto L_0x0019;
            case 21: goto L_0x0019;
            case 22: goto L_0x0019;
            case 23: goto L_0x003c;
            case 24: goto L_0x003c;
            case 25: goto L_0x003c;
            case 26: goto L_0x003c;
            case 27: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum ActionType";
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
        r6.f5463c = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.j();
        r6.f5464d = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r6.f5465e;
        if (r0 != 0) goto L_0x0051;
    L_0x004a:
        r0 = new com.google.a.a.a.a.b.a.b.a.r;
        r0.<init>();
        r6.f5465e = r0;
    L_0x0051:
        r0 = r6.f5465e;
        r7.a(r0);
        r0 = 0;
        r6.f5462a = r0;
        goto L_0x0000;
    L_0x005a:
        r0 = r6.f5466f;
        if (r0 != 0) goto L_0x0065;
    L_0x005e:
        r0 = new com.google.a.a.a.a.b.a.b.a.m;
        r0.<init>();
        r6.f5466f = r0;
    L_0x0065:
        r0 = r6.f5466f;
        r7.a(r0);
        r0 = 1;
        r6.f5462a = r0;
        goto L_0x0000;
    L_0x006e:
        r0 = r6.f5467g;
        if (r0 != 0) goto L_0x0079;
    L_0x0072:
        r0 = new com.google.a.a.a.a.b.a.b.a.q;
        r0.<init>();
        r6.f5467g = r0;
    L_0x0079:
        r0 = r6.f5467g;
        r7.a(r0);
        r0 = 2;
        r6.f5462a = r0;
        goto L_0x0000;
    L_0x0083:
        r0 = r6.f5468h;
        if (r0 != 0) goto L_0x008e;
    L_0x0087:
        r0 = new com.google.a.a.a.a.b.a.b.a.s;
        r0.<init>();
        r6.f5468h = r0;
    L_0x008e:
        r0 = r6.f5468h;
        r7.a(r0);
        r0 = 3;
        r6.f5462a = r0;
        goto L_0x0000;
    L_0x0098:
        r0 = r6.f5469i;
        if (r0 != 0) goto L_0x00a3;
    L_0x009c:
        r0 = new com.google.a.a.a.a.b.a.b.a.n;
        r0.<init>();
        r6.f5469i = r0;
    L_0x00a3:
        r0 = r6.f5469i;
        r7.a(r0);
        r0 = 4;
        r6.f5462a = r0;
        goto L_0x0000;
    L_0x00ad:
        r0 = r6.f5470j;
        if (r0 != 0) goto L_0x00b8;
    L_0x00b1:
        r0 = new com.google.a.a.a.a.b.a.b.a.p;
        r0.<init>();
        r6.f5470j = r0;
    L_0x00b8:
        r0 = r6.f5470j;
        r7.a(r0);
        r0 = 5;
        r6.f5462a = r0;
        goto L_0x0000;
    L_0x00c2:
        r0 = r6.f5471k;
        if (r0 != 0) goto L_0x00cd;
    L_0x00c6:
        r0 = new com.google.a.a.a.a.b.a.b.a.o;
        r0.<init>();
        r6.f5471k = r0;
    L_0x00cd:
        r0 = r6.f5471k;
        r7.a(r0);
        r0 = 6;
        r6.f5462a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.b.a.b.a.l.b(com.google.protobuf.nano.a):com.google.a.a.a.a.b.a.b.a.l");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5388b(aVar);
    }
}
