package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.is;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7331m;
import com.google.wireless.android.finsky.p491a.p492a.ax;
import com.google.wireless.android.finsky.p493b.C7345a;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class et extends b {
    public int f38838a;
    public fb f38839b;
    public C7331m f38840c;
    public C7367w[] f38841d;
    public C7345a f38842e;
    public byte[] f38843f;
    public String f38844g;
    public C7540p f38845h;
    public es f38846i;
    public C7535k f38847j;
    public al f38848k;
    public ff f38849l;
    public is f38850m;
    public ax f38851n;

    public et() {
        this.f38838a = 0;
        this.f38839b = null;
        this.f38840c = null;
        this.f38841d = C7367w.m34905d();
        this.f38842e = null;
        this.f38843f = C7222l.f35479l;
        this.f38844g = "";
        this.f38845h = null;
        this.f38846i = null;
        this.f38847j = null;
        this.f38848k = null;
        this.f38849l = null;
        this.f38850m = null;
        this.f38851n = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36365a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38839b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38839b);
        }
        if (this.f38840c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38840c);
        }
        if (this.f38841d != null && this.f38841d.length > 0) {
            for (i iVar : this.f38841d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(3, iVar);
                }
            }
        }
        if (this.f38842e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38842e);
        }
        if ((this.f38838a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(5, this.f38843f);
        }
        if ((this.f38838a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38844g);
        }
        if (this.f38845h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f38845h);
        }
        if (this.f38846i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f38846i);
        }
        if (this.f38847j != null) {
            codedOutputByteBufferNano.m33532b(9, this.f38847j);
        }
        if (this.f38848k != null) {
            codedOutputByteBufferNano.m33532b(10, this.f38848k);
        }
        if (this.f38849l != null) {
            codedOutputByteBufferNano.m33532b(11, this.f38849l);
        }
        if (this.f38850m != null) {
            codedOutputByteBufferNano.m33532b(12, this.f38850m);
        }
        if (this.f38851n != null) {
            codedOutputByteBufferNano.m33532b(13, this.f38851n);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36366b() {
        int b = super.b();
        if (this.f38839b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38839b);
        }
        if (this.f38840c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38840c);
        }
        if (this.f38841d != null && this.f38841d.length > 0) {
            int i = b;
            for (i iVar : this.f38841d) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(3, iVar);
                }
            }
            b = i;
        }
        if (this.f38842e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38842e);
        }
        if ((this.f38838a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(5, this.f38843f);
        }
        if ((this.f38838a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38844g);
        }
        if (this.f38845h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f38845h);
        }
        if (this.f38846i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f38846i);
        }
        if (this.f38847j != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f38847j);
        }
        if (this.f38848k != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f38848k);
        }
        if (this.f38849l != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f38849l);
        }
        if (this.f38850m != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f38850m);
        }
        if (this.f38851n != null) {
            return b + CodedOutputByteBufferNano.m33503d(13, this.f38851n);
        }
        return b;
    }

    public final /* synthetic */ i m36364a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38839b == null) {
                        this.f38839b = new fb();
                    }
                    c7213a.m33552a(this.f38839b);
                    continue;
                case 18:
                    if (this.f38840c == null) {
                        this.f38840c = new C7331m();
                    }
                    c7213a.m33552a(this.f38840c);
                    continue;
                case 26:
                    int a2 = C7222l.m33624a(c7213a, 26);
                    a = this.f38841d == null ? 0 : this.f38841d.length;
                    Object obj = new C7367w[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38841d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7367w();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7367w();
                    c7213a.m33552a(obj[a]);
                    this.f38841d = obj;
                    continue;
                case 34:
                    if (this.f38842e == null) {
                        this.f38842e = new C7345a();
                    }
                    c7213a.m33552a(this.f38842e);
                    continue;
                case 42:
                    this.f38843f = c7213a.m33565g();
                    this.f38838a |= 1;
                    continue;
                case 50:
                    this.f38844g = c7213a.m33564f();
                    this.f38838a |= 2;
                    continue;
                case 58:
                    if (this.f38845h == null) {
                        this.f38845h = new C7540p();
                    }
                    c7213a.m33552a(this.f38845h);
                    continue;
                case 66:
                    if (this.f38846i == null) {
                        this.f38846i = new es();
                    }
                    c7213a.m33552a(this.f38846i);
                    continue;
                case 74:
                    if (this.f38847j == null) {
                        this.f38847j = new C7535k();
                    }
                    c7213a.m33552a(this.f38847j);
                    continue;
                case 82:
                    if (this.f38848k == null) {
                        this.f38848k = new al();
                    }
                    c7213a.m33552a(this.f38848k);
                    continue;
                case 90:
                    if (this.f38849l == null) {
                        this.f38849l = new ff();
                    }
                    c7213a.m33552a(this.f38849l);
                    continue;
                case 98:
                    if (this.f38850m == null) {
                        this.f38850m = new is();
                    }
                    c7213a.m33552a(this.f38850m);
                    continue;
                case 106:
                    if (this.f38851n == null) {
                        this.f38851n = new ax();
                    }
                    c7213a.m33552a(this.f38851n);
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
