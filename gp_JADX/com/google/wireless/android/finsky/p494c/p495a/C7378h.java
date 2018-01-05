package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7378h extends b {
    public C7371a f36872a;
    public C7371a[] f36873b;
    public String[] f36874c;

    public C7378h() {
        this.f36872a = null;
        this.f36873b = C7371a.m34923d();
        this.f36874c = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34949a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f36872a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36872a);
        }
        if (this.f36873b != null && this.f36873b.length > 0) {
            for (i iVar : this.f36873b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (this.f36874c != null && this.f36874c.length > 0) {
            while (i < this.f36874c.length) {
                String str = this.f36874c[i];
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(3, str);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34950b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f36872a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36872a);
        }
        if (this.f36873b != null && this.f36873b.length > 0) {
            i = b;
            for (i iVar : this.f36873b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (this.f36874c == null || this.f36874c.length <= 0) {
            return b;
        }
        i = 0;
        int i3 = 0;
        while (i2 < this.f36874c.length) {
            String str = this.f36874c[i2];
            if (str != null) {
                i3++;
                i += CodedOutputByteBufferNano.m33495b(str);
            }
            i2++;
        }
        return (b + i) + (i3 * 1);
    }

    public final /* synthetic */ i m34948a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36872a == null) {
                        this.f36872a = new C7371a();
                    }
                    c7213a.m33552a(this.f36872a);
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36873b == null ? 0 : this.f36873b.length;
                    obj = new C7371a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36873b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7371a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7371a();
                    c7213a.m33552a(obj[a]);
                    this.f36873b = obj;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f36874c == null ? 0 : this.f36874c.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36874c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36874c = obj;
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
