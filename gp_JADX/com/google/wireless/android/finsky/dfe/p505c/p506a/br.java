package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class br extends b {
    public int f37228a;
    public de f37229b;
    public boolean f37230c;
    public bl f37231d;
    public String f37232e;
    public boolean f37233f;
    public String f37234g;
    public String f37235h;

    public br() {
        this.f37228a = 0;
        this.f37229b = null;
        this.f37230c = false;
        this.f37231d = null;
        this.f37232e = "";
        this.f37233f = false;
        this.f37234g = "";
        this.f37235h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35212a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37229b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37229b);
        }
        if ((this.f37228a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f37230c);
        }
        if (this.f37231d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37231d);
        }
        if ((this.f37228a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37232e);
        }
        if ((this.f37228a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37233f);
        }
        if ((this.f37228a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37234g);
        }
        if ((this.f37228a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f37235h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35213b() {
        int b = super.b();
        if (this.f37229b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37229b);
        }
        if ((this.f37228a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f37231d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37231d);
        }
        if ((this.f37228a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37232e);
        }
        if ((this.f37228a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f37228a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37234g);
        }
        if ((this.f37228a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f37235h);
        }
        return b;
    }

    public final /* synthetic */ i m35211a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37229b == null) {
                        this.f37229b = new de();
                    }
                    c7213a.m33552a(this.f37229b);
                    continue;
                case 16:
                    this.f37230c = c7213a.m33563e();
                    this.f37228a |= 1;
                    continue;
                case 26:
                    if (this.f37231d == null) {
                        this.f37231d = new bl();
                    }
                    c7213a.m33552a(this.f37231d);
                    continue;
                case 34:
                    this.f37232e = c7213a.m33564f();
                    this.f37228a |= 2;
                    continue;
                case 40:
                    this.f37233f = c7213a.m33563e();
                    this.f37228a |= 4;
                    continue;
                case 50:
                    this.f37234g = c7213a.m33564f();
                    this.f37228a |= 8;
                    continue;
                case 58:
                    this.f37235h = c7213a.m33564f();
                    this.f37228a |= 16;
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
