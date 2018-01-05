package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7694a extends b {
    public String f39818a;

    public C7694a() {
        this.f39818a = null;
        this.aP = -1;
    }

    public final void m37055a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39818a != null) {
            codedOutputByteBufferNano.m33521a(1, this.f39818a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37056b() {
        int b = super.b();
        if (this.f39818a != null) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f39818a);
        }
        return b;
    }

    public final /* synthetic */ i m37054a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39818a = c7213a.m33564f();
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
