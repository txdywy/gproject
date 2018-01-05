package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bx extends b {
    public ac f40092a;

    public bx() {
        this.f40092a = null;
        this.aP = -1;
    }

    public final void m37237a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40092a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f40092a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37238b() {
        int b = super.b();
        if (this.f40092a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f40092a);
        }
        return b;
    }

    public final /* synthetic */ i m37236a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f40092a == null) {
                        this.f40092a = new ac();
                    }
                    c7213a.m33552a(this.f40092a);
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
