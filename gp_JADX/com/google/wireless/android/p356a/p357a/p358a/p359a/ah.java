package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ah extends b {
    public ai[] f35616a;

    public ah() {
        this.f35616a = ai.m34083d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34081a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35616a != null && this.f35616a.length > 0) {
            for (i iVar : this.f35616a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34082b() {
        int b = super.b();
        if (this.f35616a != null && this.f35616a.length > 0) {
            for (i iVar : this.f35616a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m34080a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f35616a == null ? 0 : this.f35616a.length;
                    Object obj = new ai[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35616a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ai();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ai();
                    c7213a.m33552a(obj[a]);
                    this.f35616a = obj;
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
