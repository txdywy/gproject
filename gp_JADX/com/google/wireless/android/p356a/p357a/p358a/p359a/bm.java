package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bm extends b {
    public int f35813a;
    public String f35814b;
    public bn f35815c;

    public bm() {
        this.f35813a = 0;
        this.f35814b = "";
        this.f35815c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34206a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35813a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35814b);
        }
        if (this.f35815c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35815c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34207b() {
        int b = super.b();
        if ((this.f35813a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35814b);
        }
        if (this.f35815c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35815c);
        }
        return b;
    }

    public final /* synthetic */ i m34205a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35814b = c7213a.m33564f();
                    this.f35813a |= 1;
                    continue;
                case 18:
                    if (this.f35815c == null) {
                        this.f35815c = new bn();
                    }
                    c7213a.m33552a(this.f35815c);
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
