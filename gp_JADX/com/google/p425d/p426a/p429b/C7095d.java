package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p356a.p357a.p358a.p359a.C7274f;
import java.util.Arrays;

public final class C7095d extends b implements Cloneable {
    public boolean f34708a;
    public long f34709b;
    public long f34710c;
    public C7274f f34711d;
    public String f34712e;
    public byte[] f34713f;
    public boolean f34714g;

    public C7095d() {
        this.f34708a = false;
        this.f34709b = 0;
        this.f34710c = 0;
        this.f34711d = null;
        this.f34712e = "";
        this.f34713f = C7222l.f35479l;
        this.f34714g = false;
        this.aO = null;
        this.aP = -1;
    }

    private final C7095d m32241d() {
        try {
            C7095d c7095d = (C7095d) super.cK_();
            if (this.f34711d != null) {
                c7095d.f34711d = (C7274f) this.f34711d.clone();
            }
            return c7095d;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7095d)) {
            return false;
        }
        C7095d c7095d = (C7095d) obj;
        if (this.f34708a != c7095d.f34708a) {
            return false;
        }
        if (this.f34709b != c7095d.f34709b) {
            return false;
        }
        if (this.f34710c != c7095d.f34710c) {
            return false;
        }
        if (this.f34711d == null) {
            if (c7095d.f34711d != null) {
                return false;
            }
        } else if (!this.f34711d.equals(c7095d.f34711d)) {
            return false;
        }
        if (this.f34712e == null) {
            if (c7095d.f34712e != null) {
                return false;
            }
        } else if (!this.f34712e.equals(c7095d.f34712e)) {
            return false;
        }
        if (!Arrays.equals(this.f34713f, c7095d.f34713f)) {
            return false;
        }
        if (this.f34714g != c7095d.f34714g) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7095d.aO);
        }
        if (c7095d.aO == null || c7095d.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = (((((this.f34708a ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ((int) (this.f34709b ^ (this.f34709b >>> 32)))) * 31) + ((int) (this.f34710c ^ (this.f34710c >>> 32)));
        C7274f c7274f = this.f34711d;
        hashCode = ((((this.f34712e == null ? 0 : this.f34712e.hashCode()) + (((c7274f == null ? 0 : c7274f.hashCode()) + (hashCode * 31)) * 31)) * 31) + Arrays.hashCode(this.f34713f)) * 31;
        if (!this.f34714g) {
            i = 1237;
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void m32243a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34708a) {
            codedOutputByteBufferNano.m33522a(1, this.f34708a);
        }
        if (this.f34709b != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f34709b);
        }
        if (this.f34710c != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f34710c);
        }
        if (this.f34711d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f34711d);
        }
        if (!(this.f34712e == null || this.f34712e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f34712e);
        }
        if (!Arrays.equals(this.f34713f, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(6, this.f34713f);
        }
        if (this.f34714g) {
            codedOutputByteBufferNano.m33522a(7, this.f34714g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32244b() {
        int b = super.b();
        if (this.f34708a) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f34709b != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f34709b);
        }
        if (this.f34710c != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f34710c);
        }
        if (this.f34711d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f34711d);
        }
        if (!(this.f34712e == null || this.f34712e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f34712e);
        }
        if (!Arrays.equals(this.f34713f, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(6, this.f34713f);
        }
        if (this.f34714g) {
            return b + (CodedOutputByteBufferNano.m33501d(7) + 1);
        }
        return b;
    }

    public final /* synthetic */ b cK_() {
        return (C7095d) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7095d) clone();
    }

    public final /* synthetic */ i m32242a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34708a = c7213a.m33563e();
                    continue;
                case 16:
                    this.f34709b = c7213a.m33568j();
                    continue;
                case 24:
                    this.f34710c = c7213a.m33568j();
                    continue;
                case 34:
                    if (this.f34711d == null) {
                        this.f34711d = new C7274f();
                    }
                    c7213a.m33552a(this.f34711d);
                    continue;
                case 42:
                    this.f34712e = c7213a.m33564f();
                    continue;
                case 50:
                    this.f34713f = c7213a.m33565g();
                    continue;
                case 56:
                    this.f34714g = c7213a.m33563e();
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
        return m32241d();
    }
}
