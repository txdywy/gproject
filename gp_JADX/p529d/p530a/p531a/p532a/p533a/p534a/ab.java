package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ab extends b {
    public static volatile ab[] f39821a;
    public Integer f39822b;
    public Integer f39823c;
    public Integer f39824d;

    public static ab[] m37060d() {
        if (f39821a == null) {
            synchronized (C7219h.f35465b) {
                if (f39821a == null) {
                    f39821a = new ab[0];
                }
            }
        }
        return f39821a;
    }

    public ab() {
        this.f39822b = null;
        this.f39823c = null;
        this.f39824d = null;
        this.aP = -1;
    }

    public final void m37062a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39822b != null) {
            codedOutputByteBufferNano.m33518a(1, this.f39822b.intValue());
        }
        if (this.f39823c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39823c.intValue());
        }
        if (this.f39824d != null) {
            codedOutputByteBufferNano.m33518a(3, this.f39824d.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37063b() {
        int b = super.b();
        if (this.f39822b != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39822b.intValue());
        }
        if (this.f39823c != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39823c.intValue());
        }
        if (this.f39824d != null) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f39824d.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37061a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39822b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f39823c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f39824d = Integer.valueOf(c7213a.m33567i());
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
