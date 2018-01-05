package com.google.wireless.android.finsky.dfe.p509e.p510a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7442b extends b {
    public C7444d f37737a;
    public C7445e[] f37738b;

    public C7442b() {
        this.f37737a = null;
        this.f37738b = C7445e.m35555d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35549a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37737a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37737a);
        }
        if (this.f37738b != null && this.f37738b.length > 0) {
            for (i iVar : this.f37738b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35550b() {
        int b = super.b();
        if (this.f37737a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37737a);
        }
        if (this.f37738b == null || this.f37738b.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f37738b) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m35548a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37737a == null) {
                        this.f37737a = new C7444d();
                    }
                    c7213a.m33552a(this.f37737a);
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37738b == null ? 0 : this.f37738b.length;
                    Object obj = new C7445e[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37738b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7445e();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7445e();
                    c7213a.m33552a(obj[a]);
                    this.f37738b = obj;
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
