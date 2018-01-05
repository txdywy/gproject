package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7332n extends b {
    public int f36568a;
    public String f36569b;
    public String f36570c;
    public C7342x f36571d;
    public C7342x f36572e;

    public C7332n() {
        this.f36568a = 0;
        this.f36569b = "";
        this.f36570c = "";
        this.f36571d = null;
        this.f36572e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34755a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36568a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36569b);
        }
        if ((this.f36568a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36570c);
        }
        if (this.f36571d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36571d);
        }
        if (this.f36572e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36572e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34756b() {
        int b = super.b();
        if ((this.f36568a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36569b);
        }
        if ((this.f36568a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36570c);
        }
        if (this.f36571d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36571d);
        }
        if (this.f36572e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f36572e);
        }
        return b;
    }

    public final /* synthetic */ i m34754a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36569b = c7213a.m33564f();
                    this.f36568a |= 1;
                    continue;
                case 18:
                    this.f36570c = c7213a.m33564f();
                    this.f36568a |= 2;
                    continue;
                case 26:
                    if (this.f36571d == null) {
                        this.f36571d = new C7342x();
                    }
                    c7213a.m33552a(this.f36571d);
                    continue;
                case 34:
                    if (this.f36572e == null) {
                        this.f36572e = new C7342x();
                    }
                    c7213a.m33552a(this.f36572e);
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
