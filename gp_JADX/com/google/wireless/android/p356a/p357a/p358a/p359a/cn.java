package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cn extends b {
    public int f35972a;
    public String f35973b;
    public String f35974c;
    public long f35975d;
    public int f35976e;
    public int f35977f;
    public byte[] f35978g;
    public byte[] f35979h;
    public int f35980i;
    public int f35981j;
    public String f35982k;

    public final cn m34335a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f35972a |= 1;
        this.f35973b = str;
        return this;
    }

    public final cn m34340b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f35972a |= 2;
        this.f35974c = str;
        return this;
    }

    public final cn m34334a(long j) {
        this.f35972a |= 4;
        this.f35975d = j;
        return this;
    }

    public final cn m34333a(int i) {
        this.f35976e = i;
        this.f35972a |= 8;
        return this;
    }

    public final cn m34339b(int i) {
        this.f35972a |= 16;
        this.f35977f = i;
        return this;
    }

    public final cn m34336a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.f35972a |= 32;
        this.f35978g = bArr;
        return this;
    }

    public final cn m34341c(int i) {
        this.f35972a |= 128;
        this.f35980i = i;
        return this;
    }

    public final cn m34343d(int i) {
        this.f35972a |= 256;
        this.f35981j = i;
        return this;
    }

    public cn() {
        m34342d();
    }

    public final cn m34342d() {
        this.f35972a = 0;
        this.f35973b = "";
        this.f35974c = "";
        this.f35975d = 0;
        this.f35976e = 0;
        this.f35977f = 0;
        this.f35978g = C7222l.f35479l;
        this.f35979h = C7222l.f35479l;
        this.f35980i = 0;
        this.f35981j = 0;
        this.f35982k = "";
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final void m34337a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35972a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35973b);
        }
        if ((this.f35972a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f35974c);
        }
        if ((this.f35972a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f35975d);
        }
        if ((this.f35972a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35976e);
        }
        if ((this.f35972a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35977f);
        }
        if ((this.f35972a & 32) != 0) {
            codedOutputByteBufferNano.m33523a(6, this.f35978g);
        }
        if ((this.f35972a & 64) != 0) {
            codedOutputByteBufferNano.m33523a(7, this.f35979h);
        }
        if ((this.f35972a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f35980i);
        }
        if ((this.f35972a & 256) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35981j);
        }
        if ((this.f35972a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f35982k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34338b() {
        int b = super.b();
        if ((this.f35972a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35973b);
        }
        if ((this.f35972a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f35974c);
        }
        if ((this.f35972a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f35975d);
        }
        if ((this.f35972a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35976e);
        }
        if ((this.f35972a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f35977f);
        }
        if ((this.f35972a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33494b(6, this.f35978g);
        }
        if ((this.f35972a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33494b(7, this.f35979h);
        }
        if ((this.f35972a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f35980i);
        }
        if ((this.f35972a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f35981j);
        }
        if ((this.f35972a & 512) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(10, this.f35982k);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.cn m34331b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001b;
            case 24: goto L_0x0028;
            case 32: goto L_0x0035;
            case 40: goto L_0x0072;
            case 50: goto L_0x007f;
            case 58: goto L_0x008d;
            case 64: goto L_0x009b;
            case 72: goto L_0x00a9;
            case 82: goto L_0x00b7;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f35973b = r0;
        r0 = r6.f35972a;
        r0 = r0 | 1;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x001b:
        r0 = r7.m33564f();
        r6.f35974c = r0;
        r0 = r6.f35972a;
        r0 = r0 | 2;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m33568j();
        r6.f35975d = r0;
        r0 = r6.f35972a;
        r0 = r0 | 4;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x0035:
        r1 = r6.f35972a;
        r1 = r1 | 8;
        r6.f35972a = r1;
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0061 }
        switch(r2) {
            case 0: goto L_0x0069;
            case 1: goto L_0x0069;
            case 2: goto L_0x0069;
            case 3: goto L_0x0069;
            case 4: goto L_0x0069;
            case 5: goto L_0x0069;
            default: goto L_0x0046;
        };	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0046:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r4 = " is not a valid enum SuggestionSource";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0061 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0061 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x0061:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0069:
        r6.f35976e = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r6.f35972a;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r2 = r2 | 8;
        r6.f35972a = r2;	 Catch:{ IllegalArgumentException -> 0x0061 }
        goto L_0x0000;
    L_0x0072:
        r0 = r7.m33560d();
        r6.f35977f = r0;
        r0 = r6.f35972a;
        r0 = r0 | 16;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x007f:
        r0 = r7.m33565g();
        r6.f35978g = r0;
        r0 = r6.f35972a;
        r0 = r0 | 32;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x008d:
        r0 = r7.m33565g();
        r6.f35979h = r0;
        r0 = r6.f35972a;
        r0 = r0 | 64;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x009b:
        r0 = r7.m33560d();
        r6.f35980i = r0;
        r0 = r6.f35972a;
        r0 = r0 | 128;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x00a9:
        r0 = r7.m33560d();
        r6.f35981j = r0;
        r0 = r6.f35972a;
        r0 = r0 | 256;
        r6.f35972a = r0;
        goto L_0x0000;
    L_0x00b7:
        r0 = r7.m33564f();
        r6.f35982k = r0;
        r0 = r6.f35972a;
        r0 = r0 | 512;
        r6.f35972a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.cn.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.cn");
    }

    public final /* synthetic */ i m34332a(C7213a c7213a) {
        return m34331b(c7213a);
    }
}
