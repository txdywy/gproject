package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0795w extends C0758b {
    public static volatile C0795w[] f5021a;
    public String f5022b;
    public String f5023c;
    public int f5024d;
    public int[] f5025e;
    public String f5026f;

    public static C0795w[] m5085a() {
        if (f5021a == null) {
            synchronized (h.b) {
                if (f5021a == null) {
                    f5021a = new C0795w[0];
                }
            }
        }
        return f5021a;
    }

    public C0795w() {
        this.f5022b = "";
        this.f5023c = "";
        this.f5024d = 0;
        this.f5025e = l.e;
        this.f5026f = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5022b == null || this.f5022b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5022b);
        }
        if (!(this.f5023c == null || this.f5023c.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5023c);
        }
        if (this.f5024d != 0) {
            codedOutputByteBufferNano.a(3, this.f5024d);
        }
        if (this.f5025e != null && this.f5025e.length > 0) {
            for (int a : this.f5025e) {
                codedOutputByteBufferNano.a(4, a);
            }
        }
        if (!(this.f5026f == null || this.f5026f.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f5026f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (!(this.f5022b == null || this.f5022b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5022b);
        }
        if (!(this.f5023c == null || this.f5023c.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5023c);
        }
        if (this.f5024d != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f5024d);
        }
        if (this.f5025e != null && this.f5025e.length > 0) {
            int i2 = 0;
            while (i < this.f5025e.length) {
                i2 += CodedOutputByteBufferNano.c(this.f5025e[i]);
                i++;
            }
            b = (b + i2) + (this.f5025e.length * 1);
        }
        if (this.f5026f == null || this.f5026f.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(5, this.f5026f);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5022b = aVar.f();
                    continue;
                case 18:
                    this.f5023c = aVar.f();
                    continue;
                case 24:
                    this.f5024d = aVar.i();
                    continue;
                case 32:
                    a2 = l.a(aVar, 32);
                    if (this.f5025e == null) {
                        a = 0;
                    } else {
                        a = this.f5025e.length;
                    }
                    Object obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5025e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f5025e = obj;
                    continue;
                case 34:
                    int c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.i();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5025e == null ? 0 : this.f5025e.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5025e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f5025e = obj2;
                    aVar.d(c);
                    continue;
                case 42:
                    this.f5026f = aVar.f();
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
