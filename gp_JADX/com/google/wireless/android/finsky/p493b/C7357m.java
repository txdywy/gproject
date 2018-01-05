package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7357m extends b {
    public int f36775a;
    public String f36776b;
    public String f36777c;

    public C7357m() {
        this.f36775a = 0;
        this.f36776b = "";
        this.f36777c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34872a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33521a(1, this.f36776b);
        if ((this.f36775a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36777c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34873b() {
        int b = super.b() + CodedOutputByteBufferNano.m33493b(1, this.f36776b);
        if ((this.f36775a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36777c);
        }
        return b;
    }

    public final /* synthetic */ i m34871a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36776b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36777c = c7213a.m33564f();
                    this.f36775a |= 1;
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
