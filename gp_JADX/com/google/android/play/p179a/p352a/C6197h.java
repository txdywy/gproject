package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.c;

public final class C6197h extends C0758b {
    public int f30927a;
    public int f30928b;
    public String f30929c;
    public String f30930d;
    public C6192c f30931e;
    public C6199j f30932f;
    public C6203n f30933g;
    public C6211v f30934h;
    public C6213x f30935i;
    public C6210u f30936j;
    public C6208s f30937k;
    public C6214y f30938l;
    public C6196g f30939m;
    public C6204o f30940n;
    public C6195f f30941o;
    public long f30942p;

    public static int m28625a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum ClientType");
        }
    }

    public C6197h() {
        this.f30927a = 0;
        this.f30928b = 0;
        this.f30929c = "";
        this.f30930d = "";
        this.f30931e = null;
        this.f30932f = null;
        this.f30933g = null;
        this.f30934h = null;
        this.f30935i = null;
        this.f30936j = null;
        this.f30937k = null;
        this.f30938l = null;
        this.f30939m = null;
        this.f30940n = null;
        this.f30941o = null;
        this.f30942p = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6197h)) {
            return false;
        }
        C6197h c6197h = (C6197h) obj;
        if ((this.f30927a & 1) != (c6197h.f30927a & 1)) {
            return false;
        }
        if (this.f30928b != c6197h.f30928b) {
            return false;
        }
        if ((this.f30927a & 2) != (c6197h.f30927a & 2)) {
            return false;
        }
        if (!this.f30929c.equals(c6197h.f30929c)) {
            return false;
        }
        if ((this.f30927a & 4) != (c6197h.f30927a & 4)) {
            return false;
        }
        if (!this.f30930d.equals(c6197h.f30930d)) {
            return false;
        }
        if (this.f30931e == null) {
            if (c6197h.f30931e != null) {
                return false;
            }
        } else if (!this.f30931e.equals(c6197h.f30931e)) {
            return false;
        }
        if (this.f30932f == null) {
            if (c6197h.f30932f != null) {
                return false;
            }
        } else if (!this.f30932f.equals(c6197h.f30932f)) {
            return false;
        }
        if (this.f30933g == null) {
            if (c6197h.f30933g != null) {
                return false;
            }
        } else if (!this.f30933g.equals(c6197h.f30933g)) {
            return false;
        }
        if (this.f30934h == null) {
            if (c6197h.f30934h != null) {
                return false;
            }
        } else if (!this.f30934h.equals(c6197h.f30934h)) {
            return false;
        }
        if (this.f30935i == null) {
            if (c6197h.f30935i != null) {
                return false;
            }
        } else if (!this.f30935i.equals(c6197h.f30935i)) {
            return false;
        }
        if (this.f30936j == null) {
            if (c6197h.f30936j != null) {
                return false;
            }
        } else if (!this.f30936j.equals(c6197h.f30936j)) {
            return false;
        }
        if (this.f30937k == null) {
            if (c6197h.f30937k != null) {
                return false;
            }
        } else if (!this.f30937k.equals(c6197h.f30937k)) {
            return false;
        }
        if (this.f30938l == null) {
            if (c6197h.f30938l != null) {
                return false;
            }
        } else if (!this.f30938l.equals(c6197h.f30938l)) {
            return false;
        }
        if (this.f30939m == null) {
            if (c6197h.f30939m != null) {
                return false;
            }
        } else if (!this.f30939m.equals(c6197h.f30939m)) {
            return false;
        }
        if (this.f30940n == null) {
            if (c6197h.f30940n != null) {
                return false;
            }
        } else if (!this.f30940n.equals(c6197h.f30940n)) {
            return false;
        }
        if (this.f30941o == null) {
            if (c6197h.f30941o != null) {
                return false;
            }
        } else if (!this.f30941o.equals(c6197h.f30941o)) {
            return false;
        }
        if ((this.f30927a & 8) != (c6197h.f30927a & 8)) {
            return false;
        }
        if (this.f30942p != c6197h.f30942p) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6197h.aO);
        }
        if (c6197h.aO == null || c6197h.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f30928b) * 31) + this.f30929c.hashCode()) * 31) + this.f30930d.hashCode();
        C6192c c6192c = this.f30931e;
        hashCode = (c6192c == null ? 0 : c6192c.hashCode()) + (hashCode * 31);
        C6199j c6199j = this.f30932f;
        hashCode = (c6199j == null ? 0 : c6199j.hashCode()) + (hashCode * 31);
        C6203n c6203n = this.f30933g;
        hashCode = (c6203n == null ? 0 : c6203n.hashCode()) + (hashCode * 31);
        C6211v c6211v = this.f30934h;
        hashCode = (c6211v == null ? 0 : c6211v.hashCode()) + (hashCode * 31);
        C6213x c6213x = this.f30935i;
        hashCode = (c6213x == null ? 0 : c6213x.hashCode()) + (hashCode * 31);
        C6210u c6210u = this.f30936j;
        hashCode = (c6210u == null ? 0 : c6210u.hashCode()) + (hashCode * 31);
        C6208s c6208s = this.f30937k;
        hashCode = (c6208s == null ? 0 : c6208s.hashCode()) + (hashCode * 31);
        C6214y c6214y = this.f30938l;
        hashCode = (c6214y == null ? 0 : c6214y.hashCode()) + (hashCode * 31);
        C6196g c6196g = this.f30939m;
        hashCode = (c6196g == null ? 0 : c6196g.hashCode()) + (hashCode * 31);
        C6204o c6204o = this.f30940n;
        hashCode = (c6204o == null ? 0 : c6204o.hashCode()) + (hashCode * 31);
        C6195f c6195f = this.f30941o;
        hashCode = (c6195f == null ? 0 : c6195f.hashCode()) + (hashCode * 31);
        long j = this.f30942p;
        hashCode = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30927a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30928b);
        }
        if (this.f30931e != null) {
            codedOutputByteBufferNano.b(2, this.f30931e);
        }
        if (this.f30932f != null) {
            codedOutputByteBufferNano.b(3, this.f30932f);
        }
        if (this.f30933g != null) {
            codedOutputByteBufferNano.b(4, this.f30933g);
        }
        if (this.f30934h != null) {
            codedOutputByteBufferNano.b(5, this.f30934h);
        }
        if ((this.f30927a & 2) != 0) {
            codedOutputByteBufferNano.a(6, this.f30929c);
        }
        if ((this.f30927a & 4) != 0) {
            codedOutputByteBufferNano.a(7, this.f30930d);
        }
        if (this.f30935i != null) {
            codedOutputByteBufferNano.b(8, this.f30935i);
        }
        if (this.f30939m != null) {
            codedOutputByteBufferNano.b(9, this.f30939m);
        }
        if (this.f30936j != null) {
            codedOutputByteBufferNano.b(10, this.f30936j);
        }
        if (this.f30940n != null) {
            codedOutputByteBufferNano.b(11, this.f30940n);
        }
        if ((this.f30927a & 8) != 0) {
            codedOutputByteBufferNano.b(12, this.f30942p);
        }
        if (this.f30937k != null) {
            codedOutputByteBufferNano.b(13, this.f30937k);
        }
        if (this.f30941o != null) {
            codedOutputByteBufferNano.b(14, this.f30941o);
        }
        if (this.f30938l != null) {
            codedOutputByteBufferNano.b(15, this.f30938l);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30927a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f30928b);
        }
        if (this.f30931e != null) {
            b += CodedOutputByteBufferNano.d(2, this.f30931e);
        }
        if (this.f30932f != null) {
            b += CodedOutputByteBufferNano.d(3, this.f30932f);
        }
        if (this.f30933g != null) {
            b += CodedOutputByteBufferNano.d(4, this.f30933g);
        }
        if (this.f30934h != null) {
            b += CodedOutputByteBufferNano.d(5, this.f30934h);
        }
        if ((this.f30927a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30929c);
        }
        if ((this.f30927a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f30930d);
        }
        if (this.f30935i != null) {
            b += CodedOutputByteBufferNano.d(8, this.f30935i);
        }
        if (this.f30939m != null) {
            b += CodedOutputByteBufferNano.d(9, this.f30939m);
        }
        if (this.f30936j != null) {
            b += CodedOutputByteBufferNano.d(10, this.f30936j);
        }
        if (this.f30940n != null) {
            b += CodedOutputByteBufferNano.d(11, this.f30940n);
        }
        if ((this.f30927a & 8) != 0) {
            b += CodedOutputByteBufferNano.f(12, this.f30942p);
        }
        if (this.f30937k != null) {
            b += CodedOutputByteBufferNano.d(13, this.f30937k);
        }
        if (this.f30941o != null) {
            b += CodedOutputByteBufferNano.d(14, this.f30941o);
        }
        if (this.f30938l != null) {
            return b + CodedOutputByteBufferNano.d(15, this.f30938l);
        }
        return b;
    }

    private final C6197h m28626b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30927a |= 1;
                    int o = aVar.o();
                    try {
                        this.f30928b = C6197h.m28625a(aVar.i());
                        this.f30927a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 18:
                    if (this.f30931e == null) {
                        this.f30931e = new C6192c();
                    }
                    aVar.a(this.f30931e);
                    continue;
                case 26:
                    if (this.f30932f == null) {
                        this.f30932f = new C6199j();
                    }
                    aVar.a(this.f30932f);
                    continue;
                case 34:
                    if (this.f30933g == null) {
                        this.f30933g = new C6203n();
                    }
                    aVar.a(this.f30933g);
                    continue;
                case 42:
                    if (this.f30934h == null) {
                        this.f30934h = new C6211v();
                    }
                    aVar.a(this.f30934h);
                    continue;
                case 50:
                    this.f30929c = aVar.f();
                    this.f30927a |= 2;
                    continue;
                case 58:
                    this.f30930d = aVar.f();
                    this.f30927a |= 4;
                    continue;
                case 66:
                    if (this.f30935i == null) {
                        this.f30935i = new C6213x();
                    }
                    aVar.a(this.f30935i);
                    continue;
                case 74:
                    if (this.f30939m == null) {
                        this.f30939m = new C6196g();
                    }
                    aVar.a(this.f30939m);
                    continue;
                case 82:
                    if (this.f30936j == null) {
                        this.f30936j = new C6210u();
                    }
                    aVar.a(this.f30936j);
                    continue;
                case 90:
                    if (this.f30940n == null) {
                        this.f30940n = new C6204o();
                    }
                    aVar.a(this.f30940n);
                    continue;
                case 96:
                    this.f30942p = aVar.j();
                    this.f30927a |= 8;
                    continue;
                case 106:
                    if (this.f30937k == null) {
                        this.f30937k = new C6208s();
                    }
                    aVar.a(this.f30937k);
                    continue;
                case 114:
                    if (this.f30941o == null) {
                        this.f30941o = new C6195f();
                    }
                    aVar.a(this.f30941o);
                    continue;
                case 122:
                    if (this.f30938l == null) {
                        this.f30938l = new C6214y();
                    }
                    aVar.a(this.f30938l);
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28626b(aVar);
    }

    static {
        c.a(C6197h.class, 530573498);
    }
}
