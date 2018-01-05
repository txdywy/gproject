package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ai extends b {
    public int f37065a;
    public String f37066b;
    public String f37067c;
    public byte[] f37068d;
    public bl f37069e;
    public bl f37070f;

    public ai() {
        this.f37065a = 0;
        this.f37066b = "";
        this.f37067c = "";
        this.f37068d = C7222l.f35479l;
        this.f37069e = null;
        this.f37070f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35091a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37065a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37066b);
        }
        if ((this.f37065a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37067c);
        }
        if ((this.f37065a & 4) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f37068d);
        }
        if (this.f37069e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37069e);
        }
        if (this.f37070f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37070f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35092b() {
        int b = super.b();
        if ((this.f37065a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37066b);
        }
        if ((this.f37065a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37067c);
        }
        if ((this.f37065a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f37068d);
        }
        if (this.f37069e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37069e);
        }
        if (this.f37070f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37070f);
        }
        return b;
    }

    public final /* synthetic */ i m35090a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37066b = c7213a.m33564f();
                    this.f37065a |= 1;
                    continue;
                case 18:
                    this.f37067c = c7213a.m33564f();
                    this.f37065a |= 2;
                    continue;
                case 26:
                    this.f37068d = c7213a.m33565g();
                    this.f37065a |= 4;
                    continue;
                case 34:
                    if (this.f37069e == null) {
                        this.f37069e = new bl();
                    }
                    c7213a.m33552a(this.f37069e);
                    continue;
                case 42:
                    if (this.f37070f == null) {
                        this.f37070f = new bl();
                    }
                    c7213a.m33552a(this.f37070f);
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
