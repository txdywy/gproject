package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.eu;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cd extends b {
    public int f38544a;
    public eu f38545b;
    public String f38546c;
    public String f38547d;

    public final boolean m36147d() {
        return (this.f38544a & 1) != 0;
    }

    public final boolean m36148e() {
        return (this.f38544a & 2) != 0;
    }

    public cd() {
        this.f38544a = 0;
        this.f38545b = null;
        this.f38546c = "";
        this.f38547d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36145a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38545b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38545b);
        }
        if ((this.f38544a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38546c);
        }
        if ((this.f38544a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38547d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36146b() {
        int b = super.b();
        if (this.f38545b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38545b);
        }
        if ((this.f38544a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38546c);
        }
        if ((this.f38544a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38547d);
        }
        return b;
    }

    public final /* synthetic */ i m36144a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38545b == null) {
                        this.f38545b = new eu();
                    }
                    c7213a.m33552a(this.f38545b);
                    continue;
                case 18:
                    this.f38546c = c7213a.m33564f();
                    this.f38544a |= 1;
                    continue;
                case 26:
                    this.f38547d = c7213a.m33564f();
                    this.f38544a |= 2;
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
