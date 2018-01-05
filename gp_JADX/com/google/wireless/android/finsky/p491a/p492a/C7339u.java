package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7339u extends b {
    public int f36596a;
    public String f36597b;
    public String f36598c;
    public String f36599d;
    public String f36600e;
    public String f36601f;
    public String[] f36602g;
    public String f36603h;
    public String f36604i;
    public String f36605j;

    public C7339u() {
        this.f36596a = 0;
        this.f36597b = "";
        this.f36598c = "";
        this.f36599d = "";
        this.f36600e = "";
        this.f36601f = "";
        this.f36602g = C7222l.f35477j;
        this.f36603h = "";
        this.f36604i = "";
        this.f36605j = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34777a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36596a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36597b);
        }
        if ((this.f36596a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36598c);
        }
        if ((this.f36596a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36599d);
        }
        if ((this.f36596a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36600e);
        }
        if ((this.f36596a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36601f);
        }
        if (this.f36602g != null && this.f36602g.length > 0) {
            for (String str : this.f36602g) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(6, str);
                }
            }
        }
        if ((this.f36596a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36603h);
        }
        if ((this.f36596a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36604i);
        }
        if ((this.f36596a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f36605j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34778b() {
        int i = 0;
        int b = super.b();
        if ((this.f36596a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36597b);
        }
        if ((this.f36596a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36598c);
        }
        if ((this.f36596a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36599d);
        }
        if ((this.f36596a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36600e);
        }
        if ((this.f36596a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36601f);
        }
        if (this.f36602g != null && this.f36602g.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f36602g.length) {
                String str = this.f36602g[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if ((this.f36596a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36603h);
        }
        if ((this.f36596a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36604i);
        }
        if ((this.f36596a & 128) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(9, this.f36605j);
        }
        return b;
    }

    public final /* synthetic */ i m34776a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36597b = c7213a.m33564f();
                    this.f36596a |= 1;
                    continue;
                case 18:
                    this.f36598c = c7213a.m33564f();
                    this.f36596a |= 2;
                    continue;
                case 26:
                    this.f36599d = c7213a.m33564f();
                    this.f36596a |= 4;
                    continue;
                case 34:
                    this.f36600e = c7213a.m33564f();
                    this.f36596a |= 8;
                    continue;
                case 42:
                    this.f36601f = c7213a.m33564f();
                    this.f36596a |= 16;
                    continue;
                case 50:
                    int a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f36602g == null ? 0 : this.f36602g.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36602g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36602g = obj;
                    continue;
                case 58:
                    this.f36603h = c7213a.m33564f();
                    this.f36596a |= 32;
                    continue;
                case 66:
                    this.f36604i = c7213a.m33564f();
                    this.f36596a |= 64;
                    continue;
                case 74:
                    this.f36605j = c7213a.m33564f();
                    this.f36596a |= 128;
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
