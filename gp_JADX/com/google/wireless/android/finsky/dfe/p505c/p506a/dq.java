package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dq extends b {
    public int f37482a;
    public String f37483b;
    public String f37484c;
    public String f37485d;

    public dq() {
        this.f37482a = 0;
        this.f37483b = "";
        this.f37484c = "";
        this.f37485d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35394a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37482a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37483b);
        }
        if ((this.f37482a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37484c);
        }
        if ((this.f37482a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37485d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35395b() {
        int b = super.b();
        if ((this.f37482a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37483b);
        }
        if ((this.f37482a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37484c);
        }
        if ((this.f37482a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f37485d);
        }
        return b;
    }

    public final /* synthetic */ i m35393a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37483b = c7213a.m33564f();
                    this.f37482a |= 1;
                    continue;
                case 18:
                    this.f37484c = c7213a.m33564f();
                    this.f37482a |= 2;
                    continue;
                case 26:
                    this.f37485d = c7213a.m33564f();
                    this.f37482a |= 4;
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
