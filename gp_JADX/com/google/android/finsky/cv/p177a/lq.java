package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class lq extends C0758b {
    public int f13036a;
    public lp[] f13037b;
    public String f13038c;
    public String f13039d;
    public String f13040e;
    public long f13041f;
    public long f13042g;
    public String[] f13043h;
    public kw[] f13044i;
    public String f13045j;
    public String f13046k;
    public lx[] f13047l;
    public String f13048m;

    public lq() {
        this.f13036a = 0;
        this.f13037b = lp.bO_();
        this.f13038c = "";
        this.f13039d = "";
        this.f13040e = "";
        this.f13041f = 0;
        this.f13042g = 0;
        this.f13043h = l.j;
        this.f13044i = kw.bJ_();
        this.f13045j = "";
        this.f13046k = "";
        this.f13047l = lx.bS_();
        this.f13048m = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        if (!h.a(this.f13037b, lqVar.f13037b)) {
            return false;
        }
        if ((this.f13036a & 1) != (lqVar.f13036a & 1)) {
            return false;
        }
        if (!this.f13038c.equals(lqVar.f13038c)) {
            return false;
        }
        if ((this.f13036a & 2) != (lqVar.f13036a & 2)) {
            return false;
        }
        if (!this.f13039d.equals(lqVar.f13039d)) {
            return false;
        }
        if ((this.f13036a & 4) != (lqVar.f13036a & 4)) {
            return false;
        }
        if (!this.f13040e.equals(lqVar.f13040e)) {
            return false;
        }
        if ((this.f13036a & 8) != (lqVar.f13036a & 8)) {
            return false;
        }
        if (this.f13041f != lqVar.f13041f) {
            return false;
        }
        if ((this.f13036a & 16) != (lqVar.f13036a & 16)) {
            return false;
        }
        if (this.f13042g != lqVar.f13042g) {
            return false;
        }
        if (!h.a(this.f13043h, lqVar.f13043h)) {
            return false;
        }
        if (!h.a(this.f13044i, lqVar.f13044i)) {
            return false;
        }
        if ((this.f13036a & 32) != (lqVar.f13036a & 32)) {
            return false;
        }
        if (!this.f13045j.equals(lqVar.f13045j)) {
            return false;
        }
        if ((this.f13036a & 64) != (lqVar.f13036a & 64)) {
            return false;
        }
        if (!this.f13046k.equals(lqVar.f13046k)) {
            return false;
        }
        if (!h.a(this.f13047l, lqVar.f13047l)) {
            return false;
        }
        if ((this.f13036a & 128) != (lqVar.f13036a & 128)) {
            return false;
        }
        if (!this.f13048m.equals(lqVar.f13048m)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lqVar.aO);
        }
        if (lqVar.aO == null || lqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13037b)) * 31) + this.f13038c.hashCode()) * 31) + this.f13039d.hashCode()) * 31) + this.f13040e.hashCode();
        long j = this.f13041f;
        hashCode = (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        j = this.f13042g;
        int a = ((((((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + h.a(this.f13043h)) * 31) + h.a(this.f13044i)) * 31) + this.f13045j.hashCode()) * 31) + this.f13046k.hashCode()) * 31) + h.a(this.f13047l)) * 31) + this.f13048m.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + a;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f13037b != null && this.f13037b.length > 0) {
            for (C0757i c0757i : this.f13037b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f13036a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f13038c);
        }
        if ((this.f13036a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f13039d);
        }
        if ((this.f13036a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f13040e);
        }
        if ((this.f13036a & 8) != 0) {
            codedOutputByteBufferNano.b(5, this.f13041f);
        }
        if ((this.f13036a & 16) != 0) {
            codedOutputByteBufferNano.b(6, this.f13042g);
        }
        if (this.f13043h != null && this.f13043h.length > 0) {
            for (String str : this.f13043h) {
                if (str != null) {
                    codedOutputByteBufferNano.a(7, str);
                }
            }
        }
        if (this.f13044i != null && this.f13044i.length > 0) {
            for (C0757i c0757i2 : this.f13044i) {
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(8, c0757i2);
                }
            }
        }
        if ((this.f13036a & 32) != 0) {
            codedOutputByteBufferNano.a(12, this.f13045j);
        }
        if ((this.f13036a & 64) != 0) {
            codedOutputByteBufferNano.a(13, this.f13046k);
        }
        if (this.f13047l != null && this.f13047l.length > 0) {
            while (i < this.f13047l.length) {
                C0757i c0757i3 = this.f13047l[i];
                if (c0757i3 != null) {
                    codedOutputByteBufferNano.b(14, c0757i3);
                }
                i++;
            }
        }
        if ((this.f13036a & 128) != 0) {
            codedOutputByteBufferNano.a(15, this.f13048m);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2 = 0;
        int b = super.mo1128b();
        if (this.f13037b != null && this.f13037b.length > 0) {
            i = b;
            for (C0757i c0757i : this.f13037b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
            b = i;
        }
        if ((this.f13036a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f13038c);
        }
        if ((this.f13036a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f13039d);
        }
        if ((this.f13036a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f13040e);
        }
        if ((this.f13036a & 8) != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f13041f);
        }
        if ((this.f13036a & 16) != 0) {
            b += CodedOutputByteBufferNano.f(6, this.f13042g);
        }
        if (this.f13043h != null && this.f13043h.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f13043h) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f13044i != null && this.f13044i.length > 0) {
            i = b;
            for (C0757i c0757i2 : this.f13044i) {
                if (c0757i2 != null) {
                    i += CodedOutputByteBufferNano.d(8, c0757i2);
                }
            }
            b = i;
        }
        if ((this.f13036a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(12, this.f13045j);
        }
        if ((this.f13036a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(13, this.f13046k);
        }
        if (this.f13047l != null && this.f13047l.length > 0) {
            while (i2 < this.f13047l.length) {
                C0757i c0757i3 = this.f13047l[i2];
                if (c0757i3 != null) {
                    b += CodedOutputByteBufferNano.d(14, c0757i3);
                }
                i2++;
            }
        }
        if ((this.f13036a & 128) != 0) {
            return b + CodedOutputByteBufferNano.b(15, this.f13048m);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a2 = l.a(aVar, 10);
                    a = this.f13037b == null ? 0 : this.f13037b.length;
                    obj = new lp[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13037b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lp();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lp();
                    aVar.a(obj[a]);
                    this.f13037b = obj;
                    continue;
                case 18:
                    this.f13038c = aVar.f();
                    this.f13036a |= 1;
                    continue;
                case 26:
                    this.f13039d = aVar.f();
                    this.f13036a |= 2;
                    continue;
                case 34:
                    this.f13040e = aVar.f();
                    this.f13036a |= 4;
                    continue;
                case 40:
                    this.f13041f = aVar.j();
                    this.f13036a |= 8;
                    continue;
                case 48:
                    this.f13042g = aVar.j();
                    this.f13036a |= 16;
                    continue;
                case 58:
                    a2 = l.a(aVar, 58);
                    a = this.f13043h == null ? 0 : this.f13043h.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13043h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f13043h = obj;
                    continue;
                case 66:
                    a2 = l.a(aVar, 66);
                    a = this.f13044i == null ? 0 : this.f13044i.length;
                    obj = new kw[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13044i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kw();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new kw();
                    aVar.a(obj[a]);
                    this.f13044i = obj;
                    continue;
                case 98:
                    this.f13045j = aVar.f();
                    this.f13036a |= 32;
                    continue;
                case 106:
                    this.f13046k = aVar.f();
                    this.f13036a |= 64;
                    continue;
                case 114:
                    a2 = l.a(aVar, 114);
                    a = this.f13047l == null ? 0 : this.f13047l.length;
                    obj = new lx[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13047l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lx();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lx();
                    aVar.a(obj[a]);
                    this.f13047l = obj;
                    continue;
                case 122:
                    this.f13048m = aVar.f();
                    this.f13036a |= 128;
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
