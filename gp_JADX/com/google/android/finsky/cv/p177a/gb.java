package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class gb extends C0758b {
    public int f12407a;
    public String f12408b;
    public String f12409c;
    public String f12410d;
    public String f12411e;
    public String f12412f;
    public String f12413g;
    public bd f12414h;
    public boolean f12415i;
    public eu f12416j;
    public boolean f12417k;
    public ke[] f12418l;

    public gb() {
        this.f12407a = 0;
        this.f12408b = "";
        this.f12409c = "";
        this.f12410d = "";
        this.f12411e = "";
        this.f12412f = "";
        this.f12413g = "";
        this.f12414h = null;
        this.f12415i = false;
        this.f12416j = null;
        this.f12417k = false;
        this.f12418l = ke.bG_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        if ((this.f12407a & 1) != (gbVar.f12407a & 1)) {
            return false;
        }
        if (!this.f12408b.equals(gbVar.f12408b)) {
            return false;
        }
        if ((this.f12407a & 2) != (gbVar.f12407a & 2)) {
            return false;
        }
        if (!this.f12409c.equals(gbVar.f12409c)) {
            return false;
        }
        if ((this.f12407a & 4) != (gbVar.f12407a & 4)) {
            return false;
        }
        if (!this.f12410d.equals(gbVar.f12410d)) {
            return false;
        }
        if ((this.f12407a & 8) != (gbVar.f12407a & 8)) {
            return false;
        }
        if (!this.f12411e.equals(gbVar.f12411e)) {
            return false;
        }
        if ((this.f12407a & 16) != (gbVar.f12407a & 16)) {
            return false;
        }
        if (!this.f12412f.equals(gbVar.f12412f)) {
            return false;
        }
        if ((this.f12407a & 32) != (gbVar.f12407a & 32)) {
            return false;
        }
        if (!this.f12413g.equals(gbVar.f12413g)) {
            return false;
        }
        if (this.f12414h == null) {
            if (gbVar.f12414h != null) {
                return false;
            }
        } else if (!this.f12414h.equals(gbVar.f12414h)) {
            return false;
        }
        if ((this.f12407a & 64) != (gbVar.f12407a & 64)) {
            return false;
        }
        if (this.f12415i != gbVar.f12415i) {
            return false;
        }
        if (this.f12416j == null) {
            if (gbVar.f12416j != null) {
                return false;
            }
        } else if (!this.f12416j.equals(gbVar.f12416j)) {
            return false;
        }
        if ((this.f12407a & 128) != (gbVar.f12407a & 128)) {
            return false;
        }
        if (this.f12417k != gbVar.f12417k) {
            return false;
        }
        if (!h.a(this.f12418l, gbVar.f12418l)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gbVar.aO);
        }
        if (gbVar.aO == null || gbVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = ((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12408b.hashCode()) * 31) + this.f12409c.hashCode()) * 31) + this.f12410d.hashCode()) * 31) + this.f12411e.hashCode()) * 31) + this.f12412f.hashCode()) * 31) + this.f12413g.hashCode();
        bd bdVar = this.f12414h;
        int hashCode2 = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (this.f12415i) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode += hashCode2;
        eu euVar = this.f12416j;
        hashCode = ((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31;
        if (!this.f12417k) {
            i = 1237;
        }
        hashCode = (((hashCode + i) * 31) + h.a(this.f12418l)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12407a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12408b);
        }
        if ((this.f12407a & 4) != 0) {
            codedOutputByteBufferNano.a(2, this.f12410d);
        }
        if ((this.f12407a & 8) != 0) {
            codedOutputByteBufferNano.a(3, this.f12411e);
        }
        if ((this.f12407a & 16) != 0) {
            codedOutputByteBufferNano.a(4, this.f12412f);
        }
        if ((this.f12407a & 32) != 0) {
            codedOutputByteBufferNano.a(5, this.f12413g);
        }
        if ((this.f12407a & 64) != 0) {
            codedOutputByteBufferNano.a(6, this.f12415i);
        }
        if (this.f12416j != null) {
            codedOutputByteBufferNano.b(7, this.f12416j);
        }
        if ((this.f12407a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f12417k);
        }
        if (this.f12414h != null) {
            codedOutputByteBufferNano.b(9, this.f12414h);
        }
        if (this.f12418l != null && this.f12418l.length > 0) {
            for (C0757i c0757i : this.f12418l) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(10, c0757i);
                }
            }
        }
        if ((this.f12407a & 2) != 0) {
            codedOutputByteBufferNano.a(11, this.f12409c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12407a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12408b);
        }
        if ((this.f12407a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12410d);
        }
        if ((this.f12407a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12411e);
        }
        if ((this.f12407a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12412f);
        }
        if ((this.f12407a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12413g);
        }
        if ((this.f12407a & 64) != 0) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f12416j != null) {
            b += CodedOutputByteBufferNano.d(7, this.f12416j);
        }
        if ((this.f12407a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if (this.f12414h != null) {
            b += CodedOutputByteBufferNano.d(9, this.f12414h);
        }
        if (this.f12418l != null && this.f12418l.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12418l) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(10, c0757i);
                }
            }
            b = i;
        }
        if ((this.f12407a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(11, this.f12409c);
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
                    this.f12408b = aVar.f();
                    this.f12407a |= 1;
                    continue;
                case 18:
                    this.f12410d = aVar.f();
                    this.f12407a |= 4;
                    continue;
                case 26:
                    this.f12411e = aVar.f();
                    this.f12407a |= 8;
                    continue;
                case 34:
                    this.f12412f = aVar.f();
                    this.f12407a |= 16;
                    continue;
                case 42:
                    this.f12413g = aVar.f();
                    this.f12407a |= 32;
                    continue;
                case 48:
                    this.f12415i = aVar.e();
                    this.f12407a |= 64;
                    continue;
                case 58:
                    if (this.f12416j == null) {
                        this.f12416j = new eu();
                    }
                    aVar.a(this.f12416j);
                    continue;
                case 64:
                    this.f12417k = aVar.e();
                    this.f12407a |= 128;
                    continue;
                case 74:
                    if (this.f12414h == null) {
                        this.f12414h = new bd();
                    }
                    aVar.a(this.f12414h);
                    continue;
                case 82:
                    int a2 = l.a(aVar, 82);
                    a = this.f12418l == null ? 0 : this.f12418l.length;
                    Object obj = new ke[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12418l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ke();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ke();
                    aVar.a(obj[a]);
                    this.f12418l = obj;
                    continue;
                case 90:
                    this.f12409c = aVar.f();
                    this.f12407a |= 2;
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
