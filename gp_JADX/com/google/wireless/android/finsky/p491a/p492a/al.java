package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class al extends b {
    public static volatile al[] f36367a;
    public int f36368b;
    public String f36369c;

    public static al[] m34639d() {
        if (f36367a == null) {
            synchronized (C7219h.f35465b) {
                if (f36367a == null) {
                    f36367a = new al[0];
                }
            }
        }
        return f36367a;
    }

    public al() {
        this.f36368b = 1;
        this.f36369c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34641a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36368b);
        codedOutputByteBufferNano.m33521a(2, this.f36369c);
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34642b() {
        return (super.b() + CodedOutputByteBufferNano.m33502d(1, this.f36368b)) + CodedOutputByteBufferNano.m33493b(2, this.f36369c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.al m34638b(com.google.protobuf.nano.C7213a r7) {
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
            case 1: goto L_0x003c;
            case 2: goto L_0x003c;
            case 3: goto L_0x003c;
            case 4: goto L_0x003c;
            case 5: goto L_0x003c;
            default: goto L_0x0019;
        };	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0019:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = 35;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = " is not a valid enum Key";
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
        r6.f36368b = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33564f();
        r6.f36369c = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.al.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.al");
    }

    public final /* synthetic */ i m34640a(C7213a c7213a) {
        return m34638b(c7213a);
    }
}
