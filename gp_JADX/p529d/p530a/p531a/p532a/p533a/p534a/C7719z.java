package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7719z extends b {
    public Integer f40178a;
    public Integer f40179b;

    public C7719z() {
        this.f40178a = null;
        this.f40179b = null;
        this.aP = -1;
    }

    public final void m37322a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40178a != null) {
            codedOutputByteBufferNano.m33518a(1, this.f40178a.intValue());
        }
        if (this.f40179b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f40179b.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37323b() {
        int b = super.b();
        if (this.f40178a != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40178a.intValue());
        }
        if (this.f40179b != null) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f40179b.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37321a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40178a = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f40179b = Integer.valueOf(c7213a.m33567i());
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
