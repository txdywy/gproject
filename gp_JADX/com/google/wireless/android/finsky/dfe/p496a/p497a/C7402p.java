package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7402p extends b {
    public int f36966a;
    public String f36967b;
    public boolean f36968c;

    public C7402p() {
        this.f36966a = 0;
        this.f36967b = "";
        this.f36968c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35031a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36966a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36967b);
        }
        if ((this.f36966a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36968c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35032b() {
        int b = super.b();
        if ((this.f36966a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36967b);
        }
        if ((this.f36966a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35030a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36967b = c7213a.m33564f();
                    this.f36966a |= 1;
                    continue;
                case 16:
                    this.f36968c = c7213a.m33563e();
                    this.f36966a |= 2;
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
