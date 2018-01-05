package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class de extends b {
    public dc[] f38634a;

    public de() {
        this.f38634a = dc.m36219d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36227a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38634a != null && this.f38634a.length > 0) {
            for (i iVar : this.f38634a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36228b() {
        int b = super.b();
        if (this.f38634a != null && this.f38634a.length > 0) {
            for (i iVar : this.f38634a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m36226a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38634a == null ? 0 : this.f38634a.length;
                    Object obj = new dc[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38634a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dc();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new dc();
                    c7213a.m33552a(obj[a]);
                    this.f38634a = obj;
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
