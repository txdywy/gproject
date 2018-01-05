package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ar extends b {
    public static volatile ar[] f39895a;
    public bg[] f39896b;
    public C7709p[] f39897c;
    public aa f39898d;

    public static ar[] m37116d() {
        if (f39895a == null) {
            synchronized (C7219h.f35465b) {
                if (f39895a == null) {
                    f39895a = new ar[0];
                }
            }
        }
        return f39895a;
    }

    public ar() {
        this.f39896b = bg.m37170d();
        this.f39897c = C7709p.m37285d();
        this.f39898d = null;
        this.aP = -1;
    }

    public final void m37118a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f39896b != null && this.f39896b.length > 0) {
            for (i iVar : this.f39896b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f39897c != null && this.f39897c.length > 0) {
            while (i < this.f39897c.length) {
                i iVar2 = this.f39897c[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
                i++;
            }
        }
        if (this.f39898d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39898d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37119b() {
        int i = 0;
        int b = super.b();
        if (this.f39896b != null && this.f39896b.length > 0) {
            int i2 = b;
            for (i iVar : this.f39896b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if (this.f39897c != null && this.f39897c.length > 0) {
            while (i < this.f39897c.length) {
                i iVar2 = this.f39897c[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
                i++;
            }
        }
        if (this.f39898d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f39898d);
        }
        return b;
    }

    public final /* synthetic */ i m37117a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39896b == null ? 0 : this.f39896b.length;
                    obj = new bg[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39896b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bg();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bg();
                    c7213a.m33552a(obj[a]);
                    this.f39896b = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f39897c == null ? 0 : this.f39897c.length;
                    obj = new C7709p[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39897c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7709p();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7709p();
                    c7213a.m33552a(obj[a]);
                    this.f39897c = obj;
                    continue;
                case 26:
                    if (this.f39898d == null) {
                        this.f39898d = new aa();
                    }
                    c7213a.m33552a(this.f39898d);
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
