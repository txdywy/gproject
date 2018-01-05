package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7511c extends b {
    public int f38211a;
    public String f38212b;

    public C7511c() {
        this.f38211a = 0;
        this.f38212b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35908a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38211a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38212b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35909b() {
        int b = super.b();
        if ((this.f38211a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f38212b);
        }
        return b;
    }

    public final /* synthetic */ i m35907a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38212b = c7213a.m33564f();
                    this.f38211a |= 1;
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
