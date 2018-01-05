package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bv extends b {
    public int f38486a;
    public bw[] f38487b;
    public boolean f38488c;
    public boolean f38489d;
    public String f38490e;
    public String[] f38491f;
    public int[] f38492g;

    public bv() {
        this.f38486a = 0;
        this.f38487b = bw.m36120d();
        this.f38488c = true;
        this.f38489d = false;
        this.f38490e = "";
        this.f38491f = C7222l.f35477j;
        this.f38492g = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36118a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38491f != null && this.f38491f.length > 0) {
            for (String str : this.f38491f) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(1, str);
                }
            }
        }
        if ((this.f38486a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38488c);
        }
        if ((this.f38486a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f38489d);
        }
        if ((this.f38486a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38490e);
        }
        if (this.f38492g != null && this.f38492g.length > 0) {
            for (int a : this.f38492g) {
                codedOutputByteBufferNano.m33518a(7, a);
            }
        }
        if (this.f38487b != null && this.f38487b.length > 0) {
            while (i < this.f38487b.length) {
                i iVar = this.f38487b[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(8, iVar);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36119b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if (this.f38491f == null || this.f38491f.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f38491f) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if ((this.f38486a & 1) != 0) {
            i += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f38486a & 2) != 0) {
            i += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f38486a & 4) != 0) {
            i += CodedOutputByteBufferNano.m33493b(4, this.f38490e);
        }
        if (this.f38492g != null && this.f38492g.length > 0) {
            i3 = 0;
            for (int b2 : this.f38492g) {
                i3 += CodedOutputByteBufferNano.m33498c(b2);
            }
            i = (i + i3) + (this.f38492g.length * 1);
        }
        if (this.f38487b != null && this.f38487b.length > 0) {
            while (i4 < this.f38487b.length) {
                i iVar = this.f38487b[i4];
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(8, iVar);
                }
                i4++;
            }
        }
        return i;
    }

    public final /* synthetic */ i m36117a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = C7222l.m33624a(c7213a, 10);
                    a = this.f38491f == null ? 0 : this.f38491f.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38491f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38491f = obj;
                    continue;
                case 16:
                    this.f38488c = c7213a.m33563e();
                    this.f38486a |= 1;
                    continue;
                case 24:
                    this.f38489d = c7213a.m33563e();
                    this.f38486a |= 2;
                    continue;
                case 34:
                    this.f38490e = c7213a.m33564f();
                    this.f38486a |= 4;
                    continue;
                case 56:
                    a2 = C7222l.m33624a(c7213a, 56);
                    if (this.f38492g == null) {
                        a = 0;
                    } else {
                        a = this.f38492g.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38492g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f38492g = obj;
                    continue;
                case 58:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f38492g == null ? 0 : this.f38492g.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f38492g, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f38492g = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 66:
                    a2 = C7222l.m33624a(c7213a, 66);
                    a = this.f38487b == null ? 0 : this.f38487b.length;
                    obj = new bw[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38487b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bw();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bw();
                    c7213a.m33552a(obj[a]);
                    this.f38487b = obj;
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
