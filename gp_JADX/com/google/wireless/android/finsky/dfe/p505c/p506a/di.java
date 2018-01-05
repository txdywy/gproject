package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class di extends b {
    public int f37446a;
    public String f37447b;
    public bl f37448c;

    public di() {
        this.f37446a = 0;
        this.f37447b = "";
        this.f37448c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35370a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37446a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37447b);
        }
        if (this.f37448c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37448c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35371b() {
        int b = super.b();
        if ((this.f37446a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37447b);
        }
        if (this.f37448c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37448c);
        }
        return b;
    }

    public final /* synthetic */ i m35369a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37447b = c7213a.m33564f();
                    this.f37446a |= 1;
                    continue;
                case 18:
                    if (this.f37448c == null) {
                        this.f37448c = new bl();
                    }
                    c7213a.m33552a(this.f37448c);
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
