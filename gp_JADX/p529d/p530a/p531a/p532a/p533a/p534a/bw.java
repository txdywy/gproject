package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bw extends b {
    public static volatile bw[] f40088a;
    public aa f40089b;
    public Integer f40090c;
    public Long f40091d;

    public static bw[] m37232d() {
        if (f40088a == null) {
            synchronized (C7219h.f35465b) {
                if (f40088a == null) {
                    f40088a = new bw[0];
                }
            }
        }
        return f40088a;
    }

    public bw() {
        this.f40089b = null;
        this.f40090c = null;
        this.f40091d = null;
        this.aP = -1;
    }

    public final void m37234a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40089b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f40089b);
        }
        if (this.f40090c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f40090c.intValue());
        }
        if (this.f40091d != null) {
            codedOutputByteBufferNano.m33531b(3, this.f40091d.longValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37235b() {
        int b = super.b();
        if (this.f40089b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f40089b);
        }
        if (this.f40090c != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f40090c.intValue());
        }
        if (this.f40091d != null) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f40091d.longValue());
        }
        return b;
    }

    public final /* synthetic */ i m37233a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f40089b == null) {
                        this.f40089b = new aa();
                    }
                    c7213a.m33552a(this.f40089b);
                    continue;
                case 16:
                    this.f40090c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f40091d = Long.valueOf(c7213a.m33568j());
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
