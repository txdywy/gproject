package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0846j extends C0758b {
    public static volatile C0846j[] f5454a;
    public long f5455b;
    public long[] f5456c;
    public long[] f5457d;

    public static C0846j[] m5380a() {
        if (f5454a == null) {
            synchronized (h.b) {
                if (f5454a == null) {
                    f5454a = new C0846j[0];
                }
            }
        }
        return f5454a;
    }

    public C0846j() {
        this.f5455b = 0;
        this.f5456c = l.f;
        this.f5457d = l.f;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        int i2 = 0;
        if (this.f5455b != 0) {
            codedOutputByteBufferNano.b(1, this.f5455b);
        }
        if (this.f5456c != null && this.f5456c.length > 0) {
            i = 0;
            for (long c : this.f5456c) {
                i += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(18);
            codedOutputByteBufferNano.e(i);
            for (long b : this.f5456c) {
                codedOutputByteBufferNano.b(b);
            }
        }
        if (this.f5457d != null && this.f5457d.length > 0) {
            i = 0;
            for (long c2 : this.f5457d) {
                i += CodedOutputByteBufferNano.c(c2);
            }
            codedOutputByteBufferNano.e(26);
            codedOutputByteBufferNano.e(i);
            while (i2 < this.f5457d.length) {
                codedOutputByteBufferNano.b(this.f5457d[i2]);
                i2++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5455b != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f5455b);
        }
        if (this.f5456c != null && this.f5456c.length > 0) {
            int i3 = 0;
            for (long c : this.f5456c) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            b = ((b + i3) + 1) + CodedOutputByteBufferNano.f(i3);
        }
        if (this.f5457d == null || this.f5457d.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f5457d.length) {
            i += CodedOutputByteBufferNano.c(this.f5457d[i2]);
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
                    this.f5455b = aVar.j();
                    continue;
                case 16:
                    a2 = l.a(aVar, 16);
                    if (this.f5456c == null) {
                        a = 0;
                    } else {
                        a = this.f5456c.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5456c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f5456c = obj;
                    continue;
                case 18:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.j();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5456c == null ? 0 : this.f5456c.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5456c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f5456c = obj2;
                    aVar.d(c);
                    continue;
                case 24:
                    a2 = l.a(aVar, 24);
                    if (this.f5457d == null) {
                        a = 0;
                    } else {
                        a = this.f5457d.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5457d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f5457d = obj;
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
                    a2 = this.f5457d == null ? 0 : this.f5457d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5457d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f5457d = obj2;
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
