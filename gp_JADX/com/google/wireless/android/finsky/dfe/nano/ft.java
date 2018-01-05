package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.iu;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ft extends b {
    public int f39018a;
    public cp f39019b;
    public bm f39020c;
    public String f39021d;
    public iu f39022e;
    public String f39023f;

    public ft() {
        this.f39018a = 0;
        this.f39019b = null;
        this.f39020c = null;
        this.f39021d = "";
        this.f39022e = null;
        this.f39023f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36455a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39019b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39019b);
        }
        if ((this.f39018a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39021d);
        }
        if (this.f39022e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39022e);
        }
        if ((this.f39018a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39023f);
        }
        if (this.f39020c != null) {
            codedOutputByteBufferNano.m33532b(5, this.f39020c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36456b() {
        int b = super.b();
        if (this.f39019b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39019b);
        }
        if ((this.f39018a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39021d);
        }
        if (this.f39022e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39022e);
        }
        if ((this.f39018a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f39023f);
        }
        if (this.f39020c != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f39020c);
        }
        return b;
    }

    public final /* synthetic */ i m36454a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39019b == null) {
                        this.f39019b = new cp();
                    }
                    c7213a.m33552a(this.f39019b);
                    continue;
                case 18:
                    this.f39021d = c7213a.m33564f();
                    this.f39018a |= 1;
                    continue;
                case 26:
                    if (this.f39022e == null) {
                        this.f39022e = new iu();
                    }
                    c7213a.m33552a(this.f39022e);
                    continue;
                case 34:
                    this.f39023f = c7213a.m33564f();
                    this.f39018a |= 2;
                    continue;
                case 42:
                    if (this.f39020c == null) {
                        this.f39020c = new bm();
                    }
                    c7213a.m33552a(this.f39020c);
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
