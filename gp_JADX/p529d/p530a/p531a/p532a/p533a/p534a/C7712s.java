package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7712s extends b {
    public Long f40153a;
    public Long f40154b;

    public C7712s() {
        this.f40153a = null;
        this.f40154b = null;
        this.aP = -1;
    }

    public final void m37297a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40153a != null) {
            codedOutputByteBufferNano.m33531b(1, this.f40153a.longValue());
        }
        if (this.f40154b != null) {
            codedOutputByteBufferNano.m33531b(2, this.f40154b.longValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37298b() {
        int b = super.b();
        if (this.f40153a != null) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f40153a.longValue());
        }
        if (this.f40154b != null) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f40154b.longValue());
        }
        return b;
    }

    public final /* synthetic */ i m37296a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40153a = Long.valueOf(c7213a.m33568j());
                    continue;
                case 16:
                    this.f40154b = Long.valueOf(c7213a.m33568j());
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
