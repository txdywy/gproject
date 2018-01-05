package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7421k extends b {
    public int f37592a;
    public bl f37593b;
    public bl f37594c;
    public aq f37595d;

    public C7421k() {
        this.f37592a = -1;
        this.f37593b = null;
        this.f37594c = null;
        this.f37592a = -1;
        this.f37595d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35475a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37593b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37593b);
        }
        if (this.f37594c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37594c);
        }
        if (this.f37592a == 0) {
            codedOutputByteBufferNano.m33532b(3, this.f37595d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35476b() {
        int b = super.b();
        if (this.f37593b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37593b);
        }
        if (this.f37594c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37594c);
        }
        if (this.f37592a == 0) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37595d);
        }
        return b;
    }

    public final /* synthetic */ i m35474a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37593b == null) {
                        this.f37593b = new bl();
                    }
                    c7213a.m33552a(this.f37593b);
                    continue;
                case 18:
                    if (this.f37594c == null) {
                        this.f37594c = new bl();
                    }
                    c7213a.m33552a(this.f37594c);
                    continue;
                case 26:
                    if (this.f37595d == null) {
                        this.f37595d = new aq();
                    }
                    c7213a.m33552a(this.f37595d);
                    this.f37592a = 0;
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
