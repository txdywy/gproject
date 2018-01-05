package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bp;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cp extends b {
    public int f37333a;
    public ax f37334b;
    public String f37335c;
    public int f37336d;
    public byte[] f37337e;

    public final boolean m35300d() {
        return (this.f37333a & 1) != 0;
    }

    public final boolean m35301e() {
        return (this.f37333a & 2) != 0;
    }

    public cp() {
        this.f37333a = 0;
        this.f37334b = null;
        this.f37335c = "";
        this.f37336d = 1;
        this.f37337e = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35298a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37334b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37334b);
        }
        if ((this.f37333a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37335c);
        }
        if ((this.f37333a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37336d);
        }
        if ((this.f37333a & 4) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f37337e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35299b() {
        int b = super.b();
        if (this.f37334b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37334b);
        }
        if ((this.f37333a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37335c);
        }
        if ((this.f37333a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37336d);
        }
        if ((this.f37333a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(4, this.f37337e);
        }
        return b;
    }

    private final cp m35296b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37334b == null) {
                        this.f37334b = new ax();
                    }
                    c7213a.m33552a(this.f37334b);
                    continue;
                case 18:
                    this.f37335c = c7213a.m33564f();
                    this.f37333a |= 1;
                    continue;
                case 24:
                    this.f37333a |= 2;
                    int o = c7213a.m33573o();
                    try {
                        this.f37336d = bp.a(c7213a.m33567i());
                        this.f37333a |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 34:
                    this.f37337e = c7213a.m33565g();
                    this.f37333a |= 4;
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

    public final /* synthetic */ i m35297a(C7213a c7213a) {
        return m35296b(c7213a);
    }
}
