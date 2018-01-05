package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7375e extends b {
    public static volatile C7375e[] f36862a;
    public int f36863b;
    public int f36864c;
    public int f36865d;
    public int f36866e;

    public static C7375e[] m34937d() {
        if (f36862a == null) {
            synchronized (C7219h.f35465b) {
                if (f36862a == null) {
                    f36862a = new C7375e[0];
                }
            }
        }
        return f36862a;
    }

    public C7375e() {
        this.f36863b = 0;
        this.f36864c = 0;
        this.f36865d = 0;
        this.f36866e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34939a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36863b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36864c);
        }
        if ((this.f36863b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36865d);
        }
        if ((this.f36863b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f36866e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34940b() {
        int b = super.b();
        if ((this.f36863b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36864c);
        }
        if ((this.f36863b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36865d);
        }
        if ((this.f36863b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f36866e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p494c.p495a.C7375e m34936b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36863b;
        r1 = r1 | 1;
        r6.f36863b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Size";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x003a }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r6.f36864c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36863b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36863b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33560d();
        r6.f36865d = r0;
        r0 = r6.f36863b;
        r0 = r0 | 2;
        r6.f36863b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33560d();
        r6.f36866e = r0;
        r0 = r6.f36863b;
        r0 = r0 | 4;
        r6.f36863b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.c.a.e.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.c.a.e");
    }

    public final /* synthetic */ i m34938a(C7213a c7213a) {
        return m34936b(c7213a);
    }
}
