package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class gv extends C0758b {
    public int f12503a;
    public ax f12504b;
    public String f12505c;
    public String f12506d;
    public String f12507e;
    public bd[] f12508f;
    public String f12509g;

    public gv() {
        this.f12503a = 0;
        this.f12504b = null;
        this.f12505c = "";
        this.f12506d = "";
        this.f12507e = "";
        this.f12508f = bd.aH_();
        this.f12509g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gv)) {
            return false;
        }
        gv gvVar = (gv) obj;
        if (this.f12504b == null) {
            if (gvVar.f12504b != null) {
                return false;
            }
        } else if (!this.f12504b.equals(gvVar.f12504b)) {
            return false;
        }
        if ((this.f12503a & 1) != (gvVar.f12503a & 1)) {
            return false;
        }
        if (!this.f12505c.equals(gvVar.f12505c)) {
            return false;
        }
        if ((this.f12503a & 2) != (gvVar.f12503a & 2)) {
            return false;
        }
        if (!this.f12506d.equals(gvVar.f12506d)) {
            return false;
        }
        if ((this.f12503a & 4) != (gvVar.f12503a & 4)) {
            return false;
        }
        if (!this.f12507e.equals(gvVar.f12507e)) {
            return false;
        }
        if (!h.a(this.f12508f, gvVar.f12508f)) {
            return false;
        }
        if ((this.f12503a & 8) != (gvVar.f12503a & 8)) {
            return false;
        }
        if (!this.f12509g.equals(gvVar.f12509g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gvVar.aO);
        }
        if (gvVar.aO == null || gvVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ax axVar = this.f12504b;
        hashCode = ((((((((((((axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31)) * 31) + this.f12505c.hashCode()) * 31) + this.f12506d.hashCode()) * 31) + this.f12507e.hashCode()) * 31) + h.a(this.f12508f)) * 31) + this.f12509g.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12504b != null) {
            codedOutputByteBufferNano.b(1, this.f12504b);
        }
        if ((this.f12503a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12505c);
        }
        if ((this.f12503a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12506d);
        }
        if ((this.f12503a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12507e);
        }
        if (this.f12508f != null && this.f12508f.length > 0) {
            for (C0757i c0757i : this.f12508f) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(5, c0757i);
                }
            }
        }
        if ((this.f12503a & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f12509g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12504b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12504b);
        }
        if ((this.f12503a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12505c);
        }
        if ((this.f12503a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12506d);
        }
        if ((this.f12503a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12507e);
        }
        if (this.f12508f != null && this.f12508f.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12508f) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(5, c0757i);
                }
            }
            b = i;
        }
        if ((this.f12503a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f12509g);
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
                    if (this.f12504b == null) {
                        this.f12504b = new ax();
                    }
                    aVar.a(this.f12504b);
                    continue;
                case 18:
                    this.f12505c = aVar.f();
                    this.f12503a |= 1;
                    continue;
                case 26:
                    this.f12506d = aVar.f();
                    this.f12503a |= 2;
                    continue;
                case 34:
                    this.f12507e = aVar.f();
                    this.f12503a |= 4;
                    continue;
                case 42:
                    int a2 = l.a(aVar, 42);
                    a = this.f12508f == null ? 0 : this.f12508f.length;
                    Object obj = new bd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12508f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bd();
                    aVar.a(obj[a]);
                    this.f12508f = obj;
                    continue;
                case 50:
                    this.f12509g = aVar.f();
                    this.f12503a |= 8;
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
