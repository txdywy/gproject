package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class he extends C0758b {
    public fd f12544a;
    public em f12545b;

    public he() {
        this.f12544a = null;
        this.f12545b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        if (this.f12544a == null) {
            if (heVar.f12544a != null) {
                return false;
            }
        } else if (!this.f12544a.equals(heVar.f12544a)) {
            return false;
        }
        if (this.f12545b == null) {
            if (heVar.f12545b != null) {
                return false;
            }
        } else if (!this.f12545b.equals(heVar.f12545b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(heVar.aO);
        }
        if (heVar.aO == null || heVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        fd fdVar = this.f12544a;
        hashCode = (fdVar == null ? 0 : fdVar.hashCode()) + (hashCode * 31);
        em emVar = this.f12545b;
        hashCode = ((emVar == null ? 0 : emVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12544a != null) {
            codedOutputByteBufferNano.b(1, this.f12544a);
        }
        if (this.f12545b != null) {
            codedOutputByteBufferNano.b(2, this.f12545b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12544a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12544a);
        }
        if (this.f12545b != null) {
            return b + CodedOutputByteBufferNano.d(2, this.f12545b);
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
                    if (this.f12544a == null) {
                        this.f12544a = new fd();
                    }
                    aVar.a(this.f12544a);
                    continue;
                case 18:
                    if (this.f12545b == null) {
                        this.f12545b = new em();
                    }
                    aVar.a(this.f12545b);
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
