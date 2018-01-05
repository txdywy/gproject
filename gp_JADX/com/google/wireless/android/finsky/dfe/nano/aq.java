package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aq extends b {
    public int f38376a;
    public boolean f38377b;

    public final boolean m36020d() {
        return (this.f38376a & 1) != 0;
    }

    public aq() {
        this.f38376a = 0;
        this.f38377b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36018a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38376a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f38377b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36019b() {
        int b = super.b();
        if ((this.f38376a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(1) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36017a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38377b = c7213a.m33563e();
                    this.f38376a |= 1;
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
