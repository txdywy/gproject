package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7093b extends b implements Cloneable {
    public static volatile C7093b[] f34697a;
    public C7103l f34698b;
    public byte[] f34699c;
    public C7102k[] f34700d;

    public static C7093b[] m32231d() {
        if (f34697a == null) {
            synchronized (C7219h.f35465b) {
                if (f34697a == null) {
                    f34697a = new C7093b[0];
                }
            }
        }
        return f34697a;
    }

    public C7093b() {
        this.f34698b = null;
        this.f34699c = C7222l.f35479l;
        this.f34700d = C7102k.m32276d();
        this.aO = null;
        this.aP = -1;
    }

    private final C7093b m32232e() {
        try {
            C7093b c7093b = (C7093b) super.cK_();
            if (this.f34698b != null) {
                c7093b.f34698b = (C7103l) this.f34698b.clone();
            }
            if (this.f34700d != null && this.f34700d.length > 0) {
                c7093b.f34700d = new C7102k[this.f34700d.length];
                for (int i = 0; i < this.f34700d.length; i++) {
                    if (this.f34700d[i] != null) {
                        c7093b.f34700d[i] = (C7102k) this.f34700d[i].clone();
                    }
                }
            }
            return c7093b;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7093b)) {
            return false;
        }
        C7093b c7093b = (C7093b) obj;
        if (this.f34698b == null) {
            if (c7093b.f34698b != null) {
                return false;
            }
        } else if (!this.f34698b.equals(c7093b.f34698b)) {
            return false;
        }
        if (!Arrays.equals(this.f34699c, c7093b.f34699c)) {
            return false;
        }
        if (!C7219h.m33616a(this.f34700d, c7093b.f34700d)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7093b.aO);
        }
        if (c7093b.aO == null || c7093b.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C7103l c7103l = this.f34698b;
        hashCode = ((((((c7103l == null ? 0 : c7103l.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f34699c)) * 31) + C7219h.m33609a(this.f34700d)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32234a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34698b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34698b);
        }
        if (!Arrays.equals(this.f34699c, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(2, this.f34699c);
        }
        if (this.f34700d != null && this.f34700d.length > 0) {
            for (i iVar : this.f34700d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32235b() {
        int b = super.b();
        if (this.f34698b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34698b);
        }
        if (!Arrays.equals(this.f34699c, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f34699c);
        }
        if (this.f34700d == null || this.f34700d.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f34700d) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(3, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ b cK_() {
        return (C7093b) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7093b) clone();
    }

    public final /* synthetic */ i m32233a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34698b == null) {
                        this.f34698b = new C7103l();
                    }
                    c7213a.m33552a(this.f34698b);
                    continue;
                case 18:
                    this.f34699c = c7213a.m33565g();
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f34700d == null ? 0 : this.f34700d.length;
                    Object obj = new C7102k[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34700d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7102k();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7102k();
                    c7213a.m33552a(obj[a]);
                    this.f34700d = obj;
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
        return m32232e();
    }
}
