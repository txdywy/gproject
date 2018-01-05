package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bn extends b {
    public static volatile bn[] f39994a;
    public String f39995b;

    public static bn[] m37199d() {
        if (f39994a == null) {
            synchronized (C7219h.f35465b) {
                if (f39994a == null) {
                    f39994a = new bn[0];
                }
            }
        }
        return f39994a;
    }

    public bn() {
        this.f39995b = null;
        this.aP = -1;
    }

    public final void m37201a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39995b != null) {
            codedOutputByteBufferNano.m33521a(1, this.f39995b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37202b() {
        int b = super.b();
        if (this.f39995b != null) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f39995b);
        }
        return b;
    }

    public final /* synthetic */ i m37200a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39995b = c7213a.m33564f();
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
