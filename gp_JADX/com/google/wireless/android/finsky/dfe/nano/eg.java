package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eg extends b {
    public ee f38745a;
    public ee[] f38746b;
    public ef[] f38747c;

    public eg() {
        this.f38745a = null;
        this.f38746b = ee.m36315d();
        this.f38747c = ef.m36320d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36325a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38745a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38745a);
        }
        if (this.f38746b != null && this.f38746b.length > 0) {
            for (i iVar : this.f38746b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (this.f38747c != null && this.f38747c.length > 0) {
            while (i < this.f38747c.length) {
                i iVar2 = this.f38747c[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36326b() {
        int i = 0;
        int b = super.b();
        if (this.f38745a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38745a);
        }
        if (this.f38746b != null && this.f38746b.length > 0) {
            int i2 = b;
            for (i iVar : this.f38746b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i2;
        }
        if (this.f38747c != null && this.f38747c.length > 0) {
            while (i < this.f38747c.length) {
                i iVar2 = this.f38747c[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(3, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m36324a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38745a == null) {
                        this.f38745a = new ee();
                    }
                    c7213a.m33552a(this.f38745a);
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38746b == null ? 0 : this.f38746b.length;
                    obj = new ee[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38746b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ee();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ee();
                    c7213a.m33552a(obj[a]);
                    this.f38746b = obj;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38747c == null ? 0 : this.f38747c.length;
                    obj = new ef[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38747c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ef();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ef();
                    c7213a.m33552a(obj[a]);
                    this.f38747c = obj;
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
