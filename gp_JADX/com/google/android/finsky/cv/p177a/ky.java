package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ky extends C0758b {
    public int f12976a;
    public String f12977b;
    public int f12978c;
    public String f12979d;
    public lx[] f12980e;

    public ky() {
        this.f12976a = 0;
        this.f12977b = "";
        this.f12978c = 0;
        this.f12979d = "";
        this.f12980e = lx.bS_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj;
        if ((this.f12976a & 1) != (kyVar.f12976a & 1)) {
            return false;
        }
        if (!this.f12977b.equals(kyVar.f12977b)) {
            return false;
        }
        if ((this.f12976a & 2) != (kyVar.f12976a & 2)) {
            return false;
        }
        if (this.f12978c != kyVar.f12978c) {
            return false;
        }
        if ((this.f12976a & 4) != (kyVar.f12976a & 4)) {
            return false;
        }
        if (!this.f12979d.equals(kyVar.f12979d)) {
            return false;
        }
        if (!h.a(this.f12980e, kyVar.f12980e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kyVar.aO);
        }
        if (kyVar.aO == null || kyVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + this.f12977b.hashCode()) * 31) + this.f12978c) * 31) + this.f12979d.hashCode()) * 31) + h.a(this.f12980e)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12976a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12977b);
        }
        if ((this.f12976a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12978c);
        }
        if ((this.f12976a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12979d);
        }
        if (this.f12980e != null && this.f12980e.length > 0) {
            for (C0757i c0757i : this.f12980e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12976a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12977b);
        }
        if ((this.f12976a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12978c);
        }
        if ((this.f12976a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12979d);
        }
        if (this.f12980e == null || this.f12980e.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12980e) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(4, c0757i);
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
                    this.f12977b = aVar.f();
                    this.f12976a |= 1;
                    continue;
                case 16:
                    this.f12978c = aVar.i();
                    this.f12976a |= 2;
                    continue;
                case 26:
                    this.f12979d = aVar.f();
                    this.f12976a |= 4;
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f12980e == null ? 0 : this.f12980e.length;
                    Object obj = new lx[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12980e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lx();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new lx();
                    aVar.a(obj[a]);
                    this.f12980e = obj;
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
