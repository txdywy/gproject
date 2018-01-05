package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7104m extends b implements Cloneable {
    public long f34752a;
    public String f34753b;
    public int f34754c;
    public byte[] f34755d;

    public C7104m() {
        this.f34752a = 0;
        this.f34753b = "";
        this.f34754c = 0;
        this.f34755d = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    private final C7104m m32285d() {
        try {
            return (C7104m) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7104m)) {
            return false;
        }
        C7104m c7104m = (C7104m) obj;
        if (this.f34752a != c7104m.f34752a) {
            return false;
        }
        if (this.f34753b == null) {
            if (c7104m.f34753b != null) {
                return false;
            }
        } else if (!this.f34753b.equals(c7104m.f34753b)) {
            return false;
        }
        if (this.f34754c != c7104m.f34754c) {
            return false;
        }
        if (!Arrays.equals(this.f34755d, c7104m.f34755d)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7104m.aO);
        }
        if (c7104m.aO == null || c7104m.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f34753b == null ? 0 : this.f34753b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f34752a ^ (this.f34752a >>> 32)))) * 31)) * 31) + this.f34754c) * 31) + Arrays.hashCode(this.f34755d)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32287a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34752a != 0) {
            codedOutputByteBufferNano.m33519a(1, this.f34752a);
        }
        if (!(this.f34753b == null || this.f34753b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34753b);
        }
        if (this.f34754c != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34754c);
        }
        if (!Arrays.equals(this.f34755d, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(4, this.f34755d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32288b() {
        int b = super.b();
        if (this.f34752a != 0) {
            b += CodedOutputByteBufferNano.m33505e(1, this.f34752a);
        }
        if (!(this.f34753b == null || this.f34753b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34753b);
        }
        if (this.f34754c != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f34754c);
        }
        if (Arrays.equals(this.f34755d, C7222l.f35479l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33494b(4, this.f34755d);
    }

    public final /* synthetic */ b cK_() {
        return (C7104m) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7104m) clone();
    }

    public final /* synthetic */ i m32286a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34752a = c7213a.m33568j();
                    continue;
                case 18:
                    this.f34753b = c7213a.m33564f();
                    continue;
                case 24:
                    this.f34754c = c7213a.m33567i();
                    continue;
                case 34:
                    this.f34755d = c7213a.m33565g();
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
        return m32285d();
    }
}
