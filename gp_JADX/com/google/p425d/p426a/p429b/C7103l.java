package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7103l extends b implements Cloneable {
    public String f34750a;
    public long f34751b;

    public C7103l() {
        this.f34750a = "";
        this.f34751b = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7103l m32281d() {
        try {
            return (C7103l) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7103l)) {
            return false;
        }
        C7103l c7103l = (C7103l) obj;
        if (this.f34750a == null) {
            if (c7103l.f34750a != null) {
                return false;
            }
        } else if (!this.f34750a.equals(c7103l.f34750a)) {
            return false;
        }
        if (this.f34751b != c7103l.f34751b) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7103l.aO);
        }
        if (c7103l.aO == null || c7103l.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f34750a == null ? 0 : this.f34750a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ((int) (this.f34751b ^ (this.f34751b >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32283a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34750a == null || this.f34750a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34750a);
        }
        if (this.f34751b != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f34751b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32284b() {
        int b = super.b();
        if (!(this.f34750a == null || this.f34750a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34750a);
        }
        if (this.f34751b != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f34751b);
        }
        return b;
    }

    public final /* synthetic */ b cK_() {
        return (C7103l) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7103l) clone();
    }

    public final /* synthetic */ i m32282a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34750a = c7213a.m33564f();
                    continue;
                case 16:
                    this.f34751b = c7213a.m33568j();
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
        return m32281d();
    }
}
