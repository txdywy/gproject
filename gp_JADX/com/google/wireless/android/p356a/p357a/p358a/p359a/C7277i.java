package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7277i extends b implements Cloneable {
    public String f36076a;
    public String f36077b;
    public String f36078c;
    public String f36079d;
    public String f36080e;
    public String f36081f;
    public String f36082g;
    public String f36083h;
    public String f36084i;
    public int f36085j;
    public int f36086k;
    public String f36087l;

    public C7277i() {
        this.f36076a = "";
        this.f36077b = "";
        this.f36078c = "";
        this.f36079d = "";
        this.f36080e = "";
        this.f36081f = "";
        this.f36082g = "";
        this.f36083h = "";
        this.f36084i = "";
        this.f36085j = 0;
        this.f36086k = 0;
        this.f36087l = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7277i m34404d() {
        try {
            return (C7277i) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7277i)) {
            return false;
        }
        C7277i c7277i = (C7277i) obj;
        if (this.f36076a == null) {
            if (c7277i.f36076a != null) {
                return false;
            }
        } else if (!this.f36076a.equals(c7277i.f36076a)) {
            return false;
        }
        if (this.f36077b == null) {
            if (c7277i.f36077b != null) {
                return false;
            }
        } else if (!this.f36077b.equals(c7277i.f36077b)) {
            return false;
        }
        if (this.f36078c == null) {
            if (c7277i.f36078c != null) {
                return false;
            }
        } else if (!this.f36078c.equals(c7277i.f36078c)) {
            return false;
        }
        if (this.f36079d == null) {
            if (c7277i.f36079d != null) {
                return false;
            }
        } else if (!this.f36079d.equals(c7277i.f36079d)) {
            return false;
        }
        if (this.f36080e == null) {
            if (c7277i.f36080e != null) {
                return false;
            }
        } else if (!this.f36080e.equals(c7277i.f36080e)) {
            return false;
        }
        if (this.f36081f == null) {
            if (c7277i.f36081f != null) {
                return false;
            }
        } else if (!this.f36081f.equals(c7277i.f36081f)) {
            return false;
        }
        if (this.f36082g == null) {
            if (c7277i.f36082g != null) {
                return false;
            }
        } else if (!this.f36082g.equals(c7277i.f36082g)) {
            return false;
        }
        if (this.f36083h == null) {
            if (c7277i.f36083h != null) {
                return false;
            }
        } else if (!this.f36083h.equals(c7277i.f36083h)) {
            return false;
        }
        if (this.f36084i == null) {
            if (c7277i.f36084i != null) {
                return false;
            }
        } else if (!this.f36084i.equals(c7277i.f36084i)) {
            return false;
        }
        if (this.f36085j != c7277i.f36085j) {
            return false;
        }
        if (this.f36086k != c7277i.f36086k) {
            return false;
        }
        if (this.f36087l == null) {
            if (c7277i.f36087l != null) {
                return false;
            }
        } else if (!this.f36087l.equals(c7277i.f36087l)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7277i.aO);
        }
        if (c7277i.aO == null || c7277i.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36087l == null ? 0 : this.f36087l.hashCode()) + (((((((this.f36084i == null ? 0 : this.f36084i.hashCode()) + (((this.f36083h == null ? 0 : this.f36083h.hashCode()) + (((this.f36082g == null ? 0 : this.f36082g.hashCode()) + (((this.f36081f == null ? 0 : this.f36081f.hashCode()) + (((this.f36080e == null ? 0 : this.f36080e.hashCode()) + (((this.f36079d == null ? 0 : this.f36079d.hashCode()) + (((this.f36078c == null ? 0 : this.f36078c.hashCode()) + (((this.f36077b == null ? 0 : this.f36077b.hashCode()) + (((this.f36076a == null ? 0 : this.f36076a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f36085j) * 31) + this.f36086k) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34406a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36076a == null || this.f36076a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36076a);
        }
        if (!(this.f36077b == null || this.f36077b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36077b);
        }
        if (!(this.f36078c == null || this.f36078c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36078c);
        }
        if (!(this.f36079d == null || this.f36079d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36079d);
        }
        if (!(this.f36080e == null || this.f36080e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36080e);
        }
        if (!(this.f36082g == null || this.f36082g.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36082g);
        }
        if (!(this.f36083h == null || this.f36083h.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36083h);
        }
        if (!(this.f36084i == null || this.f36084i.equals(""))) {
            codedOutputByteBufferNano.m33521a(8, this.f36084i);
        }
        if (this.f36085j != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f36085j);
        }
        if (this.f36086k != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f36086k);
        }
        if (!(this.f36087l == null || this.f36087l.equals(""))) {
            codedOutputByteBufferNano.m33521a(11, this.f36087l);
        }
        if (!(this.f36081f == null || this.f36081f.equals(""))) {
            codedOutputByteBufferNano.m33521a(12, this.f36081f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34407b() {
        int b = super.b();
        if (!(this.f36076a == null || this.f36076a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36076a);
        }
        if (!(this.f36077b == null || this.f36077b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36077b);
        }
        if (!(this.f36078c == null || this.f36078c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36078c);
        }
        if (!(this.f36079d == null || this.f36079d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36079d);
        }
        if (!(this.f36080e == null || this.f36080e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36080e);
        }
        if (!(this.f36082g == null || this.f36082g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36082g);
        }
        if (!(this.f36083h == null || this.f36083h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36083h);
        }
        if (!(this.f36084i == null || this.f36084i.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36084i);
        }
        if (this.f36085j != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f36085j);
        }
        if (this.f36086k != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f36086k);
        }
        if (!(this.f36087l == null || this.f36087l.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f36087l);
        }
        if (this.f36081f == null || this.f36081f.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(12, this.f36081f);
    }

    public final /* synthetic */ b cK_() {
        return (C7277i) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7277i) clone();
    }

    public final /* synthetic */ i m34405a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36076a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36077b = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36078c = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36079d = c7213a.m33564f();
                    continue;
                case 42:
                    this.f36080e = c7213a.m33564f();
                    continue;
                case 50:
                    this.f36082g = c7213a.m33564f();
                    continue;
                case 58:
                    this.f36083h = c7213a.m33564f();
                    continue;
                case 66:
                    this.f36084i = c7213a.m33564f();
                    continue;
                case 72:
                    this.f36085j = c7213a.m33567i();
                    continue;
                case 80:
                    this.f36086k = c7213a.m33567i();
                    continue;
                case 90:
                    this.f36087l = c7213a.m33564f();
                    continue;
                case 98:
                    this.f36081f = c7213a.m33564f();
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
        return m34404d();
    }
}
