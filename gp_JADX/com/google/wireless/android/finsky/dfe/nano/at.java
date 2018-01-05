package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.ad;

public final class at extends b {
    public int f38384a;
    public int f38385b;
    public String f38386c;
    public String f38387d;
    public ad[] f38388e;

    public at() {
        this.f38384a = 0;
        this.f38385b = 0;
        this.f38386c = "";
        this.f38387d = "";
        this.f38388e = ad.m34609d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36030a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f38385b);
        if ((this.f38384a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38386c);
        }
        if ((this.f38384a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38387d);
        }
        if (this.f38388e != null && this.f38388e.length > 0) {
            for (i iVar : this.f38388e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36031b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f38385b);
        if ((this.f38384a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38386c);
        }
        if ((this.f38384a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38387d);
        }
        if (this.f38388e == null || this.f38388e.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f38388e) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(4, iVar);
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.nano.at m36028b(com.google.protobuf.nano.C7213a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.m33550a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 18: goto L_0x0040;
            case 26: goto L_0x004d;
            case 34: goto L_0x005a;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.m33573o();
        r3 = r8.m33567i();	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r3) {
            case 0: goto L_0x003d;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 38;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum Result";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r3 = move-exception;
        r8.m33562e(r2);
        r7.a(r8, r0);
        goto L_0x0001;
    L_0x003d:
        r7.f38385b = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0040:
        r0 = r8.m33564f();
        r7.f38386c = r0;
        r0 = r7.f38384a;
        r0 = r0 | 1;
        r7.f38384a = r0;
        goto L_0x0001;
    L_0x004d:
        r0 = r8.m33564f();
        r7.f38387d = r0;
        r0 = r7.f38384a;
        r0 = r0 | 2;
        r7.f38384a = r0;
        goto L_0x0001;
    L_0x005a:
        r0 = 34;
        r2 = com.google.protobuf.nano.C7222l.m33624a(r8, r0);
        r0 = r7.f38388e;
        if (r0 != 0) goto L_0x0086;
    L_0x0064:
        r0 = r1;
    L_0x0065:
        r2 = r2 + r0;
        r2 = new com.google.wireless.android.finsky.p491a.p492a.ad[r2];
        if (r0 == 0) goto L_0x006f;
    L_0x006a:
        r3 = r7.f38388e;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x006f:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x008a;
    L_0x0074:
        r3 = new com.google.wireless.android.finsky.a.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.m33552a(r3);
        r8.m33550a();
        r0 = r0 + 1;
        goto L_0x006f;
    L_0x0086:
        r0 = r7.f38388e;
        r0 = r0.length;
        goto L_0x0065;
    L_0x008a:
        r3 = new com.google.wireless.android.finsky.a.a.ad;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.m33552a(r0);
        r7.f38388e = r2;
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.nano.at.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.nano.at");
    }

    public final /* synthetic */ i m36029a(C7213a c7213a) {
        return m36028b(c7213a);
    }
}
