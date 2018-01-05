package com.google.android.libraries.performance.p328a.p329a.p330a.p331a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import d.a.a.a.a.a.al;
import d.a.a.a.a.a.bv;

public final class C5934a extends C0758b {
    public bv f29574a;
    public Long f29575b;
    public Long f29576c;
    public Long f29577d;
    public Long f29578e;
    public Integer f29579f;
    public String f29580g;
    public Boolean f29581h;
    public al f29582i;

    public C5934a() {
        this.f29574a = null;
        this.f29575b = null;
        this.f29576c = null;
        this.f29577d = null;
        this.f29578e = null;
        this.f29579f = null;
        this.f29580g = null;
        this.f29581h = null;
        this.f29582i = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f29574a != null) {
            codedOutputByteBufferNano.b(1, this.f29574a);
        }
        if (this.f29575b != null) {
            codedOutputByteBufferNano.b(2, this.f29575b.longValue());
        }
        if (this.f29576c != null) {
            codedOutputByteBufferNano.b(3, this.f29576c.longValue());
        }
        if (this.f29577d != null) {
            codedOutputByteBufferNano.b(4, this.f29577d.longValue());
        }
        if (this.f29578e != null) {
            codedOutputByteBufferNano.c(5, this.f29578e.longValue());
        }
        if (this.f29579f != null) {
            codedOutputByteBufferNano.a(6, this.f29579f.intValue());
        }
        if (this.f29580g != null) {
            codedOutputByteBufferNano.a(7, this.f29580g);
        }
        if (this.f29581h != null) {
            codedOutputByteBufferNano.a(8, this.f29581h.booleanValue());
        }
        if (this.f29582i != null) {
            codedOutputByteBufferNano.b(9, this.f29582i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f29574a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f29574a);
        }
        if (this.f29575b != null) {
            b += CodedOutputByteBufferNano.f(2, this.f29575b.longValue());
        }
        if (this.f29576c != null) {
            b += CodedOutputByteBufferNano.f(3, this.f29576c.longValue());
        }
        if (this.f29577d != null) {
            b += CodedOutputByteBufferNano.f(4, this.f29577d.longValue());
        }
        if (this.f29578e != null) {
            this.f29578e.longValue();
            b += CodedOutputByteBufferNano.d(5) + 8;
        }
        if (this.f29579f != null) {
            b += CodedOutputByteBufferNano.d(6, this.f29579f.intValue());
        }
        if (this.f29580g != null) {
            b += CodedOutputByteBufferNano.b(7, this.f29580g);
        }
        if (this.f29581h != null) {
            this.f29581h.booleanValue();
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if (this.f29582i != null) {
            return b + CodedOutputByteBufferNano.d(9, this.f29582i);
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
                    if (this.f29574a == null) {
                        this.f29574a = new bv();
                    }
                    aVar.a(this.f29574a);
                    continue;
                case 16:
                    this.f29575b = Long.valueOf(aVar.j());
                    continue;
                case 24:
                    this.f29576c = Long.valueOf(aVar.j());
                    continue;
                case 32:
                    this.f29577d = Long.valueOf(aVar.j());
                    continue;
                case 41:
                    this.f29578e = Long.valueOf(aVar.l());
                    continue;
                case 48:
                    this.f29579f = Integer.valueOf(aVar.i());
                    continue;
                case 58:
                    this.f29580g = aVar.f();
                    continue;
                case 64:
                    this.f29581h = Boolean.valueOf(aVar.e());
                    continue;
                case 74:
                    if (this.f29582i == null) {
                        this.f29582i = new al();
                    }
                    aVar.a(this.f29582i);
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
