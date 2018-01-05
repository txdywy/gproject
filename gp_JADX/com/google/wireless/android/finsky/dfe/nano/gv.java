package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gv extends b {
    public int f39135a;
    public String f39136b;

    public gv() {
        this.f39135a = 0;
        this.f39136b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36538a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39135a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39136b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36539b() {
        int b = super.b();
        if ((this.f39135a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f39136b);
        }
        return b;
    }

    public final /* synthetic */ i m36537a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39136b = c7213a.m33564f();
                    this.f39135a |= 1;
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
