package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ju extends C0758b {
    public int f12818a;
    public String f12819b;

    public ju() {
        this.f12818a = 0;
        this.f12819b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        if ((this.f12818a & 1) != (juVar.f12818a & 1)) {
            return false;
        }
        if (!this.f12819b.equals(juVar.f12819b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(juVar.aO);
        }
        if (juVar.aO == null || juVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f12819b.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12818a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12819b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12818a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(1, this.f12819b);
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
                    this.f12819b = aVar.f();
                    this.f12818a |= 1;
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
