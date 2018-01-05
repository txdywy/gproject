package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public static volatile ae[] f36696a;
    public int f36697b;
    public String f36698c;
    public long f36699d;
    public long f36700e;
    public String f36701f;
    public String f36702g;
    public String f36703h;
    public String f36704i;
    public C7348d f36705j;
    public C7350f f36706k;

    public static ae[] m34814d() {
        if (f36696a == null) {
            synchronized (C7219h.f35465b) {
                if (f36696a == null) {
                    f36696a = new ae[0];
                }
            }
        }
        return f36696a;
    }

    public ae() {
        this.f36697b = 0;
        this.f36698c = "";
        this.f36699d = 0;
        this.f36700e = 0;
        this.f36701f = "";
        this.f36702g = "";
        this.f36703h = "";
        this.f36704i = "";
        this.f36705j = null;
        this.f36706k = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34816a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36697b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36698c);
        }
        if ((this.f36697b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36699d);
        }
        if ((this.f36697b & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36700e);
        }
        if ((this.f36697b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36701f);
        }
        if ((this.f36697b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36703h);
        }
        if ((this.f36697b & 64) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36704i);
        }
        if (this.f36705j != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36705j);
        }
        if (this.f36706k != null) {
            codedOutputByteBufferNano.m33532b(8, this.f36706k);
        }
        if ((this.f36697b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f36702g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34817b() {
        int b = super.b();
        if ((this.f36697b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36698c);
        }
        if ((this.f36697b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36699d);
        }
        if ((this.f36697b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f36700e);
        }
        if ((this.f36697b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36701f);
        }
        if ((this.f36697b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36703h);
        }
        if ((this.f36697b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36704i);
        }
        if (this.f36705j != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36705j);
        }
        if (this.f36706k != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f36706k);
        }
        if ((this.f36697b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(9, this.f36702g);
        }
        return b;
    }

    public final /* synthetic */ i m34815a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36698c = c7213a.m33564f();
                    this.f36697b |= 1;
                    continue;
                case 16:
                    this.f36699d = c7213a.m33568j();
                    this.f36697b |= 2;
                    continue;
                case 24:
                    this.f36700e = c7213a.m33568j();
                    this.f36697b |= 4;
                    continue;
                case 34:
                    this.f36701f = c7213a.m33564f();
                    this.f36697b |= 8;
                    continue;
                case 42:
                    this.f36703h = c7213a.m33564f();
                    this.f36697b |= 32;
                    continue;
                case 50:
                    this.f36704i = c7213a.m33564f();
                    this.f36697b |= 64;
                    continue;
                case 58:
                    if (this.f36705j == null) {
                        this.f36705j = new C7348d();
                    }
                    c7213a.m33552a(this.f36705j);
                    continue;
                case 66:
                    if (this.f36706k == null) {
                        this.f36706k = new C7350f();
                    }
                    c7213a.m33552a(this.f36706k);
                    continue;
                case 74:
                    this.f36702g = c7213a.m33564f();
                    this.f36697b |= 16;
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
