package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7700g extends b {
    public Integer f40109a;
    public Integer f40110b;

    public C7700g() {
        this.f40109a = null;
        this.f40110b = null;
        this.aP = -1;
    }

    public final void m37254a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40109a != null) {
            codedOutputByteBufferNano.m33518a(2, this.f40109a.intValue());
        }
        if (this.f40110b != null) {
            codedOutputByteBufferNano.m33518a(3, this.f40110b.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37255b() {
        int b = super.b();
        if (this.f40109a != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f40109a.intValue());
        }
        if (this.f40110b != null) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f40110b.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37253a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f40109a = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f40110b = Integer.valueOf(c7213a.m33567i());
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
