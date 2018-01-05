package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hu extends C0758b {
    public bd f12621a;
    public eu f12622b;

    public hu() {
        this.f12621a = null;
        this.f12622b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hu)) {
            return false;
        }
        hu huVar = (hu) obj;
        if (this.f12621a == null) {
            if (huVar.f12621a != null) {
                return false;
            }
        } else if (!this.f12621a.equals(huVar.f12621a)) {
            return false;
        }
        if (this.f12622b == null) {
            if (huVar.f12622b != null) {
                return false;
            }
        } else if (!this.f12622b.equals(huVar.f12622b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(huVar.aO);
        }
        if (huVar.aO == null || huVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bd bdVar = this.f12621a;
        hashCode = (bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31);
        eu euVar = this.f12622b;
        hashCode = ((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12621a != null) {
            codedOutputByteBufferNano.b(1, this.f12621a);
        }
        if (this.f12622b != null) {
            codedOutputByteBufferNano.b(2, this.f12622b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12621a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12621a);
        }
        if (this.f12622b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12622b);
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
                    if (this.f12621a == null) {
                        this.f12621a = new bd();
                    }
                    aVar.a(this.f12621a);
                    continue;
                case 18:
                    if (this.f12622b == null) {
                        this.f12622b = new eu();
                    }
                    aVar.a(this.f12622b);
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
