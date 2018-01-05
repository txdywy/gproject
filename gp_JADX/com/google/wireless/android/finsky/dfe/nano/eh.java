package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eh extends b {
    public static volatile eh[] f38748a;
    public int f38749b;
    public int f38750c;
    public int f38751d;
    public boolean f38752e;

    public static eh[] m36328d() {
        if (f38748a == null) {
            synchronized (C7219h.f35465b) {
                if (f38748a == null) {
                    f38748a = new eh[0];
                }
            }
        }
        return f38748a;
    }

    public eh() {
        this.f38749b = 0;
        this.f38750c = 0;
        this.f38751d = 0;
        this.f38752e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36330a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38749b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38750c);
        }
        if ((this.f38749b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38751d);
        }
        if ((this.f38749b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f38752e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36331b() {
        int b = super.b();
        if ((this.f38749b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38750c);
        }
        if ((this.f38749b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f38751d);
        }
        if ((this.f38749b & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.eh m36327b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0089;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f38749b;
        r1 = r1 | 1;
        r6.f38749b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
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
        r6.f38750c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38749b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38749b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r1 = r6.f38749b;
        r1 = r1 | 2;
        r6.f38749b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0077 }
        switch(r2) {
            case 0: goto L_0x007f;
            case 1: goto L_0x007f;
            case 2: goto L_0x007f;
            case 3: goto L_0x007f;
            default: goto L_0x005c;
        };	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x005c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x007f:
        r6.f38751d = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r6.f38749b;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r2 | 2;
        r6.f38749b = r2;	 Catch:{ IllegalArgumentException -> 0x0077 }
        goto L_0x0000;
    L_0x0089:
        r0 = r7.m33563e();
        r6.f38752e = r0;
        r0 = r6.f38749b;
        r0 = r0 | 4;
        r6.f38749b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.eh.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.eh");
    }

    public final /* synthetic */ i m36329a(C7213a c7213a) {
        return m36327b(c7213a);
    }
}
