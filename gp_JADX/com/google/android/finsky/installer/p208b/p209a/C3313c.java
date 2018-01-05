package com.google.android.finsky.installer.p208b.p209a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C3313c extends C0758b {
    public int f17129a;
    public int f17130b;

    public final C3313c m16656a(int i) {
        this.f17129a |= 1;
        this.f17130b = i;
        return this;
    }

    public C3313c() {
        this.f17129a = 0;
        this.f17130b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f17129a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f17130b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f17129a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(1, this.f17130b);
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
                    this.f17130b = aVar.i();
                    this.f17129a |= 1;
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
