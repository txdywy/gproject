package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bt extends b {
    public static volatile bt[] f40031a;
    public Integer f40032b;
    public Long f40033c;
    public aa f40034d;

    public static bt[] m37222d() {
        if (f40031a == null) {
            synchronized (C7219h.f35465b) {
                if (f40031a == null) {
                    f40031a = new bt[0];
                }
            }
        }
        return f40031a;
    }

    public bt() {
        this.f40032b = null;
        this.f40033c = null;
        this.f40034d = null;
        this.aP = -1;
    }

    public final void m37224a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40032b != null) {
            codedOutputByteBufferNano.m33518a(1, this.f40032b.intValue());
        }
        if (this.f40033c != null) {
            codedOutputByteBufferNano.m33531b(2, this.f40033c.longValue());
        }
        if (this.f40034d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f40034d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37225b() {
        int b = super.b();
        if (this.f40032b != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40032b.intValue());
        }
        if (this.f40033c != null) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f40033c.longValue());
        }
        if (this.f40034d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f40034d);
        }
        return b;
    }

    public final /* synthetic */ i m37223a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40032b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f40033c = Long.valueOf(c7213a.m33568j());
                    continue;
                case 26:
                    if (this.f40034d == null) {
                        this.f40034d = new aa();
                    }
                    c7213a.m33552a(this.f40034d);
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
