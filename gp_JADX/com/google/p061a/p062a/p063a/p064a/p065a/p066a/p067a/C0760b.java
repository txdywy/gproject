package com.google.p061a.p062a.p063a.p064a.p065a.p066a.p067a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0760b extends C0758b {
    public String f4734a;
    public String f4735b;
    public String f4736c;
    public boolean f4737d;
    public int f4738e;
    public boolean f4739f;
    public String f4740g;

    public C0760b() {
        this.f4734a = "";
        this.f4735b = "";
        this.f4736c = "";
        this.f4737d = false;
        this.f4738e = 0;
        this.f4739f = false;
        this.f4740g = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4734a == null || this.f4734a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4734a);
        }
        if (!(this.f4735b == null || this.f4735b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f4735b);
        }
        if (!(this.f4736c == null || this.f4736c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4736c);
        }
        if (this.f4737d) {
            codedOutputByteBufferNano.a(4, this.f4737d);
        }
        if (this.f4738e != 0) {
            codedOutputByteBufferNano.a(5, this.f4738e);
        }
        if (this.f4739f) {
            codedOutputByteBufferNano.a(6, this.f4739f);
        }
        if (!(this.f4740g == null || this.f4740g.equals(""))) {
            codedOutputByteBufferNano.a(7, this.f4740g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4734a == null || this.f4734a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4734a);
        }
        if (!(this.f4735b == null || this.f4735b.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f4735b);
        }
        if (!(this.f4736c == null || this.f4736c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f4736c);
        }
        if (this.f4737d) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if (this.f4738e != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f4738e);
        }
        if (this.f4739f) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f4740g == null || this.f4740g.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(7, this.f4740g);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f4734a = aVar.f();
                    continue;
                case 18:
                    this.f4735b = aVar.f();
                    continue;
                case 26:
                    this.f4736c = aVar.f();
                    continue;
                case 32:
                    this.f4737d = aVar.e();
                    continue;
                case 40:
                    this.f4738e = aVar.i();
                    continue;
                case 48:
                    this.f4739f = aVar.e();
                    continue;
                case 58:
                    this.f4740g = aVar.f();
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
