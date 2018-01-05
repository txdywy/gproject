package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class hl extends C0758b {
    public int f12572a;
    public hm[] f12573b;
    public String f12574c;
    public hj f12575d;
    public hj f12576e;
    public String f12577f;
    public eu f12578g;
    public String f12579h;

    public hl() {
        this.f12572a = 0;
        this.f12573b = hm.bj_();
        this.f12574c = "";
        this.f12575d = null;
        this.f12576e = null;
        this.f12577f = "";
        this.f12578g = null;
        this.f12579h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hl)) {
            return false;
        }
        hl hlVar = (hl) obj;
        if (!h.a(this.f12573b, hlVar.f12573b)) {
            return false;
        }
        if ((this.f12572a & 1) != (hlVar.f12572a & 1)) {
            return false;
        }
        if (!this.f12574c.equals(hlVar.f12574c)) {
            return false;
        }
        if (this.f12575d == null) {
            if (hlVar.f12575d != null) {
                return false;
            }
        } else if (!this.f12575d.equals(hlVar.f12575d)) {
            return false;
        }
        if (this.f12576e == null) {
            if (hlVar.f12576e != null) {
                return false;
            }
        } else if (!this.f12576e.equals(hlVar.f12576e)) {
            return false;
        }
        if ((this.f12572a & 2) != (hlVar.f12572a & 2)) {
            return false;
        }
        if (!this.f12577f.equals(hlVar.f12577f)) {
            return false;
        }
        if (this.f12578g == null) {
            if (hlVar.f12578g != null) {
                return false;
            }
        } else if (!this.f12578g.equals(hlVar.f12578g)) {
            return false;
        }
        if ((this.f12572a & 4) != (hlVar.f12572a & 4)) {
            return false;
        }
        if (!this.f12579h.equals(hlVar.f12579h)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hlVar.aO);
        }
        if (hlVar.aO == null || hlVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12573b)) * 31) + this.f12574c.hashCode();
        hj hjVar = this.f12575d;
        hashCode = (hjVar == null ? 0 : hjVar.hashCode()) + (hashCode * 31);
        hjVar = this.f12576e;
        hashCode = (((hjVar == null ? 0 : hjVar.hashCode()) + (hashCode * 31)) * 31) + this.f12577f.hashCode();
        eu euVar = this.f12578g;
        hashCode = ((((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31) + this.f12579h.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12572a & 2) != 0) {
            codedOutputByteBufferNano.a(1, this.f12577f);
        }
        if (this.f12578g != null) {
            codedOutputByteBufferNano.b(2, this.f12578g);
        }
        if ((this.f12572a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12579h);
        }
        if (this.f12573b != null && this.f12573b.length > 0) {
            for (C0757i c0757i : this.f12573b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if ((this.f12572a & 1) != 0) {
            codedOutputByteBufferNano.a(5, this.f12574c);
        }
        if (this.f12575d != null) {
            codedOutputByteBufferNano.b(6, this.f12575d);
        }
        if (this.f12576e != null) {
            codedOutputByteBufferNano.b(7, this.f12576e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12572a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12577f);
        }
        if (this.f12578g != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12578g);
        }
        if ((this.f12572a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12579h);
        }
        if (this.f12573b != null && this.f12573b.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12573b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if ((this.f12572a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12574c);
        }
        if (this.f12575d != null) {
            b += CodedOutputByteBufferNano.d(6, this.f12575d);
        }
        if (this.f12576e != null) {
            return b + CodedOutputByteBufferNano.d(7, this.f12576e);
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
                    this.f12577f = aVar.f();
                    this.f12572a |= 2;
                    continue;
                case 18:
                    if (this.f12578g == null) {
                        this.f12578g = new eu();
                    }
                    aVar.a(this.f12578g);
                    continue;
                case 26:
                    this.f12579h = aVar.f();
                    this.f12572a |= 4;
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f12573b == null ? 0 : this.f12573b.length;
                    Object obj = new hm[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12573b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hm();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new hm();
                    aVar.a(obj[a]);
                    this.f12573b = obj;
                    continue;
                case 42:
                    this.f12574c = aVar.f();
                    this.f12572a |= 1;
                    continue;
                case 50:
                    if (this.f12575d == null) {
                        this.f12575d = new hj();
                    }
                    aVar.a(this.f12575d);
                    continue;
                case 58:
                    if (this.f12576e == null) {
                        this.f12576e = new hj();
                    }
                    aVar.a(this.f12576e);
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
