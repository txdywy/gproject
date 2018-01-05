package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C4713q extends C0758b {
    public int f24240a;
    public String f24241b;
    public String f24242c;
    public int f24243d;
    public String f24244e;

    public C4713q() {
        this.f24240a = 0;
        this.f24241b = "";
        this.f24242c = "";
        this.f24243d = 0;
        this.f24244e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24240a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24241b);
        }
        if ((this.f24240a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24242c);
        }
        if ((this.f24240a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f24243d);
        }
        if ((this.f24240a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f24244e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24240a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24241b);
        }
        if ((this.f24240a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f24242c);
        }
        if ((this.f24240a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f24243d);
        }
        if ((this.f24240a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f24244e);
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
                    this.f24241b = aVar.f();
                    this.f24240a |= 1;
                    continue;
                case 18:
                    this.f24242c = aVar.f();
                    this.f24240a |= 2;
                    continue;
                case 32:
                    this.f24243d = aVar.i();
                    this.f24240a |= 4;
                    continue;
                case 42:
                    this.f24244e = aVar.f();
                    this.f24240a |= 8;
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
