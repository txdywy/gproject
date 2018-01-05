package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gs extends C0758b {
    public int f12494a;
    public int f12495b;
    public long f12496c;

    public gs() {
        this.f12494a = 0;
        this.f12495b = 0;
        this.f12496c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gs)) {
            return false;
        }
        gs gsVar = (gs) obj;
        if ((this.f12494a & 1) != (gsVar.f12494a & 1)) {
            return false;
        }
        if (this.f12495b != gsVar.f12495b) {
            return false;
        }
        if ((this.f12494a & 2) != (gsVar.f12494a & 2)) {
            return false;
        }
        if (this.f12496c != gsVar.f12496c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gsVar.aO);
        }
        if (gsVar.aO == null || gsVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12495b;
        long j = this.f12496c;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12494a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12495b);
        }
        if ((this.f12494a & 2) != 0) {
            codedOutputByteBufferNano.b(2, this.f12496c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12494a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12495b);
        }
        if ((this.f12494a & 2) != 0) {
            return b + CodedOutputByteBufferNano.f(2, this.f12496c);
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
                    this.f12495b = aVar.i();
                    this.f12494a |= 1;
                    continue;
                case 16:
                    this.f12496c = aVar.j();
                    this.f12494a |= 2;
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
