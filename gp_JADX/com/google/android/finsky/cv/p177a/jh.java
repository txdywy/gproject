package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jh extends C0758b {
    public int f12780a;
    public String f12781b;
    public String f12782c;
    public boolean f12783d;

    public final jh m12863a(boolean z) {
        this.f12780a |= 4;
        this.f12783d = z;
        return this;
    }

    public jh() {
        this.f12780a = 0;
        this.f12781b = "";
        this.f12782c = "";
        this.f12783d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        if ((this.f12780a & 1) != (jhVar.f12780a & 1)) {
            return false;
        }
        if (!this.f12781b.equals(jhVar.f12781b)) {
            return false;
        }
        if ((this.f12780a & 2) != (jhVar.f12780a & 2)) {
            return false;
        }
        if (!this.f12782c.equals(jhVar.f12782c)) {
            return false;
        }
        if ((this.f12780a & 4) != (jhVar.f12780a & 4)) {
            return false;
        }
        if (this.f12783d != jhVar.f12783d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jhVar.aO);
        }
        if (jhVar.aO == null || jhVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f12783d ? 1231 : 1237) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f12781b.hashCode()) * 31) + this.f12782c.hashCode()) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12780a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12781b);
        }
        if ((this.f12780a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12782c);
        }
        if ((this.f12780a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12783d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12780a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12781b);
        }
        if ((this.f12780a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12782c);
        }
        if ((this.f12780a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.d(3) + 1);
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
                    this.f12781b = aVar.f();
                    this.f12780a |= 1;
                    continue;
                case 18:
                    this.f12782c = aVar.f();
                    this.f12780a |= 2;
                    continue;
                case 24:
                    this.f12783d = aVar.e();
                    this.f12780a |= 4;
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
