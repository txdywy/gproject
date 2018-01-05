package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class go extends C0758b {
    public int f12466a;
    public String f12467b;
    public String f12468c;
    public boolean f12469d;
    public String f12470e;

    public go() {
        this.f12466a = 0;
        this.f12467b = "";
        this.f12468c = "";
        this.f12469d = false;
        this.f12470e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        if ((this.f12466a & 1) != (goVar.f12466a & 1)) {
            return false;
        }
        if (!this.f12467b.equals(goVar.f12467b)) {
            return false;
        }
        if ((this.f12466a & 2) != (goVar.f12466a & 2)) {
            return false;
        }
        if (!this.f12468c.equals(goVar.f12468c)) {
            return false;
        }
        if ((this.f12466a & 4) != (goVar.f12466a & 4)) {
            return false;
        }
        if (this.f12469d != goVar.f12469d) {
            return false;
        }
        if ((this.f12466a & 8) != (goVar.f12466a & 8)) {
            return false;
        }
        if (!this.f12470e.equals(goVar.f12470e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(goVar.aO);
        }
        if (goVar.aO == null || goVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.f12469d ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f12467b.hashCode()) * 31) + this.f12468c.hashCode()) * 31)) * 31) + this.f12470e.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12466a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12467b);
        }
        if ((this.f12466a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12468c);
        }
        if ((this.f12466a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12469d);
        }
        if ((this.f12466a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12470e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12466a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12467b);
        }
        if ((this.f12466a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12468c);
        }
        if ((this.f12466a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f12466a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12470e);
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
                    this.f12467b = aVar.f();
                    this.f12466a |= 1;
                    continue;
                case 18:
                    this.f12468c = aVar.f();
                    this.f12466a |= 2;
                    continue;
                case 24:
                    this.f12469d = aVar.e();
                    this.f12466a |= 4;
                    continue;
                case 34:
                    this.f12470e = aVar.f();
                    this.f12466a |= 8;
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
