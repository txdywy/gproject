package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ai extends b {
    public int f37809a;
    public ax f37810b;
    public String f37811c;
    public String f37812d;
    public String f37813e;
    public byte[] f37814f;
    public String f37815g;
    public String f37816h;
    public String f37817i;

    public ai() {
        this.f37809a = 0;
        this.f37810b = null;
        this.f37811c = "";
        this.f37812d = "";
        this.f37813e = "";
        this.f37814f = C7222l.f35479l;
        this.f37815g = "";
        this.f37816h = "";
        this.f37817i = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35610a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37810b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37810b);
        }
        if ((this.f37809a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37812d);
        }
        if ((this.f37809a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37813e);
        }
        if ((this.f37809a & 8) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f37814f);
        }
        if ((this.f37809a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37815g);
        }
        if ((this.f37809a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37811c);
        }
        if ((this.f37809a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f37816h);
        }
        if ((this.f37809a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f37817i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35611b() {
        int b = super.b();
        if (this.f37810b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37810b);
        }
        if ((this.f37809a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37812d);
        }
        if ((this.f37809a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37813e);
        }
        if ((this.f37809a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33494b(4, this.f37814f);
        }
        if ((this.f37809a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37815g);
        }
        if ((this.f37809a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37811c);
        }
        if ((this.f37809a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f37816h);
        }
        if ((this.f37809a & 64) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(8, this.f37817i);
        }
        return b;
    }

    public final /* synthetic */ i m35609a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37810b == null) {
                        this.f37810b = new ax();
                    }
                    c7213a.m33552a(this.f37810b);
                    continue;
                case 18:
                    this.f37812d = c7213a.m33564f();
                    this.f37809a |= 2;
                    continue;
                case 26:
                    this.f37813e = c7213a.m33564f();
                    this.f37809a |= 4;
                    continue;
                case 34:
                    this.f37814f = c7213a.m33565g();
                    this.f37809a |= 8;
                    continue;
                case 42:
                    this.f37815g = c7213a.m33564f();
                    this.f37809a |= 16;
                    continue;
                case 50:
                    this.f37811c = c7213a.m33564f();
                    this.f37809a |= 1;
                    continue;
                case 58:
                    this.f37816h = c7213a.m33564f();
                    this.f37809a |= 32;
                    continue;
                case 66:
                    this.f37817i = c7213a.m33564f();
                    this.f37809a |= 64;
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
