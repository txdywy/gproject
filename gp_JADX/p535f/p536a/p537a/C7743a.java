package p535f.p536a.p537a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7743a extends b {
    public C7744b f40232a;
    public C7745c f40233b;

    public C7743a() {
        this.f40232a = null;
        this.f40233b = null;
        this.aP = -1;
    }

    public final void m37504a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40232a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f40232a);
        }
        if (this.f40233b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f40233b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37505b() {
        int b = super.b();
        if (this.f40232a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f40232a);
        }
        if (this.f40233b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f40233b);
        }
        return b;
    }

    public final /* synthetic */ i m37503a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f40232a == null) {
                        this.f40232a = new C7744b();
                    }
                    c7213a.m33552a(this.f40232a);
                    continue;
                case 18:
                    if (this.f40233b == null) {
                        this.f40233b = new C7745c();
                    }
                    c7213a.m33552a(this.f40233b);
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
