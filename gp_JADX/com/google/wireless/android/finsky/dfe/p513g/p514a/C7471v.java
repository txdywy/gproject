package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7471v extends b {
    public int f37948a;
    public String f37949b;
    public String f37950c;
    public String f37951d;
    public String f37952e;

    public C7471v() {
        this.f37948a = 0;
        this.f37949b = "";
        this.f37950c = "";
        this.f37951d = "";
        this.f37952e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35701a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37948a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37949b);
        }
        if ((this.f37948a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37950c);
        }
        if ((this.f37948a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37951d);
        }
        if ((this.f37948a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37952e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35702b() {
        int b = super.b();
        if ((this.f37948a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37949b);
        }
        if ((this.f37948a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37950c);
        }
        if ((this.f37948a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37951d);
        }
        if ((this.f37948a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f37952e);
        }
        return b;
    }

    public final /* synthetic */ i m35700a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37949b = c7213a.m33564f();
                    this.f37948a |= 1;
                    continue;
                case 18:
                    this.f37950c = c7213a.m33564f();
                    this.f37948a |= 2;
                    continue;
                case 26:
                    this.f37951d = c7213a.m33564f();
                    this.f37948a |= 4;
                    continue;
                case 34:
                    this.f37952e = c7213a.m33564f();
                    this.f37948a |= 8;
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
