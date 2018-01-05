package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class fc extends C0758b {
    public int f12352a;
    public boolean f12353b;

    public fc() {
        this.f12352a = 0;
        this.f12353b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        if ((this.f12352a & 1) != (fcVar.f12352a & 1)) {
            return false;
        }
        if (this.f12353b != fcVar.f12353b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fcVar.aO);
        }
        if (fcVar.aO == null || fcVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f12353b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12352a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12353b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12352a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(1) + 1);
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
                    this.f12353b = aVar.e();
                    this.f12352a |= 1;
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
