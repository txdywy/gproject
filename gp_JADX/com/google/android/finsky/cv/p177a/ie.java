package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ie extends C0758b {
    public int f12649a;
    public int f12650b;
    public int f12651c;

    public ie() {
        this.f12649a = 0;
        this.f12650b = 0;
        this.f12651c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        if ((this.f12649a & 1) != (ieVar.f12649a & 1)) {
            return false;
        }
        if (this.f12650b != ieVar.f12650b) {
            return false;
        }
        if ((this.f12649a & 2) != (ieVar.f12649a & 2)) {
            return false;
        }
        if (this.f12651c != ieVar.f12651c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ieVar.aO);
        }
        if (ieVar.aO == null || ieVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12650b) * 31) + this.f12651c) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12649a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12650b);
        }
        if ((this.f12649a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12651c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12649a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12650b);
        }
        if ((this.f12649a & 2) != 0) {
            return b + CodedOutputByteBufferNano.d(2, this.f12651c);
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
                    this.f12650b = aVar.i();
                    this.f12649a |= 1;
                    continue;
                case 16:
                    this.f12651c = aVar.i();
                    this.f12649a |= 2;
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
