package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ka extends C0758b {
    public int f12850a;
    public String f12851b;
    public String f12852c;
    public kb[] f12853d;

    public ka() {
        this.f12850a = 0;
        this.f12851b = "";
        this.f12852c = "";
        this.f12853d = kb.bF_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        if ((this.f12850a & 1) != (kaVar.f12850a & 1)) {
            return false;
        }
        if (!this.f12851b.equals(kaVar.f12851b)) {
            return false;
        }
        if ((this.f12850a & 2) != (kaVar.f12850a & 2)) {
            return false;
        }
        if (!this.f12852c.equals(kaVar.f12852c)) {
            return false;
        }
        if (!h.a(this.f12853d, kaVar.f12853d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kaVar.aO);
        }
        if (kaVar.aO == null || kaVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12851b.hashCode()) * 31) + this.f12852c.hashCode()) * 31) + h.a(this.f12853d)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12850a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12851b);
        }
        if ((this.f12850a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12852c);
        }
        if (this.f12853d != null && this.f12853d.length > 0) {
            for (C0757i c0757i : this.f12853d) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12850a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12851b);
        }
        if ((this.f12850a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12852c);
        }
        if (this.f12853d == null || this.f12853d.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f12853d) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(3, c0757i);
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
                    this.f12851b = aVar.f();
                    this.f12850a |= 1;
                    continue;
                case 18:
                    this.f12852c = aVar.f();
                    this.f12850a |= 2;
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f12853d == null ? 0 : this.f12853d.length;
                    Object obj = new kb[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12853d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kb();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new kb();
                    aVar.a(obj[a]);
                    this.f12853d = obj;
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
