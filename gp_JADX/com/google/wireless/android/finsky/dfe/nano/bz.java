package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bz extends b {
    public int f38520a;
    public String f38521b;

    public bz() {
        this.f38520a = 0;
        this.f38521b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36131a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38520a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38521b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36132b() {
        int b = super.b();
        if ((this.f38520a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f38521b);
        }
        return b;
    }

    public final /* synthetic */ i m36130a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38521b = c7213a.m33564f();
                    this.f38520a |= 1;
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
