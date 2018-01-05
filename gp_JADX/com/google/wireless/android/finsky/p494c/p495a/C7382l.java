package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7382l extends b {
    public int f36886a;
    public String f36887b;
    public long f36888c;
    public String f36889d;
    public C7381k f36890e;

    public C7382l() {
        this.f36886a = 0;
        this.f36887b = "";
        this.f36888c = 0;
        this.f36889d = "";
        this.f36890e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34962a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36886a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36887b);
        }
        if ((this.f36886a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36888c);
        }
        if ((this.f36886a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36889d);
        }
        if (this.f36890e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36890e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34963b() {
        int b = super.b();
        if ((this.f36886a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36887b);
        }
        if ((this.f36886a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36888c);
        }
        if ((this.f36886a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36889d);
        }
        if (this.f36890e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f36890e);
        }
        return b;
    }

    public final /* synthetic */ i m34961a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36887b = c7213a.m33564f();
                    this.f36886a |= 1;
                    continue;
                case 16:
                    this.f36888c = c7213a.m33568j();
                    this.f36886a |= 2;
                    continue;
                case 26:
                    this.f36889d = c7213a.m33564f();
                    this.f36886a |= 4;
                    continue;
                case 34:
                    if (this.f36890e == null) {
                        this.f36890e = new C7381k();
                    }
                    c7213a.m33552a(this.f36890e);
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
