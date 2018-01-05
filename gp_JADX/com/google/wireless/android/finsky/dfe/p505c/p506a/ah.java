package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7214c;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ah extends b {
    public static final C7214c f37062a = C7214c.m33574a(ah.class, 1178329994);
    public C7428r[] f37063b;
    public C7430t[] f37064c;

    public ah() {
        this.f37063b = C7428r.f37644a;
        this.f37064c = C7430t.m35505d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35088a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37063b != null && this.f37063b.length > 0) {
            for (i iVar : this.f37063b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f37064c != null && this.f37064c.length > 0) {
            while (i < this.f37064c.length) {
                i iVar2 = this.f37064c[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35089b() {
        int i = 0;
        int b = super.b();
        if (this.f37063b != null && this.f37063b.length > 0) {
            int i2 = b;
            for (i iVar : this.f37063b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if (this.f37064c != null && this.f37064c.length > 0) {
            while (i < this.f37064c.length) {
                i iVar2 = this.f37064c[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m35087a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37063b == null ? 0 : this.f37063b.length;
                    obj = new C7428r[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37063b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7428r();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7428r();
                    c7213a.m33552a(obj[a]);
                    this.f37063b = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37064c == null ? 0 : this.f37064c.length;
                    obj = new C7430t[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37064c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7430t();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7430t();
                    c7213a.m33552a(obj[a]);
                    this.f37064c = obj;
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
