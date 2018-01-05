package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ab extends C0758b {
    public int f30735a;
    public long f30736b;
    public int f30737c;
    public int[] f30738d;
    public int f30739e;
    public int f30740f;
    public aa[] f30741g;
    public int f30742h;
    public int f30743i;
    public int f30744j;
    public int f30745k;

    private static int m28535a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Exception");
        }
    }

    public ab() {
        m28537a();
    }

    public final ab m28537a() {
        this.f30735a = 0;
        this.f30736b = 0;
        this.f30737c = 0;
        this.f30738d = l.e;
        this.f30739e = 0;
        this.f30740f = 0;
        this.f30741g = aa.cI_();
        this.f30742h = 0;
        this.f30743i = 0;
        this.f30744j = 0;
        this.f30745k = 0;
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        if ((this.f30735a & 1) != (abVar.f30735a & 1)) {
            return false;
        }
        if (this.f30736b != abVar.f30736b) {
            return false;
        }
        if ((this.f30735a & 2) != (abVar.f30735a & 2)) {
            return false;
        }
        if (this.f30737c != abVar.f30737c) {
            return false;
        }
        if (!h.a(this.f30738d, abVar.f30738d)) {
            return false;
        }
        if ((this.f30735a & 4) != (abVar.f30735a & 4)) {
            return false;
        }
        if (this.f30739e != abVar.f30739e) {
            return false;
        }
        if ((this.f30735a & 8) != (abVar.f30735a & 8)) {
            return false;
        }
        if (this.f30740f != abVar.f30740f) {
            return false;
        }
        if (!h.a(this.f30741g, abVar.f30741g)) {
            return false;
        }
        if ((this.f30735a & 16) != (abVar.f30735a & 16)) {
            return false;
        }
        if (this.f30742h != abVar.f30742h) {
            return false;
        }
        if ((this.f30735a & 32) != (abVar.f30735a & 32)) {
            return false;
        }
        if (this.f30743i != abVar.f30743i) {
            return false;
        }
        if ((this.f30735a & 64) != (abVar.f30735a & 64)) {
            return false;
        }
        if (this.f30744j != abVar.f30744j) {
            return false;
        }
        if ((this.f30735a & 128) != (abVar.f30735a & 128)) {
            return false;
        }
        if (this.f30745k != abVar.f30745k) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(abVar.aO);
        }
        if (abVar.aO == null || abVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f30736b;
        int a = ((((((((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f30737c) * 31) + h.a(this.f30738d)) * 31) + this.f30739e) * 31) + this.f30740f) * 31) + h.a(this.f30741g)) * 31) + this.f30742h) * 31) + this.f30743i) * 31) + this.f30744j) * 31) + this.f30745k) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + a;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f30735a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f30736b);
        }
        if ((this.f30735a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30737c);
        }
        if (this.f30738d != null && this.f30738d.length > 0) {
            for (int a : this.f30738d) {
                codedOutputByteBufferNano.a(3, a);
            }
        }
        if ((this.f30735a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f30739e);
        }
        if ((this.f30735a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f30740f);
        }
        if (this.f30741g != null && this.f30741g.length > 0) {
            while (i < this.f30741g.length) {
                C0757i c0757i = this.f30741g[i];
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(6, c0757i);
                }
                i++;
            }
        }
        if ((this.f30735a & 16) != 0) {
            codedOutputByteBufferNano.a(7, this.f30742h);
        }
        if ((this.f30735a & 32) != 0) {
            codedOutputByteBufferNano.a(8, this.f30743i);
        }
        if ((this.f30735a & 64) != 0) {
            codedOutputByteBufferNano.a(9, this.f30744j);
        }
        if ((this.f30735a & 128) != 0) {
            codedOutputByteBufferNano.a(10, this.f30745k);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f30735a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f30736b);
        }
        if ((this.f30735a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f30737c);
        }
        if (this.f30738d != null && this.f30738d.length > 0) {
            int i2 = 0;
            for (int c : this.f30738d) {
                i2 += CodedOutputByteBufferNano.c(c);
            }
            b = (b + i2) + (this.f30738d.length * 1);
        }
        if ((this.f30735a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f30739e);
        }
        if ((this.f30735a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f30740f);
        }
        if (this.f30741g != null && this.f30741g.length > 0) {
            while (i < this.f30741g.length) {
                C0757i c0757i = this.f30741g[i];
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(6, c0757i);
                }
                i++;
            }
        }
        if ((this.f30735a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f30742h);
        }
        if ((this.f30735a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f30743i);
        }
        if ((this.f30735a & 64) != 0) {
            b += CodedOutputByteBufferNano.d(9, this.f30744j);
        }
        if ((this.f30735a & 128) != 0) {
            return b + CodedOutputByteBufferNano.d(10, this.f30745k);
        }
        return b;
    }

    private final ab m28536b(a aVar) {
        int a;
        while (true) {
            int a2 = aVar.a();
            int i;
            int i2;
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.f30736b = aVar.j();
                    this.f30735a |= 1;
                    continue;
                case 16:
                    this.f30737c = aVar.i();
                    this.f30735a |= 2;
                    continue;
                case 24:
                    a = l.a(aVar, 24);
                    Object obj = new int[a];
                    i = 0;
                    for (i2 = 0; i2 < a; i2++) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int o = aVar.o();
                        try {
                            obj[i] = ab.m28535a(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e) {
                            aVar.e(o);
                            m4918a(aVar, a2);
                        }
                    }
                    if (i != 0) {
                        i2 = this.f30738d == null ? 0 : this.f30738d.length;
                        if (i2 != 0 || i != obj.length) {
                            Object obj2 = new int[(i2 + i)];
                            if (i2 != 0) {
                                System.arraycopy(this.f30738d, 0, obj2, 0, i2);
                            }
                            System.arraycopy(obj, 0, obj2, i2, i);
                            this.f30738d = obj2;
                            break;
                        }
                        this.f30738d = obj;
                        break;
                    }
                    continue;
                case 26:
                    a2 = aVar.c(aVar.i());
                    i2 = aVar.o();
                    i = 0;
                    while (aVar.m() > 0) {
                        try {
                            ab.m28535a(aVar.i());
                            i++;
                        } catch (IllegalArgumentException e2) {
                        }
                    }
                    if (i != 0) {
                        aVar.e(i2);
                        if (this.f30738d == null) {
                            i2 = 0;
                        } else {
                            i2 = this.f30738d.length;
                        }
                        Object obj3 = new int[(i + i2)];
                        if (i2 != 0) {
                            System.arraycopy(this.f30738d, 0, obj3, 0, i2);
                        }
                        while (aVar.m() > 0) {
                            a = aVar.o();
                            try {
                                obj3[i2] = ab.m28535a(aVar.i());
                                i2++;
                            } catch (IllegalArgumentException e3) {
                                aVar.e(a);
                                m4918a(aVar, 24);
                            }
                        }
                        this.f30738d = obj3;
                    }
                    aVar.d(a2);
                    continue;
                case 32:
                    this.f30739e = aVar.i();
                    this.f30735a |= 4;
                    continue;
                case 40:
                    this.f30740f = aVar.i();
                    this.f30735a |= 8;
                    continue;
                case 50:
                    i2 = l.a(aVar, 50);
                    i = this.f30741g == null ? 0 : this.f30741g.length;
                    Object obj4 = new aa[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(this.f30741g, 0, obj4, 0, i);
                    }
                    while (i < obj4.length - 1) {
                        obj4[i] = new aa();
                        aVar.a(obj4[i]);
                        aVar.a();
                        i++;
                    }
                    obj4[i] = new aa();
                    aVar.a(obj4[i]);
                    this.f30741g = obj4;
                    continue;
                case 56:
                    this.f30742h = aVar.i();
                    this.f30735a |= 16;
                    continue;
                case 64:
                    this.f30743i = aVar.i();
                    this.f30735a |= 32;
                    continue;
                case 72:
                    this.f30744j = aVar.i();
                    this.f30735a |= 64;
                    continue;
                case 80:
                    this.f30745k = aVar.i();
                    this.f30735a |= 128;
                    continue;
                default:
                    if (!super.m4918a(aVar, a2)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m28536b(aVar);
    }
}
