package com.google.wireless.android.finsky.dfe.p509e.p510a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7444d extends b {
    public int f37739a;
    public String f37740b;

    public C7444d() {
        this.f37739a = 0;
        this.f37740b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35553a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37739a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37740b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35554b() {
        int b = super.b();
        if ((this.f37739a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f37740b);
        }
        return b;
    }

    public final /* synthetic */ i m35552a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37740b = c7213a.m33564f();
                    this.f37739a |= 1;
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
