package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ai extends b {
    public ap[] f39842a;

    public ai() {
        this.f39842a = ap.m37108d();
        this.aP = -1;
    }

    public final void m37084a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39842a != null && this.f39842a.length > 0) {
            for (i iVar : this.f39842a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37085b() {
        int b = super.b();
        if (this.f39842a != null && this.f39842a.length > 0) {
            for (i iVar : this.f39842a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m37083a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39842a == null ? 0 : this.f39842a.length;
                    Object obj = new ap[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39842a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ap();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ap();
                    c7213a.m33552a(obj[a]);
                    this.f39842a = obj;
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
