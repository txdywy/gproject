package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ei extends C0758b {
    public int f12280a;
    public int f12281b;
    public int f12282c;

    public ei() {
        this.f12280a = 0;
        this.f12281b = 0;
        this.f12282c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        if ((this.f12280a & 1) != (eiVar.f12280a & 1)) {
            return false;
        }
        if (this.f12281b != eiVar.f12281b) {
            return false;
        }
        if ((this.f12280a & 2) != (eiVar.f12280a & 2)) {
            return false;
        }
        if (this.f12282c != eiVar.f12282c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(eiVar.aO);
        }
        if (eiVar.aO == null || eiVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12281b) * 31) + this.f12282c) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12280a & 1) != 0) {
            codedOutputByteBufferNano.c(1, this.f12281b);
        }
        if ((this.f12280a & 2) != 0) {
            codedOutputByteBufferNano.c(2, this.f12282c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12280a & 1) != 0) {
            b += CodedOutputByteBufferNano.e(1, this.f12281b);
        }
        if ((this.f12280a & 2) != 0) {
            return b + CodedOutputByteBufferNano.e(2, this.f12282c);
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
                    this.f12281b = aVar.i();
                    this.f12280a |= 1;
                    continue;
                case 16:
                    this.f12282c = aVar.i();
                    this.f12280a |= 2;
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
