package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ff extends b {
    public int f38911a;
    public String f38912b;
    public byte[] f38913c;

    public ff() {
        this.f38911a = 0;
        this.f38912b = "";
        this.f38913c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36411a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38911a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38912b);
        }
        if ((this.f38911a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f38913c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36412b() {
        int b = super.b();
        if ((this.f38911a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38912b);
        }
        if ((this.f38911a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f38913c);
        }
        return b;
    }

    public final /* synthetic */ i m36410a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38912b = c7213a.m33564f();
                    this.f38911a |= 1;
                    continue;
                case 18:
                    this.f38913c = c7213a.m33565g();
                    this.f38911a |= 2;
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
