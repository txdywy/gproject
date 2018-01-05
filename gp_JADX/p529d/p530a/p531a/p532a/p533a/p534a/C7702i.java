package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7702i extends b {
    public int f40113a;
    public Long f40114b;
    public String f40115c;
    public String f40116d;
    public al f40117e;
    public int f40118f;
    public Long f40119g;
    public bw[] f40120h;
    public bo[] f40121i;
    public bv f40122j;
    public Long f40123k;

    private static int m37259a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum SampleInfo");
        }
    }

    public C7702i() {
        this.f40113a = Integer.MIN_VALUE;
        this.f40114b = null;
        this.f40115c = null;
        this.f40116d = null;
        this.f40117e = null;
        this.f40118f = Integer.MIN_VALUE;
        this.f40119g = null;
        this.f40120h = bw.m37232d();
        this.f40121i = bo.m37203d();
        this.f40122j = null;
        this.f40123k = null;
        this.aP = -1;
    }

    public final void m37262a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f40113a != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(1, this.f40113a);
        }
        if (this.f40118f != Integer.MIN_VALUE) {
            codedOutputByteBufferNano.m33518a(2, this.f40118f);
        }
        if (this.f40119g != null) {
            codedOutputByteBufferNano.m33531b(3, this.f40119g.longValue());
        }
        if (this.f40120h != null && this.f40120h.length > 0) {
            for (i iVar : this.f40120h) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if (this.f40121i != null && this.f40121i.length > 0) {
            while (i < this.f40121i.length) {
                i iVar2 = this.f40121i[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar2);
                }
                i++;
            }
        }
        if (this.f40122j != null) {
            codedOutputByteBufferNano.m33532b(6, this.f40122j);
        }
        if (this.f40123k != null) {
            codedOutputByteBufferNano.m33531b(7, this.f40123k.longValue());
        }
        if (this.f40114b != null) {
            codedOutputByteBufferNano.m33535c(8, this.f40114b.longValue());
        }
        if (this.f40115c != null) {
            codedOutputByteBufferNano.m33521a(9, this.f40115c);
        }
        if (this.f40116d != null) {
            codedOutputByteBufferNano.m33521a(10, this.f40116d);
        }
        if (this.f40117e != null) {
            codedOutputByteBufferNano.m33532b(11, this.f40117e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37263b() {
        int i = 0;
        int b = super.b();
        if (this.f40113a != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f40113a);
        }
        if (this.f40118f != Integer.MIN_VALUE) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f40118f);
        }
        if (this.f40119g != null) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f40119g.longValue());
        }
        if (this.f40120h != null && this.f40120h.length > 0) {
            int i2 = b;
            for (i iVar : this.f40120h) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i2;
        }
        if (this.f40121i != null && this.f40121i.length > 0) {
            while (i < this.f40121i.length) {
                i iVar2 = this.f40121i[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(5, iVar2);
                }
                i++;
            }
        }
        if (this.f40122j != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f40122j);
        }
        if (this.f40123k != null) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f40123k.longValue());
        }
        if (this.f40114b != null) {
            this.f40114b.longValue();
            b += CodedOutputByteBufferNano.m33501d(8) + 8;
        }
        if (this.f40115c != null) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f40115c);
        }
        if (this.f40116d != null) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f40116d);
        }
        if (this.f40117e != null) {
            return b + CodedOutputByteBufferNano.m33503d(11, this.f40117e);
        }
        return b;
    }

    private final C7702i m37260b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    o = c7213a.m33573o();
                    try {
                        this.f40113a = C7702i.m37259a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    o = c7213a.m33573o();
                    try {
                        this.f40118f = C7702i.m37259a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 24:
                    this.f40119g = Long.valueOf(c7213a.m33568j());
                    continue;
                case 34:
                    o = C7222l.m33624a(c7213a, 34);
                    a = this.f40120h == null ? 0 : this.f40120h.length;
                    obj = new bw[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40120h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bw();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bw();
                    c7213a.m33552a(obj[a]);
                    this.f40120h = obj;
                    continue;
                case 42:
                    o = C7222l.m33624a(c7213a, 42);
                    a = this.f40121i == null ? 0 : this.f40121i.length;
                    obj = new bo[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f40121i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bo();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bo();
                    c7213a.m33552a(obj[a]);
                    this.f40121i = obj;
                    continue;
                case 50:
                    if (this.f40122j == null) {
                        this.f40122j = new bv();
                    }
                    c7213a.m33552a(this.f40122j);
                    continue;
                case 56:
                    this.f40123k = Long.valueOf(c7213a.m33568j());
                    continue;
                case 65:
                    this.f40114b = Long.valueOf(c7213a.m33570l());
                    continue;
                case 74:
                    this.f40115c = c7213a.m33564f();
                    continue;
                case 82:
                    this.f40116d = c7213a.m33564f();
                    continue;
                case 90:
                    if (this.f40117e == null) {
                        this.f40117e = new al();
                    }
                    c7213a.m33552a(this.f40117e);
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

    public final /* synthetic */ i m37261a(C7213a c7213a) {
        return m37260b(c7213a);
    }
}
