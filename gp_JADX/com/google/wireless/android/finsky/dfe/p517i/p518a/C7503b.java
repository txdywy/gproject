package com.google.wireless.android.finsky.dfe.p517i.p518a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7503b extends b {
    public int f38183a;
    public String f38184b;
    public int f38185c;

    public C7503b() {
        this.f38183a = 0;
        this.f38184b = "";
        this.f38185c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35877a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38183a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38184b);
        }
        if ((this.f38183a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38185c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35878b() {
        int b = super.b();
        if ((this.f38183a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38184b);
        }
        if ((this.f38183a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38185c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p517i.p518a.C7503b m35875b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f38184b = r0;
        r0 = r6.f38183a;
        r0 = r0 | 1;
        r6.f38183a = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f38183a;
        r1 = r1 | 2;
        r6.f38183a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f38185c = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f38183a;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f38183a = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.i.a.b.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.i.a.b");
    }

    public final /* synthetic */ i m35876a(C7213a c7213a) {
        return m35875b(c7213a);
    }
}
