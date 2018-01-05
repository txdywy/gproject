package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ac extends b {
    public int f36327a;
    public String f36328b;
    public String f36329c;
    public String f36330d;
    public String f36331e;
    public String f36332f;

    public ac() {
        this.f36327a = 0;
        this.f36328b = "";
        this.f36329c = "";
        this.f36330d = "";
        this.f36331e = "";
        this.f36332f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34606a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36327a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36328b);
        }
        if ((this.f36327a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36329c);
        }
        if ((this.f36327a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36330d);
        }
        if ((this.f36327a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36331e);
        }
        if ((this.f36327a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36332f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34607b() {
        int b = super.b();
        if ((this.f36327a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36328b);
        }
        if ((this.f36327a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36329c);
        }
        if ((this.f36327a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36330d);
        }
        if ((this.f36327a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36331e);
        }
        if ((this.f36327a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f36332f);
        }
        return b;
    }

    public final /* synthetic */ i m34605a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36328b = c7213a.m33564f();
                    this.f36327a |= 1;
                    continue;
                case 18:
                    this.f36329c = c7213a.m33564f();
                    this.f36327a |= 2;
                    continue;
                case 26:
                    this.f36330d = c7213a.m33564f();
                    this.f36327a |= 4;
                    continue;
                case 34:
                    this.f36331e = c7213a.m33564f();
                    this.f36327a |= 8;
                    continue;
                case 42:
                    this.f36332f = c7213a.m33564f();
                    this.f36327a |= 16;
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
