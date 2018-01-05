package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.h.c.c.b.d.c;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0851o extends C0758b {
    public int f5474a;

    public C0851o() {
        this.f5474a = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5474a != 0) {
            codedOutputByteBufferNano.a(1, this.f5474a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5474a != 0) {
            return b + CodedOutputByteBufferNano.d(1, this.f5474a);
        }
        return b;
    }

    private final C0851o m5401b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int o = aVar.o();
                    try {
                        this.f5474a = c.a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5401b(aVar);
    }
}
