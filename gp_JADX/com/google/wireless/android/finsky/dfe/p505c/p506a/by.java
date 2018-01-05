package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class by extends b {
    public int f37262a;
    public bl f37263b;
    public String f37264c;
    public int f37265d;

    public by() {
        this.f37262a = 0;
        this.f37263b = null;
        this.f37264c = "";
        this.f37265d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35237a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37263b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37263b);
        }
        if ((this.f37262a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37264c);
        }
        if ((this.f37262a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37265d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35238b() {
        int b = super.b();
        if (this.f37263b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37263b);
        }
        if ((this.f37262a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37264c);
        }
        if ((this.f37262a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f37265d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.by m35235b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001f;
            case 24: goto L_0x002c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f37263b;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.bl;
        r0.<init>();
        r6.f37263b = r0;
    L_0x0019:
        r0 = r6.f37263b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r7.m33564f();
        r6.f37264c = r0;
        r0 = r6.f37262a;
        r0 = r0 | 1;
        r6.f37262a = r0;
        goto L_0x0000;
    L_0x002c:
        r1 = r6.f37262a;
        r1 = r1 | 2;
        r6.f37262a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0058 }
        switch(r2) {
            case 0: goto L_0x0060;
            case 1: goto L_0x0060;
            default: goto L_0x003d;
        };	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x003d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0058:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0060:
        r6.f37265d = r2;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r6.f37262a;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r2 | 2;
        r6.f37262a = r2;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.by.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.by");
    }

    public final /* synthetic */ i m35236a(C7213a c7213a) {
        return m35235b(c7213a);
    }
}
