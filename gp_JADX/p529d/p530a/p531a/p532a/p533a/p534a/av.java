package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class av extends b {
    public Integer f39918a;

    public av() {
        this.f39918a = null;
        this.aP = -1;
    }

    public final void m37131a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39918a != null) {
            codedOutputByteBufferNano.m33518a(1, this.f39918a.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37132b() {
        int b = super.b();
        if (this.f39918a != null) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f39918a.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37130a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39918a = Integer.valueOf(c7213a.m33567i());
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
