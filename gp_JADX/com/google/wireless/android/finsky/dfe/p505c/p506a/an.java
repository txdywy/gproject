package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class an extends b {
    public int f37091a;
    public boolean f37092b;
    public ak f37093c;
    public int[] f37094d;
    public boolean f37095e;

    public an() {
        this.f37091a = 0;
        this.f37092b = false;
        this.f37093c = null;
        this.f37094d = C7222l.f35472e;
        this.f37095e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35113a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37091a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f37092b);
        }
        if (this.f37093c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37093c);
        }
        if (this.f37094d != null && this.f37094d.length > 0) {
            for (int a : this.f37094d) {
                codedOutputByteBufferNano.m33518a(3, a);
            }
        }
        if ((this.f37091a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f37095e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35114b() {
        int i = 0;
        int b = super.b();
        if ((this.f37091a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f37093c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37093c);
        }
        if (this.f37094d != null && this.f37094d.length > 0) {
            int i2 = 0;
            while (i < this.f37094d.length) {
                i2 += CodedOutputByteBufferNano.m33498c(this.f37094d[i]);
                i++;
            }
            b = (b + i2) + (this.f37094d.length * 1);
        }
        if ((this.f37091a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35112a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37092b = c7213a.m33563e();
                    this.f37091a |= 1;
                    continue;
                case 18:
                    if (this.f37093c == null) {
                        this.f37093c = new ak();
                    }
                    c7213a.m33552a(this.f37093c);
                    continue;
                case 24:
                    a2 = C7222l.m33624a(c7213a, 24);
                    if (this.f37094d == null) {
                        a = 0;
                    } else {
                        a = this.f37094d.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37094d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f37094d = obj;
                    continue;
                case 26:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f37094d == null ? 0 : this.f37094d.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f37094d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f37094d = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 32:
                    this.f37095e = c7213a.m33563e();
                    this.f37091a |= 2;
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
