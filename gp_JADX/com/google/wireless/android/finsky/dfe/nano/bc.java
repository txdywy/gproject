package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bc extends b {
    public int f38411a;
    public int f38412b;
    public String f38413c;
    public bd f38414d;
    public bb f38415e;

    public final boolean m36060d() {
        return this.f38411a == 1;
    }

    public bc() {
        this.f38411a = -1;
        this.f38412b = 0;
        this.f38413c = "";
        this.f38411a = -1;
        this.f38414d = null;
        this.f38411a = -1;
        this.f38415e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36058a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38412b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38413c);
        }
        if (this.f38411a == 0) {
            codedOutputByteBufferNano.m33532b(2, this.f38414d);
        }
        if (this.f38411a == 1) {
            codedOutputByteBufferNano.m33532b(3, this.f38415e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36059b() {
        int b = super.b();
        if ((this.f38412b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38413c);
        }
        if (this.f38411a == 0) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38414d);
        }
        if (this.f38411a == 1) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38415e);
        }
        return b;
    }

    public final /* synthetic */ i m36057a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38413c = c7213a.m33564f();
                    this.f38412b |= 1;
                    continue;
                case 18:
                    if (this.f38414d == null) {
                        this.f38414d = new bd();
                    }
                    c7213a.m33552a(this.f38414d);
                    this.f38411a = 0;
                    continue;
                case 26:
                    if (this.f38415e == null) {
                        this.f38415e = new bb();
                    }
                    c7213a.m33552a(this.f38415e);
                    this.f38411a = 1;
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
