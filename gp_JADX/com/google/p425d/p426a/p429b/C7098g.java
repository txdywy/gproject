package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7098g extends b implements Cloneable {
    public C7094c[] f34727a;
    public byte[] f34728b;
    public String f34729c;
    public long f34730d;
    public long f34731e;

    public C7098g() {
        this.f34727a = C7094c.m32236d();
        this.f34728b = C7222l.f35479l;
        this.f34729c = "";
        this.f34730d = 0;
        this.f34731e = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7098g m32256d() {
        try {
            C7098g c7098g = (C7098g) super.cK_();
            if (this.f34727a != null && this.f34727a.length > 0) {
                c7098g.f34727a = new C7094c[this.f34727a.length];
                for (int i = 0; i < this.f34727a.length; i++) {
                    if (this.f34727a[i] != null) {
                        c7098g.f34727a[i] = (C7094c) this.f34727a[i].clone();
                    }
                }
            }
            return c7098g;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7098g)) {
            return false;
        }
        C7098g c7098g = (C7098g) obj;
        if (!C7219h.m33616a(this.f34727a, c7098g.f34727a)) {
            return false;
        }
        if (!Arrays.equals(this.f34728b, c7098g.f34728b)) {
            return false;
        }
        if (this.f34729c == null) {
            if (c7098g.f34729c != null) {
                return false;
            }
        } else if (!this.f34729c.equals(c7098g.f34729c)) {
            return false;
        }
        if (this.f34730d != c7098g.f34730d) {
            return false;
        }
        if (this.f34731e != c7098g.f34731e) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7098g.aO);
        }
        if (c7098g.aO == null || c7098g.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f34729c == null ? 0 : this.f34729c.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + C7219h.m33609a(this.f34727a)) * 31) + Arrays.hashCode(this.f34728b)) * 31)) * 31) + ((int) (this.f34730d ^ (this.f34730d >>> 32)))) * 31) + ((int) (this.f34731e ^ (this.f34731e >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32258a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34727a != null && this.f34727a.length > 0) {
            for (i iVar : this.f34727a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (!Arrays.equals(this.f34728b, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(2, this.f34728b);
        }
        if (!(this.f34729c == null || this.f34729c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f34729c);
        }
        if (this.f34730d != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f34730d);
        }
        if (this.f34731e != 0) {
            codedOutputByteBufferNano.m33531b(5, this.f34731e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32259b() {
        int b = super.b();
        if (this.f34727a != null && this.f34727a.length > 0) {
            for (i iVar : this.f34727a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if (!Arrays.equals(this.f34728b, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f34728b);
        }
        if (!(this.f34729c == null || this.f34729c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f34729c);
        }
        if (this.f34730d != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f34730d);
        }
        if (this.f34731e != 0) {
            return b + CodedOutputByteBufferNano.m33508f(5, this.f34731e);
        }
        return b;
    }

    public final /* synthetic */ b cK_() {
        return (C7098g) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7098g) clone();
    }

    public final /* synthetic */ i m32257a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f34727a == null ? 0 : this.f34727a.length;
                    Object obj = new C7094c[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34727a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7094c();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7094c();
                    c7213a.m33552a(obj[a]);
                    this.f34727a = obj;
                    continue;
                case 18:
                    this.f34728b = c7213a.m33565g();
                    continue;
                case 26:
                    this.f34729c = c7213a.m33564f();
                    continue;
                case 32:
                    this.f34730d = c7213a.m33568j();
                    continue;
                case 40:
                    this.f34731e = c7213a.m33568j();
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
        return m32256d();
    }
}
