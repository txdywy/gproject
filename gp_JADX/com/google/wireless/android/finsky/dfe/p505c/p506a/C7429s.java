package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7429s extends b {
    public bl f37670a;
    public bl f37671b;

    public C7429s() {
        this.f37670a = null;
        this.f37671b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35503a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37670a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37670a);
        }
        if (this.f37671b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37671b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35504b() {
        int b = super.b();
        if (this.f37670a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37670a);
        }
        if (this.f37671b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37671b);
        }
        return b;
    }

    public final /* synthetic */ i m35502a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37670a == null) {
                        this.f37670a = new bl();
                    }
                    c7213a.m33552a(this.f37670a);
                    continue;
                case 18:
                    if (this.f37671b == null) {
                        this.f37671b = new bl();
                    }
                    c7213a.m33552a(this.f37671b);
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
