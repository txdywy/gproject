package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class az extends b {
    public int f36441a;
    public int f36442b;
    public at f36443c;
    public bg f36444d;
    public ba f36445e;

    public az() {
        this.f36441a = 0;
        this.f36442b = 32;
        this.f36443c = null;
        this.f36444d = null;
        this.f36445e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34687a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36441a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36442b);
        }
        if (this.f36443c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36443c);
        }
        if (this.f36444d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36444d);
        }
        if (this.f36445e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36445e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34688b() {
        int b = super.b();
        if ((this.f36441a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36442b);
        }
        if (this.f36443c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f36443c);
        }
        if (this.f36444d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36444d);
        }
        if (this.f36445e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f36445e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.az m34685b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x005c;
            case 34: goto L_0x006d;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36441a;
        r1 = r1 | 1;
        r6.f36441a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 32: goto L_0x0042;
            case 33: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 47;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum StoredValueType";
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
        r6.f36442b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36441a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36441a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r6.f36443c;
        if (r0 != 0) goto L_0x0056;
    L_0x004f:
        r0 = new com.google.wireless.android.finsky.a.a.at;
        r0.<init>();
        r6.f36443c = r0;
    L_0x0056:
        r0 = r6.f36443c;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x005c:
        r0 = r6.f36444d;
        if (r0 != 0) goto L_0x0067;
    L_0x0060:
        r0 = new com.google.wireless.android.finsky.a.a.bg;
        r0.<init>();
        r6.f36444d = r0;
    L_0x0067:
        r0 = r6.f36444d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x006d:
        r0 = r6.f36445e;
        if (r0 != 0) goto L_0x0078;
    L_0x0071:
        r0 = new com.google.wireless.android.finsky.a.a.ba;
        r0.<init>();
        r6.f36445e = r0;
    L_0x0078:
        r0 = r6.f36445e;
        r7.m33552a(r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.az.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.az");
    }

    public final /* synthetic */ i m34686a(C7213a c7213a) {
        return m34685b(c7213a);
    }
}
