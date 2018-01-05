package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ix extends C0758b {
    public int f12745a;
    public int f12746b;
    public int f12747c;
    public int f12748d;

    public ix() {
        this.f12745a = 0;
        this.f12746b = 0;
        this.f12747c = 0;
        this.f12748d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ix)) {
            return false;
        }
        ix ixVar = (ix) obj;
        if ((this.f12745a & 1) != (ixVar.f12745a & 1)) {
            return false;
        }
        if (this.f12746b != ixVar.f12746b) {
            return false;
        }
        if ((this.f12745a & 2) != (ixVar.f12745a & 2)) {
            return false;
        }
        if (this.f12747c != ixVar.f12747c) {
            return false;
        }
        if ((this.f12745a & 4) != (ixVar.f12745a & 4)) {
            return false;
        }
        if (this.f12748d != ixVar.f12748d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ixVar.aO);
        }
        if (ixVar.aO == null || ixVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f12746b) * 31) + this.f12747c) * 31) + this.f12748d) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12745a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12746b);
        }
        if ((this.f12745a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12747c);
        }
        if ((this.f12745a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12748d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12745a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12746b);
        }
        if ((this.f12745a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12747c);
        }
        if ((this.f12745a & 4) != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f12748d);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12746b = aVar.i();
                    this.f12745a |= 1;
                    continue;
                case 16:
                    this.f12747c = aVar.i();
                    this.f12745a |= 2;
                    continue;
                case 24:
                    this.f12748d = aVar.i();
                    this.f12745a |= 4;
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
