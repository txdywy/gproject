package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0801c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0804a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0838b;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.C0843g;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ai;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0797y extends C0758b {
    public C0811h f5036a;
    public C0796x[] f5037b;
    public String f5038c;
    public String f5039d;
    public C0795w[] f5040e;
    public C0804a f5041f;
    public C0798z f5042g;
    public C0801c f5043h;
    public int f5044i;
    public int f5045j;
    public int f5046k;
    public int f5047l;
    public boolean f5048m;
    public int[] f5049n;
    public int[] f5050o;
    public int[] f5051p;

    public C0797y() {
        this.f5036a = null;
        this.f5037b = C0796x.m5089a();
        this.f5038c = "";
        this.f5039d = "";
        this.f5040e = C0795w.m5085a();
        this.f5041f = null;
        this.f5042g = null;
        this.f5043h = null;
        this.f5044i = 0;
        this.f5045j = 0;
        this.f5046k = 0;
        this.f5047l = 0;
        this.f5048m = true;
        this.f5049n = l.e;
        this.f5050o = l.e;
        this.f5051p = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5041f != null) {
            codedOutputByteBufferNano.b(2, this.f5041f);
        }
        if (this.f5042g != null) {
            codedOutputByteBufferNano.b(3, this.f5042g);
        }
        if (this.f5043h != null) {
            codedOutputByteBufferNano.b(4, this.f5043h);
        }
        if (this.f5037b != null && this.f5037b.length > 0) {
            for (C0757i c0757i : this.f5037b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(6, c0757i);
                }
            }
        }
        if (this.f5040e != null && this.f5040e.length > 0) {
            for (C0757i c0757i2 : this.f5040e) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(7, c0757i2);
                }
            }
        }
        if (this.f5044i != 0) {
            codedOutputByteBufferNano.a(8, this.f5044i);
        }
        if (this.f5045j != 0) {
            codedOutputByteBufferNano.a(9, this.f5045j);
        }
        if (this.f5046k != 0) {
            codedOutputByteBufferNano.a(10, this.f5046k);
        }
        if (this.f5047l != 0) {
            codedOutputByteBufferNano.a(11, this.f5047l);
        }
        if (!this.f5048m) {
            codedOutputByteBufferNano.a(12, this.f5048m);
        }
        if (this.f5049n != null && this.f5049n.length > 0) {
            for (int a : this.f5049n) {
                codedOutputByteBufferNano.a(15, a);
            }
        }
        if (this.f5050o != null && this.f5050o.length > 0) {
            for (int a2 : this.f5050o) {
                codedOutputByteBufferNano.a(16, a2);
            }
        }
        if (this.f5036a != null) {
            codedOutputByteBufferNano.b(18, this.f5036a);
        }
        if (!(this.f5038c == null || this.f5038c.equals(""))) {
            codedOutputByteBufferNano.a(19, this.f5038c);
        }
        if (!(this.f5039d == null || this.f5039d.equals(""))) {
            codedOutputByteBufferNano.a(20, this.f5039d);
        }
        if (this.f5051p != null && this.f5051p.length > 0) {
            int i2 = 0;
            for (int a22 : this.f5051p) {
                i2 += CodedOutputByteBufferNano.c(a22);
            }
            codedOutputByteBufferNano.e(170);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5051p.length) {
                codedOutputByteBufferNano.e(this.f5051p[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if (this.f5041f != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5041f);
        }
        if (this.f5042g != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5042g);
        }
        if (this.f5043h != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5043h);
        }
        if (this.f5037b != null && this.f5037b.length > 0) {
            i = b;
            for (C0757i c0757i : this.f5037b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(6, c0757i);
                }
            }
            b = i;
        }
        if (this.f5040e != null && this.f5040e.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f5040e) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(7, c0757i2);
                }
            }
            b = i;
        }
        if (this.f5044i != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f5044i);
        }
        if (this.f5045j != 0) {
            b += CodedOutputByteBufferNano.d(9, this.f5045j);
        }
        if (this.f5046k != 0) {
            b += CodedOutputByteBufferNano.d(10, this.f5046k);
        }
        if (this.f5047l != 0) {
            b += CodedOutputByteBufferNano.d(11, this.f5047l);
        }
        if (!this.f5048m) {
            b += CodedOutputByteBufferNano.d(12) + 1;
        }
        if (this.f5049n != null && this.f5049n.length > 0) {
            i2 = 0;
            for (int c : this.f5049n) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i2) + (this.f5049n.length * 1);
        }
        if (this.f5050o != null && this.f5050o.length > 0) {
            i2 = 0;
            for (int c2 : this.f5050o) {
                i2 += CodedOutputByteBufferNano.c(c2);
            }
            b = (b + i2) + (this.f5050o.length * 2);
        }
        if (this.f5036a != null) {
            b += CodedOutputByteBufferNano.d(18, this.f5036a);
        }
        if (!(this.f5038c == null || this.f5038c.equals(""))) {
            b += CodedOutputByteBufferNano.b(19, this.f5038c);
        }
        if (!(this.f5039d == null || this.f5039d.equals(""))) {
            b += CodedOutputByteBufferNano.b(20, this.f5039d);
        }
        if (this.f5051p == null || this.f5051p.length <= 0) {
            return b;
        }
        i = 0;
        while (i3 < this.f5051p.length) {
            i += CodedOutputByteBufferNano.c(this.f5051p[i3]);
            i3++;
        }
        return ((b + i) + 2) + CodedOutputByteBufferNano.f(i);
    }

    private final C0797y m5094b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            int a2;
            int length;
            Object obj;
            int a3;
            Object obj2;
            Object obj3;
            Object obj4;
            switch (a) {
                case 0:
                    break;
                case 18:
                    if (this.f5041f == null) {
                        this.f5041f = new C0804a();
                    }
                    aVar.a(this.f5041f);
                    continue;
                case 26:
                    if (this.f5042g == null) {
                        this.f5042g = new C0798z();
                    }
                    aVar.a(this.f5042g);
                    continue;
                case 34:
                    if (this.f5043h == null) {
                        this.f5043h = new C0801c();
                    }
                    aVar.a(this.f5043h);
                    continue;
                case 50:
                    a2 = l.a(aVar, 50);
                    length = this.f5037b == null ? 0 : this.f5037b.length;
                    obj = new C0796x[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f5037b, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new C0796x();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new C0796x();
                    aVar.a(obj[length]);
                    this.f5037b = obj;
                    continue;
                case 58:
                    a2 = l.a(aVar, 58);
                    length = this.f5040e == null ? 0 : this.f5040e.length;
                    obj = new C0795w[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f5040e, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new C0795w();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new C0795w();
                    aVar.a(obj[length]);
                    this.f5040e = obj;
                    continue;
                case 64:
                    this.f5044i = aVar.i();
                    continue;
                case 72:
                    this.f5045j = aVar.i();
                    continue;
                case 80:
                    this.f5046k = aVar.i();
                    continue;
                case 88:
                    this.f5047l = aVar.i();
                    continue;
                case 96:
                    this.f5048m = aVar.e();
                    continue;
                case 120:
                    a3 = l.a(aVar, 120);
                    obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            aVar.a();
                        }
                        o = aVar.o();
                        try {
                            obj2[length] = C0838b.m5354a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f5049n == null ? 0 : this.f5049n.length;
                        if (a2 != 0 || length != obj2.length) {
                            obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f5049n, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f5049n = obj3;
                            break;
                        }
                        this.f5049n = obj2;
                        break;
                    }
                    continue;
                case 122:
                    a = aVar.c(aVar.i());
                    a2 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            C0838b.m5354a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a2);
                        if (this.f5049n == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f5049n.length;
                        }
                        obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f5049n, 0, obj4, 0, a2);
                        }
                        while (aVar.m() > 0) {
                            a3 = aVar.o();
                            try {
                                obj4[a2] = C0838b.m5354a(aVar.i());
                                a2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a3);
                                m4918a(aVar, 120);
                            }
                        }
                        this.f5049n = obj4;
                    }
                    aVar.d(a);
                    continue;
                case 128:
                    a3 = l.a(aVar, 128);
                    obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            aVar.a();
                        }
                        o = aVar.o();
                        try {
                            obj2[length] = ai.m5288a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e4) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f5050o == null ? 0 : this.f5050o.length;
                        if (a2 != 0 || length != obj2.length) {
                            obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f5050o, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f5050o = obj3;
                            break;
                        }
                        this.f5050o = obj2;
                        break;
                    }
                    continue;
                case 130:
                    a = aVar.c(aVar.i());
                    a2 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            ai.m5288a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e5) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a2);
                        if (this.f5050o == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f5050o.length;
                        }
                        obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f5050o, 0, obj4, 0, a2);
                        }
                        while (aVar.m() > 0) {
                            a3 = aVar.o();
                            try {
                                obj4[a2] = ai.m5288a(aVar.i());
                                a2++;
                            } catch (IllegalArgumentException e6) {
                                aVar.e(a3);
                                m4918a(aVar, 128);
                            }
                        }
                        this.f5050o = obj4;
                    }
                    aVar.d(a);
                    continue;
                case 146:
                    if (this.f5036a == null) {
                        this.f5036a = new C0811h();
                    }
                    aVar.a(this.f5036a);
                    continue;
                case 154:
                    this.f5038c = aVar.f();
                    continue;
                case 162:
                    this.f5039d = aVar.f();
                    continue;
                case 168:
                    a3 = l.a(aVar, 168);
                    obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            aVar.a();
                        }
                        o = aVar.o();
                        try {
                            obj2[length] = C0843g.m5371a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e7) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f5051p == null ? 0 : this.f5051p.length;
                        if (a2 != 0 || length != obj2.length) {
                            obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f5051p, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f5051p = obj3;
                            break;
                        }
                        this.f5051p = obj2;
                        break;
                    }
                    continue;
                case 170:
                    a = aVar.c(aVar.i());
                    a2 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            C0843g.m5371a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e8) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a2);
                        if (this.f5051p == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f5051p.length;
                        }
                        obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f5051p, 0, obj4, 0, a2);
                        }
                        while (aVar.m() > 0) {
                            a3 = aVar.o();
                            try {
                                obj4[a2] = C0843g.m5371a(aVar.i());
                                a2++;
                            } catch (IllegalArgumentException e9) {
                                aVar.e(a3);
                                m4918a(aVar, 168);
                            }
                        }
                        this.f5051p = obj4;
                    }
                    aVar.d(a);
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
        return m5094b(aVar);
    }
}
