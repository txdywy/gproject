package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cv extends b {
    public int f36026a;
    public String f36027b;
    public String f36028c;

    public cv() {
        this.f36026a = 0;
        this.f36027b = "";
        this.f36028c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34376a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36026a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36027b);
        }
        if ((this.f36026a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36028c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34377b() {
        int b = super.b();
        if ((this.f36026a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36027b);
        }
        if ((this.f36026a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36028c);
        }
        return b;
    }

    public final /* synthetic */ i m34375a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36027b = c7213a.m33564f();
                    this.f36026a |= 1;
                    continue;
                case 18:
                    this.f36028c = c7213a.m33564f();
                    this.f36026a |= 2;
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