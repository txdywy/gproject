package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bh extends b {
    public static volatile bh[] f39971a;
    public Integer f39972b;
    public Integer f39973c;
    public Long f39974d;

    public static bh[] m37174d() {
        if (f39971a == null) {
            synchronized (C7219h.f35465b) {
                if (f39971a == null) {
                    f39971a = new bh[0];
                }
            }
        }
        return f39971a;
    }

    public bh() {
        this.f39972b = null;
        this.f39973c = null;
        this.f39974d = null;
        this.aP = -1;
    }

    public final void m37176a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39972b != null) {
            codedOutputByteBufferNano.m33518a(1, this.f39972b.intValue());
        }
        if (this.f39973c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39973c.intValue());
        }
        if (this.f39974d != null) {
            codedOutputByteBufferNano.m33531b(3, this.f39974d.longValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37177b() {
        int b = super.b();
        if (this.f39972b != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39972b.intValue());
        }
        if (this.f39973c != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39973c.intValue());
        }
        if (this.f39974d != null) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f39974d.longValue());
        }
        return b;
    }

    public final /* synthetic */ i m37175a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39972b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f39973c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f39974d = Long.valueOf(c7213a.m33568j());
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
