package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fy extends b {
    public int f39034a;
    public String f39035b;
    public boolean f39036c;
    public byte[] f39037d;

    public fy() {
        this.f39034a = 0;
        this.f39035b = "";
        this.f39036c = false;
        this.f39037d = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36468a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39034a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39035b);
        }
        if ((this.f39034a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f39036c);
        }
        if ((this.f39034a & 4) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f39037d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36469b() {
        int b = super.b();
        if ((this.f39034a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39035b);
        }
        if ((this.f39034a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f39034a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(3, this.f39037d);
        }
        return b;
    }

    public final /* synthetic */ i m36467a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39035b = c7213a.m33564f();
                    this.f39034a |= 1;
                    continue;
                case 16:
                    this.f39036c = c7213a.m33563e();
                    this.f39034a |= 2;
                    continue;
                case 26:
                    this.f39037d = c7213a.m33565g();
                    this.f39034a |= 4;
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
