package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bn extends b {
    public static volatile bn[] f38462a;
    public int f38463b;
    public int f38464c;
    public String f38465d;
    public String f38466e;
    public int f38467f;
    public byte[] f38468g;

    public static bn[] m36092d() {
        if (f38462a == null) {
            synchronized (C7219h.f35465b) {
                if (f38462a == null) {
                    f38462a = new bn[0];
                }
            }
        }
        return f38462a;
    }

    public bn() {
        this.f38463b = 0;
        this.f38464c = 0;
        this.f38465d = "";
        this.f38466e = "";
        this.f38467f = 0;
        this.f38468g = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36094a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38463b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38464c);
        }
        if ((this.f38463b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38465d);
        }
        if ((this.f38463b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38466e);
        }
        if ((this.f38463b & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38467f);
        }
        if ((this.f38463b & 16) != 0) {
            codedOutputByteBufferNano.m33523a(5, this.f38468g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36095b() {
        int b = super.b();
        if ((this.f38463b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38464c);
        }
        if ((this.f38463b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38465d);
        }
        if ((this.f38463b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38466e);
        }
        if ((this.f38463b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f38467f);
        }
        if ((this.f38463b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(5, this.f38468g);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.bn m36091b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 32: goto L_0x0065;
            case 42: goto L_0x00a4;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f38463b;
        r1 = r1 | 1;
        r6.f38463b = r1;
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
        r6.f38464c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38463b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38463b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f38465d = r0;
        r0 = r6.f38463b;
        r0 = r0 | 2;
        r6.f38463b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f38466e = r0;
        r0 = r6.f38463b;
        r0 = r0 | 4;
        r6.f38463b = r0;
        goto L_0x0000;
    L_0x0065:
        r1 = r6.f38463b;
        r1 = r1 | 8;
        r6.f38463b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0091 }
        switch(r2) {
            case 0: goto L_0x009a;
            case 1: goto L_0x009a;
            case 2: goto L_0x009a;
            default: goto L_0x0076;
        };	 Catch:{ IllegalArgumentException -> 0x0091 }
    L_0x0076:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0091 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0091 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0091 }
    L_0x0091:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x009a:
        r6.f38467f = r2;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r6.f38463b;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = r2 | 8;
        r6.f38463b = r2;	 Catch:{ IllegalArgumentException -> 0x0091 }
        goto L_0x0000;
    L_0x00a4:
        r0 = r7.m33565g();
        r6.f38468g = r0;
        r0 = r6.f38463b;
        r0 = r0 | 16;
        r6.f38463b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.bn.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.bn");
    }

    public final /* synthetic */ i m36093a(C7213a c7213a) {
        return m36091b(c7213a);
    }
}
