package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ka;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fs extends b {
    public static volatile fs[] f39012a;
    public int f39013b;
    public int f39014c;
    public byte[] f39015d;
    public String f39016e;
    public ka f39017f;

    public static fs[] m36450d() {
        if (f39012a == null) {
            synchronized (C7219h.f35465b) {
                if (f39012a == null) {
                    f39012a = new fs[0];
                }
            }
        }
        return f39012a;
    }

    public fs() {
        this.f39013b = 0;
        this.f39014c = 0;
        this.f39015d = C7222l.f35479l;
        this.f39016e = "";
        this.f39017f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36452a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39013b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f39014c);
        }
        if ((this.f39013b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f39015d);
        }
        if (this.f39017f != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39017f);
        }
        if ((this.f39013b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39016e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36453b() {
        int b = super.b();
        if ((this.f39013b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39014c);
        }
        if ((this.f39013b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f39015d);
        }
        if (this.f39017f != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39017f);
        }
        if ((this.f39013b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f39016e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.fs m36449b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0069;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f39013b;
        r1 = r1 | 1;
        r6.f39013b = r1;
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
        r6.f39014c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f39013b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f39013b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33565g();
        r6.f39015d = r0;
        r0 = r6.f39013b;
        r0 = r0 | 2;
        r6.f39013b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r6.f39017f;
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new com.google.android.finsky.cv.a.ka;
        r0.<init>();
        r6.f39017f = r0;
    L_0x0063:
        r0 = r6.f39017f;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0069:
        r0 = r7.m33564f();
        r6.f39016e = r0;
        r0 = r6.f39013b;
        r0 = r0 | 4;
        r6.f39013b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.fs.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.fs");
    }

    public final /* synthetic */ i m36451a(C7213a c7213a) {
        return m36449b(c7213a);
    }
}
