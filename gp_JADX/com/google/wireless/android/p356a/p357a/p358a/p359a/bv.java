package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bv extends b {
    public int f35845a;
    public int f35846b;

    public final bv m34236a(int i) {
        this.f35845a |= 1;
        this.f35846b = i;
        return this;
    }

    public bv() {
        this.f35845a = 0;
        this.f35846b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34237a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35845a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35846b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34238b() {
        int b = super.b();
        if ((this.f35845a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f35846b);
        }
        return b;
    }

    public final /* synthetic */ i m34235a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35846b = c7213a.m33567i();
                    this.f35845a |= 1;
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
