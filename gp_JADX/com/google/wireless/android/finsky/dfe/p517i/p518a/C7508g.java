package com.google.wireless.android.finsky.dfe.p517i.p518a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7508g extends b {
    public int f38202a;
    public String f38203b;

    public C7508g() {
        this.f38202a = 0;
        this.f38203b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35895a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38202a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38203b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35896b() {
        int b = super.b();
        if ((this.f38202a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f38203b);
        }
        return b;
    }

    public final /* synthetic */ i m35894a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38203b = c7213a.m33564f();
                    this.f38202a |= 1;
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
