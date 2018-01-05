package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ba extends b {
    public bh[] f37161a;

    public ba() {
        this.f37161a = bh.m35177d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35157a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37161a != null && this.f37161a.length > 0) {
            for (i iVar : this.f37161a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35158b() {
        int b = super.b();
        if (this.f37161a != null && this.f37161a.length > 0) {
            for (i iVar : this.f37161a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m35156a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37161a == null ? 0 : this.f37161a.length;
                    Object obj = new bh[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37161a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bh();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bh();
                    c7213a.m33552a(obj[a]);
                    this.f37161a = obj;
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
