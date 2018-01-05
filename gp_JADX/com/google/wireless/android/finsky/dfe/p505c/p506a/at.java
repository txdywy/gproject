package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class at extends b {
    public int f37122a;
    public String f37123b;
    public String f37124c;
    public String f37125d;

    public at() {
        this.f37122a = 0;
        this.f37123b = "";
        this.f37124c = "";
        this.f37125d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35132a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37122a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37123b);
        }
        if ((this.f37122a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37124c);
        }
        if ((this.f37122a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37125d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35133b() {
        int b = super.b();
        if ((this.f37122a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37123b);
        }
        if ((this.f37122a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37124c);
        }
        if ((this.f37122a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f37125d);
        }
        return b;
    }

    public final /* synthetic */ i m35131a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37123b = c7213a.m33564f();
                    this.f37122a |= 1;
                    continue;
                case 18:
                    this.f37124c = c7213a.m33564f();
                    this.f37122a |= 2;
                    continue;
                case 26:
                    this.f37125d = c7213a.m33564f();
                    this.f37122a |= 4;
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
