package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bq extends b {
    public int f38474a;
    public String f38475b;
    public boolean f38476c;
    public String f38477d;

    public bq() {
        this.f38474a = 0;
        this.f38475b = "";
        this.f38476c = false;
        this.f38477d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36104a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38474a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38475b);
        }
        if ((this.f38474a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38476c);
        }
        if ((this.f38474a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38477d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36105b() {
        int b = super.b();
        if ((this.f38474a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38475b);
        }
        if ((this.f38474a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f38474a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38477d);
        }
        return b;
    }

    public final /* synthetic */ i m36103a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38475b = c7213a.m33564f();
                    this.f38474a |= 1;
                    continue;
                case 16:
                    this.f38476c = c7213a.m33563e();
                    this.f38474a |= 2;
                    continue;
                case 26:
                    this.f38477d = c7213a.m33564f();
                    this.f38474a |= 4;
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
