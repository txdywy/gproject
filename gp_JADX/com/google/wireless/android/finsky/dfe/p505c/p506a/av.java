package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class av extends b {
    public int f37135a;
    public String f37136b;
    public String f37137c;
    public bd f37138d;
    public bd f37139e;
    public au f37140f;
    public String f37141g;
    public String f37142h;

    public av() {
        this.f37135a = 0;
        this.f37136b = "";
        this.f37137c = "";
        this.f37138d = null;
        this.f37139e = null;
        this.f37140f = null;
        this.f37141g = "";
        this.f37142h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35141a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37135a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37136b);
        }
        if ((this.f37135a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37137c);
        }
        if (this.f37138d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37138d);
        }
        if (this.f37139e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37139e);
        }
        if (this.f37140f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37140f);
        }
        if ((this.f37135a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37141g);
        }
        if ((this.f37135a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f37142h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35142b() {
        int b = super.b();
        if ((this.f37135a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37136b);
        }
        if ((this.f37135a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37137c);
        }
        if (this.f37138d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37138d);
        }
        if (this.f37139e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37139e);
        }
        if (this.f37140f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37140f);
        }
        if ((this.f37135a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37141g);
        }
        if ((this.f37135a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f37142h);
        }
        return b;
    }

    public final /* synthetic */ i m35140a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37136b = c7213a.m33564f();
                    this.f37135a |= 1;
                    continue;
                case 18:
                    this.f37137c = c7213a.m33564f();
                    this.f37135a |= 2;
                    continue;
                case 26:
                    if (this.f37138d == null) {
                        this.f37138d = new bd();
                    }
                    c7213a.m33552a(this.f37138d);
                    continue;
                case 34:
                    if (this.f37139e == null) {
                        this.f37139e = new bd();
                    }
                    c7213a.m33552a(this.f37139e);
                    continue;
                case 42:
                    if (this.f37140f == null) {
                        this.f37140f = new au();
                    }
                    c7213a.m33552a(this.f37140f);
                    continue;
                case 50:
                    this.f37141g = c7213a.m33564f();
                    this.f37135a |= 4;
                    continue;
                case 58:
                    this.f37142h = c7213a.m33564f();
                    this.f37135a |= 8;
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
