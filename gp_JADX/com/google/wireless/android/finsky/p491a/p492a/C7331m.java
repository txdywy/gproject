package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;

public final class C7331m extends b {
    public static volatile C7331m[] f36553a;
    public C7327i f36554b;
    public C7329k f36555c;
    public C7328j f36556d;
    public ag f36557e;
    public ae f36558f;
    public C7326h f36559g;
    public af f36560h;
    public C7340v f36561i;
    public C7330l f36562j;
    public C7337s f36563k;
    public ah f36564l;
    public C7335q f36565m;
    public C7332n f36566n;
    public C7333o f36567o;

    public static C7331m[] m34750d() {
        if (f36553a == null) {
            synchronized (C7219h.f35465b) {
                if (f36553a == null) {
                    f36553a = new C7331m[0];
                }
            }
        }
        return f36553a;
    }

    public C7331m() {
        this.f36554b = null;
        this.f36555c = null;
        this.f36556d = null;
        this.f36557e = null;
        this.f36558f = null;
        this.f36559g = null;
        this.f36560h = null;
        this.f36561i = null;
        this.f36562j = null;
        this.f36563k = null;
        this.f36564l = null;
        this.f36565m = null;
        this.f36566n = null;
        this.f36567o = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34752a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36554b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36554b);
        }
        if (this.f36555c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36555c);
        }
        if (this.f36556d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36556d);
        }
        if (this.f36557e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36557e);
        }
        if (this.f36566n != null) {
            codedOutputByteBufferNano.m33532b(6, this.f36566n);
        }
        if (this.f36558f != null) {
            codedOutputByteBufferNano.m33532b(8, this.f36558f);
        }
        if (this.f36567o != null) {
            codedOutputByteBufferNano.m33532b(10, this.f36567o);
        }
        if (this.f36559g != null) {
            codedOutputByteBufferNano.m33532b(11, this.f36559g);
        }
        if (this.f36560h != null) {
            codedOutputByteBufferNano.m33532b(12, this.f36560h);
        }
        if (this.f36561i != null) {
            codedOutputByteBufferNano.m33532b(13, this.f36561i);
        }
        if (this.f36562j != null) {
            codedOutputByteBufferNano.m33532b(14, this.f36562j);
        }
        if (this.f36563k != null) {
            codedOutputByteBufferNano.m33532b(15, this.f36563k);
        }
        if (this.f36564l != null) {
            codedOutputByteBufferNano.m33532b(16, this.f36564l);
        }
        if (this.f36565m != null) {
            codedOutputByteBufferNano.m33532b(17, this.f36565m);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34753b() {
        int b = super.b();
        if (this.f36554b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36554b);
        }
        if (this.f36555c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f36555c);
        }
        if (this.f36556d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f36556d);
        }
        if (this.f36557e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36557e);
        }
        if (this.f36566n != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f36566n);
        }
        if (this.f36558f != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f36558f);
        }
        if (this.f36567o != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f36567o);
        }
        if (this.f36559g != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f36559g);
        }
        if (this.f36560h != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f36560h);
        }
        if (this.f36561i != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f36561i);
        }
        if (this.f36562j != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f36562j);
        }
        if (this.f36563k != null) {
            b += CodedOutputByteBufferNano.m33503d(15, this.f36563k);
        }
        if (this.f36564l != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f36564l);
        }
        if (this.f36565m != null) {
            return b + CodedOutputByteBufferNano.m33503d(17, this.f36565m);
        }
        return b;
    }

    public final /* synthetic */ i m34751a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36554b == null) {
                        this.f36554b = new C7327i();
                    }
                    c7213a.m33552a(this.f36554b);
                    continue;
                case 18:
                    if (this.f36555c == null) {
                        this.f36555c = new C7329k();
                    }
                    c7213a.m33552a(this.f36555c);
                    continue;
                case 34:
                    if (this.f36556d == null) {
                        this.f36556d = new C7328j();
                    }
                    c7213a.m33552a(this.f36556d);
                    continue;
                case 42:
                    if (this.f36557e == null) {
                        this.f36557e = new ag();
                    }
                    c7213a.m33552a(this.f36557e);
                    continue;
                case 50:
                    if (this.f36566n == null) {
                        this.f36566n = new C7332n();
                    }
                    c7213a.m33552a(this.f36566n);
                    continue;
                case 66:
                    if (this.f36558f == null) {
                        this.f36558f = new ae();
                    }
                    c7213a.m33552a(this.f36558f);
                    continue;
                case 82:
                    if (this.f36567o == null) {
                        this.f36567o = new C7333o();
                    }
                    c7213a.m33552a(this.f36567o);
                    continue;
                case 90:
                    if (this.f36559g == null) {
                        this.f36559g = new C7326h();
                    }
                    c7213a.m33552a(this.f36559g);
                    continue;
                case 98:
                    if (this.f36560h == null) {
                        this.f36560h = new af();
                    }
                    c7213a.m33552a(this.f36560h);
                    continue;
                case 106:
                    if (this.f36561i == null) {
                        this.f36561i = new C7340v();
                    }
                    c7213a.m33552a(this.f36561i);
                    continue;
                case 114:
                    if (this.f36562j == null) {
                        this.f36562j = new C7330l();
                    }
                    c7213a.m33552a(this.f36562j);
                    continue;
                case 122:
                    if (this.f36563k == null) {
                        this.f36563k = new C7337s();
                    }
                    c7213a.m33552a(this.f36563k);
                    continue;
                case 130:
                    if (this.f36564l == null) {
                        this.f36564l = new ah();
                    }
                    c7213a.m33552a(this.f36564l);
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    if (this.f36565m == null) {
                        this.f36565m = new C7335q();
                    }
                    c7213a.m33552a(this.f36565m);
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
