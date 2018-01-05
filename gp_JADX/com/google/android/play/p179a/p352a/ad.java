package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ad extends C0758b {
    public String[] f30746a;
    public String[] f30747b;
    public int[] f30748c;
    public long[] f30749d;
    public long[] f30750e;
    public C6201l f30751f;
    public C6201l f30752g;

    public ad() {
        this.f30746a = l.j;
        this.f30747b = l.j;
        this.f30748c = l.e;
        this.f30749d = l.f;
        this.f30750e = l.f;
        this.f30751f = null;
        this.f30752g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        if (!h.a(this.f30746a, adVar.f30746a)) {
            return false;
        }
        if (!h.a(this.f30747b, adVar.f30747b)) {
            return false;
        }
        if (!h.a(this.f30748c, adVar.f30748c)) {
            return false;
        }
        if (!h.a(this.f30749d, adVar.f30749d)) {
            return false;
        }
        if (!h.a(this.f30750e, adVar.f30750e)) {
            return false;
        }
        if (this.f30751f == null) {
            if (adVar.f30751f != null) {
                return false;
            }
        } else if (!this.f30751f.equals(adVar.f30751f)) {
            return false;
        }
        if (this.f30752g == null) {
            if (adVar.f30752g != null) {
                return false;
            }
        } else if (!this.f30752g.equals(adVar.f30752g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(adVar.aO);
        }
        if (adVar.aO == null || adVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f30746a)) * 31) + h.a(this.f30747b)) * 31) + h.a(this.f30748c)) * 31) + h.a(this.f30749d)) * 31) + h.a(this.f30750e);
        C6201l c6201l = this.f30751f;
        hashCode = (c6201l == null ? 0 : c6201l.hashCode()) + (hashCode * 31);
        c6201l = this.f30752g;
        hashCode = ((c6201l == null ? 0 : c6201l.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f30746a != null && this.f30746a.length > 0) {
            for (String str : this.f30746a) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if (this.f30747b != null && this.f30747b.length > 0) {
            for (String str2 : this.f30747b) {
                if (str2 != null) {
                    codedOutputByteBufferNano.a(2, str2);
                }
            }
        }
        if (this.f30748c != null && this.f30748c.length > 0) {
            for (int a : this.f30748c) {
                codedOutputByteBufferNano.a(3, a);
            }
        }
        if (this.f30749d != null && this.f30749d.length > 0) {
            for (long b : this.f30749d) {
                codedOutputByteBufferNano.b(4, b);
            }
        }
        if (this.f30750e != null && this.f30750e.length > 0) {
            while (i < this.f30750e.length) {
                codedOutputByteBufferNano.b(5, this.f30750e[i]);
                i++;
            }
        }
        if (this.f30751f != null) {
            codedOutputByteBufferNano.b(6, this.f30751f);
        }
        if (this.f30752g != null) {
            codedOutputByteBufferNano.b(7, this.f30752g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo1128b();
        if (this.f30746a == null || this.f30746a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f30746a) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f30747b != null && this.f30747b.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2 : this.f30747b) {
                if (str2 != null) {
                    b++;
                    i3 += CodedOutputByteBufferNano.b(str2);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (this.f30748c != null && this.f30748c.length > 0) {
            i3 = 0;
            for (int b2 : this.f30748c) {
                i3 += CodedOutputByteBufferNano.c(b2);
            }
            i = (i + i3) + (this.f30748c.length * 1);
        }
        if (this.f30749d != null && this.f30749d.length > 0) {
            i3 = 0;
            for (long c : this.f30749d) {
                i3 += CodedOutputByteBufferNano.c(c);
            }
            i = (i + i3) + (this.f30749d.length * 1);
        }
        if (this.f30750e != null && this.f30750e.length > 0) {
            i2 = 0;
            while (i4 < this.f30750e.length) {
                i2 += CodedOutputByteBufferNano.c(this.f30750e[i4]);
                i4++;
            }
            i = (i + i2) + (this.f30750e.length * 1);
        }
        if (this.f30751f != null) {
            i += CodedOutputByteBufferNano.d(6, this.f30751f);
        }
        if (this.f30752g != null) {
            return i + CodedOutputByteBufferNano.d(7, this.f30752g);
        }
        return i;
    }

    public static ad m28541a(byte[] bArr) {
        return (ad) C0757i.m4905a(new ad(), bArr);
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
                    a = this.f30746a == null ? 0 : this.f30746a.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30746a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f30746a = obj;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f30747b == null ? 0 : this.f30747b.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30747b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f30747b = obj;
                    continue;
                case 24:
                    a2 = l.a(aVar, 24);
                    if (this.f30748c == null) {
                        a = 0;
                    } else {
                        a = this.f30748c.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30748c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.i();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.i();
                    this.f30748c = obj;
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
                    a2 = this.f30748c == null ? 0 : this.f30748c.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f30748c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.i();
                        a2++;
                    }
                    this.f30748c = obj2;
                    aVar.d(c);
                    continue;
                case 32:
                    a2 = l.a(aVar, 32);
                    if (this.f30749d == null) {
                        a = 0;
                    } else {
                        a = this.f30749d.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30749d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f30749d = obj;
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
                    a2 = this.f30749d == null ? 0 : this.f30749d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f30749d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f30749d = obj2;
                    aVar.d(c);
                    continue;
                case 40:
                    a2 = l.a(aVar, 40);
                    if (this.f30750e == null) {
                        a = 0;
                    } else {
                        a = this.f30750e.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30750e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f30750e = obj;
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
                    a2 = this.f30750e == null ? 0 : this.f30750e.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f30750e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f30750e = obj2;
                    aVar.d(c);
                    continue;
                case 50:
                    if (this.f30751f == null) {
                        this.f30751f = new C6201l();
                    }
                    aVar.a(this.f30751f);
                    continue;
                case 58:
                    if (this.f30752g == null) {
                        this.f30752g = new C6201l();
                    }
                    aVar.a(this.f30752g);
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
