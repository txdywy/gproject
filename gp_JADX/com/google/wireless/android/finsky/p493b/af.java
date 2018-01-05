package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class af extends b {
    public int f36707a;
    public int f36708b;
    public String f36709c;
    public long f36710d;

    public af() {
        this.f36707a = 0;
        this.f36708b = 0;
        this.f36709c = "";
        this.f36710d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34820a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36707a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36708b);
        }
        if ((this.f36707a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36709c);
        }
        if ((this.f36707a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36710d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34821b() {
        int b = super.b();
        if ((this.f36707a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36708b);
        }
        if ((this.f36707a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36709c);
        }
        if ((this.f36707a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f36710d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p493b.af m34818b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 24: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36707a;
        r1 = r1 | 1;
        r6.f36707a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum TokenType";
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
        r6.f36708b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36707a;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36707a = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f36709c = r0;
        r0 = r6.f36707a;
        r0 = r0 | 2;
        r6.f36707a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33559c();
        r6.f36710d = r0;
        r0 = r6.f36707a;
        r0 = r0 | 4;
        r6.f36707a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.b.af.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.b.af");
    }

    public final /* synthetic */ i m34819a(C7213a c7213a) {
        return m34818b(c7213a);
    }
}
