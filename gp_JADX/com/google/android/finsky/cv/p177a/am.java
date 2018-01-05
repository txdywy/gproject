package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class am extends C0758b {
    public int f11810a;
    public String f11811b;
    public String f11812c;
    public String f11813d;
    public String f11814e;
    public al f11815f;
    public al f11816g;
    public bd f11817h;
    public String f11818i;
    public byte[] f11819j;
    public int f11820k;

    public am() {
        this.f11810a = 0;
        this.f11811b = "";
        this.f11812c = "";
        this.f11813d = "";
        this.f11814e = "";
        this.f11815f = null;
        this.f11816g = null;
        this.f11817h = null;
        this.f11818i = "";
        this.f11819j = l.l;
        this.f11820k = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        if ((this.f11810a & 1) != (amVar.f11810a & 1)) {
            return false;
        }
        if (!this.f11811b.equals(amVar.f11811b)) {
            return false;
        }
        if ((this.f11810a & 2) != (amVar.f11810a & 2)) {
            return false;
        }
        if (!this.f11812c.equals(amVar.f11812c)) {
            return false;
        }
        if ((this.f11810a & 4) != (amVar.f11810a & 4)) {
            return false;
        }
        if (!this.f11813d.equals(amVar.f11813d)) {
            return false;
        }
        if ((this.f11810a & 8) != (amVar.f11810a & 8)) {
            return false;
        }
        if (!this.f11814e.equals(amVar.f11814e)) {
            return false;
        }
        if (this.f11815f == null) {
            if (amVar.f11815f != null) {
                return false;
            }
        } else if (!this.f11815f.equals(amVar.f11815f)) {
            return false;
        }
        if (this.f11816g == null) {
            if (amVar.f11816g != null) {
                return false;
            }
        } else if (!this.f11816g.equals(amVar.f11816g)) {
            return false;
        }
        if (this.f11817h == null) {
            if (amVar.f11817h != null) {
                return false;
            }
        } else if (!this.f11817h.equals(amVar.f11817h)) {
            return false;
        }
        if ((this.f11810a & 16) != (amVar.f11810a & 16)) {
            return false;
        }
        if (!this.f11818i.equals(amVar.f11818i)) {
            return false;
        }
        if ((this.f11810a & 32) != (amVar.f11810a & 32)) {
            return false;
        }
        if (!Arrays.equals(this.f11819j, amVar.f11819j)) {
            return false;
        }
        if ((this.f11810a & 64) != (amVar.f11810a & 64)) {
            return false;
        }
        if (this.f11820k != amVar.f11820k) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(amVar.aO);
        }
        if (amVar.aO == null || amVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + this.f11811b.hashCode()) * 31) + this.f11812c.hashCode()) * 31) + this.f11813d.hashCode()) * 31) + this.f11814e.hashCode();
        al alVar = this.f11815f;
        hashCode = (alVar == null ? 0 : alVar.hashCode()) + (hashCode * 31);
        alVar = this.f11816g;
        hashCode = (alVar == null ? 0 : alVar.hashCode()) + (hashCode * 31);
        bd bdVar = this.f11817h;
        hashCode = ((((((((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31) + this.f11818i.hashCode()) * 31) + Arrays.hashCode(this.f11819j)) * 31) + this.f11820k) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11810a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11811b);
        }
        if ((this.f11810a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11812c);
        }
        if ((this.f11810a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11813d);
        }
        if ((this.f11810a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f11814e);
        }
        if (this.f11815f != null) {
            codedOutputByteBufferNano.b(5, this.f11815f);
        }
        if (this.f11816g != null) {
            codedOutputByteBufferNano.b(6, this.f11816g);
        }
        if (this.f11817h != null) {
            codedOutputByteBufferNano.b(7, this.f11817h);
        }
        if ((this.f11810a & 16) != 0) {
            codedOutputByteBufferNano.a(8, this.f11818i);
        }
        if ((this.f11810a & 32) != 0) {
            codedOutputByteBufferNano.a(9, this.f11819j);
        }
        if ((this.f11810a & 64) != 0) {
            codedOutputByteBufferNano.a(10, this.f11820k);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11810a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11811b);
        }
        if ((this.f11810a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11812c);
        }
        if ((this.f11810a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f11813d);
        }
        if ((this.f11810a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f11814e);
        }
        if (this.f11815f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f11815f);
        }
        if (this.f11816g != null) {
            b += CodedOutputByteBufferNano.d(6, this.f11816g);
        }
        if (this.f11817h != null) {
            b += CodedOutputByteBufferNano.d(7, this.f11817h);
        }
        if ((this.f11810a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f11818i);
        }
        if ((this.f11810a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f11819j);
        }
        if ((this.f11810a & 64) != 0) {
            return b + CodedOutputByteBufferNano.d(10, this.f11820k);
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
                    this.f11811b = aVar.f();
                    this.f11810a |= 1;
                    continue;
                case 18:
                    this.f11812c = aVar.f();
                    this.f11810a |= 2;
                    continue;
                case 26:
                    this.f11813d = aVar.f();
                    this.f11810a |= 4;
                    continue;
                case 34:
                    this.f11814e = aVar.f();
                    this.f11810a |= 8;
                    continue;
                case 42:
                    if (this.f11815f == null) {
                        this.f11815f = new al();
                    }
                    aVar.a(this.f11815f);
                    continue;
                case 50:
                    if (this.f11816g == null) {
                        this.f11816g = new al();
                    }
                    aVar.a(this.f11816g);
                    continue;
                case 58:
                    if (this.f11817h == null) {
                        this.f11817h = new bd();
                    }
                    aVar.a(this.f11817h);
                    continue;
                case 66:
                    this.f11818i = aVar.f();
                    this.f11810a |= 16;
                    continue;
                case 74:
                    this.f11819j = aVar.g();
                    this.f11810a |= 32;
                    continue;
                case 80:
                    this.f11820k = aVar.i();
                    this.f11810a |= 64;
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
