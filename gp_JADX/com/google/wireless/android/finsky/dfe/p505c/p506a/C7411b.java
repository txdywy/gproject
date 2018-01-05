package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7327i;

public final class C7411b extends b {
    public int f37154a;
    public bl f37155b;
    public bl f37156c;
    public int f37157d;
    public C7327i f37158e;
    public String f37159f;
    public String f37160g;

    public C7411b() {
        this.f37154a = 0;
        this.f37155b = null;
        this.f37156c = null;
        this.f37157d = 0;
        this.f37158e = null;
        this.f37159f = "";
        this.f37160g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35154a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37155b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37155b);
        }
        if (this.f37156c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37156c);
        }
        if ((this.f37154a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37157d);
        }
        if (this.f37158e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37158e);
        }
        if ((this.f37154a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37159f);
        }
        if ((this.f37154a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37160g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35155b() {
        int b = super.b();
        if (this.f37155b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37155b);
        }
        if (this.f37156c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37156c);
        }
        if ((this.f37154a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37157d);
        }
        if (this.f37158e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37158e);
        }
        if ((this.f37154a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37159f);
        }
        if ((this.f37154a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f37160g);
        }
        return b;
    }

    public final /* synthetic */ i m35153a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37155b == null) {
                        this.f37155b = new bl();
                    }
                    c7213a.m33552a(this.f37155b);
                    continue;
                case 18:
                    if (this.f37156c == null) {
                        this.f37156c = new bl();
                    }
                    c7213a.m33552a(this.f37156c);
                    continue;
                case 24:
                    this.f37157d = c7213a.m33567i();
                    this.f37154a |= 1;
                    continue;
                case 34:
                    if (this.f37158e == null) {
                        this.f37158e = new C7327i();
                    }
                    c7213a.m33552a(this.f37158e);
                    continue;
                case 42:
                    this.f37159f = c7213a.m33564f();
                    this.f37154a |= 2;
                    continue;
                case 50:
                    this.f37160g = c7213a.m33564f();
                    this.f37154a |= 4;
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
