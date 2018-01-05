package com.google.p443h.p444a.p445a.p446a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7148a extends b {
    public int[] f34919a;

    public C7148a() {
        this.f34919a = C7222l.f35472e;
        this.aP = -1;
    }

    public final void m32423a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34919a != null && this.f34919a.length > 0) {
            for (int a : this.f34919a) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32424b() {
        int i = 0;
        int b = super.b();
        if (this.f34919a == null || this.f34919a.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f34919a.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f34919a[i]);
            i++;
        }
        return (b + i2) + (this.f34919a.length * 1);
    }

    public final /* synthetic */ i m32422a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = C7222l.m33624a(c7213a, 8);
                    if (this.f34919a == null) {
                        a = 0;
                    } else {
                        a = this.f34919a.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34919a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34919a = obj;
                    continue;
                case 10:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34919a == null ? 0 : this.f34919a.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34919a, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34919a = obj2;
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
