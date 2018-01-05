package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7331m;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class fa extends b {
    public int f38882a;
    public fb f38883b;
    public C7331m f38884c;
    public er f38885d;
    public eq f38886e;
    public C7367w[] f38887f;
    public byte[] f38888g;
    public fe[] f38889h;
    public long f38890i;
    public boolean f38891j;

    public fa() {
        this.f38882a = 0;
        this.f38883b = null;
        this.f38884c = null;
        this.f38885d = null;
        this.f38886e = null;
        this.f38887f = C7367w.m34905d();
        this.f38888g = C7222l.f35479l;
        this.f38889h = fe.m36406d();
        this.f38890i = 0;
        this.f38891j = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36394a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f38883b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38883b);
        }
        if (this.f38884c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38884c);
        }
        if (this.f38885d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38885d);
        }
        if (this.f38887f != null && this.f38887f.length > 0) {
            for (i iVar : this.f38887f) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if ((this.f38882a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(5, this.f38888g);
        }
        if (this.f38886e != null) {
            codedOutputByteBufferNano.m33532b(8, this.f38886e);
        }
        if (this.f38889h != null && this.f38889h.length > 0) {
            while (i < this.f38889h.length) {
                i iVar2 = this.f38889h[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(9, iVar2);
                }
                i++;
            }
        }
        if ((this.f38882a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(10, this.f38890i);
        }
        if ((this.f38882a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f38891j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36395b() {
        int i = 0;
        int b = super.b();
        if (this.f38883b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38883b);
        }
        if (this.f38884c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38884c);
        }
        if (this.f38885d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38885d);
        }
        if (this.f38887f != null && this.f38887f.length > 0) {
            int i2 = b;
            for (i iVar : this.f38887f) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i2;
        }
        if ((this.f38882a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(5, this.f38888g);
        }
        if (this.f38886e != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f38886e);
        }
        if (this.f38889h != null && this.f38889h.length > 0) {
            while (i < this.f38889h.length) {
                i iVar2 = this.f38889h[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(9, iVar2);
                }
                i++;
            }
        }
        if ((this.f38882a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(10, this.f38890i);
        }
        if ((this.f38882a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(11) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36393a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38883b == null) {
                        this.f38883b = new fb();
                    }
                    c7213a.m33552a(this.f38883b);
                    continue;
                case 18:
                    if (this.f38884c == null) {
                        this.f38884c = new C7331m();
                    }
                    c7213a.m33552a(this.f38884c);
                    continue;
                case 26:
                    if (this.f38885d == null) {
                        this.f38885d = new er();
                    }
                    c7213a.m33552a(this.f38885d);
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f38887f == null ? 0 : this.f38887f.length;
                    obj = new C7367w[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38887f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7367w();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7367w();
                    c7213a.m33552a(obj[a]);
                    this.f38887f = obj;
                    continue;
                case 42:
                    this.f38888g = c7213a.m33565g();
                    this.f38882a |= 1;
                    continue;
                case 66:
                    if (this.f38886e == null) {
                        this.f38886e = new eq();
                    }
                    c7213a.m33552a(this.f38886e);
                    continue;
                case 74:
                    a2 = C7222l.m33624a(c7213a, 74);
                    a = this.f38889h == null ? 0 : this.f38889h.length;
                    obj = new fe[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38889h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new fe();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new fe();
                    c7213a.m33552a(obj[a]);
                    this.f38889h = obj;
                    continue;
                case 80:
                    this.f38890i = c7213a.m33568j();
                    this.f38882a |= 2;
                    continue;
                case 88:
                    this.f38891j = c7213a.m33563e();
                    this.f38882a |= 4;
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
