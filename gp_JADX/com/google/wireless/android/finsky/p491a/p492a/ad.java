package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public static volatile ad[] f36333a;
    public int f36334b;
    public int f36335c;
    public String f36336d;

    public static ad[] m34609d() {
        if (f36333a == null) {
            synchronized (C7219h.f35465b) {
                if (f36333a == null) {
                    f36333a = new ad[0];
                }
            }
        }
        return f36333a;
    }

    public ad() {
        this.f36334b = 0;
        this.f36335c = 0;
        this.f36336d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34611a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36335c);
        if ((this.f36334b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36336d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34612b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f36335c);
        if ((this.f36334b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36336d);
        }
        return b;
    }

    private final ad m34608b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int o = c7213a.m33573o();
                    try {
                        this.f36335c = C7319a.m34596a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 18:
                    this.f36336d = c7213a.m33564f();
                    this.f36334b |= 1;
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

    public final /* synthetic */ i m34610a(C7213a c7213a) {
        return m34608b(c7213a);
    }
}
