package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p488d.p489a.p490a.C7301c;
import com.google.wireless.android.p488d.p489a.p490a.C7303e;
import com.google.wireless.android.p488d.p489a.p490a.C7309k;
import java.util.Arrays;

public final class C7111f extends b {
    public String f34777a;
    public String f34778b;
    public C7115j[] f34779c;
    public String f34780d;
    public String f34781e;
    public C7303e f34782f;
    public C7113h[] f34783g;
    public boolean f34784h;
    public boolean f34785i;
    public String[] f34786j;
    public C7301c f34787k;
    public C7309k[] f34788l;
    public byte[] f34789m;
    public long f34790n;

    public C7111f() {
        this.f34777a = "";
        this.f34778b = "";
        this.f34779c = C7115j.m32323d();
        this.f34780d = "";
        this.f34781e = "";
        this.f34782f = null;
        this.f34783g = C7113h.m32316d();
        this.f34784h = false;
        this.f34785i = false;
        this.f34786j = C7222l.f35477j;
        this.f34787k = null;
        this.f34788l = C7309k.m34559d();
        this.f34789m = C7222l.f35479l;
        this.f34790n = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32311a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f34777a == null || this.f34777a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34777a);
        }
        if (!(this.f34778b == null || this.f34778b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34778b);
        }
        if (this.f34779c != null && this.f34779c.length > 0) {
            for (i iVar : this.f34779c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (!(this.f34780d == null || this.f34780d.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f34780d);
        }
        if (!(this.f34781e == null || this.f34781e.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f34781e);
        }
        if (this.f34782f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f34782f);
        }
        if (this.f34783g != null && this.f34783g.length > 0) {
            for (i iVar2 : this.f34783g) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar2);
                }
            }
        }
        if (this.f34784h) {
            codedOutputByteBufferNano.m33522a(8, this.f34784h);
        }
        if (this.f34785i) {
            codedOutputByteBufferNano.m33522a(9, this.f34785i);
        }
        if (this.f34786j != null && this.f34786j.length > 0) {
            for (String str : this.f34786j) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(10, str);
                }
            }
        }
        if (this.f34787k != null) {
            codedOutputByteBufferNano.m33532b(11, this.f34787k);
        }
        if (this.f34788l != null && this.f34788l.length > 0) {
            while (i < this.f34788l.length) {
                i iVar3 = this.f34788l[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(12, iVar3);
                }
                i++;
            }
        }
        if (this.f34790n != 0) {
            codedOutputByteBufferNano.m33531b(13, this.f34790n);
        }
        if (!Arrays.equals(this.f34789m, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(14, this.f34789m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32312b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (!(this.f34777a == null || this.f34777a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34777a);
        }
        if (!(this.f34778b == null || this.f34778b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34778b);
        }
        if (this.f34779c != null && this.f34779c.length > 0) {
            i = b;
            for (i iVar : this.f34779c) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
            b = i;
        }
        if (!(this.f34780d == null || this.f34780d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f34780d);
        }
        if (!(this.f34781e == null || this.f34781e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f34781e);
        }
        if (this.f34782f != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f34782f);
        }
        if (this.f34783g != null && this.f34783g.length > 0) {
            i = b;
            for (i iVar2 : this.f34783g) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(7, iVar2);
                }
            }
            b = i;
        }
        if (this.f34784h) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if (this.f34785i) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if (this.f34786j != null && this.f34786j.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f34786j) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f34787k != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f34787k);
        }
        if (this.f34788l != null && this.f34788l.length > 0) {
            while (i2 < this.f34788l.length) {
                i iVar3 = this.f34788l[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(12, iVar3);
                }
                i2++;
            }
        }
        if (this.f34790n != 0) {
            b += CodedOutputByteBufferNano.m33508f(13, this.f34790n);
        }
        if (Arrays.equals(this.f34789m, C7222l.f35479l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33494b(14, this.f34789m);
    }

    public final /* synthetic */ i m32310a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34777a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f34778b = c7213a.m33564f();
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f34779c == null ? 0 : this.f34779c.length;
                    obj = new C7115j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34779c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7115j();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7115j();
                    c7213a.m33552a(obj[a]);
                    this.f34779c = obj;
                    continue;
                case 34:
                    this.f34780d = c7213a.m33564f();
                    continue;
                case 42:
                    this.f34781e = c7213a.m33564f();
                    continue;
                case 50:
                    if (this.f34782f == null) {
                        this.f34782f = new C7303e();
                    }
                    c7213a.m33552a(this.f34782f);
                    continue;
                case 58:
                    a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f34783g == null ? 0 : this.f34783g.length;
                    obj = new C7113h[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34783g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7113h();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7113h();
                    c7213a.m33552a(obj[a]);
                    this.f34783g = obj;
                    continue;
                case 64:
                    this.f34784h = c7213a.m33563e();
                    continue;
                case 72:
                    this.f34785i = c7213a.m33563e();
                    continue;
                case 82:
                    a2 = C7222l.m33624a(c7213a, 82);
                    a = this.f34786j == null ? 0 : this.f34786j.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34786j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f34786j = obj;
                    continue;
                case 90:
                    if (this.f34787k == null) {
                        this.f34787k = new C7301c();
                    }
                    c7213a.m33552a(this.f34787k);
                    continue;
                case 98:
                    a2 = C7222l.m33624a(c7213a, 98);
                    a = this.f34788l == null ? 0 : this.f34788l.length;
                    obj = new C7309k[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34788l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7309k();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7309k();
                    c7213a.m33552a(obj[a]);
                    this.f34788l = obj;
                    continue;
                case 104:
                    this.f34790n = c7213a.m33568j();
                    continue;
                case 114:
                    this.f34789m = c7213a.m33565g();
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
