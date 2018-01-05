package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7541q extends b {
    public int f39189a;
    public String f39190b;
    public String f39191c;
    public String f39192d;
    public String f39193e;

    public C7541q() {
        this.f39189a = 0;
        this.f39190b = "";
        this.f39191c = "";
        this.f39192d = "";
        this.f39193e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36574a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39189a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39190b);
        }
        if ((this.f39189a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39191c);
        }
        if ((this.f39189a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39193e);
        }
        if ((this.f39189a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39192d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36575b() {
        int b = super.b();
        if ((this.f39189a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39190b);
        }
        if ((this.f39189a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39191c);
        }
        if ((this.f39189a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39193e);
        }
        if ((this.f39189a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f39192d);
        }
        return b;
    }

    public final /* synthetic */ i m36573a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39190b = c7213a.m33564f();
                    this.f39189a |= 1;
                    continue;
                case 18:
                    this.f39191c = c7213a.m33564f();
                    this.f39189a |= 2;
                    continue;
                case 26:
                    this.f39193e = c7213a.m33564f();
                    this.f39189a |= 8;
                    continue;
                case 34:
                    this.f39192d = c7213a.m33564f();
                    this.f39189a |= 4;
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
