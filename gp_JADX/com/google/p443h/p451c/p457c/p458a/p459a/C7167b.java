package com.google.p443h.p451c.p457c.p458a.p459a;

import com.google.a.a.a.a.b.a.a.f.c;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7167b extends b {
    public static volatile C7167b[] f34991a;
    public c f34992b;
    public ae f34993c;

    public static C7167b[] m32494d() {
        if (f34991a == null) {
            synchronized (C7219h.f35465b) {
                if (f34991a == null) {
                    f34991a = new C7167b[0];
                }
            }
        }
        return f34991a;
    }

    public C7167b() {
        this.f34992b = null;
        this.f34993c = null;
        this.aP = -1;
    }

    public final void m32496a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34992b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34992b);
        }
        if (this.f34993c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f34993c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32497b() {
        int b = super.b();
        if (this.f34992b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34992b);
        }
        if (this.f34993c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f34993c);
        }
        return b;
    }

    public final /* synthetic */ i m32495a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34992b == null) {
                        this.f34992b = new c();
                    }
                    c7213a.m33552a(this.f34992b);
                    continue;
                case 18:
                    if (this.f34993c == null) {
                        this.f34993c = new ae();
                    }
                    c7213a.m33552a(this.f34993c);
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
