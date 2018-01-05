package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0812i extends C0758b {
    public al f5154a;
    public C0810g f5155b;
    public String f5156c;
    public String f5157d;

    public C0812i() {
        this.f5154a = null;
        this.f5155b = null;
        this.f5156c = "";
        this.f5157d = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5154a != null) {
            codedOutputByteBufferNano.b(1, this.f5154a);
        }
        if (this.f5155b != null) {
            codedOutputByteBufferNano.b(2, this.f5155b);
        }
        if (!(this.f5156c == null || this.f5156c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5156c);
        }
        if (!(this.f5157d == null || this.f5157d.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5157d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5154a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5154a);
        }
        if (this.f5155b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5155b);
        }
        if (!(this.f5156c == null || this.f5156c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5156c);
        }
        if (this.f5157d == null || this.f5157d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(4, this.f5157d);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5154a == null) {
                        this.f5154a = new al();
                    }
                    aVar.a(this.f5154a);
                    continue;
                case 18:
                    if (this.f5155b == null) {
                        this.f5155b = new C0810g();
                    }
                    aVar.a(this.f5155b);
                    continue;
                case 26:
                    this.f5156c = aVar.f();
                    continue;
                case 34:
                    this.f5157d = aVar.f();
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
