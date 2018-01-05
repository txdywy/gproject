package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class kl extends C0758b {
    public int f12891a;
    public boolean f12892b;

    public kl() {
        this.f12891a = 0;
        this.f12892b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        if ((this.f12891a & 1) != (klVar.f12891a & 1)) {
            return false;
        }
        if (this.f12892b != klVar.f12892b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(klVar.aO);
        }
        if (klVar.aO == null || klVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f12892b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12891a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12892b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12891a & 1) != 0) {
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
                    this.f12892b = aVar.e();
                    this.f12891a |= 1;
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
