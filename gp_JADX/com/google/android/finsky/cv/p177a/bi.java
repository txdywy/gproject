package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bi extends C0758b {
    public bc f11895a;

    public bi() {
        this.f11895a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        if (this.f11895a == null) {
            if (biVar.f11895a != null) {
                return false;
            }
        } else if (!this.f11895a.equals(biVar.f11895a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(biVar.aO);
        }
        if (biVar.aO == null || biVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bc bcVar = this.f11895a;
        hashCode = ((bcVar == null ? 0 : bcVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11895a != null) {
            codedOutputByteBufferNano.b(1, this.f11895a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11895a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f11895a);
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
                    if (this.f11895a == null) {
                        this.f11895a = new bc();
                    }
                    aVar.a(this.f11895a);
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
