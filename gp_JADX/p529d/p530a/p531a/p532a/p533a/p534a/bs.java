package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bs extends b {
    public static volatile bs[] f40027a;
    public br f40028b;
    public Integer f40029c;
    public Long f40030d;

    public static bs[] m37218d() {
        if (f40027a == null) {
            synchronized (C7219h.f35465b) {
                if (f40027a == null) {
                    f40027a = new bs[0];
                }
            }
        }
        return f40027a;
    }

    public bs() {
        this.f40028b = null;
        this.f40029c = null;
        this.f40030d = null;
        this.aP = -1;
    }

    public final void m37220a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40028b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f40028b);
        }
        if (this.f40029c != null) {
            codedOutputByteBufferNano.m33518a(2, this.f40029c.intValue());
        }
        if (this.f40030d != null) {
            codedOutputByteBufferNano.m33531b(3, this.f40030d.longValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37221b() {
        int b = super.b();
        if (this.f40028b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f40028b);
        }
        if (this.f40029c != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f40029c.intValue());
        }
        if (this.f40030d != null) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f40030d.longValue());
        }
        return b;
    }

    public final /* synthetic */ i m37219a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f40028b == null) {
                        this.f40028b = new br();
                    }
                    c7213a.m33552a(this.f40028b);
                    continue;
                case 16:
                    this.f40029c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f40030d = Long.valueOf(c7213a.m33568j());
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
