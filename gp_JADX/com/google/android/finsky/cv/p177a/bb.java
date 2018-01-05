package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bb extends C0758b {
    public int f11847a;
    public long f11848b;

    public bb() {
        this.f11847a = 0;
        this.f11848b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        if ((this.f11847a & 1) != (bbVar.f11847a & 1)) {
            return false;
        }
        if (this.f11848b != bbVar.f11848b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bbVar.aO);
        }
        if (bbVar.aO == null || bbVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f11848b;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11847a & 1) != 0) {
            codedOutputByteBufferNano.c(1, this.f11848b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11847a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(1) + 8);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f11848b = aVar.l();
                    this.f11847a |= 1;
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
