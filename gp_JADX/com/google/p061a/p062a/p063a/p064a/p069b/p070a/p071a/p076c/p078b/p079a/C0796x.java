package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0768a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ad;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0796x extends C0758b {
    public static volatile C0796x[] f5027a;
    public C0795w[] f5028b;
    public ad f5029c;
    public int f5030d;
    public byte[] f5031e;
    public ad f5032f;
    public String f5033g;
    public String f5034h;
    public int[] f5035i;

    public static C0796x[] m5089a() {
        if (f5027a == null) {
            synchronized (h.b) {
                if (f5027a == null) {
                    f5027a = new C0796x[0];
                }
            }
        }
        return f5027a;
    }

    public C0796x() {
        this.f5028b = C0795w.m5085a();
        this.f5029c = null;
        this.f5030d = 0;
        this.f5031e = l.l;
        this.f5032f = null;
        this.f5033g = "";
        this.f5034h = "";
        this.f5035i = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5028b != null && this.f5028b.length > 0) {
            for (C0757i c0757i : this.f5028b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (this.f5030d != 0) {
            codedOutputByteBufferNano.a(3, this.f5030d);
        }
        if (!Arrays.equals(this.f5031e, l.l)) {
            codedOutputByteBufferNano.a(4, this.f5031e);
        }
        if (!(this.f5033g == null || this.f5033g.equals(""))) {
            codedOutputByteBufferNano.a(7, this.f5033g);
        }
        if (!(this.f5034h == null || this.f5034h.equals(""))) {
            codedOutputByteBufferNano.a(8, this.f5034h);
        }
        if (this.f5029c != null) {
            codedOutputByteBufferNano.b(9, this.f5029c);
        }
        if (this.f5032f != null) {
            codedOutputByteBufferNano.b(11, this.f5032f);
        }
        if (this.f5035i != null && this.f5035i.length > 0) {
            while (i < this.f5035i.length) {
                codedOutputByteBufferNano.a(12, this.f5035i[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5028b != null && this.f5028b.length > 0) {
            i = b;
            for (C0757i c0757i : this.f5028b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i;
        }
        if (this.f5030d != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f5030d);
        }
        if (!Arrays.equals(this.f5031e, l.l)) {
            b += CodedOutputByteBufferNano.b(4, this.f5031e);
        }
        if (!(this.f5033g == null || this.f5033g.equals(""))) {
            b += CodedOutputByteBufferNano.b(7, this.f5033g);
        }
        if (!(this.f5034h == null || this.f5034h.equals(""))) {
            b += CodedOutputByteBufferNano.b(8, this.f5034h);
        }
        if (this.f5029c != null) {
            b += CodedOutputByteBufferNano.d(9, this.f5029c);
        }
        if (this.f5032f != null) {
            b += CodedOutputByteBufferNano.d(11, this.f5032f);
        }
        if (this.f5035i == null || this.f5035i.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f5035i.length) {
            i += CodedOutputByteBufferNano.c(this.f5035i[i2]);
            i2++;
        }
        return (b + i) + (this.f5035i.length * 1);
    }

    private final C0796x m5090b(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            int length;
            int a3;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = l.a(aVar, 10);
                    length = this.f5028b == null ? 0 : this.f5028b.length;
                    Object obj = new C0795w[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f5028b, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new C0795w();
                        aVar.a(obj[length]);
                        aVar.a();
                        length++;
                    }
                    obj[length] = new C0795w();
                    aVar.a(obj[length]);
                    this.f5028b = obj;
                    continue;
                case 24:
                    this.f5030d = aVar.i();
                    continue;
                case 34:
                    this.f5031e = aVar.g();
                    continue;
                case 58:
                    this.f5033g = aVar.f();
                    continue;
                case 66:
                    this.f5034h = aVar.f();
                    continue;
                case 74:
                    if (this.f5029c == null) {
                        this.f5029c = new ad();
                    }
                    aVar.a(this.f5029c);
                    continue;
                case 90:
                    if (this.f5032f == null) {
                        this.f5032f = new ad();
                    }
                    aVar.a(this.f5032f);
                    continue;
                case 96:
                    a3 = l.a(aVar, 96);
                    Object obj2 = new int[a3];
                    length = 0;
                    for (a2 = 0; a2 < a3; a2++) {
                        if (a2 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj2[length] = C0768a.m4957a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a);
                        }
                    }
                    if (length != 0) {
                        a2 = this.f5035i == null ? 0 : this.f5035i.length;
                        if (a2 != 0 || length != obj2.length) {
                            Object obj3 = new int[(a2 + length)];
                            if (a2 != 0) {
                                System.arraycopy(this.f5035i, 0, obj3, 0, a2);
                            }
                            System.arraycopy(obj2, 0, obj3, a2, length);
                            this.f5035i = obj3;
                            break;
                        }
                        this.f5035i = obj2;
                        break;
                    }
                    continue;
                    break;
                case 98:
                    a = aVar.c(aVar.i());
                    a2 = aVar.o();
                    length = 0;
                    while (aVar.m() > 0) {
                        try {
                            C0768a.m4957a(aVar.i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        aVar.e(a2);
                        if (this.f5035i == null) {
                            a2 = 0;
                        } else {
                            a2 = this.f5035i.length;
                        }
                        Object obj4 = new int[(length + a2)];
                        if (a2 != 0) {
                            System.arraycopy(this.f5035i, 0, obj4, 0, a2);
                        }
                        while (aVar.m() > 0) {
                            a3 = aVar.o();
                            try {
                                obj4[a2] = C0768a.m4957a(aVar.i());
                                a2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a3);
                                m4918a(aVar, 96);
                            }
                        }
                        this.f5035i = obj4;
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
        return m5090b(aVar);
    }
}
