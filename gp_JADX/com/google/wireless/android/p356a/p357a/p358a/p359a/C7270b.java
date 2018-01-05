package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.common.p417d.p418a.C6974a;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7270b extends b implements Cloneable {
    public String f35694A;
    public boolean f35695B;
    public long f35696a;
    public String f35697b;
    public long f35698c;
    public int f35699d;
    public String f35700e;
    public String f35701f;
    public String f35702g;
    public String f35703h;
    public String f35704i;
    public String f35705j;
    public String f35706k;
    public String f35707l;
    public String f35708m;
    public String f35709n;
    public String f35710o;
    public String f35711p;
    public String f35712q;
    public String f35713r;
    public int f35714s;
    public boolean f35715t;
    public boolean f35716u;
    public int f35717v;
    public C7271c f35718w;
    public C6974a f35719x;
    public String f35720y;
    public String f35721z;

    public C7270b() {
        this.f35696a = 0;
        this.f35697b = "";
        this.f35698c = 0;
        this.f35699d = 0;
        this.f35700e = "";
        this.f35701f = "";
        this.f35702g = "";
        this.f35703h = "";
        this.f35704i = "";
        this.f35705j = "";
        this.f35706k = "";
        this.f35707l = "";
        this.f35708m = "";
        this.f35709n = "";
        this.f35710o = "";
        this.f35711p = "";
        this.f35712q = "";
        this.f35713r = "";
        this.f35714s = 0;
        this.f35715t = false;
        this.f35716u = false;
        this.f35717v = 0;
        this.f35718w = null;
        this.f35719x = null;
        this.f35720y = "";
        this.f35721z = "";
        this.f35694A = "";
        this.f35695B = false;
        this.aO = null;
        this.aP = -1;
    }

    private final C7270b m34151d() {
        try {
            C7270b c7270b = (C7270b) super.cK_();
            if (this.f35718w != null) {
                c7270b.f35718w = (C7271c) this.f35718w.clone();
            }
            if (this.f35719x != null) {
                c7270b.f35719x = (C6974a) this.f35719x.clone();
            }
            return c7270b;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7270b)) {
            return false;
        }
        C7270b c7270b = (C7270b) obj;
        if (this.f35696a != c7270b.f35696a) {
            return false;
        }
        if (this.f35697b == null) {
            if (c7270b.f35697b != null) {
                return false;
            }
        } else if (!this.f35697b.equals(c7270b.f35697b)) {
            return false;
        }
        if (this.f35698c != c7270b.f35698c) {
            return false;
        }
        if (this.f35699d != c7270b.f35699d) {
            return false;
        }
        if (this.f35700e == null) {
            if (c7270b.f35700e != null) {
                return false;
            }
        } else if (!this.f35700e.equals(c7270b.f35700e)) {
            return false;
        }
        if (this.f35701f == null) {
            if (c7270b.f35701f != null) {
                return false;
            }
        } else if (!this.f35701f.equals(c7270b.f35701f)) {
            return false;
        }
        if (this.f35702g == null) {
            if (c7270b.f35702g != null) {
                return false;
            }
        } else if (!this.f35702g.equals(c7270b.f35702g)) {
            return false;
        }
        if (this.f35703h == null) {
            if (c7270b.f35703h != null) {
                return false;
            }
        } else if (!this.f35703h.equals(c7270b.f35703h)) {
            return false;
        }
        if (this.f35704i == null) {
            if (c7270b.f35704i != null) {
                return false;
            }
        } else if (!this.f35704i.equals(c7270b.f35704i)) {
            return false;
        }
        if (this.f35705j == null) {
            if (c7270b.f35705j != null) {
                return false;
            }
        } else if (!this.f35705j.equals(c7270b.f35705j)) {
            return false;
        }
        if (this.f35706k == null) {
            if (c7270b.f35706k != null) {
                return false;
            }
        } else if (!this.f35706k.equals(c7270b.f35706k)) {
            return false;
        }
        if (this.f35707l == null) {
            if (c7270b.f35707l != null) {
                return false;
            }
        } else if (!this.f35707l.equals(c7270b.f35707l)) {
            return false;
        }
        if (this.f35708m == null) {
            if (c7270b.f35708m != null) {
                return false;
            }
        } else if (!this.f35708m.equals(c7270b.f35708m)) {
            return false;
        }
        if (this.f35709n == null) {
            if (c7270b.f35709n != null) {
                return false;
            }
        } else if (!this.f35709n.equals(c7270b.f35709n)) {
            return false;
        }
        if (this.f35710o == null) {
            if (c7270b.f35710o != null) {
                return false;
            }
        } else if (!this.f35710o.equals(c7270b.f35710o)) {
            return false;
        }
        if (this.f35711p == null) {
            if (c7270b.f35711p != null) {
                return false;
            }
        } else if (!this.f35711p.equals(c7270b.f35711p)) {
            return false;
        }
        if (this.f35712q == null) {
            if (c7270b.f35712q != null) {
                return false;
            }
        } else if (!this.f35712q.equals(c7270b.f35712q)) {
            return false;
        }
        if (this.f35713r == null) {
            if (c7270b.f35713r != null) {
                return false;
            }
        } else if (!this.f35713r.equals(c7270b.f35713r)) {
            return false;
        }
        if (this.f35714s != c7270b.f35714s) {
            return false;
        }
        if (this.f35715t != c7270b.f35715t) {
            return false;
        }
        if (this.f35716u != c7270b.f35716u) {
            return false;
        }
        if (this.f35717v != c7270b.f35717v) {
            return false;
        }
        if (this.f35718w == null) {
            if (c7270b.f35718w != null) {
                return false;
            }
        } else if (!this.f35718w.equals(c7270b.f35718w)) {
            return false;
        }
        if (this.f35719x == null) {
            if (c7270b.f35719x != null) {
                return false;
            }
        } else if (!this.f35719x.equals(c7270b.f35719x)) {
            return false;
        }
        if (this.f35720y == null) {
            if (c7270b.f35720y != null) {
                return false;
            }
        } else if (!this.f35720y.equals(c7270b.f35720y)) {
            return false;
        }
        if (this.f35721z == null) {
            if (c7270b.f35721z != null) {
                return false;
            }
        } else if (!this.f35721z.equals(c7270b.f35721z)) {
            return false;
        }
        if (this.f35694A == null) {
            if (c7270b.f35694A != null) {
                return false;
            }
        } else if (!this.f35694A.equals(c7270b.f35694A)) {
            return false;
        }
        if (this.f35695B != c7270b.f35695B) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c7270b.aO);
        }
        if (c7270b.aO == null || c7270b.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int i3 = 0;
        int hashCode = ((((this.f35713r == null ? 0 : this.f35713r.hashCode()) + (((this.f35712q == null ? 0 : this.f35712q.hashCode()) + (((this.f35711p == null ? 0 : this.f35711p.hashCode()) + (((this.f35710o == null ? 0 : this.f35710o.hashCode()) + (((this.f35709n == null ? 0 : this.f35709n.hashCode()) + (((this.f35708m == null ? 0 : this.f35708m.hashCode()) + (((this.f35707l == null ? 0 : this.f35707l.hashCode()) + (((this.f35706k == null ? 0 : this.f35706k.hashCode()) + (((this.f35705j == null ? 0 : this.f35705j.hashCode()) + (((this.f35704i == null ? 0 : this.f35704i.hashCode()) + (((this.f35703h == null ? 0 : this.f35703h.hashCode()) + (((this.f35702g == null ? 0 : this.f35702g.hashCode()) + (((this.f35701f == null ? 0 : this.f35701f.hashCode()) + (((this.f35700e == null ? 0 : this.f35700e.hashCode()) + (((((((this.f35697b == null ? 0 : this.f35697b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f35696a ^ (this.f35696a >>> 32)))) * 31)) * 31) + ((int) (this.f35698c ^ (this.f35698c >>> 32)))) * 31) + this.f35699d) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f35714s) * 31;
        if (this.f35715t) {
            i = 1231;
        } else {
            i = 1237;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f35716u) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = ((i + hashCode) * 31) + this.f35717v;
        C7271c c7271c = this.f35718w;
        i = (c7271c == null ? 0 : c7271c.hashCode()) + (i * 31);
        C6974a c6974a = this.f35719x;
        i = ((this.f35694A == null ? 0 : this.f35694A.hashCode()) + (((this.f35721z == null ? 0 : this.f35721z.hashCode()) + (((this.f35720y == null ? 0 : this.f35720y.hashCode()) + (((c6974a == null ? 0 : c6974a.hashCode()) + (i * 31)) * 31)) * 31)) * 31)) * 31;
        if (!this.f35695B) {
            i2 = 1237;
        }
        i = (i + i2) * 31;
        if (!(this.aO == null || this.aO.m33598b())) {
            i3 = this.aO.hashCode();
        }
        return i + i3;
    }

    public final void m34153a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35696a != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35696a);
        }
        if (!(this.f35697b == null || this.f35697b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f35697b);
        }
        if (this.f35699d != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35699d);
        }
        if (!(this.f35700e == null || this.f35700e.equals(""))) {
            codedOutputByteBufferNano.m33521a(4, this.f35700e);
        }
        if (!(this.f35701f == null || this.f35701f.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f35701f);
        }
        if (!(this.f35704i == null || this.f35704i.equals(""))) {
            codedOutputByteBufferNano.m33521a(6, this.f35704i);
        }
        if (!(this.f35705j == null || this.f35705j.equals(""))) {
            codedOutputByteBufferNano.m33521a(7, this.f35705j);
        }
        if (!(this.f35702g == null || this.f35702g.equals(""))) {
            codedOutputByteBufferNano.m33521a(8, this.f35702g);
        }
        if (!(this.f35703h == null || this.f35703h.equals(""))) {
            codedOutputByteBufferNano.m33521a(9, this.f35703h);
        }
        if (!(this.f35706k == null || this.f35706k.equals(""))) {
            codedOutputByteBufferNano.m33521a(10, this.f35706k);
        }
        if (!(this.f35707l == null || this.f35707l.equals(""))) {
            codedOutputByteBufferNano.m33521a(11, this.f35707l);
        }
        if (!(this.f35708m == null || this.f35708m.equals(""))) {
            codedOutputByteBufferNano.m33521a(12, this.f35708m);
        }
        if (!(this.f35709n == null || this.f35709n.equals(""))) {
            codedOutputByteBufferNano.m33521a(13, this.f35709n);
        }
        if (!(this.f35710o == null || this.f35710o.equals(""))) {
            codedOutputByteBufferNano.m33521a(14, this.f35710o);
        }
        if (!(this.f35711p == null || this.f35711p.equals(""))) {
            codedOutputByteBufferNano.m33521a(15, this.f35711p);
        }
        if (!(this.f35712q == null || this.f35712q.equals(""))) {
            codedOutputByteBufferNano.m33521a(16, this.f35712q);
        }
        if (!(this.f35713r == null || this.f35713r.equals(""))) {
            codedOutputByteBufferNano.m33521a(17, this.f35713r);
        }
        if (this.f35698c != 0) {
            codedOutputByteBufferNano.m33531b(18, this.f35698c);
        }
        if (this.f35714s != 0) {
            codedOutputByteBufferNano.m33518a(19, this.f35714s);
        }
        if (this.f35715t) {
            codedOutputByteBufferNano.m33522a(20, this.f35715t);
        }
        if (this.f35716u) {
            codedOutputByteBufferNano.m33522a(22, this.f35716u);
        }
        if (this.f35717v != 0) {
            codedOutputByteBufferNano.m33518a(23, this.f35717v);
        }
        if (this.f35718w != null) {
            codedOutputByteBufferNano.m33532b(24, this.f35718w);
        }
        if (this.f35719x != null) {
            codedOutputByteBufferNano.m33532b(25, this.f35719x);
        }
        if (!(this.f35720y == null || this.f35720y.equals(""))) {
            codedOutputByteBufferNano.m33521a(26, this.f35720y);
        }
        if (!(this.f35721z == null || this.f35721z.equals(""))) {
            codedOutputByteBufferNano.m33521a(27, this.f35721z);
        }
        if (!(this.f35694A == null || this.f35694A.equals(""))) {
            codedOutputByteBufferNano.m33521a(28, this.f35694A);
        }
        if (this.f35695B) {
            codedOutputByteBufferNano.m33522a(29, this.f35695B);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34154b() {
        int b = super.b();
        if (this.f35696a != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35696a);
        }
        if (!(this.f35697b == null || this.f35697b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f35697b);
        }
        if (this.f35699d != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35699d);
        }
        if (!(this.f35700e == null || this.f35700e.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f35700e);
        }
        if (!(this.f35701f == null || this.f35701f.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f35701f);
        }
        if (!(this.f35704i == null || this.f35704i.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f35704i);
        }
        if (!(this.f35705j == null || this.f35705j.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f35705j);
        }
        if (!(this.f35702g == null || this.f35702g.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f35702g);
        }
        if (!(this.f35703h == null || this.f35703h.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f35703h);
        }
        if (!(this.f35706k == null || this.f35706k.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f35706k);
        }
        if (!(this.f35707l == null || this.f35707l.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f35707l);
        }
        if (!(this.f35708m == null || this.f35708m.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(12, this.f35708m);
        }
        if (!(this.f35709n == null || this.f35709n.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f35709n);
        }
        if (!(this.f35710o == null || this.f35710o.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f35710o);
        }
        if (!(this.f35711p == null || this.f35711p.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(15, this.f35711p);
        }
        if (!(this.f35712q == null || this.f35712q.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f35712q);
        }
        if (!(this.f35713r == null || this.f35713r.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f35713r);
        }
        if (this.f35698c != 0) {
            b += CodedOutputByteBufferNano.m33508f(18, this.f35698c);
        }
        if (this.f35714s != 0) {
            b += CodedOutputByteBufferNano.m33502d(19, this.f35714s);
        }
        if (this.f35715t) {
            b += CodedOutputByteBufferNano.m33501d(20) + 1;
        }
        if (this.f35716u) {
            b += CodedOutputByteBufferNano.m33501d(22) + 1;
        }
        if (this.f35717v != 0) {
            b += CodedOutputByteBufferNano.m33502d(23, this.f35717v);
        }
        if (this.f35718w != null) {
            b += CodedOutputByteBufferNano.m33503d(24, this.f35718w);
        }
        if (this.f35719x != null) {
            b += CodedOutputByteBufferNano.m33503d(25, this.f35719x);
        }
        if (!(this.f35720y == null || this.f35720y.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(26, this.f35720y);
        }
        if (!(this.f35721z == null || this.f35721z.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(27, this.f35721z);
        }
        if (!(this.f35694A == null || this.f35694A.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(28, this.f35694A);
        }
        if (this.f35695B) {
            return b + (CodedOutputByteBufferNano.m33501d(29) + 1);
        }
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.p356a.p357a.p358a.p359a.C7270b m34150b(com.google.protobuf.nano.C7213a r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m33550a();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x000e;
            case 18: goto L_0x0015;
            case 24: goto L_0x001c;
            case 34: goto L_0x0023;
            case 42: goto L_0x002a;
            case 50: goto L_0x0031;
            case 58: goto L_0x0038;
            case 66: goto L_0x003f;
            case 74: goto L_0x0046;
            case 82: goto L_0x004d;
            case 90: goto L_0x0054;
            case 98: goto L_0x005b;
            case 106: goto L_0x0062;
            case 114: goto L_0x0069;
            case 122: goto L_0x0070;
            case 130: goto L_0x0077;
            case 138: goto L_0x007e;
            case 144: goto L_0x0086;
            case 152: goto L_0x008e;
            case 160: goto L_0x0096;
            case 176: goto L_0x009e;
            case 184: goto L_0x00a6;
            case 194: goto L_0x00d9;
            case 202: goto L_0x00eb;
            case 210: goto L_0x00fd;
            case 218: goto L_0x0105;
            case 226: goto L_0x010d;
            case 232: goto L_0x0115;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.m33568j();
        r6.f35696a = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.m33564f();
        r6.f35697b = r0;
        goto L_0x0000;
    L_0x001c:
        r0 = r7.m33567i();
        r6.f35699d = r0;
        goto L_0x0000;
    L_0x0023:
        r0 = r7.m33564f();
        r6.f35700e = r0;
        goto L_0x0000;
    L_0x002a:
        r0 = r7.m33564f();
        r6.f35701f = r0;
        goto L_0x0000;
    L_0x0031:
        r0 = r7.m33564f();
        r6.f35704i = r0;
        goto L_0x0000;
    L_0x0038:
        r0 = r7.m33564f();
        r6.f35705j = r0;
        goto L_0x0000;
    L_0x003f:
        r0 = r7.m33564f();
        r6.f35702g = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.m33564f();
        r6.f35703h = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.m33564f();
        r6.f35706k = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.m33564f();
        r6.f35707l = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r7.m33564f();
        r6.f35708m = r0;
        goto L_0x0000;
    L_0x0062:
        r0 = r7.m33564f();
        r6.f35709n = r0;
        goto L_0x0000;
    L_0x0069:
        r0 = r7.m33564f();
        r6.f35710o = r0;
        goto L_0x0000;
    L_0x0070:
        r0 = r7.m33564f();
        r6.f35711p = r0;
        goto L_0x0000;
    L_0x0077:
        r0 = r7.m33564f();
        r6.f35712q = r0;
        goto L_0x0000;
    L_0x007e:
        r0 = r7.m33564f();
        r6.f35713r = r0;
        goto L_0x0000;
    L_0x0086:
        r0 = r7.m33568j();
        r6.f35698c = r0;
        goto L_0x0000;
    L_0x008e:
        r0 = r7.m33567i();
        r6.f35714s = r0;
        goto L_0x0000;
    L_0x0096:
        r0 = r7.m33563e();
        r6.f35715t = r0;
        goto L_0x0000;
    L_0x009e:
        r0 = r7.m33563e();
        r6.f35716u = r0;
        goto L_0x0000;
    L_0x00a6:
        r1 = r7.m33573o();
        r2 = r7.m33567i();	 Catch:{ IllegalArgumentException -> 0x00cc }
        switch(r2) {
            case 0: goto L_0x00d5;
            case 1: goto L_0x00d5;
            case 2: goto L_0x00d5;
            default: goto L_0x00b1;
        };	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x00b1:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r4 = 34;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r4 = " is not a valid enum Id";
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x00cc }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x00cc:
        r2 = move-exception;
        r7.m33562e(r1);
        r6.a(r7, r0);
        goto L_0x0000;
    L_0x00d5:
        r6.f35717v = r2;	 Catch:{ IllegalArgumentException -> 0x00cc }
        goto L_0x0000;
    L_0x00d9:
        r0 = r6.f35718w;
        if (r0 != 0) goto L_0x00e4;
    L_0x00dd:
        r0 = new com.google.wireless.android.a.a.a.a.c;
        r0.<init>();
        r6.f35718w = r0;
    L_0x00e4:
        r0 = r6.f35718w;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00eb:
        r0 = r6.f35719x;
        if (r0 != 0) goto L_0x00f6;
    L_0x00ef:
        r0 = new com.google.common.d.a.a;
        r0.<init>();
        r6.f35719x = r0;
    L_0x00f6:
        r0 = r6.f35719x;
        r7.m33552a(r0);
        goto L_0x0000;
    L_0x00fd:
        r0 = r7.m33564f();
        r6.f35720y = r0;
        goto L_0x0000;
    L_0x0105:
        r0 = r7.m33564f();
        r6.f35721z = r0;
        goto L_0x0000;
    L_0x010d:
        r0 = r7.m33564f();
        r6.f35694A = r0;
        goto L_0x0000;
    L_0x0115:
        r0 = r7.m33563e();
        r6.f35695B = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.wireless.android.a.a.a.a.b.b(com.google.protobuf.nano.a):com.google.wireless.android.a.a.a.a.b");
    }

    public final /* synthetic */ b cK_() {
        return (C7270b) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C7270b) clone();
    }

    public final /* synthetic */ i m34152a(C7213a c7213a) {
        return m34150b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m34151d();
    }
}
