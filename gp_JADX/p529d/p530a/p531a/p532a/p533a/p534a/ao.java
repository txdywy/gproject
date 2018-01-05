package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ao extends b {
    public an[] f39880a;
    public C7696c f39881b;

    public ao() {
        this.f39880a = an.m37101d();
        this.f39881b = null;
        this.aP = -1;
    }

    public final void m37106a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39880a != null && this.f39880a.length > 0) {
            for (i iVar : this.f39880a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f39881b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39881b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37107b() {
        int b = super.b();
        if (this.f39880a != null && this.f39880a.length > 0) {
            for (i iVar : this.f39880a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if (this.f39881b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f39881b);
        }
        return b;
    }

    public final /* synthetic */ i m37105a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39880a == null ? 0 : this.f39880a.length;
                    Object obj = new an[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39880a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new an();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new an();
                    c7213a.m33552a(obj[a]);
                    this.f39880a = obj;
                    continue;
                case 18:
                    if (this.f39881b == null) {
                        this.f39881b = new C7696c();
                    }
                    c7213a.m33552a(this.f39881b);
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
