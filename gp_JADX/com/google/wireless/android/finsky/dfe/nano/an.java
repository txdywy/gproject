package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7345a;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class an extends b {
    public int f38369a;
    public C7367w f38370b;
    public C7345a f38371c;

    public an() {
        this.f38369a = 1;
        this.f38370b = null;
        this.f38371c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36011a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f38369a);
        if (this.f38370b != null) {
            codedOutputByteBufferNano.m33532b(6, this.f38370b);
        }
        if (this.f38371c != null) {
            codedOutputByteBufferNano.m33532b(8, this.f38371c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36012b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f38369a);
        if (this.f38370b != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f38370b);
        }
        if (this.f38371c != null) {
            return b + CodedOutputByteBufferNano.m33503d(8, this.f38371c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.an m36009b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 50: goto L_0x003f;
            case 66: goto L_0x0050;
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
            case 1: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum Status";
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
        r6.f38369a = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r6.f38370b;
        if (r0 != 0) goto L_0x004a;
    L_0x0043:
        r0 = new com.google.wireless.android.finsky.b.w;
        r0.<init>();
        r6.f38370b = r0;
    L_0x004a:
        r0 = r6.f38370b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0050:
        r0 = r6.f38371c;
        if (r0 != 0) goto L_0x005b;
    L_0x0054:
        r0 = new com.google.wireless.android.finsky.b.a;
        r0.<init>();
        r6.f38371c = r0;
    L_0x005b:
        r0 = r6.f38371c;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.an.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.an");
    }

    public final /* synthetic */ i m36010a(C7213a c7213a) {
        return m36009b(c7213a);
    }
}
