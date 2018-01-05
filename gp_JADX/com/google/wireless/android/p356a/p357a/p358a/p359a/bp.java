package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bp extends b {
    public ce[] f35819a;

    public bp() {
        m34214d();
    }

    public final bp m34214d() {
        this.f35819a = ce.f35926a;
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final void m34212a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35819a != null && this.f35819a.length > 0) {
            for (i iVar : this.f35819a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34213b() {
        int b = super.b();
        if (this.f35819a != null && this.f35819a.length > 0) {
            for (i iVar : this.f35819a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m34211a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f35819a == null ? 0 : this.f35819a.length;
                    Object obj = new ce[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35819a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ce();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ce();
                    c7213a.m33552a(obj[a]);
                    this.f35819a = obj;
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
