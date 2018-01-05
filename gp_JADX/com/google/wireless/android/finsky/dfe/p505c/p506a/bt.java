package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.is;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bt extends b {
    public int f37242a;
    public is f37243b;
    public boolean f37244c;
    public int f37245d;
    public String f37246e;
    public aj f37247f;

    public final bt m35220d() {
        this.f37242a |= 1;
        this.f37244c = true;
        return this;
    }

    public bt() {
        this.f37242a = 0;
        this.f37243b = null;
        this.f37244c = false;
        this.f37245d = 0;
        this.f37246e = "";
        this.f37247f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35218a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37243b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37243b);
        }
        if ((this.f37242a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f37244c);
        }
        if ((this.f37242a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37245d);
        }
        if ((this.f37242a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37246e);
        }
        if (this.f37247f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37247f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35219b() {
        int b = super.b();
        if (this.f37243b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37243b);
        }
        if ((this.f37242a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f37242a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37245d);
        }
        if ((this.f37242a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37246e);
        }
        if (this.f37247f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37247f);
        }
        return b;
    }

    public final /* synthetic */ i m35217a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37243b == null) {
                        this.f37243b = new is();
                    }
                    c7213a.m33552a(this.f37243b);
                    continue;
                case 16:
                    this.f37244c = c7213a.m33563e();
                    this.f37242a |= 1;
                    continue;
                case 24:
                    this.f37245d = c7213a.m33567i();
                    this.f37242a |= 2;
                    continue;
                case 34:
                    this.f37246e = c7213a.m33564f();
                    this.f37242a |= 4;
                    continue;
                case 42:
                    if (this.f37247f == null) {
                        this.f37247f = new aj();
                    }
                    c7213a.m33552a(this.f37247f);
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
