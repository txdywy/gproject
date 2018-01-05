package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7473x extends b {
    public int f37955a;
    public String f37956b;
    public String f37957c;
    public ae f37958d;
    public ai f37959e;

    public C7473x() {
        this.f37955a = 0;
        this.f37956b = "";
        this.f37957c = "";
        this.f37958d = null;
        this.f37959e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35707a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37955a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37956b);
        }
        if ((this.f37955a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37957c);
        }
        if (this.f37958d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37958d);
        }
        if (this.f37959e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37959e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35708b() {
        int b = super.b();
        if ((this.f37955a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37956b);
        }
        if ((this.f37955a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37957c);
        }
        if (this.f37958d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37958d);
        }
        if (this.f37959e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37959e);
        }
        return b;
    }

    public final /* synthetic */ i m35706a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37956b = c7213a.m33564f();
                    this.f37955a |= 1;
                    continue;
                case 18:
                    this.f37957c = c7213a.m33564f();
                    this.f37955a |= 2;
                    continue;
                case 26:
                    if (this.f37958d == null) {
                        this.f37958d = new ae();
                    }
                    c7213a.m33552a(this.f37958d);
                    continue;
                case 34:
                    if (this.f37959e == null) {
                        this.f37959e = new ai();
                    }
                    c7213a.m33552a(this.f37959e);
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
