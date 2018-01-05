package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jl extends C0758b {
    public jm f12792a;
    public jp f12793b;

    public jl() {
        this.f12792a = null;
        this.f12793b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        jl jlVar = (jl) obj;
        if (this.f12792a == null) {
            if (jlVar.f12792a != null) {
                return false;
            }
        } else if (!this.f12792a.equals(jlVar.f12792a)) {
            return false;
        }
        if (this.f12793b == null) {
            if (jlVar.f12793b != null) {
                return false;
            }
        } else if (!this.f12793b.equals(jlVar.f12793b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jlVar.aO);
        }
        if (jlVar.aO == null || jlVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        jm jmVar = this.f12792a;
        hashCode = (jmVar == null ? 0 : jmVar.hashCode()) + (hashCode * 31);
        jp jpVar = this.f12793b;
        hashCode = ((jpVar == null ? 0 : jpVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12792a != null) {
            codedOutputByteBufferNano.b(1, this.f12792a);
        }
        if (this.f12793b != null) {
            codedOutputByteBufferNano.b(2, this.f12793b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12792a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12792a);
        }
        if (this.f12793b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12793b);
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
                    if (this.f12792a == null) {
                        this.f12792a = new jm();
                    }
                    aVar.a(this.f12792a);
                    continue;
                case 18:
                    if (this.f12793b == null) {
                        this.f12793b = new jp();
                    }
                    aVar.a(this.f12793b);
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
