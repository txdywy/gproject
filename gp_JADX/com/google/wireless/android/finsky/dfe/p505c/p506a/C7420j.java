package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7420j extends b {
    public int f37584a;
    public de f37585b;
    public de f37586c;
    public de f37587d;
    public String f37588e;
    public String f37589f;
    public bl f37590g;
    public cg f37591h;

    public final boolean m35473d() {
        return (this.f37584a & 1) != 0;
    }

    public C7420j() {
        this.f37584a = 0;
        this.f37585b = null;
        this.f37586c = null;
        this.f37587d = null;
        this.f37588e = "";
        this.f37589f = "";
        this.f37590g = null;
        this.f37591h = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35471a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37585b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37585b);
        }
        if (this.f37586c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37586c);
        }
        if (this.f37587d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37587d);
        }
        if ((this.f37584a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37588e);
        }
        if ((this.f37584a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37589f);
        }
        if (this.f37590g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37590g);
        }
        if (this.f37591h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37591h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35472b() {
        int b = super.b();
        if (this.f37585b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37585b);
        }
        if (this.f37586c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37586c);
        }
        if (this.f37587d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37587d);
        }
        if ((this.f37584a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37588e);
        }
        if ((this.f37584a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37589f);
        }
        if (this.f37590g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37590g);
        }
        if (this.f37591h != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f37591h);
        }
        return b;
    }

    public final /* synthetic */ i m35470a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37585b == null) {
                        this.f37585b = new de();
                    }
                    c7213a.m33552a(this.f37585b);
                    continue;
                case 18:
                    if (this.f37586c == null) {
                        this.f37586c = new de();
                    }
                    c7213a.m33552a(this.f37586c);
                    continue;
                case 26:
                    if (this.f37587d == null) {
                        this.f37587d = new de();
                    }
                    c7213a.m33552a(this.f37587d);
                    continue;
                case 34:
                    this.f37588e = c7213a.m33564f();
                    this.f37584a |= 1;
                    continue;
                case 42:
                    this.f37589f = c7213a.m33564f();
                    this.f37584a |= 2;
                    continue;
                case 50:
                    if (this.f37590g == null) {
                        this.f37590g = new bl();
                    }
                    c7213a.m33552a(this.f37590g);
                    continue;
                case 58:
                    if (this.f37591h == null) {
                        this.f37591h = new cg();
                    }
                    c7213a.m33552a(this.f37591h);
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
