package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.a.a.a.a.b.a.a.c.a.d;
import com.google.a.a.a.a.b.a.a.f.g;
import com.google.a.a.a.a.b.a.a.i.a.a;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.k;
import com.google.p443h.p451c.p457c.p460b.p467d.C7180d;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7186d extends b {
    public String f35043a;
    public ad f35044b;
    public ae f35045c;
    public k f35046d;
    public g f35047e;
    public boolean f35048f;
    public String f35049g;
    public String f35050h;
    public d f35051i;
    public a f35052j;
    public C7180d[] f35053k;
    public com.google.a.a.a.a.b.a.a.k.a.a f35054l;

    public C7186d() {
        this.f35043a = "";
        this.f35044b = null;
        this.f35045c = null;
        this.f35046d = null;
        this.f35047e = null;
        this.f35048f = false;
        this.f35049g = "";
        this.f35050h = "";
        this.f35051i = null;
        this.f35052j = null;
        this.f35053k = C7180d.m32534d();
        this.f35054l = null;
        this.aP = -1;
    }

    public final void m32554a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f35043a == null || this.f35043a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f35043a);
        }
        if (this.f35044b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35044b);
        }
        if (this.f35045c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f35045c);
        }
        if (this.f35046d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f35046d);
        }
        if (this.f35047e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f35047e);
        }
        if (this.f35048f) {
            codedOutputByteBufferNano.m33522a(6, this.f35048f);
        }
        if (!(this.f35049g == null || this.f35049g.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f35049g);
        }
        if (!(this.f35050h == null || this.f35050h.equals(""))) {
            codedOutputByteBufferNano.m33521a(8, this.f35050h);
        }
        if (this.f35051i != null) {
            codedOutputByteBufferNano.m33532b(9, this.f35051i);
        }
        if (this.f35052j != null) {
            codedOutputByteBufferNano.m33532b(11, this.f35052j);
        }
        if (this.f35053k != null && this.f35053k.length > 0) {
            for (i iVar : this.f35053k) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(12, iVar);
                }
            }
        }
        if (this.f35054l != null) {
            codedOutputByteBufferNano.m33532b(13, this.f35054l);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32555b() {
        int b = super.b();
        if (!(this.f35043a == null || this.f35043a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35043a);
        }
        if (this.f35044b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f35044b);
        }
        if (this.f35045c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f35045c);
        }
        if (this.f35046d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f35046d);
        }
        if (this.f35047e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f35047e);
        }
        if (this.f35048f) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (!(this.f35049g == null || this.f35049g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f35049g);
        }
        if (!(this.f35050h == null || this.f35050h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f35050h);
        }
        if (this.f35051i != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f35051i);
        }
        if (this.f35052j != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f35052j);
        }
        if (this.f35053k != null && this.f35053k.length > 0) {
            int i = b;
            for (i iVar : this.f35053k) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(12, iVar);
                }
            }
            b = i;
        }
        if (this.f35054l != null) {
            return b + CodedOutputByteBufferNano.m33503d(13, this.f35054l);
        }
        return b;
    }

    public final /* synthetic */ i m32553a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35043a = c7213a.m33564f();
                    continue;
                case 18:
                    if (this.f35044b == null) {
                        this.f35044b = new ad();
                    }
                    c7213a.m33552a(this.f35044b);
                    continue;
                case 26:
                    if (this.f35045c == null) {
                        this.f35045c = new ae();
                    }
                    c7213a.m33552a(this.f35045c);
                    continue;
                case 34:
                    if (this.f35046d == null) {
                        this.f35046d = new k();
                    }
                    c7213a.m33552a(this.f35046d);
                    continue;
                case 42:
                    if (this.f35047e == null) {
                        this.f35047e = new g();
                    }
                    c7213a.m33552a(this.f35047e);
                    continue;
                case 48:
                    this.f35048f = c7213a.m33563e();
                    continue;
                case 58:
                    this.f35049g = c7213a.m33564f();
                    continue;
                case 66:
                    this.f35050h = c7213a.m33564f();
                    continue;
                case 74:
                    if (this.f35051i == null) {
                        this.f35051i = new d();
                    }
                    c7213a.m33552a(this.f35051i);
                    continue;
                case 90:
                    if (this.f35052j == null) {
                        this.f35052j = new a();
                    }
                    c7213a.m33552a(this.f35052j);
                    continue;
                case 98:
                    int a2 = C7222l.m33624a(c7213a, 98);
                    a = this.f35053k == null ? 0 : this.f35053k.length;
                    Object obj = new C7180d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35053k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7180d();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7180d();
                    c7213a.m33552a(obj[a]);
                    this.f35053k = obj;
                    continue;
                case 106:
                    if (this.f35054l == null) {
                        this.f35054l = new com.google.a.a.a.a.b.a.a.k.a.a();
                    }
                    c7213a.m33552a(this.f35054l);
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
}
