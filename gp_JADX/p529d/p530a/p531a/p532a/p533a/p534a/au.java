package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class au extends b {
    public C7700g f39914a;
    public bj f39915b;
    public C7701h f39916c;
    public C7705l f39917d;

    public au() {
        this.f39914a = null;
        this.f39915b = null;
        this.f39916c = null;
        this.f39917d = null;
        this.aP = -1;
    }

    public final void m37128a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39914a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39914a);
        }
        if (this.f39915b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39915b);
        }
        if (this.f39916c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39916c);
        }
        if (this.f39917d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39917d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37129b() {
        int b = super.b();
        if (this.f39914a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39914a);
        }
        if (this.f39915b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39915b);
        }
        if (this.f39916c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39916c);
        }
        if (this.f39917d != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f39917d);
        }
        return b;
    }

    public final /* synthetic */ i m37127a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39914a == null) {
                        this.f39914a = new C7700g();
                    }
                    c7213a.m33552a(this.f39914a);
                    continue;
                case 18:
                    if (this.f39915b == null) {
                        this.f39915b = new bj();
                    }
                    c7213a.m33552a(this.f39915b);
                    continue;
                case 26:
                    if (this.f39916c == null) {
                        this.f39916c = new C7701h();
                    }
                    c7213a.m33552a(this.f39916c);
                    continue;
                case 34:
                    if (this.f39917d == null) {
                        this.f39917d = new C7705l();
                    }
                    c7213a.m33552a(this.f39917d);
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
