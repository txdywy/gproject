package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bh extends b {
    public static volatile bh[] f35795a;
    public int f35796b;
    public long f35797c;
    public boolean f35798d;
    public int f35799e;

    public static bh[] m34183d() {
        if (f35795a == null) {
            synchronized (C7219h.f35465b) {
                if (f35795a == null) {
                    f35795a = new bh[0];
                }
            }
        }
        return f35795a;
    }

    public bh() {
        this.f35796b = 0;
        this.f35797c = 0;
        this.f35798d = false;
        this.f35799e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34185a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35796b & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35797c);
        }
        if ((this.f35796b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f35798d);
        }
        if ((this.f35796b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35799e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34186b() {
        int b = super.b();
        if ((this.f35796b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35797c);
        }
        if ((this.f35796b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f35796b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f35799e);
        }
        return b;
    }

    private final bh m34182b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35797c = c7213a.m33568j();
                    this.f35796b |= 1;
                    continue;
                case 16:
                    this.f35798d = c7213a.m33563e();
                    this.f35796b |= 2;
                    continue;
                case 24:
                    this.f35796b |= 4;
                    int o = c7213a.m33573o();
                    try {
                        this.f35799e = bg.m34178a(c7213a.m33567i());
                        this.f35796b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m34184a(C7213a c7213a) {
        return m34182b(c7213a);
    }
}
