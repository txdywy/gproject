package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ae;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.al;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0784l extends C0758b {
    public C0811h f4945a;
    public al[] f4946b;
    public ad f4947c;
    public ad f4948d;
    public C0799a f4949e;
    public ae f4950f;
    public long f4951g;
    public int[] f4952h;

    public C0784l() {
        this.f4945a = null;
        this.f4946b = al.m5297a();
        this.f4947c = null;
        this.f4948d = null;
        this.f4949e = null;
        this.f4950f = null;
        this.f4951g = 0;
        this.f4952h = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f4945a != null) {
            codedOutputByteBufferNano.b(1, this.f4945a);
        }
        if (this.f4946b != null && this.f4946b.length > 0) {
            for (C0757i c0757i : this.f4946b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f4947c != null) {
            codedOutputByteBufferNano.b(3, this.f4947c);
        }
        if (this.f4949e != null) {
            codedOutputByteBufferNano.b(4, this.f4949e);
        }
        if (this.f4950f != null) {
            codedOutputByteBufferNano.b(5, this.f4950f);
        }
        if (this.f4951g != 0) {
            codedOutputByteBufferNano.b(6, this.f4951g);
        }
        if (this.f4948d != null) {
            codedOutputByteBufferNano.b(7, this.f4948d);
        }
        if (this.f4952h != null && this.f4952h.length > 0) {
            while (i < this.f4952h.length) {
                codedOutputByteBufferNano.a(8, this.f4952h[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f4945a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4945a);
        }
        if (this.f4946b != null && this.f4946b.length > 0) {
            i = b;
            for (C0757i c0757i : this.f4946b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if (this.f4947c != null) {
            b += CodedOutputByteBufferNano.d(3, this.f4947c);
        }
        if (this.f4949e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f4949e);
        }
        if (this.f4950f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f4950f);
        }
        if (this.f4951g != 0) {
            b += CodedOutputByteBufferNano.f(6, this.f4951g);
        }
        if (this.f4948d != null) {
            b += CodedOutputByteBufferNano.d(7, this.f4948d);
        }
        if (this.f4952h == null || this.f4952h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f4952h.length) {
            i += CodedOutputByteBufferNano.c(this.f4952h[i2]);
            i2++;
        }
        return (b + i) + (this.f4952h.length * 1);
    }

    private final C0784l m5039b(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            int length;
            int a3;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f4945a == null) {
                        this.f4945a = new C0811h();
                    }
                    aVar.a(this.f4945a);
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    length = this.f4946b == null ? 0 : this.f4946b.length;
                    Object obj = new al[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4946b, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new al();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new al();
                    aVar.a(obj[length]);
                    this.f4946b = obj;
                    continue;
                case 26:
                    if (this.f4947c == null) {
                        this.f4947c = new ad();
                    }
                    aVar.a(this.f4947c);
                    continue;
                case 34:
                    if (this.f4949e == null) {
                        this.f4949e = new C0799a();
                    }
                    aVar.a(this.f4949e);
                    continue;
                case 42:
                    if (this.f4950f == null) {
                        this.f4950f = new ae();
                    }
                    aVar.a(this.f4950f);
                    continue;
                case 48:
                    this.f4951g = aVar.j();
                    continue;
                case 58:
                    if (this.f4948d == null) {
                        this.f4948d = new ad();
                    }
                    aVar.a(this.f4948d);
                    continue;
                case 64:
                    a3 = l.a(aVar, 64);
                    Object obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj2[length] = com.google.h.c.c.b.d.a.a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f4952h == null ? 0 : this.f4952h.length;
                        if (a2 != 0 || length != obj2.length) {
                            Object obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f4952h, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f4952h = obj3;
                            break;
                        }
                        this.f4952h = obj2;
                        break;
                    }
                    continue;
                case 66:
                    a = aVar.c(aVar.i());
                    a2 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            com.google.h.c.c.b.d.a.a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a2);
                        if (this.f4952h == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f4952h.length;
                        }
                        Object obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f4952h, 0, obj4, 0, a2);
                        }
                        while (aVar.m() > 0) {
                            a3 = aVar.o();
                            try {
                                obj4[a2] = com.google.h.c.c.b.d.a.a(aVar.i());
                                a2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a3);
                                m4918a(aVar, 64);
                            }
                        }
                        this.f4952h = obj4;
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
        return m5039b(aVar);
    }
}
