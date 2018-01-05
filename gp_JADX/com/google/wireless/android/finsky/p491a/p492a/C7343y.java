package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7343y extends b {
    public static volatile C7343y[] f36638a;
    public int f36639b;
    public String f36640c;
    public String f36641d;

    public static C7343y[] m34788d() {
        if (f36638a == null) {
            synchronized (C7219h.f35465b) {
                if (f36638a == null) {
                    f36638a = new C7343y[0];
                }
            }
        }
        return f36638a;
    }

    public C7343y() {
        this.f36639b = 0;
        this.f36640c = "";
        this.f36641d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34790a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36639b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36640c);
        }
        if ((this.f36639b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36641d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34791b() {
        int b = super.b();
        if ((this.f36639b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36640c);
        }
        if ((this.f36639b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36641d);
        }
        return b;
    }

    public final /* synthetic */ i m34789a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36640c = c7213a.m33564f();
                    this.f36639b |= 1;
                    continue;
                case 18:
                    this.f36641d = c7213a.m33564f();
                    this.f36639b |= 2;
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
