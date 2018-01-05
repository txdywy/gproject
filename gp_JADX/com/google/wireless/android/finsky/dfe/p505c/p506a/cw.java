package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cw extends b {
    public int f37367a;
    public byte[] f37368b;
    public bm f37369c;
    public co f37370d;
    public dt f37371e;
    public bl f37372f;
    public String f37373g;

    public cw() {
        this.f37367a = 0;
        this.f37368b = C7222l.f35479l;
        this.f37369c = null;
        this.f37370d = null;
        this.f37371e = null;
        this.f37372f = null;
        this.f37373g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35326a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37367a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f37368b);
        }
        if (this.f37369c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37369c);
        }
        if (this.f37370d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37370d);
        }
        if (this.f37371e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37371e);
        }
        if (this.f37372f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37372f);
        }
        if ((this.f37367a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f37373g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35327b() {
        int b = super.b();
        if ((this.f37367a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f37368b);
        }
        if (this.f37369c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37369c);
        }
        if (this.f37370d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37370d);
        }
        if (this.f37371e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37371e);
        }
        if (this.f37372f != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37372f);
        }
        if ((this.f37367a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f37373g);
        }
        return b;
    }

    public final /* synthetic */ i m35325a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37368b = c7213a.m33565g();
                    this.f37367a |= 1;
                    continue;
                case 18:
                    if (this.f37369c == null) {
                        this.f37369c = new bm();
                    }
                    c7213a.m33552a(this.f37369c);
                    continue;
                case 26:
                    if (this.f37370d == null) {
                        this.f37370d = new co();
                    }
                    c7213a.m33552a(this.f37370d);
                    continue;
                case 34:
                    if (this.f37371e == null) {
                        this.f37371e = new dt();
                    }
                    c7213a.m33552a(this.f37371e);
                    continue;
                case 50:
                    if (this.f37372f == null) {
                        this.f37372f = new bl();
                    }
                    c7213a.m33552a(this.f37372f);
                    continue;
                case 58:
                    this.f37373g = c7213a.m33564f();
                    this.f37367a |= 2;
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
