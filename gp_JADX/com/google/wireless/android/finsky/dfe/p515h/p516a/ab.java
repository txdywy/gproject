package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ab extends b {
    public int f37997a;
    public ac[] f37998b;
    public String f37999c;
    public String f38000d;
    public String f38001e;
    public String f38002f;
    public ad[] f38003g;
    public boolean f38004h;

    public ab() {
        this.f37997a = 0;
        this.f37998b = ac.m35725d();
        this.f37999c = "";
        this.f38000d = "";
        this.f38001e = "";
        this.f38002f = "";
        this.f38003g = ad.m35729d();
        this.f38004h = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35723a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37998b != null && this.f37998b.length > 0) {
            for (i iVar : this.f37998b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if ((this.f37997a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37999c);
        }
        if ((this.f37997a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38000d);
        }
        if ((this.f37997a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38001e);
        }
        if ((this.f37997a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38002f);
        }
        if (this.f38003g != null && this.f38003g.length > 0) {
            while (i < this.f38003g.length) {
                i iVar2 = this.f38003g[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar2);
                }
                i++;
            }
        }
        if ((this.f37997a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f38004h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35724b() {
        int i = 0;
        int b = super.b();
        if (this.f37998b != null && this.f37998b.length > 0) {
            int i2 = b;
            for (i iVar : this.f37998b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i2;
        }
        if ((this.f37997a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37999c);
        }
        if ((this.f37997a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38000d);
        }
        if ((this.f37997a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38001e);
        }
        if ((this.f37997a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38002f);
        }
        if (this.f38003g != null && this.f38003g.length > 0) {
            while (i < this.f38003g.length) {
                i iVar2 = this.f38003g[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(6, iVar2);
                }
                i++;
            }
        }
        if ((this.f37997a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(7) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35722a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f37998b == null ? 0 : this.f37998b.length;
                    obj = new ac[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37998b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ac();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ac();
                    c7213a.m33552a(obj[a]);
                    this.f37998b = obj;
                    continue;
                case 18:
                    this.f37999c = c7213a.m33564f();
                    this.f37997a |= 1;
                    continue;
                case 26:
                    this.f38000d = c7213a.m33564f();
                    this.f37997a |= 2;
                    continue;
                case 34:
                    this.f38001e = c7213a.m33564f();
                    this.f37997a |= 4;
                    continue;
                case 42:
                    this.f38002f = c7213a.m33564f();
                    this.f37997a |= 8;
                    continue;
                case 50:
                    a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f38003g == null ? 0 : this.f38003g.length;
                    obj = new ad[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38003g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ad();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ad();
                    c7213a.m33552a(obj[a]);
                    this.f38003g = obj;
                    continue;
                case 56:
                    this.f38004h = c7213a.m33563e();
                    this.f37997a |= 16;
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
