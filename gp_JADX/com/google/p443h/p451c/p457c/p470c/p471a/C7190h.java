package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.a.a.a.a.b.a.c.c;
import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.f;
import com.google.a.a.a.a.b.a.c.h;
import com.google.p443h.p451c.p457c.p460b.p467d.C7179c;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7190h extends b {
    public h f35062a;
    public e f35063b;
    public f f35064c;
    public int f35065d;
    public C7186d f35066e;
    public String f35067f;
    public C7184b f35068g;
    public c f35069h;

    public C7190h() {
        this.f35062a = null;
        this.f35063b = null;
        this.f35064c = null;
        this.f35065d = 0;
        this.f35066e = null;
        this.f35067f = "";
        this.f35068g = null;
        this.f35069h = null;
        this.aP = -1;
    }

    public final void m32567a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35062a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35062a);
        }
        if (this.f35063b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35063b);
        }
        if (this.f35064c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f35064c);
        }
        if (this.f35065d != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35065d);
        }
        if (this.f35066e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f35066e);
        }
        if (!(this.f35067f == null || this.f35067f.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f35067f);
        }
        if (this.f35069h != null) {
            codedOutputByteBufferNano.m33532b(8, this.f35069h);
        }
        if (this.f35068g != null) {
            codedOutputByteBufferNano.m33532b(10, this.f35068g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32568b() {
        int b = super.b();
        if (this.f35062a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35062a);
        }
        if (this.f35063b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f35063b);
        }
        if (this.f35064c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f35064c);
        }
        if (this.f35065d != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35065d);
        }
        if (this.f35066e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f35066e);
        }
        if (!(this.f35067f == null || this.f35067f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f35067f);
        }
        if (this.f35069h != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f35069h);
        }
        if (this.f35068g != null) {
            return b + CodedOutputByteBufferNano.m33503d(10, this.f35068g);
        }
        return b;
    }

    private final C7190h m32565b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35062a == null) {
                        this.f35062a = new h();
                    }
                    c7213a.m33552a(this.f35062a);
                    continue;
                case 18:
                    if (this.f35063b == null) {
                        this.f35063b = new e();
                    }
                    c7213a.m33552a(this.f35063b);
                    continue;
                case 26:
                    if (this.f35064c == null) {
                        this.f35064c = new f();
                    }
                    c7213a.m33552a(this.f35064c);
                    continue;
                case 32:
                    int o = c7213a.m33573o();
                    try {
                        this.f35065d = C7179c.m32533a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 42:
                    if (this.f35066e == null) {
                        this.f35066e = new C7186d();
                    }
                    c7213a.m33552a(this.f35066e);
                    continue;
                case 50:
                    this.f35067f = c7213a.m33564f();
                    continue;
                case 66:
                    if (this.f35069h == null) {
                        this.f35069h = new c();
                    }
                    c7213a.m33552a(this.f35069h);
                    continue;
                case 82:
                    if (this.f35068g == null) {
                        this.f35068g = new C7184b();
                    }
                    c7213a.m33552a(this.f35068g);
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

    public final /* synthetic */ i m32566a(C7213a c7213a) {
        return m32565b(c7213a);
    }
}
