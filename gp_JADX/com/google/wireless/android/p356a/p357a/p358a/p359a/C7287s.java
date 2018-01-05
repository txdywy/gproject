package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7287s extends b {
    public static volatile C7287s[] f36134a;
    public int f36135b;
    public String f36136c;
    public int f36137d;

    public static C7287s[] m34444d() {
        if (f36134a == null) {
            synchronized (C7219h.f35465b) {
                if (f36134a == null) {
                    f36134a = new C7287s[0];
                }
            }
        }
        return f36134a;
    }

    public C7287s() {
        this.f36135b = 0;
        this.f36136c = "";
        this.f36137d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34446a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36135b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36136c);
        }
        if ((this.f36135b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36137d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34447b() {
        int b = super.b();
        if ((this.f36135b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36136c);
        }
        if ((this.f36135b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36137d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7287s m34443b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x001b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f36136c = r0;
        r0 = r6.f36135b;
        r0 = r0 | 1;
        r6.f36135b = r0;
        goto L_0x0000;
    L_0x001b:
        r1 = r6.f36135b;
        r1 = r1 | 2;
        r6.f36135b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0047 }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            default: goto L_0x002c;
        };	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x002c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = 41;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r4 = " is not a valid enum ErrorType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0047 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x004f:
        r6.f36137d = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r6.f36135b;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r2 = r2 | 2;
        r6.f36135b = r2;	 Catch:{ IllegalArgumentException -> 0x0047 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.s.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.s");
    }

    public final /* synthetic */ i m34445a(C7213a c7213a) {
        return m34443b(c7213a);
    }
}
