package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7351g;

public final class bj extends b {
    public int f38450a;
    public boolean f38451b;
    public C7351g[] f38452c;
    public int[] f38453d;

    public bj() {
        this.f38450a = 0;
        this.f38451b = false;
        this.f38452c = C7351g.m34850d();
        this.f38453d = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36085a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f38450a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f38451b);
        }
        if (this.f38452c != null && this.f38452c.length > 0) {
            for (i iVar : this.f38452c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (this.f38453d != null && this.f38453d.length > 0) {
            while (i < this.f38453d.length) {
                codedOutputByteBufferNano.m33518a(5, this.f38453d[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36086b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f38450a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f38452c != null && this.f38452c.length > 0) {
            i = b;
            for (i iVar : this.f38452c) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (this.f38453d == null || this.f38453d.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f38453d.length) {
            i += CodedOutputByteBufferNano.m33498c(this.f38453d[i2]);
            i2++;
        }
        return (b + i) + (this.f38453d.length * 1);
    }

    public final /* synthetic */ i m36084a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38451b = c7213a.m33563e();
                    this.f38450a |= 1;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38452c == null ? 0 : this.f38452c.length;
                    obj = new C7351g[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38452c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7351g();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7351g();
                    c7213a.m33552a(obj[a]);
                    this.f38452c = obj;
                    continue;
                case 40:
                    a2 = C7222l.m33624a(c7213a, 40);
                    if (this.f38453d == null) {
                        a = 0;
                    } else {
                        a = this.f38453d.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38453d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f38453d = obj;
                    continue;
                case 42:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f38453d == null ? 0 : this.f38453d.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f38453d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f38453d = obj2;
                    c7213a.m33561d(c);
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
