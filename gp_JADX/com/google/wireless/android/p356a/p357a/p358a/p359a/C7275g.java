package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7275g extends b implements Cloneable {
    public String f36063a;
    public String f36064b;
    public String f36065c;
    public String f36066d;
    public String f36067e;
    public String f36068f;
    public String f36069g;
    public int f36070h;
    public int f36071i;

    public C7275g() {
        this.f36063a = "";
        this.f36064b = "";
        this.f36065c = "";
        this.f36066d = "";
        this.f36067e = "";
        this.f36068f = "";
        this.f36069g = "";
        this.f36070h = 0;
        this.f36071i = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C7275g m34396d() {
        try {
            return (C7275g) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7275g)) {
            return false;
        }
        C7275g c7275g = (C7275g) obj;
        if (this.f36063a == null) {
            if (c7275g.f36063a != null) {
                return false;
            }
        } else if (!this.f36063a.equals(c7275g.f36063a)) {
            return false;
        }
        if (this.f36064b == null) {
            if (c7275g.f36064b != null) {
                return false;
            }
        } else if (!this.f36064b.equals(c7275g.f36064b)) {
            return false;
        }
        if (this.f36065c == null) {
            if (c7275g.f36065c != null) {
                return false;
            }
        } else if (!this.f36065c.equals(c7275g.f36065c)) {
            return false;
        }
        if (this.f36066d == null) {
            if (c7275g.f36066d != null) {
                return false;
            }
        } else if (!this.f36066d.equals(c7275g.f36066d)) {
            return false;
        }
        if (this.f36067e == null) {
            if (c7275g.f36067e != null) {
                return false;
            }
        } else if (!this.f36067e.equals(c7275g.f36067e)) {
            return false;
        }
        if (this.f36068f == null) {
            if (c7275g.f36068f != null) {
                return false;
            }
        } else if (!this.f36068f.equals(c7275g.f36068f)) {
            return false;
        }
        if (this.f36069g == null) {
            if (c7275g.f36069g != null) {
                return false;
            }
        } else if (!this.f36069g.equals(c7275g.f36069g)) {
            return false;
        }
        if (this.f36070h != c7275g.f36070h) {
            return false;
        }
        if (this.f36071i != c7275g.f36071i) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7275g.aO);
        }
        if (c7275g.aO == null || c7275g.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f36069g == null ? 0 : this.f36069g.hashCode()) + (((this.f36068f == null ? 0 : this.f36068f.hashCode()) + (((this.f36067e == null ? 0 : this.f36067e.hashCode()) + (((this.f36066d == null ? 0 : this.f36066d.hashCode()) + (((this.f36065c == null ? 0 : this.f36065c.hashCode()) + (((this.f36064b == null ? 0 : this.f36064b.hashCode()) + (((this.f36063a == null ? 0 : this.f36063a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f36070h) * 31) + this.f36071i) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34398a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36063a == null || this.f36063a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36063a);
        }
        if (!(this.f36064b == null || this.f36064b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36064b);
        }
        if (!(this.f36065c == null || this.f36065c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36065c);
        }
        if (!(this.f36066d == null || this.f36066d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36066d);
        }
        if (!(this.f36067e == null || this.f36067e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36067e);
        }
        if (!(this.f36068f == null || this.f36068f.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36068f);
        }
        if (!(this.f36069g == null || this.f36069g.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36069g);
        }
        if (this.f36070h != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f36070h);
        }
        if (this.f36071i != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f36071i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34399b() {
        int b = super.b();
        if (!(this.f36063a == null || this.f36063a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36063a);
        }
        if (!(this.f36064b == null || this.f36064b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36064b);
        }
        if (!(this.f36065c == null || this.f36065c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36065c);
        }
        if (!(this.f36066d == null || this.f36066d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36066d);
        }
        if (!(this.f36067e == null || this.f36067e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36067e);
        }
        if (!(this.f36068f == null || this.f36068f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36068f);
        }
        if (!(this.f36069g == null || this.f36069g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36069g);
        }
        if (this.f36070h != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f36070h);
        }
        if (this.f36071i != 0) {
            return b + CodedOutputByteBufferNano.m33502d(9, this.f36071i);
        }
        return b;
    }

    public final /* synthetic */ b cK_() {
        return (C7275g) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7275g) clone();
    }

    public final /* synthetic */ i m34397a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36063a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36064b = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36065c = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36066d = c7213a.m33564f();
                    continue;
                case 42:
                    this.f36067e = c7213a.m33564f();
                    continue;
                case 50:
                    this.f36068f = c7213a.m33564f();
                    continue;
                case 58:
                    this.f36069g = c7213a.m33564f();
                    continue;
                case 64:
                    this.f36070h = c7213a.m33567i();
                    continue;
                case 72:
                    this.f36071i = c7213a.m33567i();
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
        return m34396d();
    }
}
