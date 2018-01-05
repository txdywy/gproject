package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7531g extends b {
    public int f39045a;
    public String f39046b;
    public String f39047c;
    public C7529e f39048d;
    public String f39049e;
    public String f39050f;
    public String f39051g;
    public String f39052h;
    public String f39053i;
    public C7536l f39054j;
    public String f39055k;

    public C7531g() {
        this.f39045a = 0;
        this.f39046b = "";
        this.f39047c = "";
        this.f39048d = null;
        this.f39049e = "";
        this.f39050f = "";
        this.f39051g = "";
        this.f39052h = "";
        this.f39053i = "";
        this.f39054j = null;
        this.f39055k = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36476a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39045a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39046b);
        }
        if ((this.f39045a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39047c);
        }
        if (this.f39048d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39048d);
        }
        if ((this.f39045a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39049e);
        }
        if ((this.f39045a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f39050f);
        }
        if ((this.f39045a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f39052h);
        }
        if ((this.f39045a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f39053i);
        }
        if (this.f39054j != null) {
            codedOutputByteBufferNano.m33532b(8, this.f39054j);
        }
        if ((this.f39045a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f39051g);
        }
        if ((this.f39045a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f39055k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36477b() {
        int b = super.b();
        if ((this.f39045a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39046b);
        }
        if ((this.f39045a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39047c);
        }
        if (this.f39048d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39048d);
        }
        if ((this.f39045a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f39049e);
        }
        if ((this.f39045a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f39050f);
        }
        if ((this.f39045a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f39052h);
        }
        if ((this.f39045a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f39053i);
        }
        if (this.f39054j != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f39054j);
        }
        if ((this.f39045a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f39051g);
        }
        if ((this.f39045a & 128) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(10, this.f39055k);
        }
        return b;
    }

    public final /* synthetic */ i m36475a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39046b = c7213a.m33564f();
                    this.f39045a |= 1;
                    continue;
                case 18:
                    this.f39047c = c7213a.m33564f();
                    this.f39045a |= 2;
                    continue;
                case 26:
                    if (this.f39048d == null) {
                        this.f39048d = new C7529e();
                    }
                    c7213a.m33552a(this.f39048d);
                    continue;
                case 34:
                    this.f39049e = c7213a.m33564f();
                    this.f39045a |= 4;
                    continue;
                case 42:
                    this.f39050f = c7213a.m33564f();
                    this.f39045a |= 8;
                    continue;
                case 50:
                    this.f39052h = c7213a.m33564f();
                    this.f39045a |= 32;
                    continue;
                case 58:
                    this.f39053i = c7213a.m33564f();
                    this.f39045a |= 64;
                    continue;
                case 66:
                    if (this.f39054j == null) {
                        this.f39054j = new C7536l();
                    }
                    c7213a.m33552a(this.f39054j);
                    continue;
                case 74:
                    this.f39051g = c7213a.m33564f();
                    this.f39045a |= 16;
                    continue;
                case 82:
                    this.f39055k = c7213a.m33564f();
                    this.f39045a |= 128;
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
