package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2453z extends C0758b {
    public int f13228a;
    public boolean f13229b;

    public C2453z() {
        this.f13228a = 0;
        this.f13229b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2453z)) {
            return false;
        }
        C2453z c2453z = (C2453z) obj;
        if ((this.f13228a & 1) != (c2453z.f13228a & 1)) {
            return false;
        }
        if (this.f13229b != c2453z.f13229b) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2453z.aO);
        }
        if (c2453z.aO == null || c2453z.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f13229b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13228a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13229b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13228a & 1) != 0) {
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
                    this.f13229b = aVar.e();
                    this.f13228a |= 1;
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
