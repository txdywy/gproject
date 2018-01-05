package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class il extends C0758b {
    public int f12663a;
    public String f12664b;

    public il() {
        this.f12663a = 0;
        this.f12664b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof il)) {
            return false;
        }
        il ilVar = (il) obj;
        if ((this.f12663a & 1) != (ilVar.f12663a & 1)) {
            return false;
        }
        if (!this.f12664b.equals(ilVar.f12664b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ilVar.aO);
        }
        if (ilVar.aO == null || ilVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f12664b.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12663a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12664b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12663a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(1, this.f12664b);
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
                    this.f12664b = aVar.f();
                    this.f12663a |= 1;
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
