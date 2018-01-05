package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7271c extends b implements Cloneable {
    public boolean f35888a;
    public boolean f35889b;

    public C7271c() {
        this.f35888a = false;
        this.f35889b = false;
        this.aO = null;
        this.aP = -1;
    }

    private final C7271c m34256d() {
        try {
            return (C7271c) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7271c)) {
            return false;
        }
        C7271c c7271c = (C7271c) obj;
        if (this.f35888a != c7271c.f35888a) {
            return false;
        }
        if (this.f35889b != c7271c.f35889b) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7271c.aO);
        }
        if (c7271c.aO == null || c7271c.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((this.f35888a ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (!this.f35889b) {
            i = 1237;
        }
        i = (hashCode + i) * 31;
        if (this.aO == null || this.aO.m33598b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34258a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35888a) {
            codedOutputByteBufferNano.m33522a(1, this.f35888a);
        }
        if (this.f35889b) {
            codedOutputByteBufferNano.m33522a(2, this.f35889b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34259b() {
        int b = super.b();
        if (this.f35888a) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f35889b) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ b cK_() {
        return (C7271c) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7271c) clone();
    }

    public final /* synthetic */ i m34257a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35888a = c7213a.m33563e();
                    continue;
                case 16:
                    this.f35889b = c7213a.m33563e();
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
        return m34256d();
    }
}
