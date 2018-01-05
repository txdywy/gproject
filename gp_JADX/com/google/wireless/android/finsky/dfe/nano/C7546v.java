package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.bg;

public final class C7546v extends b {
    public static volatile C7546v[] f39224a;
    public int f39225b;
    public String f39226c;
    public int f39227d;
    public String f39228e;
    public bd f39229f;
    public byte[] f39230g;
    public String f39231h;
    public String f39232i;
    public bg f39233j;
    public byte[] f39234k;
    public int f39235l;

    public static C7546v[] m36590d() {
        if (f39224a == null) {
            synchronized (C7219h.f35465b) {
                if (f39224a == null) {
                    f39224a = new C7546v[0];
                }
            }
        }
        return f39224a;
    }

    public C7546v() {
        this.f39225b = 0;
        this.f39226c = "";
        this.f39227d = 0;
        this.f39228e = "";
        this.f39229f = null;
        this.f39230g = C7222l.f35479l;
        this.f39231h = "";
        this.f39232i = "";
        this.f39233j = null;
        this.f39234k = C7222l.f35479l;
        this.f39235l = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36592a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39225b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f39227d);
        }
        if ((this.f39225b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39228e);
        }
        if ((this.f39225b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39232i);
        }
        if (this.f39233j != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39233j);
        }
        if ((this.f39225b & 64) != 0) {
            codedOutputByteBufferNano.m33523a(7, this.f39234k);
        }
        if (this.f39229f != null) {
            codedOutputByteBufferNano.m33532b(8, this.f39229f);
        }
        if ((this.f39225b & 8) != 0) {
            codedOutputByteBufferNano.m33523a(9, this.f39230g);
        }
        if ((this.f39225b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f39231h);
        }
        if ((this.f39225b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(11, this.f39226c);
        }
        if ((this.f39225b & 128) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f39235l);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36593b() {
        int b = super.b();
        if ((this.f39225b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39227d);
        }
        if ((this.f39225b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39228e);
        }
        if ((this.f39225b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39232i);
        }
        if (this.f39233j != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39233j);
        }
        if ((this.f39225b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33494b(7, this.f39234k);
        }
        if (this.f39229f != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f39229f);
        }
        if ((this.f39225b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33494b(9, this.f39230g);
        }
        if ((this.f39225b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f39231h);
        }
        if ((this.f39225b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f39226c);
        }
        if ((this.f39225b & 128) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(12, this.f39235l);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.C7546v m36589b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x004b;
            case 26: goto L_0x0058;
            case 34: goto L_0x0065;
            case 58: goto L_0x0076;
            case 66: goto L_0x0084;
            case 74: goto L_0x0096;
            case 82: goto L_0x00a4;
            case 90: goto L_0x00b2;
            case 96: goto L_0x00c0;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f39225b;
        r1 = r1 | 2;
        r6.f39225b = r1;
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
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 36;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum Type";
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
        r6.f39227d = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f39225b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 2;
        r6.f39225b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33564f();
        r6.f39228e = r0;
        r0 = r6.f39225b;
        r0 = r0 | 4;
        r6.f39225b = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.m33564f();
        r6.f39232i = r0;
        r0 = r6.f39225b;
        r0 = r0 | 32;
        r6.f39225b = r0;
        goto L_0x0000;
    L_0x0065:
        r0 = r6.f39233j;
        if (r0 != 0) goto L_0x0070;
    L_0x0069:
        r0 = new com.google.wireless.android.finsky.a.a.bg;
        r0.<init>();
        r6.f39233j = r0;
    L_0x0070:
        r0 = r6.f39233j;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0076:
        r0 = r7.m33565g();
        r6.f39234k = r0;
        r0 = r6.f39225b;
        r0 = r0 | 64;
        r6.f39225b = r0;
        goto L_0x0000;
    L_0x0084:
        r0 = r6.f39229f;
        if (r0 != 0) goto L_0x008f;
    L_0x0088:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f39229f = r0;
    L_0x008f:
        r0 = r6.f39229f;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0096:
        r0 = r7.m33565g();
        r6.f39230g = r0;
        r0 = r6.f39225b;
        r0 = r0 | 8;
        r6.f39225b = r0;
        goto L_0x0000;
    L_0x00a4:
        r0 = r7.m33564f();
        r6.f39231h = r0;
        r0 = r6.f39225b;
        r0 = r0 | 16;
        r6.f39225b = r0;
        goto L_0x0000;
    L_0x00b2:
        r0 = r7.m33564f();
        r6.f39226c = r0;
        r0 = r6.f39225b;
        r0 = r0 | 1;
        r6.f39225b = r0;
        goto L_0x0000;
    L_0x00c0:
        r1 = r6.f39225b;
        r1 = r1 | 128;
        r6.f39225b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x00ec }
        switch(r2) {
            case 0: goto L_0x00f5;
            case 1: goto L_0x00f5;
            case 2: goto L_0x00f5;
            case 3: goto L_0x00f5;
            case 4: goto L_0x00f5;
            case 5: goto L_0x00f5;
            case 6: goto L_0x00f5;
            case 7: goto L_0x00f5;
            default: goto L_0x00d1;
        };	 Catch:{ IllegalArgumentException -> 0x00ec }
    L_0x00d1:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00ec }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ec }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ec }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00ec }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00ec }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00ec }
    L_0x00ec:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00f5:
        r6.f39235l = r2;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r2 = r6.f39225b;	 Catch:{ IllegalArgumentException -> 0x00ec }
        r2 = r2 | 128;
        r6.f39225b = r2;	 Catch:{ IllegalArgumentException -> 0x00ec }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.v.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.v");
    }

    public final /* synthetic */ i m36591a(C7213a c7213a) {
        return m36589b(c7213a);
    }
}
