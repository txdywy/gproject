package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class al extends b {
    public int f38360a;
    public long f38361b;
    public String f38362c;
    public String f38363d;

    public al() {
        this.f38360a = 0;
        this.f38361b = 0;
        this.f38362c = "";
        this.f38363d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36003a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33531b(1, this.f38361b);
        codedOutputByteBufferNano.m33521a(2, this.f38362c);
        if ((this.f38360a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38363d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36004b() {
        int b = (super.b() + CodedOutputByteBufferNano.m33508f(1, this.f38361b)) + CodedOutputByteBufferNano.m33493b(2, this.f38362c);
        if ((this.f38360a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38363d);
        }
        return b;
    }

    public final /* synthetic */ i m36002a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38361b = c7213a.m33568j();
                    continue;
                case 18:
                    this.f38362c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f38363d = c7213a.m33564f();
                    this.f38360a |= 1;
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
