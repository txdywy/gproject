package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.eu;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cb extends b {
    public int f38525a;
    public String f38526b;
    public eu f38527c;

    public cb() {
        this.f38525a = 0;
        this.f38526b = "";
        this.f38527c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36138a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38525a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38526b);
        }
        if (this.f38527c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38527c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36139b() {
        int b = super.b();
        if ((this.f38525a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38526b);
        }
        if (this.f38527c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f38527c);
        }
        return b;
    }

    public final /* synthetic */ i m36137a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38526b = c7213a.m33564f();
                    this.f38525a |= 1;
                    continue;
                case 18:
                    if (this.f38527c == null) {
                        this.f38527c = new eu();
                    }
                    c7213a.m33552a(this.f38527c);
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
