package com.google.protobuf.nano;

public final class C7218g extends b {
    public int f35463a;

    public C7218g() {
        this.f35463a = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m33604a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35463a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35463a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m33605b() {
        int b = super.b();
        if (this.f35463a != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f35463a);
        }
        return b;
    }

    public final /* synthetic */ i m33603a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35463a = c7213a.m33567i();
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
