package com.google.p061a.p062a.p063a.p064a.p065a.p068b;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0764d extends C0758b {
    public int f4779a;
    public int f4780b;
    public int f4781c;

    public C0764d() {
        this.f4779a = 0;
        this.f4780b = 0;
        this.f4781c = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4779a != 0) {
            codedOutputByteBufferNano.a(1, this.f4779a);
        }
        if (this.f4780b != 0) {
            codedOutputByteBufferNano.a(2, this.f4780b);
        }
        if (this.f4781c != 0) {
            codedOutputByteBufferNano.a(3, this.f4781c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4779a != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4779a);
        }
        if (this.f4780b != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f4780b);
        }
        if (this.f4781c != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f4781c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f4779a = aVar.i();
                    continue;
                case 16:
                    this.f4780b = aVar.i();
                    continue;
                case 24:
                    this.f4781c = aVar.i();
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
