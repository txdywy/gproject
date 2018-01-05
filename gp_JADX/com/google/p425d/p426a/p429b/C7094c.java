package com.google.p425d.p426a.p429b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7094c extends b implements Cloneable {
    public static volatile C7094c[] f34701a;
    public C7103l f34702b;
    public C7101j[] f34703c;
    public byte[] f34704d;
    public String f34705e;
    public int[] f34706f;
    public C7096e[] f34707g;

    public static C7094c[] m32236d() {
        if (f34701a == null) {
            synchronized (C7219h.f35465b) {
                if (f34701a == null) {
                    f34701a = new C7094c[0];
                }
            }
        }
        return f34701a;
    }

    public C7094c() {
        this.f34702b = null;
        this.f34703c = C7101j.m32271d();
        this.f34704d = C7222l.f35479l;
        this.f34705e = "";
        this.f34706f = C7222l.f35472e;
        this.f34707g = C7096e.m32246d();
        this.aO = null;
        this.aP = -1;
    }

    private final C7094c m32237e() {
        int i = 0;
        try {
            C7094c c7094c = (C7094c) super.cK_();
            if (this.f34702b != null) {
                c7094c.f34702b = (C7103l) this.f34702b.clone();
            }
            if (this.f34703c != null && this.f34703c.length > 0) {
                c7094c.f34703c = new C7101j[this.f34703c.length];
                for (int i2 = 0; i2 < this.f34703c.length; i2++) {
                    if (this.f34703c[i2] != null) {
                        c7094c.f34703c[i2] = (C7101j) this.f34703c[i2].clone();
                    }
                }
            }
            if (this.f34706f != null && this.f34706f.length > 0) {
                c7094c.f34706f = (int[]) this.f34706f.clone();
            }
            if (this.f34707g != null && this.f34707g.length > 0) {
                c7094c.f34707g = new C7096e[this.f34707g.length];
                while (i < this.f34707g.length) {
                    if (this.f34707g[i] != null) {
                        c7094c.f34707g[i] = (C7096e) this.f34707g[i].clone();
                    }
                    i++;
                }
            }
            return c7094c;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7094c)) {
            return false;
        }
        C7094c c7094c = (C7094c) obj;
        if (this.f34702b == null) {
            if (c7094c.f34702b != null) {
                return false;
            }
        } else if (!this.f34702b.equals(c7094c.f34702b)) {
            return false;
        }
        if (!C7219h.m33616a(this.f34703c, c7094c.f34703c)) {
            return false;
        }
        if (!Arrays.equals(this.f34704d, c7094c.f34704d)) {
            return false;
        }
        if (this.f34705e == null) {
            if (c7094c.f34705e != null) {
                return false;
            }
        } else if (!this.f34705e.equals(c7094c.f34705e)) {
            return false;
        }
        if (!C7219h.m33614a(this.f34706f, c7094c.f34706f)) {
            return false;
        }
        if (!C7219h.m33616a(this.f34707g, c7094c.f34707g)) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7094c.aO);
        }
        if (c7094c.aO == null || c7094c.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        C7103l c7103l = this.f34702b;
        hashCode = ((((((this.f34705e == null ? 0 : this.f34705e.hashCode()) + (((((((c7103l == null ? 0 : c7103l.hashCode()) + (hashCode * 31)) * 31) + C7219h.m33609a(this.f34703c)) * 31) + Arrays.hashCode(this.f34704d)) * 31)) * 31) + C7219h.m33607a(this.f34706f)) * 31) + C7219h.m33609a(this.f34707g)) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void m32239a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f34702b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34702b);
        }
        if (this.f34703c != null && this.f34703c.length > 0) {
            for (i iVar : this.f34703c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        if (!Arrays.equals(this.f34704d, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(3, this.f34704d);
        }
        if (!(this.f34705e == null || this.f34705e.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f34705e);
        }
        if (this.f34706f != null && this.f34706f.length > 0) {
            for (int a : this.f34706f) {
                codedOutputByteBufferNano.m33518a(5, a);
            }
        }
        if (this.f34707g != null && this.f34707g.length > 0) {
            while (i < this.f34707g.length) {
                i iVar2 = this.f34707g[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(6, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32240b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f34702b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34702b);
        }
        if (this.f34703c != null && this.f34703c.length > 0) {
            i = b;
            for (i iVar : this.f34703c) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(2, iVar);
                }
            }
            b = i;
        }
        if (!Arrays.equals(this.f34704d, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f34704d);
        }
        if (!(this.f34705e == null || this.f34705e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f34705e);
        }
        if (this.f34706f != null && this.f34706f.length > 0) {
            int i3 = 0;
            for (int c : this.f34706f) {
                i3 += CodedOutputByteBufferNano.m33498c(c);
            }
            b = (b + i3) + (this.f34706f.length * 1);
        }
        if (this.f34707g != null && this.f34707g.length > 0) {
            while (i2 < this.f34707g.length) {
                i iVar2 = this.f34707g[i2];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(6, iVar2);
                }
                i2++;
            }
        }
        return b;
    }

    public final /* synthetic */ b cK_() {
        return (C7094c) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7094c) clone();
    }

    public final /* synthetic */ i m32238a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34702b == null) {
                        this.f34702b = new C7103l();
                    }
                    c7213a.m33552a(this.f34702b);
                    continue;
                case 18:
                    a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f34703c == null ? 0 : this.f34703c.length;
                    obj = new C7101j[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34703c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7101j();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7101j();
                    c7213a.m33552a(obj[a]);
                    this.f34703c = obj;
                    continue;
                case 26:
                    this.f34704d = c7213a.m33565g();
                    continue;
                case 34:
                    this.f34705e = c7213a.m33564f();
                    continue;
                case 40:
                    a2 = C7222l.m33624a(c7213a, 40);
                    if (this.f34706f == null) {
                        a = 0;
                    } else {
                        a = this.f34706f.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34706f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f34706f = obj;
                    continue;
                case 42:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f34706f == null ? 0 : this.f34706f.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f34706f, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f34706f = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 50:
                    a2 = C7222l.m33624a(c7213a, 50);
                    a = this.f34707g == null ? 0 : this.f34707g.length;
                    obj = new C7096e[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34707g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7096e();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7096e();
                    c7213a.m33552a(obj[a]);
                    this.f34707g = obj;
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
        return m32237e();
    }
}
