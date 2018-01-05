package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cn extends b {
    public int f38584a;
    public String f38585b;

    public cn() {
        this.f38584a = 0;
        this.f38585b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36176a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38584a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38585b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36177b() {
        int b = super.b();
        if ((this.f38584a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f38585b);
        }
        return b;
    }

    public final /* synthetic */ i m36175a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38585b = c7213a.m33564f();
                    this.f38584a |= 1;
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
