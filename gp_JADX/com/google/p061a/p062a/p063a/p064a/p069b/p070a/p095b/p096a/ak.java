package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ak extends C0758b {
    public static volatile ak[] f5342a;
    public int f5343b;
    public int f5344c;
    public int[] f5345d;
    public int[] f5346e;

    public static ak[] m5293a() {
        if (f5342a == null) {
            synchronized (h.b) {
                if (f5342a == null) {
                    f5342a = new ak[0];
                }
            }
        }
        return f5342a;
    }

    public ak() {
        this.f5343b = 0;
        this.f5344c = 0;
        this.f5345d = l.e;
        this.f5346e = l.e;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i;
        int i2 = 0;
        if (this.f5343b != 0) {
            codedOutputByteBufferNano.a(3, this.f5343b);
        }
        if (this.f5344c != 0) {
            codedOutputByteBufferNano.a(4, this.f5344c);
        }
        if (this.f5345d != null && this.f5345d.length > 0) {
            i = 0;
            for (int c : this.f5345d) {
                i += CodedOutputByteBufferNano.c(c);
            }
            codedOutputByteBufferNano.e(50);
            codedOutputByteBufferNano.e(i);
            for (int i3 : this.f5345d) {
                codedOutputByteBufferNano.a(i3);
            }
        }
        if (this.f5346e != null && this.f5346e.length > 0) {
            i3 = 0;
            for (int c2 : this.f5346e) {
                i3 += CodedOutputByteBufferNano.c(c2);
            }
            codedOutputByteBufferNano.e(58);
            codedOutputByteBufferNano.e(i3);
            while (i2 < this.f5346e.length) {
                codedOutputByteBufferNano.a(this.f5346e[i2]);
                i2++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f5343b != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f5343b);
        }
        if (this.f5344c != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f5344c);
        }
        if (this.f5345d != null && this.f5345d.length > 0) {
            int i3 = 0;
            for (int c : this.f5345d) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            b = ((b + i3) + 1) + CodedOutputByteBufferNano.f(i3);
        }
        if (this.f5346e == null || this.f5346e.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f5346e.length) {
            i += CodedOutputByteBufferNano.c(this.f5346e[i2]);
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
                case 24:
                    this.f5343b = aVar.i();
                    continue;
                case 32:
                    this.f5344c = aVar.i();
                    continue;
                case 48:
                    a2 = l.a(aVar, 48);
                    if (this.f5345d == null) {
                        a = 0;
                    } else {
                        a = this.f5345d.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5345d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f5345d = obj;
                    continue;
                case 50:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.i();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5345d == null ? 0 : this.f5345d.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5345d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f5345d = obj2;
                    aVar.d(c);
                    continue;
                case 56:
                    a2 = l.a(aVar, 56);
                    if (this.f5346e == null) {
                        a = 0;
                    } else {
                        a = this.f5346e.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5346e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f5346e = obj;
                    continue;
                case 58:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.i();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f5346e == null ? 0 : this.f5346e.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f5346e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f5346e = obj2;
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
