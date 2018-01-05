package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7099h extends b implements Cloneable {
    public static volatile C7099h[] f34732a;
    public String f34733b;
    public long f34734c;
    public boolean f34735d;
    public double f34736e;
    public String f34737f;
    public C7100i f34738g;
    public int f34739h;
    public boolean f34740i;
    public int f34741j;

    public static C7099h[] m32261d() {
        if (f34732a == null) {
            synchronized (C7219h.f35465b) {
                if (f34732a == null) {
                    f34732a = new C7099h[0];
                }
            }
        }
        return f34732a;
    }

    public C7099h() {
        this.f34733b = "";
        this.f34734c = 0;
        this.f34735d = false;
        this.f34736e = 0.0d;
        this.f34737f = "";
        this.f34738g = null;
        this.f34739h = 0;
        this.f34740i = false;
        this.f34741j = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7099h m32262e() {
        try {
            C7099h c7099h = (C7099h) super.cK_();
            if (this.f34738g != null) {
                c7099h.f34738g = (C7100i) this.f34738g.clone();
            }
            return c7099h;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7099h)) {
            return false;
        }
        C7099h c7099h = (C7099h) obj;
        if (this.f34733b == null) {
            if (c7099h.f34733b != null) {
                return false;
            }
        } else if (!this.f34733b.equals(c7099h.f34733b)) {
            return false;
        }
        if (this.f34734c != c7099h.f34734c) {
            return false;
        }
        if (this.f34735d != c7099h.f34735d) {
            return false;
        }
        if (Double.doubleToLongBits(this.f34736e) != Double.doubleToLongBits(c7099h.f34736e)) {
            return false;
        }
        if (this.f34737f == null) {
            if (c7099h.f34737f != null) {
                return false;
            }
        } else if (!this.f34737f.equals(c7099h.f34737f)) {
            return false;
        }
        if (this.f34738g == null) {
            if (c7099h.f34738g != null) {
                return false;
            }
        } else if (!this.f34738g.equals(c7099h.f34738g)) {
            return false;
        }
        if (this.f34739h != c7099h.f34739h) {
            return false;
        }
        if (this.f34740i != c7099h.f34740i) {
            return false;
        }
        if (this.f34741j != c7099h.f34741j) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7099h.aO);
        }
        if (c7099h.aO == null || c7099h.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int i3 = 0;
        int hashCode = ((((this.f34733b == null ? 0 : this.f34733b.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ((int) (this.f34734c ^ (this.f34734c >>> 32)))) * 31;
        if (this.f34735d) {
            i = 1231;
        } else {
            i = 1237;
        }
        i += hashCode;
        long doubleToLongBits = Double.doubleToLongBits(this.f34736e);
        i = (this.f34737f == null ? 0 : this.f34737f.hashCode()) + (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31);
        C7100i c7100i = this.f34738g;
        i = ((((c7100i == null ? 0 : c7100i.hashCode()) + (i * 31)) * 31) + this.f34739h) * 31;
        if (!this.f34740i) {
            i2 = 1237;
        }
        i = (((i + i2) * 31) + this.f34741j) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i3 = this.aO.hashCode();
        }
        return i + i3;
    }

    public final void m32264a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34733b == null || this.f34733b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34733b);
        }
        if (this.f34734c != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f34734c);
        }
        if (this.f34735d) {
            codedOutputByteBufferNano.m33522a(3, this.f34735d);
        }
        if (Double.doubleToLongBits(this.f34736e) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.m33516a(4, this.f34736e);
        }
        if (!(this.f34737f == null || this.f34737f.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f34737f);
        }
        if (this.f34738g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f34738g);
        }
        if (this.f34740i) {
            codedOutputByteBufferNano.m33522a(7, this.f34740i);
        }
        if (this.f34741j != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f34741j);
        }
        if (this.f34739h != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f34739h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32265b() {
        int b = super.b();
        if (!(this.f34733b == null || this.f34733b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34733b);
        }
        if (this.f34734c != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f34734c);
        }
        if (this.f34735d) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (Double.doubleToLongBits(this.f34736e) != Double.doubleToLongBits(0.0d)) {
            b += CodedOutputByteBufferNano.m33501d(4) + 8;
        }
        if (!(this.f34737f == null || this.f34737f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f34737f);
        }
        if (this.f34738g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f34738g);
        }
        if (this.f34740i) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if (this.f34741j != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f34741j);
        }
        if (this.f34739h != 0) {
            return b + CodedOutputByteBufferNano.m33502d(9, this.f34739h);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p425d.p426a.p429b.C7099h m32260b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 16: goto L_0x0015;
            case 24: goto L_0x001c;
            case 33: goto L_0x0023;
            case 42: goto L_0x002e;
            case 50: goto L_0x0035;
            case 56: goto L_0x0046;
            case 64: goto L_0x004d;
            case 72: goto L_0x007e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33564f();
        r6.f34733b = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.m33568j();
        r6.f34734c = r0;
        goto L_0x0000;
    L_0x001c:
        r0 = r7.m33563e();
        r6.f34735d = r0;
        goto L_0x0000;
    L_0x0023:
        r0 = r7.m33570l();
        r0 = java.lang.Double.longBitsToDouble(r0);
        r6.f34736e = r0;
        goto L_0x0000;
    L_0x002e:
        r0 = r7.m33564f();
        r6.f34737f = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = r6.f34738g;
        if (r0 != 0) goto L_0x0040;
    L_0x0039:
        r0 = new com.google.d.a.b.i;
        r0.<init>();
        r6.f34738g = r0;
    L_0x0040:
        r0 = r6.f34738g;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x0046:
        r0 = r7.m33563e();
        r6.f34740i = r0;
        goto L_0x0000;
    L_0x004d:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x0073 }
        switch(r2) {
            case 0: goto L_0x007b;
            case 1: goto L_0x007b;
            default: goto L_0x0058;
        };	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0058:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = 48;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = " is not a valid enum ParamStorageType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x007b:
        r6.f34741j = r2;	 Catch:{ IllegalArgumentException -> 0x0073 }
        goto L_0x0000;
    L_0x007e:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        switch(r2) {
            case 0: goto L_0x00ad;
            case 1: goto L_0x00ad;
            case 2: goto L_0x00ad;
            case 3: goto L_0x00ad;
            case 4: goto L_0x00ad;
            case 5: goto L_0x00ad;
            default: goto L_0x0089;
        };	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x0089:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r4 = 46;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r4 = " is not a valid enum ParamValueType";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x00a4:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00ad:
        r6.f34739h = r2;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.b.h.b(com.google.protobuf.nano.a):com.google.d.a.b.h");
    }

    public final /* synthetic */ b cK_() {
        return (C7099h) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7099h) clone();
    }

    public final /* synthetic */ i m32263a(C7213a c7213a) {
        return m32260b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m32262e();
    }
}
