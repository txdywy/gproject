package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class be extends b {
    public static volatile be[] f39957a;
    public Long f39958b;
    public Long f39959c;
    public Long f39960d;
    public Long f39961e;
    public Long f39962f;
    public Long f39963g;
    public aa f39964h;

    public static be[] m37163d() {
        if (f39957a == null) {
            synchronized (C7219h.f35465b) {
                if (f39957a == null) {
                    f39957a = new be[0];
                }
            }
        }
        return f39957a;
    }

    public be() {
        this.f39958b = null;
        this.f39959c = null;
        this.f39960d = null;
        this.f39961e = null;
        this.f39962f = null;
        this.f39963g = null;
        this.f39964h = null;
        this.aP = -1;
    }

    public final void m37165a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39958b != null) {
            codedOutputByteBufferNano.m33531b(1, this.f39958b.longValue());
        }
        if (this.f39959c != null) {
            codedOutputByteBufferNano.m33531b(2, this.f39959c.longValue());
        }
        if (this.f39960d != null) {
            codedOutputByteBufferNano.m33531b(3, this.f39960d.longValue());
        }
        if (this.f39961e != null) {
            codedOutputByteBufferNano.m33531b(4, this.f39961e.longValue());
        }
        if (this.f39962f != null) {
            codedOutputByteBufferNano.m33531b(5, this.f39962f.longValue());
        }
        if (this.f39963g != null) {
            codedOutputByteBufferNano.m33531b(6, this.f39963g.longValue());
        }
        if (this.f39964h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39964h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37166b() {
        int b = super.b();
        if (this.f39958b != null) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f39958b.longValue());
        }
        if (this.f39959c != null) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f39959c.longValue());
        }
        if (this.f39960d != null) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f39960d.longValue());
        }
        if (this.f39961e != null) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f39961e.longValue());
        }
        if (this.f39962f != null) {
            b += CodedOutputByteBufferNano.m33508f(5, this.f39962f.longValue());
        }
        if (this.f39963g != null) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f39963g.longValue());
        }
        if (this.f39964h != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f39964h);
        }
        return b;
    }

    public final /* synthetic */ i m37164a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39958b = Long.valueOf(c7213a.m33568j());
                    continue;
                case 16:
                    this.f39959c = Long.valueOf(c7213a.m33568j());
                    continue;
                case 24:
                    this.f39960d = Long.valueOf(c7213a.m33568j());
                    continue;
                case 32:
                    this.f39961e = Long.valueOf(c7213a.m33568j());
                    continue;
                case 40:
                    this.f39962f = Long.valueOf(c7213a.m33568j());
                    continue;
                case 48:
                    this.f39963g = Long.valueOf(c7213a.m33568j());
                    continue;
                case 58:
                    if (this.f39964h == null) {
                        this.f39964h = new aa();
                    }
                    c7213a.m33552a(this.f39964h);
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
