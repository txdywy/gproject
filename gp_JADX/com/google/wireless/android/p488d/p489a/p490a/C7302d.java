package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7302d extends b {
    public static volatile C7302d[] f36237a;
    public boolean f36238b;
    public String f36239c;
    public String f36240d;
    public String f36241e;
    public String f36242f;
    public C7308j[] f36243g;
    public String f36244h;
    public int f36245i;

    public static C7302d[] m34533d() {
        if (f36237a == null) {
            synchronized (C7219h.f35465b) {
                if (f36237a == null) {
                    f36237a = new C7302d[0];
                }
            }
        }
        return f36237a;
    }

    public C7302d() {
        this.f36238b = false;
        this.f36239c = "";
        this.f36240d = "";
        this.f36241e = "";
        this.f36242f = "";
        this.f36243g = C7308j.m34555d();
        this.f36244h = "";
        this.f36245i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34535a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36238b) {
            codedOutputByteBufferNano.m33522a(1, this.f36238b);
        }
        if (!(this.f36239c == null || this.f36239c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36239c);
        }
        if (!(this.f36240d == null || this.f36240d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36240d);
        }
        if (!(this.f36241e == null || this.f36241e.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36241e);
        }
        if (!(this.f36242f == null || this.f36242f.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36242f);
        }
        if (this.f36243g != null && this.f36243g.length > 0) {
            for (i iVar : this.f36243g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar);
                }
            }
        }
        if (!(this.f36244h == null || this.f36244h.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36244h);
        }
        if (this.f36245i != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f36245i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34536b() {
        int b = super.b();
        if (this.f36238b) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (!(this.f36239c == null || this.f36239c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36239c);
        }
        if (!(this.f36240d == null || this.f36240d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36240d);
        }
        if (!(this.f36241e == null || this.f36241e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36241e);
        }
        if (!(this.f36242f == null || this.f36242f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36242f);
        }
        if (this.f36243g != null && this.f36243g.length > 0) {
            int i = b;
            for (i iVar : this.f36243g) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(6, iVar);
                }
            }
            b = i;
        }
        if (!(this.f36244h == null || this.f36244h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36244h);
        }
        if (this.f36245i != 0) {
            return b + CodedOutputByteBufferNano.m33502d(8, this.f36245i);
        }
        return b;
    }

    public final /* synthetic */ i m34534a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36238b = c7213a.m33563e();
                    continue;
                case 18:
                    this.f36239c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36240d = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36241e = c7213a.m33564f();
                    continue;
                case 42:
                    this.f36242f = c7213a.m33564f();
                    continue;
                case 50:
                    int a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f36243g == null ? 0 : this.f36243g.length;
                    Object obj = new C7308j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36243g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7308j();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7308j();
                    c7213a.m33552a(obj[a]);
                    this.f36243g = obj;
                    continue;
                case 58:
                    this.f36244h = c7213a.m33564f();
                    continue;
                case 64:
                    this.f36245i = c7213a.m33567i();
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
