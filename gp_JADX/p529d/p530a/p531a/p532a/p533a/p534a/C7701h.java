package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7701h extends b {
    public Boolean f40111a;
    public Boolean f40112b;

    public C7701h() {
        this.f40111a = null;
        this.f40112b = null;
        this.aP = -1;
    }

    public final void m37257a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40111a != null) {
            codedOutputByteBufferNano.m33522a(1, this.f40111a.booleanValue());
        }
        if (this.f40112b != null) {
            codedOutputByteBufferNano.m33522a(2, this.f40112b.booleanValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37258b() {
        int b = super.b();
        if (this.f40111a != null) {
            this.f40111a.booleanValue();
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f40112b == null) {
            return b;
        }
        this.f40112b.booleanValue();
        return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
    }

    public final /* synthetic */ i m37256a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40111a = Boolean.valueOf(c7213a.m33563e());
                    continue;
                case 16:
                    this.f40112b = Boolean.valueOf(c7213a.m33563e());
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
