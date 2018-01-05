package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7273e extends b implements Cloneable {
    public String f36044a;
    public String f36045b;
    public String f36046c;
    public String f36047d;

    public C7273e() {
        this.f36044a = "";
        this.f36045b = "";
        this.f36046c = "";
        this.f36047d = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7273e m34387d() {
        try {
            return (C7273e) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7273e)) {
            return false;
        }
        C7273e c7273e = (C7273e) obj;
        if (this.f36044a == null) {
            if (c7273e.f36044a != null) {
                return false;
            }
        } else if (!this.f36044a.equals(c7273e.f36044a)) {
            return false;
        }
        if (this.f36045b == null) {
            if (c7273e.f36045b != null) {
                return false;
            }
        } else if (!this.f36045b.equals(c7273e.f36045b)) {
            return false;
        }
        if (this.f36046c == null) {
            if (c7273e.f36046c != null) {
                return false;
            }
        } else if (!this.f36046c.equals(c7273e.f36046c)) {
            return false;
        }
        if (this.f36047d == null) {
            if (c7273e.f36047d != null) {
                return false;
            }
        } else if (!this.f36047d.equals(c7273e.f36047d)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7273e.aO);
        }
        if (c7273e.aO == null || c7273e.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36047d == null ? 0 : this.f36047d.hashCode()) + (((this.f36046c == null ? 0 : this.f36046c.hashCode()) + (((this.f36045b == null ? 0 : this.f36045b.hashCode()) + (((this.f36044a == null ? 0 : this.f36044a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34389a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36044a == null || this.f36044a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36044a);
        }
        if (!(this.f36045b == null || this.f36045b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36045b);
        }
        if (!(this.f36046c == null || this.f36046c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36046c);
        }
        if (!(this.f36047d == null || this.f36047d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36047d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34390b() {
        int b = super.b();
        if (!(this.f36044a == null || this.f36044a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36044a);
        }
        if (!(this.f36045b == null || this.f36045b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36045b);
        }
        if (!(this.f36046c == null || this.f36046c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36046c);
        }
        if (this.f36047d == null || this.f36047d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(4, this.f36047d);
    }

    public final /* synthetic */ b cK_() {
        return (C7273e) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7273e) clone();
    }

    public final /* synthetic */ i m34388a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36044a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36045b = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36046c = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36047d = c7213a.m33564f();
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
        return m34387d();
    }
}
