package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7427q extends b {
    public int f37639a;
    public bl f37640b;
    public bl f37641c;
    public cr f37642d;
    public boolean f37643e;

    public C7427q() {
        this.f37639a = 0;
        this.f37640b = null;
        this.f37641c = null;
        this.f37642d = null;
        this.f37643e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35497a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37640b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37640b);
        }
        if (this.f37641c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37641c);
        }
        if (this.f37642d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37642d);
        }
        if ((this.f37639a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f37643e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35498b() {
        int b = super.b();
        if (this.f37640b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37640b);
        }
        if (this.f37641c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37641c);
        }
        if (this.f37642d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37642d);
        }
        if ((this.f37639a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35496a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37640b == null) {
                        this.f37640b = new bl();
                    }
                    c7213a.m33552a(this.f37640b);
                    continue;
                case 18:
                    if (this.f37641c == null) {
                        this.f37641c = new bl();
                    }
                    c7213a.m33552a(this.f37641c);
                    continue;
                case 26:
                    if (this.f37642d == null) {
                        this.f37642d = new cr();
                    }
                    c7213a.m33552a(this.f37642d);
                    continue;
                case 32:
                    this.f37643e = c7213a.m33563e();
                    this.f37639a |= 1;
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
