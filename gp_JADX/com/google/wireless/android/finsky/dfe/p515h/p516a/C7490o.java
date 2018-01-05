package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7490o extends b {
    public static volatile C7490o[] f38115a;
    public int f38116b;
    public int f38117c;
    public cv f38118d;

    public static C7490o[] m35829d() {
        if (f38115a == null) {
            synchronized (C7219h.f35465b) {
                if (f38115a == null) {
                    f38115a = new C7490o[0];
                }
            }
        }
        return f38115a;
    }

    public C7490o() {
        this.f38116b = 0;
        this.f38117c = 0;
        this.f38118d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35831a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38116b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38117c);
        }
        if (this.f38118d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38118d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35832b() {
        int b = super.b();
        if ((this.f38116b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38117c);
        }
        if (this.f38118d != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f38118d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.C7490o m35828b(com.google.protobuf.nano.C7213a r7) {
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
        r1 = r6.f38116b;
        r1 = r1 | 1;
        r6.f38116b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            case 5: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Role";
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
        r6.f38117c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38116b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38116b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f38118d;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.android.finsky.cv.a.cv;
        r0.<init>();
        r6.f38118d = r0;
    L_0x0056:
        r0 = r6.f38118d;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.o.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.o");
    }

    public final /* synthetic */ i m35830a(C7213a c7213a) {
        return m35828b(c7213a);
    }
}
