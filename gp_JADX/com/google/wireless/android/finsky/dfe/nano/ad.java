package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public int f38310a;
    public String f38311b;
    public String f38312c;
    public bd f38313d;
    public bd f38314e;
    public int f38315f;

    public ad() {
        this.f38310a = 0;
        this.f38311b = "";
        this.f38312c = "";
        this.f38313d = null;
        this.f38314e = null;
        this.f38315f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35977a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38310a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38311b);
        }
        if (this.f38313d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38313d);
        }
        if ((this.f38310a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38312c);
        }
        if (this.f38314e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f38314e);
        }
        if ((this.f38310a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38315f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35978b() {
        int b = super.b();
        if ((this.f38310a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38311b);
        }
        if (this.f38313d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38313d);
        }
        if ((this.f38310a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38312c);
        }
        if (this.f38314e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f38314e);
        }
        if ((this.f38310a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(6, this.f38315f);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.ad m35975b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 18: goto L_0x000e;
            case 26: goto L_0x001b;
            case 34: goto L_0x002c;
            case 42: goto L_0x0039;
            case 48: goto L_0x004a;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f38311b = r0;
        r0 = r6.f38310a;
        r0 = r0 | 1;
        r6.f38310a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r6.f38313d;
        if (r0 != 0) goto L_0x0026;
    L_0x001f:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f38313d = r0;
    L_0x0026:
        r0 = r6.f38313d;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x002c:
        r0 = r7.m33564f();
        r6.f38312c = r0;
        r0 = r6.f38310a;
        r0 = r0 | 2;
        r6.f38310a = r0;
        goto L_0x0000;
    L_0x0039:
        r0 = r6.f38314e;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new com.google.android.finsky.cv.a.bd;
        r0.<init>();
        r6.f38314e = r0;
    L_0x0044:
        r0 = r6.f38314e;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x004a:
        r1 = r6.f38310a;
        r1 = r1 | 4;
        r6.f38310a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0076 }
        switch(r2) {
            case 0: goto L_0x007e;
            case 1: goto L_0x007e;
            case 2: goto L_0x007e;
            default: goto L_0x005b;
        };	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x005b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r4 = 37;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0076 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0076 }
        r4 = " is not a valid enum Style";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0076 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0076 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0076 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0076:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x007e:
        r6.f38315f = r2;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r2 = r6.f38310a;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r2 = r2 | 4;
        r6.f38310a = r2;	 Catch:{ IllegalArgumentException -> 0x0076 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.ad.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.ad");
    }

    public final /* synthetic */ i m35976a(C7213a c7213a) {
        return m35975b(c7213a);
    }
}
