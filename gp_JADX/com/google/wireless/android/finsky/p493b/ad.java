package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public int f36693a;
    public byte[] f36694b;
    public byte[] f36695c;

    public ad() {
        this.f36693a = 0;
        this.f36694b = C7222l.f35479l;
        this.f36695c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34812a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36693a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f36694b);
        }
        if ((this.f36693a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f36695c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34813b() {
        int b = super.b();
        if ((this.f36693a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f36694b);
        }
        if ((this.f36693a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f36695c);
        }
        return b;
    }

    public final /* synthetic */ i m34811a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36694b = c7213a.m33565g();
                    this.f36693a |= 1;
                    continue;
                case 18:
                    this.f36695c = c7213a.m33565g();
                    this.f36693a |= 2;
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
