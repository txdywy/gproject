package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gf extends b {
    public int f39078a;
    public int f39079b;
    public String f39080c;
    public String f39081d;
    public String[] f39082e;
    public gd[] f39083f;
    public boolean f39084g;

    public gf() {
        this.f39078a = 0;
        this.f39079b = 0;
        this.f39080c = "";
        this.f39081d = "";
        this.f39082e = C7222l.f35477j;
        this.f39083f = gd.m36485d();
        this.f39084g = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36494a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f39078a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f39079b);
        }
        if ((this.f39078a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39080c);
        }
        if ((this.f39078a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39081d);
        }
        if (this.f39082e != null && this.f39082e.length > 0) {
            for (String str : this.f39082e) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(4, str);
                }
            }
        }
        if (this.f39083f != null && this.f39083f.length > 0) {
            while (i < this.f39083f.length) {
                i iVar = this.f39083f[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
                i++;
            }
        }
        if ((this.f39078a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f39084g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36495b() {
        int i = 0;
        int b = super.b();
        if ((this.f39078a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f39079b);
        }
        if ((this.f39078a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39080c);
        }
        if ((this.f39078a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39081d);
        }
        if (this.f39082e != null && this.f39082e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f39082e) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f39083f != null && this.f39083f.length > 0) {
            while (i < this.f39083f.length) {
                i iVar = this.f39083f[i];
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
                i++;
            }
        }
        if ((this.f39078a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(6) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36493a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39079b = c7213a.m33567i();
                    this.f39078a |= 1;
                    continue;
                case 18:
                    this.f39080c = c7213a.m33564f();
                    this.f39078a |= 2;
                    continue;
                case 26:
                    this.f39081d = c7213a.m33564f();
                    this.f39078a |= 4;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f39082e == null ? 0 : this.f39082e.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39082e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f39082e = obj;
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f39083f == null ? 0 : this.f39083f.length;
                    obj = new gd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39083f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gd();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new gd();
                    c7213a.m33552a(obj[a]);
                    this.f39083f = obj;
                    continue;
                case 48:
                    this.f39084g = c7213a.m33563e();
                    this.f39078a |= 8;
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
