package com.google.android.finsky.installer.p208b.p209a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C3316f extends C0758b {
    public int f17157a;
    public long f17158b;
    public long f17159c;

    public C3316f() {
        this.f17157a = 0;
        this.f17158b = 0;
        this.f17159c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f17157a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f17158b);
        }
        if ((this.f17157a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f17159c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f17157a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f17158b);
        }
        if ((this.f17157a & 2) != 0) {
            return b + CodedOutputByteBufferNano.f(2, this.f17159c);
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
                    this.f17158b = aVar.j();
                    this.f17157a |= 1;
                    continue;
                case 16:
                    this.f17159c = aVar.j();
                    this.f17157a |= 2;
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
