package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class fz extends C0758b {
    public int f12392a;
    public String f12393b;
    public jl f12394c;

    public fz() {
        this.f12392a = 0;
        this.f12393b = "";
        this.f12394c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        if ((this.f12392a & 1) != (fzVar.f12392a & 1)) {
            return false;
        }
        if (!this.f12393b.equals(fzVar.f12393b)) {
            return false;
        }
        if (this.f12394c == null) {
            if (fzVar.f12394c != null) {
                return false;
            }
        } else if (!this.f12394c.equals(fzVar.f12394c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fzVar.aO);
        }
        if (fzVar.aO == null || fzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + this.f12393b.hashCode();
        jl jlVar = this.f12394c;
        hashCode = ((jlVar == null ? 0 : jlVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12392a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12393b);
        }
        if (this.f12394c != null) {
            codedOutputByteBufferNano.b(2, this.f12394c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12392a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12393b);
        }
        if (this.f12394c != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12394c);
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
                    this.f12393b = aVar.f();
                    this.f12392a |= 1;
                    continue;
                case 18:
                    if (this.f12394c == null) {
                        this.f12394c = new jl();
                    }
                    aVar.a(this.f12394c);
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
