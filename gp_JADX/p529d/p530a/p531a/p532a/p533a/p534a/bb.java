package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bb extends b {
    public C7711r f39950a;
    public ay f39951b;

    public bb() {
        this.f39950a = null;
        this.f39951b = null;
        this.aP = -1;
    }

    public final void m37153a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39950a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39950a);
        }
        if (this.f39951b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39951b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37154b() {
        int b = super.b();
        if (this.f39950a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39950a);
        }
        if (this.f39951b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f39951b);
        }
        return b;
    }

    public final /* synthetic */ i m37152a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39950a == null) {
                        this.f39950a = new C7711r();
                    }
                    c7213a.m33552a(this.f39950a);
                    continue;
                case 18:
                    if (this.f39951b == null) {
                        this.f39951b = new ay();
                    }
                    c7213a.m33552a(this.f39951b);
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
