package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7400n extends b {
    public static volatile C7400n[] f36959a;
    public int f36960b;
    public int f36961c;
    public String f36962d;

    public static C7400n[] m35022d() {
        if (f36959a == null) {
            synchronized (C7219h.f35465b) {
                if (f36959a == null) {
                    f36959a = new C7400n[0];
                }
            }
        }
        return f36959a;
    }

    public C7400n() {
        this.f36960b = 0;
        this.f36961c = 0;
        this.f36962d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35024a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36960b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36961c);
        }
        if ((this.f36960b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36962d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35025b() {
        int b = super.b();
        if ((this.f36960b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36961c);
        }
        if ((this.f36960b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36962d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p496a.p497a.C7400n m35021b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36960b;
        r1 = r1 | 1;
        r6.f36960b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Id";
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
        r6.f36961c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36960b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36960b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f36962d = r0;
        r0 = r6.f36960b;
        r0 = r0 | 2;
        r6.f36960b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.a.a.n.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.a.a.n");
    }

    public final /* synthetic */ i m35023a(C7213a c7213a) {
        return m35021b(c7213a);
    }
}
