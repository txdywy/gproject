package com.google.p443h.p451c.p457c.p460b.p467d;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7178b extends b {
    public String f35023a;
    public String f35024b;
    public String f35025c;
    public String f35026d;

    public C7178b() {
        this.f35023a = "";
        this.f35024b = "";
        this.f35025c = "";
        this.f35026d = "";
        this.aP = -1;
    }

    public final void m32531a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f35023a == null || this.f35023a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f35023a);
        }
        if (!(this.f35025c == null || this.f35025c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f35025c);
        }
        if (!(this.f35026d == null || this.f35026d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f35026d);
        }
        if (!(this.f35024b == null || this.f35024b.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f35024b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32532b() {
        int b = super.b();
        if (!(this.f35023a == null || this.f35023a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35023a);
        }
        if (!(this.f35025c == null || this.f35025c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f35025c);
        }
        if (!(this.f35026d == null || this.f35026d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f35026d);
        }
        if (this.f35024b == null || this.f35024b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(4, this.f35024b);
    }

    public final /* synthetic */ i m32530a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35023a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f35025c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f35026d = c7213a.m33564f();
                    continue;
                case 34:
                    this.f35024b = c7213a.m33564f();
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
