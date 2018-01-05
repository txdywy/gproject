package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7102k extends b implements Cloneable {
    public static volatile C7102k[] f34747a;
    public long f34748b;
    public byte[] f34749c;

    public static C7102k[] m32276d() {
        if (f34747a == null) {
            synchronized (C7219h.f35465b) {
                if (f34747a == null) {
                    f34747a = new C7102k[0];
                }
            }
        }
        return f34747a;
    }

    public C7102k() {
        this.f34748b = 0;
        this.f34749c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    private final C7102k m32277e() {
        try {
            return (C7102k) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7102k)) {
            return false;
        }
        C7102k c7102k = (C7102k) obj;
        if (this.f34748b != c7102k.f34748b) {
            return false;
        }
        if (!Arrays.equals(this.f34749c, c7102k.f34749c)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7102k.aO);
        }
        if (c7102k.aO == null || c7102k.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f34748b ^ (this.f34748b >>> 32)))) * 31) + Arrays.hashCode(this.f34749c)) * 31;
        if (this.aO == null || this.aO.m33598b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void m32279a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34748b != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f34748b);
        }
        if (!Arrays.equals(this.f34749c, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(2, this.f34749c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32280b() {
        int b = super.b();
        if (this.f34748b != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f34748b);
        }
        if (Arrays.equals(this.f34749c, C7222l.f35479l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33494b(2, this.f34749c);
    }

    public final /* synthetic */ b cK_() {
        return (C7102k) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7102k) clone();
    }

    public final /* synthetic */ i m32278a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34748b = c7213a.m33568j();
                    continue;
                case 18:
                    this.f34749c = c7213a.m33565g();
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ Object clone() {
        return m32277e();
    }
}
