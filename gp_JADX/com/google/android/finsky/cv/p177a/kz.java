package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class kz extends C0758b {
    public int f12981a;
    public String f12982b;
    public int f12983c;
    public String f12984d;
    public String f12985e;
    public int f12986f;
    public int f12987g;
    public boolean f12988h;
    public String f12989i;
    public lx[] f12990j;

    public kz() {
        this.f12981a = 0;
        this.f12982b = "";
        this.f12983c = 0;
        this.f12984d = "";
        this.f12985e = "";
        this.f12986f = 0;
        this.f12987g = 0;
        this.f12988h = false;
        this.f12989i = "";
        this.f12990j = lx.bS_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        if ((this.f12981a & 1) != (kzVar.f12981a & 1)) {
            return false;
        }
        if (!this.f12982b.equals(kzVar.f12982b)) {
            return false;
        }
        if ((this.f12981a & 2) != (kzVar.f12981a & 2)) {
            return false;
        }
        if (this.f12983c != kzVar.f12983c) {
            return false;
        }
        if ((this.f12981a & 4) != (kzVar.f12981a & 4)) {
            return false;
        }
        if (!this.f12984d.equals(kzVar.f12984d)) {
            return false;
        }
        if ((this.f12981a & 8) != (kzVar.f12981a & 8)) {
            return false;
        }
        if (!this.f12985e.equals(kzVar.f12985e)) {
            return false;
        }
        if ((this.f12981a & 16) != (kzVar.f12981a & 16)) {
            return false;
        }
        if (this.f12986f != kzVar.f12986f) {
            return false;
        }
        if ((this.f12981a & 32) != (kzVar.f12981a & 32)) {
            return false;
        }
        if (this.f12987g != kzVar.f12987g) {
            return false;
        }
        if ((this.f12981a & 64) != (kzVar.f12981a & 64)) {
            return false;
        }
        if (this.f12988h != kzVar.f12988h) {
            return false;
        }
        if ((this.f12981a & 128) != (kzVar.f12981a & 128)) {
            return false;
        }
        if (!this.f12989i.equals(kzVar.f12989i)) {
            return false;
        }
        if (!h.a(this.f12990j, kzVar.f12990j)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kzVar.aO);
        }
        if (kzVar.aO == null || kzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((this.f12988h ? 1231 : 1237) + ((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12982b.hashCode()) * 31) + this.f12983c) * 31) + this.f12984d.hashCode()) * 31) + this.f12985e.hashCode()) * 31) + this.f12986f) * 31) + this.f12987g) * 31)) * 31) + this.f12989i.hashCode()) * 31) + h.a(this.f12990j)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12981a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12982b);
        }
        if ((this.f12981a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12983c);
        }
        if ((this.f12981a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12984d);
        }
        if ((this.f12981a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12985e);
        }
        if ((this.f12981a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12986f);
        }
        if ((this.f12981a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f12987g);
        }
        if ((this.f12981a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f12988h);
        }
        if ((this.f12981a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f12989i);
        }
        if (this.f12990j != null && this.f12990j.length > 0) {
            for (C0757i c0757i : this.f12990j) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(9, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12981a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12982b);
        }
        if ((this.f12981a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12983c);
        }
        if ((this.f12981a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12984d);
        }
        if ((this.f12981a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12985e);
        }
        if ((this.f12981a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f12986f);
        }
        if ((this.f12981a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f12987g);
        }
        if ((this.f12981a & 64) != 0) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if ((this.f12981a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f12989i);
        }
        if (this.f12990j == null || this.f12990j.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12990j) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(9, c0757i);
            }
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12982b = aVar.f();
                    this.f12981a |= 1;
                    continue;
                case 16:
                    this.f12983c = aVar.i();
                    this.f12981a |= 2;
                    continue;
                case 26:
                    this.f12984d = aVar.f();
                    this.f12981a |= 4;
                    continue;
                case 34:
                    this.f12985e = aVar.f();
                    this.f12981a |= 8;
                    continue;
                case 40:
                    this.f12986f = aVar.i();
                    this.f12981a |= 16;
                    continue;
                case 48:
                    this.f12987g = aVar.i();
                    this.f12981a |= 32;
                    continue;
                case 56:
                    this.f12988h = aVar.e();
                    this.f12981a |= 64;
                    continue;
                case 66:
                    this.f12989i = aVar.f();
                    this.f12981a |= 128;
                    continue;
                case 74:
                    int a2 = l.a(aVar, 74);
                    a = this.f12990j == null ? 0 : this.f12990j.length;
                    Object obj = new lx[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12990j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lx();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lx();
                    aVar.a(obj[a]);
                    this.f12990j = obj;
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
