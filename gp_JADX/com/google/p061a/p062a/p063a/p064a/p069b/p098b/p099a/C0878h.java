package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0866d;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0878h extends C0758b {
    public C0866d f5595a;
    public C0873c f5596b;
    public C0875e f5597c;

    public C0878h() {
        this.f5595a = null;
        this.f5596b = null;
        this.f5597c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5595a != null) {
            codedOutputByteBufferNano.b(1, this.f5595a);
        }
        if (this.f5596b != null) {
            codedOutputByteBufferNano.b(2, this.f5596b);
        }
        if (this.f5597c != null) {
            codedOutputByteBufferNano.b(4, this.f5597c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5595a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5595a);
        }
        if (this.f5596b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5596b);
        }
        if (this.f5597c != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f5597c);
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
                    if (this.f5595a == null) {
                        this.f5595a = new C0866d();
                    }
                    aVar.a(this.f5595a);
                    continue;
                case 18:
                    if (this.f5596b == null) {
                        this.f5596b = new C0873c();
                    }
                    aVar.a(this.f5596b);
                    continue;
                case 34:
                    if (this.f5597c == null) {
                        this.f5597c = new C0875e();
                    }
                    aVar.a(this.f5597c);
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
