package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dg extends b {
    public static volatile dg[] f38645a;
    public df[] f38646b;

    public static dg[] m36236d() {
        if (f38645a == null) {
            synchronized (C7219h.f35465b) {
                if (f38645a == null) {
                    f38645a = new dg[0];
                }
            }
        }
        return f38645a;
    }

    public dg() {
        this.f38646b = df.m36229d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36238a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38646b != null && this.f38646b.length > 0) {
            for (i iVar : this.f38646b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36239b() {
        int b = super.b();
        if (this.f38646b != null && this.f38646b.length > 0) {
            for (i iVar : this.f38646b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m36237a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38646b == null ? 0 : this.f38646b.length;
                    Object obj = new df[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38646b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new df();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new df();
                    c7213a.m33552a(obj[a]);
                    this.f38646b = obj;
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
