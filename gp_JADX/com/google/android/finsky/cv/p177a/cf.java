package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class cf extends C0758b {
    public int f12030a;
    public String f12031b;
    public String f12032c;

    public cf() {
        this.f12030a = 0;
        this.f12031b = "";
        this.f12032c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        if ((this.f12030a & 1) != (cfVar.f12030a & 1)) {
            return false;
        }
        if (!this.f12031b.equals(cfVar.f12031b)) {
            return false;
        }
        if ((this.f12030a & 2) != (cfVar.f12030a & 2)) {
            return false;
        }
        if (!this.f12032c.equals(cfVar.f12032c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cfVar.aO);
        }
        if (cfVar.aO == null || cfVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12031b.hashCode()) * 31) + this.f12032c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12030a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12031b);
        }
        if ((this.f12030a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12032c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12030a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12031b);
        }
        if ((this.f12030a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12032c);
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
                    this.f12031b = aVar.f();
                    this.f12030a |= 1;
                    continue;
                case 18:
                    this.f12032c = aVar.f();
                    this.f12030a |= 2;
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
