package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hz extends C0758b {
    public int f12640a;
    public cv f12641b;
    public String f12642c;

    public hz() {
        this.f12640a = 0;
        this.f12641b = null;
        this.f12642c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hz)) {
            return false;
        }
        hz hzVar = (hz) obj;
        if (this.f12641b == null) {
            if (hzVar.f12641b != null) {
                return false;
            }
        } else if (!this.f12641b.equals(hzVar.f12641b)) {
            return false;
        }
        if ((this.f12640a & 1) != (hzVar.f12640a & 1)) {
            return false;
        }
        if (!this.f12642c.equals(hzVar.f12642c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hzVar.aO);
        }
        if (hzVar.aO == null || hzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cv cvVar = this.f12641b;
        hashCode = ((((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31) + this.f12642c.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12641b != null) {
            codedOutputByteBufferNano.b(1, this.f12641b);
        }
        if ((this.f12640a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12642c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12641b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12641b);
        }
        if ((this.f12640a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12642c);
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
                    if (this.f12641b == null) {
                        this.f12641b = new cv();
                    }
                    aVar.a(this.f12641b);
                    continue;
                case 18:
                    this.f12642c = aVar.f();
                    this.f12640a |= 1;
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
