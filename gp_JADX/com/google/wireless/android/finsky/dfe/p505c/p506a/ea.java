package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ea extends b {
    public int f37518a;
    public int f37519b;
    public boolean f37520c;
    public String f37521d;
    public String f37522e;

    public final boolean m35432d() {
        return (this.f37518a & 4) != 0;
    }

    public ea() {
        this.f37518a = 0;
        this.f37519b = 5;
        this.f37520c = false;
        this.f37521d = "";
        this.f37522e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35430a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37518a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37519b);
        }
        if ((this.f37518a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f37520c);
        }
        if ((this.f37518a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37521d);
        }
        if ((this.f37518a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37522e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35431b() {
        int b = super.b();
        if ((this.f37518a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37519b);
        }
        if ((this.f37518a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f37518a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37521d);
        }
        if ((this.f37518a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f37522e);
        }
        return b;
    }

    public final /* synthetic */ i m35429a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37519b = c7213a.m33567i();
                    this.f37518a |= 1;
                    continue;
                case 16:
                    this.f37520c = c7213a.m33563e();
                    this.f37518a |= 2;
                    continue;
                case 26:
                    this.f37521d = c7213a.m33564f();
                    this.f37518a |= 4;
                    continue;
                case 34:
                    this.f37522e = c7213a.m33564f();
                    this.f37518a |= 8;
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
