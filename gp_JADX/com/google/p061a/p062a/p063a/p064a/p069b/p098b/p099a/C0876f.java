package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0864b;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0866d;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0876f extends C0758b {
    public C0866d f5587a;
    public C0875e f5588b;
    public C0864b f5589c;

    public C0876f() {
        this.f5587a = null;
        this.f5588b = null;
        this.f5589c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5587a != null) {
            codedOutputByteBufferNano.b(1, this.f5587a);
        }
        if (this.f5588b != null) {
            codedOutputByteBufferNano.b(2, this.f5588b);
        }
        if (this.f5589c != null) {
            codedOutputByteBufferNano.b(3, this.f5589c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5587a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5587a);
        }
        if (this.f5588b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5588b);
        }
        if (this.f5589c != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f5589c);
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
                    if (this.f5587a == null) {
                        this.f5587a = new C0866d();
                    }
                    aVar.a(this.f5587a);
                    continue;
                case 18:
                    if (this.f5588b == null) {
                        this.f5588b = new C0875e();
                    }
                    aVar.a(this.f5588b);
                    continue;
                case 26:
                    if (this.f5589c == null) {
                        this.f5589c = new C0864b();
                    }
                    aVar.a(this.f5589c);
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
