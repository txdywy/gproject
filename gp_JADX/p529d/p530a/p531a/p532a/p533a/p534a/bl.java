package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bl extends b {
    public static volatile bl[] f39990a;
    public String f39991b;

    public static bl[] m37191d() {
        if (f39990a == null) {
            synchronized (C7219h.f35465b) {
                if (f39990a == null) {
                    f39990a = new bl[0];
                }
            }
        }
        return f39990a;
    }

    public bl() {
        this.f39991b = null;
        this.aP = -1;
    }

    public final void m37193a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39991b != null) {
            codedOutputByteBufferNano.m33521a(1, this.f39991b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37194b() {
        int b = super.b();
        if (this.f39991b != null) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f39991b);
        }
        return b;
    }

    public final /* synthetic */ i m37192a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39991b = c7213a.m33564f();
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
