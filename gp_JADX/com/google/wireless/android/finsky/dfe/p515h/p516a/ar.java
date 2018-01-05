package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ar extends b {
    public int f38059a;
    public String f38060b;
    public String f38061c;
    public String f38062d;
    public String f38063e;

    public ar() {
        this.f38059a = 0;
        this.f38060b = "";
        this.f38061c = "";
        this.f38062d = "";
        this.f38063e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35776a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38059a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38061c);
        }
        if ((this.f38059a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38060b);
        }
        if ((this.f38059a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38062d);
        }
        if ((this.f38059a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38063e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35777b() {
        int b = super.b();
        if ((this.f38059a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38061c);
        }
        if ((this.f38059a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38060b);
        }
        if ((this.f38059a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38062d);
        }
        if ((this.f38059a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f38063e);
        }
        return b;
    }

    public final /* synthetic */ i m35775a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38061c = c7213a.m33564f();
                    this.f38059a |= 2;
                    continue;
                case 18:
                    this.f38060b = c7213a.m33564f();
                    this.f38059a |= 1;
                    continue;
                case 26:
                    this.f38062d = c7213a.m33564f();
                    this.f38059a |= 4;
                    continue;
                case 34:
                    this.f38063e = c7213a.m33564f();
                    this.f38059a |= 8;
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
