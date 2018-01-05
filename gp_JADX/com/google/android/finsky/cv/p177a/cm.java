package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class cm extends C0758b {
    public cl f12047a;

    public cm() {
        this.f12047a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cm)) {
            return false;
        }
        cm cmVar = (cm) obj;
        if (this.f12047a == null) {
            if (cmVar.f12047a != null) {
                return false;
            }
        } else if (!this.f12047a.equals(cmVar.f12047a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cmVar.aO);
        }
        if (cmVar.aO == null || cmVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        cl clVar = this.f12047a;
        hashCode = ((clVar == null ? 0 : clVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12047a != null) {
            codedOutputByteBufferNano.b(1, this.f12047a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12047a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f12047a);
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
                    if (this.f12047a == null) {
                        this.f12047a = new cl();
                    }
                    aVar.a(this.f12047a);
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
