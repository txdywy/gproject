package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7371a extends b {
    public static volatile C7371a[] f36847a;
    public int f36848b;
    public long f36849c;
    public C7376f[] f36850d;
    public C7385o f36851e;
    public int[] f36852f;
    public int[] f36853g;
    public int[] f36854h;

    public static C7371a[] m34923d() {
        if (f36847a == null) {
            synchronized (C7219h.f35465b) {
                if (f36847a == null) {
                    f36847a = new C7371a[0];
                }
            }
        }
        return f36847a;
    }

    public C7371a() {
        this.f36848b = 0;
        this.f36849c = 0;
        this.f36850d = C7376f.m34941d();
        this.f36851e = null;
        this.f36852f = C7222l.f35472e;
        this.f36853g = C7222l.f35472e;
        this.f36854h = C7222l.f35472e;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34925a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f36848b & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36849c);
        }
        if (this.f36850d != null && this.f36850d.length > 0) {
            for (i iVar : this.f36850d) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (this.f36851e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36851e);
        }
        if (this.f36852f != null && this.f36852f.length > 0) {
            for (int a : this.f36852f) {
                codedOutputByteBufferNano.m33518a(4, a);
            }
        }
        if (this.f36853g != null && this.f36853g.length > 0) {
            for (int a2 : this.f36853g) {
                codedOutputByteBufferNano.m33518a(5, a2);
            }
        }
        if (this.f36854h != null && this.f36854h.length > 0) {
            while (i < this.f36854h.length) {
                codedOutputByteBufferNano.m33518a(6, this.f36854h[i]);
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34926b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if ((this.f36848b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36849c);
        }
        if (this.f36850d != null && this.f36850d.length > 0) {
            i = b;
            for (i iVar : this.f36850d) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (this.f36851e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36851e);
        }
        if (this.f36852f != null && this.f36852f.length > 0) {
            i2 = 0;
            for (int c : this.f36852f) {
                i2 += CodedOutputByteBufferNano.m33498c(c);
            }
            b = (b + i2) + (this.f36852f.length * 1);
        }
        if (this.f36853g != null && this.f36853g.length > 0) {
            i2 = 0;
            for (int c2 : this.f36853g) {
                i2 += CodedOutputByteBufferNano.m33498c(c2);
            }
            b = (b + i2) + (this.f36853g.length * 1);
        }
        if (this.f36854h == null || this.f36854h.length <= 0) {
            return b;
        }
        i = 0;
        while (i3 < this.f36854h.length) {
            i += CodedOutputByteBufferNano.m33498c(this.f36854h[i3]);
            i3++;
        }
        return (b + i) + (this.f36854h.length * 1);
    }

    private final C7371a m34922b(C7213a c7213a) {
        int a;
        int o;
        while (true) {
            int a2 = c7213a.m33550a();
            int a3;
            int length;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.f36849c = c7213a.m33568j();
                    this.f36848b |= 1;
                    continue;
                case 18:
                    a3 = C7222l.m33624a(c7213a, 18);
                    length = this.f36850d == null ? 0 : this.f36850d.length;
                    obj = new C7376f[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f36850d, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new C7376f();
                        c7213a.m33552a(obj[length]);
                        c7213a.m33550a();
                        length++;
                    }
                    obj[length] = new C7376f();
                    c7213a.m33552a(obj[length]);
                    this.f36850d = obj;
                    continue;
                case 26:
                    if (this.f36851e == null) {
                        this.f36851e = new C7385o();
                    }
                    c7213a.m33552a(this.f36851e);
                    continue;
                case 32:
                    a = C7222l.m33624a(c7213a, 32);
                    obj2 = new int[a];
                    length = 0;
                    for (a3 = 0; a3 < a; a3++) {
                        if (a3 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj2[length] = C7373c.m34930a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a2);
                        }
                    }
                    if (length != 0) {
                        a3 = this.f36852f == null ? 0 : this.f36852f.length;
                        if (a3 != 0 || length != obj2.length) {
                            obj3 = new int[(a3 + length)];
                            if (a3 != 0) {
                                System.arraycopy(this.f36852f, 0, obj3, 0, a3);
                            }
                            System.arraycopy(obj2, 0, obj3, a3, length);
                            this.f36852f = obj3;
                            break;
                        }
                        this.f36852f = obj2;
                        break;
                    }
                    continue;
                case 34:
                    a2 = c7213a.m33558c(c7213a.m33567i());
                    a3 = c7213a.m33573o();
                    length = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            C7373c.m34930a(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (length != 0) {
                        c7213a.m33562e(a3);
                        if (this.f36852f == null) {
                            a3 = 0;
                        } else {
                            a3 = this.f36852f.length;
                        }
                        obj4 = new int[(length + a3)];
                        if (a3 != 0) {
                            System.arraycopy(this.f36852f, 0, obj4, 0, a3);
                        }
                        while (c7213a.m33571m() > 0) {
                            a = c7213a.m33573o();
                            try {
                                obj4[a3] = C7373c.m34930a(c7213a.m33567i());
                                a3++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a);
                                a(c7213a, 32);
                            }
                        }
                        this.f36852f = obj4;
                    }
                    c7213a.m33561d(a2);
                    continue;
                case 40:
                    a = C7222l.m33624a(c7213a, 40);
                    obj2 = new int[a];
                    length = 0;
                    for (a3 = 0; a3 < a; a3++) {
                        if (a3 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj2[length] = C7372b.m34929c(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e4) {
                            c7213a.m33562e(o);
                            a(c7213a, a2);
                        }
                    }
                    if (length != 0) {
                        a3 = this.f36853g == null ? 0 : this.f36853g.length;
                        if (a3 != 0 || length != obj2.length) {
                            obj3 = new int[(a3 + length)];
                            if (a3 != 0) {
                                System.arraycopy(this.f36853g, 0, obj3, 0, a3);
                            }
                            System.arraycopy(obj2, 0, obj3, a3, length);
                            this.f36853g = obj3;
                            break;
                        }
                        this.f36853g = obj2;
                        break;
                    }
                    continue;
                case 42:
                    a2 = c7213a.m33558c(c7213a.m33567i());
                    a3 = c7213a.m33573o();
                    length = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            C7372b.m34929c(c7213a.m33567i());
                            length++;
                        } catch (IllegalArgumentException e5) {
                        }
                    }
                    if (length != 0) {
                        c7213a.m33562e(a3);
                        if (this.f36853g == null) {
                            a3 = 0;
                        } else {
                            a3 = this.f36853g.length;
                        }
                        obj4 = new int[(length + a3)];
                        if (a3 != 0) {
                            System.arraycopy(this.f36853g, 0, obj4, 0, a3);
                        }
                        while (c7213a.m33571m() > 0) {
                            a = c7213a.m33573o();
                            try {
                                obj4[a3] = C7372b.m34929c(c7213a.m33567i());
                                a3++;
                            } catch (IllegalArgumentException e6) {
                                c7213a.m33562e(a);
                                a(c7213a, 40);
                            }
                        }
                        this.f36853g = obj4;
                    }
                    c7213a.m33561d(a2);
                    continue;
                case 48:
                    a3 = C7222l.m33624a(c7213a, 48);
                    if (this.f36854h == null) {
                        length = 0;
                    } else {
                        length = this.f36854h.length;
                    }
                    obj = new int[(a3 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f36854h, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = c7213a.m33567i();
                        c7213a.m33550a();
                        length++;
                    }
                    obj[length] = c7213a.m33567i();
                    this.f36854h = obj;
                    continue;
                case 50:
                    a2 = c7213a.m33558c(c7213a.m33567i());
                    a3 = c7213a.m33573o();
                    length = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        length++;
                    }
                    c7213a.m33562e(a3);
                    a3 = this.f36854h == null ? 0 : this.f36854h.length;
                    obj4 = new int[(length + a3)];
                    if (a3 != 0) {
                        System.arraycopy(this.f36854h, 0, obj4, 0, a3);
                    }
                    while (a3 < obj4.length) {
                        obj4[a3] = c7213a.m33567i();
                        a3++;
                    }
                    this.f36854h = obj4;
                    c7213a.m33561d(a2);
                    continue;
                default:
                    if (!super.a(c7213a, a2)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m34924a(C7213a c7213a) {
        return m34922b(c7213a);
    }
}
