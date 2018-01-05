package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ae extends C0758b {
    public C4714r f24123a;
    public ac f24124b;
    public C4721y f24125c;

    public ae() {
        this.f24123a = null;
        this.f24124b = null;
        this.f24125c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f24123a != null) {
            codedOutputByteBufferNano.b(1, this.f24123a);
        }
        if (this.f24124b != null) {
            codedOutputByteBufferNano.b(2, this.f24124b);
        }
        if (this.f24125c != null) {
            codedOutputByteBufferNano.b(3, this.f24125c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f24123a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f24123a);
        }
        if (this.f24124b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f24124b);
        }
        if (this.f24125c != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f24125c);
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
                    if (this.f24123a == null) {
                        this.f24123a = new C4714r();
                    }
                    aVar.a(this.f24123a);
                    continue;
                case 18:
                    if (this.f24124b == null) {
                        this.f24124b = new ac();
                    }
                    aVar.a(this.f24124b);
                    continue;
                case 26:
                    if (this.f24125c == null) {
                        this.f24125c = new C4721y();
                    }
                    aVar.a(this.f24125c);
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
