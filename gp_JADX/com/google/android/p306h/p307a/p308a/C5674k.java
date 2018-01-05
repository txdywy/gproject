package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C5674k extends C0758b {
    public String f28765a;
    public String f28766b;

    public C5674k() {
        this.f28765a = null;
        this.f28766b = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28765a != null) {
            codedOutputByteBufferNano.a(1, this.f28765a);
        }
        if (this.f28766b != null) {
            codedOutputByteBufferNano.a(2, this.f28766b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28765a != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28765a);
        }
        if (this.f28766b != null) {
            return b + CodedOutputByteBufferNano.b(2, this.f28766b);
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
                    this.f28765a = aVar.f();
                    continue;
                case 18:
                    this.f28766b = aVar.f();
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
