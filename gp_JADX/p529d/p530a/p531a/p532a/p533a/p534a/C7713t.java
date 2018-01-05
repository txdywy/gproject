package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7713t extends b {
    public Boolean f40155a;

    public C7713t() {
        this.f40155a = null;
        this.aP = -1;
    }

    public final void m37300a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40155a != null) {
            codedOutputByteBufferNano.m33522a(1, this.f40155a.booleanValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37301b() {
        int b = super.b();
        if (this.f40155a == null) {
            return b;
        }
        this.f40155a.booleanValue();
        return b + (CodedOutputByteBufferNano.m33501d(1) + 1);
    }

    public final /* synthetic */ i m37299a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40155a = Boolean.valueOf(c7213a.m33563e());
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
