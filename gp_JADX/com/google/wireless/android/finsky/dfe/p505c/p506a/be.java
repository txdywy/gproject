package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class be extends b {
    public bf[] f37171a;
    public au f37172b;

    public be() {
        this.f37171a = bf.m35172d();
        this.f37172b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35170a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37171a != null && this.f37171a.length > 0) {
            for (i iVar : this.f37171a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f37172b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37172b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35171b() {
        int b = super.b();
        if (this.f37171a != null && this.f37171a.length > 0) {
            for (i iVar : this.f37171a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if (this.f37172b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37172b);
        }
        return b;
    }

    public final /* synthetic */ i m35169a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37171a == null ? 0 : this.f37171a.length;
                    Object obj = new bf[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37171a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bf();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bf();
                    c7213a.m33552a(obj[a]);
                    this.f37171a = obj;
                    continue;
                case 18:
                    if (this.f37172b == null) {
                        this.f37172b = new au();
                    }
                    c7213a.m33552a(this.f37172b);
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
