package p535f.p536a.p537a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7745c extends b {
    public C7747e[] f40248a;
    public String[] f40249b;
    public int f40250c;
    public long f40251d;
    public C7746d f40252e;
    public boolean f40253f;
    public boolean f40254g;
    public String f40255h;
    public String[] f40256i;
    public String f40257j;
    public String f40258k;
    public String f40259l;

    public C7745c() {
        this.f40248a = C7747e.m37516d();
        this.f40249b = C7222l.f35477j;
        this.f40250c = -1;
        this.f40251d = -86400000;
        this.f40252e = null;
        this.f40253f = false;
        this.f40254g = false;
        this.f40255h = "";
        this.f40256i = C7222l.f35477j;
        this.f40257j = "";
        this.f40258k = "";
        this.f40259l = "";
        this.aP = -1;
    }

    public final void m37511a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f40248a != null && this.f40248a.length > 0) {
            for (i iVar : this.f40248a) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(1, iVar);
                }
            }
        }
        if (this.f40249b != null && this.f40249b.length > 0) {
            for (String str : this.f40249b) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(2, str);
                }
            }
        }
        if (this.f40250c != -1) {
            codedOutputByteBufferNano.m33518a(3, this.f40250c);
        }
        if (this.f40251d != -86400000) {
            codedOutputByteBufferNano.m33531b(4, this.f40251d);
        }
        if (this.f40252e != null) {
            codedOutputByteBufferNano.m33532b(6, this.f40252e);
        }
        if (this.f40253f) {
            codedOutputByteBufferNano.m33522a(7, this.f40253f);
        }
        if (this.f40254g) {
            codedOutputByteBufferNano.m33522a(8, this.f40254g);
        }
        if (!(this.f40255h == null || this.f40255h.equals(""))) {
            codedOutputByteBufferNano.m33521a(9, this.f40255h);
        }
        if (this.f40256i != null && this.f40256i.length > 0) {
            while (i < this.f40256i.length) {
                String str2 = this.f40256i[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(10, str2);
                }
                i++;
            }
        }
        if (!(this.f40257j == null || this.f40257j.equals(""))) {
            codedOutputByteBufferNano.m33521a(11, this.f40257j);
        }
        if (!(this.f40258k == null || this.f40258k.equals(""))) {
            codedOutputByteBufferNano.m33521a(14, this.f40258k);
        }
        if (!(this.f40259l == null || this.f40259l.equals(""))) {
            codedOutputByteBufferNano.m33521a(15, this.f40259l);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37512b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.f40248a != null && this.f40248a.length > 0) {
            i = b;
            for (i iVar : this.f40248a) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(1, iVar);
                }
            }
            b = i;
        }
        if (this.f40249b != null && this.f40249b.length > 0) {
            i2 = 0;
            int i4 = 0;
            for (String str : this.f40249b) {
                if (str != null) {
                    i4++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i2) + (i4 * 1);
        }
        if (this.f40250c != -1) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f40250c);
        }
        if (this.f40251d != -86400000) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f40251d);
        }
        if (this.f40252e != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f40252e);
        }
        if (this.f40253f) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if (this.f40254g) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if (!(this.f40255h == null || this.f40255h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f40255h);
        }
        if (this.f40256i != null && this.f40256i.length > 0) {
            i = 0;
            i2 = 0;
            while (i3 < this.f40256i.length) {
                String str2 = this.f40256i[i3];
                if (str2 != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.m33495b(str2);
                }
                i3++;
            }
            b = (b + i) + (i2 * 1);
        }
        if (!(this.f40257j == null || this.f40257j.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f40257j);
        }
        if (!(this.f40258k == null || this.f40258k.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f40258k);
        }
        if (this.f40259l == null || this.f40259l.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(15, this.f40259l);
    }

    public final /* synthetic */ i m37510a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f40248a == null ? 0 : this.f40248a.length;
                    obj = new C7747e[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40248a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7747e();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7747e();
                    c7213a.m33552a(obj[a]);
                    this.f40248a = obj;
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f40249b == null ? 0 : this.f40249b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40249b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f40249b = obj;
                    continue;
                case 24:
                    this.f40250c = c7213a.m33567i();
                    continue;
                case 32:
                    this.f40251d = c7213a.m33568j();
                    continue;
                case 50:
                    if (this.f40252e == null) {
                        this.f40252e = new C7746d();
                    }
                    c7213a.m33552a(this.f40252e);
                    continue;
                case 56:
                    this.f40253f = c7213a.m33563e();
                    continue;
                case 64:
                    this.f40254g = c7213a.m33563e();
                    continue;
                case 74:
                    this.f40255h = c7213a.m33564f();
                    continue;
                case 82:
                    a2 = C7222l.m33624a(c7213a, 82);
                    a = this.f40256i == null ? 0 : this.f40256i.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40256i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f40256i = obj;
                    continue;
                case 90:
                    this.f40257j = c7213a.m33564f();
                    continue;
                case 114:
                    this.f40258k = c7213a.m33564f();
                    continue;
                case 122:
                    this.f40259l = c7213a.m33564f();
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
