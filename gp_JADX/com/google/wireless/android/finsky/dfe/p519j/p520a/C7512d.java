package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7512d extends b {
    public int f38213a;
    public C7516h f38214b;

    public final C7516h m35913d() {
        if (this.f38213a == 0) {
            return this.f38214b;
        }
        return null;
    }

    public final boolean m35914e() {
        return this.f38213a == 0;
    }

    public C7512d() {
        this.f38213a = -1;
        this.f38213a = -1;
        this.f38214b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35911a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38213a == 0) {
            codedOutputByteBufferNano.m33532b(1, this.f38214b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35912b() {
        int b = super.b();
        if (this.f38213a == 0) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38214b);
        }
        return b;
    }

    public final /* synthetic */ i m35910a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38214b == null) {
                        this.f38214b = new C7516h();
                    }
                    c7213a.m33552a(this.f38214b);
                    this.f38213a = 0;
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
