package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class hk extends C0758b {
    public int f12570a;
    public String f12571b;

    public hk() {
        this.f12570a = 0;
        this.f12571b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj;
        if ((this.f12570a & 1) != (hkVar.f12570a & 1)) {
            return false;
        }
        if (!this.f12571b.equals(hkVar.f12571b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(hkVar.aO);
        }
        if (hkVar.aO == null || hkVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f12571b.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12570a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12571b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12570a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(1, this.f12571b);
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
                    this.f12571b = aVar.f();
                    this.f12570a |= 1;
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
