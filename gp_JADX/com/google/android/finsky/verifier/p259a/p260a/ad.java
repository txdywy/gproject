package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ad extends C0758b {
    public int f24119a;
    public boolean f24120b;
    public boolean f24121c;
    public boolean f24122d;

    public ad() {
        this.f24119a = 0;
        this.f24120b = false;
        this.f24121c = false;
        this.f24122d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24119a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24120b);
        }
        if ((this.f24119a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24121c);
        }
        if ((this.f24119a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24122d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24119a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f24119a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f24119a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.d(3) + 1);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24120b = aVar.e();
                    this.f24119a |= 1;
                    continue;
                case 16:
                    this.f24121c = aVar.e();
                    this.f24119a |= 2;
                    continue;
                case 24:
                    this.f24122d = aVar.e();
                    this.f24119a |= 4;
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
