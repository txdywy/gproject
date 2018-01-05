package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7117l extends b {
    public C7107b[] f34819a;
    public C7108c[] f34820b;

    public C7117l() {
        this.f34819a = C7107b.m32296d();
        this.f34820b = C7108c.m32300d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m32331a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f34819a != null && this.f34819a.length > 0) {
            for (i iVar : this.f34819a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f34820b != null && this.f34820b.length > 0) {
            while (i < this.f34820b.length) {
                i iVar2 = this.f34820b[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32332b() {
        int i = 0;
        int b = super.b();
        if (this.f34819a != null && this.f34819a.length > 0) {
            int i2 = b;
            for (i iVar : this.f34819a) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if (this.f34820b != null && this.f34820b.length > 0) {
            while (i < this.f34820b.length) {
                i iVar2 = this.f34820b[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m32330a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f34819a == null ? 0 : this.f34819a.length;
                    obj = new C7107b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34819a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7107b();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7107b();
                    c7213a.m33552a(obj[a]);
                    this.f34819a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f34820b == null ? 0 : this.f34820b.length;
                    obj = new C7108c[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34820b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7108c();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7108c();
                    c7213a.m33552a(obj[a]);
                    this.f34820b = obj;
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
