package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7333o extends b {
    public int f36573a;
    public String f36574b;
    public String f36575c;

    public C7333o() {
        this.f36573a = 0;
        this.f36574b = "";
        this.f36575c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34758a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36573a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36574b);
        }
        if ((this.f36573a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36575c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34759b() {
        int b = super.b();
        if ((this.f36573a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36574b);
        }
        if ((this.f36573a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36575c);
        }
        return b;
    }

    public final /* synthetic */ i m34757a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36574b = c7213a.m33564f();
                    this.f36573a |= 1;
                    continue;
                case 18:
                    this.f36575c = c7213a.m33564f();
                    this.f36573a |= 2;
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
