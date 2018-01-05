package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class hr extends C0758b {
    public int f12595a;
    public int f12596b;
    public float f12597c;
    public long f12598d;
    public long f12599e;
    public long f12600f;
    public long f12601g;
    public long f12602h;
    public long f12603i;
    public long f12604j;
    public double f12605k;
    public long f12606l;
    public long f12607m;
    public ht[] f12608n;
    public hs f12609o;

    public hr() {
        this.f12595a = 0;
        this.f12596b = 1;
        this.f12597c = 0.0f;
        this.f12598d = 0;
        this.f12599e = 0;
        this.f12600f = 0;
        this.f12601g = 0;
        this.f12602h = 0;
        this.f12603i = 0;
        this.f12604j = 0;
        this.f12605k = 0.0d;
        this.f12606l = 0;
        this.f12607m = 0;
        this.f12608n = ht.bk_();
        this.f12609o = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        if (this.f12596b != hrVar.f12596b) {
            return false;
        }
        if ((this.f12595a & 1) != (hrVar.f12595a & 1)) {
            return false;
        }
        if (Float.floatToIntBits(this.f12597c) != Float.floatToIntBits(hrVar.f12597c)) {
            return false;
        }
        if ((this.f12595a & 2) != (hrVar.f12595a & 2)) {
            return false;
        }
        if (this.f12598d != hrVar.f12598d) {
            return false;
        }
        if ((this.f12595a & 4) != (hrVar.f12595a & 4)) {
            return false;
        }
        if (this.f12599e != hrVar.f12599e) {
            return false;
        }
        if ((this.f12595a & 8) != (hrVar.f12595a & 8)) {
            return false;
        }
        if (this.f12600f != hrVar.f12600f) {
            return false;
        }
        if ((this.f12595a & 16) != (hrVar.f12595a & 16)) {
            return false;
        }
        if (this.f12601g != hrVar.f12601g) {
            return false;
        }
        if ((this.f12595a & 32) != (hrVar.f12595a & 32)) {
            return false;
        }
        if (this.f12602h != hrVar.f12602h) {
            return false;
        }
        if ((this.f12595a & 64) != (hrVar.f12595a & 64)) {
            return false;
        }
        if (this.f12603i != hrVar.f12603i) {
            return false;
        }
        if ((this.f12595a & 128) != (hrVar.f12595a & 128)) {
            return false;
        }
        if (this.f12604j != hrVar.f12604j) {
            return false;
        }
        if ((this.f12595a & 256) != (hrVar.f12595a & 256)) {
            return false;
        }
        if (Double.doubleToLongBits(this.f12605k) != Double.doubleToLongBits(hrVar.f12605k)) {
            return false;
        }
        if ((this.f12595a & 512) != (hrVar.f12595a & 512)) {
            return false;
        }
        if (this.f12606l != hrVar.f12606l) {
            return false;
        }
        if ((this.f12595a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (hrVar.f12595a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (this.f12607m != hrVar.f12607m) {
            return false;
        }
        if (!h.a(this.f12608n, hrVar.f12608n)) {
            return false;
        }
        if (this.f12609o == null) {
            if (hrVar.f12609o != null) {
                return false;
            }
        } else if (!this.f12609o.equals(hrVar.f12609o)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hrVar.aO);
        }
        if (hrVar.aO == null || hrVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12596b) * 31) + Float.floatToIntBits(this.f12597c);
        long j = this.f12598d;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12599e;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12600f;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12601g;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12602h;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12603i;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12604j;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = Double.doubleToLongBits(this.f12605k);
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12606l;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f12607m;
        hashCode = (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f12608n);
        hs hsVar = this.f12609o;
        hashCode = ((hsVar == null ? 0 : hsVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(1, this.f12596b);
        if ((this.f12595a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12597c);
        }
        if ((this.f12595a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12598d);
        }
        if ((this.f12595a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12600f);
        }
        if ((this.f12595a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12601g);
        }
        if ((this.f12595a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f12602h);
        }
        if ((this.f12595a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f12603i);
        }
        if ((this.f12595a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f12604j);
        }
        if ((this.f12595a & 512) != 0) {
            codedOutputByteBufferNano.a(9, this.f12606l);
        }
        if ((this.f12595a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(10, this.f12607m);
        }
        if ((this.f12595a & 4) != 0) {
            codedOutputByteBufferNano.a(11, this.f12599e);
        }
        if ((this.f12595a & 256) != 0) {
            codedOutputByteBufferNano.a(12, this.f12605k);
        }
        if (this.f12608n != null && this.f12608n.length > 0) {
            for (C0757i c0757i : this.f12608n) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(13, c0757i);
                }
            }
        }
        if (this.f12609o != null) {
            codedOutputByteBufferNano.b(15, this.f12609o);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b() + CodedOutputByteBufferNano.d(1, this.f12596b);
        if ((this.f12595a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 4;
        }
        if ((this.f12595a & 2) != 0) {
            b += CodedOutputByteBufferNano.e(3, this.f12598d);
        }
        if ((this.f12595a & 8) != 0) {
            b += CodedOutputByteBufferNano.e(4, this.f12600f);
        }
        if ((this.f12595a & 16) != 0) {
            b += CodedOutputByteBufferNano.e(5, this.f12601g);
        }
        if ((this.f12595a & 32) != 0) {
            b += CodedOutputByteBufferNano.e(6, this.f12602h);
        }
        if ((this.f12595a & 64) != 0) {
            b += CodedOutputByteBufferNano.e(7, this.f12603i);
        }
        if ((this.f12595a & 128) != 0) {
            b += CodedOutputByteBufferNano.e(8, this.f12604j);
        }
        if ((this.f12595a & 512) != 0) {
            b += CodedOutputByteBufferNano.e(9, this.f12606l);
        }
        if ((this.f12595a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.e(10, this.f12607m);
        }
        if ((this.f12595a & 4) != 0) {
            b += CodedOutputByteBufferNano.e(11, this.f12599e);
        }
        if ((this.f12595a & 256) != 0) {
            b += CodedOutputByteBufferNano.d(12) + 8;
        }
        if (this.f12608n != null && this.f12608n.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12608n) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(13, c0757i);
                }
            }
            b = i;
        }
        if (this.f12609o != null) {
            return b + CodedOutputByteBufferNano.d(15, this.f12609o);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.finsky.cv.p177a.hr m12741b(com.google.protobuf.nano.a r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.a();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x000f;
            case 21: goto L_0x0040;
            case 24: goto L_0x0051;
            case 32: goto L_0x005e;
            case 40: goto L_0x006b;
            case 48: goto L_0x0078;
            case 56: goto L_0x0086;
            case 64: goto L_0x0094;
            case 72: goto L_0x00a2;
            case 80: goto L_0x00b0;
            case 88: goto L_0x00be;
            case 97: goto L_0x00cc;
            case 106: goto L_0x00de;
            case 122: goto L_0x011e;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m4918a(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r2 = r8.o();
        r3 = r8.i();	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r3) {
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            case 3: goto L_0x003d;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x001a:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = 51;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r6.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r6.append(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r5 = " is not a valid enum AggregateRatingType";
        r3 = r3.append(r5);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0035 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0035 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r3 = move-exception;
        r8.e(r2);
        r7.m4918a(r8, r0);
        goto L_0x0001;
    L_0x003d:
        r7.f12596b = r3;	 Catch:{ IllegalArgumentException -> 0x0035 }
        goto L_0x0001;
    L_0x0040:
        r0 = r8.k();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r7.f12597c = r0;
        r0 = r7.f12595a;
        r0 = r0 | 1;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x0051:
        r2 = r8.j();
        r7.f12598d = r2;
        r0 = r7.f12595a;
        r0 = r0 | 2;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x005e:
        r2 = r8.j();
        r7.f12600f = r2;
        r0 = r7.f12595a;
        r0 = r0 | 8;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x006b:
        r2 = r8.j();
        r7.f12601g = r2;
        r0 = r7.f12595a;
        r0 = r0 | 16;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x0078:
        r2 = r8.j();
        r7.f12602h = r2;
        r0 = r7.f12595a;
        r0 = r0 | 32;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x0086:
        r2 = r8.j();
        r7.f12603i = r2;
        r0 = r7.f12595a;
        r0 = r0 | 64;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x0094:
        r2 = r8.j();
        r7.f12604j = r2;
        r0 = r7.f12595a;
        r0 = r0 | 128;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x00a2:
        r2 = r8.j();
        r7.f12606l = r2;
        r0 = r7.f12595a;
        r0 = r0 | 512;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x00b0:
        r2 = r8.j();
        r7.f12607m = r2;
        r0 = r7.f12595a;
        r0 = r0 | 1024;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x00be:
        r2 = r8.j();
        r7.f12599e = r2;
        r0 = r7.f12595a;
        r0 = r0 | 4;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x00cc:
        r2 = r8.l();
        r2 = java.lang.Double.longBitsToDouble(r2);
        r7.f12605k = r2;
        r0 = r7.f12595a;
        r0 = r0 | 256;
        r7.f12595a = r0;
        goto L_0x0001;
    L_0x00de:
        r0 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r2 = com.google.protobuf.nano.l.a(r8, r0);
        r0 = r7.f12608n;
        if (r0 != 0) goto L_0x010a;
    L_0x00e8:
        r0 = r1;
    L_0x00e9:
        r2 = r2 + r0;
        r2 = new com.google.android.finsky.cv.p177a.ht[r2];
        if (r0 == 0) goto L_0x00f3;
    L_0x00ee:
        r3 = r7.f12608n;
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x00f3:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x010e;
    L_0x00f8:
        r3 = new com.google.android.finsky.cv.a.ht;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.a(r3);
        r8.a();
        r0 = r0 + 1;
        goto L_0x00f3;
    L_0x010a:
        r0 = r7.f12608n;
        r0 = r0.length;
        goto L_0x00e9;
    L_0x010e:
        r3 = new com.google.android.finsky.cv.a.ht;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.a(r0);
        r7.f12608n = r2;
        goto L_0x0001;
    L_0x011e:
        r0 = r7.f12609o;
        if (r0 != 0) goto L_0x0129;
    L_0x0122:
        r0 = new com.google.android.finsky.cv.a.hs;
        r0.<init>();
        r7.f12609o = r0;
    L_0x0129:
        r0 = r7.f12609o;
        r8.a(r0);
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cv.a.hr.b(com.google.protobuf.nano.a):com.google.android.finsky.cv.a.hr");
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12741b(aVar);
    }
}
