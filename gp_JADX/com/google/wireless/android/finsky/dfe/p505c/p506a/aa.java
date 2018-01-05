package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bp;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aa extends b {
    public int f37002a;
    public ax f37003b;
    public int f37004c;
    public String f37005d;
    public String f37006e;
    public cr f37007f;
    public bl f37008g;
    public bl f37009h;

    public aa() {
        this.f37002a = 0;
        this.f37003b = null;
        this.f37004c = 1;
        this.f37005d = "";
        this.f37006e = "";
        this.f37007f = null;
        this.f37008g = null;
        this.f37009h = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35061a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37003b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37003b);
        }
        if ((this.f37002a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37004c);
        }
        if ((this.f37002a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37005d);
        }
        if ((this.f37002a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37006e);
        }
        if (this.f37007f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37007f);
        }
        if (this.f37008g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37008g);
        }
        if (this.f37009h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37009h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35062b() {
        int b = super.b();
        if (this.f37003b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37003b);
        }
        if ((this.f37002a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37004c);
        }
        if ((this.f37002a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37005d);
        }
        if ((this.f37002a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37006e);
        }
        if (this.f37007f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37007f);
        }
        if (this.f37008g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37008g);
        }
        if (this.f37009h != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f37009h);
        }
        return b;
    }

    private final aa m35059b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37003b == null) {
                        this.f37003b = new ax();
                    }
                    c7213a.m33552a(this.f37003b);
                    continue;
                case 16:
                    this.f37002a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f37004c = bp.a(c7213a.m33567i());
                        this.f37002a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 26:
                    this.f37005d = c7213a.m33564f();
                    this.f37002a |= 2;
                    continue;
                case 34:
                    this.f37006e = c7213a.m33564f();
                    this.f37002a |= 4;
                    continue;
                case 42:
                    if (this.f37007f == null) {
                        this.f37007f = new cr();
                    }
                    c7213a.m33552a(this.f37007f);
                    continue;
                case 50:
                    if (this.f37008g == null) {
                        this.f37008g = new bl();
                    }
                    c7213a.m33552a(this.f37008g);
                    continue;
                case 58:
                    if (this.f37009h == null) {
                        this.f37009h = new bl();
                    }
                    c7213a.m33552a(this.f37009h);
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

    public final /* synthetic */ i m35060a(C7213a c7213a) {
        return m35059b(c7213a);
    }
}
