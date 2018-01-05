package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ak extends b {
    public static volatile ak[] f37827a;
    public C7467r[] f37828b;

    public static ak[] m35615d() {
        if (f37827a == null) {
            synchronized (C7219h.f35465b) {
                if (f37827a == null) {
                    f37827a = new ak[0];
                }
            }
        }
        return f37827a;
    }

    public ak() {
        this.f37828b = C7467r.m35670d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35617a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37828b != null && this.f37828b.length > 0) {
            for (i iVar : this.f37828b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35618b() {
        int b = super.b();
        if (this.f37828b != null && this.f37828b.length > 0) {
            for (i iVar : this.f37828b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m35616a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37828b == null ? 0 : this.f37828b.length;
                    Object obj = new C7467r[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37828b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7467r();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7467r();
                    c7213a.m33552a(obj[a]);
                    this.f37828b = obj;
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
