package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7300b extends b {
    public String f36219a;
    public String f36220b;
    public String f36221c;
    public String f36222d;
    public String f36223e;
    public C7308j[] f36224f;
    public C7314p[] f36225g;

    public C7300b() {
        this.f36219a = "";
        this.f36220b = "";
        this.f36221c = "";
        this.f36222d = "";
        this.f36223e = "";
        this.f36224f = C7308j.m34555d();
        this.f36225g = C7314p.m34577d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34528a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (!(this.f36220b == null || this.f36220b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36220b);
        }
        if (!(this.f36221c == null || this.f36221c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36221c);
        }
        if (!(this.f36222d == null || this.f36222d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36222d);
        }
        if (!(this.f36223e == null || this.f36223e.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f36223e);
        }
        if (this.f36224f != null && this.f36224f.length > 0) {
            for (i iVar : this.f36224f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if (!(this.f36219a == null || this.f36219a.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f36219a);
        }
        if (this.f36225g != null && this.f36225g.length > 0) {
            while (i < this.f36225g.length) {
                i iVar2 = this.f36225g[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34529b() {
        int i = 0;
        int b = super.b();
        if (!(this.f36220b == null || this.f36220b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36220b);
        }
        if (!(this.f36221c == null || this.f36221c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36221c);
        }
        if (!(this.f36222d == null || this.f36222d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36222d);
        }
        if (!(this.f36223e == null || this.f36223e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36223e);
        }
        if (this.f36224f != null && this.f36224f.length > 0) {
            int i2 = b;
            for (i iVar : this.f36224f) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i2;
        }
        if (!(this.f36219a == null || this.f36219a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36219a);
        }
        if (this.f36225g != null && this.f36225g.length > 0) {
            while (i < this.f36225g.length) {
                i iVar2 = this.f36225g[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(7, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m34527a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36220b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36221c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36222d = c7213a.m33564f();
                    continue;
                case 34:
                    this.f36223e = c7213a.m33564f();
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f36224f == null ? 0 : this.f36224f.length;
                    obj = new C7308j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36224f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7308j();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7308j();
                    c7213a.m33552a(obj[a]);
                    this.f36224f = obj;
                    continue;
                case 50:
                    this.f36219a = c7213a.m33564f();
                    continue;
                case 58:
                    a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f36225g == null ? 0 : this.f36225g.length;
                    obj = new C7314p[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36225g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7314p();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7314p();
                    c7213a.m33552a(obj[a]);
                    this.f36225g = obj;
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
