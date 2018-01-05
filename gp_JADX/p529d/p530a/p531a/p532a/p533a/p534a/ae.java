package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public Integer f39832a;
    public Integer f39833b;
    public Integer f39834c;

    public ae() {
        this.f39832a = null;
        this.f39833b = null;
        this.f39834c = null;
        this.aP = -1;
    }

    public final void m37073a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39832a != null) {
            codedOutputByteBufferNano.m33518a(1, this.f39832a.intValue());
        }
        if (this.f39833b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39833b.intValue());
        }
        if (this.f39834c != null) {
            codedOutputByteBufferNano.m33518a(3, this.f39834c.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37074b() {
        int b = super.b();
        if (this.f39832a != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39832a.intValue());
        }
        if (this.f39833b != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39833b.intValue());
        }
        if (this.f39834c != null) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f39834c.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37072a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39832a = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f39833b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f39834c = Integer.valueOf(c7213a.m33567i());
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
