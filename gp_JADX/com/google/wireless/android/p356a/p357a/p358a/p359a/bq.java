package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bq extends b {
    public bw f35820a;
    public bv f35821b;

    public bq() {
        this.f35820a = null;
        this.f35821b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34216a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35820a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35820a);
        }
        if (this.f35821b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35821b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34217b() {
        int b = super.b();
        if (this.f35820a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35820a);
        }
        if (this.f35821b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35821b);
        }
        return b;
    }

    public final /* synthetic */ i m34215a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35820a == null) {
                        this.f35820a = new bw();
                    }
                    c7213a.m33552a(this.f35820a);
                    continue;
                case 18:
                    if (this.f35821b == null) {
                        this.f35821b = new bv();
                    }
                    c7213a.m33552a(this.f35821b);
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
