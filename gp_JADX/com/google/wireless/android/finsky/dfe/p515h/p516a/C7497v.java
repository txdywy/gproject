package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7497v extends b {
    public int f38143a;
    public String f38144b;
    public String f38145c;
    public bd f38146d;
    public String f38147e;
    public String f38148f;

    public C7497v() {
        this.f38143a = 0;
        this.f38144b = "";
        this.f38145c = "";
        this.f38146d = null;
        this.f38147e = "";
        this.f38148f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35855a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38143a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38144b);
        }
        if ((this.f38143a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38145c);
        }
        if (this.f38146d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38146d);
        }
        if ((this.f38143a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38147e);
        }
        if ((this.f38143a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38148f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35856b() {
        int b = super.b();
        if ((this.f38143a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38144b);
        }
        if ((this.f38143a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38145c);
        }
        if (this.f38146d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38146d);
        }
        if ((this.f38143a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38147e);
        }
        if ((this.f38143a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f38148f);
        }
        return b;
    }

    public final /* synthetic */ i m35854a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38144b = c7213a.m33564f();
                    this.f38143a |= 1;
                    continue;
                case 18:
                    this.f38145c = c7213a.m33564f();
                    this.f38143a |= 2;
                    continue;
                case 26:
                    if (this.f38146d == null) {
                        this.f38146d = new bd();
                    }
                    c7213a.m33552a(this.f38146d);
                    continue;
                case 34:
                    this.f38147e = c7213a.m33564f();
                    this.f38143a |= 4;
                    continue;
                case 42:
                    this.f38148f = c7213a.m33564f();
                    this.f38143a |= 8;
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
