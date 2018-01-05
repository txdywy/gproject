package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7374d extends b {
    public C7385o f36855a;
    public int[] f36856b;
    public String[] f36857c;
    public int[] f36858d;
    public String[] f36859e;
    public int[] f36860f;
    public C7375e[] f36861g;

    public C7374d() {
        this.f36855a = null;
        this.f36856b = C7222l.f35472e;
        this.f36857c = C7222l.f35477j;
        this.f36858d = C7222l.f35472e;
        this.f36859e = C7222l.f35477j;
        this.f36860f = C7222l.f35472e;
        this.f36861g = C7375e.m34937d();
        this.aO = null;
        this.aP = -1;
    }

    public final void m34934a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f36855a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36855a);
        }
        if (this.f36856b != null && this.f36856b.length > 0) {
            for (int a : this.f36856b) {
                codedOutputByteBufferNano.m33518a(2, a);
            }
        }
        if (this.f36857c != null && this.f36857c.length > 0) {
            for (String str : this.f36857c) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(3, str);
                }
            }
        }
        if (this.f36858d != null && this.f36858d.length > 0) {
            for (int a2 : this.f36858d) {
                codedOutputByteBufferNano.m33518a(4, a2);
            }
        }
        if (this.f36859e != null && this.f36859e.length > 0) {
            for (String str2 : this.f36859e) {
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(5, str2);
                }
            }
        }
        if (this.f36860f != null && this.f36860f.length > 0) {
            for (int a22 : this.f36860f) {
                codedOutputByteBufferNano.m33518a(6, a22);
            }
        }
        if (this.f36861g != null && this.f36861g.length > 0) {
            while (i < this.f36861g.length) {
                i iVar = this.f36861g[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(7, iVar);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34935b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.f36855a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36855a);
        }
        if (this.f36856b != null && this.f36856b.length > 0) {
            i = 0;
            for (int i22 : this.f36856b) {
                i += CodedOutputByteBufferNano.m33498c(i22);
            }
            b = (b + i) + (this.f36856b.length * 1);
        }
        if (this.f36857c != null && this.f36857c.length > 0) {
            i = 0;
            i22 = 0;
            for (String str : this.f36857c) {
                if (str != null) {
                    i22++;
                    i += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i) + (i22 * 1);
        }
        if (this.f36858d != null && this.f36858d.length > 0) {
            i = 0;
            for (int i222 : this.f36858d) {
                i += CodedOutputByteBufferNano.m33498c(i222);
            }
            b = (b + i) + (this.f36858d.length * 1);
        }
        if (this.f36859e != null && this.f36859e.length > 0) {
            i = 0;
            i222 = 0;
            for (String str2 : this.f36859e) {
                if (str2 != null) {
                    i222++;
                    i += CodedOutputByteBufferNano.m33495b(str2);
                }
            }
            b = (b + i) + (i222 * 1);
        }
        if (this.f36860f != null && this.f36860f.length > 0) {
            i = 0;
            for (int i2222 : this.f36860f) {
                i += CodedOutputByteBufferNano.m33498c(i2222);
            }
            b = (b + i) + (this.f36860f.length * 1);
        }
        if (this.f36861g != null && this.f36861g.length > 0) {
            while (i3 < this.f36861g.length) {
                i iVar = this.f36861g[i3];
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(7, iVar);
                }
                i3++;
            }
        }
        return b;
    }

    private final C7374d m34932b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            int i;
            int i2;
            Object obj2;
            Object obj3;
            Object obj4;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36855a == null) {
                        this.f36855a = new C7385o();
                    }
                    c7213a.m33552a(this.f36855a);
                    continue;
                case 16:
                    a2 = C7222l.m33624a(c7213a, 16);
                    obj = new int[a2];
                    i = 0;
                    for (i2 = 0; i2 < a2; i2++) {
                        if (i2 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj[i] = C7372b.m34928b(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f36856b == null ? 0 : this.f36856b.length;
                        if (i2 != 0 || i != obj.length) {
                            obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f36856b, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f36856b = obj2;
                            break;
                        }
                        this.f36856b = obj;
                        break;
                    }
                    continue;
                case 18:
                    a = c7213a.m33558c(c7213a.m33567i());
                    i2 = c7213a.m33573o();
                    i = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            C7372b.m34928b(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        c7213a.m33562e(i2);
                        if (this.f36856b == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f36856b.length;
                        }
                        obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f36856b, 0, obj3, 0, i2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a2 = c7213a.m33573o();
                            try {
                                obj3[i2] = C7372b.m34928b(c7213a.m33567i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                c7213a.m33562e(a2);
                                a(c7213a, 16);
                            }
                        }
                        this.f36856b = obj3;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 26:
                    i2 = C7222l.m33624a(c7213a, 26);
                    i = this.f36857c == null ? 0 : this.f36857c.length;
                    obj4 = new String[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(this.f36857c, 0, obj4, 0, i);
                    }
                    while (i < obj4.length - 1) {
                        obj4[i] = c7213a.m33564f();
                        c7213a.m33550a();
                        i++;
                    }
                    obj4[i] = c7213a.m33564f();
                    this.f36857c = obj4;
                    continue;
                case 32:
                    a2 = C7222l.m33624a(c7213a, 32);
                    obj = new int[a2];
                    i = 0;
                    for (i2 = 0; i2 < a2; i2++) {
                        if (i2 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj[i] = C7372b.m34927a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e4) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f36858d == null ? 0 : this.f36858d.length;
                        if (i2 != 0 || i != obj.length) {
                            obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f36858d, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f36858d = obj2;
                            break;
                        }
                        this.f36858d = obj;
                        break;
                    }
                    continue;
                case 34:
                    a = c7213a.m33558c(c7213a.m33567i());
                    i2 = c7213a.m33573o();
                    i = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            C7372b.m34927a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e5) {
                        }
                    }
                    if (i != 0) {
                        c7213a.m33562e(i2);
                        if (this.f36858d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f36858d.length;
                        }
                        obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f36858d, 0, obj3, 0, i2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a2 = c7213a.m33573o();
                            try {
                                obj3[i2] = C7372b.m34927a(c7213a.m33567i());
                                i2++;
                            } catch (IllegalArgumentException e6) {
                                c7213a.m33562e(a2);
                                a(c7213a, 32);
                            }
                        }
                        this.f36858d = obj3;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 42:
                    i2 = C7222l.m33624a(c7213a, 42);
                    i = this.f36859e == null ? 0 : this.f36859e.length;
                    obj4 = new String[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(this.f36859e, 0, obj4, 0, i);
                    }
                    while (i < obj4.length - 1) {
                        obj4[i] = c7213a.m33564f();
                        c7213a.m33550a();
                        i++;
                    }
                    obj4[i] = c7213a.m33564f();
                    this.f36859e = obj4;
                    continue;
                case 48:
                    a2 = C7222l.m33624a(c7213a, 48);
                    obj = new int[a2];
                    i = 0;
                    for (i2 = 0; i2 < a2; i2++) {
                        if (i2 != 0) {
                            c7213a.m33550a();
                        }
                        o = c7213a.m33573o();
                        try {
                            obj[i] = C7373c.m34930a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e7) {
                            c7213a.m33562e(o);
                            a(c7213a, a);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f36860f == null ? 0 : this.f36860f.length;
                        if (i2 != 0 || i != obj.length) {
                            obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f36860f, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f36860f = obj2;
                            break;
                        }
                        this.f36860f = obj;
                        break;
                    }
                    continue;
                case 50:
                    a = c7213a.m33558c(c7213a.m33567i());
                    i2 = c7213a.m33573o();
                    i = 0;
                    while (c7213a.m33571m() > 0) {
                        try {
                            C7373c.m34930a(c7213a.m33567i());
                            i++;
                        } catch (IllegalArgumentException e8) {
                        }
                    }
                    if (i != 0) {
                        c7213a.m33562e(i2);
                        if (this.f36860f == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f36860f.length;
                        }
                        obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f36860f, 0, obj3, 0, i2);
                        }
                        while (c7213a.m33571m() > 0) {
                            a2 = c7213a.m33573o();
                            try {
                                obj3[i2] = C7373c.m34930a(c7213a.m33567i());
                                i2++;
                            } catch (IllegalArgumentException e9) {
                                c7213a.m33562e(a2);
                                a(c7213a, 48);
                            }
                        }
                        this.f36860f = obj3;
                    }
                    c7213a.m33561d(a);
                    continue;
                case 58:
                    i2 = C7222l.m33624a(c7213a, 58);
                    i = this.f36861g == null ? 0 : this.f36861g.length;
                    obj4 = new C7375e[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(this.f36861g, 0, obj4, 0, i);
                    }
                    while (i < obj4.length - 1) {
                        obj4[i] = new C7375e();
                        c7213a.m33552a(obj4[i]);
                        c7213a.m33550a();
                        i++;
                    }
                    obj4[i] = new C7375e();
                    c7213a.m33552a(obj4[i]);
                    this.f36861g = obj4;
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

    public final /* synthetic */ i m34933a(C7213a c7213a) {
        return m34932b(c7213a);
    }
}
