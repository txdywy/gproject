package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jr extends C0758b {
    public int f12813a;
    public long f12814b;

    public jr() {
        this.f12813a = 0;
        this.f12814b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jr)) {
            return false;
        }
        jr jrVar = (jr) obj;
        if ((this.f12813a & 1) != (jrVar.f12813a & 1)) {
            return false;
        }
        if (this.f12814b != jrVar.f12814b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jrVar.aO);
        }
        if (jrVar.aO == null || jrVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f12814b;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12813a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f12814b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12813a & 1) != 0) {
            return b + CodedOutputByteBufferNano.f(1, this.f12814b);
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
                    this.f12814b = aVar.j();
                    this.f12813a |= 1;
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
