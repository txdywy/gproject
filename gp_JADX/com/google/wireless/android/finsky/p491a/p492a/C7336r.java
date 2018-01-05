package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7336r extends b {
    public int f36582a;
    public String f36583b;
    public String f36584c;
    public String f36585d;
    public boolean f36586e;
    public String f36587f;

    public C7336r() {
        this.f36582a = 0;
        this.f36583b = "";
        this.f36584c = "";
        this.f36585d = "";
        this.f36586e = false;
        this.f36587f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34768a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36582a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36583b);
        }
        if ((this.f36582a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36584c);
        }
        if ((this.f36582a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36585d);
        }
        if ((this.f36582a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f36586e);
        }
        if ((this.f36582a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36587f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34769b() {
        int b = super.b();
        if ((this.f36582a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36583b);
        }
        if ((this.f36582a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36584c);
        }
        if ((this.f36582a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36585d);
        }
        if ((this.f36582a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f36582a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f36587f);
        }
        return b;
    }

    public final /* synthetic */ i m34767a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36583b = c7213a.m33564f();
                    this.f36582a |= 1;
                    continue;
                case 18:
                    this.f36584c = c7213a.m33564f();
                    this.f36582a |= 2;
                    continue;
                case 26:
                    this.f36585d = c7213a.m33564f();
                    this.f36582a |= 4;
                    continue;
                case 32:
                    this.f36586e = c7213a.m33563e();
                    this.f36582a |= 8;
                    continue;
                case 42:
                    this.f36587f = c7213a.m33564f();
                    this.f36582a |= 16;
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
