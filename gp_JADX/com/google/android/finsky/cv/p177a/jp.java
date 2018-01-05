package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jp extends C0758b {
    public int f12802a;
    public String f12803b;
    public String f12804c;
    public String f12805d;
    public int f12806e;
    public String f12807f;

    public jp() {
        this.f12802a = 0;
        this.f12803b = "";
        this.f12804c = "";
        this.f12805d = "";
        this.f12806e = 200;
        this.f12807f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        if ((this.f12802a & 1) != (jpVar.f12802a & 1)) {
            return false;
        }
        if (!this.f12803b.equals(jpVar.f12803b)) {
            return false;
        }
        if ((this.f12802a & 2) != (jpVar.f12802a & 2)) {
            return false;
        }
        if (!this.f12804c.equals(jpVar.f12804c)) {
            return false;
        }
        if ((this.f12802a & 4) != (jpVar.f12802a & 4)) {
            return false;
        }
        if (!this.f12805d.equals(jpVar.f12805d)) {
            return false;
        }
        if ((this.f12802a & 8) != (jpVar.f12802a & 8)) {
            return false;
        }
        if (this.f12806e != jpVar.f12806e) {
            return false;
        }
        if ((this.f12802a & 16) != (jpVar.f12802a & 16)) {
            return false;
        }
        if (!this.f12807f.equals(jpVar.f12807f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jpVar.aO);
        }
        if (jpVar.aO == null || jpVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12803b.hashCode()) * 31) + this.f12804c.hashCode()) * 31) + this.f12805d.hashCode()) * 31) + this.f12806e) * 31) + this.f12807f.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12802a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12803b);
        }
        if ((this.f12802a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12804c);
        }
        if ((this.f12802a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12805d);
        }
        if ((this.f12802a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12806e);
        }
        if ((this.f12802a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f12807f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12802a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12803b);
        }
        if ((this.f12802a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12804c);
        }
        if ((this.f12802a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12805d);
        }
        if ((this.f12802a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f12806e);
        }
        if ((this.f12802a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f12807f);
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
                    this.f12803b = aVar.f();
                    this.f12802a |= 1;
                    continue;
                case 18:
                    this.f12804c = aVar.f();
                    this.f12802a |= 2;
                    continue;
                case 26:
                    this.f12805d = aVar.f();
                    this.f12802a |= 4;
                    continue;
                case 32:
                    this.f12806e = aVar.i();
                    this.f12802a |= 8;
                    continue;
                case 50:
                    this.f12807f = aVar.f();
                    this.f12802a |= 16;
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
