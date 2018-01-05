package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7218g;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7299a extends b {
    public static volatile C7299a[] f36209a;
    public String f36210b;
    public String f36211c;
    public C7308j[] f36212d;
    public String f36213e;
    public String f36214f;
    public int f36215g;
    public String f36216h;
    public C7218g f36217i;
    public C7306h[] f36218j;

    public static C7299a[] m34523d() {
        if (f36209a == null) {
            synchronized (C7219h.f35465b) {
                if (f36209a == null) {
                    f36209a = new C7299a[0];
                }
            }
        }
        return f36209a;
    }

    public C7299a() {
        this.f36210b = "";
        this.f36211c = "";
        this.f36212d = C7308j.m34555d();
        this.f36213e = "";
        this.f36214f = "";
        this.f36215g = 0;
        this.f36216h = "";
        this.f36217i = null;
        this.f36218j = C7306h.m34547d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34525a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f36210b == null || this.f36210b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36210b);
        }
        if (!(this.f36211c == null || this.f36211c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36211c);
        }
        if (this.f36212d != null && this.f36212d.length > 0) {
            for (i iVar : this.f36212d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (!(this.f36213e == null || this.f36213e.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36213e);
        }
        if (!(this.f36214f == null || this.f36214f.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f36214f);
        }
        if (this.f36215g != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f36215g);
        }
        if (!(this.f36216h == null || this.f36216h.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f36216h);
        }
        if (this.f36217i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f36217i);
        }
        if (this.f36218j != null && this.f36218j.length > 0) {
            while (i < this.f36218j.length) {
                i iVar2 = this.f36218j[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(9, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34526b() {
        int i = 0;
        int b = super.b();
        if (!(this.f36210b == null || this.f36210b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36210b);
        }
        if (!(this.f36211c == null || this.f36211c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36211c);
        }
        if (this.f36212d != null && this.f36212d.length > 0) {
            int i2 = b;
            for (i iVar : this.f36212d) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
            b = i2;
        }
        if (!(this.f36213e == null || this.f36213e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36213e);
        }
        if (!(this.f36214f == null || this.f36214f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36214f);
        }
        if (this.f36215g != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f36215g);
        }
        if (!(this.f36216h == null || this.f36216h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36216h);
        }
        if (this.f36217i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f36217i);
        }
        if (this.f36218j != null && this.f36218j.length > 0) {
            while (i < this.f36218j.length) {
                i iVar2 = this.f36218j[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(9, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m34524a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36210b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36211c = c7213a.m33564f();
                    continue;
                case 26:
                    a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f36212d == null ? 0 : this.f36212d.length;
                    obj = new C7308j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36212d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7308j();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7308j();
                    c7213a.m33552a(obj[a]);
                    this.f36212d = obj;
                    continue;
                case 34:
                    this.f36213e = c7213a.m33564f();
                    continue;
                case 42:
                    this.f36214f = c7213a.m33564f();
                    continue;
                case 48:
                    this.f36215g = c7213a.m33567i();
                    continue;
                case 58:
                    this.f36216h = c7213a.m33564f();
                    continue;
                case 66:
                    if (this.f36217i == null) {
                        this.f36217i = new C7218g();
                    }
                    c7213a.m33552a(this.f36217i);
                    continue;
                case 74:
                    a2 = C7222l.m33624a(c7213a, 74);
                    a = this.f36218j == null ? 0 : this.f36218j.length;
                    obj = new C7306h[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36218j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7306h();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7306h();
                    c7213a.m33552a(obj[a]);
                    this.f36218j = obj;
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
