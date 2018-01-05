package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class kx extends C0758b {
    public cv f12975a;

    public kx() {
        this.f12975a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        if (this.f12975a == null) {
            if (kxVar.f12975a != null) {
                return false;
            }
        } else if (!this.f12975a.equals(kxVar.f12975a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kxVar.aO);
        }
        if (kxVar.aO == null || kxVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cv cvVar = this.f12975a;
        hashCode = ((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12975a != null) {
            codedOutputByteBufferNano.b(1, this.f12975a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12975a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f12975a);
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
                    if (this.f12975a == null) {
                        this.f12975a = new cv();
                    }
                    aVar.a(this.f12975a);
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
