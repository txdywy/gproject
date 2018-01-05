package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7703j extends b {
    public C7702i f40124a;

    public C7703j() {
        this.f40124a = null;
        this.aP = -1;
    }

    public final void m37265a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40124a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f40124a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37266b() {
        int b = super.b();
        if (this.f40124a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f40124a);
        }
        return b;
    }

    public final /* synthetic */ i m37264a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f40124a == null) {
                        this.f40124a = new C7702i();
                    }
                    c7213a.m33552a(this.f40124a);
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
