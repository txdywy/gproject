package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ay extends b {
    public int f37151a;
    public String f37152b;
    public au f37153c;

    public ay() {
        this.f37151a = 0;
        this.f37152b = "";
        this.f37153c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35150a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37151a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37152b);
        }
        if (this.f37153c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37153c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35151b() {
        int b = super.b();
        if ((this.f37151a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37152b);
        }
        if (this.f37153c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37153c);
        }
        return b;
    }

    public final /* synthetic */ i m35149a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37152b = c7213a.m33564f();
                    this.f37151a |= 1;
                    continue;
                case 18:
                    if (this.f37153c == null) {
                        this.f37153c = new au();
                    }
                    c7213a.m33552a(this.f37153c);
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
