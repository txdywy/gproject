package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class li extends C0758b {
    public kp f13014a;

    public li() {
        this.f13014a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        if (this.f13014a == null) {
            if (liVar.f13014a != null) {
                return false;
            }
        } else if (!this.f13014a.equals(liVar.f13014a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(liVar.aO);
        }
        if (liVar.aO == null || liVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        kp kpVar = this.f13014a;
        hashCode = ((kpVar == null ? 0 : kpVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13014a != null) {
            codedOutputByteBufferNano.b(1, this.f13014a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f13014a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f13014a);
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
                    if (this.f13014a == null) {
                        this.f13014a = new kp();
                    }
                    aVar.a(this.f13014a);
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
