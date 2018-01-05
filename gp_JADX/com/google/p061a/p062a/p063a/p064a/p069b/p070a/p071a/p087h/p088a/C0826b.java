package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p087h.p088a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0818o;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0863a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.HprofParser;

public final class C0826b extends C0758b {
    public C0811h f5226a;
    public String f5227b;
    public String f5228c;
    public String f5229d;
    public String f5230e;
    public String f5231f;
    public int f5232g;
    public boolean f5233h;
    public String[] f5234i;
    public String f5235j;
    public String f5236k;
    public String f5237l;
    public String f5238m;
    public String f5239n;
    public C0827c[] f5240o;
    public C0818o f5241p;
    public C0828d f5242q;
    public String f5243r;
    public String[] f5244s;
    public C0863a f5245t;
    public boolean f5246u;

    public static int m5214a(int i) {
        switch (i) {
            case 0:
            case 2:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum DisplayType");
        }
    }

    public C0826b() {
        this.f5226a = null;
        this.f5227b = "";
        this.f5228c = "";
        this.f5229d = "";
        this.f5230e = "";
        this.f5231f = "";
        this.f5232g = 0;
        this.f5233h = false;
        this.f5234i = l.j;
        this.f5235j = "";
        this.f5236k = "";
        this.f5237l = "";
        this.f5238m = "";
        this.f5239n = "";
        this.f5240o = C0827c.m5219a();
        this.f5241p = null;
        this.f5242q = null;
        this.f5243r = "";
        this.f5244s = l.j;
        this.f5245t = null;
        this.f5246u = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5226a != null) {
            codedOutputByteBufferNano.b(1, this.f5226a);
        }
        if (!(this.f5227b == null || this.f5227b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5227b);
        }
        if (!(this.f5228c == null || this.f5228c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5228c);
        }
        if (!(this.f5230e == null || this.f5230e.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5230e);
        }
        if (!(this.f5231f == null || this.f5231f.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5231f);
        }
        if (this.f5232g != 0) {
            codedOutputByteBufferNano.a(7, this.f5232g);
        }
        if (this.f5233h) {
            codedOutputByteBufferNano.a(8, this.f5233h);
        }
        if (this.f5234i != null && this.f5234i.length > 0) {
            for (String str : this.f5234i) {
                if (str != null) {
                    codedOutputByteBufferNano.a(9, str);
                }
            }
        }
        if (!(this.f5235j == null || this.f5235j.equals(""))) {
            codedOutputByteBufferNano.a(10, this.f5235j);
        }
        if (!(this.f5236k == null || this.f5236k.equals(""))) {
            codedOutputByteBufferNano.a(13, this.f5236k);
        }
        if (!(this.f5237l == null || this.f5237l.equals(""))) {
            codedOutputByteBufferNano.a(14, this.f5237l);
        }
        if (!(this.f5238m == null || this.f5238m.equals(""))) {
            codedOutputByteBufferNano.a(15, this.f5238m);
        }
        if (this.f5240o != null && this.f5240o.length > 0) {
            for (C0757i c0757i : this.f5240o) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(16, c0757i);
                }
            }
        }
        if (!(this.f5229d == null || this.f5229d.equals(""))) {
            codedOutputByteBufferNano.a(17, this.f5229d);
        }
        if (!(this.f5239n == null || this.f5239n.equals(""))) {
            codedOutputByteBufferNano.a(18, this.f5239n);
        }
        if (this.f5241p != null) {
            codedOutputByteBufferNano.b(20, this.f5241p);
        }
        if (this.f5242q != null) {
            codedOutputByteBufferNano.b(21, this.f5242q);
        }
        if (!(this.f5243r == null || this.f5243r.equals(""))) {
            codedOutputByteBufferNano.a(22, this.f5243r);
        }
        if (this.f5244s != null && this.f5244s.length > 0) {
            while (i < this.f5244s.length) {
                String str2 = this.f5244s[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(23, str2);
                }
                i++;
            }
        }
        if (this.f5245t != null) {
            codedOutputByteBufferNano.b(24, this.f5245t);
        }
        if (this.f5246u) {
            codedOutputByteBufferNano.a(25, this.f5246u);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if (this.f5226a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5226a);
        }
        if (!(this.f5227b == null || this.f5227b.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5227b);
        }
        if (!(this.f5228c == null || this.f5228c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5228c);
        }
        if (!(this.f5230e == null || this.f5230e.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5230e);
        }
        if (!(this.f5231f == null || this.f5231f.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f5231f);
        }
        if (this.f5232g != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f5232g);
        }
        if (this.f5233h) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if (this.f5234i != null && this.f5234i.length > 0) {
            i = 0;
            int i4 = 0;
            for (String str : this.f5234i) {
                if (str != null) {
                    i4++;
                    i += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i) + (i4 * 1);
        }
        if (!(this.f5235j == null || this.f5235j.equals(""))) {
            b += CodedOutputByteBufferNano.b(10, this.f5235j);
        }
        if (!(this.f5236k == null || this.f5236k.equals(""))) {
            b += CodedOutputByteBufferNano.b(13, this.f5236k);
        }
        if (!(this.f5237l == null || this.f5237l.equals(""))) {
            b += CodedOutputByteBufferNano.b(14, this.f5237l);
        }
        if (!(this.f5238m == null || this.f5238m.equals(""))) {
            b += CodedOutputByteBufferNano.b(15, this.f5238m);
        }
        if (this.f5240o != null && this.f5240o.length > 0) {
            i2 = b;
            for (C0757i c0757i : this.f5240o) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(16, c0757i);
                }
            }
            b = i2;
        }
        if (!(this.f5229d == null || this.f5229d.equals(""))) {
            b += CodedOutputByteBufferNano.b(17, this.f5229d);
        }
        if (!(this.f5239n == null || this.f5239n.equals(""))) {
            b += CodedOutputByteBufferNano.b(18, this.f5239n);
        }
        if (this.f5241p != null) {
            b += CodedOutputByteBufferNano.d(20, this.f5241p);
        }
        if (this.f5242q != null) {
            b += CodedOutputByteBufferNano.d(21, this.f5242q);
        }
        if (!(this.f5243r == null || this.f5243r.equals(""))) {
            b += CodedOutputByteBufferNano.b(22, this.f5243r);
        }
        if (this.f5244s != null && this.f5244s.length > 0) {
            i2 = 0;
            i = 0;
            while (i3 < this.f5244s.length) {
                String str2 = this.f5244s[i3];
                if (str2 != null) {
                    i++;
                    i2 += CodedOutputByteBufferNano.b(str2);
                }
                i3++;
            }
            b = (b + i2) + (i * 2);
        }
        if (this.f5245t != null) {
            b += CodedOutputByteBufferNano.d(24, this.f5245t);
        }
        if (this.f5246u) {
            return b + (CodedOutputByteBufferNano.d(25) + 1);
        }
        return b;
    }

    private final C0826b m5215b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5226a == null) {
                        this.f5226a = new C0811h();
                    }
                    aVar.a(this.f5226a);
                    continue;
                case 18:
                    this.f5227b = aVar.f();
                    continue;
                case 26:
                    this.f5228c = aVar.f();
                    continue;
                case 34:
                    this.f5230e = aVar.f();
                    continue;
                case 42:
                    this.f5231f = aVar.f();
                    continue;
                case 56:
                    o = aVar.o();
                    try {
                        this.f5232g = C0826b.m5214a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 64:
                    this.f5233h = aVar.e();
                    continue;
                case 74:
                    o = l.a(aVar, 74);
                    a = this.f5234i == null ? 0 : this.f5234i.length;
                    obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5234i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f5234i = obj;
                    continue;
                case 82:
                    this.f5235j = aVar.f();
                    continue;
                case 106:
                    this.f5236k = aVar.f();
                    continue;
                case 114:
                    this.f5237l = aVar.f();
                    continue;
                case 122:
                    this.f5238m = aVar.f();
                    continue;
                case 130:
                    o = l.a(aVar, 130);
                    a = this.f5240o == null ? 0 : this.f5240o.length;
                    obj = new C0827c[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5240o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0827c();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0827c();
                    aVar.a(obj[a]);
                    this.f5240o = obj;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f5229d = aVar.f();
                    continue;
                case 146:
                    this.f5239n = aVar.f();
                    continue;
                case 162:
                    if (this.f5241p == null) {
                        this.f5241p = new C0818o();
                    }
                    aVar.a(this.f5241p);
                    continue;
                case 170:
                    if (this.f5242q == null) {
                        this.f5242q = new C0828d();
                    }
                    aVar.a(this.f5242q);
                    continue;
                case 178:
                    this.f5243r = aVar.f();
                    continue;
                case 186:
                    o = l.a(aVar, 186);
                    a = this.f5244s == null ? 0 : this.f5244s.length;
                    obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5244s, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f5244s = obj;
                    continue;
                case 194:
                    if (this.f5245t == null) {
                        this.f5245t = new C0863a();
                    }
                    aVar.a(this.f5245t);
                    continue;
                case 200:
                    this.f5246u = aVar.e();
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5215b(aVar);
    }
}
