package com.google.android.finsky.installer.p208b.p209a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C3317g extends C0758b {
    public int f17160a;
    public boolean f17161b;
    public boolean f17162c;
    public boolean f17163d;

    public final C3317g m16675a(boolean z) {
        this.f17160a |= 1;
        this.f17161b = z;
        return this;
    }

    public final C3317g m16679b(boolean z) {
        this.f17160a |= 2;
        this.f17162c = z;
        return this;
    }

    public final C3317g m16680c(boolean z) {
        this.f17160a |= 4;
        this.f17163d = z;
        return this;
    }

    public C3317g() {
        this.f17160a = 0;
        this.f17161b = true;
        this.f17162c = true;
        this.f17163d = true;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f17160a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f17161b);
        }
        if ((this.f17160a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f17162c);
        }
        if ((this.f17160a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f17163d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f17160a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f17160a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f17160a & 4) != 0) {
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
                    this.f17161b = aVar.e();
                    this.f17160a |= 1;
                    continue;
                case 16:
                    this.f17162c = aVar.e();
                    this.f17160a |= 2;
                    continue;
                case 24:
                    this.f17163d = aVar.e();
                    this.f17160a |= 4;
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
