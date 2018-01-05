package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ak;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0773a extends C0758b {
    public C0811h f4820a;
    public ae f4821b;
    public al[] f4822c;
    public ak[] f4823d;
    public int[] f4824e;
    public ad[] f4825f;
    public C0804a f4826g;
    public C0804a f4827h;
    public C0799a[] f4828i;

    public C0773a() {
        this.f4820a = null;
        this.f4821b = null;
        this.f4822c = al.m5297a();
        this.f4823d = ak.m5293a();
        this.f4824e = l.e;
        this.f4825f = ad.m5268a();
        this.f4826g = null;
        this.f4827h = null;
        this.f4828i = C0799a.m5101a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f4822c != null && this.f4822c.length > 0) {
            for (C0757i c0757i : this.f4822c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (this.f4825f != null && this.f4825f.length > 0) {
            for (C0757i c0757i2 : this.f4825f) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(4, c0757i2);
                }
            }
        }
        if (this.f4826g != null) {
            codedOutputByteBufferNano.b(5, this.f4826g);
        }
        if (this.f4827h != null) {
            codedOutputByteBufferNano.b(6, this.f4827h);
        }
        if (this.f4828i != null && this.f4828i.length > 0) {
            for (C0757i c0757i22 : this.f4828i) {
                if (c0757i22 != null) {
                    codedOutputByteBufferNano.b(8, c0757i22);
                }
            }
        }
        if (this.f4821b != null) {
            codedOutputByteBufferNano.b(10, this.f4821b);
        }
        if (this.f4823d != null && this.f4823d.length > 0) {
            for (C0757i c0757i222 : this.f4823d) {
                if (c0757i222 != null) {
                    codedOutputByteBufferNano.b(11, c0757i222);
                }
            }
        }
        if (this.f4824e != null && this.f4824e.length > 0) {
            while (i < this.f4824e.length) {
                codedOutputByteBufferNano.a(12, this.f4824e[i]);
                i++;
            }
        }
        if (this.f4820a != null) {
            codedOutputByteBufferNano.b(13, this.f4820a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f4822c != null && this.f4822c.length > 0) {
            i = b;
            for (C0757i c0757i : this.f4822c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (this.f4825f != null && this.f4825f.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f4825f) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i2);
                }
            }
            b = i;
        }
        if (this.f4826g != null) {
            b += CodedOutputByteBufferNano.d(5, this.f4826g);
        }
        if (this.f4827h != null) {
            b += CodedOutputByteBufferNano.d(6, this.f4827h);
        }
        if (this.f4828i != null && this.f4828i.length > 0) {
            i = b;
            for (C0757i c0757i22 : this.f4828i) {
                if (c0757i22 != null) {
                    i += CodedOutputByteBufferNano.d(8, c0757i22);
                }
            }
            b = i;
        }
        if (this.f4821b != null) {
            b += CodedOutputByteBufferNano.d(10, this.f4821b);
        }
        if (this.f4823d != null && this.f4823d.length > 0) {
            i = b;
            for (C0757i c0757i222 : this.f4823d) {
                if (c0757i222 != null) {
                    i += CodedOutputByteBufferNano.d(11, c0757i222);
                }
            }
            b = i;
        }
        if (this.f4824e != null && this.f4824e.length > 0) {
            i = 0;
            while (i2 < this.f4824e.length) {
                i += CodedOutputByteBufferNano.c(this.f4824e[i2]);
                i2++;
            }
            b = (b + i) + (this.f4824e.length * 1);
        }
        if (this.f4820a != null) {
            return b + CodedOutputByteBufferNano.d(13, this.f4820a);
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
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f4822c == null ? 0 : this.f4822c.length;
                    obj = new al[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4822c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new al();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new al();
                    aVar.a(obj[a]);
                    this.f4822c = obj;
                    continue;
                case 34:
                    a2 = l.a(aVar, 34);
                    a = this.f4825f == null ? 0 : this.f4825f.length;
                    obj = new ad[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4825f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ad();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ad();
                    aVar.a(obj[a]);
                    this.f4825f = obj;
                    continue;
                case 42:
                    if (this.f4826g == null) {
                        this.f4826g = new C0804a();
                    }
                    aVar.a(this.f4826g);
                    continue;
                case 50:
                    if (this.f4827h == null) {
                        this.f4827h = new C0804a();
                    }
                    aVar.a(this.f4827h);
                    continue;
                case 66:
                    a2 = l.a(aVar, 66);
                    a = this.f4828i == null ? 0 : this.f4828i.length;
                    obj = new C0799a[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4828i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0799a();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0799a();
                    aVar.a(obj[a]);
                    this.f4828i = obj;
                    continue;
                case 82:
                    if (this.f4821b == null) {
                        this.f4821b = new ae();
                    }
                    aVar.a(this.f4821b);
                    continue;
                case 90:
                    a2 = l.a(aVar, 90);
                    a = this.f4823d == null ? 0 : this.f4823d.length;
                    obj = new ak[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4823d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ak();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ak();
                    aVar.a(obj[a]);
                    this.f4823d = obj;
                    continue;
                case 96:
                    a2 = l.a(aVar, 96);
                    if (this.f4824e == null) {
                        a = 0;
                    } else {
                        a = this.f4824e.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4824e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f4824e = obj;
                    continue;
                case 98:
                    int c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.i();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f4824e == null ? 0 : this.f4824e.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f4824e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f4824e = obj2;
                    aVar.d(c);
                    continue;
                case 106:
                    if (this.f4820a == null) {
                        this.f4820a = new C0811h();
                    }
                    aVar.a(this.f4820a);
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
