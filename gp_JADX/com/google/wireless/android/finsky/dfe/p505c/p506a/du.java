package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class du extends b {
    public static volatile du[] f37497a;
    public int f37498b;
    public ae f37499c;
    public String f37500d;
    public boolean f37501e;

    public static du[] m35405d() {
        if (f37497a == null) {
            synchronized (C7219h.f35465b) {
                if (f37497a == null) {
                    f37497a = new du[0];
                }
            }
        }
        return f37497a;
    }

    public du() {
        this.f37498b = 0;
        this.f37499c = null;
        this.f37500d = "";
        this.f37501e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35407a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37499c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37499c);
        }
        if ((this.f37498b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37500d);
        }
        if ((this.f37498b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f37501e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35408b() {
        int b = super.b();
        if (this.f37499c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37499c);
        }
        if ((this.f37498b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37500d);
        }
        if ((this.f37498b & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35406a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37499c == null) {
                        this.f37499c = new ae();
                    }
                    c7213a.m33552a(this.f37499c);
                    continue;
                case 18:
                    this.f37500d = c7213a.m33564f();
                    this.f37498b |= 1;
                    continue;
                case 24:
                    this.f37501e = c7213a.m33563e();
                    this.f37498b |= 2;
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
