package com.google.wireless.android.p360b.p361a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7295a extends b {
    public C7297d f36183a;

    public C7295a() {
        this.f36183a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34505a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36183a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36183a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34506b() {
        int b = super.b();
        if (this.f36183a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f36183a);
        }
        return b;
    }

    public final /* synthetic */ i m34504a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36183a == null) {
                        this.f36183a = new C7297d();
                    }
                    c7213a.m33552a(this.f36183a);
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
