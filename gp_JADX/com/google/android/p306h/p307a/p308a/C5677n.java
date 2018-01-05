package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5677n extends C0758b {
    public String f28777a;
    public Long f28778b;
    public String f28779c;
    public Integer f28780d;
    public String f28781e;
    public Integer f28782f;
    public Long f28783g;

    public C5677n() {
        this.f28777a = null;
        this.f28778b = null;
        this.f28779c = null;
        this.f28780d = null;
        this.f28781e = null;
        this.f28782f = null;
        this.f28783g = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28777a != null) {
            codedOutputByteBufferNano.a(1, this.f28777a);
        }
        if (this.f28778b != null) {
            codedOutputByteBufferNano.b(2, this.f28778b.longValue());
        }
        if (this.f28779c != null) {
            codedOutputByteBufferNano.a(3, this.f28779c);
        }
        if (this.f28780d != null) {
            codedOutputByteBufferNano.a(4, this.f28780d.intValue());
        }
        if (this.f28781e != null) {
            codedOutputByteBufferNano.a(5, this.f28781e);
        }
        if (this.f28782f != null) {
            codedOutputByteBufferNano.a(6, this.f28782f.intValue());
        }
        if (this.f28783g != null) {
            codedOutputByteBufferNano.b(7, this.f28783g.longValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28777a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28777a);
        }
        if (this.f28778b != null) {
            b += CodedOutputByteBufferNano.f(2, this.f28778b.longValue());
        }
        if (this.f28779c != null) {
            b += CodedOutputByteBufferNano.b(3, this.f28779c);
        }
        if (this.f28780d != null) {
            b += CodedOutputByteBufferNano.d(4, this.f28780d.intValue());
        }
        if (this.f28781e != null) {
            b += CodedOutputByteBufferNano.b(5, this.f28781e);
        }
        if (this.f28782f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f28782f.intValue());
        }
        if (this.f28783g != null) {
            return b + CodedOutputByteBufferNano.f(7, this.f28783g.longValue());
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28777a = aVar.f();
                    continue;
                case 16:
                    this.f28778b = Long.valueOf(aVar.j());
                    continue;
                case 26:
                    this.f28779c = aVar.f();
                    continue;
                case 32:
                    this.f28780d = Integer.valueOf(aVar.i());
                    continue;
                case 42:
                    this.f28781e = aVar.f();
                    continue;
                case 48:
                    this.f28782f = Integer.valueOf(aVar.i());
                    continue;
                case 56:
                    this.f28783g = Long.valueOf(aVar.j());
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
