package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7470u extends b {
    public int f37945a;
    public int f37946b;
    public int f37947c;

    public C7470u() {
        this.f37945a = -1;
        this.f37946b = 0;
        this.f37945a = -1;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35698a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37945a == 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37947c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35699b() {
        int b = super.b();
        if (this.f37945a == 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f37947c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p513g.p514a.C7470u m35696b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = 0;
        r6.f37945a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0037 }
        switch(r2) {
            case 0: goto L_0x003f;
            case 1: goto L_0x003f;
            case 2: goto L_0x003f;
            case 3: goto L_0x003f;
            case 4: goto L_0x003f;
            case 5: goto L_0x003f;
            default: goto L_0x001c;
        };	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x001c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r4 = " is not a valid enum RuleType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x0037:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003f:
        r6.f37947c = r2;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r6.f37946b;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r2 | 1;
        r6.f37946b = r2;	 Catch:{ IllegalArgumentException -> 0x0037 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.g.a.u.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.g.a.u");
    }

    public final /* synthetic */ i m35697a(C7213a c7213a) {
        return m35696b(c7213a);
    }
}
