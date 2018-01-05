package com.google.wireless.android.finsky.dfe.p507d.p508a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7438b extends b {
    public C7437a[] f37729a;

    public C7438b() {
        this.f37729a = C7437a.m35534d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35539a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37729a != null && this.f37729a.length > 0) {
            for (i iVar : this.f37729a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35540b() {
        int b = super.b();
        if (this.f37729a != null && this.f37729a.length > 0) {
            for (i iVar : this.f37729a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m35538a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37729a == null ? 0 : this.f37729a.length;
                    Object obj = new C7437a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37729a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7437a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7437a();
                    c7213a.m33552a(obj[a]);
                    this.f37729a = obj;
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
