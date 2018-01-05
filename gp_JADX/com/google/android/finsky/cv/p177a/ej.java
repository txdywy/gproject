package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ej extends C0758b {
    public ei f12283a;

    public ej() {
        this.f12283a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ej)) {
            return false;
        }
        ej ejVar = (ej) obj;
        if (this.f12283a == null) {
            if (ejVar.f12283a != null) {
                return false;
            }
        } else if (!this.f12283a.equals(ejVar.f12283a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ejVar.aO);
        }
        if (ejVar.aO == null || ejVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ei eiVar = this.f12283a;
        hashCode = ((eiVar == null ? 0 : eiVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12283a != null) {
            codedOutputByteBufferNano.b(1, this.f12283a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12283a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f12283a);
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
                    if (this.f12283a == null) {
                        this.f12283a = new ei();
                    }
                    aVar.a(this.f12283a);
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
