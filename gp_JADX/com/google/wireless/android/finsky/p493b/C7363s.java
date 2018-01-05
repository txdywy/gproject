package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7363s extends b {
    public int f36797a;
    public String f36798b;
    public String f36799c;

    public C7363s() {
        this.f36797a = 0;
        this.f36798b = "";
        this.f36799c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34891a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36797a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36798b);
        }
        if ((this.f36797a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36799c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34892b() {
        int b = super.b();
        if ((this.f36797a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36798b);
        }
        if ((this.f36797a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36799c);
        }
        return b;
    }

    public final /* synthetic */ i m34890a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36798b = c7213a.m33564f();
                    this.f36797a |= 1;
                    continue;
                case 18:
                    this.f36799c = c7213a.m33564f();
                    this.f36797a |= 2;
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
