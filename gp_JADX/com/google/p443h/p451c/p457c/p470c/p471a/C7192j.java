package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import com.google.p443h.p451c.p457c.p460b.p467d.C7180d;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7192j extends b {
    public int f35070a;
    public C7188f f35071b;
    public C7185c f35072c;
    public C7178b f35073d;
    public C7180d[] f35074e;
    public boolean f35075f;
    public C7180d[] f35076g;

    public C7192j() {
        this.f35070a = -1;
        this.f35071b = null;
        this.f35072c = null;
        this.f35070a = -1;
        this.f35073d = null;
        this.f35074e = C7180d.m32534d();
        this.f35075f = false;
        this.f35076g = C7180d.m32534d();
        this.aP = -1;
    }

    public final void m32570a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f35071b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35071b);
        }
        if (this.f35072c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35072c);
        }
        if (this.f35070a == 0) {
            codedOutputByteBufferNano.m33532b(3, this.f35073d);
        }
        if (this.f35074e != null && this.f35074e.length > 0) {
            for (i iVar : this.f35074e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if (this.f35075f) {
            codedOutputByteBufferNano.m33522a(5, this.f35075f);
        }
        if (this.f35076g != null && this.f35076g.length > 0) {
            while (i < this.f35076g.length) {
                i iVar2 = this.f35076g[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32571b() {
        int i = 0;
        int b = super.b();
        if (this.f35071b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35071b);
        }
        if (this.f35072c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f35072c);
        }
        if (this.f35070a == 0) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f35073d);
        }
        if (this.f35074e != null && this.f35074e.length > 0) {
            int i2 = b;
            for (i iVar : this.f35074e) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i2;
        }
        if (this.f35075f) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if (this.f35076g != null && this.f35076g.length > 0) {
            while (i < this.f35076g.length) {
                i iVar2 = this.f35076g[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(6, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m32569a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35071b == null) {
                        this.f35071b = new C7188f();
                    }
                    c7213a.m33552a(this.f35071b);
                    continue;
                case 18:
                    if (this.f35072c == null) {
                        this.f35072c = new C7185c();
                    }
                    c7213a.m33552a(this.f35072c);
                    continue;
                case 26:
                    if (this.f35073d == null) {
                        this.f35073d = new C7178b();
                    }
                    c7213a.m33552a(this.f35073d);
                    this.f35070a = 0;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f35074e == null ? 0 : this.f35074e.length;
                    obj = new C7180d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35074e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7180d();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7180d();
                    c7213a.m33552a(obj[a]);
                    this.f35074e = obj;
                    continue;
                case 40:
                    this.f35075f = c7213a.m33563e();
                    continue;
                case 50:
                    a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f35076g == null ? 0 : this.f35076g.length;
                    obj = new C7180d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35076g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7180d();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7180d();
                    c7213a.m33552a(obj[a]);
                    this.f35076g = obj;
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
