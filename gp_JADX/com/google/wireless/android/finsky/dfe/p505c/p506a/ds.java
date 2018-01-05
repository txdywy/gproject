package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class ds extends b {
    public C7367w[] f37492a;

    public ds() {
        this.f37492a = C7367w.m34905d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35400a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37492a != null && this.f37492a.length > 0) {
            for (i iVar : this.f37492a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35401b() {
        int b = super.b();
        if (this.f37492a != null && this.f37492a.length > 0) {
            for (i iVar : this.f37492a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m35399a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37492a == null ? 0 : this.f37492a.length;
                    Object obj = new C7367w[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37492a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7367w();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7367w();
                    c7213a.m33552a(obj[a]);
                    this.f37492a = obj;
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
