package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ca extends C0758b {
    public int f12002a;
    public ax[] f12003b;
    public long f12004c;
    public String f12005d;

    public ca() {
        this.f12002a = 0;
        this.f12003b = ax.aG_();
        this.f12004c = 0;
        this.f12005d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        if (!h.a(this.f12003b, caVar.f12003b)) {
            return false;
        }
        if ((this.f12002a & 1) != (caVar.f12002a & 1)) {
            return false;
        }
        if (this.f12004c != caVar.f12004c) {
            return false;
        }
        if ((this.f12002a & 2) != (caVar.f12002a & 2)) {
            return false;
        }
        if (!this.f12005d.equals(caVar.f12005d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(caVar.aO);
        }
        if (caVar.aO == null || caVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12003b);
        long j = this.f12004c;
        int hashCode2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12005d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + hashCode2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12003b != null && this.f12003b.length > 0) {
            for (C0757i c0757i : this.f12003b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f12002a & 1) != 0) {
            codedOutputByteBufferNano.b(2, this.f12004c);
        }
        if ((this.f12002a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f12005d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12003b != null && this.f12003b.length > 0) {
            for (C0757i c0757i : this.f12003b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f12002a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(2, this.f12004c);
        }
        if ((this.f12002a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f12005d);
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
                    int a2 = l.a(aVar, 10);
                    a = this.f12003b == null ? 0 : this.f12003b.length;
                    Object obj = new ax[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12003b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ax();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ax();
                    aVar.a(obj[a]);
                    this.f12003b = obj;
                    continue;
                case 16:
                    this.f12004c = aVar.j();
                    this.f12002a |= 1;
                    continue;
                case 26:
                    this.f12005d = aVar.f();
                    this.f12002a |= 2;
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
