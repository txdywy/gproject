package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7399m extends b {
    public int f36955a;
    public C7400n[] f36956b;
    public byte[] f36957c;
    public int f36958d;

    public C7399m() {
        this.f36955a = 0;
        this.f36956b = C7400n.m35022d();
        this.f36957c = C7222l.f35479l;
        this.f36958d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35019a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36956b != null && this.f36956b.length > 0) {
            for (i iVar : this.f36956b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f36955a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(9, this.f36957c);
        }
        if ((this.f36955a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f36958d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35020b() {
        int b = super.b();
        if (this.f36956b != null && this.f36956b.length > 0) {
            for (i iVar : this.f36956b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f36955a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(9, this.f36957c);
        }
        if ((this.f36955a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(10, this.f36958d);
        }
        return b;
    }

    public final /* synthetic */ i m35018a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36956b == null ? 0 : this.f36956b.length;
                    Object obj = new C7400n[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36956b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7400n();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7400n();
                    c7213a.m33552a(obj[a]);
                    this.f36956b = obj;
                    continue;
                case 74:
                    this.f36957c = c7213a.m33565g();
                    this.f36955a |= 1;
                    continue;
                case 80:
                    this.f36958d = c7213a.m33567i();
                    this.f36955a |= 2;
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
