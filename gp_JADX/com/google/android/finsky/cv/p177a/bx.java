package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bx extends C0758b {
    public int f11986a;
    public bz f11987b;
    public boolean f11988c;

    public bx() {
        this.f11986a = 0;
        this.f11987b = null;
        this.f11988c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        if (this.f11987b == null) {
            if (bxVar.f11987b != null) {
                return false;
            }
        } else if (!this.f11987b.equals(bxVar.f11987b)) {
            return false;
        }
        if ((this.f11986a & 1) != (bxVar.f11986a & 1)) {
            return false;
        }
        if (this.f11988c != bxVar.f11988c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bxVar.aO);
        }
        if (bxVar.aO == null || bxVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bz bzVar = this.f11987b;
        hashCode = ((this.f11988c ? 1231 : 1237) + (((bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31)) * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11987b != null) {
            codedOutputByteBufferNano.b(1, this.f11987b);
        }
        if ((this.f11986a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f11988c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11987b != null) {
            b += CodedOutputByteBufferNano.d(1, this.f11987b);
        }
        if ((this.f11986a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f11987b == null) {
                        this.f11987b = new bz();
                    }
                    aVar.a(this.f11987b);
                    continue;
                case 16:
                    this.f11988c = aVar.e();
                    this.f11986a |= 1;
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
