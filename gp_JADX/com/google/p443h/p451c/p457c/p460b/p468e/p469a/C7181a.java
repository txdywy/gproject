package com.google.p443h.p451c.p457c.p460b.p468e.p469a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7181a extends b {
    public int f35030a;
    public C7182b f35031b;

    public C7181a() {
        this.f35030a = 0;
        this.f35031b = null;
        this.aP = -1;
    }

    public final void m32540a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35030a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35030a);
        }
        if (this.f35031b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35031b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32541b() {
        int b = super.b();
        if (this.f35030a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35030a);
        }
        if (this.f35031b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35031b);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p443h.p451c.p457c.p460b.p468e.p469a.C7181a m32538b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x003f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0034 }
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum TargetType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f35030a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r6.f35031b;
        if (r0 != 0) goto L_0x004a;
    L_0x0043:
        r0 = new com.google.h.c.c.b.e.a.b;
        r0.<init>();
        r6.f35031b = r0;
    L_0x004a:
        r0 = r6.f35031b;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h.c.c.b.e.a.a.b(com.google.protobuf.nano.a):com.google.h.c.c.b.e.a.a");
    }

    public final /* synthetic */ i m32539a(C7213a c7213a) {
        return m32538b(c7213a);
    }
}
