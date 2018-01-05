package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.h.c.c.b.c.a.c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p072a.p073a.C0765a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0769b;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0771d;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.aa;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0810g;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p085g.p086a.C0824a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p093k.p094a.C0836a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0847k;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0864b;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0874d extends C0758b {
    public int f5560a;
    public String f5561b;
    public C0824a f5562c;
    public c f5563d;
    public ad f5564e;
    public ae f5565f;
    public C0810g[] f5566g;
    public String f5567h;
    public long f5568i;
    public boolean f5569j;
    public long f5570k;
    public String f5571l;
    public String f5572m;
    public C0864b[] f5573n;
    public boolean f5574o;
    public C0847k f5575p;
    public C0765a f5576q;
    public C0771d f5577r;
    public aa f5578s;
    public C0769b f5579t;
    public C0836a f5580u;

    public final C0765a m5482a() {
        if (this.f5560a == 0) {
            return this.f5576q;
        }
        return null;
    }

    public final C0771d m5486c() {
        if (this.f5560a == 1) {
            return this.f5577r;
        }
        return null;
    }

    public final aa m5487d() {
        if (this.f5560a == 2) {
            return this.f5578s;
        }
        return null;
    }

    public C0874d() {
        this.f5560a = -1;
        this.f5561b = "";
        this.f5562c = null;
        this.f5563d = null;
        this.f5564e = null;
        this.f5565f = null;
        this.f5566g = C0810g.m5143a();
        this.f5567h = "";
        this.f5568i = 0;
        this.f5569j = false;
        this.f5570k = 0;
        this.f5571l = "";
        this.f5572m = "";
        this.f5573n = C0864b.m5446a();
        this.f5574o = false;
        this.f5575p = null;
        this.f5560a = -1;
        this.f5576q = null;
        this.f5560a = -1;
        this.f5577r = null;
        this.f5560a = -1;
        this.f5578s = null;
        this.f5560a = -1;
        this.f5579t = null;
        this.f5580u = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5560a == 0) {
            codedOutputByteBufferNano.b(1, this.f5576q);
        }
        if (this.f5560a == 1) {
            codedOutputByteBufferNano.b(2, this.f5577r);
        }
        if (this.f5560a == 2) {
            codedOutputByteBufferNano.b(3, this.f5578s);
        }
        if (!(this.f5561b == null || this.f5561b.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5561b);
        }
        if (this.f5573n != null && this.f5573n.length > 0) {
            for (C0757i c0757i : this.f5573n) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(8, c0757i);
                }
            }
        }
        if (!(this.f5571l == null || this.f5571l.equals(""))) {
            codedOutputByteBufferNano.a(9, this.f5571l);
        }
        if (this.f5565f != null) {
            codedOutputByteBufferNano.b(10, this.f5565f);
        }
        if (this.f5564e != null) {
            codedOutputByteBufferNano.b(11, this.f5564e);
        }
        if (!(this.f5572m == null || this.f5572m.equals(""))) {
            codedOutputByteBufferNano.a(12, this.f5572m);
        }
        if (this.f5574o) {
            codedOutputByteBufferNano.a(13, this.f5574o);
        }
        if (this.f5566g != null && this.f5566g.length > 0) {
            while (i < this.f5566g.length) {
                C0757i c0757i2 = this.f5566g[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(14, c0757i2);
                }
                i++;
            }
        }
        if (this.f5575p != null) {
            codedOutputByteBufferNano.b(15, this.f5575p);
        }
        if (this.f5563d != null) {
            codedOutputByteBufferNano.b(16, this.f5563d);
        }
        if (!(this.f5567h == null || this.f5567h.equals(""))) {
            codedOutputByteBufferNano.a(18, this.f5567h);
        }
        if (this.f5568i != 0) {
            codedOutputByteBufferNano.b(19, this.f5568i);
        }
        if (this.f5570k != 0) {
            codedOutputByteBufferNano.b(20, this.f5570k);
        }
        if (this.f5560a == 3) {
            codedOutputByteBufferNano.b(21, this.f5579t);
        }
        if (this.f5569j) {
            codedOutputByteBufferNano.a(23, this.f5569j);
        }
        if (this.f5562c != null) {
            codedOutputByteBufferNano.b(24, this.f5562c);
        }
        if (this.f5580u != null) {
            codedOutputByteBufferNano.b(25, this.f5580u);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5560a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5576q);
        }
        if (this.f5560a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f5577r);
        }
        if (this.f5560a == 2) {
            b += CodedOutputByteBufferNano.d(3, this.f5578s);
        }
        if (!(this.f5561b == null || this.f5561b.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5561b);
        }
        if (this.f5573n != null && this.f5573n.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f5573n) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(8, c0757i);
                }
            }
            b = i2;
        }
        if (!(this.f5571l == null || this.f5571l.equals(""))) {
            b += CodedOutputByteBufferNano.b(9, this.f5571l);
        }
        if (this.f5565f != null) {
            b += CodedOutputByteBufferNano.d(10, this.f5565f);
        }
        if (this.f5564e != null) {
            b += CodedOutputByteBufferNano.d(11, this.f5564e);
        }
        if (!(this.f5572m == null || this.f5572m.equals(""))) {
            b += CodedOutputByteBufferNano.b(12, this.f5572m);
        }
        if (this.f5574o) {
            b += CodedOutputByteBufferNano.d(13) + 1;
        }
        if (this.f5566g != null && this.f5566g.length > 0) {
            while (i < this.f5566g.length) {
                C0757i c0757i2 = this.f5566g[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(14, c0757i2);
                }
                i++;
            }
        }
        if (this.f5575p != null) {
            b += CodedOutputByteBufferNano.d(15, this.f5575p);
        }
        if (this.f5563d != null) {
            b += CodedOutputByteBufferNano.d(16, this.f5563d);
        }
        if (!(this.f5567h == null || this.f5567h.equals(""))) {
            b += CodedOutputByteBufferNano.b(18, this.f5567h);
        }
        if (this.f5568i != 0) {
            b += CodedOutputByteBufferNano.f(19, this.f5568i);
        }
        if (this.f5570k != 0) {
            b += CodedOutputByteBufferNano.f(20, this.f5570k);
        }
        if (this.f5560a == 3) {
            b += CodedOutputByteBufferNano.d(21, this.f5579t);
        }
        if (this.f5569j) {
            b += CodedOutputByteBufferNano.d(23) + 1;
        }
        if (this.f5562c != null) {
            b += CodedOutputByteBufferNano.d(24, this.f5562c);
        }
        if (this.f5580u != null) {
            return b + CodedOutputByteBufferNano.d(25, this.f5580u);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5576q == null) {
                        this.f5576q = new C0765a();
                    }
                    aVar.a(this.f5576q);
                    this.f5560a = 0;
                    continue;
                case 18:
                    if (this.f5577r == null) {
                        this.f5577r = new C0771d();
                    }
                    aVar.a(this.f5577r);
                    this.f5560a = 1;
                    continue;
                case 26:
                    if (this.f5578s == null) {
                        this.f5578s = new aa();
                    }
                    aVar.a(this.f5578s);
                    this.f5560a = 2;
                    continue;
                case 34:
                    this.f5561b = aVar.f();
                    continue;
                case 66:
                    a2 = l.a(aVar, 66);
                    a = this.f5573n == null ? 0 : this.f5573n.length;
                    obj = new C0864b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5573n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0864b();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0864b();
                    aVar.a(obj[a]);
                    this.f5573n = obj;
                    continue;
                case 74:
                    this.f5571l = aVar.f();
                    continue;
                case 82:
                    if (this.f5565f == null) {
                        this.f5565f = new ae();
                    }
                    aVar.a(this.f5565f);
                    continue;
                case 90:
                    if (this.f5564e == null) {
                        this.f5564e = new ad();
                    }
                    aVar.a(this.f5564e);
                    continue;
                case 98:
                    this.f5572m = aVar.f();
                    continue;
                case 104:
                    this.f5574o = aVar.e();
                    continue;
                case 114:
                    a2 = l.a(aVar, 114);
                    a = this.f5566g == null ? 0 : this.f5566g.length;
                    obj = new C0810g[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5566g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0810g();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0810g();
                    aVar.a(obj[a]);
                    this.f5566g = obj;
                    continue;
                case 122:
                    if (this.f5575p == null) {
                        this.f5575p = new C0847k();
                    }
                    aVar.a(this.f5575p);
                    continue;
                case 130:
                    if (this.f5563d == null) {
                        this.f5563d = new c();
                    }
                    aVar.a(this.f5563d);
                    continue;
                case 146:
                    this.f5567h = aVar.f();
                    continue;
                case 152:
                    this.f5568i = aVar.j();
                    continue;
                case 160:
                    this.f5570k = aVar.j();
                    continue;
                case 170:
                    if (this.f5579t == null) {
                        this.f5579t = new C0769b();
                    }
                    aVar.a(this.f5579t);
                    this.f5560a = 3;
                    continue;
                case 184:
                    this.f5569j = aVar.e();
                    continue;
                case 194:
                    if (this.f5562c == null) {
                        this.f5562c = new C0824a();
                    }
                    aVar.a(this.f5562c);
                    continue;
                case 202:
                    if (this.f5580u == null) {
                        this.f5580u = new C0836a();
                    }
                    aVar.a(this.f5580u);
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
}
