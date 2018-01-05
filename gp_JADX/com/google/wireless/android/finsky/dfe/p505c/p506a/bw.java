package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bw extends b {
    public int f37255a;
    public de f37256b;
    public String f37257c;
    public String f37258d;

    public bw() {
        this.f37255a = 0;
        this.f37256b = null;
        this.f37257c = "";
        this.f37258d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35230a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37256b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37256b);
        }
        if ((this.f37255a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37257c);
        }
        if ((this.f37255a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37258d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35231b() {
        int b = super.b();
        if (this.f37256b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37256b);
        }
        if ((this.f37255a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37257c);
        }
        if ((this.f37255a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f37258d);
        }
        return b;
    }

    public final /* synthetic */ i m35229a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37256b == null) {
                        this.f37256b = new de();
                    }
                    c7213a.m33552a(this.f37256b);
                    continue;
                case 18:
                    this.f37257c = c7213a.m33564f();
                    this.f37255a |= 1;
                    continue;
                case 26:
                    this.f37258d = c7213a.m33564f();
                    this.f37255a |= 2;
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
