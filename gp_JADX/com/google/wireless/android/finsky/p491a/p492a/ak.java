package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ak extends b {
    public static volatile ak[] f36362a;
    public int f36363b;
    public int f36364c;
    public String f36365d;
    public String f36366e;

    public static ak[] m34634d() {
        if (f36362a == null) {
            synchronized (C7219h.f35465b) {
                if (f36362a == null) {
                    f36362a = new ak[0];
                }
            }
        }
        return f36362a;
    }

    public ak() {
        this.f36363b = 0;
        this.f36364c = 0;
        this.f36365d = "";
        this.f36366e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34636a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36363b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36364c);
        }
        if ((this.f36363b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36365d);
        }
        if ((this.f36363b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36366e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34637b() {
        int b = super.b();
        if ((this.f36363b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36364c);
        }
        if ((this.f36363b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36365d);
        }
        if ((this.f36363b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f36366e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.ak m34633b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36363b;
        r1 = r1 | 1;
        r6.f36363b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            case 6: goto L_0x0042;
            case 7: goto L_0x0042;
            case 8: goto L_0x0042;
            case 9: goto L_0x0042;
            case 10: goto L_0x001f;
            case 11: goto L_0x001f;
            case 12: goto L_0x001f;
            case 13: goto L_0x001f;
            case 14: goto L_0x001f;
            case 15: goto L_0x001f;
            case 16: goto L_0x001f;
            case 17: goto L_0x001f;
            case 18: goto L_0x001f;
            case 19: goto L_0x001f;
            case 20: goto L_0x0042;
            case 21: goto L_0x0042;
            case 22: goto L_0x0042;
            case 23: goto L_0x0042;
            case 24: goto L_0x0042;
            case 25: goto L_0x0042;
            case 26: goto L_0x0042;
            case 27: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum DisabledReason";
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
        r6.f36364c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36363b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36363b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f36365d = r0;
        r0 = r6.f36363b;
        r0 = r0 | 2;
        r6.f36363b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f36366e = r0;
        r0 = r6.f36363b;
        r0 = r0 | 4;
        r6.f36363b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.ak.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.ak");
    }

    public final /* synthetic */ i m34635a(C7213a c7213a) {
        return m34633b(c7213a);
    }
}
