package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class cd extends C0758b {
    public int f12015a;
    public String f12016b;
    public String f12017c;
    public double f12018d;
    public long f12019e;
    public String f12020f;
    public boolean f12021g;
    public ce[] f12022h;
    public bd f12023i;

    public cd() {
        this.f12015a = 0;
        this.f12016b = "";
        this.f12017c = "";
        this.f12018d = 0.0d;
        this.f12019e = 0;
        this.f12020f = "";
        this.f12021g = false;
        this.f12022h = ce.aO_();
        this.f12023i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        if ((this.f12015a & 1) != (cdVar.f12015a & 1)) {
            return false;
        }
        if (!this.f12016b.equals(cdVar.f12016b)) {
            return false;
        }
        if ((this.f12015a & 2) != (cdVar.f12015a & 2)) {
            return false;
        }
        if (!this.f12017c.equals(cdVar.f12017c)) {
            return false;
        }
        if ((this.f12015a & 4) != (cdVar.f12015a & 4)) {
            return false;
        }
        if (Double.doubleToLongBits(this.f12018d) != Double.doubleToLongBits(cdVar.f12018d)) {
            return false;
        }
        if ((this.f12015a & 8) != (cdVar.f12015a & 8)) {
            return false;
        }
        if (this.f12019e != cdVar.f12019e) {
            return false;
        }
        if ((this.f12015a & 16) != (cdVar.f12015a & 16)) {
            return false;
        }
        if (!this.f12020f.equals(cdVar.f12020f)) {
            return false;
        }
        if ((this.f12015a & 32) != (cdVar.f12015a & 32)) {
            return false;
        }
        if (this.f12021g != cdVar.f12021g) {
            return false;
        }
        if (!h.a(this.f12022h, cdVar.f12022h)) {
            return false;
        }
        if (this.f12023i == null) {
            if (cdVar.f12023i != null) {
                return false;
            }
        } else if (!this.f12023i.equals(cdVar.f12023i)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cdVar.aO);
        }
        if (cdVar.aO == null || cdVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12016b.hashCode()) * 31) + this.f12017c.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f12018d);
        hashCode = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = this.f12019e;
        hashCode = (((this.f12021g ? 1231 : 1237) + (((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f12020f.hashCode()) * 31)) * 31) + h.a(this.f12022h);
        bd bdVar = this.f12023i;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12015a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12016b);
        }
        if ((this.f12015a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12017c);
        }
        if ((this.f12015a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12018d);
        }
        if ((this.f12015a & 8) != 0) {
            codedOutputByteBufferNano.b(4, this.f12019e);
        }
        if ((this.f12015a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12020f);
        }
        if ((this.f12015a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f12021g);
        }
        if (this.f12022h != null && this.f12022h.length > 0) {
            for (C0757i c0757i : this.f12022h) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(7, c0757i);
                }
            }
        }
        if (this.f12023i != null) {
            codedOutputByteBufferNano.b(8, this.f12023i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12015a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12016b);
        }
        if ((this.f12015a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12017c);
        }
        if ((this.f12015a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 8;
        }
        if ((this.f12015a & 8) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f12019e);
        }
        if ((this.f12015a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12020f);
        }
        if ((this.f12015a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f12022h != null && this.f12022h.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12022h) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(7, c0757i);
                }
            }
            b = i;
        }
        if (this.f12023i != null) {
            return b + CodedOutputByteBufferNano.d(8, this.f12023i);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12016b = aVar.f();
                    this.f12015a |= 1;
                    continue;
                case 18:
                    this.f12017c = aVar.f();
                    this.f12015a |= 2;
                    continue;
                case 25:
                    this.f12018d = Double.longBitsToDouble(aVar.l());
                    this.f12015a |= 4;
                    continue;
                case 32:
                    this.f12019e = aVar.j();
                    this.f12015a |= 8;
                    continue;
                case 42:
                    this.f12020f = aVar.f();
                    this.f12015a |= 16;
                    continue;
                case 48:
                    this.f12021g = aVar.e();
                    this.f12015a |= 32;
                    continue;
                case 58:
                    int a2 = l.a(aVar, 58);
                    a = this.f12022h == null ? 0 : this.f12022h.length;
                    Object obj = new ce[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12022h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ce();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ce();
                    aVar.a(obj[a]);
                    this.f12022h = obj;
                    continue;
                case 66:
                    if (this.f12023i == null) {
                        this.f12023i = new bd();
                    }
                    aVar.a(this.f12023i);
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
