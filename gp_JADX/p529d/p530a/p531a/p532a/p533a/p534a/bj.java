package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bj extends b {
    public Integer f39978a;
    public bi[] f39979b;
    public Integer f39980c;
    public Integer f39981d;

    public bj() {
        this.f39978a = null;
        this.f39979b = bi.m37179d();
        this.f39980c = null;
        this.f39981d = null;
        this.aP = -1;
    }

    public final void m37184a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39978a != null) {
            codedOutputByteBufferNano.m33518a(1, this.f39978a.intValue());
        }
        if (this.f39979b != null && this.f39979b.length > 0) {
            for (i iVar : this.f39979b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (this.f39980c != null) {
            codedOutputByteBufferNano.m33518a(3, this.f39980c.intValue());
        }
        if (this.f39981d != null) {
            codedOutputByteBufferNano.m33518a(4, this.f39981d.intValue());
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37185b() {
        int b = super.b();
        if (this.f39978a != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39978a.intValue());
        }
        if (this.f39979b != null && this.f39979b.length > 0) {
            int i = b;
            for (i iVar : this.f39979b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (this.f39980c != null) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f39980c.intValue());
        }
        if (this.f39981d != null) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f39981d.intValue());
        }
        return b;
    }

    public final /* synthetic */ i m37183a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39978a = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f39979b == null ? 0 : this.f39979b.length;
                    Object obj = new bi[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39979b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bi();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bi();
                    c7213a.m33552a(obj[a]);
                    this.f39979b = obj;
                    continue;
                case 24:
                    this.f39980c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 32:
                    this.f39981d = Integer.valueOf(c7213a.m33567i());
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
