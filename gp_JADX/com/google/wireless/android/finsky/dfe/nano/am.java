package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7353i;

public final class am extends b {
    public int f38364a;
    public int f38365b;
    public String f38366c;
    public String f38367d;
    public C7353i f38368e;

    public am() {
        this.f38364a = 0;
        this.f38365b = 0;
        this.f38366c = "";
        this.f38367d = "";
        this.f38368e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36007a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38364a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38365b);
        }
        if (this.f38368e != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38368e);
        }
        if ((this.f38364a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38367d);
        }
        if ((this.f38364a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38366c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36008b() {
        int b = super.b();
        if ((this.f38364a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38365b);
        }
        if (this.f38368e != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38368e);
        }
        if ((this.f38364a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38367d);
        }
        if ((this.f38364a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f38366c);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.am m36005b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x005c;
            case 34: goto L_0x0069;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f38364a;
        r1 = r1 | 1;
        r6.f38364a = r1;
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
        r4 = 44;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum ResponseCode";
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
        r6.f38365b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f38364a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f38364a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f38368e;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.wireless.android.finsky.b.i;
        r0.<init>();
        r6.f38368e = r0;
    L_0x0056:
        r0 = r6.f38368e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x005c:
        r0 = r7.m33564f();
        r6.f38367d = r0;
        r0 = r6.f38364a;
        r0 = r0 | 4;
        r6.f38364a = r0;
        goto L_0x0000;
    L_0x0069:
        r0 = r7.m33564f();
        r6.f38366c = r0;
        r0 = r6.f38364a;
        r0 = r0 | 2;
        r6.f38364a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.am.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.am");
    }

    public final /* synthetic */ i m36006a(C7213a c7213a) {
        return m36005b(c7213a);
    }
}
