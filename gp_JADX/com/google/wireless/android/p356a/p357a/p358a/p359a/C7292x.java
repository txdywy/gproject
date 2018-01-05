package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7292x extends b {
    public C7293y[] f36174a;

    public C7292x() {
        this.f36174a = C7293y.m34493d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34490a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36174a != null && this.f36174a.length > 0) {
            for (i iVar : this.f36174a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34491b() {
        int b = super.b();
        if (this.f36174a != null && this.f36174a.length > 0) {
            for (i iVar : this.f36174a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m34489a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36174a == null ? 0 : this.f36174a.length;
                    Object obj = new C7293y[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36174a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7293y();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7293y();
                    c7213a.m33552a(obj[a]);
                    this.f36174a = obj;
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
