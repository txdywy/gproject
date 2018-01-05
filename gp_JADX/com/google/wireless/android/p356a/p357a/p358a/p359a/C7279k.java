package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7279k extends b implements Cloneable {
    public String f36095a;
    public String f36096b;
    public String f36097c;
    public String f36098d;
    public int f36099e;
    public int f36100f;
    public String f36101g;

    public C7279k() {
        this.f36095a = "";
        this.f36096b = "";
        this.f36097c = "";
        this.f36098d = "";
        this.f36099e = 0;
        this.f36100f = 0;
        this.f36101g = "";
        this.aO = null;
        this.aP = -1;
    }

    private final C7279k m34413d() {
        try {
            return (C7279k) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7279k)) {
            return false;
        }
        C7279k c7279k = (C7279k) obj;
        if (this.f36095a == null) {
            if (c7279k.f36095a != null) {
                return false;
            }
        } else if (!this.f36095a.equals(c7279k.f36095a)) {
            return false;
        }
        if (this.f36096b == null) {
            if (c7279k.f36096b != null) {
                return false;
            }
        } else if (!this.f36096b.equals(c7279k.f36096b)) {
            return false;
        }
        if (this.f36097c == null) {
            if (c7279k.f36097c != null) {
                return false;
            }
        } else if (!this.f36097c.equals(c7279k.f36097c)) {
            return false;
        }
        if (this.f36098d == null) {
            if (c7279k.f36098d != null) {
                return false;
            }
        } else if (!this.f36098d.equals(c7279k.f36098d)) {
            return false;
        }
        if (this.f36099e != c7279k.f36099e) {
            return false;
        }
        if (this.f36100f != c7279k.f36100f) {
            return false;
        }
        if (this.f36101g == null) {
            if (c7279k.f36101g != null) {
                return false;
            }
        } else if (!this.f36101g.equals(c7279k.f36101g)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7279k.aO);
        }
        if (c7279k.aO == null || c7279k.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.f36101g == null ? 0 : this.f36101g.hashCode()) + (((((((this.f36098d == null ? 0 : this.f36098d.hashCode()) + (((this.f36097c == null ? 0 : this.f36097c.hashCode()) + (((this.f36096b == null ? 0 : this.f36096b.hashCode()) + (((this.f36095a == null ? 0 : this.f36095a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31) + this.f36099e) * 31) + this.f36100f) * 31)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m34415a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36095a == null || this.f36095a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36095a);
        }
        if (!(this.f36096b == null || this.f36096b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36096b);
        }
        if (!(this.f36097c == null || this.f36097c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36097c);
        }
        if (!(this.f36098d == null || this.f36098d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36098d);
        }
        if (this.f36099e != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f36099e);
        }
        if (this.f36100f != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f36100f);
        }
        if (!(this.f36101g == null || this.f36101g.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36101g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34416b() {
        int b = super.b();
        if (!(this.f36095a == null || this.f36095a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36095a);
        }
        if (!(this.f36096b == null || this.f36096b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36096b);
        }
        if (!(this.f36097c == null || this.f36097c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36097c);
        }
        if (!(this.f36098d == null || this.f36098d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36098d);
        }
        if (this.f36099e != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f36099e);
        }
        if (this.f36100f != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f36100f);
        }
        if (this.f36101g == null || this.f36101g.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(7, this.f36101g);
    }

    public final /* synthetic */ b cK_() {
        return (C7279k) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7279k) clone();
    }

    public final /* synthetic */ i m34414a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36095a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36096b = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36097c = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36098d = c7213a.m33564f();
                    continue;
                case 40:
                    this.f36099e = c7213a.m33567i();
                    continue;
                case 48:
                    this.f36100f = c7213a.m33567i();
                    continue;
                case 58:
                    this.f36101g = c7213a.m33564f();
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
        return m34413d();
    }
}
