package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7710q extends b {
    public bm[] f40145a;

    public C7710q() {
        this.f40145a = bm.m37195d();
        this.aP = -1;
    }

    public final void m37290a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40145a != null && this.f40145a.length > 0) {
            for (i iVar : this.f40145a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37291b() {
        int b = super.b();
        if (this.f40145a != null && this.f40145a.length > 0) {
            for (i iVar : this.f40145a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m37289a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f40145a == null ? 0 : this.f40145a.length;
                    Object obj = new bm[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40145a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bm();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bm();
                    c7213a.m33552a(obj[a]);
                    this.f40145a = obj;
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
