package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class an extends b {
    public int f36377a;
    public String f36378b;

    public an() {
        this.f36377a = 0;
        this.f36378b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34648a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36377a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36378b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34649b() {
        int b = super.b();
        if ((this.f36377a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f36378b);
        }
        return b;
    }

    public final /* synthetic */ i m34647a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36378b = c7213a.m33564f();
                    this.f36377a |= 1;
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
