package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0865c;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0849m extends C0758b {
    public C0865c f5472a;

    public C0849m() {
        this.f5472a = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5472a != null) {
            codedOutputByteBufferNano.b(1, this.f5472a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5472a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f5472a);
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
                    if (this.f5472a == null) {
                        this.f5472a = new C0865c();
                    }
                    aVar.a(this.f5472a);
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
