package com.google.wireless.android.finsky.dfe.p521k.p522a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7521c extends b {
    public int f38263a;
    public String f38264b;
    public String f38265c;

    public C7521c() {
        this.f38263a = 0;
        this.f38264b = "";
        this.f38265c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35949a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38263a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38264b);
        }
        if ((this.f38263a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38265c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35950b() {
        int b = super.b();
        if ((this.f38263a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38264b);
        }
        if ((this.f38263a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38265c);
        }
        return b;
    }

    public final /* synthetic */ i m35948a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38264b = c7213a.m33564f();
                    this.f38263a |= 1;
                    continue;
                case 18:
                    this.f38265c = c7213a.m33564f();
                    this.f38263a |= 2;
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
