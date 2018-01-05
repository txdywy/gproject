package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ag extends C0758b {
    public int f11784a;
    public String f11785b;
    public String f11786c;
    public String f11787d;

    public ag() {
        this.f11784a = 0;
        this.f11785b = "";
        this.f11786c = "";
        this.f11787d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        if ((this.f11784a & 1) != (agVar.f11784a & 1)) {
            return false;
        }
        if (!this.f11785b.equals(agVar.f11785b)) {
            return false;
        }
        if ((this.f11784a & 2) != (agVar.f11784a & 2)) {
            return false;
        }
        if (!this.f11786c.equals(agVar.f11786c)) {
            return false;
        }
        if ((this.f11784a & 4) != (agVar.f11784a & 4)) {
            return false;
        }
        if (!this.f11787d.equals(agVar.f11787d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(agVar.aO);
        }
        if (agVar.aO == null || agVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f11785b.hashCode()) * 31) + this.f11786c.hashCode()) * 31) + this.f11787d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11784a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11785b);
        }
        if ((this.f11784a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11786c);
        }
        if ((this.f11784a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11787d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11784a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11785b);
        }
        if ((this.f11784a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11786c);
        }
        if ((this.f11784a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f11787d);
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
                    this.f11785b = aVar.f();
                    this.f11784a |= 1;
                    continue;
                case 18:
                    this.f11786c = aVar.f();
                    this.f11784a |= 2;
                    continue;
                case 26:
                    this.f11787d = aVar.f();
                    this.f11784a |= 4;
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
