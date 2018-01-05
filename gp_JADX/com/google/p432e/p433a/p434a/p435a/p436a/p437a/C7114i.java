package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7114i extends b {
    public String f34805a;
    public String f34806b;
    public int f34807c;
    public int f34808d;

    public C7114i() {
        this.f34805a = "";
        this.f34806b = "";
        this.f34807c = 0;
        this.f34808d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32321a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34805a == null || this.f34805a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34805a);
        }
        if (!(this.f34806b == null || this.f34806b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34806b);
        }
        if (this.f34807c != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34807c);
        }
        if (this.f34808d != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f34808d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32322b() {
        int b = super.b();
        if (!(this.f34805a == null || this.f34805a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34805a);
        }
        if (!(this.f34806b == null || this.f34806b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34806b);
        }
        if (this.f34807c != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f34807c);
        }
        if (this.f34808d != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f34808d);
        }
        return b;
    }

    public final /* synthetic */ i m32320a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34805a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f34806b = c7213a.m33564f();
                    continue;
                case 24:
                    this.f34807c = c7213a.m33567i();
                    continue;
                case 32:
                    this.f34808d = c7213a.m33567i();
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
