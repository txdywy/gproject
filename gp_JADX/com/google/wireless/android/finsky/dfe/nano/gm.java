package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gm extends b {
    public int f39104a;
    public String f39105b;
    public String f39106c;
    public String f39107d;

    public gm() {
        this.f39104a = 0;
        this.f39105b = "";
        this.f39106c = "";
        this.f39107d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36514a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39104a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39105b);
        }
        if ((this.f39104a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39106c);
        }
        if ((this.f39104a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39107d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36515b() {
        int b = super.b();
        if ((this.f39104a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39105b);
        }
        if ((this.f39104a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39106c);
        }
        if ((this.f39104a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f39107d);
        }
        return b;
    }

    public final /* synthetic */ i m36513a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39105b = c7213a.m33564f();
                    this.f39104a |= 1;
                    continue;
                case 18:
                    this.f39106c = c7213a.m33564f();
                    this.f39104a |= 2;
                    continue;
                case 26:
                    this.f39107d = c7213a.m33564f();
                    this.f39104a |= 4;
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
