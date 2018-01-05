package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7714u extends b {
    public Long f40156a;
    public C7716w[] f40157b;
    public C7715v f40158c;

    public C7714u() {
        this.f40156a = null;
        this.f40157b = C7716w.m37310d();
        this.f40158c = null;
        this.aP = -1;
    }

    public final void m37303a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40156a != null) {
            codedOutputByteBufferNano.m33535c(1, this.f40156a.longValue());
        }
        if (this.f40157b != null && this.f40157b.length > 0) {
            for (i iVar : this.f40157b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (this.f40158c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f40158c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37304b() {
        int b = super.b();
        if (this.f40156a != null) {
            this.f40156a.longValue();
            b += CodedOutputByteBufferNano.m33501d(1) + 8;
        }
        if (this.f40157b != null && this.f40157b.length > 0) {
            int i = b;
            for (i iVar : this.f40157b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (this.f40158c != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f40158c);
        }
        return b;
    }

    public final /* synthetic */ i m37302a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f40156a = Long.valueOf(c7213a.m33570l());
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f40157b == null ? 0 : this.f40157b.length;
                    Object obj = new C7716w[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40157b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7716w();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7716w();
                    c7213a.m33552a(obj[a]);
                    this.f40157b = obj;
                    continue;
                case 26:
                    if (this.f40158c == null) {
                        this.f40158c = new C7715v();
                    }
                    c7213a.m33552a(this.f40158c);
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
