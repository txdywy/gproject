package com.google.p440g.p441a.p442a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7214c;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;

public final class C7147b extends b {
    public String f34899a;
    public String f34900b;
    public boolean f34901c;
    public String f34902d;
    public String f34903e;
    public String f34904f;
    public String f34905g;
    public String f34906h;
    public String f34907i;
    public String f34908j;
    public String f34909k;
    public String f34910l;
    public String f34911m;
    public String f34912n;
    public String f34913o;
    public String f34914p;
    public String f34915q;
    public String[] f34916r;
    public String f34917s;
    public String f34918t;

    public C7147b() {
        this.f34899a = "";
        this.f34900b = "";
        this.f34901c = false;
        this.f34902d = "";
        this.f34903e = "";
        this.f34904f = "";
        this.f34905g = "";
        this.f34906h = "";
        this.f34907i = "";
        this.f34908j = "";
        this.f34909k = "";
        this.f34910l = "";
        this.f34911m = "";
        this.f34912n = "";
        this.f34913o = "";
        this.f34914p = "";
        this.f34915q = "";
        this.f34916r = C7222l.f35477j;
        this.f34917s = "";
        this.f34918t = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m32420a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34899a == null || this.f34899a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34899a);
        }
        if (!(this.f34900b == null || this.f34900b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34900b);
        }
        if (!(this.f34903e == null || this.f34903e.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f34903e);
        }
        if (!(this.f34904f == null || this.f34904f.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f34904f);
        }
        if (!(this.f34905g == null || this.f34905g.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f34905g);
        }
        if (!(this.f34907i == null || this.f34907i.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f34907i);
        }
        if (!(this.f34908j == null || this.f34908j.equals(""))) {
            codedOutputByteBufferNano.m33521a(11, this.f34908j);
        }
        if (!(this.f34910l == null || this.f34910l.equals(""))) {
            codedOutputByteBufferNano.m33521a(12, this.f34910l);
        }
        if (!(this.f34911m == null || this.f34911m.equals(""))) {
            codedOutputByteBufferNano.m33521a(13, this.f34911m);
        }
        if (this.f34916r != null && this.f34916r.length > 0) {
            for (String str : this.f34916r) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(14, str);
                }
            }
        }
        if (!(this.f34914p == null || this.f34914p.equals(""))) {
            codedOutputByteBufferNano.m33521a(15, this.f34914p);
        }
        if (!(this.f34915q == null || this.f34915q.equals(""))) {
            codedOutputByteBufferNano.m33521a(16, this.f34915q);
        }
        if (!(this.f34906h == null || this.f34906h.equals(""))) {
            codedOutputByteBufferNano.m33521a(17, this.f34906h);
        }
        if (!(this.f34909k == null || this.f34909k.equals(""))) {
            codedOutputByteBufferNano.m33521a(21, this.f34909k);
        }
        if (!(this.f34902d == null || this.f34902d.equals(""))) {
            codedOutputByteBufferNano.m33521a(26, this.f34902d);
        }
        if (!(this.f34917s == null || this.f34917s.equals(""))) {
            codedOutputByteBufferNano.m33521a(27, this.f34917s);
        }
        if (!(this.f34918t == null || this.f34918t.equals(""))) {
            codedOutputByteBufferNano.m33521a(28, this.f34918t);
        }
        if (!(this.f34912n == null || this.f34912n.equals(""))) {
            codedOutputByteBufferNano.m33521a(29, this.f34912n);
        }
        if (!(this.f34913o == null || this.f34913o.equals(""))) {
            codedOutputByteBufferNano.m33521a(30, this.f34913o);
        }
        if (this.f34901c) {
            codedOutputByteBufferNano.m33522a(31, this.f34901c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32421b() {
        int i = 0;
        int b = super.b();
        if (!(this.f34899a == null || this.f34899a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34899a);
        }
        if (!(this.f34900b == null || this.f34900b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34900b);
        }
        if (!(this.f34903e == null || this.f34903e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f34903e);
        }
        if (!(this.f34904f == null || this.f34904f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f34904f);
        }
        if (!(this.f34905g == null || this.f34905g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f34905g);
        }
        if (!(this.f34907i == null || this.f34907i.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f34907i);
        }
        if (!(this.f34908j == null || this.f34908j.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f34908j);
        }
        if (!(this.f34910l == null || this.f34910l.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(12, this.f34910l);
        }
        if (!(this.f34911m == null || this.f34911m.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f34911m);
        }
        if (this.f34916r != null && this.f34916r.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f34916r.length) {
                String str = this.f34916r[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (!(this.f34914p == null || this.f34914p.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(15, this.f34914p);
        }
        if (!(this.f34915q == null || this.f34915q.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f34915q);
        }
        if (!(this.f34906h == null || this.f34906h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f34906h);
        }
        if (!(this.f34909k == null || this.f34909k.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(21, this.f34909k);
        }
        if (!(this.f34902d == null || this.f34902d.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(26, this.f34902d);
        }
        if (!(this.f34917s == null || this.f34917s.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(27, this.f34917s);
        }
        if (!(this.f34918t == null || this.f34918t.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(28, this.f34918t);
        }
        if (!(this.f34912n == null || this.f34912n.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(29, this.f34912n);
        }
        if (!(this.f34913o == null || this.f34913o.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(30, this.f34913o);
        }
        if (this.f34901c) {
            return b + (CodedOutputByteBufferNano.m33501d(31) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m32419a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34899a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f34900b = c7213a.m33564f();
                    continue;
                case 26:
                    this.f34903e = c7213a.m33564f();
                    continue;
                case 34:
                    this.f34904f = c7213a.m33564f();
                    continue;
                case 42:
                    this.f34905g = c7213a.m33564f();
                    continue;
                case 50:
                    this.f34907i = c7213a.m33564f();
                    continue;
                case 90:
                    this.f34908j = c7213a.m33564f();
                    continue;
                case 98:
                    this.f34910l = c7213a.m33564f();
                    continue;
                case 106:
                    this.f34911m = c7213a.m33564f();
                    continue;
                case 114:
                    int a2 = C7222l.m33624a(c7213a, 114);
                    a = this.f34916r == null ? 0 : this.f34916r.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34916r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f34916r = obj;
                    continue;
                case 122:
                    this.f34914p = c7213a.m33564f();
                    continue;
                case 130:
                    this.f34915q = c7213a.m33564f();
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f34906h = c7213a.m33564f();
                    continue;
                case 170:
                    this.f34909k = c7213a.m33564f();
                    continue;
                case 210:
                    this.f34902d = c7213a.m33564f();
                    continue;
                case 218:
                    this.f34917s = c7213a.m33564f();
                    continue;
                case 226:
                    this.f34918t = c7213a.m33564f();
                    continue;
                case 234:
                    this.f34912n = c7213a.m33564f();
                    continue;
                case 242:
                    this.f34913o = c7213a.m33564f();
                    continue;
                case 248:
                    this.f34901c = c7213a.m33563e();
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

    static {
        C7214c.m33574a(C7147b.class, 28116890);
    }
}
