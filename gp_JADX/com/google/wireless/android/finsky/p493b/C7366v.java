package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7366v extends b {
    public int f36821a;
    public long f36822b;
    public long f36823c;
    public boolean f36824d;
    public long f36825e;
    public String f36826f;
    public String f36827g;

    public C7366v() {
        this.f36821a = 0;
        this.f36822b = 0;
        this.f36823c = 0;
        this.f36824d = false;
        this.f36825e = 0;
        this.f36826f = "";
        this.f36827g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34902a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36821a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36822b);
        }
        if ((this.f36821a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36823c);
        }
        if ((this.f36821a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36824d);
        }
        if ((this.f36821a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f36825e);
        }
        if ((this.f36821a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36826f);
        }
        if ((this.f36821a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36827g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34903b() {
        int b = super.b();
        if ((this.f36821a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36822b);
        }
        if ((this.f36821a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36823c);
        }
        if ((this.f36821a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f36821a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f36825e);
        }
        if ((this.f36821a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36826f);
        }
        if ((this.f36821a & 32) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f36827g);
        }
        return b;
    }

    public final /* synthetic */ i m34901a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36822b = c7213a.m33568j();
                    this.f36821a |= 1;
                    continue;
                case 16:
                    this.f36823c = c7213a.m33568j();
                    this.f36821a |= 2;
                    continue;
                case 24:
                    this.f36824d = c7213a.m33563e();
                    this.f36821a |= 4;
                    continue;
                case 32:
                    this.f36825e = c7213a.m33568j();
                    this.f36821a |= 8;
                    continue;
                case 42:
                    this.f36826f = c7213a.m33564f();
                    this.f36821a |= 16;
                    continue;
                case 50:
                    this.f36827g = c7213a.m33564f();
                    this.f36821a |= 32;
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
