package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7284p extends b implements Cloneable {
    public String f36126a;
    public String f36127b;
    public String f36128c;
    public String f36129d;
    public String f36130e;
    public String f36131f;

    public C7284p() {
        this.f36126a = "";
        this.f36127b = "";
        this.f36128c = "";
        this.f36129d = "";
        this.f36130e = "";
        this.f36131f = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7284p m34436d() {
        try {
            return (C7284p) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7284p)) {
            return false;
        }
        C7284p c7284p = (C7284p) obj;
        if (this.f36126a == null) {
            if (c7284p.f36126a != null) {
                return false;
            }
        } else if (!this.f36126a.equals(c7284p.f36126a)) {
            return false;
        }
        if (this.f36127b == null) {
            if (c7284p.f36127b != null) {
                return false;
            }
        } else if (!this.f36127b.equals(c7284p.f36127b)) {
            return false;
        }
        if (this.f36128c == null) {
            if (c7284p.f36128c != null) {
                return false;
            }
        } else if (!this.f36128c.equals(c7284p.f36128c)) {
            return false;
        }
        if (this.f36129d == null) {
            if (c7284p.f36129d != null) {
                return false;
            }
        } else if (!this.f36129d.equals(c7284p.f36129d)) {
            return false;
        }
        if (this.f36130e == null) {
            if (c7284p.f36130e != null) {
                return false;
            }
        } else if (!this.f36130e.equals(c7284p.f36130e)) {
            return false;
        }
        if (this.f36131f == null) {
            if (c7284p.f36131f != null) {
                return false;
            }
        } else if (!this.f36131f.equals(c7284p.f36131f)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7284p.aO);
        }
        if (c7284p.aO == null || c7284p.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36131f == null ? 0 : this.f36131f.hashCode()) + (((this.f36130e == null ? 0 : this.f36130e.hashCode()) + (((this.f36129d == null ? 0 : this.f36129d.hashCode()) + (((this.f36128c == null ? 0 : this.f36128c.hashCode()) + (((this.f36127b == null ? 0 : this.f36127b.hashCode()) + (((this.f36126a == null ? 0 : this.f36126a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34438a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36126a == null || this.f36126a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36126a);
        }
        if (!(this.f36127b == null || this.f36127b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36127b);
        }
        if (!(this.f36128c == null || this.f36128c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36128c);
        }
        if (!(this.f36129d == null || this.f36129d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36129d);
        }
        if (!(this.f36130e == null || this.f36130e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36130e);
        }
        if (!(this.f36131f == null || this.f36131f.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36131f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34439b() {
        int b = super.b();
        if (!(this.f36126a == null || this.f36126a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36126a);
        }
        if (!(this.f36127b == null || this.f36127b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36127b);
        }
        if (!(this.f36128c == null || this.f36128c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36128c);
        }
        if (!(this.f36129d == null || this.f36129d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36129d);
        }
        if (!(this.f36130e == null || this.f36130e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36130e);
        }
        if (this.f36131f == null || this.f36131f.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(6, this.f36131f);
    }

    public final /* synthetic */ b cK_() {
        return (C7284p) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7284p) clone();
    }

    public final /* synthetic */ i m34437a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36126a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36127b = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36128c = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36129d = c7213a.m33564f();
                    continue;
                case 42:
                    this.f36130e = c7213a.m33564f();
                    continue;
                case 50:
                    this.f36131f = c7213a.m33564f();
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
        return m34436d();
    }
}
