package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bk extends b {
    public int f37188a;
    public String f37189b;
    public String f37190c;
    public String f37191d;
    public String f37192e;
    public au f37193f;
    public au f37194g;

    public bk() {
        this.f37188a = 0;
        this.f37189b = "";
        this.f37190c = "";
        this.f37191d = "";
        this.f37192e = "";
        this.f37193f = null;
        this.f37194g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35189a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37188a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37189b);
        }
        if ((this.f37188a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37190c);
        }
        if ((this.f37188a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37191d);
        }
        if ((this.f37188a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37192e);
        }
        if (this.f37193f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37193f);
        }
        if (this.f37194g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37194g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35190b() {
        int b = super.b();
        if ((this.f37188a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37189b);
        }
        if ((this.f37188a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37190c);
        }
        if ((this.f37188a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37191d);
        }
        if ((this.f37188a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37192e);
        }
        if (this.f37193f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37193f);
        }
        if (this.f37194g != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37194g);
        }
        return b;
    }

    public final /* synthetic */ i m35188a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37189b = c7213a.m33564f();
                    this.f37188a |= 1;
                    continue;
                case 18:
                    this.f37190c = c7213a.m33564f();
                    this.f37188a |= 2;
                    continue;
                case 26:
                    this.f37191d = c7213a.m33564f();
                    this.f37188a |= 4;
                    continue;
                case 34:
                    this.f37192e = c7213a.m33564f();
                    this.f37188a |= 8;
                    continue;
                case 42:
                    if (this.f37193f == null) {
                        this.f37193f = new au();
                    }
                    c7213a.m33552a(this.f37193f);
                    continue;
                case 50:
                    if (this.f37194g == null) {
                        this.f37194g = new au();
                    }
                    c7213a.m33552a(this.f37194g);
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
