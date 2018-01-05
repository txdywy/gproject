package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ah extends b {
    public static volatile ah[] f37798a;
    public int f37799b;
    public String f37800c;
    public String f37801d;
    public int f37802e;
    public String f37803f;
    public int f37804g;
    public ae f37805h;
    public double f37806i;
    public double f37807j;
    public long f37808k;

    public static ah[] m35605d() {
        if (f37798a == null) {
            synchronized (C7219h.f35465b) {
                if (f37798a == null) {
                    f37798a = new ah[0];
                }
            }
        }
        return f37798a;
    }

    public ah() {
        this.f37799b = 0;
        this.f37800c = "";
        this.f37801d = "";
        this.f37802e = 0;
        this.f37803f = "";
        this.f37804g = 0;
        this.f37805h = null;
        this.f37806i = 0.0d;
        this.f37807j = 0.0d;
        this.f37808k = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35607a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37799b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37800c);
        }
        if ((this.f37799b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37801d);
        }
        if (this.f37805h != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37805h);
        }
        if ((this.f37799b & 32) != 0) {
            codedOutputByteBufferNano.m33516a(4, this.f37806i);
        }
        if ((this.f37799b & 64) != 0) {
            codedOutputByteBufferNano.m33516a(5, this.f37807j);
        }
        if ((this.f37799b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37802e);
        }
        if ((this.f37799b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f37803f);
        }
        if ((this.f37799b & 16) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f37804g);
        }
        if ((this.f37799b & 128) != 0) {
            codedOutputByteBufferNano.m33531b(10, this.f37808k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35608b() {
        int b = super.b();
        if ((this.f37799b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37800c);
        }
        if ((this.f37799b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37801d);
        }
        if (this.f37805h != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37805h);
        }
        if ((this.f37799b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 8;
        }
        if ((this.f37799b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 8;
        }
        if ((this.f37799b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37802e);
        }
        if ((this.f37799b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f37803f);
        }
        if ((this.f37799b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f37804g);
        }
        if ((this.f37799b & 128) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(10, this.f37808k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.p513g.p514a.ah m35604b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 26: goto L_0x0028;
            case 33: goto L_0x0039;
            case 41: goto L_0x004a;
            case 48: goto L_0x005b;
            case 66: goto L_0x009a;
            case 72: goto L_0x00a8;
            case 80: goto L_0x00e7;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f37800c = r0;
        r0 = r6.f37799b;
        r0 = r0 | 1;
        r6.f37799b = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33564f();
        r6.f37801d = r0;
        r0 = r6.f37799b;
        r0 = r0 | 2;
        r6.f37799b = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r6.f37805h;
        if (r0 != 0) goto L_0x0033;
    L_0x002c:
        r0 = new com.google.wireless.android.finsky.dfe.g.a.ae;
        r0.<init>();
        r6.f37805h = r0;
    L_0x0033:
        r0 = r6.f37805h;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0039:
        r0 = r7.m33570l();
        r0 = java.lang.Double.longBitsToDouble(r0);
        r6.f37806i = r0;
        r0 = r6.f37799b;
        r0 = r0 | 32;
        r6.f37799b = r0;
        goto L_0x0000;
    L_0x004a:
        r0 = r7.m33570l();
        r0 = java.lang.Double.longBitsToDouble(r0);
        r6.f37807j = r0;
        r0 = r6.f37799b;
        r0 = r0 | 64;
        r6.f37799b = r0;
        goto L_0x0000;
    L_0x005b:
        r1 = r6.f37799b;
        r1 = r1 | 4;
        r6.f37799b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0087 }
        switch(r2) {
            case 0: goto L_0x0090;
            case 1: goto L_0x0090;
            default: goto L_0x006c;
        };	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x006c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r4 = 50;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0087 }
        r4 = " is not a valid enum CriticRatingSource";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0087 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0087 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0087 }
    L_0x0087:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0090:
        r6.f37802e = r2;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r6.f37799b;	 Catch:{ IllegalArgumentException -> 0x0087 }
        r2 = r2 | 4;
        r6.f37799b = r2;	 Catch:{ IllegalArgumentException -> 0x0087 }
        goto L_0x0000;
    L_0x009a:
        r0 = r7.m33564f();
        r6.f37803f = r0;
        r0 = r6.f37799b;
        r0 = r0 | 8;
        r6.f37799b = r0;
        goto L_0x0000;
    L_0x00a8:
        r1 = r6.f37799b;
        r1 = r1 | 16;
        r6.f37799b = r1;
        r1 = r7.m33573o();
        r2 = r7.m33560d();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        switch(r2) {
            case 0: goto L_0x00dd;
            case 1: goto L_0x00dd;
            case 2: goto L_0x00dd;
            case 3: goto L_0x00dd;
            default: goto L_0x00b9;
        };	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00b9:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r4 = 40;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r4 = " is not a valid enum IconType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00d4:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00dd:
        r6.f37804g = r2;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = r6.f37799b;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = r2 | 16;
        r6.f37799b = r2;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        goto L_0x0000;
    L_0x00e7:
        r0 = r7.m33559c();
        r6.f37808k = r0;
        r0 = r6.f37799b;
        r0 = r0 | 128;
        r6.f37799b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.finsky.dfe.g.a.ah.b(com.google.protobuf.nano.a):com.google.wireless.android.finsky.dfe.g.a.ah");
    }

    public final /* synthetic */ i m35606a(C7213a c7213a) {
        return m35604b(c7213a);
    }
}
