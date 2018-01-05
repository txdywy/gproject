package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7717x extends b {
    public Float f40164a;
    public Integer f40165b;
    public Integer f40166c;

    public C7717x() {
        this.f40164a = null;
        this.f40165b = null;
        this.f40166c = null;
        this.aP = -1;
    }

    public final void m37315a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40164a != null) {
            codedOutputByteBufferNano.m33517a(1, this.f40164a.floatValue());
        }
        if (this.f40165b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f40165b.intValue());
        }
        if (this.f40166c != null) {
            codedOutputByteBufferNano.m33518a(3, this.f40166c.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37316b() {
        int b = super.b();
        if (this.f40164a != null) {
            this.f40164a.floatValue();
            b += CodedOutputByteBufferNano.m33501d(1) + 4;
        }
        if (this.f40165b != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f40165b.intValue());
        }
        if (this.f40166c != null) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f40166c.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37314a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f40164a = Float.valueOf(Float.intBitsToFloat(c7213a.m33569k()));
                    continue;
                case 16:
                    this.f40165b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f40166c = Integer.valueOf(c7213a.m33567i());
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
