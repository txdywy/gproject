package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5676m extends C0758b {
    public String f28770a;
    public String f28771b;
    public String f28772c;
    public String f28773d;
    public Integer f28774e;
    public String f28775f;
    public Boolean f28776g;

    public C5676m() {
        this.f28770a = null;
        this.f28771b = null;
        this.f28772c = null;
        this.f28773d = null;
        this.f28774e = null;
        this.f28775f = null;
        this.f28776g = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28770a != null) {
            codedOutputByteBufferNano.a(1, this.f28770a);
        }
        if (this.f28771b != null) {
            codedOutputByteBufferNano.a(2, this.f28771b);
        }
        if (this.f28772c != null) {
            codedOutputByteBufferNano.a(3, this.f28772c);
        }
        if (this.f28773d != null) {
            codedOutputByteBufferNano.a(4, this.f28773d);
        }
        if (this.f28774e != null) {
            codedOutputByteBufferNano.a(5, this.f28774e.intValue());
        }
        if (this.f28775f != null) {
            codedOutputByteBufferNano.a(6, this.f28775f);
        }
        if (this.f28776g != null) {
            codedOutputByteBufferNano.a(7, this.f28776g.booleanValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28770a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28770a);
        }
        if (this.f28771b != null) {
            b += CodedOutputByteBufferNano.b(2, this.f28771b);
        }
        if (this.f28772c != null) {
            b += CodedOutputByteBufferNano.b(3, this.f28772c);
        }
        if (this.f28773d != null) {
            b += CodedOutputByteBufferNano.b(4, this.f28773d);
        }
        if (this.f28774e != null) {
            b += CodedOutputByteBufferNano.d(5, this.f28774e.intValue());
        }
        if (this.f28775f != null) {
            b += CodedOutputByteBufferNano.b(6, this.f28775f);
        }
        if (this.f28776g == null) {
            return b;
        }
        this.f28776g.booleanValue();
        return b + (CodedOutputByteBufferNano.d(7) + 1);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28770a = aVar.f();
                    continue;
                case 18:
                    this.f28771b = aVar.f();
                    continue;
                case 26:
                    this.f28772c = aVar.f();
                    continue;
                case 34:
                    this.f28773d = aVar.f();
                    continue;
                case 40:
                    this.f28774e = Integer.valueOf(aVar.i());
                    continue;
                case 50:
                    this.f28775f = aVar.f();
                    continue;
                case 56:
                    this.f28776g = Boolean.valueOf(aVar.e());
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
