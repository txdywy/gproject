package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bo extends b {
    public static volatile bo[] f39996a;
    public aa f39997b;
    public Integer f39998c;
    public Long f39999d;

    public static bo[] m37203d() {
        if (f39996a == null) {
            synchronized (C7219h.f35465b) {
                if (f39996a == null) {
                    f39996a = new bo[0];
                }
            }
        }
        return f39996a;
    }

    public bo() {
        this.f39997b = null;
        this.f39998c = null;
        this.f39999d = null;
        this.aP = -1;
    }

    public final void m37205a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39997b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39997b);
        }
        if (this.f39998c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f39998c.intValue());
        }
        if (this.f39999d != null) {
            codedOutputByteBufferNano.m33531b(3, this.f39999d.longValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37206b() {
        int b = super.b();
        if (this.f39997b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39997b);
        }
        if (this.f39998c != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39998c.intValue());
        }
        if (this.f39999d != null) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f39999d.longValue());
        }
        return b;
    }

    public final /* synthetic */ i m37204a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39997b == null) {
                        this.f39997b = new aa();
                    }
                    c7213a.m33552a(this.f39997b);
                    continue;
                case 16:
                    this.f39998c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f39999d = Long.valueOf(c7213a.m33568j());
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
