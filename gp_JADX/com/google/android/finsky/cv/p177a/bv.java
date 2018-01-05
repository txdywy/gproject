package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bv extends C0758b {
    public ax f11969a;

    public bv() {
        this.f11969a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        if (this.f11969a == null) {
            if (bvVar.f11969a != null) {
                return false;
            }
        } else if (!this.f11969a.equals(bvVar.f11969a)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bvVar.aO);
        }
        if (bvVar.aO == null || bvVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        ax axVar = this.f11969a;
        hashCode = ((axVar == null ? 0 : axVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11969a != null) {
            codedOutputByteBufferNano.b(1, this.f11969a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11969a != null) {
            return b + CodedOutputByteBufferNano.d(1, this.f11969a);
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
                    if (this.f11969a == null) {
                        this.f11969a = new ax();
                    }
                    aVar.a(this.f11969a);
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
