package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class kq extends C0758b {
    public int f12949a;
    public boolean f12950b;
    public boolean f12951c;
    public boolean f12952d;
    public String f12953e;
    public String f12954f;

    public kq() {
        this.f12949a = 0;
        this.f12950b = false;
        this.f12951c = false;
        this.f12952d = false;
        this.f12953e = "";
        this.f12954f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        if ((this.f12949a & 1) != (kqVar.f12949a & 1)) {
            return false;
        }
        if (this.f12950b != kqVar.f12950b) {
            return false;
        }
        if ((this.f12949a & 2) != (kqVar.f12949a & 2)) {
            return false;
        }
        if (this.f12951c != kqVar.f12951c) {
            return false;
        }
        if ((this.f12949a & 4) != (kqVar.f12949a & 4)) {
            return false;
        }
        if (this.f12952d != kqVar.f12952d) {
            return false;
        }
        if ((this.f12949a & 8) != (kqVar.f12949a & 8)) {
            return false;
        }
        if (!this.f12953e.equals(kqVar.f12953e)) {
            return false;
        }
        if ((this.f12949a & 16) != (kqVar.f12949a & 16)) {
            return false;
        }
        if (!this.f12954f.equals(kqVar.f12954f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(kqVar.aO);
        }
        if (kqVar.aO == null || kqVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int hashCode = ((this.f12950b ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
        if (this.f12951c) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (i + hashCode) * 31;
        if (!this.f12952d) {
            i2 = 1237;
        }
        i2 = (((((i + i2) * 31) + this.f12953e.hashCode()) * 31) + this.f12954f.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12949a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12950b);
        }
        if ((this.f12949a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12951c);
        }
        if ((this.f12949a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12952d);
        }
        if ((this.f12949a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12953e);
        }
        if ((this.f12949a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12954f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12949a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 1;
        }
        if ((this.f12949a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if ((this.f12949a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f12949a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12953e);
        }
        if ((this.f12949a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f12954f);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12950b = aVar.e();
                    this.f12949a |= 1;
                    continue;
                case 16:
                    this.f12951c = aVar.e();
                    this.f12949a |= 2;
                    continue;
                case 24:
                    this.f12952d = aVar.e();
                    this.f12949a |= 4;
                    continue;
                case 34:
                    this.f12953e = aVar.f();
                    this.f12949a |= 8;
                    continue;
                case 42:
                    this.f12954f = aVar.f();
                    this.f12949a |= 16;
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
