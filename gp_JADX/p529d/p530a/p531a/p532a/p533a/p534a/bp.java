package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;

public final class bp extends b {
    public ak f40000a;
    public Long f40001b;
    public String f40002c;
    public bu f40003d;
    public C7698e f40004e;
    public ao f40005f;
    public C7711r f40006g;
    public ba f40007h;
    public as f40008i;
    public C7703j f40009j;
    public C7717x f40010k;
    public ag f40011l;
    public ai f40012m;
    public al f40013n;
    public ah f40014o;
    public bc f40015p;
    public String f40016q;
    public C7710q f40017r;
    public az f40018s;
    public bs[] f40019t;
    public C7694a f40020u;
    public ax f40021v;
    public C7712s f40022w;

    public bp() {
        this.f40000a = null;
        this.f40001b = null;
        this.f40002c = null;
        this.f40003d = null;
        this.f40004e = null;
        this.f40005f = null;
        this.f40006g = null;
        this.f40007h = null;
        this.f40008i = null;
        this.f40009j = null;
        this.f40010k = null;
        this.f40011l = null;
        this.f40012m = null;
        this.f40013n = null;
        this.f40014o = null;
        this.f40015p = null;
        this.f40016q = null;
        this.f40017r = null;
        this.f40018s = null;
        this.f40019t = bs.m37218d();
        this.f40020u = null;
        this.f40021v = null;
        this.f40022w = null;
        this.aP = -1;
    }

    public final void m37208a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f40000a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f40000a);
        }
        if (this.f40001b != null) {
            codedOutputByteBufferNano.m33535c(2, this.f40001b.longValue());
        }
        if (this.f40002c != null) {
            codedOutputByteBufferNano.m33521a(3, this.f40002c);
        }
        if (this.f40003d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f40003d);
        }
        if (this.f40004e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f40004e);
        }
        if (this.f40005f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f40005f);
        }
        if (this.f40006g != null) {
            codedOutputByteBufferNano.m33532b(7, this.f40006g);
        }
        if (this.f40007h != null) {
            codedOutputByteBufferNano.m33532b(8, this.f40007h);
        }
        if (this.f40008i != null) {
            codedOutputByteBufferNano.m33532b(9, this.f40008i);
        }
        if (this.f40009j != null) {
            codedOutputByteBufferNano.m33532b(10, this.f40009j);
        }
        if (this.f40010k != null) {
            codedOutputByteBufferNano.m33532b(11, this.f40010k);
        }
        if (this.f40011l != null) {
            codedOutputByteBufferNano.m33532b(12, this.f40011l);
        }
        if (this.f40012m != null) {
            codedOutputByteBufferNano.m33532b(13, this.f40012m);
        }
        if (this.f40013n != null) {
            codedOutputByteBufferNano.m33532b(14, this.f40013n);
        }
        if (this.f40014o != null) {
            codedOutputByteBufferNano.m33532b(15, this.f40014o);
        }
        if (this.f40015p != null) {
            codedOutputByteBufferNano.m33532b(16, this.f40015p);
        }
        if (this.f40016q != null) {
            codedOutputByteBufferNano.m33521a(17, this.f40016q);
        }
        if (this.f40017r != null) {
            codedOutputByteBufferNano.m33532b(18, this.f40017r);
        }
        if (this.f40018s != null) {
            codedOutputByteBufferNano.m33532b(19, this.f40018s);
        }
        if (this.f40019t != null && this.f40019t.length > 0) {
            for (i iVar : this.f40019t) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(20, iVar);
                }
            }
        }
        if (this.f40020u != null) {
            codedOutputByteBufferNano.m33532b(21, this.f40020u);
        }
        if (this.f40021v != null) {
            codedOutputByteBufferNano.m33532b(22, this.f40021v);
        }
        if (this.f40022w != null) {
            codedOutputByteBufferNano.m33532b(23, this.f40022w);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37209b() {
        int b = super.b();
        if (this.f40000a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f40000a);
        }
        if (this.f40001b != null) {
            this.f40001b.longValue();
            b += CodedOutputByteBufferNano.m33501d(2) + 8;
        }
        if (this.f40002c != null) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f40002c);
        }
        if (this.f40003d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f40003d);
        }
        if (this.f40004e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f40004e);
        }
        if (this.f40005f != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f40005f);
        }
        if (this.f40006g != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f40006g);
        }
        if (this.f40007h != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f40007h);
        }
        if (this.f40008i != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f40008i);
        }
        if (this.f40009j != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f40009j);
        }
        if (this.f40010k != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f40010k);
        }
        if (this.f40011l != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f40011l);
        }
        if (this.f40012m != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f40012m);
        }
        if (this.f40013n != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f40013n);
        }
        if (this.f40014o != null) {
            b += CodedOutputByteBufferNano.m33503d(15, this.f40014o);
        }
        if (this.f40015p != null) {
            b += CodedOutputByteBufferNano.m33503d(16, this.f40015p);
        }
        if (this.f40016q != null) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f40016q);
        }
        if (this.f40017r != null) {
            b += CodedOutputByteBufferNano.m33503d(18, this.f40017r);
        }
        if (this.f40018s != null) {
            b += CodedOutputByteBufferNano.m33503d(19, this.f40018s);
        }
        if (this.f40019t != null && this.f40019t.length > 0) {
            int i = b;
            for (i iVar : this.f40019t) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(20, iVar);
                }
            }
            b = i;
        }
        if (this.f40020u != null) {
            b += CodedOutputByteBufferNano.m33503d(21, this.f40020u);
        }
        if (this.f40021v != null) {
            b += CodedOutputByteBufferNano.m33503d(22, this.f40021v);
        }
        if (this.f40022w != null) {
            return b + CodedOutputByteBufferNano.m33503d(23, this.f40022w);
        }
        return b;
    }

    public final /* synthetic */ i m37207a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f40000a == null) {
                        this.f40000a = new ak();
                    }
                    c7213a.m33552a(this.f40000a);
                    continue;
                case 17:
                    this.f40001b = Long.valueOf(c7213a.m33570l());
                    continue;
                case 26:
                    this.f40002c = c7213a.m33564f();
                    continue;
                case 34:
                    if (this.f40003d == null) {
                        this.f40003d = new bu();
                    }
                    c7213a.m33552a(this.f40003d);
                    continue;
                case 42:
                    if (this.f40004e == null) {
                        this.f40004e = new C7698e();
                    }
                    c7213a.m33552a(this.f40004e);
                    continue;
                case 50:
                    if (this.f40005f == null) {
                        this.f40005f = new ao();
                    }
                    c7213a.m33552a(this.f40005f);
                    continue;
                case 58:
                    if (this.f40006g == null) {
                        this.f40006g = new C7711r();
                    }
                    c7213a.m33552a(this.f40006g);
                    continue;
                case 66:
                    if (this.f40007h == null) {
                        this.f40007h = new ba();
                    }
                    c7213a.m33552a(this.f40007h);
                    continue;
                case 74:
                    if (this.f40008i == null) {
                        this.f40008i = new as();
                    }
                    c7213a.m33552a(this.f40008i);
                    continue;
                case 82:
                    if (this.f40009j == null) {
                        this.f40009j = new C7703j();
                    }
                    c7213a.m33552a(this.f40009j);
                    continue;
                case 90:
                    if (this.f40010k == null) {
                        this.f40010k = new C7717x();
                    }
                    c7213a.m33552a(this.f40010k);
                    continue;
                case 98:
                    if (this.f40011l == null) {
                        this.f40011l = new ag();
                    }
                    c7213a.m33552a(this.f40011l);
                    continue;
                case 106:
                    if (this.f40012m == null) {
                        this.f40012m = new ai();
                    }
                    c7213a.m33552a(this.f40012m);
                    continue;
                case 114:
                    if (this.f40013n == null) {
                        this.f40013n = new al();
                    }
                    c7213a.m33552a(this.f40013n);
                    continue;
                case 122:
                    if (this.f40014o == null) {
                        this.f40014o = new ah();
                    }
                    c7213a.m33552a(this.f40014o);
                    continue;
                case 130:
                    if (this.f40015p == null) {
                        this.f40015p = new bc();
                    }
                    c7213a.m33552a(this.f40015p);
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f40016q = c7213a.m33564f();
                    continue;
                case 146:
                    if (this.f40017r == null) {
                        this.f40017r = new C7710q();
                    }
                    c7213a.m33552a(this.f40017r);
                    continue;
                case 154:
                    if (this.f40018s == null) {
                        this.f40018s = new az();
                    }
                    c7213a.m33552a(this.f40018s);
                    continue;
                case 162:
                    int a2 = C7222l.m33624a(c7213a, 162);
                    a = this.f40019t == null ? 0 : this.f40019t.length;
                    Object obj = new bs[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40019t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bs();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bs();
                    c7213a.m33552a(obj[a]);
                    this.f40019t = obj;
                    continue;
                case 170:
                    if (this.f40020u == null) {
                        this.f40020u = new C7694a();
                    }
                    c7213a.m33552a(this.f40020u);
                    continue;
                case 178:
                    if (this.f40021v == null) {
                        this.f40021v = new ax();
                    }
                    c7213a.m33552a(this.f40021v);
                    continue;
                case 186:
                    if (this.f40022w == null) {
                        this.f40022w = new C7712s();
                    }
                    c7213a.m33552a(this.f40022w);
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
