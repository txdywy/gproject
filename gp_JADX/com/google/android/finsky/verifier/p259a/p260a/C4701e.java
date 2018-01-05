package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C4701e extends C0758b {
    public int f24184a;
    public boolean f24185b;
    public int f24186c;

    public final C4701e m21890a(boolean z) {
        this.f24184a |= 1;
        this.f24185b = z;
        return this;
    }

    public final C4701e m21889a(int i) {
        this.f24186c = i;
        this.f24184a |= 2;
        return this;
    }

    public C4701e() {
        this.f24184a = 0;
        this.f24185b = false;
        this.f24186c = -1;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24184a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24185b);
        }
        if ((this.f24184a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24186c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24184a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f24184a & 2) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f24186c);
        }
        return b;
    }

    private final C4701e m21888b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24185b = aVar.e();
                    this.f24184a |= 1;
                    continue;
                case 16:
                    this.f24184a |= 2;
                    int o = aVar.o();
                    try {
                        this.f24186c = ac.m21857a(aVar.i());
                        this.f24184a |= 2;
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
        return m21888b(aVar);
    }
}
