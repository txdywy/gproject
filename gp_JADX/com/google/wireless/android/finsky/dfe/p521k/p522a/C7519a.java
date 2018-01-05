package com.google.wireless.android.finsky.dfe.p521k.p522a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7519a extends b {
    public int f38246a;
    public bd f38247b;
    public bd f38248c;
    public String f38249d;
    public String f38250e;
    public String f38251f;
    public C7520b[] f38252g;
    public String f38253h;
    public String f38254i;
    public String f38255j;
    public C7521c f38256k;
    public boolean f38257l;
    public boolean f38258m;

    public C7519a() {
        this.f38246a = 0;
        this.f38247b = null;
        this.f38248c = null;
        this.f38249d = "";
        this.f38250e = "";
        this.f38251f = "";
        this.f38252g = C7520b.m35944d();
        this.f38253h = "";
        this.f38254i = "";
        this.f38255j = "";
        this.f38256k = null;
        this.f38257l = false;
        this.f38258m = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35942a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38247b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38247b);
        }
        if (this.f38248c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38248c);
        }
        if ((this.f38246a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38249d);
        }
        if ((this.f38246a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38250e);
        }
        if ((this.f38246a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38251f);
        }
        if (this.f38252g != null && this.f38252g.length > 0) {
            for (i iVar : this.f38252g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar);
                }
            }
        }
        if ((this.f38246a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38253h);
        }
        if ((this.f38246a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38254i);
        }
        if ((this.f38246a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38255j);
        }
        if (this.f38256k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38256k);
        }
        if ((this.f38246a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f38257l);
        }
        if ((this.f38246a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f38258m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35943b() {
        int b = super.b();
        if (this.f38247b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38247b);
        }
        if (this.f38248c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38248c);
        }
        if ((this.f38246a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38249d);
        }
        if ((this.f38246a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38250e);
        }
        if ((this.f38246a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38251f);
        }
        if (this.f38252g != null && this.f38252g.length > 0) {
            int i = b;
            for (i iVar : this.f38252g) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(6, iVar);
                }
            }
            b = i;
        }
        if ((this.f38246a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f38253h);
        }
        if ((this.f38246a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f38254i);
        }
        if ((this.f38246a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38255j);
        }
        if (this.f38256k != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f38256k);
        }
        if ((this.f38246a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f38246a & 128) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(12) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35941a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38247b == null) {
                        this.f38247b = new bd();
                    }
                    c7213a.m33552a(this.f38247b);
                    continue;
                case 18:
                    if (this.f38248c == null) {
                        this.f38248c = new bd();
                    }
                    c7213a.m33552a(this.f38248c);
                    continue;
                case 26:
                    this.f38249d = c7213a.m33564f();
                    this.f38246a |= 1;
                    continue;
                case 34:
                    this.f38250e = c7213a.m33564f();
                    this.f38246a |= 2;
                    continue;
                case 42:
                    this.f38251f = c7213a.m33564f();
                    this.f38246a |= 4;
                    continue;
                case 50:
                    int a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f38252g == null ? 0 : this.f38252g.length;
                    Object obj = new C7520b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38252g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7520b();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7520b();
                    c7213a.m33552a(obj[a]);
                    this.f38252g = obj;
                    continue;
                case 58:
                    this.f38253h = c7213a.m33564f();
                    this.f38246a |= 8;
                    continue;
                case 66:
                    this.f38254i = c7213a.m33564f();
                    this.f38246a |= 16;
                    continue;
                case 74:
                    this.f38255j = c7213a.m33564f();
                    this.f38246a |= 32;
                    continue;
                case 82:
                    if (this.f38256k == null) {
                        this.f38256k = new C7521c();
                    }
                    c7213a.m33552a(this.f38256k);
                    continue;
                case 88:
                    this.f38257l = c7213a.m33563e();
                    this.f38246a |= 64;
                    continue;
                case 96:
                    this.f38258m = c7213a.m33563e();
                    this.f38246a |= 128;
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
