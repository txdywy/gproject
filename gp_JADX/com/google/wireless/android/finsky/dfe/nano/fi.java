package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.es;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fi extends b {
    public int f38919a;
    public String f38920b;
    public es f38921c;
    public int f38922d;

    public fi() {
        this.f38919a = 0;
        this.f38920b = "";
        this.f38921c = null;
        this.f38922d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36421a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38919a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38920b);
        }
        if (this.f38921c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38921c);
        }
        if ((this.f38919a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38922d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36422b() {
        int b = super.b();
        if ((this.f38919a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38920b);
        }
        if (this.f38921c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38921c);
        }
        if ((this.f38919a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f38922d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.fi m36419b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x002c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f38920b = r0;
        r0 = r6.f38919a;
        r0 = r0 | 1;
        r6.f38919a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f38921c;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.android.finsky.cv.a.es;
        r0.<init>();
        r6.f38921c = r0;
    L_0x0026:
        r0 = r6.f38921c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x002c:
        r1 = r6.f38919a;
        r1 = r1 | 2;
        r6.f38919a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0058 }
        switch(r2) {
            case 0: goto L_0x0060;
            case 1: goto L_0x0060;
            case 2: goto L_0x0060;
            case 3: goto L_0x0060;
            default: goto L_0x003d;
        };	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x003d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = " is not a valid enum Status";
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
        r6.f38922d = r2;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r6.f38919a;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r2 | 2;
        r6.f38919a = r2;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.fi.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.fi");
    }

    public final /* synthetic */ i m36420a(C7213a c7213a) {
        return m36419b(c7213a);
    }
}
