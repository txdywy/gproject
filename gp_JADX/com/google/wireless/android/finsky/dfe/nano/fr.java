package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fr extends b {
    public int f39008a;
    public fp[] f39009b;
    public boolean f39010c;
    public fp[] f39011d;

    public fr() {
        this.f39008a = 0;
        this.f39009b = fp.m36438d();
        this.f39010c = false;
        this.f39011d = fp.m36438d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m36447a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f39009b != null && this.f39009b.length > 0) {
            for (i iVar : this.f39009b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f39008a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f39010c);
        }
        if (this.f39011d != null && this.f39011d.length > 0) {
            while (i < this.f39011d.length) {
                i iVar2 = this.f39011d[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36448b() {
        int i = 0;
        int b = super.b();
        if (this.f39009b != null && this.f39009b.length > 0) {
            int i2 = b;
            for (i iVar : this.f39009b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if ((this.f39008a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f39011d != null && this.f39011d.length > 0) {
            while (i < this.f39011d.length) {
                i iVar2 = this.f39011d[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(3, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m36446a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f39009b == null ? 0 : this.f39009b.length;
                    obj = new fp[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39009b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new fp();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new fp();
                    c7213a.m33552a(obj[a]);
                    this.f39009b = obj;
                    continue;
                case 16:
                    this.f39010c = c7213a.m33563e();
                    this.f39008a |= 1;
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f39011d == null ? 0 : this.f39011d.length;
                    obj = new fp[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39011d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new fp();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new fp();
                    c7213a.m33552a(obj[a]);
                    this.f39011d = obj;
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
