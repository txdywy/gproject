package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class be extends C0758b {
    public int f11874a;
    public String f11875b;
    public String f11876c;

    public be() {
        this.f11874a = 0;
        this.f11875b = "";
        this.f11876c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        if ((this.f11874a & 1) != (beVar.f11874a & 1)) {
            return false;
        }
        if (!this.f11875b.equals(beVar.f11875b)) {
            return false;
        }
        if ((this.f11874a & 2) != (beVar.f11874a & 2)) {
            return false;
        }
        if (!this.f11876c.equals(beVar.f11876c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(beVar.aO);
        }
        if (beVar.aO == null || beVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f11875b.hashCode()) * 31) + this.f11876c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11874a & 1) != 0) {
            codedOutputByteBufferNano.a(11, this.f11875b);
        }
        if ((this.f11874a & 2) != 0) {
            codedOutputByteBufferNano.a(12, this.f11876c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11874a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(11, this.f11875b);
        }
        if ((this.f11874a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(12, this.f11876c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 90:
                    this.f11875b = aVar.f();
                    this.f11874a |= 1;
                    continue;
                case 98:
                    this.f11876c = aVar.f();
                    this.f11874a |= 2;
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
