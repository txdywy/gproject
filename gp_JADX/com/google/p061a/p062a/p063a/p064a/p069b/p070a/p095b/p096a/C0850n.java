package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.p061a.p062a.p063a.p064a.p065a.p066a.p067a.C0759a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0850n extends C0758b {
    public C0759a f5473a;

    public C0850n() {
        this.f5473a = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5473a != null) {
            codedOutputByteBufferNano.b(2, this.f5473a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5473a != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f5473a);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    if (this.f5473a == null) {
                        this.f5473a = new C0759a();
                    }
                    aVar.a(this.f5473a);
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
