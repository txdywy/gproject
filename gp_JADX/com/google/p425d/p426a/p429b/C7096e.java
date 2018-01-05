package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7096e extends b implements Cloneable {
    public static volatile C7096e[] f34715a;
    public C7103l f34716b;
    public byte[] f34717c;
    public int f34718d;

    public static C7096e[] m32246d() {
        if (f34715a == null) {
            synchronized (C7219h.f35465b) {
                if (f34715a == null) {
                    f34715a = new C7096e[0];
                }
            }
        }
        return f34715a;
    }

    public C7096e() {
        this.f34716b = null;
        this.f34717c = C7222l.f35479l;
        this.f34718d = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7096e m32247e() {
        try {
            C7096e c7096e = (C7096e) super.cK_();
            if (this.f34716b != null) {
                c7096e.f34716b = (C7103l) this.f34716b.clone();
            }
            return c7096e;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7096e)) {
            return false;
        }
        C7096e c7096e = (C7096e) obj;
        if (this.f34716b == null) {
            if (c7096e.f34716b != null) {
                return false;
            }
        } else if (!this.f34716b.equals(c7096e.f34716b)) {
            return false;
        }
        if (!Arrays.equals(this.f34717c, c7096e.f34717c)) {
            return false;
        }
        if (this.f34718d != c7096e.f34718d) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7096e.aO);
        }
        if (c7096e.aO == null || c7096e.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C7103l c7103l = this.f34716b;
        hashCode = ((((((c7103l == null ? 0 : c7103l.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f34717c)) * 31) + this.f34718d) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32249a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34716b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34716b);
        }
        if (!Arrays.equals(this.f34717c, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(2, this.f34717c);
        }
        if (this.f34718d != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34718d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32250b() {
        int b = super.b();
        if (this.f34716b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34716b);
        }
        if (!Arrays.equals(this.f34717c, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f34717c);
        }
        if (this.f34718d != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f34718d);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p425d.p426a.p429b.C7096e m32245b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x000e;
            case 18: goto L_0x001f;
            case 24: goto L_0x0026;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f34716b;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new com.google.d.a.b.l;
        r0.<init>();
        r6.f34716b = r0;
    L_0x0019:
        r0 = r6.f34716b;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r7.m33565g();
        r6.f34717c = r0;
        goto L_0x0000;
    L_0x0026:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x004c }
        switch(r2) {
            case 0: goto L_0x0054;
            case 1: goto L_0x0054;
            case 2: goto L_0x0054;
            case 3: goto L_0x0054;
            case 4: goto L_0x0054;
            default: goto L_0x0031;
        };	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x0031:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004c }
        r4 = 51;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004c }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        r4 = " is not a valid enum DiversionProvenance";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x004c }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x0054:
        r6.f34718d = r2;	 Catch:{ IllegalArgumentException -> 0x004c }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.b.e.b(com.google.protobuf.nano.a):com.google.d.a.b.e");
    }

    public final /* synthetic */ b cK_() {
        return (C7096e) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7096e) clone();
    }

    public final /* synthetic */ i m32248a(C7213a c7213a) {
        return m32245b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m32247e();
    }
}
