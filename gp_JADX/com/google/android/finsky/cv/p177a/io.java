package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class io extends C0758b {
    public int f12665a;
    public String f12666b;
    public String f12667c;

    public io() {
        this.f12665a = 0;
        this.f12666b = "";
        this.f12667c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof io)) {
            return false;
        }
        io ioVar = (io) obj;
        if ((this.f12665a & 1) != (ioVar.f12665a & 1)) {
            return false;
        }
        if (!this.f12666b.equals(ioVar.f12666b)) {
            return false;
        }
        if ((this.f12665a & 2) != (ioVar.f12665a & 2)) {
            return false;
        }
        if (!this.f12667c.equals(ioVar.f12667c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ioVar.aO);
        }
        if (ioVar.aO == null || ioVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12666b.hashCode()) * 31) + this.f12667c.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12665a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12666b);
        }
        if ((this.f12665a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12667c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12665a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12666b);
        }
        if ((this.f12665a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12667c);
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
                    this.f12666b = aVar.f();
                    this.f12665a |= 1;
                    continue;
                case 18:
                    this.f12667c = aVar.f();
                    this.f12665a |= 2;
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
