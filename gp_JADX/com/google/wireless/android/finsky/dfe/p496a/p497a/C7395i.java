package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7395i extends b {
    public int f36946a;
    public boolean f36947b;
    public C7387a[] f36948c;
    public boolean f36949d;
    public C7387a[] f36950e;

    public C7395i() {
        this.f36946a = 0;
        this.f36947b = false;
        this.f36948c = C7387a.m34977d();
        this.f36949d = false;
        this.f36950e = C7387a.m34977d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m35009a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f36946a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f36947b);
        }
        if (this.f36948c != null && this.f36948c.length > 0) {
            for (i iVar : this.f36948c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if ((this.f36946a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36949d);
        }
        if (this.f36950e != null && this.f36950e.length > 0) {
            while (i < this.f36950e.length) {
                i iVar2 = this.f36950e[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35010b() {
        int i = 0;
        int b = super.b();
        if ((this.f36946a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f36948c != null && this.f36948c.length > 0) {
            int i2 = b;
            for (i iVar : this.f36948c) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i2;
        }
        if ((this.f36946a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f36950e != null && this.f36950e.length > 0) {
            while (i < this.f36950e.length) {
                i iVar2 = this.f36950e[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(4, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m35008a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36947b = c7213a.m33563e();
                    this.f36946a |= 1;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f36948c == null ? 0 : this.f36948c.length;
                    obj = new C7387a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36948c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7387a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7387a();
                    c7213a.m33552a(obj[a]);
                    this.f36948c = obj;
                    continue;
                case 24:
                    this.f36949d = c7213a.m33563e();
                    this.f36946a |= 2;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f36950e == null ? 0 : this.f36950e.length;
                    obj = new C7387a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36950e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7387a();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7387a();
                    c7213a.m33552a(obj[a]);
                    this.f36950e = obj;
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
