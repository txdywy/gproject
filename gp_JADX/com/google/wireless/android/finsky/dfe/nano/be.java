package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7351g;

public final class be extends b {
    public int f38416a;
    public C7351g[] f38417b;
    public bg[] f38418c;
    public String f38419d;

    public be() {
        this.f38416a = 0;
        this.f38417b = C7351g.m34850d();
        this.f38418c = bg.m36069d();
        this.f38419d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36063a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38417b != null && this.f38417b.length > 0) {
            for (i iVar : this.f38417b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f38418c != null && this.f38418c.length > 0) {
            while (i < this.f38418c.length) {
                i iVar2 = this.f38418c[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar2);
                }
                i++;
            }
        }
        if ((this.f38416a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38419d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36064b() {
        int i = 0;
        int b = super.b();
        if (this.f38417b != null && this.f38417b.length > 0) {
            int i2 = b;
            for (i iVar : this.f38417b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if (this.f38418c != null && this.f38418c.length > 0) {
            while (i < this.f38418c.length) {
                i iVar2 = this.f38418c[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(2, iVar2);
                }
                i++;
            }
        }
        if ((this.f38416a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38419d);
        }
        return b;
    }

    public final /* synthetic */ i m36062a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38417b == null ? 0 : this.f38417b.length;
                    obj = new C7351g[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38417b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7351g();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7351g();
                    c7213a.m33552a(obj[a]);
                    this.f38417b = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f38418c == null ? 0 : this.f38418c.length;
                    obj = new bg[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38418c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bg();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bg();
                    c7213a.m33552a(obj[a]);
                    this.f38418c = obj;
                    continue;
                case 26:
                    this.f38419d = c7213a.m33564f();
                    this.f38416a |= 1;
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
