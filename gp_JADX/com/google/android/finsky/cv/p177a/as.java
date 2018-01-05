package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class as extends C0758b {
    public ar f11826a;

    public as() {
        this.f11826a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        if (this.f11826a == null) {
            if (asVar.f11826a != null) {
                return false;
            }
        } else if (!this.f11826a.equals(asVar.f11826a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(asVar.aO);
        }
        if (asVar.aO == null || asVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ar arVar = this.f11826a;
        hashCode = ((arVar == null ? 0 : arVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11826a != null) {
            codedOutputByteBufferNano.b(1, this.f11826a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11826a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f11826a);
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
                    if (this.f11826a == null) {
                        this.f11826a = new ar();
                    }
                    aVar.a(this.f11826a);
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
