package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7116k extends b {
    public C7112g f34817a;
    public C7106a[] f34818b;

    public C7116k() {
        this.f34817a = null;
        this.f34818b = C7106a.m32292d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m32328a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34817a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34817a);
        }
        if (this.f34818b != null && this.f34818b.length > 0) {
            for (i iVar : this.f34818b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32329b() {
        int b = super.b();
        if (this.f34817a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34817a);
        }
        if (this.f34818b == null || this.f34818b.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f34818b) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m32327a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34817a == null) {
                        this.f34817a = new C7112g();
                    }
                    c7213a.m33552a(this.f34817a);
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f34818b == null ? 0 : this.f34818b.length;
                    Object obj = new C7106a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34818b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7106a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7106a();
                    c7213a.m33552a(obj[a]);
                    this.f34818b = obj;
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
