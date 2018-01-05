package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7092a extends b implements Cloneable {
    public int[] f34693a;
    public int[] f34694b;
    public int[] f34695c;
    public int[] f34696d;

    public C7092a() {
        this.f34693a = C7222l.f35472e;
        this.f34694b = C7222l.f35472e;
        this.f34695c = C7222l.f35472e;
        this.f34696d = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    private final C7092a m32227d() {
        try {
            C7092a c7092a = (C7092a) super.cK_();
            if (this.f34693a != null && this.f34693a.length > 0) {
                c7092a.f34693a = (int[]) this.f34693a.clone();
            }
            if (this.f34694b != null && this.f34694b.length > 0) {
                c7092a.f34694b = (int[]) this.f34694b.clone();
            }
            if (this.f34695c != null && this.f34695c.length > 0) {
                c7092a.f34695c = (int[]) this.f34695c.clone();
            }
            if (this.f34696d != null && this.f34696d.length > 0) {
                c7092a.f34696d = (int[]) this.f34696d.clone();
            }
            return c7092a;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7092a)) {
            return false;
        }
        C7092a c7092a = (C7092a) obj;
        if (!C7219h.m33614a(this.f34693a, c7092a.f34693a)) {
            return false;
        }
        if (!C7219h.m33614a(this.f34694b, c7092a.f34694b)) {
            return false;
        }
        if (!C7219h.m33614a(this.f34695c, c7092a.f34695c)) {
            return false;
        }
        if (!C7219h.m33614a(this.f34696d, c7092a.f34696d)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7092a.aO);
        }
        if (c7092a.aO == null || c7092a.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + C7219h.m33607a(this.f34693a)) * 31) + C7219h.m33607a(this.f34694b)) * 31) + C7219h.m33607a(this.f34695c)) * 31) + C7219h.m33607a(this.f34696d)) * 31;
        if (this.aO == null || this.aO.m33598b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void m32229a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f34693a != null && this.f34693a.length > 0) {
            for (int a : this.f34693a) {
                codedOutputByteBufferNano.m33518a(1, a);
            }
        }
        if (this.f34694b != null && this.f34694b.length > 0) {
            for (int a2 : this.f34694b) {
                codedOutputByteBufferNano.m33518a(2, a2);
            }
        }
        if (this.f34695c != null && this.f34695c.length > 0) {
            for (int a22 : this.f34695c) {
                codedOutputByteBufferNano.m33518a(3, a22);
            }
        }
        if (this.f34696d != null && this.f34696d.length > 0) {
            while (i < this.f34696d.length) {
                codedOutputByteBufferNano.m33518a(4, this.f34696d[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32230b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.f34693a == null || this.f34693a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            for (int c : this.f34693a) {
                i2 += CodedOutputByteBufferNano.m33498c(c);
            }
            i = (b + i2) + (this.f34693a.length * 1);
        }
        if (this.f34694b != null && this.f34694b.length > 0) {
            b = 0;
            for (int c2 : this.f34694b) {
                b += CodedOutputByteBufferNano.m33498c(c2);
            }
            i = (i + b) + (this.f34694b.length * 1);
        }
        if (this.f34695c != null && this.f34695c.length > 0) {
            b = 0;
            for (int c22 : this.f34695c) {
                b += CodedOutputByteBufferNano.m33498c(c22);
            }
            i = (i + b) + (this.f34695c.length * 1);
        }
        if (this.f34696d == null || this.f34696d.length <= 0) {
            return i;
        }
        i2 = 0;
        while (i3 < this.f34696d.length) {
            i2 += CodedOutputByteBufferNano.m33498c(this.f34696d[i3]);
            i3++;
        }
        return (i + i2) + (this.f34696d.length * 1);
    }

    public final /* synthetic */ b cK_() {
        return (C7092a) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7092a) clone();
    }

    public final /* synthetic */ i m32228a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            int c;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a2 = C7222l.m33624a(c7213a, 8);
                    if (this.f34693a == null) {
                        a = 0;
                    } else {
                        a = this.f34693a.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34693a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34693a = obj;
                    continue;
                case 10:
                    c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34693a == null ? 0 : this.f34693a.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34693a, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34693a = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 16:
                    a2 = C7222l.m33624a(c7213a, 16);
                    if (this.f34694b == null) {
                        a = 0;
                    } else {
                        a = this.f34694b.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34694b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34694b = obj;
                    continue;
                case 18:
                    c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34694b == null ? 0 : this.f34694b.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34694b, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34694b = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 24:
                    a2 = C7222l.m33624a(c7213a, 24);
                    if (this.f34695c == null) {
                        a = 0;
                    } else {
                        a = this.f34695c.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34695c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34695c = obj;
                    continue;
                case 26:
                    c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34695c == null ? 0 : this.f34695c.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34695c, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34695c = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 32:
                    a2 = C7222l.m33624a(c7213a, 32);
                    if (this.f34696d == null) {
                        a = 0;
                    } else {
                        a = this.f34696d.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34696d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34696d = obj;
                    continue;
                case 34:
                    c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34696d == null ? 0 : this.f34696d.length;
                    obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34696d, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34696d = obj2;
                    c7213a.m33561d(c);
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ Object clone() {
        return m32227d();
    }
}
