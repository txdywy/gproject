package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7376f extends b {
    public static volatile C7376f[] f36867a;
    public C7375e[] f36868b;

    public static C7376f[] m34941d() {
        if (f36867a == null) {
            synchronized (C7219h.f35465b) {
                if (f36867a == null) {
                    f36867a = new C7376f[0];
                }
            }
        }
        return f36867a;
    }

    public C7376f() {
        this.f36868b = C7375e.m34937d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34943a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36868b != null && this.f36868b.length > 0) {
            for (i iVar : this.f36868b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34944b() {
        int b = super.b();
        if (this.f36868b != null && this.f36868b.length > 0) {
            for (i iVar : this.f36868b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        return b;
    }

    public final /* synthetic */ i m34942a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36868b == null ? 0 : this.f36868b.length;
                    Object obj = new C7375e[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36868b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7375e();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7375e();
                    c7213a.m33552a(obj[a]);
                    this.f36868b = obj;
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
