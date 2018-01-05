package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class fk extends C0758b {
    public int f12372a;
    public int f12373b;

    public fk() {
        this.f12372a = 0;
        this.f12373b = 1;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fk)) {
            return false;
        }
        fk fkVar = (fk) obj;
        if ((this.f12372a & 1) != (fkVar.f12372a & 1)) {
            return false;
        }
        if (this.f12373b != fkVar.f12373b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fkVar.aO);
        }
        if (fkVar.aO == null || fkVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f12373b) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12372a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12373b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12372a & 1) != 0) {
            return b + CodedOutputByteBufferNano.d(1, this.f12373b);
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
                    this.f12373b = aVar.i();
                    this.f12372a |= 1;
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
