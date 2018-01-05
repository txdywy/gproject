package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class al extends b {
    public static volatile al[] f38044a;
    public int f38045b;
    public int f38046c;
    public String f38047d;

    public static al[] m35756d() {
        if (f38044a == null) {
            synchronized (C7219h.f35465b) {
                if (f38044a == null) {
                    f38044a = new al[0];
                }
            }
        }
        return f38044a;
    }

    public al() {
        this.f38045b = 0;
        this.f38046c = 0;
        this.f38047d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35758a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38045b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38046c);
        }
        if ((this.f38045b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38047d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35759b() {
        int b = super.b();
        if ((this.f38045b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38046c);
        }
        if ((this.f38045b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38047d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.al m35755b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f38045b;
        r1 = r1 | 1;
        r6.f38045b = r1;
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
            case 10: goto L_0x0042;
            case 11: goto L_0x0042;
            case 12: goto L_0x0042;
            case 13: goto L_0x0042;
            case 14: goto L_0x0042;
            case 15: goto L_0x0042;
            case 16: goto L_0x0042;
            case 17: goto L_0x0042;
            case 18: goto L_0x0042;
            case 19: goto L_0x0042;
            case 20: goto L_0x0042;
            case 21: goto L_0x001f;
            case 22: goto L_0x0042;
            case 23: goto L_0x0042;
            case 24: goto L_0x0042;
            case 25: goto L_0x0042;
            case 26: goto L_0x0042;
            case 27: goto L_0x0042;
            case 28: goto L_0x0042;
            case 29: goto L_0x0042;
            case 30: goto L_0x0042;
            case 31: goto L_0x0042;
            case 32: goto L_0x0042;
            case 33: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum TextId";
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
        r6.f38046c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38045b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38045b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f38047d = r0;
        r0 = r6.f38045b;
        r0 = r0 | 2;
        r6.f38045b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.al.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.al");
    }

    public final /* synthetic */ i m35757a(C7213a c7213a) {
        return m35755b(c7213a);
    }
}
