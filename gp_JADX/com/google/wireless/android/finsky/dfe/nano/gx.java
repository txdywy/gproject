package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gx extends b {
    public int f39137a;
    public cv f39138b;
    public String f39139c;
    public String f39140d;
    public String f39141e;
    public boolean f39142f;

    public gx() {
        this.f39137a = 0;
        this.f39138b = null;
        this.f39139c = "";
        this.f39140d = "";
        this.f39141e = "";
        this.f39142f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36542a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39138b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39138b);
        }
        if ((this.f39137a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39139c);
        }
        if ((this.f39137a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39140d);
        }
        if ((this.f39137a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39141e);
        }
        if ((this.f39137a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f39142f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36543b() {
        int b = super.b();
        if (this.f39138b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39138b);
        }
        if ((this.f39137a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39139c);
        }
        if ((this.f39137a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39140d);
        }
        if ((this.f39137a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f39141e);
        }
        if ((this.f39137a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36541a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39138b == null) {
                        this.f39138b = new cv();
                    }
                    c7213a.m33552a(this.f39138b);
                    continue;
                case 18:
                    this.f39139c = c7213a.m33564f();
                    this.f39137a |= 1;
                    continue;
                case 26:
                    this.f39140d = c7213a.m33564f();
                    this.f39137a |= 2;
                    continue;
                case 34:
                    this.f39141e = c7213a.m33564f();
                    this.f39137a |= 4;
                    continue;
                case 40:
                    this.f39142f = c7213a.m33563e();
                    this.f39137a |= 8;
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
