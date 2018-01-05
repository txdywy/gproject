package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ds extends C0758b {
    public static volatile ds[] f12211a;
    public dr f12212b;
    public String[] f12213c;
    public long[] f12214d;
    public boolean[] f12215e;
    public double[] f12216f;

    public static ds[] aX_() {
        if (f12211a == null) {
            synchronized (h.b) {
                if (f12211a == null) {
                    f12211a = new ds[0];
                }
            }
        }
        return f12211a;
    }

    public ds() {
        this.f12212b = null;
        this.f12213c = l.j;
        this.f12214d = l.f;
        this.f12215e = l.i;
        this.f12216f = l.h;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ds)) {
            return false;
        }
        ds dsVar = (ds) obj;
        if (this.f12212b == null) {
            if (dsVar.f12212b != null) {
                return false;
            }
        } else if (!this.f12212b.equals(dsVar.f12212b)) {
            return false;
        }
        if (!h.a(this.f12213c, dsVar.f12213c)) {
            return false;
        }
        if (!h.a(this.f12214d, dsVar.f12214d)) {
            return false;
        }
        if (!h.a(this.f12215e, dsVar.f12215e)) {
            return false;
        }
        if (!h.a(this.f12216f, dsVar.f12216f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dsVar.aO);
        }
        if (dsVar.aO == null || dsVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        dr drVar = this.f12212b;
        hashCode = ((((((((((drVar == null ? 0 : drVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f12213c)) * 31) + h.a(this.f12214d)) * 31) + h.a(this.f12215e)) * 31) + h.a(this.f12216f)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f12212b != null) {
            codedOutputByteBufferNano.b(1, this.f12212b);
        }
        if (this.f12213c != null && this.f12213c.length > 0) {
            for (String str : this.f12213c) {
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        if (this.f12214d != null && this.f12214d.length > 0) {
            for (long b : this.f12214d) {
                codedOutputByteBufferNano.b(3, b);
            }
        }
        if (this.f12215e != null && this.f12215e.length > 0) {
            for (boolean a : this.f12215e) {
                codedOutputByteBufferNano.a(4, a);
            }
        }
        if (this.f12216f != null && this.f12216f.length > 0) {
            while (i < this.f12216f.length) {
                codedOutputByteBufferNano.a(5, this.f12216f[i]);
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f12212b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12212b);
        }
        if (this.f12213c != null && this.f12213c.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f12213c) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f12214d != null && this.f12214d.length > 0) {
            i = 0;
            while (i2 < this.f12214d.length) {
                i += CodedOutputByteBufferNano.c(this.f12214d[i2]);
                i2++;
            }
            b = (b + i) + (this.f12214d.length * 1);
        }
        if (this.f12215e != null && this.f12215e.length > 0) {
            b = (b + (this.f12215e.length * 1)) + (this.f12215e.length * 1);
        }
        if (this.f12216f == null || this.f12216f.length <= 0) {
            return b;
        }
        return (b + (this.f12216f.length * 8)) + (this.f12216f.length * 1);
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
                    if (this.f12212b == null) {
                        this.f12212b = new dr();
                    }
                    aVar.a(this.f12212b);
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f12213c == null ? 0 : this.f12213c.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12213c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f12213c = obj;
                    continue;
                case 24:
                    a2 = l.a(aVar, 24);
                    if (this.f12214d == null) {
                        a = 0;
                    } else {
                        a = this.f12214d.length;
                    }
                    obj = new long[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12214d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.j();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.j();
                    this.f12214d = obj;
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
                    a2 = this.f12214d == null ? 0 : this.f12214d.length;
                    obj2 = new long[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f12214d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.j();
                        a2++;
                    }
                    this.f12214d = obj2;
                    aVar.d(c);
                    continue;
                case 32:
                    a2 = l.a(aVar, 32);
                    a = this.f12215e == null ? 0 : this.f12215e.length;
                    obj = new boolean[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12215e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.e();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.e();
                    this.f12215e = obj;
                    continue;
                case 34:
                    c = aVar.c(aVar.i());
                    a2 = aVar.o();
                    a = 0;
                    while (aVar.m() > 0) {
                        aVar.e();
                        a++;
                    }
                    aVar.e(a2);
                    a2 = this.f12215e == null ? 0 : this.f12215e.length;
                    obj2 = new boolean[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f12215e, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = aVar.e();
                        a2++;
                    }
                    this.f12215e = obj2;
                    aVar.d(c);
                    continue;
                case 41:
                    a2 = l.a(aVar, 41);
                    if (this.f12216f == null) {
                        a = 0;
                    } else {
                        a = this.f12216f.length;
                    }
                    obj = new double[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12216f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = Double.longBitsToDouble(aVar.l());
                        aVar.a();
                        a++;
                    }
                    obj[a] = Double.longBitsToDouble(aVar.l());
                    this.f12216f = obj;
                    continue;
                case 42:
                    a = aVar.i();
                    a2 = aVar.c(a);
                    c = a / 8;
                    a = this.f12216f == null ? 0 : this.f12216f.length;
                    Object obj3 = new double[(c + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12216f, 0, obj3, 0, a);
                    }
                    while (a < obj3.length) {
                        obj3[a] = Double.longBitsToDouble(aVar.l());
                        a++;
                    }
                    this.f12216f = obj3;
                    aVar.d(a2);
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
