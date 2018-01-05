package com.google.p474j.p475a.p476a.p477a.p478a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7194a extends b {
    public String f35078a;
    public String f35079b;

    public C7194a() {
        this.f35078a = "";
        this.f35079b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m32574a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f35078a == null || this.f35078a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f35078a);
        }
        if (!(this.f35079b == null || this.f35079b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f35079b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32575b() {
        int b = super.b();
        if (!(this.f35078a == null || this.f35078a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35078a);
        }
        if (this.f35079b == null || this.f35079b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(2, this.f35079b);
    }

    public final /* synthetic */ i m32573a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35078a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f35079b = c7213a.m33564f();
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
