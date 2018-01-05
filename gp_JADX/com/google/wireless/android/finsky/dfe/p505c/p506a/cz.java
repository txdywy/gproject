package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cz extends b {
    public int f37383a;
    public cr f37384b;
    public bm f37385c;
    public da f37386d;
    public int f37387e;
    public bl f37388f;
    public cp f37389g;

    public cz() {
        this.f37383a = 0;
        this.f37384b = null;
        this.f37385c = null;
        this.f37386d = null;
        this.f37387e = 0;
        this.f37388f = null;
        this.f37389g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35336a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37384b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37384b);
        }
        if (this.f37385c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37385c);
        }
        if (this.f37386d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37386d);
        }
        if ((this.f37383a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37387e);
        }
        if (this.f37388f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37388f);
        }
        if (this.f37389g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37389g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35337b() {
        int b = super.b();
        if (this.f37384b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37384b);
        }
        if (this.f37385c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37385c);
        }
        if (this.f37386d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37386d);
        }
        if ((this.f37383a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f37387e);
        }
        if (this.f37388f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37388f);
        }
        if (this.f37389g != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37389g);
        }
        return b;
    }

    public final /* synthetic */ i m35335a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37384b == null) {
                        this.f37384b = new cr();
                    }
                    c7213a.m33552a(this.f37384b);
                    continue;
                case 18:
                    if (this.f37385c == null) {
                        this.f37385c = new bm();
                    }
                    c7213a.m33552a(this.f37385c);
                    continue;
                case 26:
                    if (this.f37386d == null) {
                        this.f37386d = new da();
                    }
                    c7213a.m33552a(this.f37386d);
                    continue;
                case 32:
                    this.f37387e = c7213a.m33567i();
                    this.f37383a |= 1;
                    continue;
                case 42:
                    if (this.f37388f == null) {
                        this.f37388f = new bl();
                    }
                    c7213a.m33552a(this.f37388f);
                    continue;
                case 50:
                    if (this.f37389g == null) {
                        this.f37389g = new cp();
                    }
                    c7213a.m33552a(this.f37389g);
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
