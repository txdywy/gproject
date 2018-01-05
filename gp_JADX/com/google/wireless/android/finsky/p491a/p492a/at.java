package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class at extends b {
    public int f36429a;
    public long f36430b;
    public String f36431c;
    public String f36432d;

    public at() {
        this.f36429a = 0;
        this.f36430b = 0;
        this.f36431c = "";
        this.f36432d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34672a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33531b(1, this.f36430b);
        codedOutputByteBufferNano.m33521a(2, this.f36431c);
        if ((this.f36429a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36432d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34673b() {
        int b = (super.b() + CodedOutputByteBufferNano.m33508f(1, this.f36430b)) + CodedOutputByteBufferNano.m33493b(2, this.f36431c);
        if ((this.f36429a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f36432d);
        }
        return b;
    }

    public final /* synthetic */ i m34671a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36430b = c7213a.m33568j();
                    continue;
                case 18:
                    this.f36431c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36432d = c7213a.m33564f();
                    this.f36429a |= 1;
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
