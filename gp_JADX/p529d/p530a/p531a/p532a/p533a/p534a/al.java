package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class al extends b {
    public C7718y f39850a;
    public C7719z f39851b;
    public av f39852c;
    public C7704k f39853d;
    public au f39854e;
    public bx f39855f;
    public C7708o f39856g;

    public al() {
        this.f39850a = null;
        this.f39851b = null;
        this.f39852c = null;
        this.f39853d = null;
        this.f39854e = null;
        this.f39855f = null;
        this.f39856g = null;
        this.aP = -1;
    }

    public final void m37094a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39850a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39850a);
        }
        if (this.f39851b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39851b);
        }
        if (this.f39852c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39852c);
        }
        if (this.f39853d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39853d);
        }
        if (this.f39854e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f39854e);
        }
        if (this.f39855f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f39855f);
        }
        if (this.f39856g != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39856g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37095b() {
        int b = super.b();
        if (this.f39850a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39850a);
        }
        if (this.f39851b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39851b);
        }
        if (this.f39852c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39852c);
        }
        if (this.f39853d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39853d);
        }
        if (this.f39854e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f39854e);
        }
        if (this.f39855f != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f39855f);
        }
        if (this.f39856g != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f39856g);
        }
        return b;
    }

    public final /* synthetic */ i m37093a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39850a == null) {
                        this.f39850a = new C7718y();
                    }
                    c7213a.m33552a(this.f39850a);
                    continue;
                case 18:
                    if (this.f39851b == null) {
                        this.f39851b = new C7719z();
                    }
                    c7213a.m33552a(this.f39851b);
                    continue;
                case 26:
                    if (this.f39852c == null) {
                        this.f39852c = new av();
                    }
                    c7213a.m33552a(this.f39852c);
                    continue;
                case 34:
                    if (this.f39853d == null) {
                        this.f39853d = new C7704k();
                    }
                    c7213a.m33552a(this.f39853d);
                    continue;
                case 42:
                    if (this.f39854e == null) {
                        this.f39854e = new au();
                    }
                    c7213a.m33552a(this.f39854e);
                    continue;
                case 50:
                    if (this.f39855f == null) {
                        this.f39855f = new bx();
                    }
                    c7213a.m33552a(this.f39855f);
                    continue;
                case 58:
                    if (this.f39856g == null) {
                        this.f39856g = new C7708o();
                    }
                    c7213a.m33552a(this.f39856g);
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
