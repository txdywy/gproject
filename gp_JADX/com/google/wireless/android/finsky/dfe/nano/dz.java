package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dz extends b {
    public int f38717a;
    public String f38718b;
    public String f38719c;

    public dz() {
        this.f38717a = 0;
        this.f38718b = "";
        this.f38719c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36304a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38717a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38718b);
        }
        if ((this.f38717a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38719c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36305b() {
        int b = super.b();
        if ((this.f38717a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38718b);
        }
        if ((this.f38717a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38719c);
        }
        return b;
    }

    public final /* synthetic */ i m36303a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38718b = c7213a.m33564f();
                    this.f38717a |= 1;
                    continue;
                case 18:
                    this.f38719c = c7213a.m33564f();
                    this.f38717a |= 2;
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
