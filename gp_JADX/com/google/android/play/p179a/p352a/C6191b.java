package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C6191b extends C0758b {
    public String[] f30877a;
    public String[] f30878b;
    public int[] f30879c;
    public long[] f30880d;
    public long[] f30881e;

    public C6191b() {
        this.f30877a = l.j;
        this.f30878b = l.j;
        this.f30879c = l.e;
        this.f30880d = l.f;
        this.f30881e = l.f;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6191b)) {
            return false;
        }
        C6191b c6191b = (C6191b) obj;
        if (!h.a(this.f30877a, c6191b.f30877a)) {
            return false;
        }
        if (!h.a(this.f30878b, c6191b.f30878b)) {
            return false;
        }
        if (!h.a(this.f30879c, c6191b.f30879c)) {
            return false;
        }
        if (!h.a(this.f30880d, c6191b.f30880d)) {
            return false;
        }
        if (!h.a(this.f30881e, c6191b.f30881e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6191b.aO);
        }
        if (c6191b.aO == null || c6191b.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f30877a)) * 31) + h.a(this.f30878b)) * 31) + h.a(this.f30879c)) * 31) + h.a(this.f30880d)) * 31) + h.a(this.f30881e)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f30877a != null && this.f30877a.length > 0) {
            for (String str : this.f30877a) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f30878b != null && this.f30878b.length > 0) {
            for (String str2 : this.f30878b) {
                if (str2 != null) {
                    codedOutputByteBufferNano.a(2, str2);
                }
            }
        }
        if (this.f30879c != null && this.f30879c.length > 0) {
            for (int a : this.f30879c) {
                codedOutputByteBufferNano.a(3, a);
            }
        }
        if (this.f30880d != null && this.f30880d.length > 0) {
            for (long b : this.f30880d) {
                codedOutputByteBufferNano.b(4, b);
            }
        }
        if (this.f30881e != null && this.f30881e.length > 0) {
            while (i < this.f30881e.length) {
                codedOutputByteBufferNano.b(5, this.f30881e[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo1128b();
        if (this.f30877a == null || this.f30877a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f30877a) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f30878b != null && this.f30878b.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2 : this.f30878b) {
                if (str2 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str2);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (this.f30879c != null && this.f30879c.length > 0) {
            i3 = 0;
            for (int b2 : this.f30879c) {
                i3 += CodedOutputByteBufferNano.c(b2);
            }
            i = (i + i3) + (this.f30879c.length * 1);
        }
        if (this.f30880d != null && this.f30880d.length > 0) {
            i3 = 0;
            for (long c : this.f30880d) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            i = (i + i3) + (this.f30880d.length * 1);
        }
        if (this.f30881e == null || this.f30881e.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i4 < this.f30881e.length) {
            i2 += CodedOutputByteBufferNano.c(this.f30881e[i4]);
            i4++;
        }
        return (i + i2) + (this.f30881e.length * 1);
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
                case 10:
                    a2 = l.a(aVar, 10);
                    a = this.f30877a == null ? 0 : this.f30877a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30877a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f30877a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f30878b == null ? 0 : this.f30878b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30878b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f30878b = obj;
                    continue;
                case 24:
                    a2 = l.a(aVar, 24);
                    if (this.f30879c == null) {
                        a = 0;
                    } else {
                        a = this.f30879c.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30879c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f30879c = obj;
                    continue;
                case 26:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.i();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f30879c == null ? 0 : this.f30879c.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f30879c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f30879c = obj2;
                    aVar.d(c);
                    continue;
                case 32:
                    a2 = l.a(aVar, 32);
                    if (this.f30880d == null) {
                        a = 0;
                    } else {
                        a = this.f30880d.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30880d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f30880d = obj;
                    continue;
                case 34:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.j();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f30880d == null ? 0 : this.f30880d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f30880d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f30880d = obj2;
                    aVar.d(c);
                    continue;
                case 40:
                    a2 = l.a(aVar, 40);
                    if (this.f30881e == null) {
                        a = 0;
                    } else {
                        a = this.f30881e.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30881e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f30881e = obj;
                    continue;
                case 42:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.j();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f30881e == null ? 0 : this.f30881e.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f30881e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f30881e = obj2;
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
