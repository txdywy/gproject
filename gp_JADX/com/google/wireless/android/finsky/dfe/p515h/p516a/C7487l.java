package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.aw;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7487l extends b {
    public int f38105a;
    public C7488m[] f38106b;
    public int f38107c;

    public C7487l() {
        this.f38105a = 0;
        this.f38106b = C7488m.m35820d();
        this.f38107c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35817a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38106b != null && this.f38106b.length > 0) {
            for (i iVar : this.f38106b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f38105a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38107c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35818b() {
        int b = super.b();
        if (this.f38106b != null && this.f38106b.length > 0) {
            for (i iVar : this.f38106b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f38105a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38107c);
        }
        return b;
    }

    private final C7487l m35815b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38106b == null ? 0 : this.f38106b.length;
                    Object obj = new C7488m[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38106b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7488m();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7488m();
                    c7213a.m33552a(obj[a]);
                    this.f38106b = obj;
                    continue;
                case 16:
                    this.f38105a |= 1;
                    a2 = c7213a.m33573o();
                    try {
                        this.f38107c = aw.a(c7213a.m33567i());
                        this.f38105a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(a2);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m35816a(C7213a c7213a) {
        return m35815b(c7213a);
    }
}
