package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eh extends b {
    public int f37560a;
    public int f37561b;
    public int f37562c;
    public String f37563d;
    public eg f37564e;

    public eh() {
        this.f37560a = -1;
        this.f37561b = 0;
        this.f37560a = -1;
        this.f37560a = -1;
        this.f37563d = "";
        this.f37564e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35456a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37560a == 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37562c);
        }
        if (this.f37560a == 1) {
            codedOutputByteBufferNano.m33521a(2, this.f37563d);
        }
        if (this.f37564e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37564e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35457b() {
        int b = super.b();
        if (this.f37560a == 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37562c);
        }
        if (this.f37560a == 1) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37563d);
        }
        if (this.f37564e != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37564e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p505c.p506a.eh m35454b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x0048;
            case 26: goto L_0x0052;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = 0;
        r6.f37560a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0037 }
        switch(r2) {
            case 0: goto L_0x003f;
            case 1: goto L_0x003f;
            case 2: goto L_0x003f;
            case 3: goto L_0x003f;
            case 4: goto L_0x003f;
            case 5: goto L_0x003f;
            case 6: goto L_0x003f;
            case 7: goto L_0x003f;
            case 8: goto L_0x003f;
            case 9: goto L_0x003f;
            case 10: goto L_0x003f;
            case 11: goto L_0x003f;
            case 12: goto L_0x003f;
            case 13: goto L_0x003f;
            case 14: goto L_0x003f;
            case 15: goto L_0x003f;
            case 16: goto L_0x003f;
            case 17: goto L_0x003f;
            case 18: goto L_0x003f;
            case 19: goto L_0x003f;
            default: goto L_0x001c;
        };	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x001c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r4 = " is not a valid enum ResourceId";
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
        r6.f37562c = r2;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r6.f37561b;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r2 | 1;
        r6.f37561b = r2;	 Catch:{ IllegalArgumentException -> 0x0037 }
        goto L_0x0000;
    L_0x0048:
        r0 = r7.m33564f();
        r6.f37563d = r0;
        r0 = 1;
        r6.f37560a = r0;
        goto L_0x0000;
    L_0x0052:
        r0 = r6.f37564e;
        if (r0 != 0) goto L_0x005d;
    L_0x0056:
        r0 = new com.google.wireless.android.finsky.dfe.c.a.eg;
        r0.<init>();
        r6.f37564e = r0;
    L_0x005d:
        r0 = r6.f37564e;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.c.a.eh.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.c.a.eh");
    }

    public final /* synthetic */ i m35455a(C7213a c7213a) {
        return m35454b(c7213a);
    }
}
