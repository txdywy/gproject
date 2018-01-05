package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ab extends b {
    public int f37769a;
    public String f37770b;
    public String f37771c;

    public ab() {
        this.f37769a = 0;
        this.f37770b = "";
        this.f37771c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35579a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37769a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37770b);
        }
        if ((this.f37769a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37771c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35580b() {
        int b = super.b();
        if ((this.f37769a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37770b);
        }
        if ((this.f37769a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f37771c);
        }
        return b;
    }

    public final /* synthetic */ i m35578a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37770b = c7213a.m33564f();
                    this.f37769a |= 1;
                    continue;
                case 18:
                    this.f37771c = c7213a.m33564f();
                    this.f37769a |= 2;
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
