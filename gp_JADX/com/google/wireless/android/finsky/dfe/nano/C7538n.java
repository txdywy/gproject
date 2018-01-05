package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7538n extends b {
    public int f39174a;
    public String f39175b;
    public String f39176c;
    public String f39177d;

    public C7538n() {
        this.f39174a = 0;
        this.f39175b = "";
        this.f39176c = "";
        this.f39177d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36565a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39174a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39175b);
        }
        if ((this.f39174a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39176c);
        }
        if ((this.f39174a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39177d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36566b() {
        int b = super.b();
        if ((this.f39174a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39175b);
        }
        if ((this.f39174a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39176c);
        }
        if ((this.f39174a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f39177d);
        }
        return b;
    }

    public final /* synthetic */ i m36564a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39175b = c7213a.m33564f();
                    this.f39174a |= 1;
                    continue;
                case 18:
                    this.f39176c = c7213a.m33564f();
                    this.f39174a |= 2;
                    continue;
                case 26:
                    this.f39177d = c7213a.m33564f();
                    this.f39174a |= 4;
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
