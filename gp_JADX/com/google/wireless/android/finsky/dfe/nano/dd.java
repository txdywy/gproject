package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dd extends b {
    public dj[] f38633a;

    public dd() {
        this.f38633a = dj.m36246d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36224a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38633a != null && this.f38633a.length > 0) {
            for (i iVar : this.f38633a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36225b() {
        int b = super.b();
        if (this.f38633a != null && this.f38633a.length > 0) {
            for (i iVar : this.f38633a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m36223a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38633a == null ? 0 : this.f38633a.length;
                    Object obj = new dj[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38633a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dj();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new dj();
                    c7213a.m33552a(obj[a]);
                    this.f38633a = obj;
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
