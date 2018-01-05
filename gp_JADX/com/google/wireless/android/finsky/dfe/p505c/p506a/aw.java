package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aw extends b {
    public int f37143a;
    public byte[] f37144b;
    public byte[] f37145c;
    public au f37146d;
    public au f37147e;

    public aw() {
        this.f37143a = 0;
        this.f37144b = C7222l.f35479l;
        this.f37145c = C7222l.f35479l;
        this.f37146d = null;
        this.f37147e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35144a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37143a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f37144b);
        }
        if ((this.f37143a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f37145c);
        }
        if (this.f37146d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37146d);
        }
        if (this.f37147e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37147e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35145b() {
        int b = super.b();
        if ((this.f37143a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f37144b);
        }
        if ((this.f37143a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f37145c);
        }
        if (this.f37146d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37146d);
        }
        if (this.f37147e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37147e);
        }
        return b;
    }

    public final /* synthetic */ i m35143a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37144b = c7213a.m33565g();
                    this.f37143a |= 1;
                    continue;
                case 18:
                    this.f37145c = c7213a.m33565g();
                    this.f37143a |= 2;
                    continue;
                case 26:
                    if (this.f37146d == null) {
                        this.f37146d = new au();
                    }
                    c7213a.m33552a(this.f37146d);
                    continue;
                case 34:
                    if (this.f37147e == null) {
                        this.f37147e = new au();
                    }
                    c7213a.m33552a(this.f37147e);
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
