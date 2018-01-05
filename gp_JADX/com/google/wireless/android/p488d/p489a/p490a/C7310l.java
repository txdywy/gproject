package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7310l extends b {
    public static volatile C7310l[] f36281a;
    public boolean f36282b;
    public String f36283c;
    public String f36284d;
    public String f36285e;
    public C7308j[] f36286f;
    public String f36287g;
    public C7306h[] f36288h;

    public static C7310l[] m34563d() {
        if (f36281a == null) {
            synchronized (C7219h.f35465b) {
                if (f36281a == null) {
                    f36281a = new C7310l[0];
                }
            }
        }
        return f36281a;
    }

    public C7310l() {
        this.f36282b = false;
        this.f36283c = "";
        this.f36284d = "";
        this.f36285e = "";
        this.f36286f = C7308j.m34555d();
        this.f36287g = "";
        this.f36288h = C7306h.m34547d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34565a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f36282b) {
            codedOutputByteBufferNano.m33522a(1, this.f36282b);
        }
        if (!(this.f36283c == null || this.f36283c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36283c);
        }
        if (!(this.f36284d == null || this.f36284d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36284d);
        }
        if (!(this.f36285e == null || this.f36285e.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36285e);
        }
        if (this.f36286f != null && this.f36286f.length > 0) {
            for (i iVar : this.f36286f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if (!(this.f36287g == null || this.f36287g.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36287g);
        }
        if (this.f36288h != null && this.f36288h.length > 0) {
            while (i < this.f36288h.length) {
                i iVar2 = this.f36288h[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34566b() {
        int i = 0;
        int b = super.b();
        if (this.f36282b) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (!(this.f36283c == null || this.f36283c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36283c);
        }
        if (!(this.f36284d == null || this.f36284d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36284d);
        }
        if (!(this.f36285e == null || this.f36285e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36285e);
        }
        if (this.f36286f != null && this.f36286f.length > 0) {
            int i2 = b;
            for (i iVar : this.f36286f) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i2;
        }
        if (!(this.f36287g == null || this.f36287g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36287g);
        }
        if (this.f36288h != null && this.f36288h.length > 0) {
            while (i < this.f36288h.length) {
                i iVar2 = this.f36288h[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(7, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m34564a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36282b = c7213a.m33563e();
                    continue;
                case 18:
                    this.f36283c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36284d = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36285e = c7213a.m33564f();
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f36286f == null ? 0 : this.f36286f.length;
                    obj = new C7308j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36286f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7308j();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7308j();
                    c7213a.m33552a(obj[a]);
                    this.f36286f = obj;
                    continue;
                case 50:
                    this.f36287g = c7213a.m33564f();
                    continue;
                case 58:
                    a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f36288h == null ? 0 : this.f36288h.length;
                    obj = new C7306h[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36288h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7306h();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7306h();
                    c7213a.m33552a(obj[a]);
                    this.f36288h = obj;
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
