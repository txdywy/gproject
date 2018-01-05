package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ad extends C0758b {
    public static volatile ad[] f11764a;
    public int f11765b;
    public String f11766c;
    public bd[] f11767d;
    public ac[] f11768e;

    public static ad[] aB_() {
        if (f11764a == null) {
            synchronized (h.b) {
                if (f11764a == null) {
                    f11764a = new ad[0];
                }
            }
        }
        return f11764a;
    }

    public ad() {
        this.f11765b = 0;
        this.f11766c = "";
        this.f11767d = bd.aH_();
        this.f11768e = ac.aA_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        if ((this.f11765b & 1) != (adVar.f11765b & 1)) {
            return false;
        }
        if (!this.f11766c.equals(adVar.f11766c)) {
            return false;
        }
        if (!h.a(this.f11767d, adVar.f11767d)) {
            return false;
        }
        if (!h.a(this.f11768e, adVar.f11768e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(adVar.aO);
        }
        if (adVar.aO == null || adVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f11766c.hashCode()) * 31) + h.a(this.f11767d)) * 31) + h.a(this.f11768e)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f11765b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11766c);
        }
        if (this.f11767d != null && this.f11767d.length > 0) {
            for (C0757i c0757i : this.f11767d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f11768e != null && this.f11768e.length > 0) {
            while (i < this.f11768e.length) {
                C0757i c0757i2 = this.f11768e[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(3, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f11765b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11766c);
        }
        if (this.f11767d != null && this.f11767d.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f11767d) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i2;
        }
        if (this.f11768e != null && this.f11768e.length > 0) {
            while (i < this.f11768e.length) {
                C0757i c0757i2 = this.f11768e[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(3, c0757i2);
                }
                i++;
            }
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
                    this.f11766c = aVar.f();
                    this.f11765b |= 1;
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f11767d == null ? 0 : this.f11767d.length;
                    obj = new bd[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11767d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bd();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new bd();
                    aVar.a(obj[a]);
                    this.f11767d = obj;
                    continue;
                case 26:
                    a2 = l.a(aVar, 26);
                    a = this.f11768e == null ? 0 : this.f11768e.length;
                    obj = new ac[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f11768e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ac();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ac();
                    aVar.a(obj[a]);
                    this.f11768e = obj;
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
