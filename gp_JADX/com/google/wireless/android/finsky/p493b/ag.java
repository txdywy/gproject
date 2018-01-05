package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ag extends b {
    public int f36711a;
    public String f36712b;
    public String f36713c;
    public String f36714d;
    public String f36715e;
    public String f36716f;

    public ag() {
        this.f36711a = 0;
        this.f36712b = "";
        this.f36713c = "";
        this.f36714d = "";
        this.f36715e = "";
        this.f36716f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34823a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36711a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36712b);
        }
        if ((this.f36711a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36713c);
        }
        if ((this.f36711a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36714d);
        }
        if ((this.f36711a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36715e);
        }
        if ((this.f36711a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36716f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34824b() {
        int b = super.b();
        if ((this.f36711a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36712b);
        }
        if ((this.f36711a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36713c);
        }
        if ((this.f36711a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36714d);
        }
        if ((this.f36711a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36715e);
        }
        if ((this.f36711a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f36716f);
        }
        return b;
    }

    public final /* synthetic */ i m34822a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36712b = c7213a.m33564f();
                    this.f36711a |= 1;
                    continue;
                case 18:
                    this.f36713c = c7213a.m33564f();
                    this.f36711a |= 2;
                    continue;
                case 26:
                    this.f36714d = c7213a.m33564f();
                    this.f36711a |= 4;
                    continue;
                case 34:
                    this.f36715e = c7213a.m33564f();
                    this.f36711a |= 8;
                    continue;
                case 42:
                    this.f36716f = c7213a.m33564f();
                    this.f36711a |= 16;
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
