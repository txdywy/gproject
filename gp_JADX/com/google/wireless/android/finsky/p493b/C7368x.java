package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7368x extends b {
    public C7369y[] f36836a;

    public C7368x() {
        this.f36836a = C7369y.m34912d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34910a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36836a != null && this.f36836a.length > 0) {
            for (i iVar : this.f36836a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34911b() {
        int b = super.b();
        if (this.f36836a != null && this.f36836a.length > 0) {
            for (i iVar : this.f36836a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m34909a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36836a == null ? 0 : this.f36836a.length;
                    Object obj = new C7369y[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36836a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7369y();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7369y();
                    c7213a.m33552a(obj[a]);
                    this.f36836a = obj;
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
