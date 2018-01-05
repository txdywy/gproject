package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7214c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7414do extends b {
    public static final C7214c f37480a = C7214c.m33574a(C7414do.class, 1391927914);
    public dn f37481b;

    public C7414do() {
        this.f37481b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35389a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37481b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37481b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35390b() {
        int b = super.b();
        if (this.f37481b != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f37481b);
        }
        return b;
    }

    public final /* synthetic */ i m35388a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37481b == null) {
                        this.f37481b = new dn();
                    }
                    c7213a.m33552a(this.f37481b);
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
