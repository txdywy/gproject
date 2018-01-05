package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fq extends b {
    public fo[] f39007a;

    public fq() {
        this.f39007a = fo.m36434d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36444a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39007a != null && this.f39007a.length > 0) {
            for (i iVar : this.f39007a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36445b() {
        int b = super.b();
        if (this.f39007a != null && this.f39007a.length > 0) {
            for (i iVar : this.f39007a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m36443a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39007a == null ? 0 : this.f39007a.length;
                    Object obj = new fo[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39007a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new fo();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new fo();
                    c7213a.m33552a(obj[a]);
                    this.f39007a = obj;
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
