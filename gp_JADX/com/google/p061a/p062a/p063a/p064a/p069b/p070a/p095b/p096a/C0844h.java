package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C0844h extends C0758b {
    public static volatile C0844h[] f5446a;
    public long f5447b;
    public long[] f5448c;

    public static C0844h[] m5372a() {
        if (f5446a == null) {
            synchronized (h.b) {
                if (f5446a == null) {
                    f5446a = new C0844h[0];
                }
            }
        }
        return f5446a;
    }

    public C0844h() {
        this.f5447b = 0;
        this.f5448c = l.f;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5447b != 0) {
            codedOutputByteBufferNano.b(1, this.f5447b);
        }
        if (this.f5448c != null && this.f5448c.length > 0) {
            int i2 = 0;
            for (long c : this.f5448c) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(18);
            codedOutputByteBufferNano.e(i2);
            while (i < this.f5448c.length) {
                codedOutputByteBufferNano.b(this.f5448c[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5447b != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f5447b);
        }
        if (this.f5448c == null || this.f5448c.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f5448c.length) {
            i2 += CodedOutputByteBufferNano.c(this.f5448c[i]);
            i++;
        }
        return ((b + i2) + 1) + CodedOutputByteBufferNano.f(i2);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f5447b = aVar.j();
                    continue;
                case 16:
                    a2 = l.a(aVar, 16);
                    if (this.f5448c == null) {
                        a = 0;
                    } else {
                        a = this.f5448c.length;
                    }
                    Object obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5448c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f5448c = obj;
                    continue;
                case 18:
                    int c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.j();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5448c == null ? 0 : this.f5448c.length;
                    Object obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5448c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f5448c = obj2;
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
