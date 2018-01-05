package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bu extends b {
    public Long f40035a;

    public bu() {
        this.f40035a = null;
        this.aP = -1;
    }

    public final void m37227a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40035a != null) {
            codedOutputByteBufferNano.m33531b(1, this.f40035a.longValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37228b() {
        int b = super.b();
        if (this.f40035a != null) {
            return b + CodedOutputByteBufferNano.m33508f(1, this.f40035a.longValue());
        }
        return b;
    }

    public final /* synthetic */ i m37226a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40035a = Long.valueOf(c7213a.m33568j());
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
