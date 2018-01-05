package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bz extends b {
    public ca[] f37266a;
    public cc f37267b;

    public bz() {
        this.f37266a = ca.m35245d();
        this.f37267b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35240a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37266a != null && this.f37266a.length > 0) {
            for (i iVar : this.f37266a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f37267b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37267b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35241b() {
        int b = super.b();
        if (this.f37266a != null && this.f37266a.length > 0) {
            for (i iVar : this.f37266a) {
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
        }
        if (this.f37267b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37267b);
        }
        return b;
    }

    public final /* synthetic */ i m35239a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37266a == null ? 0 : this.f37266a.length;
                    Object obj = new ca[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37266a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ca();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ca();
                    c7213a.m33552a(obj[a]);
                    this.f37266a = obj;
                    continue;
                case 18:
                    if (this.f37267b == null) {
                        this.f37267b = new cc();
                    }
                    c7213a.m33552a(this.f37267b);
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
