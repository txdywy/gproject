package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7543s extends b {
    public int f39201a;
    public String f39202b;
    public String f39203c;

    public C7543s() {
        this.f39201a = 0;
        this.f39202b = "";
        this.f39203c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36580a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39201a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39202b);
        }
        if ((this.f39201a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39203c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36581b() {
        int b = super.b();
        if ((this.f39201a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39202b);
        }
        if ((this.f39201a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f39203c);
        }
        return b;
    }

    public final /* synthetic */ i m36579a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39202b = c7213a.m33564f();
                    this.f39201a |= 1;
                    continue;
                case 34:
                    this.f39203c = c7213a.m33564f();
                    this.f39201a |= 2;
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
