package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7331m;

public final class au extends b {
    public int f38389a;
    public C7331m f38390b;
    public boolean f38391c;

    public au() {
        this.f38389a = 0;
        this.f38390b = null;
        this.f38391c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36033a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38390b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38390b);
        }
        if ((this.f38389a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38391c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36034b() {
        int b = super.b();
        if (this.f38390b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38390b);
        }
        if ((this.f38389a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36032a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38390b == null) {
                        this.f38390b = new C7331m();
                    }
                    c7213a.m33552a(this.f38390b);
                    continue;
                case 16:
                    this.f38391c = c7213a.m33563e();
                    this.f38389a |= 1;
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
