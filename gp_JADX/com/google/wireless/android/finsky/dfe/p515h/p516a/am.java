package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class am extends b {
    public ak[] f38048a;
    public al[] f38049b;

    public am() {
        this.f38048a = ak.m35749d();
        this.f38049b = al.m35756d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35761a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38048a != null && this.f38048a.length > 0) {
            for (i iVar : this.f38048a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f38049b != null && this.f38049b.length > 0) {
            while (i < this.f38049b.length) {
                i iVar2 = this.f38049b[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35762b() {
        int i = 0;
        int b = super.b();
        if (this.f38048a != null && this.f38048a.length > 0) {
            int i2 = b;
            for (i iVar : this.f38048a) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if (this.f38049b != null && this.f38049b.length > 0) {
            while (i < this.f38049b.length) {
                i iVar2 = this.f38049b[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m35760a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38048a == null ? 0 : this.f38048a.length;
                    obj = new ak[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38048a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ak();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ak();
                    c7213a.m33552a(obj[a]);
                    this.f38048a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38049b == null ? 0 : this.f38049b.length;
                    obj = new al[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38049b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new al();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new al();
                    c7213a.m33552a(obj[a]);
                    this.f38049b = obj;
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
