package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class C7393g extends b {
    public int f36939a;
    public C7367w f36940b;
    public String f36941c;

    public C7393g() {
        this.f36939a = 0;
        this.f36940b = null;
        this.f36941c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35003a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36940b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36940b);
        }
        if ((this.f36939a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36941c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35004b() {
        int b = super.b();
        if (this.f36940b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36940b);
        }
        if ((this.f36939a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36941c);
        }
        return b;
    }

    public final /* synthetic */ i m35002a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36940b == null) {
                        this.f36940b = new C7367w();
                    }
                    c7213a.m33552a(this.f36940b);
                    continue;
                case 18:
                    this.f36941c = c7213a.m33564f();
                    this.f36939a |= 1;
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
