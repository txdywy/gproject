package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0794v extends C0758b {
    public static volatile C0794v[] f5016a;
    public int f5017b;
    public long f5018c;
    public long[] f5019d;
    public int[] f5020e;

    public static C0794v[] m5081a() {
        if (f5016a == null) {
            synchronized (h.b) {
                if (f5016a == null) {
                    f5016a = new C0794v[0];
                }
            }
        }
        return f5016a;
    }

    public C0794v() {
        this.f5017b = 0;
        this.f5018c = 0;
        this.f5019d = l.f;
        this.f5020e = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        int i2 = 0;
        if (this.f5017b != 0) {
            codedOutputByteBufferNano.a(1, this.f5017b);
        }
        if (this.f5018c != 0) {
            codedOutputByteBufferNano.b(2, this.f5018c);
        }
        if (this.f5019d != null && this.f5019d.length > 0) {
            i = 0;
            for (long c : this.f5019d) {
                i += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(26);
            codedOutputByteBufferNano.e(i);
            for (long b : this.f5019d) {
                codedOutputByteBufferNano.b(b);
            }
        }
        if (this.f5020e != null && this.f5020e.length > 0) {
            i = 0;
            for (int c2 : this.f5020e) {
                i += CodedOutputByteBufferNano.c(c2);
            }
            codedOutputByteBufferNano.e(34);
            codedOutputByteBufferNano.e(i);
            while (i2 < this.f5020e.length) {
                codedOutputByteBufferNano.a(this.f5020e[i2]);
                i2++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5017b != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5017b);
        }
        if (this.f5018c != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f5018c);
        }
        if (this.f5019d != null && this.f5019d.length > 0) {
            int i3 = 0;
            for (long c : this.f5019d) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            b = ((b + i3) + 1) + CodedOutputByteBufferNano.f(i3);
        }
        if (this.f5020e == null || this.f5020e.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f5020e.length) {
            i += CodedOutputByteBufferNano.c(this.f5020e[i2]);
            i2++;
        }
        return ((b + i) + 1) + CodedOutputByteBufferNano.f(i);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            int c;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f5017b = aVar.i();
                    continue;
                case 16:
                    this.f5018c = aVar.j();
                    continue;
                case 24:
                    a2 = l.a(aVar, 24);
                    if (this.f5019d == null) {
                        a = 0;
                    } else {
                        a = this.f5019d.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5019d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f5019d = obj;
                    continue;
                case 26:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.j();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5019d == null ? 0 : this.f5019d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5019d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f5019d = obj2;
                    aVar.d(c);
                    continue;
                case 32:
                    a2 = l.a(aVar, 32);
                    if (this.f5020e == null) {
                        a = 0;
                    } else {
                        a = this.f5020e.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5020e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f5020e = obj;
                    continue;
                case 34:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.i();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5020e == null ? 0 : this.f5020e.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5020e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f5020e = obj2;
                    aVar.d(c);
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
