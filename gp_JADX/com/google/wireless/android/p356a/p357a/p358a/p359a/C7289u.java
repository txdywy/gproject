package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7289u extends b {
    public int f36161a;
    public C7290v[] f36162b;
    public int f36163c;

    public final C7289u m34472a(int i) {
        this.f36161a |= 1;
        this.f36163c = i;
        return this;
    }

    public C7289u() {
        this.f36161a = 0;
        this.f36162b = C7290v.m34475d();
        this.f36163c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34473a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36162b != null && this.f36162b.length > 0) {
            for (i iVar : this.f36162b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f36161a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36163c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34474b() {
        int b = super.b();
        if (this.f36162b != null && this.f36162b.length > 0) {
            for (i iVar : this.f36162b) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if ((this.f36161a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36163c);
        }
        return b;
    }

    public final /* synthetic */ i m34471a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f36162b == null ? 0 : this.f36162b.length;
                    Object obj = new C7290v[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36162b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7290v();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7290v();
                    c7213a.m33552a(obj[a]);
                    this.f36162b = obj;
                    continue;
                case 16:
                    this.f36163c = c7213a.m33567i();
                    this.f36161a |= 1;
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
