package com.google.p425d.p426a.p427a.p428a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p360b.p361a.C7295a;

public final class C7091a extends b {
    public int f34689a;
    public int f34690b;
    public com.google.wireless.android.b.a.b f34691c;
    public C7295a f34692d;

    public C7091a() {
        this.f34689a = 0;
        this.f34690b = 0;
        this.f34691c = null;
        this.f34692d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32225a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f34689a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34690b);
        }
        if (this.f34691c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f34691c);
        }
        if (this.f34692d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f34692d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32226b() {
        int b = super.b();
        if ((this.f34689a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34690b);
        }
        if (this.f34691c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f34691c);
        }
        if (this.f34692d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f34692d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p425d.p426a.p427a.p428a.C7091a m32223b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x005c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f34689a;
        r1 = r1 | 1;
        r6.f34689a = r1;
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
        r6.f34690b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f34689a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f34689a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f34691c;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.wireless.android.b.a.b;
        r0.<init>();
        r6.f34691c = r0;
    L_0x0056:
        r0 = r6.f34691c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x005c:
        r0 = r6.f34692d;
        if (r0 != 0) goto L_0x0067;
    L_0x0060:
        r0 = new com.google.wireless.android.b.a.a;
        r0.<init>();
        r6.f34692d = r0;
    L_0x0067:
        r0 = r6.f34692d;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.a.a.a.b(com.google.protobuf.nano.a):com.google.d.a.a.a.a");
    }

    public final /* synthetic */ i m32224a(C7213a c7213a) {
        return m32223b(c7213a);
    }
}
