package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7342x extends b {
    public int f36633a;
    public String f36634b;
    public String f36635c;
    public boolean f36636d;
    public C7331m[] f36637e;

    public C7342x() {
        this.f36633a = 0;
        this.f36634b = "";
        this.f36635c = "";
        this.f36636d = false;
        this.f36637e = C7331m.m34750d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34786a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36633a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36634b);
        }
        if ((this.f36633a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36635c);
        }
        if ((this.f36633a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36636d);
        }
        if (this.f36637e != null && this.f36637e.length > 0) {
            for (i iVar : this.f36637e) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34787b() {
        int b = super.b();
        if ((this.f36633a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36634b);
        }
        if ((this.f36633a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36635c);
        }
        if ((this.f36633a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f36637e == null || this.f36637e.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36637e) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(4, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m34785a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36634b = c7213a.m33564f();
                    this.f36633a |= 1;
                    continue;
                case 18:
                    this.f36635c = c7213a.m33564f();
                    this.f36633a |= 2;
                    continue;
                case 24:
                    this.f36636d = c7213a.m33563e();
                    this.f36633a |= 4;
                    continue;
                case 34:
                    int a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f36637e == null ? 0 : this.f36637e.length;
                    Object obj = new C7331m[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36637e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7331m();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7331m();
                    c7213a.m33552a(obj[a]);
                    this.f36637e = obj;
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
