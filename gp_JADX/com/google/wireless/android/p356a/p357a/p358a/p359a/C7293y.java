package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7293y extends b {
    public static volatile C7293y[] f36175a;
    public int f36176b;
    public int f36177c;
    public long f36178d;
    public int f36179e;

    public static C7293y[] m34493d() {
        if (f36175a == null) {
            synchronized (C7219h.f35465b) {
                if (f36175a == null) {
                    f36175a = new C7293y[0];
                }
            }
        }
        return f36175a;
    }

    public final C7293y m34495a(int i) {
        this.f36179e = i;
        this.f36176b |= 4;
        return this;
    }

    public C7293y() {
        this.f36176b = 0;
        this.f36177c = 1;
        this.f36178d = 0;
        this.f36179e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34496a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36176b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36177c);
        }
        if ((this.f36176b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36178d);
        }
        if ((this.f36176b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f36179e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34497b() {
        int b = super.b();
        if ((this.f36176b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36177c);
        }
        if ((this.f36176b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36178d);
        }
        if ((this.f36176b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f36179e);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7293y m34492b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 16: goto L_0x004b;
            case 24: goto L_0x0058;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r6.f36176b;
        r1 = r1 | 1;
        r6.f36176b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x003a }
        switch(r2) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0042;
            default: goto L_0x001f;
        };	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x001f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003a }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4 = " is not a valid enum DataProviderType";
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
        r6.f36177c = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r6.f36176b;	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = r2 | 1;
        r6.f36176b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x004b:
        r0 = r7.m33559c();
        r6.f36178d = r0;
        r0 = r6.f36176b;
        r0 = r0 | 2;
        r6.f36176b = r0;
        goto L_0x0000;
    L_0x0058:
        r1 = r6.f36176b;
        r1 = r1 | 4;
        r6.f36176b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = com.google.wireless.android.p356a.p357a.p358a.p359a.cx.m34381a(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r6.f36179e = r2;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r6.f36176b;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r2 | 4;
        r6.f36176b = r2;	 Catch:{ IllegalArgumentException -> 0x0073 }
        goto L_0x0000;
    L_0x0073:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.y.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.y");
    }

    public final /* synthetic */ i m34494a(C7213a c7213a) {
        return m34492b(c7213a);
    }
}
