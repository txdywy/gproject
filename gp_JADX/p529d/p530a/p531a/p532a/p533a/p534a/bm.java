package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bm extends b {
    public static volatile bm[] f39992a;
    public bl[] f39993b;

    public static bm[] m37195d() {
        if (f39992a == null) {
            synchronized (C7219h.f35465b) {
                if (f39992a == null) {
                    f39992a = new bm[0];
                }
            }
        }
        return f39992a;
    }

    public bm() {
        this.f39993b = bl.m37191d();
        this.aP = -1;
    }

    public final void m37197a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39993b != null && this.f39993b.length > 0) {
            for (i iVar : this.f39993b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37198b() {
        int b = super.b();
        if (this.f39993b != null && this.f39993b.length > 0) {
            for (i iVar : this.f39993b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m37196a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39993b == null ? 0 : this.f39993b.length;
                    Object obj = new bl[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39993b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bl();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bl();
                    c7213a.m33552a(obj[a]);
                    this.f39993b = obj;
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
