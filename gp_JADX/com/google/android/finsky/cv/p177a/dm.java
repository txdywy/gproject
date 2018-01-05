package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import com.squareup.haha.perflib.HprofParser;
import g.a.a.a;

public final class dm extends C0758b {
    public int f12160a;
    public int f12161b;
    public dp[] f12162c;
    public boolean f12163d;
    public C2430do f12164e;
    public int f12165f;
    public gq f12166g;
    public boolean f12167h;
    public bh[] f12168i;
    public di f12169j;
    public az f12170k;
    public long f12171l;
    public dr f12172m;
    public a f12173n;
    public dn[] f12174o;
    public dq f12175p;

    public static int m12438a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum AvailabilityRestriction");
        }
    }

    public dm() {
        this.f12160a = 0;
        this.f12161b = 1;
        this.f12162c = dp.aW_();
        this.f12163d = false;
        this.f12164e = null;
        this.f12165f = 1;
        this.f12166g = null;
        this.f12167h = false;
        this.f12168i = bh.aJ_();
        this.f12169j = null;
        this.f12170k = null;
        this.f12171l = 0;
        this.f12172m = null;
        this.f12173n = null;
        this.f12174o = dn.aV_();
        this.f12175p = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        if ((this.f12160a & 1) != (dmVar.f12160a & 1)) {
            return false;
        }
        if (this.f12161b != dmVar.f12161b) {
            return false;
        }
        if (!h.a(this.f12162c, dmVar.f12162c)) {
            return false;
        }
        if ((this.f12160a & 2) != (dmVar.f12160a & 2)) {
            return false;
        }
        if (this.f12163d != dmVar.f12163d) {
            return false;
        }
        if (this.f12164e == null) {
            if (dmVar.f12164e != null) {
                return false;
            }
        } else if (!this.f12164e.equals(dmVar.f12164e)) {
            return false;
        }
        if ((this.f12160a & 4) != (dmVar.f12160a & 4)) {
            return false;
        }
        if (this.f12165f != dmVar.f12165f) {
            return false;
        }
        if (this.f12166g == null) {
            if (dmVar.f12166g != null) {
                return false;
            }
        } else if (!this.f12166g.equals(dmVar.f12166g)) {
            return false;
        }
        if ((this.f12160a & 8) != (dmVar.f12160a & 8)) {
            return false;
        }
        if (this.f12167h != dmVar.f12167h) {
            return false;
        }
        if (!h.a(this.f12168i, dmVar.f12168i)) {
            return false;
        }
        if (this.f12169j == null) {
            if (dmVar.f12169j != null) {
                return false;
            }
        } else if (!this.f12169j.equals(dmVar.f12169j)) {
            return false;
        }
        if (this.f12170k == null) {
            if (dmVar.f12170k != null) {
                return false;
            }
        } else if (!this.f12170k.equals(dmVar.f12170k)) {
            return false;
        }
        if ((this.f12160a & 16) != (dmVar.f12160a & 16)) {
            return false;
        }
        if (this.f12171l != dmVar.f12171l) {
            return false;
        }
        if (this.f12172m == null) {
            if (dmVar.f12172m != null) {
                return false;
            }
        } else if (!this.f12172m.equals(dmVar.f12172m)) {
            return false;
        }
        if (this.f12173n == null) {
            if (dmVar.f12173n != null) {
                return false;
            }
        } else if (!this.f12173n.equals(dmVar.f12173n)) {
            return false;
        }
        if (!h.a(this.f12174o, dmVar.f12174o)) {
            return false;
        }
        if (this.f12175p == null) {
            if (dmVar.f12175p != null) {
                return false;
            }
        } else if (!this.f12175p.equals(dmVar.f12175p)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dmVar.aO);
        }
        if (dmVar.aO == null || dmVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = (this.f12163d ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f12161b) * 31) + h.a(this.f12162c)) * 31);
        C2430do c2430do = this.f12164e;
        hashCode = (((c2430do == null ? 0 : c2430do.hashCode()) + (hashCode * 31)) * 31) + this.f12165f;
        gq gqVar = this.f12166g;
        hashCode = ((gqVar == null ? 0 : gqVar.hashCode()) + (hashCode * 31)) * 31;
        if (!this.f12167h) {
            i = 1237;
        }
        hashCode = ((hashCode + i) * 31) + h.a(this.f12168i);
        di diVar = this.f12169j;
        hashCode = (diVar == null ? 0 : diVar.hashCode()) + (hashCode * 31);
        az azVar = this.f12170k;
        hashCode = (azVar == null ? 0 : azVar.hashCode()) + (hashCode * 31);
        long j = this.f12171l;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        dr drVar = this.f12172m;
        hashCode = (drVar == null ? 0 : drVar.hashCode()) + (hashCode * 31);
        a aVar = this.f12173n;
        hashCode = (((aVar == null ? 0 : aVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f12174o);
        dq dqVar = this.f12175p;
        hashCode = ((dqVar == null ? 0 : dqVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12160a & 1) != 0) {
            codedOutputByteBufferNano.a(5, this.f12161b);
        }
        if ((this.f12160a & 4) != 0) {
            codedOutputByteBufferNano.a(6, this.f12165f);
        }
        if (this.f12172m != null) {
            codedOutputByteBufferNano.b(7, this.f12172m);
        }
        if (this.f12174o != null && this.f12174o.length > 0) {
            for (C0757i c0757i : this.f12174o) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.a(9, c0757i);
                }
            }
        }
        if ((this.f12160a & 2) != 0) {
            codedOutputByteBufferNano.a(13, this.f12163d);
        }
        if (this.f12168i != null && this.f12168i.length > 0) {
            for (C0757i c0757i2 : this.f12168i) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(14, c0757i2);
                }
            }
        }
        if (this.f12175p != null) {
            codedOutputByteBufferNano.b(16, this.f12175p);
        }
        if (this.f12166g != null) {
            codedOutputByteBufferNano.b(17, this.f12166g);
        }
        if (this.f12162c != null && this.f12162c.length > 0) {
            while (i < this.f12162c.length) {
                C0757i c0757i3 = this.f12162c[i];
                if (c0757i3 != null) {
                    codedOutputByteBufferNano.b(18, c0757i3);
                }
                i++;
            }
        }
        if (this.f12173n != null) {
            codedOutputByteBufferNano.b(19, this.f12173n);
        }
        if ((this.f12160a & 8) != 0) {
            codedOutputByteBufferNano.a(21, this.f12167h);
        }
        if (this.f12169j != null) {
            codedOutputByteBufferNano.b(23, this.f12169j);
        }
        if (this.f12170k != null) {
            codedOutputByteBufferNano.b(24, this.f12170k);
        }
        if ((this.f12160a & 16) != 0) {
            codedOutputByteBufferNano.b(25, this.f12171l);
        }
        if (this.f12164e != null) {
            codedOutputByteBufferNano.b(26, this.f12164e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if ((this.f12160a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f12161b);
        }
        if ((this.f12160a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f12165f);
        }
        if (this.f12172m != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12172m);
        }
        if (this.f12174o != null && this.f12174o.length > 0) {
            i = b;
            for (C0757i c0757i : this.f12174o) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.c(9, c0757i);
                }
            }
            b = i;
        }
        if ((this.f12160a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(13) + 1;
        }
        if (this.f12168i != null && this.f12168i.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f12168i) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(14, c0757i2);
                }
            }
            b = i;
        }
        if (this.f12175p != null) {
            b += CodedOutputByteBufferNano.d(16, this.f12175p);
        }
        if (this.f12166g != null) {
            b += CodedOutputByteBufferNano.d(17, this.f12166g);
        }
        if (this.f12162c != null && this.f12162c.length > 0) {
            while (i2 < this.f12162c.length) {
                C0757i c0757i3 = this.f12162c[i2];
                if (c0757i3 != null) {
                    b += CodedOutputByteBufferNano.d(18, c0757i3);
                }
                i2++;
            }
        }
        if (this.f12173n != null) {
            b += CodedOutputByteBufferNano.d(19, this.f12173n);
        }
        if ((this.f12160a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(21) + 1;
        }
        if (this.f12169j != null) {
            b += CodedOutputByteBufferNano.d(23, this.f12169j);
        }
        if (this.f12170k != null) {
            b += CodedOutputByteBufferNano.d(24, this.f12170k);
        }
        if ((this.f12160a & 16) != 0) {
            b += CodedOutputByteBufferNano.f(25, this.f12171l);
        }
        if (this.f12164e != null) {
            return b + CodedOutputByteBufferNano.d(26, this.f12164e);
        }
        return b;
    }

    private final dm m12439b(com.google.protobuf.nano.a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 40:
                    this.f12160a |= 1;
                    o = aVar.o();
                    try {
                        this.f12161b = dm.m12438a(aVar.i());
                        this.f12160a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 48:
                    this.f12160a |= 4;
                    o = aVar.o();
                    try {
                        this.f12165f = bp.m12290a(aVar.i());
                        this.f12160a |= 4;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 58:
                    if (this.f12172m == null) {
                        this.f12172m = new dr();
                    }
                    aVar.a(this.f12172m);
                    continue;
                case 75:
                    o = l.a(aVar, 75);
                    a = this.f12174o == null ? 0 : this.f12174o.length;
                    obj = new dn[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12174o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dn();
                        aVar.a(obj[a], 9);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new dn();
                    aVar.a(obj[a], 9);
                    this.f12174o = obj;
                    continue;
                case 104:
                    this.f12163d = aVar.e();
                    this.f12160a |= 2;
                    continue;
                case 114:
                    o = l.a(aVar, 114);
                    a = this.f12168i == null ? 0 : this.f12168i.length;
                    obj = new bh[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12168i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bh();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bh();
                    aVar.a(obj[a]);
                    this.f12168i = obj;
                    continue;
                case 130:
                    if (this.f12175p == null) {
                        this.f12175p = new dq();
                    }
                    aVar.a(this.f12175p);
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    if (this.f12166g == null) {
                        this.f12166g = new gq();
                    }
                    aVar.a(this.f12166g);
                    continue;
                case 146:
                    o = l.a(aVar, 146);
                    a = this.f12162c == null ? 0 : this.f12162c.length;
                    obj = new dp[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12162c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dp();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new dp();
                    aVar.a(obj[a]);
                    this.f12162c = obj;
                    continue;
                case 154:
                    if (this.f12173n == null) {
                        this.f12173n = new a();
                    }
                    aVar.a(this.f12173n);
                    continue;
                case 168:
                    this.f12167h = aVar.e();
                    this.f12160a |= 8;
                    continue;
                case 186:
                    if (this.f12169j == null) {
                        this.f12169j = new di();
                    }
                    aVar.a(this.f12169j);
                    continue;
                case 194:
                    if (this.f12170k == null) {
                        this.f12170k = new az();
                    }
                    aVar.a(this.f12170k);
                    continue;
                case 200:
                    this.f12171l = aVar.j();
                    this.f12160a |= 16;
                    continue;
                case 210:
                    if (this.f12164e == null) {
                        this.f12164e = new C2430do();
                    }
                    aVar.a(this.f12164e);
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

    public final /* synthetic */ C0757i mo1131a(com.google.protobuf.nano.a aVar) {
        return m12439b(aVar);
    }
}
