package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.h.c.c.b.c.a.b;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0855s extends C0758b {
    public b f5482a;

    public C0855s() {
        this.f5482a = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5482a != null) {
            codedOutputByteBufferNano.b(2, this.f5482a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5482a != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f5482a);
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
                    if (this.f5482a == null) {
                        this.f5482a = new b();
                    }
                    aVar.a(this.f5482a);
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
