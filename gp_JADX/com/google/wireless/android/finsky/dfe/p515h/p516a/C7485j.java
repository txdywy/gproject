package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7485j extends b {
    public int f38096a;
    public int f38097b;
    public C7482g f38098c;
    public long f38099d;
    public int f38100e;

    public C7485j() {
        this.f38096a = 0;
        this.f38097b = 0;
        this.f38098c = null;
        this.f38099d = 0;
        this.f38100e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35808a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38096a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38097b);
        }
        if (this.f38098c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38098c);
        }
        if ((this.f38096a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f38099d);
        }
        if ((this.f38096a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38100e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35809b() {
        int b = super.b();
        if ((this.f38096a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38097b);
        }
        if (this.f38098c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38098c);
        }
        if ((this.f38096a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f38099d);
        }
        if ((this.f38096a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f38100e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p515h.p516a.C7485j m35806b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 24: goto L_0x005c;
            case 32: goto L_0x0069;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f38096a;
        r1 = r1 | 1;
        r6.f38096a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            case 4: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 54;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum FamilyMembershipStatus";
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
        r6.f38097b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38096a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38096a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f38098c;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.wireless.android.finsky.dfe.h.a.g;
        r0.<init>();
        r6.f38098c = r0;
    L_0x0056:
        r0 = r6.f38098c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x005c:
        r0 = r7.m33559c();
        r6.f38099d = r0;
        r0 = r6.f38096a;
        r0 = r0 | 2;
        r6.f38096a = r0;
        goto L_0x0000;
    L_0x0069:
        r1 = r6.f38096a;
        r1 = r1 | 4;
        r6.f38096a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0095 }
        switch(r2) {
            case 0: goto L_0x009e;
            case 1: goto L_0x009e;
            case 2: goto L_0x009e;
            case 3: goto L_0x009e;
            default: goto L_0x007a;
        };	 Catch:{ IllegalArgumentException -> 0x0095 }
    L_0x007a:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r4 = 52;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0095 }
        r4 = " is not a valid enum FamilyInactiveReason";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0095 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0095 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0095 }
    L_0x0095:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x009e:
        r6.f38100e = r2;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r6.f38096a;	 Catch:{ IllegalArgumentException -> 0x0095 }
        r2 = r2 | 4;
        r6.f38096a = r2;	 Catch:{ IllegalArgumentException -> 0x0095 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.h.a.j.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.h.a.j");
    }

    public final /* synthetic */ i m35807a(C7213a c7213a) {
        return m35806b(c7213a);
    }
}
