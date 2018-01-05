package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class kr extends C0758b {
    public int f12955a;
    public String f12956b;
    public String f12957c;

    public kr() {
        this.f12955a = 0;
        this.f12956b = "";
        this.f12957c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kr)) {
            return false;
        }
        kr krVar = (kr) obj;
        if ((this.f12955a & 1) != (krVar.f12955a & 1)) {
            return false;
        }
        if (!this.f12956b.equals(krVar.f12956b)) {
            return false;
        }
        if ((this.f12955a & 2) != (krVar.f12955a & 2)) {
            return false;
        }
        if (!this.f12957c.equals(krVar.f12957c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(krVar.aO);
        }
        if (krVar.aO == null || krVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12956b.hashCode()) * 31) + this.f12957c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12955a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12956b);
        }
        if ((this.f12955a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12957c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12955a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12956b);
        }
        if ((this.f12955a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12957c);
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
                    this.f12956b = aVar.f();
                    this.f12955a |= 1;
                    continue;
                case 18:
                    this.f12957c = aVar.f();
                    this.f12955a |= 2;
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
