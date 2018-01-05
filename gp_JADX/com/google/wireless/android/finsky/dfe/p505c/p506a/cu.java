package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cu extends b {
    public static volatile cu[] f37354a;
    public int f37355b;
    public de f37356c;
    public de f37357d;
    public String f37358e;
    public String f37359f;
    public String f37360g;
    public de f37361h;

    public static cu[] m35318d() {
        if (f37354a == null) {
            synchronized (C7219h.f35465b) {
                if (f37354a == null) {
                    f37354a = new cu[0];
                }
            }
        }
        return f37354a;
    }

    public cu() {
        this.f37355b = 0;
        this.f37356c = null;
        this.f37357d = null;
        this.f37358e = "";
        this.f37359f = "";
        this.f37360g = "";
        this.f37361h = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35320a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37356c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37356c);
        }
        if (this.f37357d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37357d);
        }
        if ((this.f37355b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37358e);
        }
        if ((this.f37355b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37359f);
        }
        if ((this.f37355b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37360g);
        }
        if (this.f37361h != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37361h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35321b() {
        int b = super.b();
        if (this.f37356c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37356c);
        }
        if (this.f37357d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37357d);
        }
        if ((this.f37355b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37358e);
        }
        if ((this.f37355b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37359f);
        }
        if ((this.f37355b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37360g);
        }
        if (this.f37361h != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37361h);
        }
        return b;
    }

    public final /* synthetic */ i m35319a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37356c == null) {
                        this.f37356c = new de();
                    }
                    c7213a.m33552a(this.f37356c);
                    continue;
                case 18:
                    if (this.f37357d == null) {
                        this.f37357d = new de();
                    }
                    c7213a.m33552a(this.f37357d);
                    continue;
                case 26:
                    this.f37358e = c7213a.m33564f();
                    this.f37355b |= 1;
                    continue;
                case 34:
                    this.f37359f = c7213a.m33564f();
                    this.f37355b |= 2;
                    continue;
                case 42:
                    this.f37360g = c7213a.m33564f();
                    this.f37355b |= 4;
                    continue;
                case 50:
                    if (this.f37361h == null) {
                        this.f37361h = new de();
                    }
                    c7213a.m33552a(this.f37361h);
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
