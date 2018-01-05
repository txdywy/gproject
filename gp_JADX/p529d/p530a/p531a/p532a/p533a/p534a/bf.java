package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bf extends b {
    public C7696c f39965a;
    public af f39966b;

    public bf() {
        this.f39965a = null;
        this.f39966b = null;
        this.aP = -1;
    }

    public final void m37168a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39965a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39965a);
        }
        if (this.f39966b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39966b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37169b() {
        int b = super.b();
        if (this.f39965a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39965a);
        }
        if (this.f39966b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f39966b);
        }
        return b;
    }

    public final /* synthetic */ i m37167a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39965a == null) {
                        this.f39965a = new C7696c();
                    }
                    c7213a.m33552a(this.f39965a);
                    continue;
                case 18:
                    if (this.f39966b == null) {
                        this.f39966b = new af();
                    }
                    c7213a.m33552a(this.f39966b);
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
