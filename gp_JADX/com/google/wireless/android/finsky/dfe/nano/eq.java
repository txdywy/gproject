package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eq extends b {
    public int f38803a;
    public String f38804b;
    public String f38805c;

    public eq() {
        this.f38803a = 0;
        this.f38804b = "";
        this.f38805c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36355a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38803a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38804b);
        }
        if ((this.f38803a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38805c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36356b() {
        int b = super.b();
        if ((this.f38803a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38804b);
        }
        if ((this.f38803a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38805c);
        }
        return b;
    }

    public final /* synthetic */ i m36354a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38804b = c7213a.m33564f();
                    this.f38803a |= 1;
                    continue;
                case 18:
                    this.f38805c = c7213a.m33564f();
                    this.f38803a |= 2;
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
