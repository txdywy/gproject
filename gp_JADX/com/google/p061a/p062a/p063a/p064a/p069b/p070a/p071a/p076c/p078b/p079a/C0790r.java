package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ak;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0790r extends C0758b {
    public static volatile C0790r[] f4988a;
    public C0811h f4989b;
    public C0791s f4990c;
    public C0786n[] f4991d;
    public ak[] f4992e;
    public int f4993f;
    public C0799a f4994g;

    public static C0790r[] m5064a() {
        if (f4988a == null) {
            synchronized (h.b) {
                if (f4988a == null) {
                    f4988a = new C0790r[0];
                }
            }
        }
        return f4988a;
    }

    public C0790r() {
        this.f4989b = null;
        this.f4990c = null;
        this.f4991d = C0786n.m5046a();
        this.f4992e = ak.m5293a();
        this.f4993f = -1;
        this.f4994g = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f4989b != null) {
            codedOutputByteBufferNano.b(1, this.f4989b);
        }
        if (this.f4990c != null) {
            codedOutputByteBufferNano.b(2, this.f4990c);
        }
        if (this.f4991d != null && this.f4991d.length > 0) {
            for (C0757i c0757i : this.f4991d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (this.f4992e != null && this.f4992e.length > 0) {
            while (i < this.f4992e.length) {
                C0757i c0757i2 = this.f4992e[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(4, c0757i2);
                }
                i++;
            }
        }
        if (this.f4994g != null) {
            codedOutputByteBufferNano.b(6, this.f4994g);
        }
        if (this.f4993f != -1) {
            codedOutputByteBufferNano.a(7, this.f4993f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f4989b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4989b);
        }
        if (this.f4990c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f4990c);
        }
        if (this.f4991d != null && this.f4991d.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f4991d) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i2;
        }
        if (this.f4992e != null && this.f4992e.length > 0) {
            while (i < this.f4992e.length) {
                C0757i c0757i2 = this.f4992e[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(4, c0757i2);
                }
                i++;
            }
        }
        if (this.f4994g != null) {
            b += CodedOutputByteBufferNano.d(6, this.f4994g);
        }
        if (this.f4993f != -1) {
            return b + CodedOutputByteBufferNano.d(7, this.f4993f);
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
                    if (this.f4989b == null) {
                        this.f4989b = new C0811h();
                    }
                    aVar.a(this.f4989b);
                    continue;
                case 18:
                    if (this.f4990c == null) {
                        this.f4990c = new C0791s();
                    }
                    aVar.a(this.f4990c);
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f4991d == null ? 0 : this.f4991d.length;
                    obj = new C0786n[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4991d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0786n();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0786n();
                    aVar.a(obj[a]);
                    this.f4991d = obj;
                    continue;
                case 34:
                    a2 = l.a(aVar, 34);
                    a = this.f4992e == null ? 0 : this.f4992e.length;
                    obj = new ak[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4992e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ak();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ak();
                    aVar.a(obj[a]);
                    this.f4992e = obj;
                    continue;
                case 50:
                    if (this.f4994g == null) {
                        this.f4994g = new C0799a();
                    }
                    aVar.a(this.f4994g);
                    continue;
                case 56:
                    this.f4993f = aVar.i();
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
