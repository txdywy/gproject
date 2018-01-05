package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gb extends b {
    public int f39067a;
    public boolean f39068b;
    public int f39069c;

    public final boolean m36484d() {
        return (this.f39067a & 2) != 0;
    }

    public gb() {
        this.f39067a = 0;
        this.f39068b = false;
        this.f39069c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36482a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39067a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f39068b);
        }
        if ((this.f39067a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f39069c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36483b() {
        int b = super.b();
        if ((this.f39067a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f39067a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f39069c);
        }
        return b;
    }

    public final /* synthetic */ i m36481a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39068b = c7213a.m33563e();
                    this.f39067a |= 1;
                    continue;
                case 16:
                    this.f39069c = c7213a.m33567i();
                    this.f39067a |= 2;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
