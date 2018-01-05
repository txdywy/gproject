package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.f;
import com.google.a.a.a.a.b.a.c.h;
import com.google.p443h.p451c.p457c.p460b.p467d.C7179c;
import com.google.p443h.p451c.p457c.p460b.p468e.p469a.C7181a;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7185c extends b {
    public h f35036a;
    public e f35037b;
    public f f35038c;
    public int f35039d;
    public C7186d f35040e;
    public C7181a f35041f;
    public String f35042g;

    public C7185c() {
        this.f35036a = null;
        this.f35037b = null;
        this.f35038c = null;
        this.f35039d = 0;
        this.f35040e = null;
        this.f35041f = null;
        this.f35042g = "";
        this.aP = -1;
    }

    public final void m32551a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35036a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35036a);
        }
        if (this.f35037b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35037b);
        }
        if (this.f35038c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f35038c);
        }
        if (this.f35039d != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35039d);
        }
        if (this.f35040e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f35040e);
        }
        if (!(this.f35042g == null || this.f35042g.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f35042g);
        }
        if (this.f35041f != null) {
            codedOutputByteBufferNano.m33532b(7, this.f35041f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32552b() {
        int b = super.b();
        if (this.f35036a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35036a);
        }
        if (this.f35037b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f35037b);
        }
        if (this.f35038c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f35038c);
        }
        if (this.f35039d != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35039d);
        }
        if (this.f35040e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f35040e);
        }
        if (!(this.f35042g == null || this.f35042g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f35042g);
        }
        if (this.f35041f != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f35041f);
        }
        return b;
    }

    private final C7185c m32549b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35036a == null) {
                        this.f35036a = new h();
                    }
                    c7213a.m33552a(this.f35036a);
                    continue;
                case 18:
                    if (this.f35037b == null) {
                        this.f35037b = new e();
                    }
                    c7213a.m33552a(this.f35037b);
                    continue;
                case 26:
                    if (this.f35038c == null) {
                        this.f35038c = new f();
                    }
                    c7213a.m33552a(this.f35038c);
                    continue;
                case 32:
                    int o = c7213a.m33573o();
                    try {
                        this.f35039d = C7179c.m32533a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 42:
                    if (this.f35040e == null) {
                        this.f35040e = new C7186d();
                    }
                    c7213a.m33552a(this.f35040e);
                    continue;
                case 50:
                    this.f35042g = c7213a.m33564f();
                    continue;
                case 58:
                    if (this.f35041f == null) {
                        this.f35041f = new C7181a();
                    }
                    c7213a.m33552a(this.f35041f);
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

    public final /* synthetic */ i m32550a(C7213a c7213a) {
        return m32549b(c7213a);
    }
}
