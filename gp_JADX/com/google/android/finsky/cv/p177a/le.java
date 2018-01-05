package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class le extends C0758b {
    public cv f13004a;

    public le() {
        this.f13004a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof le)) {
            return false;
        }
        le leVar = (le) obj;
        if (this.f13004a == null) {
            if (leVar.f13004a != null) {
                return false;
            }
        } else if (!this.f13004a.equals(leVar.f13004a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(leVar.aO);
        }
        if (leVar.aO == null || leVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cv cvVar = this.f13004a;
        hashCode = ((cvVar == null ? 0 : cvVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13004a != null) {
            codedOutputByteBufferNano.b(1, this.f13004a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13004a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f13004a);
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
                    if (this.f13004a == null) {
                        this.f13004a = new cv();
                    }
                    aVar.a(this.f13004a);
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
