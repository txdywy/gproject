package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class an extends b {
    public int f37835a;
    public al f37836b;
    public String f37837c;
    public byte[] f37838d;

    public an() {
        this.f37835a = 0;
        this.f37836b = null;
        this.f37837c = "";
        this.f37838d = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35623a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37836b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37836b);
        }
        if ((this.f37835a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f37838d);
        }
        if ((this.f37835a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37837c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35624b() {
        int b = super.b();
        if (this.f37836b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37836b);
        }
        if ((this.f37835a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(2, this.f37838d);
        }
        if ((this.f37835a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f37837c);
        }
        return b;
    }

    public final /* synthetic */ i m35622a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37836b == null) {
                        this.f37836b = new al();
                    }
                    c7213a.m33552a(this.f37836b);
                    continue;
                case 18:
                    this.f37838d = c7213a.m33565g();
                    this.f37835a |= 2;
                    continue;
                case 26:
                    this.f37837c = c7213a.m33564f();
                    this.f37835a |= 1;
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
