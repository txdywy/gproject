package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7338t extends b {
    public int f36590a;
    public long f36591b;
    public String f36592c;
    public String f36593d;
    public String f36594e;
    public String f36595f;

    public C7338t() {
        this.f36590a = 0;
        this.f36591b = 0;
        this.f36592c = "";
        this.f36593d = "";
        this.f36594e = "";
        this.f36595f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34774a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36590a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36591b);
        }
        if ((this.f36590a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36592c);
        }
        if ((this.f36590a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36593d);
        }
        if ((this.f36590a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36594e);
        }
        if ((this.f36590a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f36595f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34775b() {
        int b = super.b();
        if ((this.f36590a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36591b);
        }
        if ((this.f36590a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36592c);
        }
        if ((this.f36590a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36593d);
        }
        if ((this.f36590a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36594e);
        }
        if ((this.f36590a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(9, this.f36595f);
        }
        return b;
    }

    public final /* synthetic */ i m34773a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36591b = c7213a.m33568j();
                    this.f36590a |= 1;
                    continue;
                case 18:
                    this.f36592c = c7213a.m33564f();
                    this.f36590a |= 2;
                    continue;
                case 26:
                    this.f36593d = c7213a.m33564f();
                    this.f36590a |= 4;
                    continue;
                case 66:
                    this.f36594e = c7213a.m33564f();
                    this.f36590a |= 8;
                    continue;
                case 74:
                    this.f36595f = c7213a.m33564f();
                    this.f36590a |= 16;
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
