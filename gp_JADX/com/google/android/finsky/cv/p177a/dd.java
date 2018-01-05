package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class dd extends C0758b {
    public int f12138a;
    public String f12139b;

    public dd() {
        this.f12138a = 0;
        this.f12139b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        if ((this.f12138a & 1) != (ddVar.f12138a & 1)) {
            return false;
        }
        if (!this.f12139b.equals(ddVar.f12139b)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ddVar.aO);
        }
        if (ddVar.aO == null || ddVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.f12139b.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12138a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12139b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12138a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(1, this.f12139b);
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
                    this.f12139b = aVar.f();
                    this.f12138a |= 1;
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
