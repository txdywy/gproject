package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aj extends b {
    public C7695b f39843a;
    public ae f39844b;

    public aj() {
        this.f39843a = null;
        this.f39844b = null;
        this.aP = -1;
    }

    public final void m37087a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39843a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39843a);
        }
        if (this.f39844b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39844b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37088b() {
        int b = super.b();
        if (this.f39843a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39843a);
        }
        if (this.f39844b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f39844b);
        }
        return b;
    }

    public final /* synthetic */ i m37086a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39843a == null) {
                        this.f39843a = new C7695b();
                    }
                    c7213a.m33552a(this.f39843a);
                    continue;
                case 18:
                    if (this.f39844b == null) {
                        this.f39844b = new ae();
                    }
                    c7213a.m33552a(this.f39844b);
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
