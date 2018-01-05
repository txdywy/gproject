package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7416f extends b {
    public int f37565a;
    public bl f37566b;
    public bl f37567c;
    public String f37568d;
    public String f37569e;

    public C7416f() {
        this.f37565a = 0;
        this.f37566b = null;
        this.f37567c = null;
        this.f37568d = "";
        this.f37569e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35459a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37566b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37566b);
        }
        if (this.f37567c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37567c);
        }
        if ((this.f37565a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37568d);
        }
        if ((this.f37565a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37569e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35460b() {
        int b = super.b();
        if (this.f37566b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37566b);
        }
        if (this.f37567c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37567c);
        }
        if ((this.f37565a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37568d);
        }
        if ((this.f37565a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f37569e);
        }
        return b;
    }

    public final /* synthetic */ i m35458a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37566b == null) {
                        this.f37566b = new bl();
                    }
                    c7213a.m33552a(this.f37566b);
                    continue;
                case 18:
                    if (this.f37567c == null) {
                        this.f37567c = new bl();
                    }
                    c7213a.m33552a(this.f37567c);
                    continue;
                case 26:
                    this.f37568d = c7213a.m33564f();
                    this.f37565a |= 1;
                    continue;
                case 34:
                    this.f37569e = c7213a.m33564f();
                    this.f37565a |= 2;
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
