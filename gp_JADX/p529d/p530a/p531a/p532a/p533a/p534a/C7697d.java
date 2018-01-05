package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7697d extends b {
    public Integer f40097a;
    public Integer f40098b;
    public Integer f40099c;
    public ad[] f40100d;

    public C7697d() {
        this.f40097a = null;
        this.f40098b = null;
        this.f40099c = null;
        this.f40100d = ad.m37068d();
        this.aP = -1;
    }

    public final void m37243a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40097a != null) {
            codedOutputByteBufferNano.m33518a(1, this.f40097a.intValue());
        }
        if (this.f40098b != null) {
            codedOutputByteBufferNano.m33518a(2, this.f40098b.intValue());
        }
        if (this.f40099c != null) {
            codedOutputByteBufferNano.m33518a(3, this.f40099c.intValue());
        }
        if (this.f40100d != null && this.f40100d.length > 0) {
            for (i iVar : this.f40100d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37244b() {
        int b = super.b();
        if (this.f40097a != null) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40097a.intValue());
        }
        if (this.f40098b != null) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f40098b.intValue());
        }
        if (this.f40099c != null) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f40099c.intValue());
        }
        if (this.f40100d == null || this.f40100d.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f40100d) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(4, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m37242a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f40097a = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 16:
                    this.f40098b = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 24:
                    this.f40099c = Integer.valueOf(c7213a.m33567i());
                    continue;
                case 34:
                    int a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f40100d == null ? 0 : this.f40100d.length;
                    Object obj = new ad[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40100d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ad();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ad();
                    c7213a.m33552a(obj[a]);
                    this.f40100d = obj;
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
