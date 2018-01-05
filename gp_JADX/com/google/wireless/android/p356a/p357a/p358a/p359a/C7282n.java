package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7282n extends b implements Cloneable {
    public String f36109a;
    public String f36110b;
    public String f36111c;
    public String f36112d;
    public String f36113e;
    public String f36114f;
    public String f36115g;

    public C7282n() {
        this.f36109a = "";
        this.f36110b = "";
        this.f36111c = "";
        this.f36112d = "";
        this.f36113e = "";
        this.f36114f = "";
        this.f36115g = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7282n m34427d() {
        try {
            return (C7282n) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7282n)) {
            return false;
        }
        C7282n c7282n = (C7282n) obj;
        if (this.f36109a == null) {
            if (c7282n.f36109a != null) {
                return false;
            }
        } else if (!this.f36109a.equals(c7282n.f36109a)) {
            return false;
        }
        if (this.f36110b == null) {
            if (c7282n.f36110b != null) {
                return false;
            }
        } else if (!this.f36110b.equals(c7282n.f36110b)) {
            return false;
        }
        if (this.f36111c == null) {
            if (c7282n.f36111c != null) {
                return false;
            }
        } else if (!this.f36111c.equals(c7282n.f36111c)) {
            return false;
        }
        if (this.f36112d == null) {
            if (c7282n.f36112d != null) {
                return false;
            }
        } else if (!this.f36112d.equals(c7282n.f36112d)) {
            return false;
        }
        if (this.f36113e == null) {
            if (c7282n.f36113e != null) {
                return false;
            }
        } else if (!this.f36113e.equals(c7282n.f36113e)) {
            return false;
        }
        if (this.f36114f == null) {
            if (c7282n.f36114f != null) {
                return false;
            }
        } else if (!this.f36114f.equals(c7282n.f36114f)) {
            return false;
        }
        if (this.f36115g == null) {
            if (c7282n.f36115g != null) {
                return false;
            }
        } else if (!this.f36115g.equals(c7282n.f36115g)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7282n.aO);
        }
        if (c7282n.aO == null || c7282n.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36115g == null ? 0 : this.f36115g.hashCode()) + (((this.f36114f == null ? 0 : this.f36114f.hashCode()) + (((this.f36113e == null ? 0 : this.f36113e.hashCode()) + (((this.f36112d == null ? 0 : this.f36112d.hashCode()) + (((this.f36111c == null ? 0 : this.f36111c.hashCode()) + (((this.f36110b == null ? 0 : this.f36110b.hashCode()) + (((this.f36109a == null ? 0 : this.f36109a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34429a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36109a == null || this.f36109a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36109a);
        }
        if (!(this.f36111c == null || this.f36111c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36111c);
        }
        if (!(this.f36112d == null || this.f36112d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36112d);
        }
        if (!(this.f36113e == null || this.f36113e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36113e);
        }
        if (!(this.f36114f == null || this.f36114f.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36114f);
        }
        if (!(this.f36110b == null || this.f36110b.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36110b);
        }
        if (!(this.f36115g == null || this.f36115g.equals(""))) {
            codedOutputByteBufferNano.m33521a(8, this.f36115g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34430b() {
        int b = super.b();
        if (!(this.f36109a == null || this.f36109a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36109a);
        }
        if (!(this.f36111c == null || this.f36111c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36111c);
        }
        if (!(this.f36112d == null || this.f36112d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36112d);
        }
        if (!(this.f36113e == null || this.f36113e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36113e);
        }
        if (!(this.f36114f == null || this.f36114f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36114f);
        }
        if (!(this.f36110b == null || this.f36110b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36110b);
        }
        if (this.f36115g == null || this.f36115g.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(8, this.f36115g);
    }

    public final /* synthetic */ b cK_() {
        return (C7282n) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7282n) clone();
    }

    public final /* synthetic */ i m34428a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36109a = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36111c = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36112d = c7213a.m33564f();
                    continue;
                case 42:
                    this.f36113e = c7213a.m33564f();
                    continue;
                case 50:
                    this.f36114f = c7213a.m33564f();
                    continue;
                case 58:
                    this.f36110b = c7213a.m33564f();
                    continue;
                case 66:
                    this.f36115g = c7213a.m33564f();
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
        return m34427d();
    }
}
