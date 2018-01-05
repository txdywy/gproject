package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0776d extends C0758b {
    public int f4907a;
    public C0783k f4908b;
    public C0778f f4909c;
    public C0785m f4910d;

    public C0776d() {
        this.f4907a = -1;
        this.f4907a = -1;
        this.f4908b = null;
        this.f4907a = -1;
        this.f4909c = null;
        this.f4907a = -1;
        this.f4910d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4907a == 0) {
            codedOutputByteBufferNano.b(1, this.f4908b);
        }
        if (this.f4907a == 1) {
            codedOutputByteBufferNano.b(2, this.f4909c);
        }
        if (this.f4907a == 2) {
            codedOutputByteBufferNano.b(3, this.f4910d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4907a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4908b);
        }
        if (this.f4907a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f4909c);
        }
        if (this.f4907a == 2) {
            return b + CodedOutputByteBufferNano.d(3, this.f4910d);
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
                    if (this.f4908b == null) {
                        this.f4908b = new C0783k();
                    }
                    aVar.a(this.f4908b);
                    this.f4907a = 0;
                    continue;
                case 18:
                    if (this.f4909c == null) {
                        this.f4909c = new C0778f();
                    }
                    aVar.a(this.f4909c);
                    this.f4907a = 1;
                    continue;
                case 26:
                    if (this.f4910d == null) {
                        this.f4910d = new C0785m();
                    }
                    aVar.a(this.f4910d);
                    this.f4907a = 2;
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
