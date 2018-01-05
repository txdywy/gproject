package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0841e extends C0758b {
    public af f5443a;
    public boolean f5444b;

    public C0841e() {
        this.f5443a = null;
        this.f5444b = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5443a != null) {
            codedOutputByteBufferNano.b(1, this.f5443a);
        }
        if (this.f5444b) {
            codedOutputByteBufferNano.a(2, this.f5444b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5443a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5443a);
        }
        if (this.f5444b) {
            return b + (CodedOutputByteBufferNano.d(2) + 1);
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
                    if (this.f5443a == null) {
                        this.f5443a = new af();
                    }
                    aVar.a(this.f5443a);
                    continue;
                case 16:
                    this.f5444b = aVar.e();
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
