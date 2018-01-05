package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cl extends b {
    public String[] f37313a;
    public cm[] f37314b;
    public bl f37315c;
    public bl f37316d;

    public cl() {
        this.f37313a = C7222l.f35477j;
        this.f37314b = cm.m35283d();
        this.f37315c = null;
        this.f37316d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35281a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37313a != null && this.f37313a.length > 0) {
            for (String str : this.f37313a) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        if (this.f37314b != null && this.f37314b.length > 0) {
            while (i < this.f37314b.length) {
                i iVar = this.f37314b[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
                i++;
            }
        }
        if (this.f37315c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37315c);
        }
        if (this.f37316d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37316d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35282b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f37313a == null || this.f37313a.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f37313a) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f37314b != null && this.f37314b.length > 0) {
            while (i2 < this.f37314b.length) {
                i iVar = this.f37314b[i2];
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
                i2++;
            }
        }
        if (this.f37315c != null) {
            i += CodedOutputByteBufferNano.m33503d(3, this.f37315c);
        }
        if (this.f37316d != null) {
            return i + CodedOutputByteBufferNano.m33503d(4, this.f37316d);
        }
        return i;
    }

    public final /* synthetic */ i m35280a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37313a == null ? 0 : this.f37313a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37313a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f37313a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f37314b == null ? 0 : this.f37314b.length;
                    obj = new cm[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37314b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cm();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cm();
                    c7213a.m33552a(obj[a]);
                    this.f37314b = obj;
                    continue;
                case 26:
                    if (this.f37315c == null) {
                        this.f37315c = new bl();
                    }
                    c7213a.m33552a(this.f37315c);
                    continue;
                case 34:
                    if (this.f37316d == null) {
                        this.f37316d = new bl();
                    }
                    c7213a.m33552a(this.f37316d);
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
