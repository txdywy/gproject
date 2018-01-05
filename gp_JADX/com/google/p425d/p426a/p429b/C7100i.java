package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7100i extends b implements Cloneable {
    public byte[] f34742a;

    public C7100i() {
        this.f34742a = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    private final C7100i m32266d() {
        try {
            return (C7100i) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7100i)) {
            return false;
        }
        C7100i c7100i = (C7100i) obj;
        if (!Arrays.equals(this.f34742a, c7100i.f34742a)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7100i.aO);
        }
        if (c7100i.aO == null || c7100i.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f34742a)) * 31;
        if (this.aO == null || this.aO.m33598b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void m32268a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f34742a, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(1, this.f34742a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32269b() {
        int b = super.b();
        if (Arrays.equals(this.f34742a, C7222l.f35479l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33494b(1, this.f34742a);
    }

    public final /* synthetic */ b cK_() {
        return (C7100i) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7100i) clone();
    }

    public final /* synthetic */ i m32267a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34742a = c7213a.m33565g();
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
        return m32266d();
    }
}
