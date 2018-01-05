package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7321c extends b {
    public int f36475a;
    public int[] f36476b;

    public C7321c() {
        this.f36475a = 1;
        this.f36476b = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34718a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36475a);
        if (this.f36476b != null && this.f36476b.length > 0) {
            for (int a : this.f36476b) {
                codedOutputByteBufferNano.m33518a(2, a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34719b() {
        int i = 0;
        int d = CodedOutputByteBufferNano.m33502d(1, this.f36475a) + super.b();
        if (this.f36476b == null || this.f36476b.length <= 0) {
            return d;
        }
        int i2 = 0;
        while (i < this.f36476b.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f36476b[i]);
            i++;
        }
        return (d + i2) + (this.f36476b.length * 1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.p491a.p492a.C7321c m34716b(com.google.protobuf.nano.C7213a r10) {
        /*
        r9 = this;
        r8 = 16;
        r1 = 0;
    L_0x0003:
        r3 = r10.m33550a();
        switch(r3) {
            case 0: goto L_0x0010;
            case 8: goto L_0x0011;
            case 16: goto L_0x0042;
            case 18: goto L_0x0091;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = super.a(r10, r3);
        if (r0 != 0) goto L_0x0003;
    L_0x0010:
        return r9;
    L_0x0011:
        r0 = r10.m33573o();
        r2 = r10.m33567i();	 Catch:{ IllegalArgumentException -> 0x0037 }
        switch(r2) {
            case 1: goto L_0x003f;
            case 2: goto L_0x003f;
            case 3: goto L_0x003f;
            case 4: goto L_0x003f;
            case 5: goto L_0x003f;
            default: goto L_0x001c;
        };	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x001c:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r5 = 50;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r6.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r5 = " is not a valid enum BillingAddressType";
        r2 = r2.append(r5);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r4.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x0037:
        r2 = move-exception;
        r10.m33562e(r0);
        r9.a(r10, r3);
        goto L_0x0003;
    L_0x003f:
        r9.f36475a = r2;	 Catch:{ IllegalArgumentException -> 0x0037 }
        goto L_0x0003;
    L_0x0042:
        r4 = com.google.protobuf.nano.C7222l.m33624a(r10, r8);
        r5 = new int[r4];
        r2 = r1;
        r0 = r1;
    L_0x004a:
        if (r2 >= r4) goto L_0x006c;
    L_0x004c:
        if (r2 == 0) goto L_0x0051;
    L_0x004e:
        r10.m33550a();
    L_0x0051:
        r6 = r10.m33573o();
        r7 = r10.m33560d();	 Catch:{ IllegalArgumentException -> 0x0064 }
        r7 = com.google.wireless.android.finsky.p491a.p492a.C7319a.m34596a(r7);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r5[r0] = r7;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r0 = r0 + 1;
    L_0x0061:
        r2 = r2 + 1;
        goto L_0x004a;
    L_0x0064:
        r7 = move-exception;
        r10.m33562e(r6);
        r9.a(r10, r3);
        goto L_0x0061;
    L_0x006c:
        if (r0 == 0) goto L_0x0003;
    L_0x006e:
        r2 = r9.f36476b;
        if (r2 != 0) goto L_0x007b;
    L_0x0072:
        r2 = r1;
    L_0x0073:
        if (r2 != 0) goto L_0x007f;
    L_0x0075:
        r3 = r5.length;
        if (r0 != r3) goto L_0x007f;
    L_0x0078:
        r9.f36476b = r5;
        goto L_0x0003;
    L_0x007b:
        r2 = r9.f36476b;
        r2 = r2.length;
        goto L_0x0073;
    L_0x007f:
        r3 = r2 + r0;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x008a;
    L_0x0085:
        r4 = r9.f36476b;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x008a:
        java.lang.System.arraycopy(r5, r1, r3, r2, r0);
        r9.f36476b = r3;
        goto L_0x0003;
    L_0x0091:
        r0 = r10.m33567i();
        r3 = r10.m33558c(r0);
        r2 = r10.m33573o();
        r0 = r1;
    L_0x009e:
        r4 = r10.m33571m();
        if (r4 <= 0) goto L_0x00ae;
    L_0x00a4:
        r4 = r10.m33560d();	 Catch:{ IllegalArgumentException -> 0x00ec }
        com.google.wireless.android.finsky.p491a.p492a.C7319a.m34596a(r4);	 Catch:{ IllegalArgumentException -> 0x00ec }
        r0 = r0 + 1;
        goto L_0x009e;
    L_0x00ae:
        if (r0 == 0) goto L_0x00e7;
    L_0x00b0:
        r10.m33562e(r2);
        r2 = r9.f36476b;
        if (r2 != 0) goto L_0x00d9;
    L_0x00b7:
        r2 = r1;
    L_0x00b8:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00c2;
    L_0x00bd:
        r4 = r9.f36476b;
        java.lang.System.arraycopy(r4, r1, r0, r1, r2);
    L_0x00c2:
        r4 = r10.m33571m();
        if (r4 <= 0) goto L_0x00e5;
    L_0x00c8:
        r4 = r10.m33573o();
        r5 = r10.m33560d();	 Catch:{ IllegalArgumentException -> 0x00dd }
        r5 = com.google.wireless.android.finsky.p491a.p492a.C7319a.m34596a(r5);	 Catch:{ IllegalArgumentException -> 0x00dd }
        r0[r2] = r5;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r2 = r2 + 1;
        goto L_0x00c2;
    L_0x00d9:
        r2 = r9.f36476b;
        r2 = r2.length;
        goto L_0x00b8;
    L_0x00dd:
        r5 = move-exception;
        r10.m33562e(r4);
        r9.a(r10, r8);
        goto L_0x00c2;
    L_0x00e5:
        r9.f36476b = r0;
    L_0x00e7:
        r10.m33561d(r3);
        goto L_0x0003;
    L_0x00ec:
        r4 = move-exception;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.a.a.c.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.a.a.c");
    }

    public final /* synthetic */ i m34717a(C7213a c7213a) {
        return m34716b(c7213a);
    }
}
