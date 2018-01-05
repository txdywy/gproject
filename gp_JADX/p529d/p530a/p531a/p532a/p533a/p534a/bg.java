package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bg extends b {
    public static volatile bg[] f39967a;
    public Integer f39968b;
    public Integer f39969c;
    public aa f39970d;

    public static bg[] m37170d() {
        if (f39967a == null) {
            synchronized (C7219h.f35465b) {
                if (f39967a == null) {
                    f39967a = new bg[0];
                }
            }
        }
        return f39967a;
    }

    public bg() {
        this.f39968b = null;
        this.f39969c = null;
        this.f39970d = null;
        this.aP = -1;
    }

    public final void m37172a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39968b != null) {
            codedOutputByteBufferNano.m33518a(1, this.f39968b.intValue());
        }
        if (this.f39969c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39969c.intValue());
        }
        if (this.f39970d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39970d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37173b() {
        int b = super.b();
        if (this.f39968b != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39968b.intValue());
        }
        if (this.f39969c != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39969c.intValue());
        }
        if (this.f39970d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f39970d);
        }
        return b;
    }

    public final /* synthetic */ i m37171a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39968b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f39969c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 26:
                    if (this.f39970d == null) {
                        this.f39970d = new aa();
                    }
                    c7213a.m33552a(this.f39970d);
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
