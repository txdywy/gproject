package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7311m extends b {
    public String f36289a;
    public int f36290b;
    public String f36291c;

    public C7311m() {
        this.f36289a = "";
        this.f36290b = 0;
        this.f36291c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34568a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36289a == null || this.f36289a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36289a);
        }
        if (this.f36290b != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36290b);
        }
        if (!(this.f36291c == null || this.f36291c.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36291c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34569b() {
        int b = super.b();
        if (!(this.f36289a == null || this.f36289a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36289a);
        }
        if (this.f36290b != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36290b);
        }
        if (this.f36291c == null || this.f36291c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(3, this.f36291c);
    }

    public final /* synthetic */ i m34567a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36289a = c7213a.m33564f();
                    continue;
                case 16:
                    this.f36290b = c7213a.m33567i();
                    continue;
                case 26:
                    this.f36291c = c7213a.m33564f();
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
